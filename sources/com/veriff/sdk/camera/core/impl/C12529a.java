package com.veriff.sdk.camera.core.impl;

import com.veriff.sdk.camera.core.impl.LiveDataObservable;

/* renamed from: com.veriff.sdk.camera.core.impl.a */
public final /* synthetic */ class C12529a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LiveDataObservable f31059b;

    /* renamed from: c */
    public final /* synthetic */ LiveDataObservable.LiveDataObserverAdapter f31060c;

    /* renamed from: d */
    public final /* synthetic */ LiveDataObservable.LiveDataObserverAdapter f31061d;

    public /* synthetic */ C12529a(LiveDataObservable liveDataObservable, LiveDataObservable.LiveDataObserverAdapter liveDataObserverAdapter, LiveDataObservable.LiveDataObserverAdapter liveDataObserverAdapter2) {
        this.f31059b = liveDataObservable;
        this.f31060c = liveDataObserverAdapter;
        this.f31061d = liveDataObserverAdapter2;
    }

    public final void run() {
        this.f31059b.lambda$addObserver$2(this.f31060c, this.f31061d);
    }
}
