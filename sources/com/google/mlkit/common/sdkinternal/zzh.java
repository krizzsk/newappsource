package com.google.mlkit.common.sdkinternal;

import java.util.concurrent.Executor;

enum zzh implements Executor {
    INSTANCE;

    public final void execute(Runnable runnable) {
        C14564a.m36403a().f36785a.post(runnable);
    }
}
