package p185n9;

import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* renamed from: n9.b */
public final class C5880b {

    /* renamed from: a */
    public final MediationInterstitialListener f18889a;

    /* renamed from: b */
    public final MediationInterstitialAdapter f18890b;

    /* renamed from: n9.b$a */
    public static /* synthetic */ class C5881a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18891a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.ads.mediation.unity.UnityAdsAdapterUtils$AdEvent[] r0 = com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18891a = r0
                com.google.ads.mediation.unity.UnityAdsAdapterUtils$AdEvent r1 = com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.LOADED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18891a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.ads.mediation.unity.UnityAdsAdapterUtils$AdEvent r1 = com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.OPENED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18891a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.ads.mediation.unity.UnityAdsAdapterUtils$AdEvent r1 = com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.CLICKED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18891a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.ads.mediation.unity.UnityAdsAdapterUtils$AdEvent r1 = com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.CLOSED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18891a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.ads.mediation.unity.UnityAdsAdapterUtils$AdEvent r1 = com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.LEFT_APPLICATION     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p185n9.C5880b.C5881a.<clinit>():void");
        }
    }

    public C5880b(MediationInterstitialListener mediationInterstitialListener, MediationInterstitialAdapter mediationInterstitialAdapter) {
        this.f18889a = mediationInterstitialListener;
        this.f18890b = mediationInterstitialAdapter;
    }

    /* renamed from: a */
    public final void mo21755a(UnityAdsAdapterUtils.AdEvent adEvent) {
        if (this.f18889a != null) {
            int i = C5881a.f18891a[adEvent.ordinal()];
            if (i == 1) {
                this.f18889a.onAdLoaded(this.f18890b);
            } else if (i == 2) {
                this.f18889a.onAdOpened(this.f18890b);
            } else if (i == 3) {
                this.f18889a.onAdClicked(this.f18890b);
            } else if (i == 4) {
                this.f18889a.onAdClosed(this.f18890b);
            } else if (i == 5) {
                this.f18889a.onAdLeftApplication(this.f18890b);
            }
        }
    }
}
