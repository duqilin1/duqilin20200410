package com.bawie.duqilin20200409.presenter;

import com.bawie.duqilin20200409.base.BasePresenter;
import com.bawie.duqilin20200409.contract.IHomeContract;
import com.bawie.duqilin20200409.model.HomeModel;
import com.bawie.duqilin20200409.model.bean.HomeBean;

/*
 *@auther:杜其林
 *@Date: 2020/4/9
 *@Time:14:15
 *@Description:${DESCRIPTION}
 * */ public class HomePresenter extends BasePresenter<IHomeContract.IView> implements IHomeContract.IPresenter{

    private HomeModel homeModel;

    @Override
    protected void initModel() {
        homeModel = new HomeModel();
    }

    @Override
    public void getHomeData(String userId, String sessionId, int status, int page, int count) {
        homeModel.getHomeData(userId, sessionId, status, page, count, new IHomeContract.IModel.IModelCallBack() {
            @Override
            public void onHomeSeccess(HomeBean homeBean) {
                view.onHomeSeccess(homeBean);
            }

            @Override
            public void onHomeFaiter(Throwable throwable) {
                view.onHomeFaiter(throwable);
            }
        });
    }
}
