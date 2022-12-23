package com.appboy.events;

import androidx.annotation.Keep;

@Keep
public interface IValueCallback<T> {
    void onError();

    void onSuccess(T t);
}
