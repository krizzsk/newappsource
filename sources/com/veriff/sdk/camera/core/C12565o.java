package com.veriff.sdk.camera.core;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.ImageAnalysis;

/* renamed from: com.veriff.sdk.camera.core.o */
public final /* synthetic */ class C12565o implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ImageAnalysisAbstractAnalyzer f31089b;

    /* renamed from: c */
    public final /* synthetic */ ImageProxy f31090c;

    /* renamed from: d */
    public final /* synthetic */ ImageAnalysis.Analyzer f31091d;

    /* renamed from: e */
    public final /* synthetic */ CallbackToFutureAdapter.C0673a f31092e;

    public /* synthetic */ C12565o(ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer, ImageProxy imageProxy, ImageAnalysis.Analyzer analyzer, CallbackToFutureAdapter.C0673a aVar) {
        this.f31089b = imageAnalysisAbstractAnalyzer;
        this.f31090c = imageProxy;
        this.f31091d = analyzer;
        this.f31092e = aVar;
    }

    public final void run() {
        this.f31089b.lambda$analyzeImage$0(this.f31090c, this.f31091d, this.f31092e);
    }
}
