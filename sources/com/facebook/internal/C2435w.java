package com.facebook.internal;

import aa0.C7530f;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polyline;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import mf0.C24362h;
import p431cy.C16525b;
import p693nz.C18659h;
import p927xw.C20637f;

/* renamed from: com.facebook.internal.w */
public final /* synthetic */ class C2435w implements Callable {

    /* renamed from: b */
    public final /* synthetic */ int f8726b;

    /* renamed from: c */
    public final /* synthetic */ Object f8727c;

    /* renamed from: d */
    public final /* synthetic */ Object f8728d;

    public /* synthetic */ C2435w(int i, Object obj, Object obj2) {
        this.f8726b = i;
        this.f8727c = obj;
        this.f8728d = obj2;
    }

    public final Object call() {
        switch (this.f8726b) {
            case 0:
                C16525b bVar = (C16525b) this.f8727c;
                Callable callable = (Callable) this.f8728d;
                C24362h.m61211f(bVar, "this$0");
                C24362h.m61211f(callable, "$callable");
                try {
                    bVar.f43143a = callable.call();
                } finally {
                    CountDownLatch countDownLatch = (CountDownLatch) bVar.f43144b;
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                    }
                }
            default:
                C18659h<String, Polyline> hVar = C20637f.f52176u;
                return C7530f.m17268a((LatLonE6) this.f8727c, (LatLonE6) this.f8728d);
        }
    }
}
