package com.bawie.duqilin20200409.util;

import com.bawie.duqilin20200409.ApiService;
import com.bawie.duqilin20200409.ApiUrl;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/*
 *@auther:杜其林
 *@Date: 2020/4/9
 *@Time:14:02
 *@Description:${DESCRIPTION}
 * */
public class NetUtil {

    private final ApiService apiService;

    public NetUtil() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient httpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).readTimeout(5, TimeUnit.SECONDS).writeTimeout(5, TimeUnit.SECONDS).connectTimeout(5, TimeUnit.SECONDS).build();


        Retrofit retrofit = new Retrofit.Builder().client(httpClient).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).baseUrl(ApiUrl.url).build();


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
