package com.bawie.lx0410;

/*
 *@auther:杜其林
 *@Date: 2020/4/10
 *@Time:8:53
 *@Description:${DESCRIPTION}
 * */
public interface ApiUrl {

    String url = "http://mobile.bwstudent.com/";

    //登录
    String loginUrl = "small/user/v1/login";

    //注册
    String registerUrl = "small/user/v1/register";

    //购物车
    String shopCartUrl = "http://blog.zhaoliang5156.cn/api/shop/month_shopcart_new.json";

    //订单
    String orderUrl = "http://blog.zhaoliang5156.cn/baweiapi/order";
}
