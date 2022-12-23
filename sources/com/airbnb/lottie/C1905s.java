package com.airbnb.lottie;

import java.util.ArrayList;
import java.util.Iterator;
import p107h5.C5055c;

/* renamed from: com.airbnb.lottie.s */
public final class C1905s implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C1906t f6705b;

    public C1905s(C1906t tVar) {
        this.f6705b = tVar;
    }

    public final void run() {
        if (this.f6705b.f6710d != null) {
            C1904r<T> rVar = this.f6705b.f6710d;
            V v = rVar.f6703a;
            if (v != null) {
                C1906t tVar = this.f6705b;
                synchronized (tVar) {
                    Iterator it = new ArrayList(tVar.f6707a).iterator();
                    while (it.hasNext()) {
                        ((C1899o) it.next()).onResult(v);
                    }
                }
                return;
            }
            C1906t tVar2 = this.f6705b;
            Throwable th = rVar.f6704b;
            synchronized (tVar2) {
                ArrayList arrayList = new ArrayList(tVar2.f6708b);
                if (arrayList.isEmpty()) {
                    C5055c.m12897c("Lottie encountered an error but no failure listener was added:", th);
                    return;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((C1899o) it2.next()).onResult(th);
                }
            }
        }
    }
}
