package com.veriff.sdk.camera.core;

import com.veriff.sdk.camera.core.ImageAnalysis;

/* renamed from: com.veriff.sdk.camera.core.k */
public final /* synthetic */ class C12559k implements ImageAnalysis.Analyzer {

    /* renamed from: a */
    public final /* synthetic */ ImageAnalysis f31073a;

    /* renamed from: b */
    public final /* synthetic */ ImageAnalysis.Analyzer f31074b;

    public /* synthetic */ C12559k(ImageAnalysis imageAnalysis, ImageAnalysis.Analyzer analyzer) {
        this.f31073a = imageAnalysis;
        this.f31074b = analyzer;
    }

    public final void analyze(ImageProxy imageProxy) {
        this.f31073a.lambda$setAnalyzer$1(this.f31074b, imageProxy);
    }
}
