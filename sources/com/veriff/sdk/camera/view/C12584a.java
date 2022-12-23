package com.veriff.sdk.camera.view;

import com.veriff.sdk.camera.core.impl.utils.futures.AsyncFunction;
import p695od.C18728c;

/* renamed from: com.veriff.sdk.camera.view.a */
public final /* synthetic */ class C12584a implements AsyncFunction {

    /* renamed from: a */
    public final /* synthetic */ PreviewStreamStateObserver f31115a;

    public /* synthetic */ C12584a(PreviewStreamStateObserver previewStreamStateObserver) {
        this.f31115a = previewStreamStateObserver;
    }

    public final C18728c apply(Object obj) {
        return this.f31115a.lambda$startPreviewStreamStateFlow$0((Void) obj);
    }
}
