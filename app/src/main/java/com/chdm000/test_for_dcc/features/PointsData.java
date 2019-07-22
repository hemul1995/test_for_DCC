package com.chdm000.test_for_dcc.features;

import android.graphics.Point;

import com.chdm000.test_for_dcc.features.api.PointsApi;
import com.chdm000.test_for_dcc.network.Carry;
import com.chdm000.test_for_dcc.network.DefaultCallback;

import java.util.List;

public class PointsData {
    private final PointsApi pointsApi;


    public PointsData(PointsApi pointsApi) {
        this.pointsApi = pointsApi;
    }

    public void getPoints(Integer count, Carry<List<Point>> carry) {
        pointsApi.getPoints("1.1", count).enqueue(new DefaultCallback(carry));
    }
}
