package com.veriff.sdk.internal;

/* renamed from: com.veriff.sdk.internal.yz */
public abstract class C22764yz implements Runnable {

    /* renamed from: c */
    public final String f57692c;

    public C22764yz(String str, Object... objArr) {
        this.f57692c = C22766za.m55824a(str, objArr);
    }

    /* renamed from: d */
    public abstract void mo53714d();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f57692c);
        try {
            mo53714d();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
