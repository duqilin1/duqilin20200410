package com.bawie.zy0408.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/*
 *@auther:杜其林
 *@Date: 2020/4/8
 *@Time:19:25
 *@Description:${DESCRIPTION}
 * */
public abstract class BaseFragment<P extends BasePresenter> extends Fragment implements IBaseView{

    protected P mPresenter;
    private View inflate;
    private boolean isinitView = false;
    private boolean isinitData = false;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflate = LayoutInflater.from(inflater.getContext()).inflate(layoutId(), null);
        return inflate;
    }

    protected abstract int layoutId();

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mPresenter = providePresenter();
        if (mPresenter != null) {
            mPresenter.attach(this);
        }
        ButterKnife.bind(this,inflate);
        initView(inflate);
        isinitView = true;

        if (getUserVisibleHint()){
            initData();
            isinitData = true;
        }
    }

    protected abstract void initData();

    protected abstract void initView(View inflate);

    protected abstract P providePresenter();

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser && isinitView &&! isinitData){
            initData();
            isinitData = true;
        }
    }
}
