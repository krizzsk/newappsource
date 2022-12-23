package com.usebutton.sdk.internal.core;

public class NoOpReceiver<T> implements FailableReceiver<T> {
    public void onError() {
    }

    public void onResult(T t) {
    }
}
