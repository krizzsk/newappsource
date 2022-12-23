package ck0;

import ck0.C21237k;
import java.io.IOException;

/* renamed from: ck0.i */
public final class C21235i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C21267r f53175b;

    /* renamed from: c */
    public final /* synthetic */ C21237k.C21238a.C21239a f53176c;

    public C21235i(C21237k.C21238a.C21239a aVar, C21267r rVar) {
        this.f53176c = aVar;
        this.f53175b = rVar;
    }

    public final void run() {
        if (C21237k.C21238a.this.f53181c.isCanceled()) {
            this.f53176c.f53182a.onFailure(new IOException("Canceled"));
        } else {
            this.f53176c.f53182a.mo53591a(this.f53175b);
        }
    }
}
