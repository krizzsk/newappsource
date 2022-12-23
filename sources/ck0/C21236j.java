package ck0;

import ck0.C21237k;

/* renamed from: ck0.j */
public final class C21236j implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Throwable f53177b;

    /* renamed from: c */
    public final /* synthetic */ C21237k.C21238a.C21239a f53178c;

    public C21236j(C21237k.C21238a.C21239a aVar, Throwable th) {
        this.f53178c = aVar;
        this.f53177b = th;
    }

    public final void run() {
        this.f53178c.f53182a.onFailure(this.f53177b);
    }
}
