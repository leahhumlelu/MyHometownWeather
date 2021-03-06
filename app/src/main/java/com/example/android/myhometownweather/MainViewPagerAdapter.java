package com.example.android.myhometownweather;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

public class MainViewPagerAdapter extends FragmentPagerAdapter {
    //todo:depend on how many cities are added into viewpager
    private int totalPages;

    public MainViewPagerAdapter(FragmentManager fm,int totalLocationNum) {
        super(fm);
        totalPages=totalLocationNum;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new MainFragment();
        }else{
            //todo
            return new MainFragment();
        }
    }

    @Override
    public int getCount() {
        return totalPages;
    }
}
