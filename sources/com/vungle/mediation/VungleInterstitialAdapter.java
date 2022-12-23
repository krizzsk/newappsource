package com.vungle.mediation;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Keep;
import com.google.ads.mediation.vungle.C3852a;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.vungle.mediation.C23060a;
import com.vungle.warren.AdConfig;
import com.vungle.warren.C23135f0;
import com.vungle.warren.C23231u1;
import com.vungle.warren.C23258z;
import com.vungle.warren.Vungle;
import com.vungle.warren.error.VungleException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import kd0.C23755a;
import kd0.C23756b;
import kd0.C23757c;
import kd0.C23759d;
import p198o9.C6012a;
import p584jl.C17885a;

@Keep
public class VungleInterstitialAdapter implements MediationInterstitialAdapter, MediationBannerAdapter {
    private AdConfig mAdConfig;
    private MediationBannerListener mMediationBannerListener;
    /* access modifiers changed from: private */
    public MediationInterstitialListener mMediationInterstitialListener;
    private String mPlacement;
    private C23759d mVungleManager;
    private C23757c vungleBannerAdapter;

    /* renamed from: com.vungle.mediation.VungleInterstitialAdapter$a */
    public class C23057a implements C3852a.C3855c {
        public C23057a() {
        }

        /* renamed from: a */
        public final void mo15744a(AdError adError) {
            if (VungleInterstitialAdapter.this.mMediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mMediationInterstitialListener.onAdFailedToLoad((MediationInterstitialAdapter) VungleInterstitialAdapter.this, adError);
                String str = VungleMediationAdapter.TAG;
                adError.getMessage();
            }
        }

        /* renamed from: b */
        public final void mo15745b() {
            VungleInterstitialAdapter.this.loadAd();
        }
    }

    /* renamed from: com.vungle.mediation.VungleInterstitialAdapter$b */
    public class C23058b implements C23258z {
        public C23058b() {
        }

        public final void onAdLoad(String str) {
            if (VungleInterstitialAdapter.this.mMediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mMediationInterstitialListener.onAdLoaded(VungleInterstitialAdapter.this);
            }
        }

        public final void onError(String str, VungleException vungleException) {
            AdError adError = VungleMediationAdapter.getAdError(vungleException);
            String str2 = VungleMediationAdapter.TAG;
            adError.getMessage();
            if (VungleInterstitialAdapter.this.mMediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mMediationInterstitialListener.onAdFailedToLoad((MediationInterstitialAdapter) VungleInterstitialAdapter.this, adError);
            }
        }
    }

    /* renamed from: com.vungle.mediation.VungleInterstitialAdapter$c */
    public class C23059c implements C23135f0 {
        public C23059c() {
        }

        public final void creativeId(String str) {
        }

        public final void onAdClick(String str) {
            if (VungleInterstitialAdapter.this.mMediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mMediationInterstitialListener.onAdClicked(VungleInterstitialAdapter.this);
            }
        }

        public final void onAdEnd(String str) {
            if (VungleInterstitialAdapter.this.mMediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mMediationInterstitialListener.onAdClosed(VungleInterstitialAdapter.this);
            }
        }

        public final void onAdEnd(String str, boolean z, boolean z2) {
        }

        public final void onAdLeftApplication(String str) {
            if (VungleInterstitialAdapter.this.mMediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mMediationInterstitialListener.onAdLeftApplication(VungleInterstitialAdapter.this);
            }
        }

        public final void onAdRewarded(String str) {
        }

        public final void onAdStart(String str) {
            if (VungleInterstitialAdapter.this.mMediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mMediationInterstitialListener.onAdOpened(VungleInterstitialAdapter.this);
            }
        }

        public final void onAdViewed(String str) {
        }

        public final void onError(String str, VungleException vungleException) {
            AdError adError = VungleMediationAdapter.getAdError(vungleException);
            String str2 = VungleMediationAdapter.TAG;
            adError.getMessage();
            if (VungleInterstitialAdapter.this.mMediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mMediationInterstitialListener.onAdClosed(VungleInterstitialAdapter.this);
            }
        }
    }

    /* access modifiers changed from: private */
    public void loadAd() {
        if (Vungle.canPlayAd(this.mPlacement)) {
            MediationInterstitialListener mediationInterstitialListener = this.mMediationInterstitialListener;
            if (mediationInterstitialListener != null) {
                mediationInterstitialListener.onAdLoaded(this);
                return;
            }
            return;
        }
        Vungle.loadAd(this.mPlacement, new C23058b());
    }

    public View getBannerView() {
        String str = VungleMediationAdapter.TAG;
        hashCode();
        return this.vungleBannerAdapter.f60020g;
    }

    public void onDestroy() {
        String str = VungleMediationAdapter.TAG;
        hashCode();
        C23757c cVar = this.vungleBannerAdapter;
        if (cVar != null) {
            cVar.toString();
            cVar.f60023j = false;
            cVar.f60021h.mo59003c(cVar.f60014a, cVar.f60019f);
            C6012a aVar = cVar.f60019f;
            if (aVar != null) {
                aVar.mo22016a();
                C6012a aVar2 = cVar.f60019f;
                C23231u1 u1Var = aVar2.f19211b;
                if (u1Var != null) {
                    u1Var.hashCode();
                    C23231u1 u1Var2 = aVar2.f19211b;
                    u1Var2.mo58322a(true);
                    u1Var2.f58957e = true;
                    u1Var2.f58961i = null;
                    aVar2.f19211b = null;
                }
            }
            cVar.f60019f = null;
            cVar.f60022i = false;
            this.vungleBannerAdapter = null;
        }
    }

    public void onPause() {
        C6012a aVar;
        String str = VungleMediationAdapter.TAG;
        C23757c cVar = this.vungleBannerAdapter;
        if (cVar != null && (aVar = cVar.f60019f) != null) {
            cVar.f60023j = false;
            C23231u1 u1Var = aVar.f19211b;
            if (u1Var != null) {
                u1Var.setAdVisibility(false);
            }
        }
    }

    public void onResume() {
        C6012a aVar;
        String str = VungleMediationAdapter.TAG;
        C23757c cVar = this.vungleBannerAdapter;
        if (cVar != null && (aVar = cVar.f60019f) != null) {
            cVar.f60023j = true;
            C23231u1 u1Var = aVar.f19211b;
            if (u1Var != null) {
                u1Var.setAdVisibility(true);
            }
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        boolean z;
        this.mMediationBannerListener = mediationBannerListener;
        String string = bundle.getString("appid");
        C23060a.C23061a a = C23060a.m56985a(bundle2, string);
        if (!TextUtils.isEmpty(string)) {
            C3852a aVar = C3852a.f13336d;
            int taggedForChildDirectedTreatment = mediationAdRequest.taggedForChildDirectedTreatment();
            aVar.getClass();
            C3852a.m10151d(taggedForChildDirectedTreatment);
            C23759d b = C23759d.m58339b();
            this.mVungleManager = b;
            b.getClass();
            String a2 = C23759d.m58338a(bundle2, bundle);
            String str = VungleMediationAdapter.TAG;
            hashCode();
            if (TextUtils.isEmpty(a2)) {
                AdError adError = new AdError(101, "Failed to load ad from Vungle. Missing or Invalid placement ID.", VungleMediationAdapter.ERROR_DOMAIN);
                adError.getMessage();
                this.mMediationBannerListener.onAdFailedToLoad((MediationBannerAdapter) this, adError);
                return;
            }
            AdConfig e = C17885a.m44435e(bundle2, true);
            this.mVungleManager.getClass();
            ArrayList arrayList = new ArrayList();
            AdConfig.AdSize adSize2 = AdConfig.AdSize.BANNER_SHORT;
            arrayList.add(new AdSize(adSize2.getWidth(), adSize2.getHeight()));
            AdConfig.AdSize adSize3 = AdConfig.AdSize.BANNER;
            arrayList.add(new AdSize(adSize3.getWidth(), adSize3.getHeight()));
            AdConfig.AdSize adSize4 = AdConfig.AdSize.BANNER_LEADERBOARD;
            arrayList.add(new AdSize(adSize4.getWidth(), adSize4.getHeight()));
            AdConfig.AdSize adSize5 = AdConfig.AdSize.VUNGLE_MREC;
            arrayList.add(new AdSize(adSize5.getWidth(), adSize5.getHeight()));
            AdSize findClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
            boolean z2 = false;
            if (findClosestSize == null) {
                Objects.toString(adSize);
                z = false;
            } else {
                findClosestSize.toString();
                Objects.toString(adSize);
                if (findClosestSize.getWidth() == adSize2.getWidth() && findClosestSize.getHeight() == adSize2.getHeight()) {
                    e.mo58262b(adSize2);
                } else if (findClosestSize.getWidth() == adSize3.getWidth() && findClosestSize.getHeight() == adSize3.getHeight()) {
                    e.mo58262b(adSize3);
                } else if (findClosestSize.getWidth() == adSize4.getWidth() && findClosestSize.getHeight() == adSize4.getHeight()) {
                    e.mo58262b(adSize4);
                } else if (findClosestSize.getWidth() == adSize5.getWidth() && findClosestSize.getHeight() == adSize5.getHeight()) {
                    e.mo58262b(adSize5);
                }
                z = true;
            }
            if (!z) {
                AdError adError2 = new AdError(102, "Failed to load ad from Vungle. Invalid banner size.", VungleMediationAdapter.ERROR_DOMAIN);
                adError2.getMessage();
                this.mMediationBannerListener.onAdFailedToLoad((MediationBannerAdapter) this, adError2);
                return;
            }
            String str2 = a.f58485b;
            C23759d dVar = this.mVungleManager;
            synchronized (dVar) {
                Iterator it = new HashSet(dVar.f60027a.keySet()).iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    C6012a aVar2 = dVar.f60027a.get(str3);
                    if (aVar2 != null && aVar2.f19210a.get() == null) {
                        dVar.mo59003c(str3, aVar2);
                    }
                }
                C6012a aVar3 = dVar.f60027a.get(a2);
                if (aVar3 != null) {
                    if (aVar3.f19210a.get() == null) {
                        dVar.f60027a.remove(a2);
                    } else {
                        String str4 = aVar3.f19210a.get().f60016c;
                        String str5 = VungleMediationAdapter.TAG;
                        if (str4 != null) {
                            if (!str4.equals(str2)) {
                            }
                        }
                    }
                }
                z2 = true;
            }
            if (!z2) {
                AdError adError3 = new AdError(104, "Vungle adapter does not support multiple banner instances for same placement.", VungleMediationAdapter.ERROR_DOMAIN);
                String str6 = VungleMediationAdapter.TAG;
                adError3.getMessage();
                this.mMediationBannerListener.onAdFailedToLoad((MediationBannerAdapter) this, adError3);
                return;
            }
            C23757c cVar = new C23757c(a2, str2, e, this);
            this.vungleBannerAdapter = cVar;
            String str7 = VungleMediationAdapter.TAG;
            Objects.toString(cVar);
            Objects.toString(e.mo58261a());
            C6012a aVar4 = new C6012a(this.vungleBannerAdapter);
            C23759d dVar2 = this.mVungleManager;
            dVar2.mo59003c(a2, dVar2.f60027a.get(a2));
            if (!dVar2.f60027a.containsKey(a2)) {
                dVar2.f60027a.put(a2, aVar4);
                Objects.toString(aVar4);
                dVar2.f60027a.size();
            }
            Objects.toString(e.mo58261a());
            C23757c cVar2 = this.vungleBannerAdapter;
            String str8 = a.f58484a;
            cVar2.f60018e = this.mMediationBannerListener;
            cVar2.f60020g = new C23755a(cVar2, context);
            int heightInPixels = adSize.getHeightInPixels(context);
            if (heightInPixels <= 0) {
                heightInPixels = Math.round(((float) cVar2.f60015b.mo58261a().getHeight()) * context.getResources().getDisplayMetrics().density);
            }
            cVar2.f60020g.setLayoutParams(new RelativeLayout.LayoutParams(adSize.getWidthInPixels(context), heightInPixels));
            cVar2.toString();
            cVar2.f60022i = true;
            C3852a.f13336d.mo15750c(str8, context.getApplicationContext(), new C23756b(cVar2));
        } else if (mediationBannerListener != null) {
            AdError adError4 = new AdError(101, "Failed to load ad from Vungle. Missing or invalid app ID.", VungleMediationAdapter.ERROR_DOMAIN);
            String str9 = VungleMediationAdapter.TAG;
            adError4.getMessage();
            mediationBannerListener.onAdFailedToLoad((MediationBannerAdapter) this, adError4);
        }
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        String string = bundle.getString("appid");
        if (!TextUtils.isEmpty(string)) {
            this.mMediationInterstitialListener = mediationInterstitialListener;
            C23759d b = C23759d.m58339b();
            this.mVungleManager = b;
            b.getClass();
            String a = C23759d.m58338a(bundle2, bundle);
            this.mPlacement = a;
            if (TextUtils.isEmpty(a)) {
                AdError adError = new AdError(101, "Failed to load ad from Vungle. Missing or Invalid Placement ID.", VungleMediationAdapter.ERROR_DOMAIN);
                String str = VungleMediationAdapter.TAG;
                adError.getMessage();
                this.mMediationInterstitialListener.onAdFailedToLoad((MediationInterstitialAdapter) this, adError);
                return;
            }
            C3852a aVar = C3852a.f13336d;
            int taggedForChildDirectedTreatment = mediationAdRequest.taggedForChildDirectedTreatment();
            aVar.getClass();
            C3852a.m10151d(taggedForChildDirectedTreatment);
            C23060a.C23061a a2 = C23060a.m56985a(bundle2, string);
            this.mAdConfig = C17885a.m44435e(bundle2, false);
            aVar.mo15750c(a2.f58484a, context.getApplicationContext(), new C23057a());
        } else if (mediationInterstitialListener != null) {
            AdError adError2 = new AdError(101, "Missing or invalid App ID.", VungleMediationAdapter.ERROR_DOMAIN);
            String str2 = VungleMediationAdapter.TAG;
            adError2.getMessage();
            mediationInterstitialListener.onAdFailedToLoad((MediationInterstitialAdapter) this, adError2);
        }
    }

    public void showInterstitial() {
        Vungle.playAd(this.mPlacement, this.mAdConfig, new C23059c());
    }
}
