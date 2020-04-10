package com.bawie.duqilin20200408.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bawie.duqilin20200408.R;
import com.bawie.duqilin20200408.base.BaseFragment;
import com.bawie.duqilin20200408.contract.IHomeContract;
import com.bawie.duqilin20200408.model.bean.HomeBean;
import com.bawie.duqilin20200408.presenter.HomePresenter;
import com.bawie.duqilin20200408.view.adapter.HomeAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class GwcFragment extends BaseFragment<HomePresenter> implements IHomeContract.IView {

    @BindView(R.id.rv)
    RecyclerView rv;

    @Override
    protected int layoutId() {
        return R.layout.fragment_gwc;
    }

    @Override
    protected void initData() {
        mPresenter.getHomeData("27911", "158632694694227911");
    }

    @Override
    protected void initView(View inflate) {

    }

    @Override
    protected HomePresenter providePresenter() {
        return new HomePresenter();
    }

    @Override
    public void onHomeSeccess(HomeBean homeBean) {
        List<HomeBean.ResultBean> result = homeBean.getResult();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(linearLayoutManager);
        HomeAdapter homeAdapter = new HomeAdapter(result);
        rv.setAdapter(homeAdapter);
        Log.d("dql", "onHomeSeccess: "+homeBean.getMessage());
    }

    @Override
    public void onHomeFresser(Throwable throwable) {
        Toast.makeText(getContext(),"请求失败",Toast.LENGTH_SHORT).show();
    }
}
