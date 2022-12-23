package com.usebutton.sdk.internal.util;

public interface Receiver<T> {
    void receive(T t);
}
