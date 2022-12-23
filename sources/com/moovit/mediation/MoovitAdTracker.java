package com.moovit.mediation;

import android.content.Context;
import androidx.lifecycle.C1006f;
import androidx.lifecycle.C1033p;
import com.google.android.gms.ads.mediation.MediationAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.moovit.ads.AdListener;
import com.usebutton.sdk.internal.api.AppActionRequest;
import gk0.C23438a;
import java.util.HashMap;
import kotlin.Metadata;
import mf0.C24362h;
import p130j2.C5367a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/moovit/mediation/MoovitAdTracker;", "Lcom/moovit/ads/AdListener;", "", "a", "AdsMediation_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class MoovitAdTracker extends AdListener implements C1006f {

    /* renamed from: e */
    public static final C4112a f14791e = new C4112a();

    /* renamed from: f */
    public static volatile MoovitAdTracker f14792f;

    /* renamed from: c */
    public final Context f14793c;

    /* renamed from: d */
    public final HashMap<String, MediationAdCallback> f14794d = new HashMap<>();

    /* renamed from: com.moovit.mediation.MoovitAdTracker$a */
    public static final class C4112a {
        /* renamed from: a */
        public final MoovitAdTracker mo19373a(Context context) {
            C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
            MoovitAdTracker moovitAdTracker = MoovitAdTracker.f14792f;
            if (moovitAdTracker == null) {
                synchronized (this) {
                    moovitAdTracker = MoovitAdTracker.f14792f;
                    if (moovitAdTracker == null) {
                        moovitAdTracker = new MoovitAdTracker(context);
                        MoovitAdTracker.f14792f = moovitAdTracker;
                    }
                }
            }
            return moovitAdTracker;
        }
    }

    public MoovitAdTracker(Context context) {
        Context applicationContext = context.getApplicationContext();
        C24362h.m61210e(applicationContext, "context.applicationContext");
        this.f14793c = applicationContext;
    }

    /* renamed from: a */
    public final void mo19369a(String str) {
        C23438a.f59213a.getClass();
        MediationAdCallback mediationAdCallback = this.f14794d.get(str);
        if (mediationAdCallback instanceof MediationBannerAdCallback) {
            MediationBannerAdCallback mediationBannerAdCallback = (MediationBannerAdCallback) mediationAdCallback;
            mediationBannerAdCallback.reportAdClicked();
            mediationBannerAdCallback.onAdOpened();
            mediationBannerAdCallback.onAdLeftApplication();
        } else if (mediationAdCallback instanceof MediationInterstitialAdCallback) {
            MediationInterstitialAdCallback mediationInterstitialAdCallback = (MediationInterstitialAdCallback) mediationAdCallback;
            mediationInterstitialAdCallback.reportAdClicked();
            mediationInterstitialAdCallback.onAdLeftApplication();
        }
    }

    /* renamed from: c */
    public final void mo19370c(String str) {
        C23438a.f59213a.getClass();
        MediationAdCallback mediationAdCallback = this.f14794d.get(str);
        if (mediationAdCallback instanceof MediationInterstitialAdCallback) {
            ((MediationInterstitialAdCallback) mediationAdCallback).onAdClosed();
        }
    }

    /* renamed from: d */
    public final void mo19371d(String str) {
        C23438a.f59213a.getClass();
        MediationAdCallback mediationAdCallback = this.f14794d.get(str);
        if (mediationAdCallback != null) {
            mediationAdCallback.reportAdImpression();
        }
    }

    /* renamed from: e */
    public final void mo3607e(C1033p pVar) {
        C23438a.f59213a.getClass();
        AdListener.m37005h(this, this.f14793c, (String) null, 6);
    }

    /* renamed from: g */
    public final void mo19372g(String str) {
        C23438a.f59213a.getClass();
        MediationAdCallback mediationAdCallback = this.f14794d.get(str);
        if (mediationAdCallback instanceof MediationInterstitialAdCallback) {
            ((MediationInterstitialAdCallback) mediationAdCallback).onAdOpened();
        }
    }

    public final void onDestroy(C1033p pVar) {
        C23438a.f59213a.getClass();
        Context context = this.f14793c;
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C5367a.m13473a(context).mo21148d(this);
    }

    public final /* synthetic */ void onPause(C1033p pVar) {
    }

    public final /* synthetic */ void onResume(C1033p pVar) {
    }

    public final /* synthetic */ void onStart(C1033p pVar) {
    }

    public final /* synthetic */ void onStop(C1033p pVar) {
    }
}
