package com.bawie.zy0408.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bawie.zy0408.R;
import com.bawie.zy0408.base.BaseFragment;
import com.bawie.zy0408.contract.IHomeContract;
import com.bawie.zy0408.model.bean.HomeBean;
import com.bawie.zy0408.presenter.HomePresenter;
import com.bawie.zy0408.view.adapter.OrderFormAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class OrderFromFragment extends BaseFragment<HomePresenter> implements IHomeContract.IView {

    @BindView(R.id.rv)
    RecyclerView rv;
    private int key;
    protected int status = 0;
    private int page = 1;
    private int count = 5;

    @Override
    protected int layoutId() {
        return R.layout.fragment_order_from;
    }

    @Override
    protected void initData() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            key = arguments.getInt("key");
        }
        mPresenter.getHomeData("27911", "158634444805827911", page, count, status);
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
        OrderFormAdapter orderFormAdapter = new OrderFormAdapter(orderList);
        rv.setAdapter(orderFormAdapter);

    }

    @Override
    public void onHomeFreager(Throwable throwable) {

    }

    public static OrderFromFragment getInstance(int value) {
        OrderFromFragment orderFromFragment = new OrderFromFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("key", value);
        orderFromFragment.setArguments(bundle);
        return orderFromFragment;
    }
}
