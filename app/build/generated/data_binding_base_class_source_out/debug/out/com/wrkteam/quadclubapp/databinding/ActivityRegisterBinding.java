// Generated by view binder compiler. Do not edit!
package com.wrkteam.quadclubapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.wrkteam.quadclubapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonRegister;

  @NonNull
  public final EditText registerEmail;

  @NonNull
  public final EditText registerPassword;

  @NonNull
  public final EditText registerPasswordRepeat;

  private ActivityRegisterBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button buttonRegister, @NonNull EditText registerEmail,
      @NonNull EditText registerPassword, @NonNull EditText registerPasswordRepeat) {
    this.rootView = rootView;
    this.buttonRegister = buttonRegister;
    this.registerEmail = registerEmail;
    this.registerPassword = registerPassword;
    this.registerPasswordRepeat = registerPasswordRepeat;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_register;
      Button buttonRegister = rootView.findViewById(id);
      if (buttonRegister == null) {
        break missingId;
      }

      id = R.id.register_email;
      EditText registerEmail = rootView.findViewById(id);
      if (registerEmail == null) {
        break missingId;
      }

      id = R.id.register_password;
      EditText registerPassword = rootView.findViewById(id);
      if (registerPassword == null) {
        break missingId;
      }

      id = R.id.register_password_repeat;
      EditText registerPasswordRepeat = rootView.findViewById(id);
      if (registerPasswordRepeat == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((ConstraintLayout) rootView, buttonRegister, registerEmail,
          registerPassword, registerPasswordRepeat);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}