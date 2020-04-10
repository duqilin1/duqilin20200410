package com.bawie.duqilin20200408;

import com.bawie.duqilin20200408.model.bean.HomeBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;

/*
 *@auther:杜其林
 *@Date: 2020/4/8
 *@Time:13:48
 *@Description:${DESCRIPTION}
 * */
public interface ApiService {
    @GET(ApiUrl.homeBean)
    Observable<HomeBean> homeBean(@Header("userId") String userId,@Header("sessionId") String sessionId);
}
