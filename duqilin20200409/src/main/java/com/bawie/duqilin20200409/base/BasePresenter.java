package com.bawie.duqilin20200409.base;

/*
 *@auther:杜其林
 *@Date: 2020/4/9
 *@Time:13:47
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

    public void detach(){
        view = null;
    }
}
