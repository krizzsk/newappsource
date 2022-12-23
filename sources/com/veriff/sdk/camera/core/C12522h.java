package com.veriff.sdk.camera.core;

import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.SurfaceRequest;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import p229r1.C6231a;

/* renamed from: com.veriff.sdk.camera.core.h */
public final /* synthetic */ class C12522h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f31047b;

    /* renamed from: c */
    public final /* synthetic */ Object f31048c;

    /* renamed from: d */
    public final /* synthetic */ Object f31049d;

    public /* synthetic */ C12522h(int i, Object obj, Object obj2) {
        this.f31047b = i;
        this.f31048c = obj;
        this.f31049d = obj2;
    }

    public final void run() {
        switch (this.f31047b) {
            case 0:
                Futures.propagate(((CameraX) this.f31048c).shutdownInternal(), (CallbackToFutureAdapter.C0673a) this.f31049d);
                return;
            default:
                ((C6231a) this.f31048c).accept(SurfaceRequest.Result.m32265of(4, (Surface) this.f31049d));
                return;
        }
    }
}
