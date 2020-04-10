package com.bawie.zy0408.model;

import com.bawie.zy0408.contract.IHomeContract;
import com.bawie.zy0408.model.bean.HomeBean;
import com.bawie.zy0408.util.NetUtil;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/*
 *@auther:杜其林
 *@Date: 2020/4/8
 *@Time:19:59
 *@Description:${DESCRIPTION}
 * */
public class HomeModel implements IHomeContract.IModel{

    @Override
    public void getHomeData(String userId, String sessionId, int status, int page, int count, IModelCallback iModelCallback) {

        NetUtil.getInstance().getApiService().homeBean(userId,sessionId,status,page,count)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(new Observer<HomeBean>() {
                @Override
                public void onSubscribe(Disposable d) {

                }

                @Override
                public void onNext(HomeBean homeBean) {
                    iModelCallback.onHomeSeccess(homeBean);
                }

                @Override
                public void onError(Throwable e) {
                    iModelCallback.onHomeFreager(e);
                }

                @Override
                public void onComplete() {

                }
            });
    }
}
