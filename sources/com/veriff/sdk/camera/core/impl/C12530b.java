package com.veriff.sdk.camera.core.impl;

import com.veriff.sdk.camera.core.impl.LiveDataObservable;

/* renamed from: com.veriff.sdk.camera.core.impl.b */
public final /* synthetic */ class C12530b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LiveDataObservable f31062b;

    /* renamed from: c */
    public final /* synthetic */ LiveDataObservable.LiveDataObserverAdapter f31063c;

    public /* synthetic */ C12530b(LiveDataObservable liveDataObservable, LiveDataObservable.LiveDataObserverAdapter liveDataObserverAdapter) {
        this.f31062b = liveDataObservable;
        this.f31063c = liveDataObserverAdapter;
    }

    public final void run() {
        this.f31062b.lambda$removeObserver$3(this.f31063c);
    }
}
