package com.veriff.sdk.internal;

import com.veriff.sdk.camera.core.ImageAnalysis;
import com.veriff.sdk.camera.core.ImageProxy;
import kotlin.Metadata;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.mh */
final class C22015mh implements ImageAnalysis.Analyzer {

    /* renamed from: a */
    private final /* synthetic */ C24236l f55555a;

    public C22015mh(C24236l lVar) {
        this.f55555a = lVar;
    }

    public final /* synthetic */ void analyze(ImageProxy imageProxy) {
        C24362h.m61211f(imageProxy, "p0");
        C24362h.m61210e(this.f55555a.invoke(imageProxy), "invoke(...)");
    }
}
