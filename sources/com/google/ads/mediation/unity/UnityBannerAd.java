package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Keep;
import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import java.util.ArrayList;
import p172m9.C5720b;
import p185n9.C5878a;

@Keep
public class UnityBannerAd extends UnityMediationAdapter implements MediationBannerAdapter {
    /* access modifiers changed from: private */
    public String bannerPlacementId;
    /* access modifiers changed from: private */
    public BannerView bannerView;
    /* access modifiers changed from: private */
    public C5878a eventAdapter;
    /* access modifiers changed from: private */
    public String gameId;
    /* access modifiers changed from: private */
    public BannerView.IListener mUnityBannerListener = new C3843a();
    /* access modifiers changed from: private */
    public MediationBannerListener mediationBannerListener;

    /* renamed from: com.google.ads.mediation.unity.UnityBannerAd$a */
    public class C3843a extends BannerView.Listener {
        public C3843a() {
        }

        public final void onBannerClick(BannerView bannerView) {
            String.format("Unity Ads banner ad was clicked for placement ID: %s", new Object[]{UnityBannerAd.this.bannerView.getPlacementId()});
            UnityBannerAd.this.eventAdapter.mo21754a(UnityAdsAdapterUtils.AdEvent.CLICKED);
            UnityBannerAd.this.eventAdapter.mo21754a(UnityAdsAdapterUtils.AdEvent.OPENED);
        }

        public final void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
            int i;
            UnityBannerAd unityBannerAd = UnityBannerAd.this;
            int i2 = UnityAdsAdapterUtils.C3842a.f13317a[bannerErrorInfo.errorCode.ordinal()];
            if (i2 == 1) {
                i = 201;
            } else if (i2 == 2) {
                i = 202;
            } else if (i2 == 3) {
                i = 203;
            } else if (i2 != 4) {
                i = 200;
            } else {
                i = 204;
            }
            unityBannerAd.sendBannerFailedToLoad(i, bannerErrorInfo.errorMessage);
        }

        public final void onBannerLeftApplication(BannerView bannerView) {
            String.format("Unity Ads banner ad left application for placement ID: %s", new Object[]{UnityBannerAd.this.bannerView.getPlacementId()});
            UnityBannerAd.this.eventAdapter.mo21754a(UnityAdsAdapterUtils.AdEvent.LEFT_APPLICATION);
        }

        public final void onBannerLoaded(BannerView bannerView) {
            String.format("Unity Ads finished loading banner ad for placement ID: %s", new Object[]{UnityBannerAd.this.bannerView.getPlacementId()});
            UnityBannerAd.this.eventAdapter.mo21754a(UnityAdsAdapterUtils.AdEvent.LOADED);
        }
    }

    /* renamed from: com.google.ads.mediation.unity.UnityBannerAd$b */
    public class C3844b implements IUnityAdsInitializationListener {

        /* renamed from: a */
        public final /* synthetic */ Activity f13322a;

        /* renamed from: b */
        public final /* synthetic */ UnityBannerSize f13323b;

        public C3844b(Activity activity, UnityBannerSize unityBannerSize) {
            this.f13322a = activity;
            this.f13323b = unityBannerSize;
        }

        public final void onInitializationComplete() {
            String.format("Unity Ads is initialized for game ID '%s' and can now load banner ad with placement ID: %s", new Object[]{UnityBannerAd.this.gameId, UnityBannerAd.this.bannerPlacementId});
            if (UnityBannerAd.this.bannerView == null) {
                BannerView unused = UnityBannerAd.this.bannerView = new BannerView(this.f13322a, UnityBannerAd.this.bannerPlacementId, this.f13323b);
            }
            UnityBannerAd.this.bannerView.setListener(UnityBannerAd.this.mUnityBannerListener);
            UnityBannerAd.this.bannerView.load();
        }

        public final void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            AdError b = UnityAdsAdapterUtils.m10143b(unityAdsInitializationError, String.format("Unity Ads initialization failed for game ID '%s' with error message: %s", new Object[]{UnityBannerAd.this.gameId, str}));
            b.toString();
            if (UnityBannerAd.this.mediationBannerListener != null) {
                UnityBannerAd.this.mediationBannerListener.onAdFailedToLoad((MediationBannerAdapter) UnityBannerAd.this, b);
            }
        }
    }

    /* access modifiers changed from: private */
    public void sendBannerFailedToLoad(int i, String str) {
        AdError a = UnityAdsAdapterUtils.m10142a(i, str);
        a.toString();
        MediationBannerListener mediationBannerListener2 = this.mediationBannerListener;
        if (mediationBannerListener2 != null) {
            mediationBannerListener2.onAdFailedToLoad((MediationBannerAdapter) this, a);
        }
    }

    public View getBannerView() {
        return this.bannerView;
    }

    public void onDestroy() {
        BannerView bannerView2 = this.bannerView;
        if (bannerView2 != null) {
            bannerView2.destroy();
        }
        this.bannerView = null;
        this.mediationBannerListener = null;
        this.mUnityBannerListener = null;
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener2, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        UnityBannerSize unityBannerSize;
        this.mediationBannerListener = mediationBannerListener2;
        this.eventAdapter = new C5878a(mediationBannerListener2, this);
        this.gameId = bundle.getString(UnityMediationAdapter.KEY_GAME_ID);
        String string = bundle.getString(UnityMediationAdapter.KEY_PLACEMENT_ID);
        this.bannerPlacementId = string;
        if (!UnityAdapter.areValidIds(this.gameId, string)) {
            sendBannerFailedToLoad(101, "Missing or invalid server parameters.");
        } else if (!(context instanceof Activity)) {
            sendBannerFailedToLoad(105, "Unity Ads requires an Activity context to load ads.");
        } else {
            Activity activity = (Activity) context;
            ArrayList arrayList = new ArrayList();
            arrayList.add(AdSize.BANNER);
            arrayList.add(AdSize.LEADERBOARD);
            AdSize findClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
            if (findClosestSize != null) {
                unityBannerSize = new UnityBannerSize(findClosestSize.getWidth(), findClosestSize.getHeight());
            } else {
                unityBannerSize = null;
            }
            if (unityBannerSize == null) {
                sendBannerFailedToLoad(110, String.format("There is no matching Unity Ads ad size for Google ad size: %s", new Object[]{adSize}));
                return;
            }
            C5720b m = C5720b.m14062m();
            String str = this.gameId;
            C3844b bVar = new C3844b(activity, unityBannerSize);
            m.getClass();
            C5720b.m14068s(context, str, bVar);
        }
    }
}
