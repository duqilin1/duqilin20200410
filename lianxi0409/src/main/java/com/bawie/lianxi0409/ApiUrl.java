package com.bawie.lianxi0409;

/*
 *@auther:杜其林
 *@Date: 2020/4/9
 *@Time:10:48
 *@Description:${DESCRIPTION}
 * */
public interface ApiUrl {

     String url = "http://mobile.bwstudent.com/";

    //注册接口
    String registerUrl = "small/user/v1/register";

    //登录接口
    String loginUrl = "small/user/v1/login";

    //购物车接口
    String shopCartBean = "http://blog.zhaoliang5156.cn/api/shop/month_shopcart_new.json";

    //订单接口
    String orderBean = "http://blog.zhaoliang5156.cn/baweiapi/order";
}
