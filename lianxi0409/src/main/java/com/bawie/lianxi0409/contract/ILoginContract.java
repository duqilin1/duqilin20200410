package com.bawie.lianxi0409.contract;

import com.bawie.lianxi0409.model.bean.LoginBean;
import com.bawie.lianxi0409.model.bean.RegisterBean;

/*
 *@auther:杜其林
 *@Date: 2020/4/9
 *@Time:11:29
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
         void getLoginData(String phone ,String pwd);

         void getRegisterData(String phone ,String pwd);
     }

     interface IModel{
         void getLoginData(String phone ,String pwd,IModelCallBack iModelCallBack);
         void getRegisterData(String phone ,String pwd,IModelCallBack iModelCallBack);

         interface IModelCallBack{
             void onLoginSeccess(LoginBean loginBean);
             void onLoginFailure(Throwable throwable);

             void onRegisterSeccess(RegisterBean registerBean);
             void onRegisterFailure(Throwable throwable);
         }
     }
}
