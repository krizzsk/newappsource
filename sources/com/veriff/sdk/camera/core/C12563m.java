package com.veriff.sdk.camera.core;

import android.util.Size;
import com.veriff.sdk.camera.core.impl.ImageAnalysisConfig;
import com.veriff.sdk.camera.core.impl.SessionConfig;

/* renamed from: com.veriff.sdk.camera.core.m */
public final /* synthetic */ class C12563m implements SessionConfig.ErrorListener {

    /* renamed from: a */
    public final /* synthetic */ ImageAnalysis f31081a;

    /* renamed from: b */
    public final /* synthetic */ String f31082b;

    /* renamed from: c */
    public final /* synthetic */ ImageAnalysisConfig f31083c;

    /* renamed from: d */
    public final /* synthetic */ Size f31084d;

    public /* synthetic */ C12563m(ImageAnalysis imageAnalysis, String str, ImageAnalysisConfig imageAnalysisConfig, Size size) {
        this.f31081a = imageAnalysis;
        this.f31082b = str;
        this.f31083c = imageAnalysisConfig;
        this.f31084d = size;
    }

    public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        this.f31081a.lambda$createPipeline$0(this.f31082b, this.f31083c, this.f31084d, sessionConfig, sessionError);
    }
}
