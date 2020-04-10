package com.bawie.zy0408;

import com.bawie.zy0408.model.bean.HomeBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/*
 *@auther:杜其林
 *@Date: 2020/4/8
 *@Time:19:19
 *@Description:${DESCRIPTION}
 * */
public interface ApiService {

    @GET(ApiUrl.homeUrl)
    Observable<HomeBean> homeBean(@Header("userId") String userId, @Header("sessionId") String sessionId,
                                  @Query("status") int status, @Query("page") int page,@Query("count") int count);
}
