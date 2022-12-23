package com.veriff.sdk.camera.core;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.veriff.sdk.camera.core.c */
public final /* synthetic */ class C12512c implements RejectedExecutionHandler {
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        Logger.m32241e("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
    }
}
