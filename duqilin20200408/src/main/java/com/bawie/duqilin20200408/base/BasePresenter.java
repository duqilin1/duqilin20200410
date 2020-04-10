package com.bawie.duqilin20200408.base;

/*
 *@auther:杜其林
 *@Date: 2020/4/8
 *@Time:13:58
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
