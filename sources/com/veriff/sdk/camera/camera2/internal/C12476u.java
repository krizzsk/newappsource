package com.veriff.sdk.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.FocusMeteringAction;

/* renamed from: com.veriff.sdk.camera.camera2.internal.u */
public final /* synthetic */ class C12476u implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ FocusMeteringControl f31002b;

    /* renamed from: c */
    public final /* synthetic */ CallbackToFutureAdapter.C0673a f31003c;

    /* renamed from: d */
    public final /* synthetic */ FocusMeteringAction f31004d;

    public /* synthetic */ C12476u(CallbackToFutureAdapter.C0673a aVar, FocusMeteringControl focusMeteringControl, FocusMeteringAction focusMeteringAction) {
        this.f31002b = focusMeteringControl;
        this.f31003c = aVar;
        this.f31004d = focusMeteringAction;
    }

    public final void run() {
        this.f31002b.lambda$startFocusAndMetering$0(this.f31003c, this.f31004d);
    }
}
