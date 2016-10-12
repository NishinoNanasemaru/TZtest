package com.tz.tztest;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.tz.tztest.bean.TabAdapter;
import com.tz.tztest.fragment.TabLayoutFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 西野七濑 on 2016/10/13.
 */

public class TestActivity extends AppCompatActivity {

    ViewPager mViewPager;
    TabAdapter mTabAdapter;
    TabLayout mTabLayout;
    public static final String[] tabTitle = new String[]{"综艺", "体育",
            "新闻", "热点", "头条", "军事", "历史", "科技", "人文", "地理"};


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        initView();

    }

    private void initView() {
        mTabLayout = (TabLayout) findViewById(R.id.tl_test);
        mViewPager = (ViewPager) findViewById(R.id.vp_test);
        List<Fragment> fragments = new ArrayList<>();
        for (int i = 0; i < tabTitle.length; i++) {
            fragments.add(TabLayoutFragment.newInstance(i + 1));
        }
        mTabAdapter = new TabAdapter(getSupportFragmentManager(), fragments);
        //给ViewPager设置适配器
        mViewPager.setAdapter(mTabAdapter);
        //将TabLayout和ViewPager关联起来。
        mTabLayout.setupWithViewPager(mViewPager);
        //设置可以滑动
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
    }
}
