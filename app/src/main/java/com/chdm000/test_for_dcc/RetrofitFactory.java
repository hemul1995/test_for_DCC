package com.chdm000.test_for_dcc;

import android.content.Context;

import com.chdm000.test_for_dcc.network.RetrofitProvider;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor;

public class RetrofitFactory {
    static RetrofitProvider createRetrofitProvider(Context context) {
        final HttpLoggingInterceptor logInterceptor = new HttpLoggingInterceptor();
        logInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        final List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(logInterceptor);
        return new RetrofitProvider(interceptorList);
    }
}
