package com.veriff.sdk.camera.view;

import com.veriff.sdk.camera.core.SurfaceRequest;
import com.veriff.sdk.camera.core.impl.CameraInternal;
import com.veriff.sdk.camera.view.PreviewView;

/* renamed from: com.veriff.sdk.camera.view.e */
public final /* synthetic */ class C12588e implements SurfaceRequest.TransformationInfoListener {

    /* renamed from: a */
    public final /* synthetic */ PreviewView.C125801 f31122a;

    /* renamed from: b */
    public final /* synthetic */ CameraInternal f31123b;

    /* renamed from: c */
    public final /* synthetic */ SurfaceRequest f31124c;

    public /* synthetic */ C12588e(PreviewView.C125801 r1, CameraInternal cameraInternal, SurfaceRequest surfaceRequest) {
        this.f31122a = r1;
        this.f31123b = cameraInternal;
        this.f31124c = surfaceRequest;
    }

    /* renamed from: a */
    public final void mo39361a(SurfaceRequest.TransformationInfo transformationInfo) {
        this.f31122a.lambda$onSurfaceRequested$1(this.f31123b, this.f31124c, transformationInfo);
    }
}
