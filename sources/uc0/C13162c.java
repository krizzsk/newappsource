package uc0;

import android.content.Context;
import com.google.android.material.internal.C14080o;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import java.util.Map;
import oc0.C12982b;
import oc0.C12987g;
import p584jl.C17885a;
import pc0.C13008c;
import vc0.C13203b;
import vc0.C13206d;
import wc0.C13235b;
import wc0.C13236c;

/* renamed from: uc0.c */
public final class C13162c extends C12987g {

    /* renamed from: e */
    public C14080o f32707e;

    public C13162c(C12982b bVar) {
        super(bVar);
        C14080o oVar = new C14080o(7);
        this.f32707e = oVar;
        this.f32144a = new C13236c(oVar);
    }

    /* renamed from: a */
    public final void mo39873a(Context context, C13008c cVar, ScarRewardedAdHandler scarRewardedAdHandler) {
        C14080o oVar = this.f32707e;
        C17885a.m44461s0(new C13160b(this, new C13206d(context, (C13235b) ((Map) oVar.f35108a).get(cVar.f32193a), cVar, this.f32147d), cVar));
    }

    /* renamed from: b */
    public final void mo39874b(Context context, C13008c cVar, ScarInterstitialAdHandler scarInterstitialAdHandler) {
        C14080o oVar = this.f32707e;
        Context context2 = context;
        C13008c cVar2 = cVar;
        C17885a.m44461s0(new C13158a(this, new C13203b(context2, (C13235b) ((Map) oVar.f35108a).get(cVar.f32193a), cVar2, this.f32147d, scarInterstitialAdHandler), cVar));
    }
}
