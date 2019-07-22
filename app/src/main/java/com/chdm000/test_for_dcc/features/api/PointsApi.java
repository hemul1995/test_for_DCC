package com.chdm000.test_for_dcc.features.api;

import android.graphics.Point;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface PointsApi {
//    @FormUrlEncoded
//    @POST("pointsList")
//    Call<List<Point>> getAllPoints();

    @FormUrlEncoded
    @POST("pointsList")
    Call<List<Point>> getPoints(@Field("version") String version, @Body Integer count);
}
