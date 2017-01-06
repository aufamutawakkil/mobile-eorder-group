package com.antargroup.tubanantar.pager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
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
        ActionBar getActionBar = ((ActionBarActivity) getActivity()).getSupportActionBar();
        getActionBar.setTitle("Order Ojek");

        btnOrder = (Button) v.findViewById(R.id.btn_order);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        return v;
    }
}
