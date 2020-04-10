package com.bawie.duqilin20200409.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bawie.duqilin20200409.R;
import com.bawie.duqilin20200409.base.BaseFragment;
import com.bawie.duqilin20200409.contract.IHomeContract;
import com.bawie.duqilin20200409.model.bean.HomeBean;
import com.bawie.duqilin20200409.presenter.HomePresenter;
import com.bawie.duqilin20200409.view.adapter.Adapter1;

import java.util.List;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment05 extends BaseFragment<HomePresenter> implements IHomeContract.IView {

    @BindView(R.id.rv)
    RecyclerView rv;

    @Override
    protected int layoutId() {
        return R.layout.fragment_fragment01;
    }

    @Override
    protected void initData() {
        mPresenter.getHomeData("27911", "158641090443927911", 9, 1, 5);
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
        List<HomeBean.OrderListBean> orderList = homeBean.getOrderList();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(linearLayoutManager);
        Adapter1 adapter1 = new Adapter1(orderList);
        rv.setAdapter(adapter1);
    }

    @Override
    public void onHomeFaiter(Throwable throwable) {

    }
}
