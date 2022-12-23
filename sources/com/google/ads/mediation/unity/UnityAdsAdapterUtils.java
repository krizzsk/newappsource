package com.google.ads.mediation.unity;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.wallet.WalletConstants;
import com.unity3d.ads.UnityAds;

public final class UnityAdsAdapterUtils {

    public enum AdEvent {
        LOADED,
        OPENED,
        CLICKED,
        CLOSED,
        LEFT_APPLICATION,
        IMPRESSION,
        VIDEO_START,
        REWARD,
        VIDEO_COMPLETE
    }

    /* renamed from: com.google.ads.mediation.unity.UnityAdsAdapterUtils$a */
    public static /* synthetic */ class C3842a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13317a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f13318b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f13319c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f13320d;

        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|33|34|35|37|38|39|40|41|42|43|45|46|47|48|49|50|(3:51|52|54)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(45:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|33|34|35|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|54) */
        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|33|34|35|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|54) */
        /* JADX WARNING: Can't wrap try/catch for region: R(47:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|33|34|35|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|54) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x009e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00c3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00cd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00d7 */
        static {
            /*
                com.unity3d.ads.UnityAds$UnityAdsShowError[] r0 = com.unity3d.ads.UnityAds.UnityAdsShowError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13320d = r0
                r1 = 1
                com.unity3d.ads.UnityAds$UnityAdsShowError r2 = com.unity3d.ads.UnityAds.UnityAdsShowError.NOT_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f13320d     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.ads.UnityAds$UnityAdsShowError r3 = com.unity3d.ads.UnityAds.UnityAdsShowError.NOT_READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f13320d     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.unity3d.ads.UnityAds$UnityAdsShowError r4 = com.unity3d.ads.UnityAds.UnityAdsShowError.VIDEO_PLAYER_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f13320d     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.unity3d.ads.UnityAds$UnityAdsShowError r5 = com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f13320d     // Catch:{ NoSuchFieldError -> 0x003e }
                com.unity3d.ads.UnityAds$UnityAdsShowError r6 = com.unity3d.ads.UnityAds.UnityAdsShowError.NO_CONNECTION     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r5 = f13320d     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.unity3d.ads.UnityAds$UnityAdsShowError r6 = com.unity3d.ads.UnityAds.UnityAdsShowError.ALREADY_SHOWING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r5 = f13320d     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.unity3d.ads.UnityAds$UnityAdsShowError r6 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7 = 7
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                com.unity3d.ads.UnityAds$UnityAdsLoadError[] r5 = com.unity3d.ads.UnityAds.UnityAdsLoadError.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f13319c = r5
                com.unity3d.ads.UnityAds$UnityAdsLoadError r6 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INITIALIZE_FAILED     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                int[] r5 = f13319c     // Catch:{ NoSuchFieldError -> 0x006f }
                com.unity3d.ads.UnityAds$UnityAdsLoadError r6 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x006f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                int[] r5 = f13319c     // Catch:{ NoSuchFieldError -> 0x0079 }
                com.unity3d.ads.UnityAds$UnityAdsLoadError r6 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INVALID_ARGUMENT     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r5 = f13319c     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.unity3d.ads.UnityAds$UnityAdsLoadError r6 = com.unity3d.ads.UnityAds.UnityAdsLoadError.NO_FILL     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r5[r6] = r3     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r5 = f13319c     // Catch:{ NoSuchFieldError -> 0x008d }
                com.unity3d.ads.UnityAds$UnityAdsLoadError r6 = com.unity3d.ads.UnityAds.UnityAdsLoadError.TIMEOUT     // Catch:{ NoSuchFieldError -> 0x008d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                com.unity3d.ads.UnityAds$UnityAdsInitializationError[] r4 = com.unity3d.ads.UnityAds.UnityAdsInitializationError.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f13318b = r4
                com.unity3d.ads.UnityAds$UnityAdsInitializationError r5 = com.unity3d.ads.UnityAds.UnityAdsInitializationError.INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x009e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x009e }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x009e }
            L_0x009e:
                int[] r4 = f13318b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.unity3d.ads.UnityAds$UnityAdsInitializationError r5 = com.unity3d.ads.UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r4 = f13318b     // Catch:{ NoSuchFieldError -> 0x00b2 }
                com.unity3d.ads.UnityAds$UnityAdsInitializationError r5 = com.unity3d.ads.UnityAds.UnityAdsInitializationError.AD_BLOCKER_DETECTED     // Catch:{ NoSuchFieldError -> 0x00b2 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b2 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x00b2 }
            L_0x00b2:
                com.unity3d.services.banners.BannerErrorCode[] r4 = com.unity3d.services.banners.BannerErrorCode.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f13317a = r4
                com.unity3d.services.banners.BannerErrorCode r5 = com.unity3d.services.banners.BannerErrorCode.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x00c3 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c3 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x00c3 }
            L_0x00c3:
                int[] r1 = f13317a     // Catch:{ NoSuchFieldError -> 0x00cd }
                com.unity3d.services.banners.BannerErrorCode r4 = com.unity3d.services.banners.BannerErrorCode.NATIVE_ERROR     // Catch:{ NoSuchFieldError -> 0x00cd }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cd }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x00cd }
            L_0x00cd:
                int[] r0 = f13317a     // Catch:{ NoSuchFieldError -> 0x00d7 }
                com.unity3d.services.banners.BannerErrorCode r1 = com.unity3d.services.banners.BannerErrorCode.WEBVIEW_ERROR     // Catch:{ NoSuchFieldError -> 0x00d7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d7 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d7 }
            L_0x00d7:
                int[] r0 = f13317a     // Catch:{ NoSuchFieldError -> 0x00e1 }
                com.unity3d.services.banners.BannerErrorCode r1 = com.unity3d.services.banners.BannerErrorCode.NO_FILL     // Catch:{ NoSuchFieldError -> 0x00e1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e1 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00e1 }
            L_0x00e1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.ads.mediation.unity.UnityAdsAdapterUtils.C3842a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static AdError m10142a(int i, String str) {
        return new AdError(i, str, "com.unity3d.ads");
    }

    /* renamed from: b */
    public static AdError m10143b(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        int i;
        int i2 = C3842a.f13318b[unityAdsInitializationError.ordinal()];
        if (i2 == 1) {
            i = 301;
        } else if (i2 == 2) {
            i = 302;
        } else if (i2 != 3) {
            i = Strategy.TTL_SECONDS_DEFAULT;
        } else {
            i = 303;
        }
        return m10142a(i, str);
    }

    /* renamed from: c */
    public static AdError m10144c(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        int i;
        int i2 = C3842a.f13319c[unityAdsLoadError.ordinal()];
        if (i2 == 1) {
            i = 401;
        } else if (i2 == 2) {
            i = WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE;
        } else if (i2 == 3) {
            i = 403;
        } else if (i2 == 4) {
            i = WalletConstants.ERROR_CODE_INVALID_PARAMETERS;
        } else if (i2 != 5) {
            i = 400;
        } else {
            i = WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR;
        }
        return m10142a(i, str);
    }

    /* renamed from: d */
    public static AdError m10145d(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        int i;
        switch (C3842a.f13320d[unityAdsShowError.ordinal()]) {
            case 1:
                i = 501;
                break;
            case 2:
                i = 502;
                break;
            case 3:
                i = 503;
                break;
            case 4:
                i = 504;
                break;
            case 5:
                i = 505;
                break;
            case 6:
                i = 506;
                break;
            case 7:
                i = 507;
                break;
            default:
                i = 500;
                break;
        }
        return m10142a(i, str);
    }
}
