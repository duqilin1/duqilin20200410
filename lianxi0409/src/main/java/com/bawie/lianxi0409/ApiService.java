package com.bawie.lianxi0409;

import com.bawie.lianxi0409.model.bean.LoginBean;
import com.bawie.lianxi0409.model.bean.OrderBean;
import com.bawie.lianxi0409.model.bean.RegisterBean;
import com.bawie.lianxi0409.model.bean.ShopcartBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/*
 *@auther:杜其林
 *@Date: 2020/4/9
 *@Time:10:48
 *@Description:${DESCRIPTION}
 * */
public interface ApiService {
    //登录
    @FormUrlEncoded
    @POST(ApiUrl.loginUrl)
    Observable<LoginBean> loginBean(@Field("phone")String phone, @Field("pwd")String pwd);

    //注册
    @FormUrlEncoded
    @POST(ApiUrl.registerUrl)
    Observable<RegisterBean> registerBean(@Field("phone") String phone, @Field("pwd")String pwd);
    //购物车
    @GET(ApiUrl.shopCartBean)
    Observable<ShopcartBean> shopcartBean();
    //订单
    @GET(ApiUrl.orderBean)
    Observable<OrderBean> orderBean(@Query("page") int page,@Query("pageSize") int pageSize,@Query("type") int type);
}
