package com.veriff.sdk.camera.core;

import android.util.Size;
import com.veriff.sdk.camera.core.impl.ImageCaptureConfig;
import com.veriff.sdk.camera.core.impl.SessionConfig;

/* renamed from: com.veriff.sdk.camera.core.v */
public final /* synthetic */ class C12572v implements SessionConfig.ErrorListener {

    /* renamed from: a */
    public final /* synthetic */ ImageCapture f31102a;

    /* renamed from: b */
    public final /* synthetic */ String f31103b;

    /* renamed from: c */
    public final /* synthetic */ ImageCaptureConfig f31104c;

    /* renamed from: d */
    public final /* synthetic */ Size f31105d;

    public /* synthetic */ C12572v(ImageCapture imageCapture, String str, ImageCaptureConfig imageCaptureConfig, Size size) {
        this.f31102a = imageCapture;
        this.f31103b = str;
        this.f31104c = imageCaptureConfig;
        this.f31105d = size;
    }

    public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        this.f31102a.lambda$createPipeline$3(this.f31103b, this.f31104c, this.f31105d, sessionConfig, sessionError);
    }
}
