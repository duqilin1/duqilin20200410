package com.bawie.lx0410;

import com.bawie.lx0410.model.bean.LoginBean;
import com.bawie.lx0410.model.bean.OrderBean;
import com.bawie.lx0410.model.bean.RegisterBean;
import com.bawie.lx0410.model.bean.ShopCartBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/*
 *@auther:杜其林
 *@Date: 2020/4/10
 *@Time:8:50
 *@Description:${DESCRIPTION}
 * */
public interface ApiService {
    //登录
    @FormUrlEncoded
    @POST(ApiUrl.loginUrl)
    Observable<LoginBean> loginBean(@Field("phone") String phone,@Field("pwd") String pwd);

    //注册
    @FormUrlEncoded
    @POST(ApiUrl.registerUrl)
    Observable<RegisterBean> registerBean(@Field("phone") String phone, @Field("pwd") String pwd);

    //购物车
    @GET(ApiUrl.shopCartUrl)
    Observable<ShopCartBean> shopCartBean();

    //订单513421
    @GET(ApiUrl.orderUrl)
    Observable<OrderBean> orderBean(@Query("page") int page,@Query("pageSize") int pageSize,@Query("type") int type);
}
