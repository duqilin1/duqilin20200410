package com.bawie.duqilin20200409.view.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.bawie.duqilin20200409.R;
import com.bawie.duqilin20200409.base.BaseActivity;
import com.bawie.duqilin20200409.base.BasePresenter;
import com.bawie.duqilin20200409.view.fragment.Fragment01;
import com.bawie.duqilin20200409.view.fragment.Fragment02;
import com.bawie.duqilin20200409.view.fragment.Fragment03;
import com.bawie.duqilin20200409.view.fragment.Fragment04;
import com.bawie.duqilin20200409.view.fragment.Fragment05;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

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
    @BindView(R.id.vp)
    ViewPager vp;
    private ArrayList<Fragment> list;

    @Override
    protected void initData() {
        list = new ArrayList<>();
        Fragment01 fragment01 = new Fragment01();
        Fragment02 fragment02 = new Fragment02();
        Fragment03 fragment03 = new Fragment03();
        Fragment04 fragment04 = new Fragment04();
        Fragment05 fragment05 = new Fragment05();
        list.add(fragment01);
        list.add(fragment02);
        list.add(fragment03);
        list.add(fragment04);
        list.add(fragment05);

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
