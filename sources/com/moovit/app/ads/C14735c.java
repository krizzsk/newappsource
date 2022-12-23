package com.moovit.app.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.moovit.MoovitActivity;
import com.moovit.MoovitApplication;
import p921xq.C20554a;
import p921xq.C20556b;
import p921xq.C20557c;
import p921xq.C20558d;

/* renamed from: com.moovit.app.ads.c */
public final class C14735c implements C20554a.C20555a<MoovitActivity, Boolean> {
    /* renamed from: a */
    public final Boolean mo44726a(MoovitApplication moovitApplication, C20556b bVar, Object obj) {
        MoovitActivity moovitActivity = (MoovitActivity) obj;
        AppOpenAd appOpenAd = (AppOpenAd) bVar.f51994f;
        appOpenAd.setFullScreenContentCallback(new C14736d(moovitApplication, moovitActivity, bVar));
        appOpenAd.show(moovitActivity);
        return Boolean.TRUE;
    }

    /* renamed from: b */
    public final Boolean mo44727b(C20558d dVar, Object obj) {
        MoovitActivity moovitActivity = (MoovitActivity) obj;
        return Boolean.FALSE;
    }

    /* renamed from: c */
    public final Boolean mo44728c(MoovitApplication moovitApplication, C20557c cVar, Object obj) {
        MoovitActivity moovitActivity = (MoovitActivity) obj;
        InterstitialAd interstitialAd = (InterstitialAd) cVar.f51994f;
        interstitialAd.setFullScreenContentCallback(new C14736d(moovitApplication, moovitActivity, cVar));
        interstitialAd.show(moovitActivity);
        return Boolean.TRUE;
    }
}
