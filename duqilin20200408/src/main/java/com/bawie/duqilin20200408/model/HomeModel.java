package com.bawie.duqilin20200408.model;

import com.bawie.duqilin20200408.contract.IHomeContract;
import com.bawie.duqilin20200408.model.bean.HomeBean;
import com.bawie.duqilin20200408.util.NetUtil;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/*
 *@auther:杜其林
 *@Date: 2020/4/8
 *@Time:14:08
 *@Description:${DESCRIPTION}
 * */
public class HomeModel implements IHomeContract.IModel{

    @Override
    public void getHomeData(String userId, String sessionId, IModelCallBack iModelCallBack) {
        NetUtil.getInstance().getApiService().homeBean(userId,sessionId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HomeBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(HomeBean homeBean) {
                        iModelCallBack.onHomeSeccess(homeBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        iModelCallBack.onHomeFresser(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
