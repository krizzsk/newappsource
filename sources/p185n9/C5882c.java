package p185n9;

import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import p258t4.C6587a;

/* renamed from: n9.c */
public final class C5882c {

    /* renamed from: a */
    public final MediationRewardedAdCallback f18892a;

    /* renamed from: n9.c$a */
    public static /* synthetic */ class C5883a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18893a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.ads.mediation.unity.UnityAdsAdapterUtils$AdEvent[] r0 = com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18893a = r0
                com.google.ads.mediation.unity.UnityAdsAdapterUtils$AdEvent r1 = com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.OPENED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18893a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.ads.mediation.unity.UnityAdsAdapterUtils$AdEvent r1 = com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.CLICKED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18893a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.ads.mediation.unity.UnityAdsAdapterUtils$AdEvent r1 = com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.CLOSED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18893a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.ads.mediation.unity.UnityAdsAdapterUtils$AdEvent r1 = com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.IMPRESSION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18893a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.ads.mediation.unity.UnityAdsAdapterUtils$AdEvent r1 = com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.VIDEO_START     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f18893a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.ads.mediation.unity.UnityAdsAdapterUtils$AdEvent r1 = com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.REWARD     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f18893a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.ads.mediation.unity.UnityAdsAdapterUtils$AdEvent r1 = com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.VIDEO_COMPLETE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p185n9.C5882c.C5883a.<clinit>():void");
        }
    }

    public C5882c(MediationRewardedAdCallback mediationRewardedAdCallback) {
        this.f18892a = mediationRewardedAdCallback;
    }

    /* renamed from: a */
    public final void mo21756a(UnityAdsAdapterUtils.AdEvent adEvent) {
        if (this.f18892a != null) {
            switch (C5883a.f18893a[adEvent.ordinal()]) {
                case 1:
                    this.f18892a.onAdOpened();
                    return;
                case 2:
                    this.f18892a.reportAdClicked();
                    return;
                case 3:
                    this.f18892a.onAdClosed();
                    return;
                case 4:
                    this.f18892a.reportAdImpression();
                    return;
                case 5:
                    this.f18892a.onVideoStart();
                    return;
                case 6:
                    this.f18892a.onUserEarnedReward(new C6587a());
                    return;
                case 7:
                    this.f18892a.onVideoComplete();
                    return;
                default:
                    return;
            }
        }
    }
}
