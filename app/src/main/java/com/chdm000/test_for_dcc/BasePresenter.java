package com.chdm000.test_for_dcc;

public class BasePresenter<T> {
    protected T view;

    public void attachView(T view) {
        this.view = view;
        onViewReady();
    }

    public void detachView() {
        view = null;
    }

    protected void onViewReady() {
        // override if need
    }
}
