package rc0;

import android.content.Context;
import com.google.android.play.core.assetpacks.C14291m0;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import java.util.Map;
import oc0.C12982b;
import oc0.C12987g;
import p584jl.C17885a;
import pc0.C13008c;
import sc0.C13107b;
import sc0.C13110d;
import tc0.C13133b;
import tc0.C13134c;

/* renamed from: rc0.c */
public final class C13061c extends C12987g {

    /* renamed from: e */
    public C14291m0 f32312e;

    public C13061c(C12982b bVar) {
        super(bVar);
        C14291m0 m0Var = new C14291m0(6);
        this.f32312e = m0Var;
        this.f32144a = new C13134c(m0Var);
    }

    /* renamed from: a */
    public final void mo39873a(Context context, C13008c cVar, ScarRewardedAdHandler scarRewardedAdHandler) {
        C14291m0 m0Var = this.f32312e;
        C17885a.m44461s0(new C13059b(this, new C13110d(context, (C13133b) ((Map) m0Var.f35949b).get(cVar.f32193a), cVar, this.f32147d), cVar));
    }

    /* renamed from: b */
    public final void mo39874b(Context context, C13008c cVar, ScarInterstitialAdHandler scarInterstitialAdHandler) {
        C14291m0 m0Var = this.f32312e;
        Context context2 = context;
        C13008c cVar2 = cVar;
        C17885a.m44461s0(new C13057a(this, new C13107b(context2, (C13133b) ((Map) m0Var.f35949b).get(cVar.f32193a), cVar2, this.f32147d, scarInterstitialAdHandler), cVar));
    }
}
