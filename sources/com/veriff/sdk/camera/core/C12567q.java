package com.veriff.sdk.camera.core;

import p695od.C18728c;

/* renamed from: com.veriff.sdk.camera.core.q */
public final /* synthetic */ class C12567q implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f31094b;

    /* renamed from: c */
    public final /* synthetic */ Object f31095c;

    public /* synthetic */ C12567q(Object obj, int i) {
        this.f31094b = i;
        this.f31095c = obj;
    }

    public final void run() {
        switch (this.f31094b) {
            case 0:
                ((ImageAnalysisNonBlockingAnalyzer) this.f31095c).analyzeCachedImage();
                return;
            case 1:
                ((ProcessingSurface) this.f31095c).release();
                return;
            default:
                ((C18728c) this.f31095c).cancel(true);
                return;
        }
    }
}
