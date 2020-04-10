package com.bawie.duqilin20200408.util;

import com.bawie.duqilin20200408.ApiService;
import com.bawie.duqilin20200408.ApiUrl;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/*
 *@auther:杜其林
 *@Date: 2020/4/8
 *@Time:13:48
 *@Description:${DESCRIPTION}
 * */
public class NetUtil {

    private final ApiService apiService;

    public NetUtil() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient httpClient = new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .connectTimeout(5, TimeUnit.SECONDS)
                .writeTimeout(5, TimeUnit.SECONDS)
                .readTimeout(5, TimeUnit.SECONDS)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .client(httpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(ApiUrl.url)
                .build();

        apiService = retrofit.create(ApiService.class);
    }

    public static NetUtil getInstance() {
        return SingleHolder.NET_UTIL;
    }

    public static final class SingleHolder{
        public static final NetUtil NET_UTIL = new NetUtil();
    }

    public ApiService getApiService() {
        return apiService;
    }
}
