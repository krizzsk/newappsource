package xc0;

import android.content.Context;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import java.util.Map;
import oc0.C12982b;
import oc0.C12987g;
import p092g3.C4752a;
import p584jl.C17885a;
import pc0.C13008c;
import yc0.C13312b;
import yc0.C13316d;
import zc0.C13379b;
import zc0.C13380c;

/* renamed from: xc0.c */
public final class C13255c extends C12987g {

    /* renamed from: e */
    public C4752a f32902e;

    public C13255c(C12982b bVar) {
        super(bVar);
        C4752a aVar = new C4752a(7, 0);
        this.f32902e = aVar;
        this.f32144a = new C13380c(aVar);
    }

    /* renamed from: a */
    public final void mo39873a(Context context, C13008c cVar, ScarRewardedAdHandler scarRewardedAdHandler) {
        C4752a aVar = this.f32902e;
        Context context2 = context;
        C13008c cVar2 = cVar;
        C17885a.m44461s0(new C13253b(this, new C13316d(context2, (C13379b) ((Map) aVar.f16037a).get(cVar.f32193a), cVar2, this.f32147d, scarRewardedAdHandler), cVar));
    }

    /* renamed from: b */
    public final void mo39874b(Context context, C13008c cVar, ScarInterstitialAdHandler scarInterstitialAdHandler) {
        C4752a aVar = this.f32902e;
        Context context2 = context;
        C13008c cVar2 = cVar;
        C17885a.m44461s0(new C13251a(this, new C13312b(context2, (C13379b) ((Map) aVar.f16037a).get(cVar.f32193a), cVar2, this.f32147d, scarInterstitialAdHandler), cVar));
    }
}
