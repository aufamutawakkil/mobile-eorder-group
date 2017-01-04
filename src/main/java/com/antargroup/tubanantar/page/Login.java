package com.antargroup.tubanantar.page;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.antargroup.tubanantar.R;
import com.antargroup.tubanantar.helper.FragmentHelper;

public class Login extends Fragment {

    Button btnLogin;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_login, container, false);
        FragmentHelper frg = new FragmentHelper();
        frg.getActionBar().setTitle("Login");

        btnLogin = (Button) v.findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        return v;
    }
}
