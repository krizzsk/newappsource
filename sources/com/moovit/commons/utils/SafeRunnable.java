package com.moovit.commons.utils;

import androidx.annotation.Keep;

@Keep
public interface SafeRunnable extends Runnable {
    void onError(Throwable th);

    void run();

    void safeRun() throws Throwable;
}
