package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.d */
public final class C13978d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ long f34689b;

    /* renamed from: c */
    public final /* synthetic */ C13980e f34690c;

    public C13978d(C13980e eVar, long j) {
        this.f34690c = eVar;
        this.f34689b = j;
    }

    public final void run() {
        C13980e eVar = this.f34690c;
        eVar.f34692b.setError(String.format(eVar.f34695e, new Object[]{C13982f.m34902a(this.f34689b)}));
        this.f34690c.mo41552a();
    }
}
