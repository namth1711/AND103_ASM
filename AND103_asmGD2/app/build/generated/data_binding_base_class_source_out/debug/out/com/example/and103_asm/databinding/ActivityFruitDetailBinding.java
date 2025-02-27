// Generated by view binder compiler. Do not edit!
package com.example.and103_asm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.and103_asm.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFruitDetailBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView btnBack;

  @NonNull
  public final LinearLayout main;

  @NonNull
  public final RecyclerView rcvImg;

  @NonNull
  public final RelativeLayout toolbar;

  @NonNull
  public final TextView tvDescription;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvPrice;

  @NonNull
  public final TextView tvQuantity;

  @NonNull
  public final TextView tvStatus;

  private ActivityFruitDetailBinding(@NonNull LinearLayout rootView, @NonNull ImageView btnBack,
      @NonNull LinearLayout main, @NonNull RecyclerView rcvImg, @NonNull RelativeLayout toolbar,
      @NonNull TextView tvDescription, @NonNull TextView tvName, @NonNull TextView tvPrice,
      @NonNull TextView tvQuantity, @NonNull TextView tvStatus) {
    this.rootView = rootView;
    this.btnBack = btnBack;
    this.main = main;
    this.rcvImg = rcvImg;
    this.toolbar = toolbar;
    this.tvDescription = tvDescription;
    this.tvName = tvName;
    this.tvPrice = tvPrice;
    this.tvQuantity = tvQuantity;
    this.tvStatus = tvStatus;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFruitDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFruitDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_fruit_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFruitDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_back;
      ImageView btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      LinearLayout main = (LinearLayout) rootView;

      id = R.id.rcv_img;
      RecyclerView rcvImg = ViewBindings.findChildViewById(rootView, id);
      if (rcvImg == null) {
        break missingId;
      }

      id = R.id.toolbar;
      RelativeLayout toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.tv_description;
      TextView tvDescription = ViewBindings.findChildViewById(rootView, id);
      if (tvDescription == null) {
        break missingId;
      }

      id = R.id.tv_name;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      id = R.id.tv_price;
      TextView tvPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvPrice == null) {
        break missingId;
      }

      id = R.id.tv_quantity;
      TextView tvQuantity = ViewBindings.findChildViewById(rootView, id);
      if (tvQuantity == null) {
        break missingId;
      }

      id = R.id.tv_status;
      TextView tvStatus = ViewBindings.findChildViewById(rootView, id);
      if (tvStatus == null) {
        break missingId;
      }

      return new ActivityFruitDetailBinding((LinearLayout) rootView, btnBack, main, rcvImg, toolbar,
          tvDescription, tvName, tvPrice, tvQuantity, tvStatus);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
