package com.veriff.sdk.camera.camera2.internal;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.veriff.sdk.camera.camera2.internal.g */
public final /* synthetic */ class C12460g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Camera2CameraImpl f30966b;

    /* renamed from: c */
    public final /* synthetic */ Collection f30967c;

    public /* synthetic */ C12460g(Camera2CameraImpl camera2CameraImpl, ArrayList arrayList) {
        this.f30966b = camera2CameraImpl;
        this.f30967c = arrayList;
    }

    public final void run() {
        this.f30966b.lambda$detachUseCases$12(this.f30967c);
    }
}
