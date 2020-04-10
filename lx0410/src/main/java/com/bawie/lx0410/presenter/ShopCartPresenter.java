package com.bawie.lx0410.presenter;

import com.bawie.lx0410.base.BasePresenter;
import com.bawie.lx0410.contract.IShopCartContract;
import com.bawie.lx0410.model.ShopCartModel;
import com.bawie.lx0410.model.bean.ShopCartBean;

/*
 *@auther:杜其林
 *@Date: 2020/4/10
 *@Time:11:50
 *@Description:${DESCRIPTION}
 * */
public class ShopCartPresenter extends BasePresenter<IShopCartContract.IView> implements IShopCartContract.IPresenter{

    private ShopCartModel shopCartModel;

    @Override
    protected void initModel() {
        shopCartModel = new ShopCartModel();
    }

    @Override
    public void getShopCartData() {
        shopCartModel.getShopCartData(new IShopCartContract.IModel.IModelCallBack() {
            @Override
            public void onShopCartSeccess(ShopCartBean shopCartBean) {
                view.onShopCartSeccess(shopCartBean);
            }

            @Override
            public void onShopCartFailure(Throwable throwable) {
                view.onShopCartFailure(throwable);
            }
        });
    }
}
