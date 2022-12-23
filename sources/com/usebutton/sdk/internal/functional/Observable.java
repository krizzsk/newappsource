package com.usebutton.sdk.internal.functional;

public interface Observable<T> {
    void subscribeWeak(T t);

    void unsubscribe(T t);
}
