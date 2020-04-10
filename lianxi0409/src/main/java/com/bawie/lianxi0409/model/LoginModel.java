package com.bawie.lianxi0409.model;

import com.bawie.lianxi0409.contract.ILoginContract;
import com.bawie.lianxi0409.model.bean.LoginBean;
import com.bawie.lianxi0409.model.bean.RegisterBean;
import com.bawie.lianxi0409.util.NetUtil;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/*
 *@auther:杜其林
 *@Date: 2020/4/9
 *@Time:11:33
 *@Description:${DESCRIPTION}
 * */
public class LoginModel implements ILoginContract.IModel{

    @Override
    public void getLoginData(String phone, String pwd, IModelCallBack iModelCallBack) {
        NetUtil.getInstance().getApiService().loginBean(phone,pwd)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LoginBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(LoginBean loginBean) {
                        iModelCallBack.onLoginSeccess(loginBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        iModelCallBack.onLoginFailure(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void getRegisterData(String phone, String pwd, IModelCallBack iModelCallBack) {
        NetUtil.getInstance().getApiService().registerBean(phone,pwd)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RegisterBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(RegisterBean registerBean) {
                        iModelCallBack.onRegisterSeccess(registerBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        iModelCallBack.onRegisterFailure(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
