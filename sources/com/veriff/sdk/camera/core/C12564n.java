package com.veriff.sdk.camera.core;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.ImageAnalysis;
import java.util.concurrent.Executor;

/* renamed from: com.veriff.sdk.camera.core.n */
public final /* synthetic */ class C12564n implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ ImageAnalysisAbstractAnalyzer f31085b;

    /* renamed from: c */
    public final /* synthetic */ Executor f31086c;

    /* renamed from: d */
    public final /* synthetic */ ImageProxy f31087d;

    /* renamed from: e */
    public final /* synthetic */ ImageAnalysis.Analyzer f31088e;

    public /* synthetic */ C12564n(ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer, Executor executor, ImageProxy imageProxy, ImageAnalysis.Analyzer analyzer) {
        this.f31085b = imageAnalysisAbstractAnalyzer;
        this.f31086c = executor;
        this.f31087d = imageProxy;
        this.f31088e = analyzer;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        return this.f31085b.lambda$analyzeImage$1(this.f31086c, this.f31087d, this.f31088e, aVar);
    }
}
