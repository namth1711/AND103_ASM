package com.example.and103_asm.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.and103_asm.R;
import com.example.and103_asm.adapter.OrdersAdapter;
import com.example.and103_asm.databinding.ActivityOrdersBinding;
import com.example.and103_asm.model.GHNCancelRequest;
import com.example.and103_asm.model.GHNCancelResponse;
import com.example.and103_asm.model.Order;
import com.example.and103_asm.model.Response;
import com.example.and103_asm.model.ResponseGHN;
import com.example.and103_asm.services.GHNRequest;
import com.example.and103_asm.services.HttpRequest;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;

public class OrdersActivity extends AppCompatActivity implements OrdersAdapter.OrderClick {
    ActivityOrdersBinding binding;
    ArrayList<Order> orderArrayList = new ArrayList<>();
    OrdersAdapter adapter ;
    private HttpRequest httpRequest;
    private GHNRequest ghnRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityOrdersBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        httpRequest = new HttpRequest();
        ghnRequest = new GHNRequest();
        httpRequest.callAPI().getListOrder(
                getSharedPreferences("INFO",MODE_PRIVATE).getString("id","")
        ).enqueue(responseListOrder);



    userListener();

    }
    private void userListener () {
        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    Callback<Response<ArrayList<Order>>> responseListOrder = new Callback<Response<ArrayList<Order>>>() {
        @Override
        public void onResponse(Call<Response<ArrayList<Order>>> call, retrofit2.Response<Response<ArrayList<Order>>> response) {
            if (response.isSuccessful() && response.body() != null) {
                if (response.body().getStatus() == 200) {
                    orderArrayList = response.body().getData();
                    adapter = new OrdersAdapter(OrdersActivity.this, orderArrayList, OrdersActivity.this);
                    binding.rcvOrder.setAdapter(adapter);
                }
            } else {
                Toast.makeText(OrdersActivity.this, "lỗi", Toast.LENGTH_SHORT).show();
            }
        }

        @Override
        public void onFailure(Call<Response<ArrayList<Order>>> call, Throwable t) {
            t.getMessage();
        }
    };

    Callback<ResponseGHN<ArrayList<GHNCancelResponse>>> responseCancelOrder = new Callback<ResponseGHN<ArrayList<GHNCancelResponse>>>() {
        @Override
        public void onResponse(Call<ResponseGHN<ArrayList<GHNCancelResponse>>> call, retrofit2.Response<ResponseGHN<ArrayList<GHNCancelResponse>>> response) {
            Log.d("zzzzzzz", "responseCancelOrder: " + response);
            if (response.isSuccessful()){
                if (response.body().getCode() == 200) {
                    httpRequest.callAPI().deleteOrder(response.body().getData().get(0).getOrder_code())
                            .enqueue(responseDeleteOrderDatabase);
                }
            }
        }

        @Override
        public void onFailure(Call<ResponseGHN<ArrayList<GHNCancelResponse>>> call, Throwable t) {
            Log.d("zzzzz", "onFailure: " +t.getMessage());
        }
    };

    Callback<Response<Order>> responseDeleteOrderDatabase = new Callback<Response<Order>>() {
        @Override
        public void onResponse(Call<Response<Order>> call, retrofit2.Response<Response<Order>> response) {
            int x = 2;
            if (response.body().getStatus() == 200) {
                httpRequest.callAPI().getListOrder(
                        getSharedPreferences("INFO",MODE_PRIVATE).getString("id","")
                ).enqueue(responseListOrder);
            }
        }

        @Override
        public void onFailure(Call<Response<Order>> call, Throwable t) {
            Log.d("zzzzz", "onFailure: "+ t.getMessage());
        }
    };

    @Override
    public void deleteOrder(String order_code) {
        ArrayList<String> listCancel = new ArrayList<>();
        listCancel.add(order_code);
        GHNCancelRequest cancelRequest = new GHNCancelRequest();
        cancelRequest.setOrder_code(listCancel);
        Log.d("zzzzz", "deleteOrder: " + cancelRequest.getOrder_code());
        ghnRequest.getApiService().cancelOrder(cancelRequest).enqueue(responseCancelOrder);
    }


}