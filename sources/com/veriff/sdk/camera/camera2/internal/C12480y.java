package com.veriff.sdk.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.FocusMeteringAction;

/* renamed from: com.veriff.sdk.camera.camera2.internal.y */
public final /* synthetic */ class C12480y implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ FocusMeteringControl f31012b;

    /* renamed from: c */
    public final /* synthetic */ FocusMeteringAction f31013c;

    public /* synthetic */ C12480y(FocusMeteringControl focusMeteringControl, FocusMeteringAction focusMeteringAction) {
        this.f31012b = focusMeteringControl;
        this.f31013c = focusMeteringAction;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        return this.f31012b.lambda$startFocusAndMetering$1(this.f31013c, aVar);
    }
}
