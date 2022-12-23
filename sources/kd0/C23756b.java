package kd0;

import com.google.ads.mediation.vungle.C3852a;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.vungle.warren.C23170k;
import com.vungle.warren.C23179n;

/* renamed from: kd0.b */
public final class C23756b implements C3852a.C3855c {

    /* renamed from: a */
    public final /* synthetic */ C23757c f60013a;

    public C23756b(C23757c cVar) {
        this.f60013a = cVar;
    }

    /* renamed from: a */
    public final void mo15744a(AdError adError) {
        C23757c cVar = this.f60013a;
        cVar.f60021h.mo59003c(cVar.f60014a, cVar.f60019f);
        C23757c cVar2 = this.f60013a;
        if (cVar2.f60022i && cVar2.f60017d != null && cVar2.f60018e != null) {
            String str = VungleMediationAdapter.TAG;
            adError.getMessage();
            C23757c cVar3 = this.f60013a;
            cVar3.f60018e.onAdFailedToLoad(cVar3.f60017d, adError);
        }
    }

    /* renamed from: b */
    public final void mo15745b() {
        C23757c cVar = this.f60013a;
        cVar.getClass();
        String str = VungleMediationAdapter.TAG;
        cVar.toString();
        C23179n.m57203a(cVar.f60014a, new C23170k(cVar.f60015b), cVar.f60024k);
    }
}
