package com.bawie.duqilin20200409;

import com.bawie.duqilin20200409.model.bean.HomeBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/*
 *@auther:杜其林
 *@Date: 2020/4/9
 *@Time:13:59
 *@Description:${DESCRIPTION}
 * */
public interface ApiService {
     @GET(ApiUrl.homeUrl)
    Observable<HomeBean> homeBean(@Header("userId")String userId,@Header("")String sessionId,
                                  @Query("status")int status, @Query("page")int page, @Query("count")int count);
}
