package com.tz.tztest.bean;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.tz.tztest.TestActivity;

import java.util.List;

/**
 * Created by 西野七濑 on 2016/10/13.
 */

public class TabAdapter extends FragmentPagerAdapter {

    private List<Fragment> mFragments;

    public TabAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.mFragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
    //设置tablayout标题
    @Override
    public CharSequence getPageTitle(int position) {
        return TestActivity.tabTitle[position];
    }

}
