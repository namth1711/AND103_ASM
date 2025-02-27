// Generated by view binder compiler. Do not edit!
package com.example.and103_asm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.and103_asm.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLocationBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton btnBack;

  @NonNull
  public final Button btnOrder;

  @NonNull
  public final TextInputEditText edLocation;

  @NonNull
  public final TextInputEditText edName;

  @NonNull
  public final TextInputEditText edPhone;

  @NonNull
  public final Spinner spDistrict;

  @NonNull
  public final Spinner spProvince;

  @NonNull
  public final Spinner spWard;

  @NonNull
  public final RelativeLayout toolbar;

  private ActivityLocationBinding(@NonNull LinearLayout rootView, @NonNull ImageButton btnBack,
      @NonNull Button btnOrder, @NonNull TextInputEditText edLocation,
      @NonNull TextInputEditText edName, @NonNull TextInputEditText edPhone,
      @NonNull Spinner spDistrict, @NonNull Spinner spProvince, @NonNull Spinner spWard,
      @NonNull RelativeLayout toolbar) {
    this.rootView = rootView;
    this.btnBack = btnBack;
    this.btnOrder = btnOrder;
    this.edLocation = edLocation;
    this.edName = edName;
    this.edPhone = edPhone;
    this.spDistrict = spDistrict;
    this.spProvince = spProvince;
    this.spWard = spWard;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLocationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLocationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_location, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLocationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_back;
      ImageButton btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btn_order;
      Button btnOrder = ViewBindings.findChildViewById(rootView, id);
      if (btnOrder == null) {
        break missingId;
      }

      id = R.id.ed_location;
      TextInputEditText edLocation = ViewBindings.findChildViewById(rootView, id);
      if (edLocation == null) {
        break missingId;
      }

      id = R.id.ed_name;
      TextInputEditText edName = ViewBindings.findChildViewById(rootView, id);
      if (edName == null) {
        break missingId;
      }

      id = R.id.ed_phone;
      TextInputEditText edPhone = ViewBindings.findChildViewById(rootView, id);
      if (edPhone == null) {
        break missingId;
      }

      id = R.id.sp_district;
      Spinner spDistrict = ViewBindings.findChildViewById(rootView, id);
      if (spDistrict == null) {
        break missingId;
      }

      id = R.id.sp_province;
      Spinner spProvince = ViewBindings.findChildViewById(rootView, id);
      if (spProvince == null) {
        break missingId;
      }

      id = R.id.sp_ward;
      Spinner spWard = ViewBindings.findChildViewById(rootView, id);
      if (spWard == null) {
        break missingId;
      }

      id = R.id.toolbar;
      RelativeLayout toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityLocationBinding((LinearLayout) rootView, btnBack, btnOrder, edLocation,
          edName, edPhone, spDistrict, spProvince, spWard, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
