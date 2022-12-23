package p211p9;

import com.google.ads.mediation.vungle.C3852a;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.vungle.warren.Vungle;

/* renamed from: p9.a */
public final class C6101a implements C3852a.C3855c {

    /* renamed from: a */
    public final /* synthetic */ C6103c f19366a;

    public C6101a(C6103c cVar) {
        this.f19366a = cVar;
    }

    /* renamed from: a */
    public final void mo15744a(AdError adError) {
        String str = VungleMediationAdapter.TAG;
        adError.getMessage();
        this.f19366a.f19368a.onFailure(adError);
    }

    /* renamed from: b */
    public final void mo15745b() {
        C6103c cVar = this.f19366a;
        if (Vungle.canPlayAd(cVar.f19371d, cVar.f19372e)) {
            cVar.f19369b = cVar.f19368a.onSuccess(cVar);
        } else {
            Vungle.loadAd(cVar.f19371d, cVar.f19372e, cVar.f19370c, new C6102b(cVar));
        }
    }
}
