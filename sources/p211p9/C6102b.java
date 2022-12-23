package p211p9;

import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.vungle.warren.C23258z;
import com.vungle.warren.error.VungleException;

/* renamed from: p9.b */
public final class C6102b implements C23258z {

    /* renamed from: a */
    public final /* synthetic */ C6103c f19367a;

    public C6102b(C6103c cVar) {
        this.f19367a = cVar;
    }

    public final void onAdLoad(String str) {
        C6103c cVar = this.f19367a;
        cVar.f19369b = cVar.f19368a.onSuccess(cVar);
    }

    public final void onError(String str, VungleException vungleException) {
        AdError adError = VungleMediationAdapter.getAdError(vungleException);
        String str2 = VungleMediationAdapter.TAG;
        adError.getMessage();
        this.f19367a.f19368a.onFailure(adError);
    }
}
