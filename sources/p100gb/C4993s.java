package p100gb;

import com.cubic.umo.p045ad.ext.types.UMOAdKitBannerAdEvent;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.moovit.umo.ads.UmoAds;
import mf0.C24362h;
import p039c7.C1798a;
import p100gb.C4995u;

/* renamed from: gb.s */
public final /* synthetic */ class C4993s implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f16875b;

    /* renamed from: c */
    public final /* synthetic */ Object f16876c;

    /* renamed from: d */
    public final /* synthetic */ Object f16877d;

    /* renamed from: e */
    public final /* synthetic */ Object f16878e;

    /* renamed from: f */
    public final /* synthetic */ Object f16879f;

    public /* synthetic */ C4993s(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f16875b = i;
        this.f16876c = obj;
        this.f16877d = obj2;
        this.f16878e = obj3;
        this.f16879f = obj4;
    }

    public final void run() {
        switch (this.f16875b) {
            case 0:
                C4995u.C4996a aVar = (C4995u.C4996a) this.f16876c;
                ((C4995u) this.f16877d).mo20592r(aVar.f16885a, aVar.f16886b, (C4978i) this.f16878e, (C4983l) this.f16879f);
                return;
            default:
                C1798a aVar2 = (C1798a) this.f16876c;
                UMOAdKitBannerAdEvent uMOAdKitBannerAdEvent = (UMOAdKitBannerAdEvent) this.f16878e;
                UMOAdKitError uMOAdKitError = (UMOAdKitError) this.f16879f;
                C24362h.m61211f(aVar2, "$bannerAdListener");
                C24362h.m61211f(uMOAdKitBannerAdEvent, "$bannerAdEvent");
                C24362h.m61211f(uMOAdKitError, "$adError");
                ((UmoAds.C7867b) aVar2).mo24509a(uMOAdKitBannerAdEvent, uMOAdKitError);
                return;
        }
    }
}
