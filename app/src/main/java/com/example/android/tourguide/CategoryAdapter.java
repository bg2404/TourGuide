package com.example.android.tourguide;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private String[] mTabTitles = new String[]{"History", "Food", "Hotels", "Shopping"};

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTabTitles[position];
    }

    @Override
    public Fragment getItem(int i) {
        if(i == 0) {
            return new HistoryFragment();
        } else if(i == 1) {
            return new FoodFragment();
        } else if(i == 2) {
            return new HotelsFragment();
        } else {
            return new ShoppingFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
