package com.bawie.duqilin20200408.contract;

import com.bawie.duqilin20200408.model.bean.HomeBean;

/*
 *@auther:杜其林
 *@Date: 2020/4/8
 *@Time:14:06
 *@Description:${DESCRIPTION}
 * */
public interface IHomeContract {

    interface IView{
        void onHomeSeccess(HomeBean homeBean);
        void onHomeFresser(Throwable throwable);
    }

    interface IPresenter{
        void getHomeData(String userId,String sessionId);
    }

    interface IModel{
        void getHomeData(String userId,String sessionId,IModelCallBack iModelCallBack);

        interface IModelCallBack{
            void onHomeSeccess(HomeBean homeBean);
            void onHomeFresser(Throwable throwable);
        }
    }
}
