package com.bawie.lx0410.contract;

import com.bawie.lx0410.model.bean.LoginBean;
import com.bawie.lx0410.model.bean.RegisterBean;

/*
 *@auther:杜其林
 *@Date: 2020/4/10
 *@Time:9:41
 *@Description:${DESCRIPTION}
 * */
public interface ILoginContract {

    interface IView{
        void onLoginSeccess(LoginBean loginBean);
        void onLoginFailure(Throwable throwable);

        void onRegisterSeccess(RegisterBean registerBean);
        void onRegisterFailure(Throwable throwable);
    }

    interface IPresenter{
        void getLoginData(String phone,String pwd);

        void getRegisterData(String phone,String pwd);
    }

    interface IModel{
        void getLoginData(String phone,String pwd,IModelCallBack iModelCallBack);
        void getRegisterData(String phone,String pwd,IModelCallBack i);

        interface IModelCallBack{
            void onLoginSeccess(LoginBean loginBean);
            void onLoginFailure(Throwable throwable);

            void onRegisterSeccess(RegisterBean registerBean);
            void onRegisterFailure(Throwable throwable);
        }
    }
}
