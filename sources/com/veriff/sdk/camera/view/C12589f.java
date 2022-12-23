package com.veriff.sdk.camera.view;

import com.veriff.sdk.camera.core.impl.CameraInternal;
import com.veriff.sdk.camera.view.PreviewView;
import com.veriff.sdk.camera.view.PreviewViewImplementation;

/* renamed from: com.veriff.sdk.camera.view.f */
public final /* synthetic */ class C12589f implements PreviewViewImplementation.OnSurfaceNotInUseListener {

    /* renamed from: a */
    public final /* synthetic */ PreviewView.C125801 f31125a;

    /* renamed from: b */
    public final /* synthetic */ PreviewStreamStateObserver f31126b;

    /* renamed from: c */
    public final /* synthetic */ CameraInternal f31127c;

    public /* synthetic */ C12589f(PreviewView.C125801 r1, PreviewStreamStateObserver previewStreamStateObserver, CameraInternal cameraInternal) {
        this.f31125a = r1;
        this.f31126b = previewStreamStateObserver;
        this.f31127c = cameraInternal;
    }

    /* renamed from: a */
    public final void mo39362a() {
        this.f31125a.lambda$onSurfaceRequested$2(this.f31126b, this.f31127c);
    }
}
