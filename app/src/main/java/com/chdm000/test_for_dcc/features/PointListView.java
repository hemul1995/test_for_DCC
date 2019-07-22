package com.chdm000.test_for_dcc.features;

import android.graphics.Point;

import java.util.List;

public interface PointListView {
    void showProgress();

    void hideProgress();

    void showPointList(List<Point> list);

    void showError(String message);
}
