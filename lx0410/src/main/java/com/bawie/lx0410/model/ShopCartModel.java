package com.bawie.lx0410.model;

import com.bawie.lx0410.contract.IShopCartContract;
import com.bawie.lx0410.model.bean.ShopCartBean;
import com.bawie.lx0410.util.NetUtil;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/*
 *@auther:杜其林
 *@Date: 2020/4/10
 *@Time:11:46
 *@Description:${DESCRIPTION}
 * */
public class ShopCartModel implements IShopCartContract.IModel{

    @Override
    public void getShopCartData(IModelCallBack iModelCallBack) {
        NetUtil.getInstance().getApiService().shopCartBean()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ShopCartBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ShopCartBean shopCartBean) {
                        iModelCallBack.onShopCartSeccess(shopCartBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        iModelCallBack.onShopCartFailure(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
