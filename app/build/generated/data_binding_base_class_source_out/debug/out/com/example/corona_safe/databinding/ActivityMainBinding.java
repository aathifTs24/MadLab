// Generated by view binder compiler. Do not edit!
package com.example.corona_safe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.corona_safe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnMain;

  @NonNull
  public final ConstraintLayout coordinatorLayout2;

  @NonNull
  public final ImageView imageView3;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnMain,
      @NonNull ConstraintLayout coordinatorLayout2, @NonNull ImageView imageView3) {
    this.rootView = rootView;
    this.btnMain = btnMain;
    this.coordinatorLayout2 = coordinatorLayout2;
    this.imageView3 = imageView3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnMain;
      Button btnMain = rootView.findViewById(id);
      if (btnMain == null) {
        break missingId;
      }

      ConstraintLayout coordinatorLayout2 = (ConstraintLayout) rootView;

      id = R.id.imageView3;
      ImageView imageView3 = rootView.findViewById(id);
      if (imageView3 == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, btnMain, coordinatorLayout2,
          imageView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
