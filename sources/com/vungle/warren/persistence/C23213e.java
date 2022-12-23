package com.vungle.warren.persistence;

import com.vungle.warren.persistence.C23192a;

/* renamed from: com.vungle.warren.persistence.e */
public final class C23213e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C23192a.C23207n f58917b;

    public C23213e(C23192a.C23207n nVar, Exception exc) {
        this.f58917b = nVar;
    }

    public final void run() {
        this.f58917b.onError();
    }
}
