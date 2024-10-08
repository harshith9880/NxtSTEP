// Generated by view binder compiler. Do not edit!
package com.example.specialisedfitness_1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.specialisedfitness_1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHeartDiseaseBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonStepTracker;

  @NonNull
  public final ImageView imageView12;

  @NonNull
  public final ConstraintLayout linearLayout;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  private ActivityHeartDiseaseBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button buttonStepTracker, @NonNull ImageView imageView12,
      @NonNull ConstraintLayout linearLayout, @NonNull TextView textView5,
      @NonNull TextView textView6) {
    this.rootView = rootView;
    this.buttonStepTracker = buttonStepTracker;
    this.imageView12 = imageView12;
    this.linearLayout = linearLayout;
    this.textView5 = textView5;
    this.textView6 = textView6;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHeartDiseaseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHeartDiseaseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_heart_disease, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHeartDiseaseBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonStepTracker;
      Button buttonStepTracker = ViewBindings.findChildViewById(rootView, id);
      if (buttonStepTracker == null) {
        break missingId;
      }

      id = R.id.imageView12;
      ImageView imageView12 = ViewBindings.findChildViewById(rootView, id);
      if (imageView12 == null) {
        break missingId;
      }

      ConstraintLayout linearLayout = (ConstraintLayout) rootView;

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      return new ActivityHeartDiseaseBinding((ConstraintLayout) rootView, buttonStepTracker,
          imageView12, linearLayout, textView5, textView6);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
