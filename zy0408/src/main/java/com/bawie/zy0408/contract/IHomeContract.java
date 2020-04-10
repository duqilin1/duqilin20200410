package com.bawie.zy0408.contract;

import com.bawie.zy0408.model.bean.HomeBean;

/*
 *@auther:杜其林
 *@Date: 2020/4/8
 *@Time:19:30
 *@Description:${DESCRIPTION}
 * */
public interface IHomeContract {

    interface IView{
        void onHomeSeccess(HomeBean homeBean);
        void onHomeFreager(Throwable throwable);
    }

    interface IPresenter{
        void getHomeData(String userId,String sessionId,int status,int page,int count);
    }

    interface IModel{
        void getHomeData(String userId,String sessionId,int status,int page,int count,IModelCallback iModelCallback);

        interface IModelCallback{
            void onHomeSeccess(HomeBean homeBean);
            void onHomeFreager(Throwable throwable);
        }
    }
}
