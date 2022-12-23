package com.appboy.events;

import androidx.annotation.Keep;

@Keep
public interface IEventSubscriber<T> {
    void trigger(T t);
}
