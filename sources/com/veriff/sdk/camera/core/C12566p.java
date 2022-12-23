package com.veriff.sdk.camera.core;

import com.veriff.sdk.camera.core.ForwardingImageProxy;
import com.veriff.sdk.camera.core.ImageAnalysisNonBlockingAnalyzer;

/* renamed from: com.veriff.sdk.camera.core.p */
public final /* synthetic */ class C12566p implements ForwardingImageProxy.OnImageCloseListener {

    /* renamed from: a */
    public final /* synthetic */ ImageAnalysisNonBlockingAnalyzer.CacheAnalyzingImageProxy f31093a;

    public /* synthetic */ C12566p(ImageAnalysisNonBlockingAnalyzer.CacheAnalyzingImageProxy cacheAnalyzingImageProxy) {
        this.f31093a = cacheAnalyzingImageProxy;
    }

    public final void onImageClose(ImageProxy imageProxy) {
        this.f31093a.lambda$new$0(imageProxy);
    }
}
