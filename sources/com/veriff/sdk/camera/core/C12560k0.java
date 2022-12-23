package com.veriff.sdk.camera.core;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.veriff.sdk.camera.core.k0 */
public final /* synthetic */ class C12560k0 implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f31075b;

    /* renamed from: c */
    public final /* synthetic */ String f31076c;

    public /* synthetic */ C12560k0(AtomicReference atomicReference, String str) {
        this.f31075b = atomicReference;
        this.f31076c = str;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        return this.f31075b.set(aVar);
    }
}
