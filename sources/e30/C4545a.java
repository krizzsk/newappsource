package e30;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.usebutton.sdk.internal.api.AppActionRequest;
import mf0.C24362h;
import p977zz.C20927a0;

/* renamed from: e30.a */
public final class C4545a implements MediationInterstitialAd {

    /* renamed from: a */
    public final Intent f15661a;

    public C4545a(Intent intent) {
        C24362h.m61211f(intent, "intent");
        this.f15661a = intent;
    }

    public final void showAd(Context context) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C20927a0.m49017l(context, this.f15661a);
    }
}
