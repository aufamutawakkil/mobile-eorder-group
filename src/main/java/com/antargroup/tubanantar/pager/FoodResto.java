package com.antargroup.tubanantar.pager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FoodResto extends Fragment {
    private Context context;
    private ArrayList<Integer> icon;
    private ArrayList<String> title;

    public FoodResto(Context context,
                             ArrayList<Integer> icon,
                             ArrayList<String> title
    ) {
        super(context, R.layout.fragment_food_resto, title);
        this.context = context;
        this.icon = icon;
        this.title = title;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = inflater.inflate(R.layout.fragment_food_resto, parent, false);

        return v;
    }
}
