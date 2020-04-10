package com.bawie.lx0410.base;

/*
 *@auther:杜其林
 *@Date: 2020/4/10
 *@Time:8:54
 *@Description:${DESCRIPTION}
 * */
public abstract class BasePresenter<V> {
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
