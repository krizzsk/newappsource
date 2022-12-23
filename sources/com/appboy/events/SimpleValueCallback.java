package com.appboy.events;

import androidx.annotation.Keep;

@Keep
public class SimpleValueCallback<T> implements IValueCallback<T> {
    public void onError() {
    }

    public void onSuccess(T t) {
    }
}
