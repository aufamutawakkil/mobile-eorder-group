package com.antargroup.tubanantar.pager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.antargroup.tubanantar.helper.FragmentHelper;

public class MenuResto extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_menu_resto, container, false);
        FragmentHelper frg = new FragmentHelper();
        frg.getActionBar().setTitle("Order Ojek");



        return v;
    }
}
