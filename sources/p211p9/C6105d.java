package p211p9;

import com.google.ads.mediation.vungle.C3852a;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.vungle.warren.Vungle;

/* renamed from: p9.d */
public final class C6105d implements C3852a.C3855c {

    /* renamed from: a */
    public final /* synthetic */ C6106e f19374a;

    public C6105d(C6106e eVar) {
        this.f19374a = eVar;
    }

    /* renamed from: a */
    public final void mo15744a(AdError adError) {
        String str = VungleMediationAdapter.TAG;
        adError.getMessage();
        this.f19374a.f19375a.onFailure(adError);
    }

    /* renamed from: b */
    public final void mo15745b() {
        Vungle.setIncentivizedFields(this.f19374a.f19380f, (String) null, (String) null, (String) null, (String) null);
        C6106e eVar = this.f19374a;
        if (Vungle.canPlayAd(eVar.f19378d, eVar.f19379e)) {
            C6106e eVar2 = this.f19374a;
            eVar2.f19376b = eVar2.f19375a.onSuccess(eVar2);
            return;
        }
        C6106e eVar3 = this.f19374a;
        Vungle.loadAd(eVar3.f19378d, eVar3.f19379e, eVar3.f19377c, eVar3);
    }
}
