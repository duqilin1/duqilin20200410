package com.bawie.lianxi0409.view.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.bawie.lianxi0409.R;
import com.bawie.lianxi0409.base.BaseActivity;
import com.bawie.lianxi0409.base.BasePresenter;
import com.bawie.lianxi0409.view.fragment.LoginFragment;
import com.bawie.lianxi0409.view.fragment.RegisterFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.rb01)
    RadioButton rb01;
    @BindView(R.id.rb02)
    RadioButton rb02;
    @BindView(R.id.rg)
    RadioGroup rg;
    @BindView(R.id.vp)
    ViewPager vp;
    private ArrayList<Fragment> list;

    @Override
    protected void initData() {
        list = new ArrayList<>();
        LoginFragment loginFragment = new LoginFragment();
        RegisterFragment registerFragment = new RegisterFragment();
        list.add(loginFragment);
        list.add(registerFragment);
        vp.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
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

    @OnClick({R.id.rb01, R.id.rb02})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rb01:
                vp.setCurrentItem(0);
                break;
            case R.id.rb02:
                vp.setCurrentItem(1);
                break;
        }
    }
}

