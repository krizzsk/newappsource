package com.moovit.commons.utils;

import androidx.annotation.Keep;
import java.util.concurrent.Callable;

@Keep
public interface CallableRunnable extends Callable<Void>, Runnable {
    /* bridge */ /* synthetic */ Object call() throws Exception;

    Void call() throws Exception;

    void onError(Throwable th);

    void run();

    void runSafe() throws Exception;
}
