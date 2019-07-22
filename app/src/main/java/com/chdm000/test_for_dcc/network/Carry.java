package com.chdm000.test_for_dcc.network;

public interface Carry<T> {
    void onSuccess(T result);

    void onFailure(Throwable throwable);
}
