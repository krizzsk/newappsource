package p160l9;

import android.os.Bundle;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.nearby.messages.Strategy;

/* renamed from: l9.b */
public final class C5642b {

    /* renamed from: l9.b$a */
    public static /* synthetic */ class C5643a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18394a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f18395b;

        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|(2:43|44)|45|47|48|49|50|51|52|53|54|56) */
        /* JADX WARNING: Can't wrap try/catch for region: R(49:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|(2:43|44)|45|47|48|49|50|51|52|53|54|56) */
        /* JADX WARNING: Can't wrap try/catch for region: R(50:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|47|48|49|50|51|52|53|54|56) */
        /* JADX WARNING: Can't wrap try/catch for region: R(51:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|47|48|49|50|51|52|53|54|56) */
        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|47|48|49|50|51|52|53|54|56) */
        /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00ff */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0109 */
        static {
            /*
                com.fyber.inneractive.sdk.external.InneractiveErrorCode[] r0 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18395b = r0
                r1 = 1
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r2 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.CONNECTION_ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f18395b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r3 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.CONNECTION_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f18395b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r4 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.NO_FILL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f18395b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r5 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r4 = f18395b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r5 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r4 = f18395b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r5 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6 = 6
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r4 = f18395b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r5 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.UNSPECIFIED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r6 = 7
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r4 = f18395b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r5 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.LOAD_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r6 = 8
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r4 = f18395b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r5 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.INVALID_INPUT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r6 = 9
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r4 = f18395b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r5 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SPOT_DISABLED     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r6 = 10
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r4 = f18395b     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r5 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.UNSUPPORTED_SPOT     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r6 = 11
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r4 = f18395b     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r5 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.IN_FLIGHT_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r6 = 12
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r4 = f18395b     // Catch:{ NoSuchFieldError -> 0x009c }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r5 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_NOT_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x009c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r6 = 13
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r4 = f18395b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r5 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r6 = 14
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r4 = f18395b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r5 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r6 = 15
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r4 = f18395b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r5 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.NATIVE_ADS_NOT_SUPPORTED_FOR_OS     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r6 = 16
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r4 = f18395b     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r5 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.ERROR_CONFIGURATION_NO_SUCH_SPOT     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r6 = 17
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r4 = f18395b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r5 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r6 = 18
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r4 = f18395b     // Catch:{ NoSuchFieldError -> 0x00e4 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r5 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.ERROR_CODE_NATIVE_VIDEO_NOT_SUPPORTED     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r6 = 19
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener$FyberInitStatus[] r4 = com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f18394a = r4
                com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener$FyberInitStatus r5 = com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY     // Catch:{ NoSuchFieldError -> 0x00f5 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f5 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x00f5 }
            L_0x00f5:
                int[] r1 = f18394a     // Catch:{ NoSuchFieldError -> 0x00ff }
                com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener$FyberInitStatus r4 = com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED_NO_KITS_DETECTED     // Catch:{ NoSuchFieldError -> 0x00ff }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ff }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x00ff }
            L_0x00ff:
                int[] r0 = f18394a     // Catch:{ NoSuchFieldError -> 0x0109 }
                com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener$FyberInitStatus r1 = com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED     // Catch:{ NoSuchFieldError -> 0x0109 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0109 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0109 }
            L_0x0109:
                int[] r0 = f18394a     // Catch:{ NoSuchFieldError -> 0x0113 }
                com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener$FyberInitStatus r1 = com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID     // Catch:{ NoSuchFieldError -> 0x0113 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0113 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0113 }
            L_0x0113:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p160l9.C5642b.C5643a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static AdError m13923a(InneractiveErrorCode inneractiveErrorCode) {
        int i;
        switch (C5643a.f18395b[inneractiveErrorCode.ordinal()]) {
            case 1:
                i = Strategy.TTL_SECONDS_DEFAULT;
                break;
            case 2:
                i = 301;
                break;
            case 3:
                i = 302;
                break;
            case 4:
                i = 303;
                break;
            case 5:
                i = 304;
                break;
            case 6:
                i = 305;
                break;
            case 7:
                i = 306;
                break;
            case 8:
                i = 307;
                break;
            case 9:
                i = 308;
                break;
            case 10:
                i = 309;
                break;
            case 11:
                i = 310;
                break;
            case 12:
                i = 311;
                break;
            case 13:
                i = 312;
                break;
            case 14:
                i = 313;
                break;
            case 15:
                i = 314;
                break;
            case 16:
                i = 315;
                break;
            case 17:
                i = 316;
                break;
            case 18:
                i = 317;
                break;
            default:
                i = 399;
                break;
        }
        return new AdError(i, "Fyber failed to request ad with reason: " + inneractiveErrorCode, FyberMediationAdapter.ERROR_DOMAIN);
    }

    /* renamed from: b */
    public static AdError m13924b(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
        int i;
        int i2 = C5643a.f18394a[fyberInitStatus.ordinal()];
        if (i2 == 1) {
            i = 200;
        } else if (i2 == 2) {
            i = 201;
        } else if (i2 == 3) {
            i = 202;
        } else if (i2 != 4) {
            i = 299;
        } else {
            i = 203;
        }
        return new AdError(i, "Fyber failed to initialize with reason: " + fyberInitStatus, FyberMediationAdapter.ERROR_DOMAIN);
    }

    /* renamed from: c */
    public static void m13925c(Bundle bundle) {
        if (bundle != null) {
            InneractiveUserConfig inneractiveUserConfig = new InneractiveUserConfig();
            if (bundle.containsKey(InneractiveMediationDefs.KEY_AGE)) {
                inneractiveUserConfig.setAge(bundle.getInt(InneractiveMediationDefs.KEY_AGE, 0));
            }
            InneractiveAdManager.setUserParams(inneractiveUserConfig);
        }
    }
}
