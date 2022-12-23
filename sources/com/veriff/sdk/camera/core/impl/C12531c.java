package com.veriff.sdk.camera.core.impl;

import com.veriff.sdk.camera.core.impl.LiveDataObservable;

/* renamed from: com.veriff.sdk.camera.core.impl.c */
public final /* synthetic */ class C12531c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LiveDataObservable.LiveDataObserverAdapter f31064b;

    /* renamed from: c */
    public final /* synthetic */ LiveDataObservable.Result f31065c;

    public /* synthetic */ C12531c(LiveDataObservable.LiveDataObserverAdapter liveDataObserverAdapter, LiveDataObservable.Result result) {
        this.f31064b = liveDataObserverAdapter;
        this.f31065c = result;
    }

    public final void run() {
        this.f31064b.lambda$onChanged$0(this.f31065c);
    }
}
