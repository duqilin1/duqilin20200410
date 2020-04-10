package com.bawie.duqilin20200409.contract;

import com.bawie.duqilin20200409.model.bean.HomeBean;

/*
 *@auther:杜其林
 *@Date: 2020/4/9
 *@Time:14:10
 *@Description:${DESCRIPTION}
 * */
public interface IHomeContract {

     interface IView{
          void onHomeSeccess(HomeBean homeBean);
          void onHomeFaiter(Throwable throwable);
     }

     interface IPresenter{
          void getHomeData(String userId,String sessionId,int status,int page,int count);
     }

     interface IModel{
          void getHomeData(String userId,String sessionId,int status,int page,int count,IModelCallBack iModelCallBack);

          interface IModelCallBack{
               void onHomeSeccess(HomeBean homeBean);
               void onHomeFaiter(Throwable throwable);
          }
     }
}
