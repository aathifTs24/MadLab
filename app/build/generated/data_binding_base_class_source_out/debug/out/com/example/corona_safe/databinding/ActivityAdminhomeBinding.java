// Generated by view binder compiler. Do not edit!
package com.example.corona_safe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import com.example.corona_safe.R;
import com.google.android.material.navigation.NavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAdminhomeBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final TextView adminText;

  @NonNull
  public final Button btnAddnew;

  @NonNull
  public final ImageButton btnSearchAdmin;

  @NonNull
  public final ConstraintLayout consView1;

  @NonNull
  public final DrawerLayout drawerLayout1;

  @NonNull
  public final EditText editEmail;

  @NonNull
  public final EditText editNIC;

  @NonNull
  public final EditText editUser;

  @NonNull
  public final EditText editVacST;

  @NonNull
  public final EditText editVacc;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final NavigationView navView1;

  @NonNull
  public final Toolbar toolbar11;

  @NonNull
  public final TextView txtEmail;

  @NonNull
  public final TextView txtNIC;

  @NonNull
  public final TextView txtUser;

  @NonNull
  public final TextView txtVacST;

  @NonNull
  public final TextView txtVacc;

  private ActivityAdminhomeBinding(@NonNull DrawerLayout rootView, @NonNull TextView adminText,
      @NonNull Button btnAddnew, @NonNull ImageButton btnSearchAdmin,
      @NonNull ConstraintLayout consView1, @NonNull DrawerLayout drawerLayout1,
      @NonNull EditText editEmail, @NonNull EditText editNIC, @NonNull EditText editUser,
      @NonNull EditText editVacST, @NonNull EditText editVacc, @NonNull ImageView imageView2,
      @NonNull NavigationView navView1, @NonNull Toolbar toolbar11, @NonNull TextView txtEmail,
      @NonNull TextView txtNIC, @NonNull TextView txtUser, @NonNull TextView txtVacST,
      @NonNull TextView txtVacc) {
    this.rootView = rootView;
    this.adminText = adminText;
    this.btnAddnew = btnAddnew;
    this.btnSearchAdmin = btnSearchAdmin;
    this.consView1 = consView1;
    this.drawerLayout1 = drawerLayout1;
    this.editEmail = editEmail;
    this.editNIC = editNIC;
    this.editUser = editUser;
    this.editVacST = editVacST;
    this.editVacc = editVacc;
    this.imageView2 = imageView2;
    this.navView1 = navView1;
    this.toolbar11 = toolbar11;
    this.txtEmail = txtEmail;
    this.txtNIC = txtNIC;
    this.txtUser = txtUser;
    this.txtVacST = txtVacST;
    this.txtVacc = txtVacc;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAdminhomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAdminhomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_adminhome, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAdminhomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.adminText;
      TextView adminText = rootView.findViewById(id);
      if (adminText == null) {
        break missingId;
      }

      id = R.id.btnAddnew;
      Button btnAddnew = rootView.findViewById(id);
      if (btnAddnew == null) {
        break missingId;
      }

      id = R.id.btnSearchAdmin;
      ImageButton btnSearchAdmin = rootView.findViewById(id);
      if (btnSearchAdmin == null) {
        break missingId;
      }

      id = R.id.cons_view1;
      ConstraintLayout consView1 = rootView.findViewById(id);
      if (consView1 == null) {
        break missingId;
      }

      DrawerLayout drawerLayout1 = (DrawerLayout) rootView;

      id = R.id.editEmail;
      EditText editEmail = rootView.findViewById(id);
      if (editEmail == null) {
        break missingId;
      }

      id = R.id.editNIC;
      EditText editNIC = rootView.findViewById(id);
      if (editNIC == null) {
        break missingId;
      }

      id = R.id.editUser;
      EditText editUser = rootView.findViewById(id);
      if (editUser == null) {
        break missingId;
      }

      id = R.id.editVacST;
      EditText editVacST = rootView.findViewById(id);
      if (editVacST == null) {
        break missingId;
      }

      id = R.id.editVacc;
      EditText editVacc = rootView.findViewById(id);
      if (editVacc == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = rootView.findViewById(id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.nav_view1;
      NavigationView navView1 = rootView.findViewById(id);
      if (navView1 == null) {
        break missingId;
      }

      id = R.id.toolbar11;
      Toolbar toolbar11 = rootView.findViewById(id);
      if (toolbar11 == null) {
        break missingId;
      }

      id = R.id.txtEmail;
      TextView txtEmail = rootView.findViewById(id);
      if (txtEmail == null) {
        break missingId;
      }

      id = R.id.txtNIC;
      TextView txtNIC = rootView.findViewById(id);
      if (txtNIC == null) {
        break missingId;
      }

      id = R.id.txtUser;
      TextView txtUser = rootView.findViewById(id);
      if (txtUser == null) {
        break missingId;
      }

      id = R.id.txtVacST;
      TextView txtVacST = rootView.findViewById(id);
      if (txtVacST == null) {
        break missingId;
      }

      id = R.id.txtVacc;
      TextView txtVacc = rootView.findViewById(id);
      if (txtVacc == null) {
        break missingId;
      }

      return new ActivityAdminhomeBinding((DrawerLayout) rootView, adminText, btnAddnew,
          btnSearchAdmin, consView1, drawerLayout1, editEmail, editNIC, editUser, editVacST,
          editVacc, imageView2, navView1, toolbar11, txtEmail, txtNIC, txtUser, txtVacST, txtVacc);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}