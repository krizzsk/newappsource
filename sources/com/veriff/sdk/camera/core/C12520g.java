package com.veriff.sdk.camera.core;

import android.content.Context;
import com.veriff.sdk.camera.core.impl.utils.futures.AsyncFunction;
import p695od.C18728c;

/* renamed from: com.veriff.sdk.camera.core.g */
public final /* synthetic */ class C12520g implements AsyncFunction {

    /* renamed from: a */
    public final /* synthetic */ CameraX f31042a;

    /* renamed from: b */
    public final /* synthetic */ Context f31043b;

    public /* synthetic */ C12520g(Context context, CameraX cameraX) {
        this.f31042a = cameraX;
        this.f31043b = context;
    }

    public final C18728c apply(Object obj) {
        return this.f31042a.initInternal(this.f31043b);
    }
}
