package vc0;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import oc0.C12981a;
import oc0.C12982b;
import pc0.C13007b;
import pc0.C13008c;
import wc0.C13235b;

/* renamed from: vc0.d */
public final class C13206d extends C13202a {

    /* renamed from: e */
    public RewardedAd f32778e;

    /* renamed from: f */
    public C13207e f32779f = new C13207e();

    public C13206d(Context context, C13235b bVar, C13008c cVar, C12982b bVar2) {
        super(context, cVar, bVar, bVar2);
        this.f32778e = new RewardedAd(context, cVar.f32195c);
    }

    /* renamed from: a */
    public final void mo39895a(Activity activity) {
        if (this.f32778e.isLoaded()) {
            this.f32778e.show(activity, this.f32779f.f32781b);
        } else {
            this.f32771d.handleError(C12981a.m32861a(this.f32769b));
        }
    }

    /* renamed from: c */
    public final void mo40083c(AdRequest adRequest, C13007b bVar) {
        this.f32779f.getClass();
        this.f32778e.loadAd(adRequest, this.f32779f.f32780a);
    }
}
