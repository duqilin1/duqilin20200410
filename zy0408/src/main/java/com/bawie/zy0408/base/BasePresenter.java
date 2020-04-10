package com.bawie.zy0408.base;

/*
 *@auther:杜其林
 *@Date: 2020/4/8
 *@Time:19:20
 *@Description:${DESCRIPTION}
 * */
public abstract class BasePresenter<V> implements IBaseView{

    protected V view;

    public BasePresenter() {
        initModel();
    }

    protected abstract void initModel();

    public void attach(V view) {
        this.view = view;
    }

    public void detach() {
        view = null;
    }
}
