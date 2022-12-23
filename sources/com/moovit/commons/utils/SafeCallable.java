package com.moovit.commons.utils;

import androidx.annotation.Keep;
import java.util.concurrent.Callable;

@Keep
public interface SafeCallable<V> extends Callable<V> {
    V call();

    V onError(Throwable th);

    V safeCall() throws Throwable;
}
