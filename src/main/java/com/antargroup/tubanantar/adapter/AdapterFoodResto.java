package com.antargroup.tubanantar.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.antargroup.tubanantar.R;

import java.util.ArrayList;

/**
 * Created by aufa on 1/4/2017.
 */

public class AdapterFoodResto extends ArrayAdapter {

    private Context context;
    private ArrayList<Integer> icon;
    private ArrayList<String> title;

    public AdapterFoodResto(Context context,
                            ArrayList<Integer> icon,
                            ArrayList<String> title
    ) {
        super(context, R.layout.activity_adapter_mainmenu, title);
        this.context = context;
        this.icon = icon;
        this.title = title;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = inflater.inflate(R.layout.adapter_restaurant, parent, false);

        return v;
    }
}