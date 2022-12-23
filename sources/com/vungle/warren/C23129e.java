package com.vungle.warren;

import com.vungle.warren.C23097c;
import com.vungle.warren.error.VungleException;
import java.io.IOException;
import java.net.UnknownHostException;

/* renamed from: com.vungle.warren.e */
public final class C23129e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Throwable f58721b;

    /* renamed from: c */
    public final /* synthetic */ C23097c.C23101d f58722c;

    public C23129e(C23097c.C23101d dVar, Throwable th) {
        this.f58722c = dVar;
        this.f58721b = th;
    }

    public final void run() {
        VungleException vungleException;
        C23097c cVar = C23097c.this;
        Throwable th = this.f58721b;
        int i = C23097c.f58614q;
        cVar.getClass();
        if (th instanceof UnknownHostException) {
            vungleException = new VungleException(11);
        } else if (th instanceof IOException) {
            vungleException = new VungleException(20);
        } else {
            vungleException = new VungleException(11);
        }
        cVar.mo58110q(vungleException, this.f58722c.f58636a.f58643a, (String) null);
    }
}
