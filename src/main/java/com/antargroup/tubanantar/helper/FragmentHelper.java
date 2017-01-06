package com.antargroup.tubanantar.helper;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

import com.antargroup.tubanantar.R;

/**
 * Created by aufa on 1/1/2017.
 */

public class FragmentHelper extends Fragment {
    int pager;
    public void toPage(Bundle b, Fragment fragmentName,String pagerName) {
        if( pagerName.equals("pager") ){
            pager = R.id.pager;
        }

        fragmentName.setArguments(b);
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(pager, fragmentName,"FRAGMENT").
                addToBackStack("FRAGMENT").commit();

    }

    public ActionBar getActionBar(ActionBarActivity actionBar) {
        //return ((ActionBarActivity) getActivity()).getSupportActionBar();
        return ( (actionBar) getActivity()).getSupportActionBar();
    }
}
