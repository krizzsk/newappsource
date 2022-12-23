package com.usebutton.sdk.internal.core;

public interface FailableReceiver<T> {
    void onError();

    void onResult(T t);
}
