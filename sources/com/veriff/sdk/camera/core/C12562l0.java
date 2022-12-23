package com.veriff.sdk.camera.core;

import com.veriff.sdk.camera.core.SurfaceRequest;
import com.veriff.sdk.camera.view.C12588e;

/* renamed from: com.veriff.sdk.camera.core.l0 */
public final /* synthetic */ class C12562l0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ SurfaceRequest.TransformationInfoListener f31079b;

    /* renamed from: c */
    public final /* synthetic */ SurfaceRequest.TransformationInfo f31080c;

    public /* synthetic */ C12562l0(SurfaceRequest.TransformationInfoListener transformationInfoListener, SurfaceRequest.TransformationInfo transformationInfo) {
        this.f31079b = transformationInfoListener;
        this.f31080c = transformationInfo;
    }

    public final void run() {
        ((C12588e) this.f31079b).mo39361a(this.f31080c);
    }
}
