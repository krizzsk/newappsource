package sc0;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import oc0.C12981a;
import oc0.C12982b;
import pc0.C13007b;
import pc0.C13008c;
import tc0.C13133b;

/* renamed from: sc0.d */
public final class C13110d extends C13106a {

    /* renamed from: e */
    public RewardedAd f32566e;

    /* renamed from: f */
    public C13111e f32567f = new C13111e();

    public C13110d(Context context, C13133b bVar, C13008c cVar, C12982b bVar2) {
        super(context, cVar, bVar, bVar2);
        this.f32566e = new RewardedAd(context, cVar.f32195c);
    }

    /* renamed from: a */
    public final void mo39895a(Activity activity) {
        if (this.f32566e.isLoaded()) {
            this.f32566e.show(activity, this.f32567f.f32569b);
        } else {
            this.f32559d.handleError(C12981a.m32861a(this.f32557b));
        }
    }

    /* renamed from: c */
    public final void mo40010c(AdRequest adRequest, C13007b bVar) {
        this.f32567f.getClass();
        this.f32566e.loadAd(adRequest, this.f32567f.f32568a);
    }
}
