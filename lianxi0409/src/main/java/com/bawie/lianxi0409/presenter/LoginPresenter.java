package com.bawie.lianxi0409.presenter;

import com.bawie.lianxi0409.base.BasePresenter;
import com.bawie.lianxi0409.contract.ILoginContract;
import com.bawie.lianxi0409.model.LoginModel;
import com.bawie.lianxi0409.model.bean.LoginBean;
import com.bawie.lianxi0409.model.bean.RegisterBean;

/*
 *@auther:杜其林
 *@Date: 2020/4/9
 *@Time:11:34
 *@Description:${DESCRIPTION}
 * */
public class LoginPresenter extends BasePresenter<ILoginContract.IView> implements ILoginContract.IPresenter{

    private LoginModel loginModel;

    @Override
    protected void initModel() {
        loginModel = new LoginModel();
    }

    @Override
    public void getLoginData(String phone, String pwd) {
        loginModel.getLoginData(phone, pwd, new ILoginContract.IModel.IModelCallBack() {
            @Override
            public void onLoginSeccess(LoginBean loginBean) {
                view.onLoginSeccess(loginBean);
            }

            @Override
            public void onLoginFailure(Throwable throwable) {
                view.onLoginFailure(throwable);
            }

            @Override
            public void onRegisterSeccess(RegisterBean registerBean) {
                view.onRegisterSeccess(registerBean);
            }

            @Override
            public void onRegisterFailure(Throwable throwable) {
                view.onRegisterFailure(throwable);
            }
        });
    }

    @Override
    public void getRegisterData(String phone, String pwd) {
        loginModel.getRegisterData(phone, pwd, new ILoginContract.IModel.IModelCallBack() {
            @Override
            public void onLoginSeccess(LoginBean loginBean) {
                view.onLoginSeccess(loginBean);
            }

            @Override
            public void onLoginFailure(Throwable throwable) {
                view.onLoginFailure(throwable);
            }

            @Override
            public void onRegisterSeccess(RegisterBean registerBean) {
                view.onRegisterSeccess(registerBean);
            }

            @Override
            public void onRegisterFailure(Throwable throwable) {
                view.onRegisterFailure(throwable);
            }
        });
    }
}
