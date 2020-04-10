package com.bawie.duqilin20200408.view.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.bawie.duqilin20200408.R;
import com.bawie.duqilin20200408.base.BaseActivity;
import com.bawie.duqilin20200408.base.BasePresenter;
import com.bawie.duqilin20200408.view.fragment.DingDanFragment;
import com.bawie.duqilin20200408.view.fragment.FaXianFragment;
import com.bawie.duqilin20200408.view.fragment.GwcFragment;
import com.bawie.duqilin20200408.view.fragment.HomeFragment;
import com.bawie.duqilin20200408.view.fragment.MyFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.vp)
    ViewPager vp;
    @BindView(R.id.rb01)
    RadioButton rb01;
    @BindView(R.id.rb02)
    RadioButton rb02;
    @BindView(R.id.rb03)
    RadioButton rb03;
    @BindView(R.id.rb04)
    RadioButton rb04;
    @BindView(R.id.rb05)
    RadioButton rb05;
    @BindView(R.id.rg)
    RadioGroup rg;
    private ArrayList<Fragment> list;

    @Override
    protected void initData() {
        list = new ArrayList<>();
        HomeFragment homeFragment = new HomeFragment();
        FaXianFragment faXianFragment = new FaXianFragment();
        GwcFragment gwcFragment = new GwcFragment();
        DingDanFragment dingDanFragment = new DingDanFragment();
        MyFragment myFragment = new MyFragment();
        list.add(homeFragment);
        list.add(faXianFragment);
        list.add(gwcFragment);
        list.add(dingDanFragment);
        list.add(myFragment);

        vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });

        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                rg.check(rg.getChildAt(position).getId());
            }

            @Override
            public void onPageScrollStateChanged(int state) {

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

    @OnClick({R.id.rb01, R.id.rb02, R.id.rb03, R.id.rb04, R.id.rb05})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rb01:
                vp.setCurrentItem(0);
                break;
            case R.id.rb02:
                vp.setCurrentItem(1);
                break;
            case R.id.rb03:
                vp.setCurrentItem(2);
                break;
            case R.id.rb04:
                vp.setCurrentItem(3);
                break;
            case R.id.rb05:
                vp.setCurrentItem(4);
                break;
        }
    }
}
