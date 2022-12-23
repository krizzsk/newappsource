package p149k9;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.C2289Ad;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: k9.d */
public final class C5530d extends UnifiedNativeAdMapper {

    /* renamed from: a */
    public final MediationNativeAdConfiguration f18116a;

    /* renamed from: b */
    public final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f18117b;

    /* renamed from: c */
    public NativeAdBase f18118c;

    /* renamed from: d */
    public MediationNativeAdCallback f18119d;

    /* renamed from: e */
    public MediaView f18120e;

    /* renamed from: k9.d$a */
    public class C5531a extends NativeAd.Image {

        /* renamed from: a */
        public Drawable f18121a;

        /* renamed from: b */
        public Uri f18122b;

        public C5531a() {
        }

        public final Drawable getDrawable() {
            return this.f18121a;
        }

        public final double getScale() {
            return 1.0d;
        }

        public final Uri getUri() {
            return this.f18122b;
        }

        public C5531a(Uri uri) {
            this.f18122b = uri;
        }

        public C5531a(Drawable drawable) {
            this.f18121a = drawable;
        }
    }

    /* renamed from: k9.d$b */
    public class C5532b implements AdListener, NativeAdListener {

        /* renamed from: a */
        public final WeakReference<Context> f18123a;

        /* renamed from: b */
        public final NativeAdBase f18124b;

        public C5532b(Context context, NativeAdBase nativeAdBase) {
            this.f18124b = nativeAdBase;
            this.f18123a = new WeakReference<>(context);
        }

        public final void onAdClicked(C2289Ad ad) {
            C5530d.this.f18119d.reportAdClicked();
            C5530d.this.f18119d.onAdOpened();
            C5530d.this.f18119d.onAdLeftApplication();
        }

        public final void onAdLoaded(C2289Ad ad) {
            boolean z;
            if (ad != this.f18124b) {
                AdError adError = new AdError(106, "Ad Loaded is not a Native Ad.", FacebookMediationAdapter.ERROR_DOMAIN);
                adError.getMessage();
                C5530d.this.f18117b.onFailure(adError);
                return;
            }
            Context context = this.f18123a.get();
            if (context == null) {
                AdError adError2 = new AdError(107, "Context is null.", FacebookMediationAdapter.ERROR_DOMAIN);
                adError2.getMessage();
                C5530d.this.f18117b.onFailure(adError2);
                return;
            }
            C5530d dVar = C5530d.this;
            NativeAdBase nativeAdBase = dVar.f18118c;
            boolean z2 = false;
            if (nativeAdBase.getAdHeadline() == null || nativeAdBase.getAdBodyText() == null || nativeAdBase.getAdIcon() == null || nativeAdBase.getAdCallToAction() == null) {
                z = false;
            } else {
                z = true;
            }
            if (!(nativeAdBase instanceof NativeBannerAd)) {
                if (!(!z || nativeAdBase.getAdCoverImage() == null || dVar.f18120e == null)) {
                    z2 = true;
                }
                z = z2;
            }
            if (!z) {
                AdError adError3 = new AdError(108, "Ad from Facebook doesn't have all required assets.", FacebookMediationAdapter.ERROR_DOMAIN);
                adError3.getMessage();
                adError3.getMessage();
                C5530d.this.f18117b.onFailure(adError3);
                return;
            }
            dVar.setHeadline(dVar.f18118c.getAdHeadline());
            if (dVar.f18118c.getAdCoverImage() != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C5531a(Uri.parse(dVar.f18118c.getAdCoverImage().getUrl())));
                dVar.setImages(arrayList);
            }
            dVar.setBody(dVar.f18118c.getAdBodyText());
            if (dVar.f18118c.getPreloadedIconViewDrawable() != null) {
                dVar.setIcon(new C5531a(dVar.f18118c.getPreloadedIconViewDrawable()));
            } else if (dVar.f18118c.getAdIcon() == null) {
                dVar.setIcon(new C5531a());
            } else {
                dVar.setIcon(new C5531a(Uri.parse(dVar.f18118c.getAdIcon().getUrl())));
            }
            dVar.setCallToAction(dVar.f18118c.getAdCallToAction());
            dVar.setAdvertiser(dVar.f18118c.getAdvertiserName());
            dVar.f18120e.setListener(new C5529c(dVar));
            dVar.setHasVideoContent(true);
            dVar.setMediaView(dVar.f18120e);
            dVar.setStarRating((Double) null);
            Bundle bundle = new Bundle();
            bundle.putCharSequence("id", dVar.f18118c.getId());
            bundle.putCharSequence(FacebookAdapter.KEY_SOCIAL_CONTEXT_ASSET, dVar.f18118c.getAdSocialContext());
            dVar.setExtras(bundle);
            dVar.setAdChoicesContent(new AdOptionsView(context, dVar.f18118c, (NativeAdLayout) null));
            C5530d dVar2 = C5530d.this;
            dVar2.f18119d = dVar2.f18117b.onSuccess(dVar2);
        }

        public final void onError(C2289Ad ad, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            adError2.getMessage();
            C5530d.this.f18117b.onFailure(adError2);
        }

        public final void onLoggingImpression(C2289Ad ad) {
        }

        public final void onMediaDownloaded(C2289Ad ad) {
            String str = FacebookMediationAdapter.TAG;
        }
    }

    public C5530d(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.f18117b = mediationAdLoadCallback;
        this.f18116a = mediationNativeAdConfiguration;
    }

    public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        setOverrideClickHandling(true);
        ArrayList arrayList = new ArrayList(map.values());
        View view2 = map.get("3003");
        NativeAdBase nativeAdBase = this.f18118c;
        if (nativeAdBase instanceof NativeBannerAd) {
            if (view2 != null) {
                if (!(view2 instanceof ImageView)) {
                    String.format("Native ad icon asset is rendered with an incompatible class type. Facebook impression recording might be impacted for this ad. Expected: ImageView, actual: %s.", new Object[]{view2.getClass()});
                    return;
                }
                ((NativeBannerAd) nativeAdBase).registerViewForInteraction(view, (ImageView) view2, (List<View>) arrayList);
            }
        } else if (nativeAdBase instanceof com.facebook.ads.NativeAd) {
            com.facebook.ads.NativeAd nativeAd = (com.facebook.ads.NativeAd) nativeAdBase;
            if (view2 instanceof ImageView) {
                nativeAd.registerViewForInteraction(view, this.f18120e, (ImageView) view2, (List<View>) arrayList);
            } else {
                nativeAd.registerViewForInteraction(view, this.f18120e, (List<View>) arrayList);
            }
        }
    }

    public final void untrackView(View view) {
        NativeAdBase nativeAdBase = this.f18118c;
        if (nativeAdBase != null) {
            nativeAdBase.unregisterView();
        }
        super.untrackView(view);
    }
}
