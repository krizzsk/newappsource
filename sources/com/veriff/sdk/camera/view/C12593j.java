package com.veriff.sdk.camera.view;

import com.veriff.sdk.camera.core.SurfaceRequest;
import com.veriff.sdk.camera.view.SurfaceViewImplementation;
import p229r1.C6231a;

/* renamed from: com.veriff.sdk.camera.view.j */
public final /* synthetic */ class C12593j implements C6231a {

    /* renamed from: a */
    public final /* synthetic */ SurfaceViewImplementation.SurfaceRequestCallback f31131a;

    public /* synthetic */ C12593j(SurfaceViewImplementation.SurfaceRequestCallback surfaceRequestCallback) {
        this.f31131a = surfaceRequestCallback;
    }

    public final void accept(Object obj) {
        this.f31131a.lambda$tryToComplete$0((SurfaceRequest.Result) obj);
    }
}
