package com.bawie.zy0408.presenter;

import com.bawie.zy0408.base.BasePresenter;
import com.bawie.zy0408.contract.IHomeContract;
import com.bawie.zy0408.model.HomeModel;
import com.bawie.zy0408.model.bean.HomeBean;

/*
 *@auther:杜其林
 *@Date: 2020/4/8
 *@Time:20:07
 *@Description:${DESCRIPTION}
 * */
public class HomePresenter extends BasePresenter<IHomeContract.IView> implements IHomeContract.IPresenter{

    private HomeModel homeModel;

    @Override
    protected void initModel() {
        homeModel = new HomeModel();
    }

    @Override
    public void getHomeData(String userId, String sessionId, int status, int page, int count) {

        homeModel.getHomeData(userId, sessionId,status,page,count, new IHomeContract.IModel.IModelCallback() {
            @Override
            public void onHomeSeccess(HomeBean homeBean) {
                view.onHomeSeccess(homeBean);
            }

            @Override
            public void onHomeFreager(Throwable throwable) {
                view.onHomeFreager(throwable);
            }
        });
    }
}
