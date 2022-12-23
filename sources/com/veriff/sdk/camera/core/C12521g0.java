package com.veriff.sdk.camera.core;

import android.view.Surface;
import com.veriff.sdk.camera.core.ProcessingImageReader;
import com.veriff.sdk.camera.core.SurfaceRequest;
import com.veriff.sdk.camera.core.impl.ImageReaderProxy;
import p229r1.C6231a;

/* renamed from: com.veriff.sdk.camera.core.g0 */
public final /* synthetic */ class C12521g0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f31044b;

    /* renamed from: c */
    public final /* synthetic */ Object f31045c;

    /* renamed from: d */
    public final /* synthetic */ Object f31046d;

    public /* synthetic */ C12521g0(int i, Object obj, Object obj2) {
        this.f31044b = i;
        this.f31045c = obj;
        this.f31046d = obj2;
    }

    public final void run() {
        switch (this.f31044b) {
            case 0:
                ((ProcessingImageReader.C124992) this.f31045c).lambda$onImageAvailable$0((ImageReaderProxy.OnImageAvailableListener) this.f31046d);
                return;
            default:
                ((C6231a) this.f31045c).accept(SurfaceRequest.Result.m32265of(3, (Surface) this.f31046d));
                return;
        }
    }
}
