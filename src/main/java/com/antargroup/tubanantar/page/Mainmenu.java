package com.antargroup.tubanantar.page;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.antargroup.tubanantar.R;
import com.antargroup.tubanantar.adapter.AdapterMainMenu;
import com.antargroup.tubanantar.helper.FragmentHelper;

import java.util.ArrayList;

public class Mainmenu extends Fragment {

    ArrayList<Integer> icon;
    ArrayList<String> title;
    ListView lv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_mainmenu, container, false);

        icon = new ArrayList<>();
        icon.add(R.drawable.layanan_gojek);
        icon.add(R.drawable.layanan_food);

        title = new ArrayList<>();
        title.add("Gojek");
        title.add("Food");

        ArrayAdapter adapter = new AdapterMainMenu(getContext(),icon,title);

        lv = (ListView) v.findViewById(android.R.id.list);
        lv.setDivider(null);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position){
                    case 0 :
                        Bundle b = new Bundle();
                        FragmentHelper frg = new FragmentHelper();
                        frg.toPage(b,new OrderOjek(),"pager");
                        break;
                    case 1 :
                        break;

                }
            }
        });

        return v;

    }
}