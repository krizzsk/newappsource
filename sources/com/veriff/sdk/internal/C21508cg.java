package com.veriff.sdk.internal;

import android.net.NetworkInfo;
import com.veriff.sdk.internal.C21512ci;
import com.veriff.sdk.internal.C21529cn;
import com.veriff.sdk.internal.C22711xv;
import com.veriff.sdk.internal.C22752ys;
import java.io.IOException;

/* renamed from: com.veriff.sdk.internal.cg */
class C21508cg extends C21529cn {

    /* renamed from: a */
    private final C21496by f54104a;

    /* renamed from: b */
    private final C21532cp f54105b;

    /* renamed from: com.veriff.sdk.internal.cg$a */
    public static class C21509a extends IOException {
        public C21509a(String str) {
            super(str);
        }
    }

    /* renamed from: com.veriff.sdk.internal.cg$b */
    public static final class C21510b extends IOException {

        /* renamed from: a */
        public final int f54106a;

        /* renamed from: b */
        public final int f54107b;

        public C21510b(int i, int i2) {
            super(C16759e.m42349e("HTTP ", i));
            this.f54106a = i;
            this.f54107b = i2;
        }
    }

    public C21508cg(C21496by byVar, C21532cp cpVar) {
        this.f54104a = byVar;
        this.f54105b = cpVar;
    }

    /* renamed from: b */
    private static C22752ys m51409b(C21525cl clVar, int i) {
        C22711xv xvVar;
        if (i == 0) {
            xvVar = null;
        } else if (C21507cf.m51408c(i)) {
            xvVar = C22711xv.f57430b;
        } else {
            C22711xv.C22712a aVar = new C22711xv.C22712a();
            if (!C21507cf.m51406a(i)) {
                aVar.mo57181a();
            }
            if (!C21507cf.m51407b(i)) {
                aVar.mo57183b();
            }
            xvVar = aVar.mo57185d();
        }
        C22752ys.C22753a a = new C22752ys.C22753a().mo57406a(clVar.f54153d.toString());
        if (xvVar != null) {
            a.mo57401a(xvVar);
        }
        return a.mo57409a();
    }

    /* renamed from: a */
    public int mo54482a() {
        return 2;
    }

    /* renamed from: a */
    public boolean mo54408a(C21525cl clVar) {
        String scheme = clVar.f54153d.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    /* renamed from: b */
    public boolean mo54484b() {
        return true;
    }

    /* renamed from: a */
    public C21529cn.C21530a mo54407a(C21525cl clVar, int i) throws IOException {
        C22757yu a = this.f54104a.mo54466a(m51409b(clVar, i));
        C22759yv h = a.mo57424h();
        if (a.mo57420d()) {
            C21512ci.C21518d dVar = a.mo57427k() == null ? C21512ci.C21518d.NETWORK : C21512ci.C21518d.DISK;
            if (dVar == C21512ci.C21518d.DISK && h.mo54032b() == 0) {
                h.close();
                throw new C21509a("Received response with 0 content-length header.");
            }
            if (dVar == C21512ci.C21518d.NETWORK && h.mo54032b() > 0) {
                this.f54105b.mo54535a(h.mo54032b());
            }
            return new C21529cn.C21530a((aca) h.mo54033c(), dVar);
        }
        h.close();
        int c = a.mo57418c();
        clVar.getClass();
        throw new C21510b(c, 0);
    }

    /* renamed from: a */
    public boolean mo54483a(boolean z, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }
}
