package com.appboy.models;

import androidx.annotation.Keep;

@Keep
public interface IPutIntoJson<T> {
    T forJsonPut();
}
