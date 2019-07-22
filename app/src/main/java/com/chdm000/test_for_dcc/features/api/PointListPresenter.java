package com.chdm000.test_for_dcc.features.api;

import android.graphics.Point;

import com.chdm000.test_for_dcc.BasePresenter;
import com.chdm000.test_for_dcc.features.PointListView;
import com.chdm000.test_for_dcc.features.PointsData;
import com.chdm000.test_for_dcc.network.Carry;

import java.util.List;

public class PointListPresenter extends BasePresenter<PointListView> {
    private final PointsData pointsData;

    public PointListPresenter(PointsData pointsData) {
        this.pointsData = pointsData;
    }

    @Override
    protected void onViewReady() {
        //loadPoints();
    }

    void loadPoints(Integer count) {
        view.showProgress();
        pointsData.getPoints(count, new Carry<List<Point>>() {
            @Override
            public void onSuccess(List<Point> result) {
                view.showPointList(result);
                view.hideProgress();
            }

            @Override
            public void onFailure(Throwable throwable) {
                view.hideProgress();
                view.showError(throwable.getMessage());
            }
        });
    }
}
