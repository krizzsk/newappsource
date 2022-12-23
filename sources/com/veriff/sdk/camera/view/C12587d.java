package com.veriff.sdk.camera.view;

import com.veriff.sdk.camera.core.SurfaceRequest;
import com.veriff.sdk.camera.view.PreviewView;

/* renamed from: com.veriff.sdk.camera.view.d */
public final /* synthetic */ class C12587d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ PreviewView.C125801 f31120b;

    /* renamed from: c */
    public final /* synthetic */ SurfaceRequest f31121c;

    public /* synthetic */ C12587d(PreviewView.C125801 r1, SurfaceRequest surfaceRequest) {
        this.f31120b = r1;
        this.f31121c = surfaceRequest;
    }

    public final void run() {
        this.f31120b.lambda$onSurfaceRequested$0(this.f31121c);
    }
}
