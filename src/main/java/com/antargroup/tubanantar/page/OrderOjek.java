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

public class OrderOjek extends Fragment {

    Button btnOrder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_order_ojek, container, false);
        FragmentHelper frg = new FragmentHelper();
        frg.getActionBar().setTitle("Order Ojek");

        btnOrder = (Button) v.findViewById(R.id.btn_order);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        return v;
    }
}
