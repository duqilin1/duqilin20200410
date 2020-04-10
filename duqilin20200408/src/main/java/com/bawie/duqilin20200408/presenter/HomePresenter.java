package com.bawie.duqilin20200408.presenter;

import com.bawie.duqilin20200408.base.BasePresenter;
import com.bawie.duqilin20200408.contract.IHomeContract;
import com.bawie.duqilin20200408.model.HomeModel;
import com.bawie.duqilin20200408.model.bean.HomeBean;

/*
 *@auther:杜其林
 *@Date: 2020/4/8
 *@Time:14:09
 *@Description:${DESCRIPTION}
 * */
public class HomePresenter extends BasePresenter<IHomeContract.IView> implements IHomeContract.IPresenter{

    private HomeModel homeModel;

    @Override
    protected void initModel() {
        homeModel = new HomeModel();
    }

    @Override
    public void getHomeData(String userId, String sessionId) {
        homeModel.getHomeData(userId, sessionId, new IHomeContract.IModel.IModelCallBack() {
            @Override
            public void onHomeSeccess(HomeBean homeBean) {
                view.onHomeSeccess(homeBean);
            }

            @Override
            public void onHomeFresser(Throwable throwable) {
                view.onHomeFresser(throwable);
            }
        });
    }
}
