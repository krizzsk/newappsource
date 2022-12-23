package com.veriff.sdk.camera.view;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.CameraInfo;
import java.util.List;

/* renamed from: com.veriff.sdk.camera.view.c */
public final /* synthetic */ class C12586c implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ PreviewStreamStateObserver f31117b;

    /* renamed from: c */
    public final /* synthetic */ CameraInfo f31118c;

    /* renamed from: d */
    public final /* synthetic */ List f31119d;

    public /* synthetic */ C12586c(PreviewStreamStateObserver previewStreamStateObserver, List list, CameraInfo cameraInfo) {
        this.f31117b = previewStreamStateObserver;
        this.f31118c = cameraInfo;
        this.f31119d = list;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        return this.f31117b.lambda$waitForCaptureResult$2(this.f31118c, this.f31119d, aVar);
    }
}
