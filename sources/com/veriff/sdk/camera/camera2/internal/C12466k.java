package com.veriff.sdk.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.UseCase;

/* renamed from: com.veriff.sdk.camera.camera2.internal.k */
public final /* synthetic */ class C12466k implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f30981b;

    /* renamed from: c */
    public final /* synthetic */ Object f30982c;

    /* renamed from: d */
    public final /* synthetic */ Object f30983d;

    public /* synthetic */ C12466k(int i, Object obj, Object obj2) {
        this.f30981b = i;
        this.f30982c = obj;
        this.f30983d = obj2;
    }

    public final void run() {
        switch (this.f30981b) {
            case 0:
                ((Camera2CameraImpl) this.f30982c).lambda$onUseCaseReset$8((UseCase) this.f30983d);
                return;
            default:
                ((Camera2CameraControlImpl) this.f30982c).lambda$triggerAf$3((CallbackToFutureAdapter.C0673a) this.f30983d);
                return;
        }
    }
}
