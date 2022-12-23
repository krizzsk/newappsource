package p145k5;

import com.appboy.Appboy;
import com.cubic.umo.Environment;
import com.cubic.umo.p045ad.C2218a;
import com.moovit.umo.ads.UmoAds;
import p061d7.C4402a;
import p196o7.C6009a;

/* renamed from: k5.l */
public final /* synthetic */ class C5493l implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f18030b;

    /* renamed from: c */
    public final /* synthetic */ Object f18031c;

    /* renamed from: d */
    public final /* synthetic */ Object f18032d;

    /* renamed from: e */
    public final /* synthetic */ Object f18033e;

    /* renamed from: f */
    public final /* synthetic */ Object f18034f;

    public /* synthetic */ C5493l(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f18030b = i;
        this.f18031c = obj;
        this.f18032d = obj2;
        this.f18033e = obj3;
        this.f18034f = obj4;
    }

    public final void run() {
        switch (this.f18030b) {
            case 0:
                ((Appboy) this.f18031c).m5392a((String) this.f18032d, (String) this.f18033e, (String) this.f18034f);
                return;
            default:
                UmoAds.C7869d dVar = (UmoAds.C7869d) this.f18031c;
                C2218a.C2219a.m5800a(dVar.f23818b, (Environment) this.f18032d, (C6009a) this.f18033e, (C4402a) this.f18034f, dVar);
                return;
        }
    }
}
