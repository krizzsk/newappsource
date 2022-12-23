package com.google.ads.mediation.facebook;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.C2289Ad;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.C3831a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

@Keep
public final class FacebookAdapter extends FacebookMediationAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    public static final String KEY_ID = "id";
    public static final String KEY_SOCIAL_CONTEXT_ASSET = "social_context";
    private static final int MAX_STAR_RATING = 5;
    /* access modifiers changed from: private */
    public final AtomicBoolean didInterstitialAdClose = new AtomicBoolean();
    /* access modifiers changed from: private */
    public boolean isNativeBanner;
    /* access modifiers changed from: private */
    public AdView mAdView;
    /* access modifiers changed from: private */
    public MediationBannerListener mBannerListener;
    private InterstitialAd mInterstitialAd;
    /* access modifiers changed from: private */
    public MediationInterstitialListener mInterstitialListener;
    /* access modifiers changed from: private */
    public boolean mIsImpressionRecorded;
    /* access modifiers changed from: private */
    public MediaView mMediaView;
    private NativeAd mNativeAd;
    private NativeBannerAd mNativeBannerAd;
    /* access modifiers changed from: private */
    public MediationNativeListener mNativeListener;
    /* access modifiers changed from: private */
    public FrameLayout mWrappedAdView;
    /* access modifiers changed from: private */
    public final AtomicBoolean showInterstitialCalled = new AtomicBoolean();

    /* renamed from: com.google.ads.mediation.facebook.FacebookAdapter$a */
    public class C3817a implements C3831a.C3832a {

        /* renamed from: a */
        public final /* synthetic */ Context f13246a;

        /* renamed from: b */
        public final /* synthetic */ String f13247b;

        /* renamed from: c */
        public final /* synthetic */ AdSize f13248c;

        /* renamed from: d */
        public final /* synthetic */ MediationAdRequest f13249d;

        /* renamed from: e */
        public final /* synthetic */ com.google.android.gms.ads.AdSize f13250e;

        public C3817a(Context context, String str, AdSize adSize, MediationAdRequest mediationAdRequest, com.google.android.gms.ads.AdSize adSize2) {
            this.f13246a = context;
            this.f13247b = str;
            this.f13248c = adSize;
            this.f13249d = mediationAdRequest;
            this.f13250e = adSize2;
        }

        /* renamed from: a */
        public final void mo15696a(AdError adError) {
            if (FacebookAdapter.this.mBannerListener != null) {
                FacebookAdapter.this.mBannerListener.onAdFailedToLoad((MediationBannerAdapter) FacebookAdapter.this, adError);
            }
        }

        /* renamed from: b */
        public final void mo15697b() {
            AdView unused = FacebookAdapter.this.mAdView = new AdView(this.f13246a, this.f13247b, this.f13248c);
            FacebookAdapter.this.buildAdRequest(this.f13249d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f13250e.getWidthInPixels(this.f13246a), -2);
            FrameLayout unused2 = FacebookAdapter.this.mWrappedAdView = new FrameLayout(this.f13246a);
            FacebookAdapter.this.mAdView.setLayoutParams(layoutParams);
            FacebookAdapter.this.mWrappedAdView.addView(FacebookAdapter.this.mAdView);
            FacebookAdapter.this.mAdView.loadAd(FacebookAdapter.this.mAdView.buildLoadAdConfig().withAdListener(new C3820d()).build());
        }
    }

    /* renamed from: com.google.ads.mediation.facebook.FacebookAdapter$b */
    public class C3818b implements C3831a.C3832a {

        /* renamed from: a */
        public final /* synthetic */ Context f13252a;

        /* renamed from: b */
        public final /* synthetic */ String f13253b;

        /* renamed from: c */
        public final /* synthetic */ MediationAdRequest f13254c;

        public C3818b(Context context, String str, MediationAdRequest mediationAdRequest) {
            this.f13252a = context;
            this.f13253b = str;
            this.f13254c = mediationAdRequest;
        }

        /* renamed from: a */
        public final void mo15696a(AdError adError) {
            if (FacebookAdapter.this.mInterstitialListener != null) {
                FacebookAdapter.this.mInterstitialListener.onAdFailedToLoad((MediationInterstitialAdapter) FacebookAdapter.this, adError);
            }
        }

        /* renamed from: b */
        public final void mo15697b() {
            FacebookAdapter.this.createAndLoadInterstitial(this.f13252a, this.f13253b, this.f13254c);
        }
    }

    /* renamed from: com.google.ads.mediation.facebook.FacebookAdapter$c */
    public class C3819c implements C3831a.C3832a {

        /* renamed from: a */
        public final /* synthetic */ Context f13256a;

        /* renamed from: b */
        public final /* synthetic */ String f13257b;

        /* renamed from: c */
        public final /* synthetic */ NativeMediationAdRequest f13258c;

        /* renamed from: d */
        public final /* synthetic */ Bundle f13259d;

        public C3819c(Context context, String str, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle) {
            this.f13256a = context;
            this.f13257b = str;
            this.f13258c = nativeMediationAdRequest;
            this.f13259d = bundle;
        }

        /* renamed from: a */
        public final void mo15696a(AdError adError) {
            adError.getMessage();
            if (FacebookAdapter.this.mNativeListener != null) {
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad((MediationNativeAdapter) FacebookAdapter.this, adError);
            }
        }

        /* renamed from: b */
        public final void mo15697b() {
            FacebookAdapter.this.createAndLoadNativeAd(this.f13256a, this.f13257b, this.f13258c, this.f13259d);
        }
    }

    /* renamed from: com.google.ads.mediation.facebook.FacebookAdapter$d */
    public class C3820d implements AdListener {
        public C3820d() {
        }

        public final void onAdClicked(C2289Ad ad) {
            FacebookAdapter.this.mBannerListener.onAdClicked(FacebookAdapter.this);
            FacebookAdapter.this.mBannerListener.onAdOpened(FacebookAdapter.this);
            FacebookAdapter.this.mBannerListener.onAdLeftApplication(FacebookAdapter.this);
        }

        public final void onAdLoaded(C2289Ad ad) {
            FacebookAdapter.this.mBannerListener.onAdLoaded(FacebookAdapter.this);
        }

        public final void onError(C2289Ad ad, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            adError2.getMessage();
            FacebookAdapter.this.mBannerListener.onAdFailedToLoad((MediationBannerAdapter) FacebookAdapter.this, adError2);
        }

        public final void onLoggingImpression(C2289Ad ad) {
        }
    }

    /* renamed from: com.google.ads.mediation.facebook.FacebookAdapter$e */
    public class C3821e extends NativeAd.Image {

        /* renamed from: a */
        public Drawable f13262a;

        /* renamed from: b */
        public Uri f13263b;

        public C3821e() {
        }

        public final Drawable getDrawable() {
            return this.f13262a;
        }

        public final double getScale() {
            return 1.0d;
        }

        public final Uri getUri() {
            return this.f13263b;
        }

        public C3821e(Uri uri) {
            this.f13263b = uri;
        }

        public C3821e(Drawable drawable) {
            this.f13262a = drawable;
        }
    }

    /* renamed from: com.google.ads.mediation.facebook.FacebookAdapter$f */
    public class C3822f implements InterstitialAdExtendedListener {
        public C3822f() {
        }

        public final void onAdClicked(C2289Ad ad) {
            FacebookAdapter.this.mInterstitialListener.onAdClicked(FacebookAdapter.this);
            FacebookAdapter.this.mInterstitialListener.onAdLeftApplication(FacebookAdapter.this);
        }

        public final void onAdLoaded(C2289Ad ad) {
            FacebookAdapter.this.mInterstitialListener.onAdLoaded(FacebookAdapter.this);
        }

        public final void onError(C2289Ad ad, com.facebook.ads.AdError adError) {
            FacebookMediationAdapter.getAdError(adError).getMessage();
            if (FacebookAdapter.this.showInterstitialCalled.get()) {
                FacebookAdapter.this.mInterstitialListener.onAdOpened(FacebookAdapter.this);
                FacebookAdapter.this.mInterstitialListener.onAdClosed(FacebookAdapter.this);
                return;
            }
            FacebookAdapter.this.mInterstitialListener.onAdFailedToLoad((MediationInterstitialAdapter) FacebookAdapter.this, adError.getErrorCode());
        }

        public final void onInterstitialActivityDestroyed() {
            if (!FacebookAdapter.this.didInterstitialAdClose.getAndSet(true)) {
                FacebookAdapter.this.mInterstitialListener.onAdClosed(FacebookAdapter.this);
            }
        }

        public final void onInterstitialDismissed(C2289Ad ad) {
            if (!FacebookAdapter.this.didInterstitialAdClose.getAndSet(true)) {
                FacebookAdapter.this.mInterstitialListener.onAdClosed(FacebookAdapter.this);
            }
        }

        public final void onInterstitialDisplayed(C2289Ad ad) {
            FacebookAdapter.this.mInterstitialListener.onAdOpened(FacebookAdapter.this);
        }

        public final void onLoggingImpression(C2289Ad ad) {
        }

        public final void onRewardedAdCompleted() {
        }

        public final void onRewardedAdServerFailed() {
        }

        public final void onRewardedAdServerSucceeded() {
        }
    }

    /* renamed from: com.google.ads.mediation.facebook.FacebookAdapter$g */
    public interface C3823g {
        /* renamed from: a */
        void mo15701a(AdError adError);

        /* renamed from: b */
        void mo15702b();
    }

    /* renamed from: com.google.ads.mediation.facebook.FacebookAdapter$h */
    public class C3824h implements AdListener, NativeAdListener {

        /* renamed from: a */
        public final WeakReference<Context> f13265a;

        /* renamed from: b */
        public final NativeBannerAd f13266b;

        /* renamed from: com.google.ads.mediation.facebook.FacebookAdapter$h$a */
        public class C3825a implements C3823g {

            /* renamed from: a */
            public final /* synthetic */ C3828j f13268a;

            public C3825a(C3828j jVar) {
                this.f13268a = jVar;
            }

            /* renamed from: a */
            public final void mo15701a(AdError adError) {
                adError.getMessage();
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad((MediationNativeAdapter) FacebookAdapter.this, adError);
            }

            /* renamed from: b */
            public final void mo15702b() {
                FacebookAdapter.this.mNativeListener.onAdLoaded(FacebookAdapter.this, this.f13268a);
            }
        }

        public C3824h(Context context, NativeBannerAd nativeBannerAd) {
            this.f13265a = new WeakReference<>(context);
            this.f13266b = nativeBannerAd;
        }

        public final void onAdClicked(C2289Ad ad) {
            FacebookAdapter.this.mNativeListener.onAdClicked(FacebookAdapter.this);
            FacebookAdapter.this.mNativeListener.onAdOpened(FacebookAdapter.this);
            FacebookAdapter.this.mNativeListener.onAdLeftApplication(FacebookAdapter.this);
        }

        public final void onAdLoaded(C2289Ad ad) {
            if (ad != this.f13266b) {
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad((MediationNativeAdapter) FacebookAdapter.this, new AdError(106, "Ad loaded is not a native banner ad.", FacebookMediationAdapter.ERROR_DOMAIN));
                return;
            }
            Context context = this.f13265a.get();
            if (context == null) {
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad((MediationNativeAdapter) FacebookAdapter.this, new AdError(107, "Failed to create ad options view. Context is null.", FacebookMediationAdapter.ERROR_DOMAIN));
                return;
            }
            C3828j jVar = new C3828j(this.f13266b);
            jVar.mo15703a(context, new C3825a(jVar));
        }

        public final void onError(C2289Ad ad, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            adError2.getMessage();
            FacebookAdapter.this.mNativeListener.onAdFailedToLoad((MediationNativeAdapter) FacebookAdapter.this, adError2);
        }

        public final void onLoggingImpression(C2289Ad ad) {
            if (!FacebookAdapter.this.mIsImpressionRecorded) {
                FacebookAdapter.this.mNativeListener.onAdImpression(FacebookAdapter.this);
                boolean unused = FacebookAdapter.this.mIsImpressionRecorded = true;
            }
        }

        public final void onMediaDownloaded(C2289Ad ad) {
            String str = FacebookMediationAdapter.TAG;
        }
    }

    /* renamed from: com.google.ads.mediation.facebook.FacebookAdapter$i */
    public class C3826i implements AdListener, NativeAdListener {

        /* renamed from: a */
        public final WeakReference<Context> f13270a;

        /* renamed from: b */
        public final com.facebook.ads.NativeAd f13271b;

        /* renamed from: com.google.ads.mediation.facebook.FacebookAdapter$i$a */
        public class C3827a implements C3823g {

            /* renamed from: a */
            public final /* synthetic */ C3828j f13273a;

            public C3827a(C3828j jVar) {
                this.f13273a = jVar;
            }

            /* renamed from: a */
            public final void mo15701a(AdError adError) {
                adError.getMessage();
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad((MediationNativeAdapter) FacebookAdapter.this, adError);
            }

            /* renamed from: b */
            public final void mo15702b() {
                FacebookAdapter.this.mNativeListener.onAdLoaded(FacebookAdapter.this, this.f13273a);
            }
        }

        public C3826i(Context context, com.facebook.ads.NativeAd nativeAd) {
            this.f13270a = new WeakReference<>(context);
            this.f13271b = nativeAd;
        }

        public final void onAdClicked(C2289Ad ad) {
            FacebookAdapter.this.mNativeListener.onAdClicked(FacebookAdapter.this);
            FacebookAdapter.this.mNativeListener.onAdOpened(FacebookAdapter.this);
            FacebookAdapter.this.mNativeListener.onAdLeftApplication(FacebookAdapter.this);
        }

        public final void onAdLoaded(C2289Ad ad) {
            if (ad != this.f13271b) {
                AdError adError = new AdError(106, "Ad loaded is not a native ad.", FacebookMediationAdapter.ERROR_DOMAIN);
                adError.getMessage();
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad((MediationNativeAdapter) FacebookAdapter.this, adError);
                return;
            }
            Context context = this.f13270a.get();
            if (context == null) {
                AdError adError2 = new AdError(107, "Failed to create ad options view. Context is null", FacebookMediationAdapter.ERROR_DOMAIN);
                adError2.getMessage();
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad((MediationNativeAdapter) FacebookAdapter.this, adError2);
                return;
            }
            C3828j jVar = new C3828j(this.f13271b);
            jVar.mo15703a(context, new C3827a(jVar));
        }

        public final void onError(C2289Ad ad, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            if (!TextUtils.isEmpty(adError.getErrorMessage())) {
                adError2.getMessage();
            }
            FacebookAdapter.this.mNativeListener.onAdFailedToLoad((MediationNativeAdapter) FacebookAdapter.this, adError.getErrorCode());
        }

        public final void onLoggingImpression(C2289Ad ad) {
            if (!FacebookAdapter.this.mIsImpressionRecorded) {
                FacebookAdapter.this.mNativeListener.onAdImpression(FacebookAdapter.this);
                boolean unused = FacebookAdapter.this.mIsImpressionRecorded = true;
            }
        }

        public final void onMediaDownloaded(C2289Ad ad) {
            String str = FacebookMediationAdapter.TAG;
        }
    }

    /* access modifiers changed from: private */
    public void buildAdRequest(MediationAdRequest mediationAdRequest) {
        if (mediationAdRequest == null) {
            return;
        }
        if (mediationAdRequest.taggedForChildDirectedTreatment() == 1) {
            AdSettings.setMixedAudience(true);
        } else if (mediationAdRequest.taggedForChildDirectedTreatment() == 0) {
            AdSettings.setMixedAudience(false);
        }
    }

    /* access modifiers changed from: private */
    public void createAndLoadInterstitial(Context context, String str, MediationAdRequest mediationAdRequest) {
        this.mInterstitialAd = new InterstitialAd(context, str);
        buildAdRequest(mediationAdRequest);
        InterstitialAd interstitialAd = this.mInterstitialAd;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(new C3822f()).build());
    }

    /* access modifiers changed from: private */
    public void createAndLoadNativeAd(Context context, String str, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle) {
        if (bundle != null) {
            this.isNativeBanner = bundle.getBoolean("native_banner");
        }
        if (this.isNativeBanner) {
            this.mNativeBannerAd = new NativeBannerAd(context, str);
            buildAdRequest(nativeMediationAdRequest);
            NativeBannerAd nativeBannerAd = this.mNativeBannerAd;
            nativeBannerAd.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(new C3824h(context, this.mNativeBannerAd)).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
            return;
        }
        this.mMediaView = new MediaView(context);
        this.mNativeAd = new com.facebook.ads.NativeAd(context, str);
        buildAdRequest(nativeMediationAdRequest);
        com.facebook.ads.NativeAd nativeAd = this.mNativeAd;
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new C3826i(context, this.mNativeAd)).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
    }

    private AdSize getAdSize(Context context, com.google.android.gms.ads.AdSize adSize) {
        int width = adSize.getWidth();
        if (width < 0) {
            width = Math.round(((float) adSize.getWidthInPixels(context)) / context.getResources().getDisplayMetrics().density);
        }
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(0, new com.google.android.gms.ads.AdSize(width, 50));
        arrayList.add(1, new com.google.android.gms.ads.AdSize(width, 90));
        arrayList.add(2, new com.google.android.gms.ads.AdSize(width, 250));
        arrayList.toString();
        com.google.android.gms.ads.AdSize findClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (findClosestSize == null) {
            return null;
        }
        findClosestSize.toString();
        int height = findClosestSize.getHeight();
        AdSize adSize2 = AdSize.BANNER_HEIGHT_50;
        if (height == adSize2.getHeight()) {
            return adSize2;
        }
        AdSize adSize3 = AdSize.BANNER_HEIGHT_90;
        if (height == adSize3.getHeight()) {
            return adSize3;
        }
        AdSize adSize4 = AdSize.RECTANGLE_HEIGHT_250;
        if (height == adSize4.getHeight()) {
            return adSize4;
        }
        return null;
    }

    public View getBannerView() {
        return this.mWrappedAdView;
    }

    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        super.loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    public void onDestroy() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.destroy();
        }
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        com.facebook.ads.NativeAd nativeAd = this.mNativeAd;
        if (nativeAd != null) {
            nativeAd.unregisterView();
            this.mNativeAd.destroy();
        }
        MediaView mediaView = this.mMediaView;
        if (mediaView != null) {
            mediaView.destroy();
        }
        NativeBannerAd nativeBannerAd = this.mNativeBannerAd;
        if (nativeBannerAd != null) {
            nativeBannerAd.unregisterView();
            this.mNativeBannerAd.destroy();
        }
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, com.google.android.gms.ads.AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mBannerListener = mediationBannerListener;
        String placementID = FacebookMediationAdapter.getPlacementID(bundle);
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            adError.getMessage();
            this.mBannerListener.onAdFailedToLoad((MediationBannerAdapter) this, adError);
            return;
        }
        AdSize adSize2 = getAdSize(context, adSize);
        if (adSize2 == null) {
            AdError adError2 = new AdError(102, "There is no matching Facebook ad size for Google ad size.", FacebookMediationAdapter.ERROR_DOMAIN);
            adError2.getMessage();
            this.mBannerListener.onAdFailedToLoad((MediationBannerAdapter) this, adError2);
            return;
        }
        C3831a a = C3831a.m10133a();
        C3817a aVar = new C3817a(context, placementID, adSize2, mediationAdRequest, adSize);
        a.getClass();
        C3831a.m10134b(context, placementID, aVar);
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mInterstitialListener = mediationInterstitialListener;
        String placementID = FacebookMediationAdapter.getPlacementID(bundle);
        if (TextUtils.isEmpty(placementID)) {
            this.mInterstitialListener.onAdFailedToLoad((MediationInterstitialAdapter) this, new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN));
            return;
        }
        C3831a a = C3831a.m10133a();
        C3818b bVar = new C3818b(context, placementID, mediationAdRequest);
        a.getClass();
        C3831a.m10134b(context, placementID, bVar);
    }

    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        this.mNativeListener = mediationNativeListener;
        String placementID = FacebookMediationAdapter.getPlacementID(bundle);
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            adError.getMessage();
            this.mNativeListener.onAdFailedToLoad((MediationNativeAdapter) this, adError);
        } else if (!nativeMediationAdRequest.isUnifiedNativeAdRequested()) {
            AdError adError2 = new AdError(105, "Unified Native Ads should be requested.", FacebookMediationAdapter.ERROR_DOMAIN);
            adError2.getMessage();
            this.mNativeListener.onAdFailedToLoad((MediationNativeAdapter) this, adError2);
        } else {
            C3831a a = C3831a.m10133a();
            C3819c cVar = new C3819c(context, placementID, nativeMediationAdRequest, bundle2);
            a.getClass();
            C3831a.m10134b(context, placementID, cVar);
        }
    }

    public void showInterstitial() {
        this.showInterstitialCalled.set(true);
        if (!this.mInterstitialAd.show()) {
            new AdError(110, "Failed to present interstitial ad.", FacebookMediationAdapter.ERROR_DOMAIN).getMessage();
            MediationInterstitialListener mediationInterstitialListener = this.mInterstitialListener;
            if (mediationInterstitialListener != null) {
                mediationInterstitialListener.onAdOpened(this);
                this.mInterstitialListener.onAdClosed(this);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.facebook.FacebookAdapter$j */
    public class C3828j extends UnifiedNativeAdMapper {

        /* renamed from: a */
        public com.facebook.ads.NativeAd f13275a;

        /* renamed from: b */
        public NativeBannerAd f13276b;

        /* renamed from: com.google.ads.mediation.facebook.FacebookAdapter$j$a */
        public class C3829a implements MediaViewListener {
            public C3829a() {
            }

            public final void onComplete(MediaView mediaView) {
                if (FacebookAdapter.this.mNativeListener != null) {
                    FacebookAdapter.this.mNativeListener.onVideoEnd(FacebookAdapter.this);
                }
            }

            public final void onEnterFullscreen(MediaView mediaView) {
            }

            public final void onExitFullscreen(MediaView mediaView) {
            }

            public final void onFullscreenBackground(MediaView mediaView) {
            }

            public final void onFullscreenForeground(MediaView mediaView) {
            }

            public final void onPause(MediaView mediaView) {
            }

            public final void onPlay(MediaView mediaView) {
            }

            public final void onVolumeChange(MediaView mediaView, float f) {
            }
        }

        public C3828j(com.facebook.ads.NativeAd nativeAd) {
            this.f13275a = nativeAd;
        }

        /* renamed from: a */
        public final void mo15703a(Context context, C3823g gVar) {
            AdOptionsView adOptionsView;
            Double d;
            boolean z = true;
            boolean z2 = false;
            if (FacebookAdapter.this.isNativeBanner) {
                NativeBannerAd nativeBannerAd = this.f13276b;
                if (nativeBannerAd.getAdHeadline() == null || nativeBannerAd.getAdBodyText() == null || nativeBannerAd.getAdIcon() == null || nativeBannerAd.getAdCallToAction() == null) {
                    z = false;
                }
                if (!z) {
                    AdError adError = new AdError(108, "Ad from Facebook doesn't have all assets required for the Native Banner Ad format.", FacebookMediationAdapter.ERROR_DOMAIN);
                    adError.getMessage();
                    gVar.mo15701a(adError);
                    return;
                }
                setHeadline(this.f13276b.getAdHeadline());
                setBody(this.f13276b.getAdBodyText());
                if (this.f13276b.getPreloadedIconViewDrawable() != null) {
                    setIcon(new C3821e(this.f13276b.getPreloadedIconViewDrawable()));
                } else if (this.f13276b.getAdIcon() == null) {
                    setIcon(new C3821e());
                } else {
                    setIcon(new C3821e(Uri.parse(this.f13276b.getAdIcon().getUrl())));
                }
                setCallToAction(this.f13276b.getAdCallToAction());
                setAdvertiser(this.f13276b.getAdvertiserName());
                Bundle bundle = new Bundle();
                bundle.putCharSequence("id", this.f13276b.getId());
                bundle.putCharSequence(FacebookAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.f13276b.getAdSocialContext());
                setExtras(bundle);
            } else {
                com.facebook.ads.NativeAd nativeAd = this.f13275a;
                if (!(nativeAd.getAdHeadline() == null || nativeAd.getAdCoverImage() == null || nativeAd.getAdBodyText() == null || nativeAd.getAdIcon() == null || nativeAd.getAdCallToAction() == null || FacebookAdapter.this.mMediaView == null)) {
                    z2 = true;
                }
                if (!z2) {
                    AdError adError2 = new AdError(108, "Ad from Facebook doesn't have all assets required for the Native Banner Ad format.", FacebookMediationAdapter.ERROR_DOMAIN);
                    adError2.getMessage();
                    gVar.mo15701a(adError2);
                    return;
                }
                setHeadline(this.f13275a.getAdHeadline());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C3821e(Uri.parse(this.f13275a.getAdCoverImage().getUrl())));
                setImages(arrayList);
                setBody(this.f13275a.getAdBodyText());
                if (this.f13275a.getPreloadedIconViewDrawable() != null) {
                    setIcon(new C3821e(this.f13275a.getPreloadedIconViewDrawable()));
                } else if (this.f13275a.getAdIcon() == null) {
                    setIcon(new C3821e());
                } else {
                    setIcon(new C3821e(Uri.parse(this.f13275a.getAdIcon().getUrl())));
                }
                setCallToAction(this.f13275a.getAdCallToAction());
                setAdvertiser(this.f13275a.getAdvertiserName());
                FacebookAdapter.this.mMediaView.setListener(new C3829a());
                setMediaView(FacebookAdapter.this.mMediaView);
                setHasVideoContent(true);
                NativeAdBase.Rating adStarRating = this.f13275a.getAdStarRating();
                if (adStarRating == null) {
                    d = null;
                } else {
                    d = Double.valueOf((adStarRating.getValue() * 5.0d) / adStarRating.getScale());
                }
                if (d != null) {
                    setStarRating(d);
                }
                Bundle bundle2 = new Bundle();
                bundle2.putCharSequence("id", this.f13275a.getId());
                bundle2.putCharSequence(FacebookAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.f13275a.getAdSocialContext());
                setExtras(bundle2);
            }
            NativeAdLayout nativeAdLayout = new NativeAdLayout(context);
            if (FacebookAdapter.this.isNativeBanner) {
                adOptionsView = new AdOptionsView(context, this.f13276b, nativeAdLayout);
            } else {
                adOptionsView = new AdOptionsView(context, this.f13275a, nativeAdLayout);
            }
            setAdChoicesContent(adOptionsView);
            gVar.mo15702b();
        }

        public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            ArrayList arrayList = new ArrayList();
            View view2 = null;
            for (Map.Entry next : map.entrySet()) {
                arrayList.add((View) next.getValue());
                if (((String) next.getKey()).equals("3003")) {
                    view2 = (View) next.getValue();
                }
            }
            if (FacebookAdapter.this.isNativeBanner) {
                if (view2 != null) {
                    if (!(view2 instanceof ImageView)) {
                        String.format("Native ad icon asset is rendered with an incompatible class type. Facebook impression recording might be impacted for this ad. Expected: ImageView, actual: %s.", new Object[]{view2.getClass()});
                        return;
                    }
                    this.f13276b.registerViewForInteraction(view, (ImageView) view2);
                }
            } else if (view2 instanceof ImageView) {
                this.f13275a.registerViewForInteraction(view, FacebookAdapter.this.mMediaView, (ImageView) view2, (List<View>) arrayList);
            } else {
                this.f13275a.registerViewForInteraction(view, FacebookAdapter.this.mMediaView, (List<View>) arrayList);
            }
        }

        public final void untrackView(View view) {
            NativeBannerAd nativeBannerAd;
            if (!FacebookAdapter.this.isNativeBanner || (nativeBannerAd = this.f13276b) == null) {
                com.facebook.ads.NativeAd nativeAd = this.f13275a;
                if (nativeAd != null) {
                    nativeAd.unregisterView();
                }
            } else {
                nativeBannerAd.unregisterView();
            }
            super.untrackView(view);
        }

        public C3828j(NativeBannerAd nativeBannerAd) {
            this.f13276b = nativeBannerAd;
        }
    }
}
