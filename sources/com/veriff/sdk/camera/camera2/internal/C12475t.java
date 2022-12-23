package com.veriff.sdk.camera.camera2.internal;

import java.util.LinkedHashSet;

/* renamed from: com.veriff.sdk.camera.camera2.internal.t */
public final /* synthetic */ class C12475t implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f31000b;

    /* renamed from: c */
    public final /* synthetic */ Object f31001c;

    public /* synthetic */ C12475t(Object obj, int i) {
        this.f31000b = i;
        this.f31001c = obj;
    }

    public final void run() {
        switch (this.f31000b) {
            case 0:
                CaptureSessionRepository.forceOnClosed((LinkedHashSet) this.f31001c);
                return;
            default:
                ((SynchronizedCaptureSessionBaseImpl) this.f31001c).lambda$close$2();
                return;
        }
    }
}
