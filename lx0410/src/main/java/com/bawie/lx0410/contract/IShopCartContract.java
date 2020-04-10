package com.bawie.lx0410.contract;

import com.bawie.lx0410.model.bean.ShopCartBean;

/*
 *@auther:杜其林
 *@Date: 2020/4/10
 *@Time:11:44
 *@Description:${DESCRIPTION}
 * */
public interface IShopCartContract {

     interface IView{
         void onShopCartSeccess(ShopCartBean shopCartBean);
         void onShopCartFailure(Throwable throwable);
     }

     interface IPresenter{
         void getShopCartData();
     }

     interface IModel{
         void getShopCartData(IModelCallBack iModelCallBack);

         interface IModelCallBack{
             void onShopCartSeccess(ShopCartBean shopCartBean);
             void onShopCartFailure(Throwable throwable);
         }
     }
}
