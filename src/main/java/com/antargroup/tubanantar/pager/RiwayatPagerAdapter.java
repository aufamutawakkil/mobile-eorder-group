package com.antargroup.tubanantar.pager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class RiwayatPagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public RiwayatPagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Mainmenu tabMainMenu = new Mainmenu();
                return tabMainMenu;
            case 1:
                Mainmenu tabMainMenu1 = new Mainmenu();
                return tabMainMenu1;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}