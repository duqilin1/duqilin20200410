package com.bawie.zy0408.view.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.bawie.zy0408.R;
import com.bawie.zy0408.base.BaseActivity;
import com.bawie.zy0408.base.BasePresenter;
import com.bawie.zy0408.view.fragment.OrderFromFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.vp)
    ViewPager viewPager;
    private ArrayList<Fragment> list;

    @Override
    protected void initData() {

        list = new ArrayList<>();
        OrderFromFragment instance0 = OrderFromFragment.getInstance(0);
        OrderFromFragment instance1 = OrderFromFragment.getInstance(1);
        OrderFromFragment instance2 = OrderFromFragment.getInstance(2);
        OrderFromFragment instance3 = OrderFromFragment.getInstance(3);
        OrderFromFragment instance9 = OrderFromFragment.getInstance(9);
        list.add(instance0);
        list.add(instance1);
        list.add(instance2);
        list.add(instance3);
        list.add(instance9);
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });
    }

    @Override
    protected void initView() {

    }

    @Override
    protected BasePresenter providePresenter() {
        return null;
    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }
}
