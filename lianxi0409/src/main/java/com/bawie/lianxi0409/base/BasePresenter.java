package com.bawie.lianxi0409.base;

/*
 *@auther:杜其林
 *@Date: 2020/4/9
 *@Time:10:35
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
