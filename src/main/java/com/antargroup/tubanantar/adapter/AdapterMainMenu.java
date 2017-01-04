package com.antargroup.tubanantar.adapter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.antargroup.tubanantar.R;

import java.util.ArrayList;

public class AdapterMainMenu extends ArrayAdapter {

    private Context context;
    private ArrayList<Integer> icon;
    private ArrayList<String> title;

    public AdapterMainMenu(Context context,
                           ArrayList<Integer> icon,
                           ArrayList<String> title
    ) {
        super(context, R.layout.activity_adapter_mainmenu,title);
        this.context = context;
        this.icon = icon;
        this.title = title;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.activity_adapter_mainmenu, parent, false);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.title);
        txtTitle.setText(title.get(position));

        ImageView imgAttachment = (ImageView) rowView.findViewById(R.id.icon);
        imgAttachment.setImageResource( icon.get(position) );


        return rowView;
    }
}
