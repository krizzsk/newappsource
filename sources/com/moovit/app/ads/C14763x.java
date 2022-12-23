package com.moovit.app.ads;

import com.google.android.gms.ads.AdView;
import com.moovit.MoovitActivity;
import com.moovit.MoovitApplication;
import java.util.Set;

/* renamed from: com.moovit.app.ads.x */
public final class C14763x extends C14749m {

    /* renamed from: i */
    public final /* synthetic */ MoovitAnchoredBannerAdFragment f37581i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14763x(MoovitAnchoredBannerAdFragment moovitAnchoredBannerAdFragment, MoovitApplication moovitApplication, MoovitActivity moovitActivity, boolean z, String str, AdView adView) {
        super(moovitApplication, moovitActivity, z, str, adView);
        this.f37581i = moovitAnchoredBannerAdFragment;
    }

    public final void onAdLoaded() {
        super.onAdLoaded();
        MoovitAnchoredBannerAdFragment moovitAnchoredBannerAdFragment = this.f37581i;
        Set<Class<? extends MoovitActivity>> set = MoovitAnchoredBannerAdFragment.f37478t;
        moovitAnchoredBannerAdFragment.mo44735t2();
    }
}
