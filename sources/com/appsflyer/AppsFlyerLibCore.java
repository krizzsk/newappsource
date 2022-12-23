package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.models.InAppMessageBase;
import com.appboy.support.StringUtils;
import com.appsflyer.AFFacebookDeferredDeeplink;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.Foreground;
import com.appsflyer.OneLinkHttpTask;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.deeplink.DdlEvent;
import com.appsflyer.deeplink.DeepLinkCallbacks;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.internal.C2064ab;
import com.appsflyer.internal.C2069ad;
import com.appsflyer.internal.C2073d;
import com.appsflyer.internal.C2082m;
import com.appsflyer.internal.C2089q;
import com.appsflyer.internal.C2101u;
import com.appsflyer.internal.C2102v;
import com.appsflyer.internal.C2103w;
import com.appsflyer.internal.C2104x;
import com.appsflyer.internal.C2106y;
import com.appsflyer.internal.EventDataCollector;
import com.appsflyer.internal.Exlytics;
import com.appsflyer.internal.attribution.RequestErrorMessage;
import com.appsflyer.internal.event.uninstall.Register;
import com.appsflyer.internal.model.event.AdRevenue;
import com.appsflyer.internal.model.event.Attr;
import com.appsflyer.internal.model.event.BackgroundEvent;
import com.appsflyer.internal.model.event.BackgroundReferrerLaunch;
import com.appsflyer.internal.model.event.CachedEvent;
import com.appsflyer.internal.model.event.InAppEvent;
import com.appsflyer.internal.model.event.Launch;
import com.appsflyer.internal.model.event.Stats;
import com.appsflyer.internal.referrer.GoogleReferrer;
import com.appsflyer.internal.referrer.HuaweiReferrer;
import com.appsflyer.internal.referrer.Referrer;
import com.appsflyer.internal.referrer.SamsungReferrer;
import com.appsflyer.share.Constants;
import com.facebook.applinks.C2356a;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.GoogleApiAvailability;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.usebutton.sdk.internal.WebViewActivity;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.NetworkInterface;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.C0115o;
import p988j$.util.DesugarTimeZone;
import p988j$.util.concurrent.ConcurrentHashMap;

public class AppsFlyerLibCore extends AppsFlyerLib {
    public static AppsFlyerInAppPurchaseValidatorListener AFDateFormat = null;
    private static String AFDeepLinkManager = null;
    public static final String AF_PRE_INSTALL_PATH = "AF_PRE_INSTALL_PATH";
    public static final String BUILD_NUMBER = "6.1.4";
    public static final String BUILD_URL_SUFFIX;
    public static String FIRST_LAUNCHES_URL = null;
    public static final String INSTALL_REFERRER_PREF = "rfr";
    public static final String INSTALL_UPDATE_DATE_FORMAT = "yyyy-MM-dd_HHmmssZ";
    public static final String IS_STOP_TRACKING_USED = "is_stop_tracking_used";
    public static final String LOG_TAG = "AppsFlyer_6.1.4";
    public static final String PRE_INSTALL_SYSTEM_DEFAULT = "/data/local/tmp/pre_install.appsflyer";
    public static final String PRE_INSTALL_SYSTEM_DEFAULT_ETC = "/etc/pre_install.appsflyer";
    public static final String PRE_INSTALL_SYSTEM_RO_PROP = "ro.appsflyer.preinstall.path";
    public static String REFERRER_TRACKING_URL = null;
    public static final String SERVER_BUILD_NUMBER = "6.1";
    private static String collectIntentsFromActivities = "https://%sstats.%s/stats";
    private static final List<String> context = Arrays.asList(new String[]{"is_cache"});
    public static AppsFlyerConversionListener conversionDataListener = null;
    private static final String dateFormatUTC;
    private static String getDataFormatter = null;
    private static String getInstance = null;
    public static AppsFlyerLibCore instance = new AppsFlyerLibCore();
    public static final String values = "89";
    public String $$a;
    public String $$b;
    private long AFEvent = -1;
    private Map<Long, String> AFExecutor;
    private C2064ab AFFacebookDeferredDeeplink$AppLinkFetchEvents = new C2064ab();
    private boolean AFHelper = false;
    /* access modifiers changed from: private */
    public boolean AFInAppEventParameterName = false;
    /* access modifiers changed from: private */
    public SharedPreferences AFInAppEventType;
    /* access modifiers changed from: private */
    public final JSONObject AFKeystoreWrapper = new JSONObject();
    /* access modifiers changed from: private */
    public Referrer[] AFLogger;
    private boolean addChannel = false;
    private boolean addParams = false;
    private String afInfoLog;
    public EventDataCollector eventDataCollector;
    private long getRequestListener = TimeUnit.SECONDS.toMillis(5);
    private boolean getThreadPoolExecutor;
    /* access modifiers changed from: private */
    public ScheduledExecutorService isEncrypt = null;
    private String key;
    /* access modifiers changed from: private */
    public Application onAppLinkFetchFailed;
    private boolean onAppLinkFetchFinished;
    /* access modifiers changed from: private */
    public long params;
    /* access modifiers changed from: private */
    public long post;
    /* access modifiers changed from: private */
    public boolean requestListener = false;
    public String[] sharingFilter;
    private boolean toJsonObject = false;
    /* access modifiers changed from: private */
    public Map<String, Object> toList;
    /* access modifiers changed from: private */
    public Map<String, Object> toMap;
    private long urlString = -1;
    public long valueOf;

    /* renamed from: com.appsflyer.AppsFlyerLibCore$7 */
    public static /* synthetic */ class C20417 {
        public static final /* synthetic */ int[] $$b;
        public static final /* synthetic */ int[] AFDateFormat;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        static {
            /*
                com.appsflyer.internal.referrer.Referrer$State[] r0 = com.appsflyer.internal.referrer.Referrer.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                AFDateFormat = r0
                r1 = 1
                com.appsflyer.internal.referrer.Referrer$State r2 = com.appsflyer.internal.referrer.Referrer.State.FINISHED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = AFDateFormat     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appsflyer.internal.referrer.Referrer$State r3 = com.appsflyer.internal.referrer.Referrer.State.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.appsflyer.AppsFlyerProperties$EmailsCryptType[] r2 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                $$b = r2
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r3 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.SHA256     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = $$b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r2 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.NONE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.C20417.<clinit>():void");
        }
    }

    public static class InstallAttributionIdFetcher implements Runnable {
        private static final List<String> $$a = Arrays.asList(new String[]{"googleplay", "playstore", "googleplaystore"});
        public static String CONVERSION_DATA_URL = "https://%sgcdsdk.%s/install_data/v4.0/";
        public final AppsFlyerLibCore $$b;
        private final Application AFDateFormat;
        private final AtomicInteger AFDeepLinkManager;
        private final int dateFormatUTC;
        private final String valueOf;
        public final ScheduledExecutorService values;

        public static /* synthetic */ void $$b(Map map) {
            StringBuilder sb = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
            sb.append(map.toString());
            AFLogger.afDebugLog(sb.toString());
            AppsFlyerLibCore.conversionDataListener.onConversionDataSuccess(map);
        }

        public /* synthetic */ InstallAttributionIdFetcher(AppsFlyerLibCore appsFlyerLibCore, Application application, String str, byte b) {
            this(appsFlyerLibCore, application, str);
        }

        public static void setUrl(Map<String, String> map) {
            for (Map.Entry next : map.entrySet()) {
                if ("gcdsdk".equals(next.getKey())) {
                    CONVERSION_DATA_URL = (String) next.getValue();
                }
            }
        }

        /* access modifiers changed from: private */
        public static void valueOf(String str) {
            if (AppsFlyerLibCore.conversionDataListener != null) {
                AFLogger.afDebugLog("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
                AppsFlyerLibCore.conversionDataListener.onConversionDataFail(str);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0110 A[Catch:{ u -> 0x0247, all -> 0x0270 }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0174 A[Catch:{ u -> 0x0247, all -> 0x0270 }] */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0278 A[Catch:{ all -> 0x02a8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0285 A[Catch:{ all -> 0x02a8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x029a A[DONT_GENERATE] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r15 = this;
                java.lang.String r0 = "is_first_launch"
                java.lang.String r1 = "af_siteid"
                java.lang.String r2 = r15.valueOf
                if (r2 == 0) goto L_0x02b4
                int r2 = r2.length()
                if (r2 != 0) goto L_0x0010
                goto L_0x02b4
            L_0x0010:
                com.appsflyer.AppsFlyerLibCore r2 = r15.$$b
                boolean r2 = r2.isStopped()
                if (r2 == 0) goto L_0x0023
                java.lang.String r0 = "[GCD-E03] 'isStopTracking' enabled"
                com.appsflyer.AFLogger.afDebugLog(r0)
                java.lang.String r0 = "'isStopTracking' enabled"
                valueOf(r0)
                return
            L_0x0023:
                java.util.concurrent.atomic.AtomicInteger r2 = r15.AFDeepLinkManager
                r2.incrementAndGet()
                r2 = 0
                r3 = 2
                android.app.Application r4 = r15.AFDateFormat     // Catch:{ all -> 0x0273 }
                if (r4 != 0) goto L_0x003e
                java.lang.String r0 = "[GCD-E06] Context null"
                com.appsflyer.AFLogger.afDebugLog(r0)     // Catch:{ all -> 0x0273 }
                java.lang.String r0 = "Context null"
                valueOf(r0)     // Catch:{ all -> 0x0273 }
                java.util.concurrent.atomic.AtomicInteger r0 = r15.AFDeepLinkManager
                r0.decrementAndGet()
                return
            L_0x003e:
                com.appsflyer.AppsFlyerLibCore r5 = r15.$$b     // Catch:{ all -> 0x0273 }
                java.lang.String r6 = r5.getConfiguredChannel(r4)     // Catch:{ all -> 0x0273 }
                java.lang.String r4 = r5.$$b((android.content.Context) r4, (java.lang.String) r6)     // Catch:{ all -> 0x0273 }
                java.lang.String r5 = ""
                r6 = 0
                r7 = 1
                if (r4 == 0) goto L_0x006e
                java.util.List<java.lang.String> r8 = $$a     // Catch:{ all -> 0x0273 }
                java.lang.String r9 = r4.toLowerCase()     // Catch:{ all -> 0x0273 }
                boolean r8 = r8.contains(r9)     // Catch:{ all -> 0x0273 }
                if (r8 != 0) goto L_0x0061
                java.lang.String r8 = "-"
                java.lang.String r4 = r8.concat(r4)     // Catch:{ all -> 0x0273 }
                goto L_0x006f
            L_0x0061:
                java.lang.String r8 = "AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix."
                java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x0273 }
                r9[r6] = r4     // Catch:{ all -> 0x0273 }
                java.lang.String r4 = java.lang.String.format(r8, r9)     // Catch:{ all -> 0x0273 }
                com.appsflyer.AFLogger.afWarnLog(r4)     // Catch:{ all -> 0x0273 }
            L_0x006e:
                r4 = r5
            L_0x006f:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0273 }
                r8.<init>()     // Catch:{ all -> 0x0273 }
                java.lang.String r9 = CONVERSION_DATA_URL     // Catch:{ all -> 0x0273 }
                java.lang.String r9 = com.appsflyer.ServerConfigHandler.getUrl(r9)     // Catch:{ all -> 0x0273 }
                r8.append(r9)     // Catch:{ all -> 0x0273 }
                android.app.Application r9 = r15.AFDateFormat     // Catch:{ all -> 0x0273 }
                java.lang.String r9 = r9.getPackageName()     // Catch:{ all -> 0x0273 }
                r8.append(r9)     // Catch:{ all -> 0x0273 }
                r8.append(r4)     // Catch:{ all -> 0x0273 }
                java.lang.String r4 = "?devkey="
                r8.append(r4)     // Catch:{ all -> 0x0273 }
                java.lang.String r4 = r15.valueOf     // Catch:{ all -> 0x0273 }
                r8.append(r4)     // Catch:{ all -> 0x0273 }
                java.lang.String r4 = "&device_id="
                r8.append(r4)     // Catch:{ all -> 0x0273 }
                java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0273 }
                android.app.Application r9 = r15.AFDateFormat     // Catch:{ all -> 0x0273 }
                r4.<init>(r9)     // Catch:{ all -> 0x0273 }
                java.lang.String r4 = com.appsflyer.Installation.m5498id(r4)     // Catch:{ all -> 0x0273 }
                r8.append(r4)     // Catch:{ all -> 0x0273 }
                java.lang.String r4 = r8.toString()     // Catch:{ all -> 0x0273 }
                com.appsflyer.internal.ad r8 = com.appsflyer.internal.C2069ad.$$a()     // Catch:{ all -> 0x0273 }
                java.lang.String r9 = "server_request"
                java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch:{ all -> 0x0273 }
                r8.AFDateFormat(r9, r4, r5)     // Catch:{ all -> 0x0273 }
                java.lang.String r5 = "[GCD-B01] URL: "
                java.lang.String r8 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0273 }
                java.lang.String r5 = r5.concat(r8)     // Catch:{ all -> 0x0273 }
                com.appsflyer.internal.C2103w.$$a(r5)     // Catch:{ all -> 0x0273 }
                long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0273 }
                java.net.URL r5 = new java.net.URL     // Catch:{ all -> 0x0273 }
                r5.<init>(r4)     // Catch:{ all -> 0x0273 }
                java.net.URLConnection r5 = r5.openConnection()     // Catch:{ all -> 0x0273 }
                java.lang.Object r5 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r5)     // Catch:{ all -> 0x0273 }
                java.net.URLConnection r5 = (java.net.URLConnection) r5     // Catch:{ all -> 0x0273 }
                java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ all -> 0x0273 }
                java.lang.String r2 = "GET"
                r5.setRequestMethod(r2)     // Catch:{ all -> 0x0270 }
                r2 = 10000(0x2710, float:1.4013E-41)
                r5.setConnectTimeout(r2)     // Catch:{ all -> 0x0270 }
                java.lang.String r2 = "Connection"
                java.lang.String r10 = "close"
                r5.setRequestProperty(r2, r10)     // Catch:{ all -> 0x0270 }
                r5.connect()     // Catch:{ all -> 0x0270 }
                int r2 = r5.getResponseCode()     // Catch:{ all -> 0x0270 }
                com.appsflyer.AppsFlyerLibCore r10 = r15.$$b     // Catch:{ all -> 0x0270 }
                java.lang.String r10 = r10.readServerResponse(r5)     // Catch:{ all -> 0x0270 }
                com.appsflyer.internal.ad r11 = com.appsflyer.internal.C2069ad.$$a()     // Catch:{ all -> 0x0270 }
                java.lang.String r12 = "server_response"
                java.lang.String[] r13 = new java.lang.String[r3]     // Catch:{ all -> 0x0270 }
                java.lang.String r14 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0270 }
                r13[r6] = r14     // Catch:{ all -> 0x0270 }
                r13[r7] = r10     // Catch:{ all -> 0x0270 }
                r11.AFDateFormat(r12, r4, r13)     // Catch:{ all -> 0x0270 }
                r4 = 200(0xc8, float:2.8E-43)
                r11 = 404(0x194, float:5.66E-43)
                if (r2 == r4) goto L_0x013c
                if (r2 != r11) goto L_0x0113
                goto L_0x013c
            L_0x0113:
                r0 = 403(0x193, float:5.65E-43)
                if (r2 == r0) goto L_0x011b
                r0 = 500(0x1f4, float:7.0E-43)
                if (r2 < r0) goto L_0x012d
            L_0x011b:
                int r0 = r15.dateFormatUTC     // Catch:{ all -> 0x0270 }
                if (r0 >= r3) goto L_0x012d
                com.appsflyer.AppsFlyerLibCore$InstallAttributionIdFetcher r0 = new com.appsflyer.AppsFlyerLibCore$InstallAttributionIdFetcher     // Catch:{ all -> 0x0270 }
                r0.<init>(r15)     // Catch:{ all -> 0x0270 }
                java.util.concurrent.ScheduledExecutorService r1 = r0.values     // Catch:{ all -> 0x0270 }
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0270 }
                com.appsflyer.AppsFlyerLibCore.AFDateFormat((java.util.concurrent.ScheduledExecutorService) r1, (java.lang.Runnable) r0, 10, (java.util.concurrent.TimeUnit) r2)     // Catch:{ all -> 0x0270 }
                goto L_0x0267
            L_0x012d:
                java.lang.String r0 = "Error connection to server: "
                java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0270 }
                java.lang.String r0 = r0.concat(r1)     // Catch:{ all -> 0x0270 }
                valueOf(r0)     // Catch:{ all -> 0x0270 }
                goto L_0x0267
            L_0x013c:
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x0270 }
                r4.<init>()     // Catch:{ all -> 0x0270 }
                java.lang.String r12 = "net"
                long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0270 }
                long r13 = r13 - r8
                r4.put(r12, r13)     // Catch:{ all -> 0x0270 }
                java.lang.String r8 = "retries"
                int r9 = r15.dateFormatUTC     // Catch:{ all -> 0x0270 }
                r4.put(r8, r9)     // Catch:{ all -> 0x0270 }
                com.appsflyer.AppsFlyerLibCore r8 = com.appsflyer.AppsFlyerLibCore.getInstance()     // Catch:{ all -> 0x0270 }
                com.appsflyer.internal.EventDataCollector r8 = r8.eventDataCollector     // Catch:{ all -> 0x0270 }
                java.lang.String r9 = "gcd"
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0270 }
                r8.set((java.lang.String) r9, (java.lang.String) r4)     // Catch:{ all -> 0x0270 }
                java.lang.String r4 = "Attribution data: "
                java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0270 }
                java.lang.String r4 = r4.concat(r8)     // Catch:{ all -> 0x0270 }
                com.appsflyer.internal.C2103w.$$a(r4)     // Catch:{ all -> 0x0270 }
                int r4 = r10.length()     // Catch:{ all -> 0x0270 }
                if (r4 <= 0) goto L_0x0267
                java.util.Map r4 = com.appsflyer.AppsFlyerLibCore.AFDateFormat((java.lang.String) r10)     // Catch:{ all -> 0x0270 }
                java.lang.String r8 = "iscache"
                java.lang.Object r8 = r4.get(r8)     // Catch:{ all -> 0x0270 }
                java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0270 }
                if (r2 != r11) goto L_0x019a
                java.lang.String r2 = "error_reason"
                r4.remove(r2)     // Catch:{ all -> 0x0270 }
                java.lang.String r2 = "status_code"
                r4.remove(r2)     // Catch:{ all -> 0x0270 }
                java.lang.String r2 = "af_status"
                java.lang.String r9 = "Organic"
                r4.put(r2, r9)     // Catch:{ all -> 0x0270 }
                java.lang.String r2 = "af_message"
                java.lang.String r9 = "organic install"
                r4.put(r2, r9)     // Catch:{ all -> 0x0270 }
            L_0x019a:
                if (r8 == 0) goto L_0x01af
                boolean r2 = r8.booleanValue()     // Catch:{ all -> 0x0270 }
                if (r2 != 0) goto L_0x01af
                com.appsflyer.AppsFlyerLibCore r2 = r15.$$b     // Catch:{ all -> 0x0270 }
                android.app.Application r8 = r15.AFDateFormat     // Catch:{ all -> 0x0270 }
                java.lang.String r9 = "appsflyerConversionDataCacheExpiration"
                long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0270 }
                r2.valueOf((android.content.Context) r8, (java.lang.String) r9, (long) r11)     // Catch:{ all -> 0x0270 }
            L_0x01af:
                boolean r2 = r4.containsKey(r1)     // Catch:{ all -> 0x0270 }
                java.lang.String r8 = "[Invite] Detected App-Invite via channel: "
                java.lang.String r9 = "af_channel"
                if (r2 == 0) goto L_0x01e4
                boolean r2 = r4.containsKey(r9)     // Catch:{ all -> 0x0270 }
                if (r2 == 0) goto L_0x01d3
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0270 }
                r2.<init>(r8)     // Catch:{ all -> 0x0270 }
                java.lang.Object r11 = r4.get(r9)     // Catch:{ all -> 0x0270 }
                r2.append(r11)     // Catch:{ all -> 0x0270 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0270 }
                com.appsflyer.AFLogger.afDebugLog(r2)     // Catch:{ all -> 0x0270 }
                goto L_0x01e4
            L_0x01d3:
                java.lang.String r2 = "[CrossPromotion] App was installed via %s's Cross Promotion"
                java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ all -> 0x0270 }
                java.lang.Object r12 = r4.get(r1)     // Catch:{ all -> 0x0270 }
                r11[r6] = r12     // Catch:{ all -> 0x0270 }
                java.lang.String r2 = java.lang.String.format(r2, r11)     // Catch:{ all -> 0x0270 }
                com.appsflyer.AFLogger.afDebugLog(r2)     // Catch:{ all -> 0x0270 }
            L_0x01e4:
                boolean r1 = r4.containsKey(r1)     // Catch:{ all -> 0x0270 }
                if (r1 == 0) goto L_0x01fd
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0270 }
                r1.<init>(r8)     // Catch:{ all -> 0x0270 }
                java.lang.Object r2 = r4.get(r9)     // Catch:{ all -> 0x0270 }
                r1.append(r2)     // Catch:{ all -> 0x0270 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0270 }
                com.appsflyer.AFLogger.afDebugLog(r1)     // Catch:{ all -> 0x0270 }
            L_0x01fd:
                java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0270 }
                r4.put(r0, r1)     // Catch:{ all -> 0x0270 }
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0270 }
                r1.<init>(r4)     // Catch:{ all -> 0x0270 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0270 }
                java.lang.String r2 = "attributionId"
                if (r1 == 0) goto L_0x0217
                com.appsflyer.AppsFlyerLibCore r8 = r15.$$b     // Catch:{ all -> 0x0270 }
                android.app.Application r9 = r15.AFDateFormat     // Catch:{ all -> 0x0270 }
                com.appsflyer.AppsFlyerLibCore.AFDateFormat((com.appsflyer.AppsFlyerLibCore) r8, (android.content.Context) r9, (java.lang.String) r2, (java.lang.String) r1)     // Catch:{ all -> 0x0270 }
                goto L_0x021e
            L_0x0217:
                com.appsflyer.AppsFlyerLibCore r1 = r15.$$b     // Catch:{ all -> 0x0270 }
                android.app.Application r8 = r15.AFDateFormat     // Catch:{ all -> 0x0270 }
                com.appsflyer.AppsFlyerLibCore.AFDateFormat((com.appsflyer.AppsFlyerLibCore) r1, (android.content.Context) r8, (java.lang.String) r2, (java.lang.String) r10)     // Catch:{ all -> 0x0270 }
            L_0x021e:
                com.appsflyer.AppsFlyerConversionListener r1 = com.appsflyer.AppsFlyerLibCore.conversionDataListener     // Catch:{ all -> 0x0270 }
                if (r1 == 0) goto L_0x0267
                java.util.concurrent.atomic.AtomicInteger r1 = r15.AFDeepLinkManager     // Catch:{ all -> 0x0270 }
                int r1 = r1.intValue()     // Catch:{ all -> 0x0270 }
                if (r1 > r7) goto L_0x0267
                com.appsflyer.AppsFlyerLibCore r1 = r15.$$b     // Catch:{ u -> 0x0247 }
                android.app.Application r2 = r15.AFDateFormat     // Catch:{ u -> 0x0247 }
                java.util.Map r1 = com.appsflyer.AppsFlyerLibCore.valueOf((android.content.Context) r2)     // Catch:{ u -> 0x0247 }
                android.app.Application r2 = r15.AFDateFormat     // Catch:{ u -> 0x0247 }
                android.content.SharedPreferences r2 = com.appsflyer.AppsFlyerLibCore.getSharedPreferences(r2)     // Catch:{ u -> 0x0247 }
                java.lang.String r7 = "sixtyDayConversionData"
                boolean r2 = r2.getBoolean(r7, r6)     // Catch:{ u -> 0x0247 }
                if (r2 != 0) goto L_0x0245
                java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ u -> 0x0247 }
                r1.put(r0, r2)     // Catch:{ u -> 0x0247 }
            L_0x0245:
                r4 = r1
                goto L_0x024d
            L_0x0247:
                r0 = move-exception
                java.lang.String r1 = "Exception while trying to fetch attribution data. "
                com.appsflyer.AFLogger.afErrorLog(r1, r0)     // Catch:{ all -> 0x0270 }
            L_0x024d:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0270 }
                java.lang.String r1 = "[GCD-A02] Calling onConversionDataSuccess with:\n"
                r0.<init>(r1)     // Catch:{ all -> 0x0270 }
                java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0270 }
                r0.append(r1)     // Catch:{ all -> 0x0270 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0270 }
                com.appsflyer.AFLogger.afDebugLog(r0)     // Catch:{ all -> 0x0270 }
                com.appsflyer.AppsFlyerConversionListener r0 = com.appsflyer.AppsFlyerLibCore.conversionDataListener     // Catch:{ all -> 0x0270 }
                r0.onConversionDataSuccess(r4)     // Catch:{ all -> 0x0270 }
            L_0x0267:
                java.util.concurrent.atomic.AtomicInteger r0 = r15.AFDeepLinkManager
                r0.decrementAndGet()
                r5.disconnect()
                goto L_0x029d
            L_0x0270:
                r0 = move-exception
                r2 = r5
                goto L_0x0274
            L_0x0273:
                r0 = move-exception
            L_0x0274:
                int r1 = r15.dateFormatUTC     // Catch:{ all -> 0x02a8 }
                if (r1 >= r3) goto L_0x0285
                com.appsflyer.AppsFlyerLibCore$InstallAttributionIdFetcher r1 = new com.appsflyer.AppsFlyerLibCore$InstallAttributionIdFetcher     // Catch:{ all -> 0x02a8 }
                r1.<init>(r15)     // Catch:{ all -> 0x02a8 }
                java.util.concurrent.ScheduledExecutorService r3 = r1.values     // Catch:{ all -> 0x02a8 }
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x02a8 }
                com.appsflyer.AppsFlyerLibCore.AFDateFormat((java.util.concurrent.ScheduledExecutorService) r3, (java.lang.Runnable) r1, 10, (java.util.concurrent.TimeUnit) r4)     // Catch:{ all -> 0x02a8 }
                goto L_0x028c
            L_0x0285:
                java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x02a8 }
                valueOf(r1)     // Catch:{ all -> 0x02a8 }
            L_0x028c:
                java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x02a8 }
                com.appsflyer.AFLogger.afErrorLog(r1, r0)     // Catch:{ all -> 0x02a8 }
                java.util.concurrent.atomic.AtomicInteger r0 = r15.AFDeepLinkManager
                r0.decrementAndGet()
                if (r2 == 0) goto L_0x029d
                r2.disconnect()
            L_0x029d:
                java.util.concurrent.ScheduledExecutorService r0 = r15.values
                r0.shutdown()
                java.lang.String r0 = "[GCD-A03] Server retrieving attempt finished"
                com.appsflyer.AFLogger.afDebugLog(r0)
                return
            L_0x02a8:
                r0 = move-exception
                java.util.concurrent.atomic.AtomicInteger r1 = r15.AFDeepLinkManager
                r1.decrementAndGet()
                if (r2 == 0) goto L_0x02b3
                r2.disconnect()
            L_0x02b3:
                throw r0
            L_0x02b4:
                java.lang.String r0 = "[GCD-E05] AppsFlyer dev key is missing"
                com.appsflyer.AFLogger.afDebugLog(r0)
                java.lang.String r0 = "AppsFlyer dev key is missing"
                valueOf(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.InstallAttributionIdFetcher.run():void");
        }

        private InstallAttributionIdFetcher(AppsFlyerLibCore appsFlyerLibCore, Application application, String str) {
            this.values = AFExecutor.getInstance().$$a();
            this.AFDeepLinkManager = new AtomicInteger(0);
            this.$$b = appsFlyerLibCore;
            this.AFDateFormat = application;
            this.valueOf = str;
            this.dateFormatUTC = 0;
        }

        private InstallAttributionIdFetcher(InstallAttributionIdFetcher installAttributionIdFetcher) {
            this.values = AFExecutor.getInstance().$$a();
            this.AFDeepLinkManager = new AtomicInteger(0);
            this.$$b = installAttributionIdFetcher.$$b;
            this.AFDateFormat = installAttributionIdFetcher.AFDateFormat;
            this.valueOf = installAttributionIdFetcher.valueOf;
            this.dateFormatUTC = installAttributionIdFetcher.dateFormatUTC + 1;
        }
    }

    /* renamed from: com.appsflyer.AppsFlyerLibCore$b */
    public class C2042b implements Runnable {
        private final AFEvent $$b;

        public /* synthetic */ C2042b(AppsFlyerLibCore appsFlyerLibCore, AFEvent aFEvent, byte b) {
            this(aFEvent);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: byte[]} */
        /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
            r5.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x0261, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x0262, code lost:
            com.appsflyer.AFLogger.afErrorLog(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x0282, code lost:
            r0.onError(com.appsflyer.attribution.RequestError.NETWORK_FAILURE, r2.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0194, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0195, code lost:
            com.appsflyer.AFLogger.afErrorLog(r0.getMessage(), r0, true);
            r2 = r1.$$b.getRequestListener();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a2, code lost:
            if (r2 != null) goto L_0x01a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a4, code lost:
            r2.onError(com.appsflyer.attribution.RequestError.NETWORK_FAILURE, r0.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ae, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x01af, code lost:
            r2 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d5, code lost:
            r3.mkdir();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x01da, code lost:
            r3 = r3.listFiles();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x01de, code lost:
            if (r3 == null) goto L_0x01ec;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e5, code lost:
            com.appsflyer.AFLogger.afInfoLog("reached cache limit, not caching request");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ec, code lost:
            com.appsflyer.AFLogger.afInfoLog("caching request...");
            r3 = new java.io.File(com.appsflyer.internal.C2106y.valueOf(r4), java.lang.Long.toString(java.lang.System.currentTimeMillis()));
            r3.createNewFile();
            r4 = new java.io.OutputStreamWriter(new java.io.FileOutputStream(r3.getPath(), true));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
            r4.write("version=");
            r4.write(r0.$$b);
            r4.write(10);
            r4.write("url=");
            r4.write(r0.valueOf);
            r4.write(10);
            r4.write("data=");
            r4.write(android.util.Base64.encodeToString(r0.valueOf(), 2));
            r4.write(10);
            r4.flush();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x024b, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x024c, code lost:
            r2 = r0;
            r5 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x024f, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0250, code lost:
            r5 = r4;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x025d A[SYNTHETIC, Splitter:B:106:0x025d] */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x0270 A[SYNTHETIC, Splitter:B:112:0x0270] */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x0282  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0194 A[ExcHandler: all (r0v24 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:38:0x011e] */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01d5 A[Catch:{ Exception -> 0x0255 }] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01da A[Catch:{ Exception -> 0x0255 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r17 = this;
                r1 = r17
                com.appsflyer.AFEvent r0 = r1.$$b
                java.util.Map r2 = r0.params()
                com.appsflyer.AFEvent r0 = r1.$$b
                boolean r0 = r0.valueOf()
                com.appsflyer.AFEvent r3 = r1.$$b
                java.lang.String r3 = r3.urlString()
                com.appsflyer.AFEvent r4 = r1.$$b
                int r5 = r4.AFDeepLinkManager
                android.app.Application r4 = r4.context()
                com.appsflyer.AppsFlyerLibCore r6 = com.appsflyer.AppsFlyerLibCore.this
                boolean r6 = r6.isStopped()
                if (r6 == 0) goto L_0x0034
                com.appsflyer.AFEvent r0 = r1.$$b
                com.appsflyer.attribution.AppsFlyerRequestListener r0 = r0.getRequestListener()
                if (r0 == 0) goto L_0x0033
                int r2 = com.appsflyer.attribution.RequestError.STOP_TRACKING
                java.lang.String r3 = com.appsflyer.internal.attribution.RequestErrorMessage.STOP_TRACKING
                r0.onError(r2, r3)
            L_0x0033:
                return
            L_0x0034:
                r6 = 0
                byte[] r7 = new byte[r6]
                r8 = 2
                r9 = 1
                if (r0 == 0) goto L_0x010f
                if (r5 > r8) goto L_0x010f
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                com.appsflyer.AppsFlyerLibCore r10 = com.appsflyer.AppsFlyerLibCore.this
                com.appsflyer.internal.referrer.Referrer[] r10 = r10.AFLogger
                if (r10 == 0) goto L_0x00b3
                com.appsflyer.AppsFlyerLibCore r10 = com.appsflyer.AppsFlyerLibCore.this
                com.appsflyer.internal.referrer.Referrer[] r10 = r10.AFLogger
                int r11 = r10.length
                r12 = 0
            L_0x0052:
                if (r12 >= r11) goto L_0x00b3
                r13 = r10[r12]
                boolean r14 = r13 instanceof com.appsflyer.internal.referrer.GoogleReferrer
                int[] r15 = com.appsflyer.AppsFlyerLibCore.C20417.AFDateFormat
                com.appsflyer.internal.referrer.Referrer$State r16 = r13.getState()
                int r16 = r16.ordinal()
                r15 = r15[r16]
                if (r15 == r9) goto L_0x008e
                if (r15 == r8) goto L_0x0069
                goto L_0x00b0
            L_0x0069:
                if (r5 != r8) goto L_0x00b0
                if (r14 != 0) goto L_0x00b0
                java.util.HashMap r14 = new java.util.HashMap
                r14.<init>()
                java.lang.String r15 = "source"
                java.lang.String r13 = r13.getSource()
                r14.put(r15, r13)
                java.lang.String r13 = "response"
                java.lang.String r15 = "TIMEOUT"
                r14.put(r13, r15)
                com.appsflyer.internal.referrer.MandatoryFields r13 = new com.appsflyer.internal.referrer.MandatoryFields
                r13.<init>()
                r14.putAll(r13)
                r0.add(r14)
                goto L_0x00b0
            L_0x008e:
                if (r14 == 0) goto L_0x00ab
                java.lang.String r14 = "rfr"
                r15 = r13
                com.appsflyer.internal.referrer.GoogleReferrer r15 = (com.appsflyer.internal.referrer.GoogleReferrer) r15
                java.util.Map<java.lang.String, java.lang.Object> r15 = r15.oldMap
                r2.put(r14, r15)
                android.content.SharedPreferences r14 = com.appsflyer.AppsFlyerLibCore.getSharedPreferences(r4)
                android.content.SharedPreferences$Editor r14 = r14.edit()
                java.lang.String r15 = "newGPReferrerSent"
                android.content.SharedPreferences$Editor r14 = r14.putBoolean(r15, r9)
                r14.apply()
            L_0x00ab:
                java.util.Map<java.lang.String, java.lang.Object> r13 = r13.map
                r0.add(r13)
            L_0x00b0:
                int r12 = r12 + 1
                goto L_0x0052
            L_0x00b3:
                boolean r5 = r0.isEmpty()
                if (r5 != 0) goto L_0x00be
                java.lang.String r5 = "referrers"
                r2.put(r5, r0)
            L_0x00be:
                com.appsflyer.AppsFlyerLibCore r0 = com.appsflyer.AppsFlyerLibCore.this
                java.util.Map r0 = r0.toMap
                if (r0 == 0) goto L_0x00d1
                java.lang.String r0 = "fb_ddl"
                com.appsflyer.AppsFlyerLibCore r5 = com.appsflyer.AppsFlyerLibCore.this
                java.util.Map r5 = r5.toMap
                r2.put(r0, r5)
            L_0x00d1:
                com.appsflyer.AppsFlyerLibCore r0 = com.appsflyer.AppsFlyerLibCore.this
                boolean r0 = r0.$$b()
                if (r0 == 0) goto L_0x00e5
                java.lang.String r0 = "lvl"
                com.appsflyer.AppsFlyerLibCore r5 = com.appsflyer.AppsFlyerLibCore.this
                java.util.Map r5 = r5.toList
                r2.put(r0, r5)
                goto L_0x010f
            L_0x00e5:
                com.appsflyer.AppsFlyerLibCore r0 = com.appsflyer.AppsFlyerLibCore.this
                boolean r0 = r0.AFInAppEventParameterName
                if (r0 == 0) goto L_0x010f
                com.appsflyer.AppsFlyerLibCore r0 = com.appsflyer.AppsFlyerLibCore.this
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                java.util.Map unused = r0.toList = r5
                com.appsflyer.AppsFlyerLibCore r0 = com.appsflyer.AppsFlyerLibCore.this
                java.util.Map r0 = r0.toList
                java.lang.String r5 = "error"
                java.lang.String r10 = "operation timed out."
                r0.put(r5, r10)
                java.lang.String r0 = "lvl"
                com.appsflyer.AppsFlyerLibCore r5 = com.appsflyer.AppsFlyerLibCore.this
                java.util.Map r5 = r5.toList
                r2.put(r0, r5)
            L_0x010f:
                com.appsflyer.AFEvent r0 = r1.$$b
                boolean r0 = r0 instanceof com.appsflyer.internal.model.event.AdRevenue
                if (r0 != 0) goto L_0x011d
                com.appsflyer.internal.d$c r0 = new com.appsflyer.internal.d$c
                r0.<init>(r2, r4)
                r2.putAll(r0)
            L_0x011d:
                r5 = 0
                com.appsflyer.AFEvent r0 = r1.$$b     // Catch:{ IOException -> 0x01ae, all -> 0x0194 }
                boolean r10 = r0 instanceof com.appsflyer.internal.model.event.AdRevenue     // Catch:{ IOException -> 0x01ae, all -> 0x0194 }
                if (r10 == 0) goto L_0x012d
                java.lang.String r10 = "af_key"
                java.lang.Object r10 = r2.get(r10)     // Catch:{ IOException -> 0x01ae, all -> 0x0194 }
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ IOException -> 0x01ae, all -> 0x0194 }
                goto L_0x0135
            L_0x012d:
                java.lang.String r10 = "appsflyerKey"
                java.lang.Object r10 = r2.get(r10)     // Catch:{ IOException -> 0x01ae, all -> 0x0194 }
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ IOException -> 0x01ae, all -> 0x0194 }
            L_0x0135:
                r0.key(r10)     // Catch:{ IOException -> 0x01ae, all -> 0x0194 }
                monitor-enter(r2)     // Catch:{ IOException -> 0x01ae, all -> 0x0194 }
                com.appsflyer.AFEvent r0 = r1.$$b     // Catch:{ all -> 0x0191 }
                java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x0188 }
                r10[r6] = r0     // Catch:{ all -> 0x0188 }
                int r0 = android.view.ViewConfiguration.getJumpTapTimeout()     // Catch:{ all -> 0x0188 }
                int r0 = r0 >> 16
                int r0 = r0 + 48
                long r11 = android.view.ViewConfiguration.getGlobalActionKeyTimeout()     // Catch:{ all -> 0x0188 }
                r13 = 0
                int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                int r15 = r15 + -1
                char r11 = (char) r15     // Catch:{ all -> 0x0188 }
                int r12 = android.view.ViewConfiguration.getScrollDefaultDelay()     // Catch:{ all -> 0x0188 }
                int r12 = r12 >> 16
                int r12 = 24 - r12
                java.lang.Object r0 = com.appsflyer.internal.C2072c.$$a(r0, r11, r12)     // Catch:{ all -> 0x0188 }
                java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ all -> 0x0188 }
                java.lang.String r11 = "valueOf"
                java.lang.Class[] r12 = new java.lang.Class[r9]     // Catch:{ all -> 0x0188 }
                java.lang.Class<com.appsflyer.AFEvent> r13 = com.appsflyer.AFEvent.class
                r12[r6] = r13     // Catch:{ all -> 0x0188 }
                java.lang.reflect.Method r0 = r0.getMethod(r11, r12)     // Catch:{ all -> 0x0188 }
                java.lang.Object r0 = r0.invoke(r5, r10)     // Catch:{ all -> 0x0188 }
                r6 = r0
                byte[] r6 = (byte[]) r6     // Catch:{ all -> 0x0188 }
                monitor-exit(r2)     // Catch:{ all -> 0x0185 }
                com.appsflyer.AppsFlyerLibCore r0 = com.appsflyer.AppsFlyerLibCore.this     // Catch:{ IOException -> 0x0181, all -> 0x0194 }
                com.appsflyer.AFEvent r2 = r1.$$b     // Catch:{ IOException -> 0x0181, all -> 0x0194 }
                com.appsflyer.AFEvent r2 = r2.post(r6)     // Catch:{ IOException -> 0x0181, all -> 0x0194 }
                com.appsflyer.AppsFlyerLibCore.valueOf((com.appsflyer.AppsFlyerLibCore) r0, (com.appsflyer.AFEvent) r2)     // Catch:{ IOException -> 0x0181, all -> 0x0194 }
                return
            L_0x0181:
                r0 = move-exception
                r2 = r0
                r7 = r6
                goto L_0x01b0
            L_0x0185:
                r0 = move-exception
                r7 = r6
                goto L_0x0192
            L_0x0188:
                r0 = move-exception
                java.lang.Throwable r6 = r0.getCause()     // Catch:{ all -> 0x0191 }
                if (r6 == 0) goto L_0x0190
                throw r6     // Catch:{ all -> 0x0191 }
            L_0x0190:
                throw r0     // Catch:{ all -> 0x0191 }
            L_0x0191:
                r0 = move-exception
            L_0x0192:
                monitor-exit(r2)     // Catch:{ IOException -> 0x01ae, all -> 0x0194 }
                throw r0     // Catch:{ IOException -> 0x01ae, all -> 0x0194 }
            L_0x0194:
                r0 = move-exception
                java.lang.String r2 = r0.getMessage()
                com.appsflyer.AFLogger.afErrorLog(r2, r0, r9)
                com.appsflyer.AFEvent r2 = r1.$$b
                com.appsflyer.attribution.AppsFlyerRequestListener r2 = r2.getRequestListener()
                if (r2 == 0) goto L_0x01ad
                int r3 = com.appsflyer.attribution.RequestError.NETWORK_FAILURE
                java.lang.String r0 = r0.getMessage()
                r2.onError(r3, r0)
            L_0x01ad:
                return
            L_0x01ae:
                r0 = move-exception
                r2 = r0
            L_0x01b0:
                java.lang.String r0 = "Exception while sending request to server. "
                com.appsflyer.AFLogger.afErrorLog(r0, r2)
                if (r7 == 0) goto L_0x027a
                if (r4 == 0) goto L_0x027a
                java.lang.String r0 = "&isCachedRequest=true&timeincache="
                boolean r0 = r3.contains(r0)
                if (r0 != 0) goto L_0x027a
                com.appsflyer.internal.C2106y.AFDateFormat()
                com.appsflyer.internal.d$c$b r0 = new com.appsflyer.internal.d$c$b
                java.lang.String r6 = "6.1.4"
                r0.<init>(r3, r7, r6)
                java.io.File r3 = com.appsflyer.internal.C2106y.valueOf(r4)     // Catch:{ Exception -> 0x0255 }
                boolean r6 = r3.exists()     // Catch:{ Exception -> 0x0255 }
                if (r6 != 0) goto L_0x01da
                r3.mkdir()     // Catch:{ Exception -> 0x0255 }
                goto L_0x0266
            L_0x01da:
                java.io.File[] r3 = r3.listFiles()     // Catch:{ Exception -> 0x0255 }
                if (r3 == 0) goto L_0x01ec
                int r3 = r3.length     // Catch:{ Exception -> 0x0255 }
                r6 = 40
                if (r3 <= r6) goto L_0x01ec
                java.lang.String r0 = "reached cache limit, not caching request"
                com.appsflyer.AFLogger.afInfoLog(r0)     // Catch:{ Exception -> 0x0255 }
                goto L_0x0266
            L_0x01ec:
                java.lang.String r3 = "caching request..."
                com.appsflyer.AFLogger.afInfoLog(r3)     // Catch:{ Exception -> 0x0255 }
                java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0255 }
                java.io.File r4 = com.appsflyer.internal.C2106y.valueOf(r4)     // Catch:{ Exception -> 0x0255 }
                long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0255 }
                java.lang.String r6 = java.lang.Long.toString(r6)     // Catch:{ Exception -> 0x0255 }
                r3.<init>(r4, r6)     // Catch:{ Exception -> 0x0255 }
                r3.createNewFile()     // Catch:{ Exception -> 0x0255 }
                java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0255 }
                java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0255 }
                java.lang.String r3 = r3.getPath()     // Catch:{ Exception -> 0x0255 }
                r6.<init>(r3, r9)     // Catch:{ Exception -> 0x0255 }
                r4.<init>(r6)     // Catch:{ Exception -> 0x0255 }
                java.lang.String r3 = "version="
                r4.write(r3)     // Catch:{ Exception -> 0x024f, all -> 0x024b }
                java.lang.String r3 = r0.$$b     // Catch:{ Exception -> 0x024f, all -> 0x024b }
                r4.write(r3)     // Catch:{ Exception -> 0x024f, all -> 0x024b }
                r3 = 10
                r4.write(r3)     // Catch:{ Exception -> 0x024f, all -> 0x024b }
                java.lang.String r5 = "url="
                r4.write(r5)     // Catch:{ Exception -> 0x024f, all -> 0x024b }
                java.lang.String r5 = r0.valueOf     // Catch:{ Exception -> 0x024f, all -> 0x024b }
                r4.write(r5)     // Catch:{ Exception -> 0x024f, all -> 0x024b }
                r4.write(r3)     // Catch:{ Exception -> 0x024f, all -> 0x024b }
                java.lang.String r5 = "data="
                r4.write(r5)     // Catch:{ Exception -> 0x024f, all -> 0x024b }
                byte[] r0 = r0.valueOf()     // Catch:{ Exception -> 0x024f, all -> 0x024b }
                java.lang.String r0 = android.util.Base64.encodeToString(r0, r8)     // Catch:{ Exception -> 0x024f, all -> 0x024b }
                r4.write(r0)     // Catch:{ Exception -> 0x024f, all -> 0x024b }
                r4.write(r3)     // Catch:{ Exception -> 0x024f, all -> 0x024b }
                r4.flush()     // Catch:{ Exception -> 0x024f, all -> 0x024b }
                r4.close()     // Catch:{ IOException -> 0x0261 }
                goto L_0x0266
            L_0x024b:
                r0 = move-exception
                r2 = r0
                r5 = r4
                goto L_0x026e
            L_0x024f:
                r0 = move-exception
                r5 = r4
                goto L_0x0256
            L_0x0252:
                r0 = move-exception
                r2 = r0
                goto L_0x026e
            L_0x0255:
                r0 = move-exception
            L_0x0256:
                java.lang.String r3 = "Could not cache request"
                com.appsflyer.AFLogger.afErrorLog(r3, r0)     // Catch:{ all -> 0x0252 }
                if (r5 == 0) goto L_0x0266
                r5.close()     // Catch:{ IOException -> 0x0261 }
                goto L_0x0266
            L_0x0261:
                r0 = move-exception
                r3 = r0
                com.appsflyer.AFLogger.afErrorLog(r3)
            L_0x0266:
                java.lang.String r0 = r2.getMessage()
                com.appsflyer.AFLogger.afErrorLog(r0, r2)
                goto L_0x027a
            L_0x026e:
                if (r5 == 0) goto L_0x0279
                r5.close()     // Catch:{ IOException -> 0x0274 }
                goto L_0x0279
            L_0x0274:
                r0 = move-exception
                r3 = r0
                com.appsflyer.AFLogger.afErrorLog(r3)
            L_0x0279:
                throw r2
            L_0x027a:
                com.appsflyer.AFEvent r0 = r1.$$b
                com.appsflyer.attribution.AppsFlyerRequestListener r0 = r0.getRequestListener()
                if (r0 == 0) goto L_0x028b
                int r3 = com.appsflyer.attribution.RequestError.NETWORK_FAILURE
                java.lang.String r4 = r2.getMessage()
                r0.onError(r3, r4)
            L_0x028b:
                java.lang.String r0 = r2.getMessage()
                com.appsflyer.AppsFlyerLibCore.InstallAttributionIdFetcher.valueOf(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.C2042b.run():void");
        }

        private C2042b(AFEvent aFEvent) {
            this.$$b = aFEvent;
        }
    }

    /* renamed from: com.appsflyer.AppsFlyerLibCore$c */
    public class C2043c implements Runnable {
        private final Application valueOf;

        public C2043c(Context context) {
            this.valueOf = (Application) context.getApplicationContext();
        }

        public final void run() {
            if (!AppsFlyerLibCore.this.requestListener) {
                AppsFlyerLibCore.this.valueOf = System.currentTimeMillis();
                boolean unused = AppsFlyerLibCore.this.requestListener = true;
                try {
                    String property = AppsFlyerLibCore.this.getProperty(AppsFlyerProperties.AF_KEY);
                    C2106y.AFDateFormat();
                    for (C2073d.C2074c.C2075b next : C2106y.$$b(this.valueOf)) {
                        StringBuilder sb = new StringBuilder("resending request: ");
                        sb.append(next.valueOf);
                        AFLogger.afInfoLog(sb.toString());
                        try {
                            long currentTimeMillis = System.currentTimeMillis();
                            long parseLong = Long.parseLong(next.AFDateFormat, 10);
                            AppsFlyerLibCore appsFlyerLibCore = AppsFlyerLibCore.this;
                            CachedEvent cachedEvent = new CachedEvent();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(next.valueOf);
                            sb2.append("&isCachedRequest=true&timeincache=");
                            sb2.append((currentTimeMillis - parseLong) / 1000);
                            AFEvent context = cachedEvent.urlString(sb2.toString()).post(next.valueOf()).key(property).context(this.valueOf);
                            context.$$a = next.AFDateFormat;
                            context.getInstance = false;
                            AppsFlyerLibCore.valueOf(appsFlyerLibCore, context);
                        } catch (Exception e) {
                            AFLogger.afErrorLog("Failed to resend cached request", e);
                        }
                    }
                } catch (Exception e2) {
                    AFLogger.afErrorLog("failed to check cache. ", e2);
                } catch (Throwable th) {
                    boolean unused2 = AppsFlyerLibCore.this.requestListener = false;
                    throw th;
                }
                boolean unused3 = AppsFlyerLibCore.this.requestListener = false;
                AppsFlyerLibCore.this.isEncrypt.shutdown();
                ScheduledExecutorService unused4 = AppsFlyerLibCore.this.isEncrypt = null;
            }
        }
    }

    /* renamed from: com.appsflyer.AppsFlyerLibCore$e */
    public class C2044e implements Runnable {
        private AFEvent $$b;

        public /* synthetic */ C2044e(AppsFlyerLibCore appsFlyerLibCore, AFEvent aFEvent, byte b) {
            this(aFEvent);
        }

        public final void run() {
            AppsFlyerLibCore.$$a(AppsFlyerLibCore.this, this.$$b);
        }

        private C2044e(AFEvent aFEvent) {
            this.$$b = aFEvent;
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SERVER_BUILD_NUMBER);
        sb.append("/androidevent?buildnumber=6.1.4&app_id=");
        BUILD_URL_SUFFIX = sb.toString();
        StringBuilder sb2 = new StringBuilder("https://%sadrevenue.%s/api/v");
        sb2.append(SERVER_BUILD_NUMBER);
        sb2.append("/android?buildnumber=6.1.4&app_id=");
        AFDeepLinkManager = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(SERVER_BUILD_NUMBER);
        sb3.append("/androidevent?app_id=");
        String obj = sb3.toString();
        dateFormatUTC = obj;
        StringBuilder sb4 = new StringBuilder("https://%sconversions.%s/api/v");
        sb4.append(obj);
        FIRST_LAUNCHES_URL = sb4.toString();
        StringBuilder sb5 = new StringBuilder("https://%slaunches.%s/api/v");
        sb5.append(obj);
        getDataFormatter = sb5.toString();
        StringBuilder sb6 = new StringBuilder("https://%sinapps.%s/api/v");
        sb6.append(obj);
        getInstance = sb6.toString();
        StringBuilder sb7 = new StringBuilder("https://%sattr.%s/api/v");
        sb7.append(obj);
        REFERRER_TRACKING_URL = sb7.toString();
    }

    public AppsFlyerLibCore() {
        AFVersionDeclaration.init();
    }

    public static boolean firstCallSent(SharedPreferences sharedPreferences) {
        return Boolean.parseBoolean(sharedPreferences.getString("sentSuccessfully", (String) null));
    }

    public static SharedPreferences getSharedPreferences(Context context2) {
        if (getInstance().AFInAppEventType == null) {
            getInstance().AFInAppEventType = context2.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
        }
        return getInstance().AFInAppEventType;
    }

    public static void setUrl(Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getValue();
            String str2 = (String) next.getKey();
            char c = 65535;
            switch (str2.hashCode()) {
                case -1407250527:
                    if (str2.equals("launches")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1184318185:
                    if (str2.equals("inapps")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1084269027:
                    if (str2.equals("conversions")) {
                        c = 0;
                        break;
                    }
                    break;
                case -690213213:
                    if (str2.equals("register")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3004913:
                    if (str2.equals("attr")) {
                        c = 1;
                        break;
                    }
                    break;
                case 57793177:
                    if (str2.equals("adrevenue")) {
                        c = 6;
                        break;
                    }
                    break;
                case 109757599:
                    if (str2.equals("stats")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    FIRST_LAUNCHES_URL = str;
                    break;
                case 1:
                    REFERRER_TRACKING_URL = str;
                    break;
                case 2:
                    getDataFormatter = str;
                    break;
                case 3:
                    getInstance = str;
                    break;
                case 4:
                    Register.URL = str;
                    break;
                case 5:
                    collectIntentsFromActivities = str;
                    break;
                case 6:
                    AFDeepLinkManager = str;
                    break;
            }
        }
    }

    public void addNetworkData(Context context2, Map<String, ? super String> map) {
        C2089q qVar = C2089q.C2091e.values;
        C2089q.C2090c $$b2 = C2089q.$$b(context2);
        map.put(ServerParameters.NETWORK, $$b2.valueOf);
        String str = $$b2.values;
        if (str != null) {
            map.put(ServerParameters.OPERATOR, str);
        }
        String str2 = $$b2.$$a;
        if (str2 != null) {
            map.put(ServerParameters.CARRIER, str2);
        }
    }

    public void addPushNotificationDeepLinkPath(String... strArr) {
        List asList = Arrays.asList(strArr);
        List<List<String>> list = AFDeepLinkManager.getInstance().deepLinkSearchPaths;
        if (!list.contains(asList)) {
            list.add(asList);
        }
    }

    public void anonymizeUser(boolean z) {
        C2069ad.$$a().AFDateFormat("public_api_call", "anonymizeUser", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("deviceTrackingDisabled", z);
    }

    public void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        AFDeepLinkManager instance2 = AFDeepLinkManager.getInstance();
        instance2.contains = str;
        instance2.parameters = map;
    }

    public void enableFacebookDeferredApplinks(boolean z) {
        this.AFHelper = z;
    }

    public AppsFlyerLib enableLocationCollection(boolean z) {
        this.addParams = z;
        return this;
    }

    public EventDataCollector eventDataCollector(Context context2) {
        if (this.eventDataCollector == null) {
            this.eventDataCollector = new EventDataCollector(context2);
        }
        return this.eventDataCollector;
    }

    public String getAppsFlyerUID(Context context2) {
        C2069ad.$$a().AFDateFormat("public_api_call", "getAppsFlyerUID", new String[0]);
        return Installation.m5498id(new WeakReference(context2));
    }

    public String getAttributionId(Context context2) {
        try {
            return new C2102v(context2).$$b();
        } catch (Throwable th) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", th);
            return null;
        }
    }

    public String getConfiguredChannel(Context context2) {
        String string = AppsFlyerProperties.getInstance().getString("channel");
        if (string == null) {
            if (context2 == null) {
                string = null;
            } else {
                string = valueOf("CHANNEL", context2.getPackageManager(), context2.getPackageName());
            }
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }

    public String getCustomerUserId() {
        return getProperty(AppsFlyerProperties.APP_USER_ID);
    }

    public String getHostName() {
        String property = getProperty("custom_host");
        return property != null ? property : ServerParameters.DEFAULT_HOST;
    }

    public String getHostPrefix() {
        String property = getProperty("custom_host_prefix");
        return property != null ? property : "";
    }

    public final int getLaunchCounter(SharedPreferences sharedPreferences, boolean z) {
        return AFDateFormat(sharedPreferences, "appsFlyerCount", z);
    }

    public String getOutOfStore(Context context2) {
        String str;
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            return string;
        }
        if (context2 == null) {
            str = null;
        } else {
            str = valueOf("AF_STORE", context2.getPackageManager(), context2.getPackageName());
        }
        if (str != null) {
            return str;
        }
        AFLogger.afInfoLog("No out-of-store value set");
        return null;
    }

    public String getProperty(String str) {
        return AppsFlyerProperties.getInstance().getString(str);
    }

    public Referrer[] getReferrers() {
        return this.AFLogger;
    }

    public String getSdkVersion() {
        C2069ad.$$a().AFDateFormat("public_api_call", "getSdkVersion", new String[0]);
        StringBuilder sb = new StringBuilder("version: 6.1.4 (build ");
        sb.append(values);
        sb.append(")");
        return sb.toString();
    }

    public void handleDeepLinkCallback(Context context2, Map<String, Object> map, Uri uri) {
        String str;
        if (!map.containsKey(ServerParameters.DEEP_LINK)) {
            String obj = uri.toString();
            if (obj == null) {
                obj = null;
            } else if (obj.matches("fb\\d*?://authorize.*") && obj.contains("access_token")) {
                int indexOf = obj.indexOf(63);
                if (indexOf == -1) {
                    str = "";
                } else {
                    str = obj.substring(indexOf);
                }
                if (str.length() != 0) {
                    ArrayList arrayList = new ArrayList();
                    if (str.contains("&")) {
                        arrayList = new ArrayList(Arrays.asList(str.split("&")));
                    } else {
                        arrayList.add(str);
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (str2.contains("access_token")) {
                            it.remove();
                        } else {
                            if (sb.length() != 0) {
                                sb.append("&");
                            } else if (!str2.startsWith("?")) {
                                sb.append("?");
                            }
                            sb.append(str2);
                        }
                    }
                    obj = obj.replace(str, sb.toString());
                }
            }
            AFDeepLinkManager instance2 = AFDeepLinkManager.getInstance();
            String str3 = instance2.contains;
            if (!(str3 == null || instance2.parameters == null || !obj.contains(str3))) {
                Uri.Builder buildUpon = Uri.parse(obj).buildUpon();
                Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry next : instance2.parameters.entrySet()) {
                    buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
                    buildUpon2.appendQueryParameter((String) next.getKey(), (String) next.getValue());
                }
                obj = buildUpon.build().toString();
                map.put("appended_query_params", buildUpon2.build().getEncodedQuery());
            }
            map.put(ServerParameters.DEEP_LINK, obj);
        }
        final HashMap hashMap = new HashMap();
        hashMap.put(WebViewActivity.EXTRA_LINK, uri.toString());
        C2104x xVar = new C2104x(uri, this);
        if (xVar.AFDateFormat) {
            map.put(ServerParameters.IS_BRANDED, Boolean.TRUE);
        }
        xVar.setConnProvider(new OneLinkHttpTask.HttpsUrlConnectionProvider());
        AndroidUtils.values(context2, hashMap, uri);
        if (xVar.values()) {
            xVar.$$b = new C2104x.C2105a() {
                public final void $$b(Map<String, String> map) {
                    for (String next : map.keySet()) {
                        hashMap.put(next, map.get(next));
                    }
                    DeepLinkCallbacks.onDeepLinkingSuccess(hashMap);
                }

                public final void valueOf(String str) {
                    DeepLinkCallbacks.onDeepLinkingError(str);
                }
            };
            AFExecutor.getInstance().getThreadPoolExecutor().execute(xVar);
            return;
        }
        DeepLinkCallbacks.onDeepLinkingSuccess(hashMap);
    }

    public AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context2) {
        String str2;
        if (this.onAppLinkFetchFinished) {
            return this;
        }
        this.onAppLinkFetchFinished = true;
        if (context2 != null) {
            eventDataCollector(context2).init();
            this.onAppLinkFetchFailed = (Application) context2.getApplicationContext();
            final GoogleReferrer googleReferrer = new GoogleReferrer(new Runnable() {
                public final void run() {
                    try {
                        AFLogger.afDebugLog("Install Referrer collected locally");
                        AFEvent context = new Attr().context(AppsFlyerLibCore.this.onAppLinkFetchFailed);
                        AppsFlyerLibCore appsFlyerLibCore = AppsFlyerLibCore.this;
                        if (appsFlyerLibCore.$$a(context, AppsFlyerLibCore.getSharedPreferences(appsFlyerLibCore.onAppLinkFetchFailed))) {
                            AppsFlyerLibCore.$$a(AppsFlyerLibCore.this, context);
                        }
                    } catch (Throwable th) {
                        AFLogger.afErrorLog(th.getMessage(), th);
                    }
                }
            });
            C20351 r4 = new Runnable() {
                public final void run() {
                    SharedPreferences sharedPreferences = AppsFlyerLibCore.getSharedPreferences(AppsFlyerLibCore.this.onAppLinkFetchFailed);
                    boolean z = false;
                    int launchCounter = AppsFlyerLibCore.this.getLaunchCounter(sharedPreferences, false);
                    boolean z2 = sharedPreferences.getBoolean(AppsFlyerProperties.NEW_REFERRER_SENT, false);
                    if (googleReferrer.getState() == Referrer.State.NOT_STARTED) {
                        z = true;
                    }
                    if (launchCounter != 1) {
                        return;
                    }
                    if (z || z2) {
                        AppsFlyerLibCore.$$a(AppsFlyerLibCore.this, new Attr().context(AppsFlyerLibCore.this.onAppLinkFetchFailed));
                    }
                }
            };
            Referrer[] referrerArr = {googleReferrer, new HuaweiReferrer(r4), new SamsungReferrer(r4)};
            this.AFLogger = referrerArr;
            for (Referrer start : referrerArr) {
                start.start(this.onAppLinkFetchFailed);
            }
            this.AFInAppEventParameterName = AFDateFormat(context2);
            Exlytics.setContext(this.onAppLinkFetchFailed);
        } else {
            AFLogger.afWarnLog("context is null, Google Install Referrer will be not initialized");
        }
        C2069ad $$a2 = C2069ad.$$a();
        String[] strArr = new String[2];
        strArr[0] = str;
        if (appsFlyerConversionListener == null) {
            str2 = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        } else {
            str2 = "conversionDataListener";
        }
        strArr[1] = str2;
        $$a2.AFDateFormat("public_api_call", "init", strArr);
        AFLogger.valueOf(String.format("Initializing AppsFlyer SDK: (v%s.%s)", new Object[]{"6.1.4", values}));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_KEY, str);
        C2103w.valueOf(str);
        conversionDataListener = appsFlyerConversionListener;
        return this;
    }

    public boolean isAppsFlyerFirstLaunch(Context context2) {
        if (!getSharedPreferences(context2).contains("appsFlyerCount")) {
            return true;
        }
        return false;
    }

    public boolean isPreInstalledApp(Context context2) {
        try {
            if ((context2.getPackageManager().getApplicationInfo(context2.getPackageName(), 0).flags & 1) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e);
        }
    }

    public boolean isStopped() {
        return this.toJsonObject;
    }

    public void logEvent(Context context2, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap;
        AFEvent context3 = new InAppEvent().context(context2);
        context3.values = str;
        Activity activity = null;
        if (map == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap(map);
        }
        context3.$$b = hashMap;
        AFEvent requestListener2 = context3.requestListener(appsFlyerRequestListener);
        C2069ad $$a2 = C2069ad.$$a();
        String[] strArr = new String[2];
        strArr[0] = str;
        Map map2 = requestListener2.$$b;
        if (map2 == null) {
            map2 = new HashMap();
        }
        strArr[1] = new JSONObject(map2).toString();
        $$a2.AFDateFormat("public_api_call", "logEvent", strArr);
        if (str != null) {
            AFSensorManager values2 = AFSensorManager.values(context2);
            long currentTimeMillis = System.currentTimeMillis();
            long j = values2.collectIntentsFromActivities;
            if (j != 0) {
                values2.getDataFormatter++;
                if (j - currentTimeMillis < 500) {
                    values2.valueOf.removeCallbacks(values2.values);
                    values2.valueOf.post(values2.AFDateFormat);
                }
            } else {
                values2.valueOf.post(values2.dateFormatUTC);
                values2.valueOf.post(values2.AFDateFormat);
            }
            values2.collectIntentsFromActivities = currentTimeMillis;
        }
        if (context2 instanceof Activity) {
            activity = (Activity) context2;
        }
        $$b(requestListener2, activity);
    }

    public void logLocation(Context context2, double d, double d2) {
        C2069ad.$$a().AFDateFormat("public_api_call", "logLocation", String.valueOf(d), String.valueOf(d2));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGTITUDE, Double.toString(d2));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d));
        values(context2, AFInAppEventType.LOCATION_COORDINATES, (Map<String, Object>) hashMap);
    }

    public void logSession(Context context2) {
        C2069ad.$$a().AFDateFormat("public_api_call", "logSession", new String[0]);
        C2069ad.$$a().$$a = false;
        values(context2, (String) null, (Map<String, Object>) null);
    }

    public void onPause(Context context2) {
        Foreground.Listener listener = Foreground.listener;
        if (listener != null) {
            listener.onBecameBackground(context2);
        }
    }

    public void performOnAppAttribution(Context context2, URI uri) {
        if (uri == null || uri.toString().isEmpty()) {
            StringBuilder sb = new StringBuilder("Link is \"");
            sb.append(uri);
            sb.append("\"");
            DeepLinkCallbacks.onDeepLinkingError(sb.toString());
        } else if (context2 == null) {
            StringBuilder sb2 = new StringBuilder("Context is \"");
            sb2.append(context2);
            sb2.append("\"");
            DeepLinkCallbacks.onDeepLinkingError(sb2.toString());
        } else {
            AFDeepLinkManager.getInstance().AFDateFormat(context2, (Map<String, Object>) new HashMap(), Uri.parse(uri.toString()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0064 A[SYNTHETIC, Splitter:B:29:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069 A[Catch:{ all -> 0x003b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String readServerResponse(java.net.HttpURLConnection r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.InputStream r2 = r8.getErrorStream()     // Catch:{ all -> 0x0047 }
            if (r2 != 0) goto L_0x0010
            java.io.InputStream r2 = r8.getInputStream()     // Catch:{ all -> 0x0047 }
        L_0x0010:
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0047 }
            r3.<init>(r2)     // Catch:{ all -> 0x0047 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0045 }
            r2.<init>(r3)     // Catch:{ all -> 0x0045 }
            r1 = 0
        L_0x001b:
            java.lang.String r4 = r2.readLine()     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x0034
            if (r1 == 0) goto L_0x002a
            r1 = 10
            java.lang.Character r1 = java.lang.Character.valueOf(r1)     // Catch:{ all -> 0x0040 }
            goto L_0x002c
        L_0x002a:
            java.lang.String r1 = ""
        L_0x002c:
            r0.append(r1)     // Catch:{ all -> 0x0040 }
            r0.append(r4)     // Catch:{ all -> 0x0040 }
            r1 = 1
            goto L_0x001b
        L_0x0034:
            r2.close()     // Catch:{ all -> 0x003b }
            r3.close()     // Catch:{ all -> 0x003b }
            goto L_0x006c
        L_0x003b:
            r8 = move-exception
            com.appsflyer.AFLogger.afErrorLog(r8)
            goto L_0x006c
        L_0x0040:
            r1 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x0049
        L_0x0045:
            r2 = move-exception
            goto L_0x0049
        L_0x0047:
            r2 = move-exception
            r3 = r1
        L_0x0049:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            java.lang.String r5 = "Could not read connection response from: "
            r4.<init>(r5)     // Catch:{ all -> 0x008f }
            java.net.URL r8 = r8.getURL()     // Catch:{ all -> 0x008f }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x008f }
            r4.append(r8)     // Catch:{ all -> 0x008f }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x008f }
            com.appsflyer.AFLogger.afErrorLog(r8, r2)     // Catch:{ all -> 0x008f }
            if (r1 == 0) goto L_0x0067
            r1.close()     // Catch:{ all -> 0x003b }
        L_0x0067:
            if (r3 == 0) goto L_0x006c
            r3.close()     // Catch:{ all -> 0x003b }
        L_0x006c:
            java.lang.String r8 = r0.toString()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0076 }
            r0.<init>(r8)     // Catch:{ JSONException -> 0x0076 }
            return r8
        L_0x0076:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "string_response"
            r0.put(r1, r8)     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r8 = r0.toString()     // Catch:{ JSONException -> 0x0085 }
            return r8
        L_0x0085:
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r8 = r8.toString()
            return r8
        L_0x008f:
            r8 = move-exception
            if (r1 == 0) goto L_0x0098
            r1.close()     // Catch:{ all -> 0x0096 }
            goto L_0x0098
        L_0x0096:
            r0 = move-exception
            goto L_0x009e
        L_0x0098:
            if (r3 == 0) goto L_0x00a1
            r3.close()     // Catch:{ all -> 0x0096 }
            goto L_0x00a1
        L_0x009e:
            com.appsflyer.AFLogger.afErrorLog(r0)
        L_0x00a1:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.readServerResponse(java.net.HttpURLConnection):java.lang.String");
    }

    public void registerConversionListener(Context context2, AppsFlyerConversionListener appsFlyerConversionListener) {
        C2069ad.$$a().AFDateFormat("public_api_call", "registerConversionListener", new String[0]);
        if (appsFlyerConversionListener != null) {
            conversionDataListener = appsFlyerConversionListener;
        }
    }

    public void registerValidatorListener(Context context2, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        C2069ad.$$a().AFDateFormat("public_api_call", "registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            AFLogger.afDebugLog("registerValidatorListener null listener");
        } else {
            AFDateFormat = appsFlyerInAppPurchaseValidatorListener;
        }
    }

    public void sendAdRevenue(Context context2, Map<String, Object> map) {
        AFEvent context3 = new AdRevenue().context(context2);
        context3.$$b = map;
        Application context4 = context3.context();
        StringBuilder k = C13555b.m33972k(ServerConfigHandler.getUrl(AFDeepLinkManager));
        k.append(context4.getPackageName());
        String obj = k.toString();
        SharedPreferences sharedPreferences = getSharedPreferences(context4);
        int launchCounter = getLaunchCounter(sharedPreferences, false);
        int AFDateFormat2 = AFDateFormat(sharedPreferences, "appsFlyerAdRevenueCount", true);
        HashMap hashMap = new HashMap();
        hashMap.put(ServerParameters.AD_REVENUE_PAYLOAD, context3.$$b);
        hashMap.put(ServerParameters.AD_REVENUE_COUNTER, Integer.valueOf(AFDateFormat2));
        String property = getProperty(AppsFlyerProperties.AF_KEY);
        hashMap.put("af_key", property);
        hashMap.put(ServerParameters.LAUNCH_COUNTER, Integer.valueOf(launchCounter));
        hashMap.put(ServerParameters.TIMESTAMP, Long.toString(new Date().getTime()));
        hashMap.put(ServerParameters.AF_USER_ID, Installation.m5498id(new WeakReference(context4)));
        String string = AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM);
        hashMap.put(ServerParameters.ADVERTISING_ID_ENABLED_PARAM, AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_ENABLED_PARAM));
        if (string != null) {
            hashMap.put(ServerParameters.ADVERTISING_ID_PARAM, string);
        }
        hashMap.put(ServerParameters.DEVICE_KEY, Build.DEVICE);
        $$a((Context) context4, (Map<String, Object>) hashMap);
        try {
            PackageInfo packageInfo = context4.getPackageManager().getPackageInfo(context4.getPackageName(), 0);
            hashMap.put(ServerParameters.APP_VERSION_CODE, Integer.toString(packageInfo.versionCode));
            SimpleDateFormat dataFormatter = AFDateFormat.getDataFormatter(INSTALL_UPDATE_DATE_FORMAT);
            hashMap.put("install_date", dateFormatUTC(dataFormatter, packageInfo.firstInstallTime));
            String string2 = sharedPreferences.getString("appsFlyerFirstInstall", (String) null);
            if (string2 == null) {
                string2 = values(dataFormatter, (Context) context4);
            }
            hashMap.put("first_launch_date", string2);
        } catch (Throwable th) {
            AFLogger.afErrorLog("AdRevenue - Exception while collecting app version data ", th);
        }
        AFEvent addParams2 = context3.urlString(obj).addParams(hashMap);
        addParams2.AFDeepLinkManager = launchCounter;
        AFDateFormat((ScheduledExecutorService) AFExecutor.getInstance().$$a(), (Runnable) new C2042b(this, addParams2.key(property), (byte) 0), 1, TimeUnit.MILLISECONDS);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void sendPushNotificationData(android.app.Activity r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "c"
            java.lang.String r2 = "pid"
            r3 = 1
            r4 = 0
            r5 = 2
            java.lang.String r6 = "public_api_call"
            java.lang.String r7 = "sendPushNotificationData"
            if (r17 == 0) goto L_0x003d
            android.content.Intent r8 = r17.getIntent()
            if (r8 == 0) goto L_0x003d
            com.appsflyer.internal.ad r8 = com.appsflyer.internal.C2069ad.$$a()
            java.lang.String[] r9 = new java.lang.String[r5]
            java.lang.String r10 = r17.getLocalClassName()
            r9[r4] = r10
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r10 = "activity_intent_"
            r4.<init>(r10)
            android.content.Intent r10 = r17.getIntent()
            java.lang.String r10 = r10.toString()
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            r9[r3] = r4
            r8.AFDateFormat(r6, r7, r9)
            goto L_0x0060
        L_0x003d:
            if (r17 == 0) goto L_0x0053
            com.appsflyer.internal.ad r8 = com.appsflyer.internal.C2069ad.$$a()
            java.lang.String[] r9 = new java.lang.String[r5]
            java.lang.String r10 = r17.getLocalClassName()
            r9[r4] = r10
            java.lang.String r4 = "activity_intent_null"
            r9[r3] = r4
            r8.AFDateFormat(r6, r7, r9)
            goto L_0x0060
        L_0x0053:
            com.appsflyer.internal.ad r3 = com.appsflyer.internal.C2069ad.$$a()
            java.lang.String r4 = "activity_null"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            r3.AFDateFormat(r6, r7, r4)
        L_0x0060:
            java.lang.String r3 = values((android.app.Activity) r17)
            r1.key = r3
            if (r3 == 0) goto L_0x016d
            long r3 = java.lang.System.currentTimeMillis()
            java.util.Map<java.lang.Long, java.lang.String> r6 = r1.AFExecutor
            java.lang.String r7 = ")"
            if (r6 != 0) goto L_0x0081
            java.lang.String r0 = "pushes: initializing pushes history.."
            com.appsflyer.AFLogger.afInfoLog(r0)
            j$.util.concurrent.ConcurrentHashMap r0 = new j$.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.AFExecutor = r0
            r10 = r3
            goto L_0x012f
        L_0x0081:
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0114 }
            java.lang.String r8 = "pushPayloadMaxAging"
            r9 = 1800000(0x1b7740, double:8.89318E-318)
            long r8 = r6.getLong(r8, r9)     // Catch:{ all -> 0x0114 }
            java.util.Map<java.lang.Long, java.lang.String> r6 = r1.AFExecutor     // Catch:{ all -> 0x0114 }
            java.util.Set r6 = r6.keySet()     // Catch:{ all -> 0x0114 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0114 }
            r10 = r3
        L_0x0099:
            boolean r12 = r6.hasNext()     // Catch:{ all -> 0x0112 }
            if (r12 == 0) goto L_0x012f
            java.lang.Object r12 = r6.next()     // Catch:{ all -> 0x0112 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x0112 }
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ all -> 0x0112 }
            java.lang.String r14 = r1.key     // Catch:{ all -> 0x0112 }
            r13.<init>(r14)     // Catch:{ all -> 0x0112 }
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ all -> 0x0112 }
            java.util.Map<java.lang.Long, java.lang.String> r15 = r1.AFExecutor     // Catch:{ all -> 0x0112 }
            java.lang.Object r15 = r15.get(r12)     // Catch:{ all -> 0x0112 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0112 }
            r14.<init>(r15)     // Catch:{ all -> 0x0112 }
            java.lang.Object r15 = r13.opt(r2)     // Catch:{ all -> 0x0112 }
            java.lang.Object r5 = r14.opt(r2)     // Catch:{ all -> 0x0112 }
            boolean r5 = r15.equals(r5)     // Catch:{ all -> 0x0112 }
            if (r5 == 0) goto L_0x00f5
            java.lang.Object r5 = r13.opt(r0)     // Catch:{ all -> 0x0112 }
            java.lang.Object r15 = r14.opt(r0)     // Catch:{ all -> 0x0112 }
            boolean r5 = r5.equals(r15)     // Catch:{ all -> 0x0112 }
            if (r5 == 0) goto L_0x00f5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            java.lang.String r2 = "PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: "
            r0.<init>(r2)     // Catch:{ all -> 0x0112 }
            r0.append(r14)     // Catch:{ all -> 0x0112 }
            java.lang.String r2 = ", new: "
            r0.append(r2)     // Catch:{ all -> 0x0112 }
            r0.append(r13)     // Catch:{ all -> 0x0112 }
            r0.append(r7)     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0112 }
            com.appsflyer.AFLogger.afInfoLog(r0)     // Catch:{ all -> 0x0112 }
            r0 = 0
            r1.key = r0     // Catch:{ all -> 0x0112 }
            return
        L_0x00f5:
            long r13 = r12.longValue()     // Catch:{ all -> 0x0112 }
            long r13 = r3 - r13
            int r5 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x0104
            java.util.Map<java.lang.Long, java.lang.String> r5 = r1.AFExecutor     // Catch:{ all -> 0x0112 }
            r5.remove(r12)     // Catch:{ all -> 0x0112 }
        L_0x0104:
            long r13 = r12.longValue()     // Catch:{ all -> 0x0112 }
            int r5 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r5 > 0) goto L_0x0110
            long r10 = r12.longValue()     // Catch:{ all -> 0x0112 }
        L_0x0110:
            r5 = 2
            goto L_0x0099
        L_0x0112:
            r0 = move-exception
            goto L_0x0116
        L_0x0114:
            r0 = move-exception
            r10 = r3
        L_0x0116:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Error while handling push notification measurement: "
            r2.<init>(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.appsflyer.AFLogger.afErrorLog(r2, r0)
        L_0x012f:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "pushPayloadHistorySize"
            r5 = 2
            int r0 = r0.getInt(r2, r5)
            java.util.Map<java.lang.Long, java.lang.String> r2 = r1.AFExecutor
            int r2 = r2.size()
            if (r2 != r0) goto L_0x015f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "pushes: removing oldest overflowing push (oldest push:"
            r0.<init>(r2)
            r0.append(r10)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afInfoLog(r0)
            java.util.Map<java.lang.Long, java.lang.String> r0 = r1.AFExecutor
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r0.remove(r2)
        L_0x015f:
            java.util.Map<java.lang.Long, java.lang.String> r0 = r1.AFExecutor
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = r1.key
            r0.put(r2, r3)
            r16.start(r17)
        L_0x016d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.sendPushNotificationData(android.app.Activity):void");
    }

    public void setAdditionalData(HashMap<String, Object> hashMap) {
        if (hashMap != null) {
            C2069ad.$$a().AFDateFormat("public_api_call", "setAdditionalData", hashMap.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(hashMap).toString());
        }
    }

    public void setAndroidIdData(String str) {
        C2069ad.$$a().AFDateFormat("public_api_call", "setAndroidIdData", str);
        this.$$a = str;
    }

    public void setAppId(String str) {
        C2069ad.$$a().AFDateFormat("public_api_call", "setAppId", str);
        AppsFlyerProperties.getInstance().set("appid", str);
    }

    public void setAppInviteOneLink(String str) {
        C2069ad.$$a().AFDateFormat("public_api_call", "setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str == null || !str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
            AppsFlyerProperties.getInstance().remove("onelinkVersion");
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_ID, str);
    }

    public void setCollectAndroidID(boolean z) {
        C2069ad.$$a().AFDateFormat("public_api_call", "setCollectAndroidID", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z));
    }

    public void setCollectIMEI(boolean z) {
        C2069ad.$$a().AFDateFormat("public_api_call", "setCollectIMEI", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z));
    }

    public void setCollectOaid(boolean z) {
        C2069ad.$$a().AFDateFormat("public_api_call", "setCollectOaid", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z));
    }

    public void setCurrencyCode(String str) {
        C2069ad.$$a().AFDateFormat("public_api_call", "setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
    }

    public void setCustomerIdAndLogSession(String str, Context context2) {
        if (context2 == null) {
            return;
        }
        if (waitingForId()) {
            setCustomerUserId(str);
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
            StringBuilder sb = new StringBuilder("CustomerUserId set: ");
            sb.append(str);
            sb.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(context2);
            String property = getProperty(AppsFlyerProperties.AF_KEY);
            if (referrer == null) {
                referrer = "";
            }
            if (context2 instanceof Activity) {
                ((Activity) context2).getIntent();
            }
            AFEvent context3 = new Launch().context(context2);
            context3.values = null;
            AFEvent key2 = context3.key(property);
            key2.$$b = null;
            key2.valueOf = referrer;
            key2.AFDateFormat = null;
            $$a(key2);
            return;
        }
        setCustomerUserId(str);
        AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
    }

    public void setCustomerUserId(String str) {
        C2069ad.$$a().AFDateFormat("public_api_call", "setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.APP_USER_ID, str);
    }

    public void setDebugLog(boolean z) {
        setLogLevel(z ? AFLogger.LogLevel.DEBUG : AFLogger.LogLevel.NONE);
    }

    public void setExtension(String str) {
        C2069ad.$$a().AFDateFormat("public_api_call", "setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
    }

    public void setHost(String str, String str2) {
        if (str != null) {
            AppsFlyerProperties.getInstance().set("custom_host_prefix", str);
        }
        if (str2 == null || str2.isEmpty()) {
            AFLogger.afWarnLog("hostName cannot be null or empty");
        } else {
            AppsFlyerProperties.getInstance().set("custom_host", str2);
        }
    }

    public void setImeiData(String str) {
        C2069ad.$$a().AFDateFormat("public_api_call", "setImeiData", str);
        this.$$b = str;
    }

    public void setIsUpdate(boolean z) {
        C2069ad.$$a().AFDateFormat("public_api_call", "setIsUpdate", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
    }

    public void setLogLevel(AFLogger.LogLevel logLevel) {
        boolean z;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            z = true;
        } else {
            z = false;
        }
        C2069ad.$$a().AFDateFormat("public_api_call", "log", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("shouldLog", z);
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
    }

    public void setMinTimeBetweenSessions(int i) {
        this.getRequestListener = TimeUnit.SECONDS.toMillis((long) i);
    }

    public void setOaidData(String str) {
        C2069ad.$$a().AFDateFormat("public_api_call", "setOaidData", str);
        AdvertisingIdUtil.$$a = str;
    }

    public void setOneLinkCustomDomain(String... strArr) {
        AFLogger.afDebugLog(String.format("setOneLinkCustomDomain %s", new Object[]{Arrays.toString(strArr)}));
        AFDeepLinkManager.values = strArr;
    }

    public void setOutOfStore(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            AppsFlyerProperties.getInstance().set("api_store_value", lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
            return;
        }
        AFLogger.$$b("Cannot set setOutOfStore with null");
    }

    public void setPhoneNumber(String str) {
        this.afInfoLog = HashUtils.toSha256(str);
    }

    public void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put(Constants.URL_MEDIA_SOURCE, str);
            } catch (JSONException e) {
                AFLogger.afErrorLog(e.getMessage(), e);
            }
        }
        if (str2 != null) {
            jSONObject.put(Constants.URL_CAMPAIGN, str2);
        }
        if (str3 != null) {
            jSONObject.put(Constants.URL_SITE_ID, str3);
        }
        if (jSONObject.has(Constants.URL_MEDIA_SOURCE)) {
            AppsFlyerProperties.getInstance().set("preInstallName", jSONObject.toString());
            return;
        }
        AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
    }

    public void setResolveDeepLinkURLs(String... strArr) {
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", new Object[]{Arrays.toString(strArr)}));
        AFDeepLinkManager.AFDateFormat = strArr;
    }

    public void setSharingFilter(String... strArr) {
        if (strArr != null && !Arrays.equals(this.sharingFilter, new String[]{"all"})) {
            Pattern compile = Pattern.compile("[\\d\\w_]{1,45}");
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (str == null || !compile.matcher(str).matches()) {
                    AFLogger.afWarnLog("Invalid partner name :".concat(String.valueOf(str)));
                } else {
                    arrayList.add(str);
                }
            }
            if (!arrayList.isEmpty()) {
                this.sharingFilter = (String[]) arrayList.toArray(new String[0]);
            } else {
                this.sharingFilter = null;
            }
        }
    }

    public void setSharingFilterForAllPartners() {
        this.sharingFilter = new String[]{"all"};
    }

    public void setUserEmails(String... strArr) {
        C2069ad.$$a().AFDateFormat("public_api_call", "setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
    }

    public void start(Context context2) {
        start(context2, (String) null);
    }

    public void stop(boolean z, Context context2) {
        this.toJsonObject = z;
        C2106y.AFDateFormat();
        try {
            File valueOf2 = C2106y.valueOf(context2);
            if (!valueOf2.exists()) {
                valueOf2.mkdir();
            } else {
                for (File file : valueOf2.listFiles()) {
                    StringBuilder sb = new StringBuilder("Found cached request");
                    sb.append(file.getName());
                    AFLogger.afInfoLog(sb.toString());
                    C2106y.$$b(C2106y.$$a(file).AFDateFormat, context2);
                }
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("Could not cache request", e);
        }
        if (this.toJsonObject) {
            SharedPreferences.Editor edit = getSharedPreferences(context2).edit();
            edit.putBoolean(IS_STOP_TRACKING_USED, true);
            edit.apply();
        }
    }

    public void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        AFDeepLinkManager.getInstance().deepLinkListener = deepLinkListener;
    }

    public void unregisterConversionListener() {
        C2069ad.$$a().AFDateFormat("public_api_call", "unregisterConversionListener", new String[0]);
        conversionDataListener = null;
    }

    public void updateServerUninstallToken(Context context2, String str) {
        new Register(context2).send(str);
    }

    public void validateAndLogInAppPurchase(Context context2, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        String str6;
        Context context3 = context2;
        String str7 = str3;
        String str8 = str4;
        String str9 = str5;
        C2069ad $$a2 = C2069ad.$$a();
        String[] strArr = new String[6];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str7;
        strArr[3] = str8;
        strArr[4] = str9;
        if (map == null) {
            str6 = "";
        } else {
            str6 = map.toString();
        }
        strArr[5] = str6;
        $$a2.AFDateFormat("public_api_call", "validateAndTrackInAppPurchase", strArr);
        if (!isStopped()) {
            StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(str7);
            sb.append(" ");
            sb.append(str8);
            sb.append(" ");
            sb.append(str9);
            AFLogger.afInfoLog(sb.toString());
        }
        if (str == null || str8 == null || str2 == null || str9 == null || str7 == null) {
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFDateFormat;
            if (appsFlyerInAppPurchaseValidatorListener != null) {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                return;
            }
            return;
        }
        Context applicationContext = context2.getApplicationContext();
        String property = getProperty(AppsFlyerProperties.AF_KEY);
        if (context3 instanceof Activity) {
            ((Activity) context3).getIntent();
        }
        new Thread(new AFValidateInAppPurchase(applicationContext, property, str, str2, str3, str4, str5, map)).start();
    }

    public void waitForCustomerUserId(boolean z) {
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z);
    }

    public boolean waitingForId() {
        return AFDateFormat(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false) && getProperty(AppsFlyerProperties.APP_USER_ID) == null;
    }

    public static AppsFlyerLibCore getInstance() {
        return instance;
    }

    public String dateFormatUTC(SimpleDateFormat simpleDateFormat, long j) {
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date(j));
    }

    public void start(Context context2, String str) {
        start(context2, str, (AppsFlyerRequestListener) null);
    }

    public void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j) {
        DdlEvent.LISTENER_TIMEOUT = j;
        subscribeForDeepLink(deepLinkListener);
    }

    private static float getInstance(Context context2) {
        try {
            Intent registerReceiver = context2.getApplicationContext().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra == -1 || intExtra2 == -1) {
                return 50.0f;
            }
            return (((float) intExtra) / ((float) intExtra2)) * 100.0f;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return 1.0f;
        }
    }

    private static void valueOf(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                }
            } catch (JSONException unused) {
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2:
        while (true) {
            str = null;
            while (keys2.hasNext() && str == null) {
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i2) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i2) != ((Long) arrayList.get(1)).longValue() && jSONArray2.getLong(i2) != ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                            i2++;
                            str = next;
                        }
                    }
                    continue;
                } catch (JSONException unused2) {
                }
            }
        }
        if (str != null) {
            jSONObject.remove(str);
        }
    }

    public final void $$b(Context context2, Intent intent) {
        if (intent.getStringExtra("appsflyer_preinstall") != null) {
            getInstance();
            String stringExtra = intent.getStringExtra("appsflyer_preinstall");
            try {
                if (new JSONObject(stringExtra).has(Constants.URL_MEDIA_SOURCE)) {
                    AppsFlyerProperties.getInstance().set("preInstallName", stringExtra);
                } else {
                    AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                }
            } catch (JSONException e) {
                AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
            }
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance().setOnReceiveCalled();
        String stringExtra2 = intent.getStringExtra("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(stringExtra2)));
        if (stringExtra2 != null) {
            SharedPreferences.Editor edit = getSharedPreferences(context2).edit();
            edit.putString("referrer", stringExtra2);
            edit.apply();
            AppsFlyerProperties.getInstance().setReferrer(stringExtra2);
            if (AppsFlyerProperties.getInstance().isFirstLaunchCalled()) {
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                AFEvent context3 = new BackgroundReferrerLaunch().context(context2);
                context3.valueOf = stringExtra2;
                if (stringExtra2.length() > 5 && $$a(context3, getSharedPreferences(context2))) {
                    AFDateFormat((ScheduledExecutorService) AFExecutor.getInstance().$$a(), (Runnable) new C2044e(this, context3, (byte) 0), 5, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    public void start(Context context2, String str, AppsFlyerRequestListener appsFlyerRequestListener) {
        final String str2 = str;
        final AppsFlyerRequestListener appsFlyerRequestListener2 = appsFlyerRequestListener;
        if (Foreground.listener == null) {
            if (!this.onAppLinkFetchFinished) {
                AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
                if (str2 == null) {
                    if (appsFlyerRequestListener2 != null) {
                        appsFlyerRequestListener2.onError(RequestError.NO_DEV_KEY, RequestErrorMessage.NO_DEV_KEY);
                        return;
                    }
                    return;
                }
            }
            this.onAppLinkFetchFailed = (Application) context2.getApplicationContext();
            C2069ad.$$a().AFDateFormat("public_api_call", "start", str2);
            String str3 = values;
            AFLogger.afInfoLog(String.format("Starting AppsFlyer: (v%s.%s)", new Object[]{"6.1.4", str3}));
            StringBuilder sb = new StringBuilder("Build Number: ");
            sb.append(str3);
            AFLogger.afInfoLog(sb.toString());
            AppsFlyerProperties.getInstance().loadProperties(this.onAppLinkFetchFailed.getApplicationContext());
            if (!TextUtils.isEmpty(str)) {
                AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_KEY, str2);
                C2103w.valueOf(str);
            } else if (TextUtils.isEmpty(getProperty(AppsFlyerProperties.AF_KEY))) {
                AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
                if (appsFlyerRequestListener2 != null) {
                    appsFlyerRequestListener2.onError(RequestError.NO_DEV_KEY, RequestErrorMessage.NO_DEV_KEY);
                    return;
                }
                return;
            }
            Context baseContext = this.onAppLinkFetchFailed.getBaseContext();
            try {
                if ((baseContext.getPackageManager().getPackageInfo(baseContext.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                    if (baseContext.getResources().getIdentifier("appsflyer_backup_rules", "xml", baseContext.getPackageName()) != 0) {
                        AFLogger.afInfoLog("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                    } else {
                        AFLogger.$$b("'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules");
                    }
                }
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("checkBackupRules Exception: ");
                sb2.append(e.toString());
                AFLogger.afRDLog(sb2.toString());
            }
            if (this.AFHelper) {
                Context applicationContext = this.onAppLinkFetchFailed.getApplicationContext();
                this.toMap = new HashMap();
                final long currentTimeMillis = System.currentTimeMillis();
                C20372 r9 = new AFFacebookDeferredDeeplink.AppLinkFetchEvents() {
                    public final void onAppLinkFetchFailed(String str) {
                        AppsFlyerLibCore.this.toMap.put("error", str);
                    }

                    public final void onAppLinkFetchFinished(String str, String str2, String str3) {
                        if (str != null) {
                            AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(str));
                            AppsFlyerLibCore.this.toMap.put(WebViewActivity.EXTRA_LINK, str);
                            if (str2 != null) {
                                AppsFlyerLibCore.this.toMap.put("target_url", str2);
                            }
                            if (str3 != null) {
                                HashMap hashMap = new HashMap();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("promo_code", str3);
                                hashMap.put("deeplink_context", hashMap2);
                                AppsFlyerLibCore.this.toMap.put(InAppMessageBase.EXTRAS, hashMap);
                            }
                        } else {
                            AppsFlyerLibCore.this.toMap.put(WebViewActivity.EXTRA_LINK, "");
                        }
                        AppsFlyerLibCore.this.toMap.put("ttr", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    }
                };
                Class<C0115o> cls = C0115o.class;
                try {
                    C0115o oVar = C0115o.f331a;
                    cls.getMethod("sdkInitialize", new Class[]{Context.class}).invoke((Object) null, new Object[]{applicationContext});
                    Class<C2356a> cls2 = C2356a.class;
                    Class<C2356a.C2357a> cls3 = C2356a.C2357a.class;
                    Method method = cls2.getMethod("fetchDeferredAppLinkData", new Class[]{Context.class, String.class, cls3});
                    AFFacebookDeferredDeeplink.C20272 r13 = new InvocationHandler(cls2, r9) {
                        private /* synthetic */ Class $$b;
                        private /* synthetic */ AppLinkFetchEvents valueOf;

                        public final java.lang.Object invoke(
/*
Method generation error in method: com.appsflyer.AFFacebookDeferredDeeplink.2.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object, dex: classes.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.AFFacebookDeferredDeeplink.2.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/
                    };
                    Object newProxyInstance = Proxy.newProxyInstance(cls3.getClassLoader(), new Class[]{cls3}, r13);
                    String string = applicationContext.getString(applicationContext.getResources().getIdentifier("facebook_app_id", "string", applicationContext.getPackageName()));
                    if (TextUtils.isEmpty(string)) {
                        r9.onAppLinkFetchFailed("Facebook app id not defined in resources");
                    } else {
                        method.invoke((Object) null, new Object[]{applicationContext, string, newProxyInstance});
                    }
                } catch (NoSuchMethodException e2) {
                    r9.onAppLinkFetchFailed(e2.toString());
                } catch (InvocationTargetException e3) {
                    r9.onAppLinkFetchFailed(e3.toString());
                } catch (ClassNotFoundException e4) {
                    r9.onAppLinkFetchFailed(e4.toString());
                } catch (IllegalAccessException e5) {
                    r9.onAppLinkFetchFailed(e5.toString());
                }
            }
            Foreground.valueOf(context2, new Foreground.Listener() {
                public final void onBecameBackground(Context context) {
                    AFLogger.afInfoLog("onBecameBackground");
                    long unused = AppsFlyerLibCore.this.params = System.currentTimeMillis();
                    long collectIntentsFromActivities = AppsFlyerLibCore.this.params - AppsFlyerLibCore.this.post;
                    if (collectIntentsFromActivities > 0 && collectIntentsFromActivities < 1000) {
                        collectIntentsFromActivities = 1000;
                    }
                    AppsFlyerLibCore.this.eventDataCollector(context).set(ServerParameters.PREVIOUS_SESSION_DURATION, TimeUnit.MILLISECONDS.toSeconds(collectIntentsFromActivities));
                    AFLogger.afInfoLog("callStatsBackground background call");
                    AppsFlyerLibCore.this.AFDateFormat((WeakReference<Context>) new WeakReference(context));
                    C2069ad $$a = C2069ad.$$a();
                    if ($$a.getInstance()) {
                        $$a.values();
                        if (context != null) {
                            C2069ad.$$a(context.getPackageName(), context.getPackageManager());
                        }
                        $$a.valueOf();
                    } else {
                        AFLogger.afDebugLog("RD status is OFF");
                    }
                    AFExecutor instance = AFExecutor.getInstance();
                    try {
                        AFExecutor.values(instance.values);
                        Executor executor = instance.$$b;
                        if (executor instanceof ThreadPoolExecutor) {
                            AFExecutor.values((ThreadPoolExecutor) executor);
                        }
                    } catch (Throwable th) {
                        AFLogger.afErrorLog("failed to stop Executors", th);
                    }
                    AFSensorManager values2 = AFSensorManager.values(context);
                    values2.valueOf.post(values2.dateFormatUTC);
                }

                public final void onBecameForeground(Activity activity) {
                    long unused = AppsFlyerLibCore.this.post = System.currentTimeMillis();
                    AppsFlyerLibCore.this.eventDataCollector(activity).foreground();
                    AppsFlyerLibCore appsFlyerLibCore = AppsFlyerLibCore.this;
                    if (appsFlyerLibCore.getLaunchCounter(appsFlyerLibCore.AFInAppEventType, false) == 0) {
                        try {
                            AppsFlyerLibCore.this.AFKeystoreWrapper.put(ServerParameters.INIT_TO_FG, AppsFlyerLibCore.this.post - AppsFlyerLibCore.this.eventDataCollector.getLong(ServerParameters.INIT_TS));
                        } catch (JSONException unused2) {
                        }
                    }
                    AFLogger.afInfoLog("onBecameForeground");
                    if (AppsFlyerLibCore.this.getLaunchCounter(AppsFlyerLibCore.getSharedPreferences(activity), false) < 2) {
                        AFSensorManager values2 = AFSensorManager.values((Context) activity);
                        values2.valueOf.post(values2.dateFormatUTC);
                        values2.valueOf.post(values2.AFDateFormat);
                    }
                    Launch launch = new Launch();
                    AFDeepLinkManager instance = AFDeepLinkManager.getInstance();
                    Map<String, Object> params = launch.params();
                    EventDataCollector eventDataCollector = AppsFlyerLibCore.this.eventDataCollector;
                    SharedPreferences sharedPreferences = AppsFlyerLibCore.getSharedPreferences(activity);
                    boolean z = sharedPreferences.getBoolean(AFDeepLinkManager.DDL_SENT, false);
                    int launchCounter = AppsFlyerLibCore.getInstance().getLaunchCounter(sharedPreferences, false);
                    if (!instance.AFDateFormat(activity.getIntent(), (Context) activity, params) && instance.deepLinkListener != null && launchCounter == 0 && !z) {
                        new DdlEvent(activity.getApplicationContext(), eventDataCollector).start();
                    }
                    AppsFlyerLibCore.this.$$b(launch.context(activity).key(str2).requestListener(appsFlyerRequestListener2), activity);
                }
            });
        }
    }

    private static boolean dateFormatUTC(Context context2) {
        if (context2 != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                    for (Network networkCapabilities : connectivityManager.getAllNetworks()) {
                        NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(networkCapabilities);
                        if (networkCapabilities2.hasTransport(4) && !networkCapabilities2.hasCapability(15)) {
                            return true;
                        }
                    }
                    return false;
                } catch (Exception e) {
                    AFLogger.afErrorLog("Failed collecting ivc data", e);
                }
            } else {
                ArrayList arrayList = new ArrayList();
                try {
                    Iterator<T> it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    while (it.hasNext()) {
                        NetworkInterface networkInterface = (NetworkInterface) it.next();
                        if (networkInterface.isUp()) {
                            arrayList.add(networkInterface.getName());
                        }
                    }
                    return arrayList.contains("tun0");
                } catch (Exception e2) {
                    AFLogger.afErrorLog("Failed collecting ivc data", e2);
                }
            }
        }
        return false;
    }

    public void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        C2069ad.$$a().AFDateFormat("public_api_call", "setUserEmails", (String[]) arrayList.toArray(new String[(strArr.length + 1)]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        String str = null;
        for (String str2 : strArr) {
            if (C20417.$$b[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(HashUtils.toSha256(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
    }

    public final void values(Context context2, String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONArray jSONArray2;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String string = getSharedPreferences(context2).getString("extraReferrers", (String) null);
            if (string == null) {
                jSONObject = new JSONObject();
                jSONArray = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(string);
                if (jSONObject2.has(str)) {
                    jSONArray2 = new JSONArray((String) jSONObject2.get(str));
                } else {
                    jSONArray2 = new JSONArray();
                }
                JSONObject jSONObject3 = jSONObject2;
                jSONArray = jSONArray2;
                jSONObject = jSONObject3;
            }
            if (((long) jSONArray.length()) < 5) {
                jSONArray.put(currentTimeMillis);
            }
            if (((long) jSONObject.length()) >= 4) {
                valueOf(jSONObject);
            }
            jSONObject.put(str, jSONArray.toString());
            String jSONObject4 = jSONObject.toString();
            SharedPreferences.Editor edit = getSharedPreferences(context2).edit();
            edit.putString("extraReferrers", jSONObject4);
            edit.apply();
        } catch (JSONException unused) {
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }

    /* access modifiers changed from: private */
    public boolean $$a(AFEvent aFEvent, SharedPreferences sharedPreferences) {
        int launchCounter = getLaunchCounter(sharedPreferences, false);
        return (!sharedPreferences.getBoolean(AppsFlyerProperties.NEW_REFERRER_SENT, false) && launchCounter == 1) || (launchCounter == 1 && !(aFEvent instanceof Attr));
    }

    private static boolean AFDateFormat(String str, boolean z) {
        return AppsFlyerProperties.getInstance().getBoolean(str, z);
    }

    private boolean AFDateFormat(Context context2) {
        try {
            Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
            final long currentTimeMillis = System.currentTimeMillis();
            this.toList = new ConcurrentHashMap();
            C20383 r4 = new C2082m.C2084e() {
                public final void $$a(String str, Exception exc) {
                    String message = exc.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    AppsFlyerLibCore.this.toList.put("error", message);
                    AFLogger.afErrorLog(str, exc, true);
                }

                public final void valueOf(String str, String str2) {
                    AppsFlyerLibCore.this.toList.put("signedData", str);
                    AppsFlyerLibCore.this.toList.put(InAppPurchaseMetaData.KEY_SIGNATURE, str2);
                    AppsFlyerLibCore.this.toList.put("ttr", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
                }
            };
            try {
                Class<?> cls = Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
                Class<?> cls2 = Class.forName("com.appsflyer.lvl.AppsFlyerLVL$resultListener");
                Method method = cls.getMethod("checkLicense", new Class[]{Long.TYPE, Context.class, cls2});
                C2082m.C20834 r7 = new InvocationHandler(r4) {
                    private /* synthetic */ C2084e $$b;

                    public final java.lang.Object invoke(
/*
Method generation error in method: com.appsflyer.internal.m.4.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object, dex: classes.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.m.4.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                };
                method.invoke((Object) null, new Object[]{Long.valueOf(currentTimeMillis), context2, Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, r7)});
            } catch (ClassNotFoundException e) {
                r4.$$a(e.getClass().getSimpleName(), e);
            } catch (NoSuchMethodException e2) {
                r4.$$a(e2.getClass().getSimpleName(), e2);
            } catch (IllegalAccessException e3) {
                r4.$$a(e3.getClass().getSimpleName(), e3);
            } catch (InvocationTargetException e4) {
                r4.$$a(e4.getClass().getSimpleName(), e4);
            }
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private boolean $$a() {
        Map<String, Object> map = this.toMap;
        return map != null && !map.isEmpty();
    }

    private static void $$a(Context context2, Map<String, Object> map) {
        WindowManager windowManager = (WindowManager) context2.getSystemService("window");
        if (windowManager != null) {
            int rotation = windowManager.getDefaultDisplay().getRotation();
            map.put("sc_o", rotation != 0 ? rotation != 1 ? rotation != 2 ? rotation != 3 ? "" : "lr" : "pr" : "l" : com.appboy.Constants.APPBOY_PUSH_PRIORITY_KEY);
        }
    }

    private static boolean $$a(Context context2) {
        if ((AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) || !$$b(context2)) {
            return true;
        }
        return false;
    }

    private static File $$a(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (str.trim().length() > 0) {
                return new File(str.trim());
            }
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    public void logEvent(Context context2, String str, Map<String, Object> map) {
        logEvent(context2, str, map, (AppsFlyerRequestListener) null);
    }

    /* access modifiers changed from: private */
    public void valueOf(Context context2, String str, long j) {
        SharedPreferences.Editor edit = getSharedPreferences(context2).edit();
        edit.putLong(str, j);
        edit.apply();
    }

    public final void AFDateFormat(WeakReference<Context> weakReference) {
        if (weakReference.get() != null) {
            AFLogger.afInfoLog("app went to background");
            SharedPreferences sharedPreferences = getSharedPreferences(weakReference.get());
            AppsFlyerProperties.getInstance().saveProperties(sharedPreferences);
            long j = this.params - this.post;
            HashMap hashMap = new HashMap();
            String property = getProperty(AppsFlyerProperties.AF_KEY);
            if (property == null) {
                AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
                return;
            }
            String property2 = getProperty("KSAppsFlyerId");
            if (AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false)) {
                hashMap.put("deviceTrackingDisabled", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            }
            AdvertisingIdObject amazonAID = AdvertisingIdUtil.getAmazonAID(weakReference.get().getContentResolver());
            if (amazonAID != null) {
                hashMap.put(ServerParameters.AMAZON_AID, amazonAID.getAdvertisingId());
                hashMap.put(ServerParameters.AMAZON_AID_LIMIT, String.valueOf(amazonAID.isLimitAdTracking()));
            }
            String string = AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM);
            if (string != null) {
                hashMap.put(ServerParameters.ADVERTISING_ID_PARAM, string);
            }
            hashMap.put("app_id", weakReference.get().getPackageName());
            hashMap.put(ServerParameters.DEV_KEY, property);
            hashMap.put(ServerParameters.AF_USER_ID, Installation.m5498id(weakReference));
            hashMap.put(ServerParameters.TIME_SPENT_IN_APP, String.valueOf(j / 1000));
            hashMap.put(ServerParameters.STATUS_TYPE, "user_closed_app");
            hashMap.put(ServerParameters.PLATFORM, "Android");
            hashMap.put(ServerParameters.LAUNCH_COUNTER, Integer.toString(getLaunchCounter(sharedPreferences, false)));
            hashMap.put("channel", getConfiguredChannel(weakReference.get()));
            if (property2 == null) {
                property2 = "";
            }
            hashMap.put(ServerParameters.ORIGINAL_AF_UID, property2);
            if (this.addChannel) {
                try {
                    AFLogger.afDebugLog("Running callStats task");
                    new BackgroundHttpTask((BackgroundEvent) new Stats().trackingStopped(isStopped()).addParams(hashMap).urlString(ServerConfigHandler.getUrl(collectIntentsFromActivities))).execute();
                } catch (Throwable th) {
                    AFLogger.afErrorLog("Could not send callStats request", th);
                }
            } else {
                AFLogger.afDebugLog("Stats call is disabled, ignore ...");
            }
        }
    }

    private void $$a(AFEvent aFEvent) {
        boolean z = aFEvent.values == null;
        if (waitingForId()) {
            AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (z) {
            if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            } else if (AFDateFormat()) {
                AppsFlyerRequestListener requestListener2 = aFEvent.getRequestListener();
                if (requestListener2 != null) {
                    requestListener2.onError(RequestError.EVENT_TIMEOUT, RequestErrorMessage.EVENT_TIMEOUT);
                    return;
                }
                return;
            }
            this.urlString = System.currentTimeMillis();
        }
        AFDateFormat((ScheduledExecutorService) AFExecutor.getInstance().$$a(), (Runnable) new C2044e(this, aFEvent, (byte) 0), 0, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: private */
    public static Map<String, Object> valueOf(Context context2) throws C2101u {
        String string = getSharedPreferences(context2).getString("attributionId", (String) null);
        if (string != null && string.length() > 0) {
            return AFDateFormat(string);
        }
        throw new C2101u();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private static void values(android.content.Context r4) {
        /*
            boolean r0 = com.appsflyer.AndroidUtils.$$a()
            if (r0 == 0) goto L_0x000e
            r0 = 23
            java.lang.String r1 = "OPPO device found"
            com.appsflyer.AFLogger.afRDLog(r1)
            goto L_0x0010
        L_0x000e:
            r0 = 18
        L_0x0010:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r0) goto L_0x00bf
            java.lang.String r0 = "keyPropDisableAFKeystore"
            r2 = 1
            boolean r0 = AFDateFormat((java.lang.String) r0, (boolean) r2)
            if (r0 != 0) goto L_0x00bf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "OS SDK is="
            r0.<init>(r3)
            r0.append(r1)
            java.lang.String r1 = "; use KeyStore"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afRDLog(r0)
            com.appsflyer.AFKeystoreWrapper r0 = new com.appsflyer.AFKeystoreWrapper
            r0.<init>(r4)
            boolean r1 = r0.values()
            if (r1 != 0) goto L_0x0054
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r4)
            java.lang.String r4 = com.appsflyer.Installation.m5498id(r1)
            r0.values = r4
            r4 = 0
            r0.$$b = r4
            java.lang.String r4 = r0.$$b()
            r0.$$b(r4)
            goto L_0x009d
        L_0x0054:
            java.lang.String r4 = r0.$$b()
            java.lang.Object r1 = r0.valueOf
            monitor-enter(r1)
            int r3 = r0.$$b     // Catch:{ all -> 0x00bc }
            int r3 = r3 + r2
            r0.$$b = r3     // Catch:{ all -> 0x00bc }
            java.lang.String r2 = "Deleting key with alias: "
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00bc }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x00bc }
            com.appsflyer.AFLogger.afInfoLog(r2)     // Catch:{ all -> 0x00bc }
            java.lang.Object r2 = r0.valueOf     // Catch:{ KeyStoreException -> 0x007a }
            monitor-enter(r2)     // Catch:{ KeyStoreException -> 0x007a }
            java.security.KeyStore r3 = r0.$$a     // Catch:{ all -> 0x0077 }
            r3.deleteEntry(r4)     // Catch:{ all -> 0x0077 }
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            goto L_0x0095
        L_0x0077:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ KeyStoreException -> 0x007a }
            throw r4     // Catch:{ KeyStoreException -> 0x007a }
        L_0x007a:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bc }
            java.lang.String r3 = "Exception "
            r2.<init>(r3)     // Catch:{ all -> 0x00bc }
            java.lang.String r3 = r4.getMessage()     // Catch:{ all -> 0x00bc }
            r2.append(r3)     // Catch:{ all -> 0x00bc }
            java.lang.String r3 = " occurred"
            r2.append(r3)     // Catch:{ all -> 0x00bc }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00bc }
            com.appsflyer.AFLogger.afErrorLog(r2, r4)     // Catch:{ all -> 0x00bc }
        L_0x0095:
            monitor-exit(r1)     // Catch:{ all -> 0x00bc }
            java.lang.String r4 = r0.$$b()
            r0.$$b(r4)
        L_0x009d:
            java.lang.String r4 = "KSAppsFlyerId"
            java.lang.String r1 = r0.$$a()
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()
            r2.set((java.lang.String) r4, (java.lang.String) r1)
            java.lang.String r4 = "KSAppsFlyerRICounter"
            int r0 = r0.AFDateFormat()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            r1.set((java.lang.String) r4, (java.lang.String) r0)
            return
        L_0x00bc:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        L_0x00bf:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "OS SDK is="
            r4.<init>(r0)
            r4.append(r1)
            java.lang.String r0 = "; no KeyStore usage"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.appsflyer.AFLogger.afRDLog(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.values(android.content.Context):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r5 = com.appsflyer.internal.ActivityCompat.getReferrer(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void $$b(com.appsflyer.AFEvent r4, android.app.Activity r5) {
        /*
            r3 = this;
            android.app.Application r0 = r4.context()
            java.lang.String r1 = ""
            if (r5 == 0) goto L_0x0013
            android.net.Uri r5 = com.appsflyer.internal.ActivityCompat.getReferrer(r5)
            if (r5 == 0) goto L_0x0013
            java.lang.String r5 = r5.toString()
            goto L_0x0014
        L_0x0013:
            r5 = r1
        L_0x0014:
            java.lang.String r2 = "AppsFlyerKey"
            java.lang.String r2 = r3.getProperty(r2)
            if (r2 != 0) goto L_0x002f
            java.lang.String r5 = "[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey."
            com.appsflyer.AFLogger.afWarnLog(r5)
            com.appsflyer.attribution.AppsFlyerRequestListener r4 = r4.getRequestListener()
            if (r4 == 0) goto L_0x002e
            int r5 = com.appsflyer.attribution.RequestError.NO_DEV_KEY
            java.lang.String r0 = com.appsflyer.internal.attribution.RequestErrorMessage.NO_DEV_KEY
            r4.onError(r5, r0)
        L_0x002e:
            return
        L_0x002f:
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r2.getReferrer(r0)
            if (r0 != 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r1 = r0
        L_0x003b:
            r4.valueOf = r1
            r4.AFDateFormat = r5
            r3.$$a((com.appsflyer.AFEvent) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.$$b(com.appsflyer.AFEvent, android.app.Activity):void");
    }

    private static String valueOf(String str, PackageManager packageManager, String str2) {
        Object obj;
        try {
            Bundle bundle = packageManager.getApplicationInfo(str2, RecyclerView.C1119a0.FLAG_IGNORE).metaData;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Could not find ");
            sb.append(str);
            sb.append(" value in the manifest");
            AFLogger.afErrorLog(sb.toString(), th);
            return null;
        }
    }

    private static boolean valueOf(File file) {
        return file == null || !file.exists();
    }

    public static /* synthetic */ void $$a(AppsFlyerLibCore appsFlyerLibCore, AFEvent aFEvent) {
        String str;
        ScheduledExecutorService scheduledExecutorService;
        Application context2 = aFEvent.context();
        String str2 = aFEvent.values;
        if (context2 == null) {
            AFLogger.afDebugLog("sendWithEvent - got null context. skipping event/launch.");
            return;
        }
        SharedPreferences sharedPreferences = getSharedPreferences(context2);
        AppsFlyerProperties.getInstance().saveProperties(sharedPreferences);
        if (!appsFlyerLibCore.isStopped()) {
            StringBuilder sb = new StringBuilder("sendWithEvent from activity: ");
            sb.append(context2.getClass().getName());
            AFLogger.afInfoLog(sb.toString());
        }
        int i = 1;
        int i2 = 0;
        boolean z = str2 == null;
        boolean z2 = aFEvent instanceof BackgroundReferrerLaunch;
        boolean z3 = aFEvent instanceof Attr;
        aFEvent.getInstance = z;
        Map<String, Object> AFDateFormat2 = appsFlyerLibCore.AFDateFormat(aFEvent);
        String str3 = (String) AFDateFormat2.get(ServerParameters.AF_DEV_KEY);
        if (str3 == null || str3.length() == 0) {
            AFLogger.afDebugLog("Not sending data yet, waiting for dev key");
            AppsFlyerRequestListener requestListener2 = aFEvent.getRequestListener();
            if (requestListener2 != null) {
                requestListener2.onError(RequestError.NO_DEV_KEY, RequestErrorMessage.NO_DEV_KEY);
                return;
            }
            return;
        }
        if (!appsFlyerLibCore.isStopped()) {
            AFLogger.afInfoLog("AppsFlyerLib.sendWithEvent");
        }
        int launchCounter = appsFlyerLibCore.getLaunchCounter(sharedPreferences, false);
        if (z3 || z2) {
            str = ServerConfigHandler.getUrl(REFERRER_TRACKING_URL);
        } else if (!z) {
            str = ServerConfigHandler.getUrl(getInstance);
        } else if (launchCounter < 2) {
            str = ServerConfigHandler.getUrl(FIRST_LAUNCHES_URL);
        } else {
            str = ServerConfigHandler.getUrl(getDataFormatter);
        }
        StringBuilder k = C13555b.m33972k(str);
        k.append(context2.getPackageName());
        String obj = k.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("&buildnumber=6.1.4");
        String obj2 = sb2.toString();
        String configuredChannel = appsFlyerLibCore.getConfiguredChannel(context2);
        if (configuredChannel != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj2);
            sb3.append("&channel=");
            sb3.append(configuredChannel);
            obj2 = sb3.toString();
        }
        if (!(AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) && AFDateFormat2.get(ServerParameters.ADVERTISING_ID_PARAM) != null) {
            try {
                if (TextUtils.isEmpty(appsFlyerLibCore.$$a) && AFDateFormat2.remove(ServerParameters.ANDROID_ID) != null) {
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                }
                if (TextUtils.isEmpty(appsFlyerLibCore.$$b) && AFDateFormat2.remove(ServerParameters.IMEI) != null) {
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                }
            } catch (Exception e) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e);
            }
        }
        AFEvent addParams2 = aFEvent.urlString(obj2).addParams(AFDateFormat2);
        addParams2.AFDeepLinkManager = launchCounter;
        C2042b bVar = new C2042b(appsFlyerLibCore, addParams2, (byte) 0);
        if (z) {
            Referrer[] referrerArr = appsFlyerLibCore.AFLogger;
            if (referrerArr != null) {
                int length = referrerArr.length;
                int i3 = 0;
                while (i2 < length) {
                    Referrer referrer = referrerArr[i2];
                    if (referrer.getState() == Referrer.State.STARTED) {
                        StringBuilder sb4 = new StringBuilder("Failed to get ");
                        sb4.append(referrer.getSource());
                        sb4.append(" referrer, wait ...");
                        AFLogger.afDebugLog(sb4.toString());
                        i3 = 1;
                    }
                    i2++;
                }
                i2 = i3;
            }
            if (appsFlyerLibCore.AFHelper && !appsFlyerLibCore.$$a()) {
                AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
                i2 = 1;
            }
            if (!appsFlyerLibCore.AFInAppEventParameterName || appsFlyerLibCore.$$b()) {
                i = i2;
            }
        } else {
            i = 0;
        }
        if (AFDeepLinkManager.valueOf) {
            AFLogger.afRDLog("ESP deeplink: execute launch on SerialExecutor");
            AFExecutor instance2 = AFExecutor.getInstance();
            if (instance2.AFDateFormat == null) {
                instance2.AFDateFormat = Executors.newSingleThreadScheduledExecutor(instance2.valueOf);
            }
            scheduledExecutorService = instance2.AFDateFormat;
        } else {
            scheduledExecutorService = AFExecutor.getInstance().$$a();
        }
        AFDateFormat(scheduledExecutorService, (Runnable) bVar, i != 0 ? 500 : 0, TimeUnit.MILLISECONDS);
    }

    public static /* synthetic */ void valueOf(AppsFlyerLibCore appsFlyerLibCore, AFEvent aFEvent) throws IOException {
        String str;
        StringBuilder sb = new StringBuilder("url: ");
        sb.append(aFEvent.urlString());
        AFLogger.afInfoLog(sb.toString());
        if (aFEvent.$$a != null) {
            str = Base64.encodeToString(aFEvent.$$a(), 2);
            AFLogger.afInfoLog("cached data: ".concat(String.valueOf(str)));
        } else {
            str = new JSONObject(aFEvent.params()).toString();
            String replaceAll = str.replaceAll("\\p{C}", "*Non-printing character*");
            if (!replaceAll.equals(str)) {
                AFLogger.afWarnLog("Payload contains non-printing characters");
                str = replaceAll;
            }
            C2103w.$$a("data: ".concat(str));
        }
        C2069ad.$$a().AFDateFormat("server_request", aFEvent.urlString(), str);
        try {
            appsFlyerLibCore.$$b(aFEvent);
        } catch (IOException e) {
            AFLogger.afErrorLog("Exception in sendRequestToServer. ", e);
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.USE_HTTP_FALLBACK, false)) {
                appsFlyerLibCore.$$b(aFEvent.urlString(aFEvent.urlString().replace("https:", "http:")));
                return;
            }
            StringBuilder sb2 = new StringBuilder("failed to send request to server. ");
            sb2.append(e.getLocalizedMessage());
            AFLogger.afInfoLog(sb2.toString());
            throw e;
        }
    }

    /* access modifiers changed from: private */
    public boolean $$b() {
        Map<String, Object> map = this.toList;
        return map != null && !map.isEmpty();
    }

    private static boolean $$b(Context context2) {
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context2) == 0) {
                return true;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context2.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    private static String $$b(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{str});
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public String $$b(Context context2, String str) {
        SharedPreferences sharedPreferences = getSharedPreferences(context2);
        if (sharedPreferences.contains("CACHED_CHANNEL")) {
            return sharedPreferences.getString("CACHED_CHANNEL", (String) null);
        }
        SharedPreferences.Editor edit = getSharedPreferences(context2).edit();
        edit.putString("CACHED_CHANNEL", str);
        edit.apply();
        return str;
    }

    private void values(Context context2, String str, Map<String, Object> map) {
        AFEvent context3 = new InAppEvent().context(context2);
        context3.values = str;
        context3.$$b = map;
        $$b(context3, context2 instanceof Activity ? (Activity) context2 : null);
    }

    /* access modifiers changed from: private */
    public static Map<String, Object> AFDateFormat(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!context.contains(next)) {
                    hashMap.put(next, jSONObject.isNull(next) ? null : jSONObject.get(next));
                }
            }
            return hashMap;
        } catch (JSONException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:40|41|(2:43|44)|45|46|(4:(1:50)|(1:52)|(1:54)(2:55|(2:57|(1:59)(2:60|(1:62))))|63)(1:(1:65))|66|67|(3:69|70|(1:72))|73|(2:78|(1:80)(1:(2:102|(1:104))(3:87|88|(5:90|91|92|(1:94)|95))))(1:77)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00c8 */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0269 A[SYNTHETIC, Splitter:B:112:0x0269] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010a A[ADDED_TO_REGION, Catch:{ u -> 0x024b, all -> 0x026d }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0179 A[Catch:{ u -> 0x024b, all -> 0x026d }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01b5 A[SYNTHETIC, Splitter:B:69:0x01b5] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0214 A[Catch:{ u -> 0x024b, all -> 0x026d }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x021a A[Catch:{ u -> 0x024b, all -> 0x026d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void $$b(com.appsflyer.AFEvent r23) throws java.io.IOException {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.String r2 = "is_first_launch"
            java.lang.String r3 = "appsflyerConversionDataCacheExpiration"
            java.net.URL r4 = new java.net.URL
            java.lang.String r5 = r0.collectIntentsFromActivities
            r4.<init>(r5)
            byte[] r5 = r23.$$a()
            java.lang.String r6 = r23.key()
            java.lang.String r7 = r0.$$a
            boolean r8 = r23.valueOf()
            android.app.Application r9 = r23.context()
            com.appsflyer.attribution.AppsFlyerRequestListener r10 = r23.getRequestListener()
            r12 = 1
            if (r8 == 0) goto L_0x002e
            com.appsflyer.AppsFlyerConversionListener r13 = conversionDataListener
            if (r13 == 0) goto L_0x002e
            r13 = 1
            goto L_0x002f
        L_0x002e:
            r13 = 0
        L_0x002f:
            if (r8 == 0) goto L_0x0037
            int r14 = r0.AFDeepLinkManager
            if (r14 != r12) goto L_0x0037
            r14 = 1
            goto L_0x0038
        L_0x0037:
            r14 = 0
        L_0x0038:
            if (r14 == 0) goto L_0x0053
            org.json.JSONObject r15 = r1.AFKeystoreWrapper     // Catch:{ JSONException -> 0x004c }
            java.lang.String r11 = "from_fg"
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x004c }
            r18 = r13
            long r12 = r1.post     // Catch:{ JSONException -> 0x004e }
            long r12 = r16 - r12
            r15.put(r11, r12)     // Catch:{ JSONException -> 0x004e }
            goto L_0x004e
        L_0x004c:
            r18 = r13
        L_0x004e:
            long r11 = java.lang.System.currentTimeMillis()
            goto L_0x0057
        L_0x0053:
            r18 = r13
            r11 = 0
        L_0x0057:
            java.net.URLConnection r15 = r4.openConnection()     // Catch:{ all -> 0x0273 }
            java.lang.Object r15 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r15)     // Catch:{ all -> 0x0273 }
            java.net.URLConnection r15 = (java.net.URLConnection) r15     // Catch:{ all -> 0x0273 }
            java.net.HttpURLConnection r15 = (java.net.HttpURLConnection) r15     // Catch:{ all -> 0x0273 }
            java.lang.String r13 = "POST"
            r15.setRequestMethod(r13)     // Catch:{ all -> 0x026f }
            int r13 = r5.length     // Catch:{ all -> 0x026f }
            r17 = r2
            java.lang.String r2 = "Content-Length"
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x026f }
            r15.setRequestProperty(r2, r13)     // Catch:{ all -> 0x026f }
            java.lang.String r2 = "Content-Type"
            boolean r13 = r23.isEncrypt()     // Catch:{ all -> 0x026f }
            if (r13 == 0) goto L_0x0083
            java.lang.String r13 = "application/octet-stream"
            goto L_0x0085
        L_0x007f:
            r0 = move-exception
            r13 = r15
            goto L_0x0276
        L_0x0083:
            java.lang.String r13 = "application/json"
        L_0x0085:
            r15.setRequestProperty(r2, r13)     // Catch:{ all -> 0x026f }
            r2 = 10000(0x2710, float:1.4013E-41)
            r15.setConnectTimeout(r2)     // Catch:{ all -> 0x026f }
            r2 = 1
            r15.setDoOutput(r2)     // Catch:{ all -> 0x026f }
            com.appsflyer.AppsFlyerProperties r13 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x026f }
            r19 = r6
            java.lang.String r6 = "http_cache"
            boolean r6 = r13.getBoolean(r6, r2)     // Catch:{ all -> 0x026f }
            if (r6 != 0) goto L_0x00a5
            r2 = 0
            r15.setUseCaches(r2)     // Catch:{ all -> 0x026f }
            r2 = r15
            goto L_0x00a6
        L_0x00a5:
            r2 = r15
        L_0x00a6:
            java.io.DataOutputStream r6 = new java.io.DataOutputStream     // Catch:{ all -> 0x0264 }
            java.io.OutputStream r13 = r2.getOutputStream()     // Catch:{ all -> 0x0264 }
            r6.<init>(r13)     // Catch:{ all -> 0x0264 }
            r6.write(r5)     // Catch:{ all -> 0x0261 }
            r6.close()     // Catch:{ all -> 0x026d }
            int r5 = r2.getResponseCode()     // Catch:{ all -> 0x026d }
            if (r14 == 0) goto L_0x00c8
            org.json.JSONObject r6 = r1.AFKeystoreWrapper     // Catch:{ JSONException -> 0x00c8 }
            java.lang.String r13 = "net"
            long r20 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x00c8 }
            long r11 = r20 - r11
            r6.put(r13, r11)     // Catch:{ JSONException -> 0x00c8 }
        L_0x00c8:
            com.appsflyer.internal.EventDataCollector r6 = r1.eventDataCollector(r9)     // Catch:{ all -> 0x026d }
            java.lang.String r11 = "first_launch"
            org.json.JSONObject r12 = r1.AFKeystoreWrapper     // Catch:{ all -> 0x026d }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x026d }
            r6.set((java.lang.String) r11, (java.lang.String) r12)     // Catch:{ all -> 0x026d }
            java.lang.String r6 = r1.readServerResponse(r2)     // Catch:{ all -> 0x026d }
            com.appsflyer.internal.ad r11 = com.appsflyer.internal.C2069ad.$$a()     // Catch:{ all -> 0x026d }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x026d }
            java.lang.String r12 = "server_response"
            r13 = 2
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch:{ all -> 0x026d }
            java.lang.String r14 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x026d }
            r15 = 0
            r13[r15] = r14     // Catch:{ all -> 0x026d }
            r14 = 1
            r13[r14] = r6     // Catch:{ all -> 0x026d }
            r11.AFDateFormat(r12, r4, r13)     // Catch:{ all -> 0x026d }
            java.lang.String r4 = "response code: "
            java.lang.String r11 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x026d }
            java.lang.String r4 = r4.concat(r11)     // Catch:{ all -> 0x026d }
            com.appsflyer.AFLogger.afInfoLog(r4)     // Catch:{ all -> 0x026d }
            android.content.SharedPreferences r4 = getSharedPreferences(r9)     // Catch:{ all -> 0x026d }
            r11 = 200(0xc8, float:2.8E-43)
            if (r5 != r11) goto L_0x0179
            if (r9 == 0) goto L_0x0114
            if (r8 == 0) goto L_0x0114
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x026d }
            r1.AFEvent = r11     // Catch:{ all -> 0x026d }
        L_0x0114:
            if (r10 == 0) goto L_0x0119
            r10.onSuccess()     // Catch:{ all -> 0x026d }
        L_0x0119:
            if (r7 == 0) goto L_0x0122
            com.appsflyer.internal.C2106y.AFDateFormat()     // Catch:{ all -> 0x026d }
            com.appsflyer.internal.C2106y.$$b(r7, r9)     // Catch:{ all -> 0x026d }
            goto L_0x0163
        L_0x0122:
            java.lang.String r5 = "sentSuccessfully"
            java.lang.String r7 = "true"
            android.content.SharedPreferences r8 = getSharedPreferences(r9)     // Catch:{ all -> 0x026d }
            android.content.SharedPreferences$Editor r8 = r8.edit()     // Catch:{ all -> 0x026d }
            r8.putString(r5, r7)     // Catch:{ all -> 0x026d }
            r8.apply()     // Catch:{ all -> 0x026d }
            boolean r5 = r1.requestListener     // Catch:{ all -> 0x026d }
            if (r5 != 0) goto L_0x0163
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x026d }
            long r10 = r1.valueOf     // Catch:{ all -> 0x026d }
            long r7 = r7 - r10
            r10 = 15000(0x3a98, double:7.411E-320)
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x0147
            goto L_0x0163
        L_0x0147:
            java.util.concurrent.ScheduledExecutorService r5 = r1.isEncrypt     // Catch:{ all -> 0x026d }
            if (r5 != 0) goto L_0x0163
            com.appsflyer.AFExecutor r5 = com.appsflyer.AFExecutor.getInstance()     // Catch:{ all -> 0x026d }
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r5.$$a()     // Catch:{ all -> 0x026d }
            r1.isEncrypt = r5     // Catch:{ all -> 0x026d }
            com.appsflyer.AppsFlyerLibCore$c r5 = new com.appsflyer.AppsFlyerLibCore$c     // Catch:{ all -> 0x026d }
            r5.<init>(r9)     // Catch:{ all -> 0x026d }
            java.util.concurrent.ScheduledExecutorService r7 = r1.isEncrypt     // Catch:{ all -> 0x026d }
            r10 = 1
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x026d }
            AFDateFormat((java.util.concurrent.ScheduledExecutorService) r7, (java.lang.Runnable) r5, (long) r10, (java.util.concurrent.TimeUnit) r8)     // Catch:{ all -> 0x026d }
        L_0x0163:
            com.appsflyer.internal.event.uninstall.Register r5 = new com.appsflyer.internal.event.uninstall.Register     // Catch:{ all -> 0x026d }
            r5.<init>(r9)     // Catch:{ all -> 0x026d }
            r5.sendIfQueued()     // Catch:{ all -> 0x026d }
            org.json.JSONObject r5 = com.appsflyer.ServerConfigHandler.$$b(r6)     // Catch:{ all -> 0x026d }
            java.lang.String r6 = "send_background"
            r7 = 0
            boolean r5 = r5.optBoolean(r6, r7)     // Catch:{ all -> 0x026d }
            r1.addChannel = r5     // Catch:{ all -> 0x026d }
            goto L_0x0196
        L_0x0179:
            if (r10 == 0) goto L_0x0196
            int r6 = com.appsflyer.attribution.RequestError.RESPONSE_CODE_FAILURE     // Catch:{ all -> 0x026d }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x026d }
            r7.<init>()     // Catch:{ all -> 0x026d }
            java.lang.String r8 = com.appsflyer.internal.attribution.RequestErrorMessage.RESPONSE_CODE_FAILURE     // Catch:{ all -> 0x026d }
            r7.append(r8)     // Catch:{ all -> 0x026d }
            java.lang.String r8 = " "
            r7.append(r8)     // Catch:{ all -> 0x026d }
            r7.append(r5)     // Catch:{ all -> 0x026d }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x026d }
            r10.onError(r6, r5)     // Catch:{ all -> 0x026d }
        L_0x0196:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x026d }
            java.lang.String r6 = "[GCD-A01] Loading conversion data. Counter: "
            r5.<init>(r6)     // Catch:{ all -> 0x026d }
            int r0 = r0.AFDeepLinkManager     // Catch:{ all -> 0x026d }
            r5.append(r0)     // Catch:{ all -> 0x026d }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x026d }
            com.appsflyer.AFLogger.afDebugLog(r0)     // Catch:{ all -> 0x026d }
            r5 = 0
            long r7 = r4.getLong(r3, r5)     // Catch:{ all -> 0x026d }
            java.lang.String r0 = "attributionId"
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x01ed
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x026d }
            long r5 = r5 - r7
            r7 = 5184000000(0x134fd9000, double:2.561236308E-314)
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x01ed
            java.lang.String r5 = "[GCD-E02] Cached conversion data expired"
            com.appsflyer.AFLogger.afDebugLog(r5)     // Catch:{ all -> 0x026d }
            java.lang.String r5 = "sixtyDayConversionData"
            android.content.SharedPreferences r6 = getSharedPreferences(r9)     // Catch:{ all -> 0x026d }
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch:{ all -> 0x026d }
            r7 = 1
            r6.putBoolean(r5, r7)     // Catch:{ all -> 0x026d }
            r6.apply()     // Catch:{ all -> 0x026d }
            android.content.SharedPreferences r5 = getSharedPreferences(r9)     // Catch:{ all -> 0x026d }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x026d }
            r6 = 0
            r5.putString(r0, r6)     // Catch:{ all -> 0x026d }
            r5.apply()     // Catch:{ all -> 0x026d }
            r5 = 0
            r1.valueOf((android.content.Context) r9, (java.lang.String) r3, (long) r5)     // Catch:{ all -> 0x026d }
        L_0x01ed:
            r3 = 0
            java.lang.String r5 = r4.getString(r0, r3)     // Catch:{ all -> 0x026d }
            if (r5 != 0) goto L_0x0210
            if (r19 == 0) goto L_0x0210
            if (r18 == 0) goto L_0x0210
            com.appsflyer.AppsFlyerLibCore$InstallAttributionIdFetcher r0 = new com.appsflyer.AppsFlyerLibCore$InstallAttributionIdFetcher     // Catch:{ all -> 0x026d }
            android.content.Context r3 = r9.getApplicationContext()     // Catch:{ all -> 0x026d }
            android.app.Application r3 = (android.app.Application) r3     // Catch:{ all -> 0x026d }
            r5 = r19
            r4 = 0
            r0.<init>(r1, r3, r5, r4)     // Catch:{ all -> 0x026d }
            java.util.concurrent.ScheduledExecutorService r3 = r0.values     // Catch:{ all -> 0x026d }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x026d }
            r5 = 10
            AFDateFormat((java.util.concurrent.ScheduledExecutorService) r3, (java.lang.Runnable) r0, (long) r5, (java.util.concurrent.TimeUnit) r4)     // Catch:{ all -> 0x026d }
            goto L_0x025d
        L_0x0210:
            r5 = r19
            if (r5 != 0) goto L_0x021a
            java.lang.String r0 = "[GCD-E05] AppsFlyer dev key is missing"
            com.appsflyer.AFLogger.afDebugLog(r0)     // Catch:{ all -> 0x026d }
            goto L_0x025d
        L_0x021a:
            if (r18 == 0) goto L_0x0254
            r3 = 0
            java.lang.String r0 = r4.getString(r0, r3)     // Catch:{ all -> 0x026d }
            if (r0 == 0) goto L_0x0254
            r0 = 0
            int r0 = r1.getLaunchCounter(r4, r0)     // Catch:{ all -> 0x026d }
            r3 = 1
            if (r0 <= r3) goto L_0x0254
            java.util.Map r0 = valueOf((android.content.Context) r9)     // Catch:{ u -> 0x024b }
            if (r0 == 0) goto L_0x025d
            r3 = r17
            boolean r4 = r0.containsKey(r3)     // Catch:{ all -> 0x0242 }
            if (r4 != 0) goto L_0x023e
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0242 }
            r0.put(r3, r4)     // Catch:{ all -> 0x0242 }
        L_0x023e:
            com.appsflyer.AppsFlyerLibCore.InstallAttributionIdFetcher.$$b(r0)     // Catch:{ all -> 0x0242 }
            goto L_0x025d
        L_0x0242:
            r0 = move-exception
            java.lang.String r3 = r0.getLocalizedMessage()     // Catch:{ u -> 0x024b }
            com.appsflyer.AFLogger.afErrorLog(r3, r0)     // Catch:{ u -> 0x024b }
            goto L_0x025d
        L_0x024b:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x026d }
            com.appsflyer.AFLogger.afErrorLog(r3, r0)     // Catch:{ all -> 0x026d }
            goto L_0x025d
        L_0x0254:
            com.appsflyer.AppsFlyerConversionListener r0 = conversionDataListener     // Catch:{ all -> 0x026d }
            if (r0 != 0) goto L_0x025d
            java.lang.String r0 = "[GCD-E01] AppsFlyerConversionListener is null - skip gcd"
            com.appsflyer.AFLogger.afDebugLog(r0)     // Catch:{ all -> 0x026d }
        L_0x025d:
            r2.disconnect()
            return
        L_0x0261:
            r0 = move-exception
            r13 = r6
            goto L_0x0267
        L_0x0264:
            r0 = move-exception
            r3 = 0
            r13 = r3
        L_0x0267:
            if (r13 == 0) goto L_0x026c
            r13.close()     // Catch:{ all -> 0x026d }
        L_0x026c:
            throw r0     // Catch:{ all -> 0x026d }
        L_0x026d:
            r0 = move-exception
            goto L_0x0271
        L_0x026f:
            r0 = move-exception
            r2 = r15
        L_0x0271:
            r13 = r2
            goto L_0x0276
        L_0x0273:
            r0 = move-exception
            r3 = 0
            r13 = r3
        L_0x0276:
            if (r13 == 0) goto L_0x027b
            r13.disconnect()
        L_0x027b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.$$b(com.appsflyer.AFEvent):void");
    }

    public static Map<String, Object> values(Map<String, Object> map) {
        if (map.containsKey("meta")) {
            return (Map) map.get("meta");
        }
        HashMap hashMap = new HashMap();
        map.put("meta", hashMap);
        return hashMap;
    }

    private static String values(Activity activity) {
        Intent intent;
        String str = null;
        if (!(activity == null || (intent = activity.getIntent()) == null)) {
            try {
                Bundle extras = intent.getExtras();
                if (!(extras == null || (str = extras.getString("af")) == null)) {
                    AFLogger.afInfoLog("Push Notification received af payload = ".concat(str));
                    extras.remove("af");
                    activity.setIntent(intent.putExtras(extras));
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getMessage(), th);
            }
        }
        return str;
    }

    private boolean AFDateFormat() {
        if (this.urlString > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.urlString;
            SimpleDateFormat dataFormatter = AFDateFormat.getDataFormatter("yyyy/MM/dd HH:mm:ss.SSS Z");
            String dateFormatUTC2 = dateFormatUTC(dataFormatter, this.urlString);
            String dateFormatUTC3 = dateFormatUTC(dataFormatter, this.AFEvent);
            if (currentTimeMillis < this.getRequestListener && !isStopped()) {
                AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", new Object[]{dateFormatUTC2, dateFormatUTC3, Long.valueOf(currentTimeMillis), Long.valueOf(this.getRequestListener)}));
                return true;
            } else if (!isStopped()) {
                AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", new Object[]{dateFormatUTC2, dateFormatUTC3, Long.valueOf(currentTimeMillis)}));
            }
        } else if (!isStopped()) {
            AFLogger.afInfoLog("Sending first launch for this session!");
        }
        return false;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031 A[SYNTHETIC, Splitter:B:16:0x0031] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x0028=Splitter:B:13:0x0028, B:22:0x003f=Splitter:B:22:0x003f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String values(java.io.File r4, java.lang.String r5) {
        /*
            r0 = 0
            java.util.Properties r1 = new java.util.Properties     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            r2.<init>(r4)     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            r1.load(r2)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x0024 }
            java.lang.String r3 = "Found PreInstall property!"
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x0024 }
            java.lang.String r4 = r1.getProperty(r5)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x0024 }
            r2.close()     // Catch:{ all -> 0x001b }
            goto L_0x0023
        L_0x001b:
            r5 = move-exception
            java.lang.String r0 = r5.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r5)
        L_0x0023:
            return r4
        L_0x0024:
            r4 = move-exception
            goto L_0x0028
        L_0x0026:
            r4 = move-exception
            r2 = r0
        L_0x0028:
            java.lang.String r5 = r4.getMessage()     // Catch:{ all -> 0x005a }
            com.appsflyer.AFLogger.afErrorLog(r5, r4)     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0059
            r2.close()     // Catch:{ all -> 0x0035 }
            goto L_0x0059
        L_0x0035:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r5, r4)
            goto L_0x0059
        L_0x003e:
            r2 = r0
        L_0x003f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x005a }
            java.lang.String r1 = "PreInstall file wasn't found: "
            r5.<init>(r1)     // Catch:{ all -> 0x005a }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ all -> 0x005a }
            r5.append(r4)     // Catch:{ all -> 0x005a }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x005a }
            com.appsflyer.AFLogger.afDebugLog(r4)     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0059
            r2.close()     // Catch:{ all -> 0x0035 }
        L_0x0059:
            return r0
        L_0x005a:
            r4 = move-exception
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch:{ all -> 0x0061 }
            goto L_0x0069
        L_0x0061:
            r5 = move-exception
            java.lang.String r0 = r5.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r5)
        L_0x0069:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.values(java.io.File, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0229 */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0342 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0355 A[Catch:{ Exception -> 0x035d }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03a3 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03d4 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03e9 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x047a A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x048d A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x048e A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04a0 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x04ad A[SYNTHETIC, Splitter:B:223:0x04ad] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x04c7 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x04d0 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x04de A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x04e5 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x04f9 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x050d A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x051d A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0546 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0562 A[SYNTHETIC, Splitter:B:260:0x0562] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0580 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0594 A[SYNTHETIC, Splitter:B:274:0x0594] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0599 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x05ef A[SYNTHETIC, Splitter:B:296:0x05ef] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x05f7 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x061a A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x062e A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0645 A[SYNTHETIC, Splitter:B:316:0x0645] */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x068a A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x068e A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x06a0 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x06ab A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x06de A[Catch:{ Exception -> 0x06e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x0784 A[Catch:{ all -> 0x07d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x07fe A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x0808 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x083b A[SYNTHETIC, Splitter:B:415:0x083b] */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x0883 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x08a1 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x08d7 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x08d9 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x08ea  */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0966 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x0967 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:472:0x09a2 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:493:0x0a69 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x0acc A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:497:0x0ad2 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x022d A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0238 A[SYNTHETIC, Splitter:B:80:0x0238] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0242 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0266 A[Catch:{ Exception -> 0x00d7, all -> 0x0ade }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.Object> AFDateFormat(com.appsflyer.AFEvent r43) {
        /*
            r42 = this;
            r1 = r42
            r2 = r43
            java.lang.String r3 = "ddl"
            java.lang.String r4 = "af_deeplink"
            java.lang.String r5 = "advertiserId"
            java.lang.String r6 = "versionCode"
            java.lang.String r7 = "use cached AndroidId: "
            java.lang.String r8 = "androidIdCached"
            java.lang.String r9 = "imeiCached"
            java.lang.String r10 = "Exception while collecting facebook's attribution ID. "
            java.lang.String r11 = "deviceTrackingDisabled"
            java.lang.String r12 = "prev_session_dur"
            java.lang.String r13 = "extraReferrers"
            java.lang.String r14 = "sdkExtension"
            java.lang.String r15 = "AppsFlyerTimePassedSincePrevLaunch"
            java.lang.String r16 = "yyyy-MM-dd_HHmmssZ"
            r17 = r3
            java.lang.String r3 = "use cached IMEI: "
            r18 = r5
            java.lang.String r5 = "appid"
            r19 = r4
            java.lang.String r4 = "INSTALL_STORE"
            r20 = r6
            java.lang.String r6 = "gcd"
            r21 = r7
            java.lang.String r7 = "prev_event_name"
            r22 = r8
            java.lang.String r8 = "preInstallName"
            r23 = r3
            android.app.Application r3 = r43.context()
            r24 = r9
            java.lang.String r9 = r43.key()
            r25 = r11
            java.lang.String r11 = r2.values
            r26 = r10
            org.json.JSONObject r10 = new org.json.JSONObject
            r27 = r5
            java.util.Map<java.lang.String, java.lang.Object> r5 = r2.$$b
            if (r5 != 0) goto L_0x005b
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L_0x005b:
            r10.<init>(r5)
            java.lang.String r5 = r10.toString()
            java.lang.String r10 = r2.valueOf
            r28 = r9
            android.content.SharedPreferences r9 = getSharedPreferences(r3)
            r29 = r8
            boolean r8 = r43.valueOf()
            r30 = r4
            java.lang.String r4 = r2.AFDateFormat
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.params
            com.appsflyer.AdvertisingIdUtil.getGaid(r3, r2)
            java.util.Date r31 = new java.util.Date
            r31.<init>()
            r33 = r4
            r32 = r5
            long r4 = r31.getTime()
            r31 = r14
            java.lang.String r14 = java.lang.Long.toString(r4)
            r34 = r11
            java.lang.String r11 = "af_timestamp"
            r2.put(r11, r14)
            java.lang.String r4 = com.appsflyer.internal.C2073d.values(r3, r4)
            if (r4 == 0) goto L_0x009e
            java.lang.String r5 = "cksm_v1"
            r2.put(r5, r4)
        L_0x009e:
            boolean r4 = r42.isStopped()     // Catch:{ all -> 0x0ade }
            if (r4 != 0) goto L_0x00bd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ade }
            java.lang.String r5 = "******* sendTrackingWithEvent: "
            r4.<init>(r5)     // Catch:{ all -> 0x0ade }
            if (r8 == 0) goto L_0x00b0
            java.lang.String r5 = "Launch"
            goto L_0x00b2
        L_0x00b0:
            r5 = r34
        L_0x00b2:
            r4.append(r5)     // Catch:{ all -> 0x0ade }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0ade }
            com.appsflyer.AFLogger.afInfoLog(r4)     // Catch:{ all -> 0x0ade }
            goto L_0x00c2
        L_0x00bd:
            java.lang.String r4 = "Reporting has been stopped"
            com.appsflyer.AFLogger.afInfoLog(r4)     // Catch:{ all -> 0x0ade }
        L_0x00c2:
            com.appsflyer.internal.C2106y.AFDateFormat()     // Catch:{ all -> 0x0ade }
            java.io.File r4 = com.appsflyer.internal.C2106y.valueOf(r3)     // Catch:{ Exception -> 0x00d7 }
            boolean r4 = r4.exists()     // Catch:{ Exception -> 0x00d7 }
            if (r4 != 0) goto L_0x00de
            java.io.File r4 = com.appsflyer.internal.C2106y.valueOf(r3)     // Catch:{ Exception -> 0x00d7 }
            r4.mkdir()     // Catch:{ Exception -> 0x00d7 }
            goto L_0x00de
        L_0x00d7:
            r0 = move-exception
            r4 = r0
            java.lang.String r5 = "Could not create cache directory"
            com.appsflyer.AFLogger.afErrorLog(r5, r4)     // Catch:{ all -> 0x0ade }
        L_0x00de:
            android.content.pm.PackageManager r4 = r3.getPackageManager()     // Catch:{ Exception -> 0x011a }
            java.lang.String r5 = r3.getPackageName()     // Catch:{ Exception -> 0x011a }
            r11 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r11)     // Catch:{ Exception -> 0x011a }
            java.lang.String[] r4 = r4.requestedPermissions     // Catch:{ Exception -> 0x011a }
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ Exception -> 0x011a }
            java.lang.String r5 = "android.permission.INTERNET"
            boolean r5 = r4.contains(r5)     // Catch:{ Exception -> 0x011a }
            if (r5 != 0) goto L_0x00ff
            java.lang.String r5 = "Permission android.permission.INTERNET is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.afWarnLog(r5)     // Catch:{ Exception -> 0x011a }
        L_0x00ff:
            java.lang.String r5 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r5 = r4.contains(r5)     // Catch:{ Exception -> 0x011a }
            if (r5 != 0) goto L_0x010c
            java.lang.String r5 = "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.afWarnLog(r5)     // Catch:{ Exception -> 0x011a }
        L_0x010c:
            java.lang.String r5 = "android.permission.ACCESS_WIFI_STATE"
            boolean r4 = r4.contains(r5)     // Catch:{ Exception -> 0x011a }
            if (r4 != 0) goto L_0x0121
            java.lang.String r4 = "Permission android.permission.ACCESS_WIFI_STATE is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.afWarnLog(r4)     // Catch:{ Exception -> 0x011a }
            goto L_0x0121
        L_0x011a:
            r0 = move-exception
            r4 = r0
            java.lang.String r5 = "Exception while validation permissions. "
            com.appsflyer.AFLogger.afErrorLog(r5, r4)     // Catch:{ all -> 0x0ade }
        L_0x0121:
            java.lang.String r4 = "af_events_api"
            java.lang.String r5 = "1"
            r2.put(r4, r5)     // Catch:{ all -> 0x0ade }
            java.lang.String r4 = "brand"
            java.lang.String r5 = android.os.Build.BRAND     // Catch:{ all -> 0x0ade }
            r2.put(r4, r5)     // Catch:{ all -> 0x0ade }
            java.lang.String r4 = "device"
            java.lang.String r5 = android.os.Build.DEVICE     // Catch:{ all -> 0x0ade }
            r2.put(r4, r5)     // Catch:{ all -> 0x0ade }
            java.lang.String r4 = "product"
            java.lang.String r5 = android.os.Build.PRODUCT     // Catch:{ all -> 0x0ade }
            r2.put(r4, r5)     // Catch:{ all -> 0x0ade }
            java.lang.String r4 = "sdk"
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0ade }
            java.lang.String r11 = java.lang.Integer.toString(r5)     // Catch:{ all -> 0x0ade }
            r2.put(r4, r11)     // Catch:{ all -> 0x0ade }
            java.lang.String r4 = "model"
            java.lang.String r11 = android.os.Build.MODEL     // Catch:{ all -> 0x0ade }
            r2.put(r4, r11)     // Catch:{ all -> 0x0ade }
            java.lang.String r4 = "deviceType"
            java.lang.String r11 = android.os.Build.TYPE     // Catch:{ all -> 0x0ade }
            r2.put(r4, r11)     // Catch:{ all -> 0x0ade }
            $$a((android.content.Context) r3, (java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0ade }
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0ade }
            com.appsflyer.internal.EventDataCollector r11 = r1.eventDataCollector(r3)     // Catch:{ all -> 0x0ade }
            java.lang.String r14 = "phone"
            r43 = r11
            r35 = r12
            if (r8 == 0) goto L_0x0286
            boolean r7 = r1.isAppsFlyerFirstLaunch(r3)     // Catch:{ all -> 0x0ade }
            if (r7 == 0) goto L_0x01b9
            boolean r7 = r4.isOtherSdkStringDisabled()     // Catch:{ all -> 0x0ade }
            if (r7 != 0) goto L_0x0182
            float r7 = getInstance((android.content.Context) r3)     // Catch:{ all -> 0x0ade }
            java.lang.String r12 = "batteryLevel"
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0ade }
            r2.put(r12, r7)     // Catch:{ all -> 0x0ade }
        L_0x0182:
            values((android.content.Context) r3)     // Catch:{ all -> 0x0ade }
            r7 = 23
            if (r5 < r7) goto L_0x0192
            java.lang.Class<android.app.UiModeManager> r5 = android.app.UiModeManager.class
            java.lang.Object r5 = r3.getSystemService(r5)     // Catch:{ all -> 0x0ade }
            android.app.UiModeManager r5 = (android.app.UiModeManager) r5     // Catch:{ all -> 0x0ade }
            goto L_0x019b
        L_0x0192:
            java.lang.String r5 = "uimode"
            java.lang.Object r5 = r3.getSystemService(r5)     // Catch:{ all -> 0x0ade }
            android.app.UiModeManager r5 = (android.app.UiModeManager) r5     // Catch:{ all -> 0x0ade }
        L_0x019b:
            if (r5 == 0) goto L_0x01ac
            int r5 = r5.getCurrentModeType()     // Catch:{ all -> 0x0ade }
            r7 = 4
            if (r5 != r7) goto L_0x01ac
            java.lang.String r5 = "tv"
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0ade }
            r2.put(r5, r7)     // Catch:{ all -> 0x0ade }
        L_0x01ac:
            boolean r5 = com.appsflyer.internal.instant.AFInstantApps.isInstantApp(r3)     // Catch:{ all -> 0x0ade }
            if (r5 == 0) goto L_0x01b9
            java.lang.String r5 = "inst_app"
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0ade }
            r2.put(r5, r7)     // Catch:{ all -> 0x0ade }
        L_0x01b9:
            java.lang.String r5 = "timepassedsincelastlaunch"
            android.content.SharedPreferences r7 = getSharedPreferences(r3)     // Catch:{ all -> 0x0ade }
            r11 = 0
            long r38 = r7.getLong(r15, r11)     // Catch:{ all -> 0x0ade }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0ade }
            r1.valueOf((android.content.Context) r3, (java.lang.String) r15, (long) r11)     // Catch:{ all -> 0x0ade }
            r40 = 0
            int r7 = (r38 > r40 ? 1 : (r38 == r40 ? 0 : -1))
            if (r7 <= 0) goto L_0x01da
            long r11 = r11 - r38
            r36 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r36
            goto L_0x01dc
        L_0x01da:
            r11 = -1
        L_0x01dc:
            java.lang.String r7 = java.lang.Long.toString(r11)     // Catch:{ all -> 0x0ade }
            r2.put(r5, r7)     // Catch:{ all -> 0x0ade }
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = "oneLinkSlug"
            java.lang.String r5 = r5.getString(r7)     // Catch:{ all -> 0x0ade }
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0ade }
            java.lang.String r11 = "onelinkVersion"
            java.lang.String r7 = r7.getString(r11)     // Catch:{ all -> 0x0ade }
            if (r5 == 0) goto L_0x01fe
            java.lang.String r11 = "onelink_id"
            r2.put(r11, r5)     // Catch:{ all -> 0x0ade }
        L_0x01fe:
            if (r7 == 0) goto L_0x0205
            java.lang.String r5 = "onelink_ver"
            r2.put(r5, r7)     // Catch:{ all -> 0x0ade }
        L_0x0205:
            com.appsflyer.internal.EventDataCollector r5 = r1.eventDataCollector     // Catch:{ all -> 0x0ade }
            java.lang.String r5 = r5.getString(r6)     // Catch:{ all -> 0x0ade }
            if (r5 == 0) goto L_0x0229
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0229 }
            r7.<init>(r5)     // Catch:{ JSONException -> 0x0229 }
            java.util.Map r5 = com.appsflyer.AFHelper.toMap(r7)     // Catch:{ JSONException -> 0x0229 }
            boolean r7 = r5.isEmpty()     // Catch:{ JSONException -> 0x0229 }
            if (r7 != 0) goto L_0x0229
            java.util.Map r7 = values((java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ JSONException -> 0x0229 }
            r7.put(r6, r5)     // Catch:{ JSONException -> 0x0229 }
            com.appsflyer.internal.EventDataCollector r5 = r1.eventDataCollector     // Catch:{ JSONException -> 0x0229 }
            r7 = 0
            r5.set((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ JSONException -> 0x0229 }
        L_0x0229:
            java.lang.String r5 = r1.afInfoLog     // Catch:{ all -> 0x0ade }
            if (r5 == 0) goto L_0x0230
            r2.put(r14, r5)     // Catch:{ all -> 0x0ade }
        L_0x0230:
            boolean r5 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0ade }
            java.lang.String r6 = "referrer"
            if (r5 != 0) goto L_0x023b
            r2.put(r6, r10)     // Catch:{ all -> 0x0ade }
        L_0x023b:
            r5 = 0
            java.lang.String r7 = r9.getString(r13, r5)     // Catch:{ all -> 0x0ade }
            if (r7 == 0) goto L_0x0245
            r2.put(r13, r7)     // Catch:{ all -> 0x0ade }
        L_0x0245:
            java.lang.String r5 = r4.getReferrer(r3)     // Catch:{ all -> 0x0ade }
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0ade }
            if (r7 != 0) goto L_0x0258
            java.lang.Object r7 = r2.get(r6)     // Catch:{ all -> 0x0ade }
            if (r7 != 0) goto L_0x0258
            r2.put(r6, r5)     // Catch:{ all -> 0x0ade }
        L_0x0258:
            r5 = r43
            r6 = r35
            long r10 = r5.getLong(r6)     // Catch:{ all -> 0x0ade }
            r12 = 0
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x026d
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0ade }
            r2.put(r6, r7)     // Catch:{ all -> 0x0ade }
        L_0x026d:
            java.lang.String r6 = "exception_number"
            long r10 = com.appsflyer.internal.Exlytics.get()     // Catch:{ all -> 0x0ade }
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0ade }
            r2.put(r6, r7)     // Catch:{ all -> 0x0ade }
            r43 = r5
            r38 = r8
            r35 = r9
            r6 = r32
            r5 = r34
            goto L_0x0316
        L_0x0286:
            r5 = r43
            android.content.SharedPreferences r6 = getSharedPreferences(r3)     // Catch:{ all -> 0x0ade }
            android.content.SharedPreferences$Editor r10 = r6.edit()     // Catch:{ all -> 0x0ade }
            r11 = 0
            java.lang.String r12 = r6.getString(r7, r11)     // Catch:{ Exception -> 0x0305 }
            java.lang.String r11 = "prev_event_timestamp"
            java.lang.String r13 = "prev_event_value"
            if (r12 == 0) goto L_0x02e3
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ Exception -> 0x02d9 }
            r15.<init>()     // Catch:{ Exception -> 0x02d9 }
            r43 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02d3 }
            r5.<init>()     // Catch:{ Exception -> 0x02d3 }
            r38 = r8
            r35 = r9
            r8 = -1
            long r8 = r6.getLong(r11, r8)     // Catch:{ Exception -> 0x02d0 }
            r5.append(r8)     // Catch:{ Exception -> 0x02d0 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x02d0 }
            r15.put(r11, r5)     // Catch:{ Exception -> 0x02d0 }
            r5 = 0
            java.lang.String r6 = r6.getString(r13, r5)     // Catch:{ Exception -> 0x02d0 }
            r15.put(r13, r6)     // Catch:{ Exception -> 0x02d0 }
            r15.put(r7, r12)     // Catch:{ Exception -> 0x02d0 }
            java.lang.String r5 = "prev_event"
            java.lang.String r6 = r15.toString()     // Catch:{ Exception -> 0x02d0 }
            r2.put(r5, r6)     // Catch:{ Exception -> 0x02d0 }
            goto L_0x02e9
        L_0x02d0:
            r0 = move-exception
        L_0x02d1:
            r5 = r0
            goto L_0x02dd
        L_0x02d3:
            r0 = move-exception
        L_0x02d4:
            r38 = r8
            r35 = r9
            goto L_0x02d1
        L_0x02d9:
            r0 = move-exception
            r43 = r5
            goto L_0x02d4
        L_0x02dd:
            r7 = r5
            r6 = r32
            r5 = r34
            goto L_0x0311
        L_0x02e3:
            r43 = r5
            r38 = r8
            r35 = r9
        L_0x02e9:
            r5 = r34
            r10.putString(r7, r5)     // Catch:{ Exception -> 0x0301 }
            r6 = r32
            r10.putString(r13, r6)     // Catch:{ Exception -> 0x02fe }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02fe }
            r10.putLong(r11, r7)     // Catch:{ Exception -> 0x02fe }
            r10.apply()     // Catch:{ Exception -> 0x02fe }
            goto L_0x0316
        L_0x02fe:
            r0 = move-exception
        L_0x02ff:
            r7 = r0
            goto L_0x0311
        L_0x0301:
            r0 = move-exception
            r6 = r32
            goto L_0x02ff
        L_0x0305:
            r0 = move-exception
            r43 = r5
            r38 = r8
            r35 = r9
            r6 = r32
            r5 = r34
            goto L_0x02ff
        L_0x0311:
            java.lang.String r8 = "Error while processing previous event."
            com.appsflyer.AFLogger.afErrorLog(r8, r7)     // Catch:{ all -> 0x0ade }
        L_0x0316:
            java.lang.String r7 = "KSAppsFlyerId"
            java.lang.String r7 = r1.getProperty(r7)     // Catch:{ all -> 0x0ade }
            java.lang.String r8 = "KSAppsFlyerRICounter"
            java.lang.String r8 = r1.getProperty(r8)     // Catch:{ all -> 0x0ade }
            if (r7 == 0) goto L_0x033a
            if (r8 == 0) goto L_0x033a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0ade }
            int r9 = r9.intValue()     // Catch:{ all -> 0x0ade }
            if (r9 <= 0) goto L_0x033a
            java.lang.String r9 = "reinstallCounter"
            r2.put(r9, r8)     // Catch:{ all -> 0x0ade }
            java.lang.String r8 = "originalAppsflyerId"
            r2.put(r8, r7)     // Catch:{ all -> 0x0ade }
        L_0x033a:
            java.lang.String r7 = "additionalCustomData"
            java.lang.String r7 = r1.getProperty(r7)     // Catch:{ all -> 0x0ade }
            if (r7 == 0) goto L_0x0347
            java.lang.String r8 = "customData"
            r2.put(r8, r7)     // Catch:{ all -> 0x0ade }
        L_0x0347:
            android.content.pm.PackageManager r7 = r3.getPackageManager()     // Catch:{ Exception -> 0x035d }
            java.lang.String r8 = r3.getPackageName()     // Catch:{ Exception -> 0x035d }
            java.lang.String r7 = r7.getInstallerPackageName(r8)     // Catch:{ Exception -> 0x035d }
            if (r7 == 0) goto L_0x035a
            java.lang.String r8 = "installer_package"
            r2.put(r8, r7)     // Catch:{ Exception -> 0x035d }
        L_0x035a:
            r7 = r31
            goto L_0x0365
        L_0x035d:
            r0 = move-exception
            r7 = r0
            java.lang.String r8 = "Exception while getting the app's installer package. "
            com.appsflyer.AFLogger.afErrorLog(r8, r7)     // Catch:{ all -> 0x0ade }
            goto L_0x035a
        L_0x0365:
            java.lang.String r8 = r4.getString(r7)     // Catch:{ all -> 0x0ade }
            if (r8 == 0) goto L_0x0374
            int r9 = r8.length()     // Catch:{ all -> 0x0ade }
            if (r9 <= 0) goto L_0x0374
            r2.put(r7, r8)     // Catch:{ all -> 0x0ade }
        L_0x0374:
            java.lang.String r7 = r1.getConfiguredChannel(r3)     // Catch:{ all -> 0x0ade }
            java.lang.String r8 = r1.$$b((android.content.Context) r3, (java.lang.String) r7)     // Catch:{ all -> 0x0ade }
            if (r8 == 0) goto L_0x0384
            boolean r9 = r8.equals(r7)     // Catch:{ all -> 0x0ade }
            if (r9 == 0) goto L_0x0388
        L_0x0384:
            if (r8 != 0) goto L_0x038d
            if (r7 == 0) goto L_0x038d
        L_0x0388:
            java.lang.String r8 = "af_latestchannel"
            r2.put(r8, r7)     // Catch:{ all -> 0x0ade }
        L_0x038d:
            android.content.SharedPreferences r7 = getSharedPreferences(r3)     // Catch:{ all -> 0x0ade }
            r8 = r30
            boolean r9 = r7.contains(r8)     // Catch:{ all -> 0x0ade }
            java.lang.String r10 = "AF_STORE"
            java.lang.String r11 = "api_store_value"
            if (r9 == 0) goto L_0x03a3
            r9 = 0
            java.lang.String r7 = r7.getString(r8, r9)     // Catch:{ all -> 0x0ade }
            goto L_0x03d2
        L_0x03a3:
            boolean r7 = r1.isAppsFlyerFirstLaunch(r3)     // Catch:{ all -> 0x0ade }
            if (r7 == 0) goto L_0x03c3
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = r7.getString(r11)     // Catch:{ all -> 0x0ade }
            if (r7 == 0) goto L_0x03b4
            goto L_0x03c4
        L_0x03b4:
            if (r3 == 0) goto L_0x03c3
            android.content.pm.PackageManager r7 = r3.getPackageManager()     // Catch:{ all -> 0x0ade }
            java.lang.String r9 = r3.getPackageName()     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = valueOf((java.lang.String) r10, (android.content.pm.PackageManager) r7, (java.lang.String) r9)     // Catch:{ all -> 0x0ade }
            goto L_0x03c4
        L_0x03c3:
            r7 = 0
        L_0x03c4:
            android.content.SharedPreferences r9 = getSharedPreferences(r3)     // Catch:{ all -> 0x0ade }
            android.content.SharedPreferences$Editor r9 = r9.edit()     // Catch:{ all -> 0x0ade }
            r9.putString(r8, r7)     // Catch:{ all -> 0x0ade }
            r9.apply()     // Catch:{ all -> 0x0ade }
        L_0x03d2:
            if (r7 == 0) goto L_0x03dd
            java.lang.String r8 = "af_installstore"
            java.lang.String r7 = r7.toLowerCase()     // Catch:{ all -> 0x0ade }
            r2.put(r8, r7)     // Catch:{ all -> 0x0ade }
        L_0x03dd:
            android.content.SharedPreferences r7 = getSharedPreferences(r3)     // Catch:{ all -> 0x0ade }
            r8 = r29
            java.lang.String r9 = r1.getProperty(r8)     // Catch:{ all -> 0x0ade }
            if (r9 != 0) goto L_0x0478
            boolean r12 = r7.contains(r8)     // Catch:{ all -> 0x0ade }
            if (r12 == 0) goto L_0x03f7
            r12 = 0
            java.lang.String r7 = r7.getString(r8, r12)     // Catch:{ all -> 0x0ade }
            r9 = r7
            goto L_0x046f
        L_0x03f7:
            boolean r7 = r1.isAppsFlyerFirstLaunch(r3)     // Catch:{ all -> 0x0ade }
            if (r7 == 0) goto L_0x045f
            java.lang.String r7 = "ro.appsflyer.preinstall.path"
            java.lang.String r7 = $$b((java.lang.String) r7)     // Catch:{ all -> 0x0ade }
            java.io.File r7 = $$a((java.lang.String) r7)     // Catch:{ all -> 0x0ade }
            boolean r9 = valueOf((java.io.File) r7)     // Catch:{ all -> 0x0ade }
            if (r9 == 0) goto L_0x041f
            java.lang.String r7 = "AF_PRE_INSTALL_PATH"
            android.content.pm.PackageManager r9 = r3.getPackageManager()     // Catch:{ all -> 0x0ade }
            java.lang.String r12 = r3.getPackageName()     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = valueOf((java.lang.String) r7, (android.content.pm.PackageManager) r9, (java.lang.String) r12)     // Catch:{ all -> 0x0ade }
            java.io.File r7 = $$a((java.lang.String) r7)     // Catch:{ all -> 0x0ade }
        L_0x041f:
            boolean r9 = valueOf((java.io.File) r7)     // Catch:{ all -> 0x0ade }
            if (r9 == 0) goto L_0x042b
            java.lang.String r7 = "/data/local/tmp/pre_install.appsflyer"
            java.io.File r7 = $$a((java.lang.String) r7)     // Catch:{ all -> 0x0ade }
        L_0x042b:
            boolean r9 = valueOf((java.io.File) r7)     // Catch:{ all -> 0x0ade }
            if (r9 == 0) goto L_0x0437
            java.lang.String r7 = "/etc/pre_install.appsflyer"
            java.io.File r7 = $$a((java.lang.String) r7)     // Catch:{ all -> 0x0ade }
        L_0x0437:
            boolean r9 = valueOf((java.io.File) r7)     // Catch:{ all -> 0x0ade }
            if (r9 != 0) goto L_0x0448
            java.lang.String r9 = r3.getPackageName()     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = values((java.io.File) r7, (java.lang.String) r9)     // Catch:{ all -> 0x0ade }
            if (r7 == 0) goto L_0x0448
            goto L_0x0449
        L_0x0448:
            r7 = 0
        L_0x0449:
            if (r7 == 0) goto L_0x044c
            goto L_0x045e
        L_0x044c:
            java.lang.String r7 = "AF_PRE_INSTALL_NAME"
            if (r3 != 0) goto L_0x0452
            r7 = 0
            goto L_0x045e
        L_0x0452:
            android.content.pm.PackageManager r9 = r3.getPackageManager()     // Catch:{ all -> 0x0ade }
            java.lang.String r12 = r3.getPackageName()     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = valueOf((java.lang.String) r7, (android.content.pm.PackageManager) r9, (java.lang.String) r12)     // Catch:{ all -> 0x0ade }
        L_0x045e:
            r9 = r7
        L_0x045f:
            if (r9 == 0) goto L_0x046f
            android.content.SharedPreferences r7 = getSharedPreferences(r3)     // Catch:{ all -> 0x0ade }
            android.content.SharedPreferences$Editor r7 = r7.edit()     // Catch:{ all -> 0x0ade }
            r7.putString(r8, r9)     // Catch:{ all -> 0x0ade }
            r7.apply()     // Catch:{ all -> 0x0ade }
        L_0x046f:
            if (r9 == 0) goto L_0x0478
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0ade }
            r7.set((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x0ade }
        L_0x0478:
            if (r9 == 0) goto L_0x0483
            java.lang.String r7 = "af_preinstall_name"
            java.lang.String r8 = r9.toLowerCase()     // Catch:{ all -> 0x0ade }
            r2.put(r7, r8)     // Catch:{ all -> 0x0ade }
        L_0x0483:
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = r7.getString(r11)     // Catch:{ all -> 0x0ade }
            if (r7 == 0) goto L_0x048e
            goto L_0x049e
        L_0x048e:
            if (r3 != 0) goto L_0x0492
            r7 = 0
            goto L_0x049e
        L_0x0492:
            android.content.pm.PackageManager r7 = r3.getPackageManager()     // Catch:{ all -> 0x0ade }
            java.lang.String r8 = r3.getPackageName()     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = valueOf((java.lang.String) r10, (android.content.pm.PackageManager) r7, (java.lang.String) r8)     // Catch:{ all -> 0x0ade }
        L_0x049e:
            if (r7 == 0) goto L_0x04a9
            java.lang.String r8 = "af_currentstore"
            java.lang.String r7 = r7.toLowerCase()     // Catch:{ all -> 0x0ade }
            r2.put(r8, r7)     // Catch:{ all -> 0x0ade }
        L_0x04a9:
            java.lang.String r7 = "appsflyerKey"
            if (r28 == 0) goto L_0x04b9
            int r8 = r28.length()     // Catch:{ all -> 0x0ade }
            if (r8 <= 0) goto L_0x04b9
            r8 = r28
            r2.put(r7, r8)     // Catch:{ all -> 0x0ade }
            goto L_0x04ca
        L_0x04b9:
            java.lang.String r8 = "AppsFlyerKey"
            java.lang.String r8 = r1.getProperty(r8)     // Catch:{ all -> 0x0ade }
            if (r8 == 0) goto L_0x0ad2
            int r9 = r8.length()     // Catch:{ all -> 0x0ade }
            if (r9 <= 0) goto L_0x0ad2
            r2.put(r7, r8)     // Catch:{ all -> 0x0ade }
        L_0x04ca:
            java.lang.String r7 = r42.getCustomerUserId()     // Catch:{ all -> 0x0ade }
            if (r7 == 0) goto L_0x04d5
            java.lang.String r8 = "appUserId"
            r2.put(r8, r7)     // Catch:{ all -> 0x0ade }
        L_0x04d5:
            java.lang.String r7 = "userEmails"
            java.lang.String r7 = r4.getString(r7)     // Catch:{ all -> 0x0ade }
            if (r7 == 0) goto L_0x04e5
            java.lang.String r8 = "user_emails"
            r2.put(r8, r7)     // Catch:{ all -> 0x0ade }
            goto L_0x04f7
        L_0x04e5:
            java.lang.String r7 = "userEmail"
            java.lang.String r7 = r1.getProperty(r7)     // Catch:{ all -> 0x0ade }
            if (r7 == 0) goto L_0x04f7
            java.lang.String r8 = "sha1_el"
            java.lang.String r7 = com.appsflyer.HashUtils.toSHA1(r7)     // Catch:{ all -> 0x0ade }
            r2.put(r8, r7)     // Catch:{ all -> 0x0ade }
        L_0x04f7:
            if (r5 == 0) goto L_0x0505
            java.lang.String r7 = "eventName"
            r2.put(r7, r5)     // Catch:{ all -> 0x0ade }
            if (r6 == 0) goto L_0x0505
            java.lang.String r7 = "eventValue"
            r2.put(r7, r6)     // Catch:{ all -> 0x0ade }
        L_0x0505:
            r6 = r27
            java.lang.String r7 = r1.getProperty(r6)     // Catch:{ all -> 0x0ade }
            if (r7 == 0) goto L_0x0514
            java.lang.String r7 = r1.getProperty(r6)     // Catch:{ all -> 0x0ade }
            r2.put(r6, r7)     // Catch:{ all -> 0x0ade }
        L_0x0514:
            java.lang.String r6 = "currencyCode"
            java.lang.String r6 = r1.getProperty(r6)     // Catch:{ all -> 0x0ade }
            r7 = 3
            if (r6 == 0) goto L_0x053e
            int r8 = r6.length()     // Catch:{ all -> 0x0ade }
            if (r8 == r7) goto L_0x0539
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ade }
            java.lang.String r9 = "WARNING: currency code should be 3 characters!!! '"
            r8.<init>(r9)     // Catch:{ all -> 0x0ade }
            r8.append(r6)     // Catch:{ all -> 0x0ade }
            java.lang.String r9 = "' is not a legal value."
            r8.append(r9)     // Catch:{ all -> 0x0ade }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0ade }
            com.appsflyer.AFLogger.afWarnLog(r8)     // Catch:{ all -> 0x0ade }
        L_0x0539:
            java.lang.String r8 = "currency"
            r2.put(r8, r6)     // Catch:{ all -> 0x0ade }
        L_0x053e:
            java.lang.String r6 = "IS_UPDATE"
            java.lang.String r6 = r1.getProperty(r6)     // Catch:{ all -> 0x0ade }
            if (r6 == 0) goto L_0x054b
            java.lang.String r8 = "isUpdate"
            r2.put(r8, r6)     // Catch:{ all -> 0x0ade }
        L_0x054b:
            boolean r6 = r1.isPreInstalledApp(r3)     // Catch:{ all -> 0x0ade }
            java.lang.String r8 = "af_preinstalled"
            java.lang.String r6 = java.lang.Boolean.toString(r6)     // Catch:{ all -> 0x0ade }
            r2.put(r8, r6)     // Catch:{ all -> 0x0ade }
            java.lang.String r6 = "collectFacebookAttrId"
            r8 = 1
            boolean r6 = r4.getBoolean(r6, r8)     // Catch:{ all -> 0x0ade }
            r9 = 0
            if (r6 == 0) goto L_0x0585
            android.content.pm.PackageManager r6 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0578, all -> 0x0570 }
            java.lang.String r10 = "com.facebook.katana"
            r6.getApplicationInfo(r10, r9)     // Catch:{ NameNotFoundException -> 0x0578, all -> 0x0570 }
            java.lang.String r6 = r1.getAttributionId(r3)     // Catch:{ NameNotFoundException -> 0x0578, all -> 0x0570 }
            goto L_0x057e
        L_0x0570:
            r0 = move-exception
            r6 = r0
            r10 = r26
            com.appsflyer.AFLogger.afErrorLog(r10, r6)     // Catch:{ all -> 0x0ade }
            goto L_0x057d
        L_0x0578:
            r10 = r26
            com.appsflyer.AFLogger.afWarnLog(r10)     // Catch:{ all -> 0x0ade }
        L_0x057d:
            r6 = 0
        L_0x057e:
            if (r6 == 0) goto L_0x0585
            java.lang.String r10 = "fb"
            r2.put(r10, r6)     // Catch:{ all -> 0x0ade }
        L_0x0585:
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0ade }
            r10 = r25
            boolean r11 = r6.getBoolean(r10, r9)     // Catch:{ all -> 0x0ade }
            java.lang.String r12 = "true"
            if (r11 == 0) goto L_0x0599
            r2.put(r10, r12)     // Catch:{ all -> 0x0ade }
            goto L_0x06d3
        L_0x0599:
            android.content.SharedPreferences r10 = getSharedPreferences(r3)     // Catch:{ all -> 0x0ade }
            java.lang.String r11 = "collectIMEI"
            boolean r11 = r6.getBoolean(r11, r8)     // Catch:{ all -> 0x0ade }
            r13 = r24
            r15 = 0
            java.lang.String r7 = r10.getString(r13, r15)     // Catch:{ all -> 0x0ade }
            if (r11 == 0) goto L_0x0612
            java.lang.String r11 = r1.$$b     // Catch:{ all -> 0x0ade }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0ade }
            if (r11 == 0) goto L_0x0612
            boolean r11 = $$a((android.content.Context) r3)     // Catch:{ all -> 0x0ade }
            if (r11 == 0) goto L_0x0617
            java.lang.Object r11 = r3.getSystemService(r14)     // Catch:{ InvocationTargetException -> 0x05fe, Exception -> 0x05e9 }
            android.telephony.TelephonyManager r11 = (android.telephony.TelephonyManager) r11     // Catch:{ InvocationTargetException -> 0x05fe, Exception -> 0x05e9 }
            java.lang.Class r14 = r11.getClass()     // Catch:{ InvocationTargetException -> 0x05fe, Exception -> 0x05e9 }
            java.lang.String r15 = "getDeviceId"
            java.lang.Class[] r8 = new java.lang.Class[r9]     // Catch:{ InvocationTargetException -> 0x05fe, Exception -> 0x05e9 }
            java.lang.reflect.Method r8 = r14.getMethod(r15, r8)     // Catch:{ InvocationTargetException -> 0x05fe, Exception -> 0x05e9 }
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ InvocationTargetException -> 0x05fe, Exception -> 0x05e9 }
            java.lang.Object r8 = r8.invoke(r11, r14)     // Catch:{ InvocationTargetException -> 0x05fe, Exception -> 0x05e9 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ InvocationTargetException -> 0x05fe, Exception -> 0x05e9 }
            if (r8 == 0) goto L_0x05d8
            r7 = r8
            goto L_0x0618
        L_0x05d8:
            if (r7 == 0) goto L_0x0617
            r8 = r23
            java.lang.String r11 = r8.concat(r7)     // Catch:{ InvocationTargetException -> 0x05e7, Exception -> 0x05e4 }
            com.appsflyer.AFLogger.afDebugLog(r11)     // Catch:{ InvocationTargetException -> 0x05e7, Exception -> 0x05e4 }
            goto L_0x0618
        L_0x05e4:
            r0 = move-exception
        L_0x05e5:
            r11 = r0
            goto L_0x05ed
        L_0x05e7:
            goto L_0x0601
        L_0x05e9:
            r0 = move-exception
            r8 = r23
            goto L_0x05e5
        L_0x05ed:
            if (r7 == 0) goto L_0x05f7
            java.lang.String r8 = r8.concat(r7)     // Catch:{ all -> 0x0ade }
            com.appsflyer.AFLogger.afDebugLog(r8)     // Catch:{ all -> 0x0ade }
            goto L_0x05f8
        L_0x05f7:
            r7 = 0
        L_0x05f8:
            java.lang.String r8 = "WARNING: other reason: "
            com.appsflyer.AFLogger.afErrorLog(r8, r11)     // Catch:{ all -> 0x0ade }
            goto L_0x0618
        L_0x05fe:
            r8 = r23
            goto L_0x05e7
        L_0x0601:
            if (r7 == 0) goto L_0x060b
            java.lang.String r8 = r8.concat(r7)     // Catch:{ all -> 0x0ade }
            com.appsflyer.AFLogger.afDebugLog(r8)     // Catch:{ all -> 0x0ade }
            goto L_0x060c
        L_0x060b:
            r7 = 0
        L_0x060c:
            java.lang.String r8 = "WARNING: READ_PHONE_STATE is missing."
            com.appsflyer.AFLogger.afWarnLog(r8)     // Catch:{ all -> 0x0ade }
            goto L_0x0618
        L_0x0612:
            java.lang.String r7 = r1.$$b     // Catch:{ all -> 0x0ade }
            if (r7 == 0) goto L_0x0617
            goto L_0x0618
        L_0x0617:
            r7 = 0
        L_0x0618:
            if (r7 == 0) goto L_0x062e
            android.content.SharedPreferences r8 = getSharedPreferences(r3)     // Catch:{ all -> 0x0ade }
            android.content.SharedPreferences$Editor r8 = r8.edit()     // Catch:{ all -> 0x0ade }
            r8.putString(r13, r7)     // Catch:{ all -> 0x0ade }
            r8.apply()     // Catch:{ all -> 0x0ade }
            java.lang.String r8 = "imei"
            r2.put(r8, r7)     // Catch:{ all -> 0x0ade }
            goto L_0x0633
        L_0x062e:
            java.lang.String r7 = "IMEI was not collected."
            com.appsflyer.AFLogger.afInfoLog(r7)     // Catch:{ all -> 0x0ade }
        L_0x0633:
            java.lang.String r7 = "collectAndroidId"
            r8 = 1
            boolean r6 = r6.getBoolean(r7, r8)     // Catch:{ all -> 0x0ade }
            r7 = r22
            r8 = 0
            java.lang.String r10 = r10.getString(r7, r8)     // Catch:{ all -> 0x0ade }
            java.lang.String r8 = "android_id"
            if (r6 == 0) goto L_0x0686
            java.lang.String r6 = r1.$$a     // Catch:{ all -> 0x0ade }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0ade }
            if (r6 == 0) goto L_0x0686
            boolean r6 = $$a((android.content.Context) r3)     // Catch:{ all -> 0x0ade }
            if (r6 == 0) goto L_0x068b
            android.content.ContentResolver r6 = r3.getContentResolver()     // Catch:{ Exception -> 0x066e }
            java.lang.String r6 = android.provider.Settings.Secure.getString(r6, r8)     // Catch:{ Exception -> 0x066e }
            if (r6 == 0) goto L_0x065e
            goto L_0x068c
        L_0x065e:
            if (r10 == 0) goto L_0x066c
            r6 = r21
            java.lang.String r11 = r6.concat(r10)     // Catch:{ Exception -> 0x066a }
            com.appsflyer.AFLogger.afDebugLog(r11)     // Catch:{ Exception -> 0x066a }
            goto L_0x0684
        L_0x066a:
            r0 = move-exception
            goto L_0x0671
        L_0x066c:
            r10 = 0
            goto L_0x0684
        L_0x066e:
            r0 = move-exception
            r6 = r21
        L_0x0671:
            r11 = r0
            if (r10 == 0) goto L_0x067c
            java.lang.String r6 = r6.concat(r10)     // Catch:{ all -> 0x0ade }
            com.appsflyer.AFLogger.afDebugLog(r6)     // Catch:{ all -> 0x0ade }
            goto L_0x067d
        L_0x067c:
            r10 = 0
        L_0x067d:
            java.lang.String r6 = r11.getMessage()     // Catch:{ all -> 0x0ade }
            com.appsflyer.AFLogger.afErrorLog(r6, r11)     // Catch:{ all -> 0x0ade }
        L_0x0684:
            r6 = r10
            goto L_0x068c
        L_0x0686:
            java.lang.String r6 = r1.$$a     // Catch:{ all -> 0x0ade }
            if (r6 == 0) goto L_0x068b
            goto L_0x068c
        L_0x068b:
            r6 = 0
        L_0x068c:
            if (r6 == 0) goto L_0x06a0
            android.content.SharedPreferences r10 = getSharedPreferences(r3)     // Catch:{ all -> 0x0ade }
            android.content.SharedPreferences$Editor r10 = r10.edit()     // Catch:{ all -> 0x0ade }
            r10.putString(r7, r6)     // Catch:{ all -> 0x0ade }
            r10.apply()     // Catch:{ all -> 0x0ade }
            r2.put(r8, r6)     // Catch:{ all -> 0x0ade }
            goto L_0x06a5
        L_0x06a0:
            java.lang.String r6 = "Android ID was not collected."
            com.appsflyer.AFLogger.afInfoLog(r6)     // Catch:{ all -> 0x0ade }
        L_0x06a5:
            com.appsflyer.AdvertisingIdObject r6 = com.appsflyer.AdvertisingIdUtil.getOaid(r3)     // Catch:{ all -> 0x0ade }
            if (r6 == 0) goto L_0x06d3
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0ade }
            r7.<init>()     // Catch:{ all -> 0x0ade }
            java.lang.String r8 = "isManual"
            java.lang.Boolean r10 = r6.isManual()     // Catch:{ all -> 0x0ade }
            r7.put(r8, r10)     // Catch:{ all -> 0x0ade }
            java.lang.String r8 = "val"
            java.lang.String r10 = r6.getAdvertisingId()     // Catch:{ all -> 0x0ade }
            r7.put(r8, r10)     // Catch:{ all -> 0x0ade }
            java.lang.Boolean r6 = r6.isLimitAdTracking()     // Catch:{ all -> 0x0ade }
            if (r6 == 0) goto L_0x06ce
            java.lang.String r8 = "isLat"
            r7.put(r8, r6)     // Catch:{ all -> 0x0ade }
        L_0x06ce:
            java.lang.String r6 = "oaid"
            r2.put(r6, r7)     // Catch:{ all -> 0x0ade }
        L_0x06d3:
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x06e5 }
            r6.<init>(r3)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r6 = com.appsflyer.Installation.m5498id(r6)     // Catch:{ Exception -> 0x06e5 }
            if (r6 == 0) goto L_0x06fc
            java.lang.String r7 = "uid"
            r2.put(r7, r6)     // Catch:{ Exception -> 0x06e5 }
            goto L_0x06fc
        L_0x06e5:
            r0 = move-exception
            r6 = r0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ade }
            java.lang.String r8 = "ERROR: could not get uid "
            r7.<init>(r8)     // Catch:{ all -> 0x0ade }
            java.lang.String r8 = r6.getMessage()     // Catch:{ all -> 0x0ade }
            r7.append(r8)     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0ade }
            com.appsflyer.AFLogger.afErrorLog(r7, r6)     // Catch:{ all -> 0x0ade }
        L_0x06fc:
            java.lang.String r6 = "lang"
            java.util.Locale r7 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x070a }
            java.lang.String r7 = r7.getDisplayLanguage()     // Catch:{ Exception -> 0x070a }
            r2.put(r6, r7)     // Catch:{ Exception -> 0x070a }
            goto L_0x0711
        L_0x070a:
            r0 = move-exception
            r6 = r0
            java.lang.String r7 = "Exception while collecting display language name. "
            com.appsflyer.AFLogger.afErrorLog(r7, r6)     // Catch:{ all -> 0x0ade }
        L_0x0711:
            java.lang.String r6 = "lang_code"
            java.util.Locale r7 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x071f }
            java.lang.String r7 = r7.getLanguage()     // Catch:{ Exception -> 0x071f }
            r2.put(r6, r7)     // Catch:{ Exception -> 0x071f }
            goto L_0x0726
        L_0x071f:
            r0 = move-exception
            r6 = r0
            java.lang.String r7 = "Exception while collecting display language code. "
            com.appsflyer.AFLogger.afErrorLog(r7, r6)     // Catch:{ all -> 0x0ade }
        L_0x0726:
            java.lang.String r6 = "country"
            java.util.Locale r7 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0734 }
            java.lang.String r7 = r7.getCountry()     // Catch:{ Exception -> 0x0734 }
            r2.put(r6, r7)     // Catch:{ Exception -> 0x0734 }
            goto L_0x073b
        L_0x0734:
            r0 = move-exception
            r6 = r0
            java.lang.String r7 = "Exception while collecting country name. "
            com.appsflyer.AFLogger.afErrorLog(r7, r6)     // Catch:{ all -> 0x0ade }
        L_0x073b:
            java.lang.String r6 = "platformextension"
            com.appsflyer.internal.ab r7 = r1.AFFacebookDeferredDeeplink$AppLinkFetchEvents     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = r7.$$b()     // Catch:{ all -> 0x0ade }
            r2.put(r6, r7)     // Catch:{ all -> 0x0ade }
            r1.addNetworkData(r3, r2)     // Catch:{ all -> 0x0ade }
            java.text.SimpleDateFormat r6 = com.appsflyer.AFDateFormat.getDataFormatter(r16)     // Catch:{ all -> 0x0ade }
            android.content.pm.PackageManager r7 = r3.getPackageManager()     // Catch:{ Exception -> 0x0765 }
            java.lang.String r8 = r3.getPackageName()     // Catch:{ Exception -> 0x0765 }
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r8, r9)     // Catch:{ Exception -> 0x0765 }
            long r7 = r7.firstInstallTime     // Catch:{ Exception -> 0x0765 }
            java.lang.String r10 = "installDate"
            java.lang.String r7 = r1.dateFormatUTC(r6, r7)     // Catch:{ Exception -> 0x0765 }
            r2.put(r10, r7)     // Catch:{ Exception -> 0x0765 }
            goto L_0x076c
        L_0x0765:
            r0 = move-exception
            r7 = r0
            java.lang.String r8 = "Exception while collecting install date. "
            com.appsflyer.AFLogger.afErrorLog(r8, r7)     // Catch:{ all -> 0x0ade }
        L_0x076c:
            android.content.pm.PackageManager r7 = r3.getPackageManager()     // Catch:{ all -> 0x07d8 }
            java.lang.String r8 = r3.getPackageName()     // Catch:{ all -> 0x07d8 }
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r8, r9)     // Catch:{ all -> 0x07d8 }
            r10 = r20
            r8 = r35
            int r11 = r8.getInt(r10, r9)     // Catch:{ all -> 0x07d6 }
            int r13 = r7.versionCode     // Catch:{ all -> 0x07d6 }
            if (r13 <= r11) goto L_0x0792
            android.content.SharedPreferences r11 = getSharedPreferences(r3)     // Catch:{ all -> 0x07d6 }
            android.content.SharedPreferences$Editor r11 = r11.edit()     // Catch:{ all -> 0x07d6 }
            r11.putInt(r10, r13)     // Catch:{ all -> 0x07d6 }
            r11.apply()     // Catch:{ all -> 0x07d6 }
        L_0x0792:
            java.lang.String r10 = "app_version_code"
            int r11 = r7.versionCode     // Catch:{ all -> 0x07d6 }
            java.lang.String r11 = java.lang.Integer.toString(r11)     // Catch:{ all -> 0x07d6 }
            r2.put(r10, r11)     // Catch:{ all -> 0x07d6 }
            java.lang.String r10 = "app_version_name"
            java.lang.String r11 = r7.versionName     // Catch:{ all -> 0x07d6 }
            r2.put(r10, r11)     // Catch:{ all -> 0x07d6 }
            long r10 = r7.firstInstallTime     // Catch:{ all -> 0x07d6 }
            long r13 = r7.lastUpdateTime     // Catch:{ all -> 0x07d6 }
            java.lang.String r7 = "date1"
            java.text.SimpleDateFormat r15 = com.appsflyer.AFDateFormat.getDataFormatter(r16)     // Catch:{ all -> 0x07d6 }
            java.util.Date r9 = new java.util.Date     // Catch:{ all -> 0x07d6 }
            r9.<init>(r10)     // Catch:{ all -> 0x07d6 }
            java.lang.String r9 = r15.format(r9)     // Catch:{ all -> 0x07d6 }
            r2.put(r7, r9)     // Catch:{ all -> 0x07d6 }
            java.lang.String r7 = "date2"
            java.text.SimpleDateFormat r9 = com.appsflyer.AFDateFormat.getDataFormatter(r16)     // Catch:{ all -> 0x07d6 }
            java.util.Date r10 = new java.util.Date     // Catch:{ all -> 0x07d6 }
            r10.<init>(r13)     // Catch:{ all -> 0x07d6 }
            java.lang.String r9 = r9.format(r10)     // Catch:{ all -> 0x07d6 }
            r2.put(r7, r9)     // Catch:{ all -> 0x07d6 }
            java.lang.String r6 = r1.values((java.text.SimpleDateFormat) r6, (android.content.Context) r3)     // Catch:{ all -> 0x07d6 }
            java.lang.String r7 = "firstLaunchDate"
            r2.put(r7, r6)     // Catch:{ all -> 0x07d6 }
            goto L_0x07e1
        L_0x07d6:
            r0 = move-exception
            goto L_0x07db
        L_0x07d8:
            r0 = move-exception
            r8 = r35
        L_0x07db:
            r6 = r0
            java.lang.String r7 = "Exception while collecting app version data "
            com.appsflyer.AFLogger.afErrorLog(r7, r6)     // Catch:{ all -> 0x0ade }
        L_0x07e1:
            boolean r6 = com.appsflyer.internal.event.uninstall.Register.didConfiguredFirebaseMessagingServiceListener(r3)     // Catch:{ all -> 0x0ade }
            r1.getThreadPoolExecutor = r6     // Catch:{ all -> 0x0ade }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = "didConfigureTokenRefreshService="
            r6.<init>(r7)     // Catch:{ all -> 0x0ade }
            boolean r7 = r1.getThreadPoolExecutor     // Catch:{ all -> 0x0ade }
            r6.append(r7)     // Catch:{ all -> 0x0ade }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0ade }
            com.appsflyer.AFLogger.afDebugLog(r6)     // Catch:{ all -> 0x0ade }
            boolean r6 = r1.getThreadPoolExecutor     // Catch:{ all -> 0x0ade }
            if (r6 != 0) goto L_0x0806
            java.lang.String r6 = "tokenRefreshConfigured"
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0ade }
            r2.put(r6, r7)     // Catch:{ all -> 0x0ade }
        L_0x0806:
            if (r38 == 0) goto L_0x0837
            java.lang.String r6 = r1.key     // Catch:{ all -> 0x0ade }
            if (r6 == 0) goto L_0x082d
            r6 = r19
            java.lang.Object r7 = r2.get(r6)     // Catch:{ all -> 0x0ade }
            if (r7 == 0) goto L_0x081a
            java.lang.String r6 = "Skip 'af' payload as deeplink was found by path"
            com.appsflyer.AFLogger.afDebugLog(r6)     // Catch:{ all -> 0x0ade }
            goto L_0x082d
        L_0x081a:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ all -> 0x0ade }
            java.lang.String r9 = r1.key     // Catch:{ all -> 0x0ade }
            r7.<init>(r9)     // Catch:{ all -> 0x0ade }
            java.lang.String r9 = "isPush"
            r7.put(r9, r12)     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0ade }
            r2.put(r6, r7)     // Catch:{ all -> 0x0ade }
        L_0x082d:
            r6 = 0
            r1.key = r6     // Catch:{ all -> 0x0ade }
            java.lang.String r6 = "open_referrer"
            r7 = r33
            r2.put(r6, r7)     // Catch:{ all -> 0x0ade }
        L_0x0837:
            java.lang.String r6 = "sensors"
            if (r38 != 0) goto L_0x087b
            com.appsflyer.AFSensorManager r7 = com.appsflyer.AFSensorManager.values((android.content.Context) r3)     // Catch:{ Exception -> 0x0864 }
            j$.util.concurrent.ConcurrentHashMap r9 = new j$.util.concurrent.ConcurrentHashMap     // Catch:{ Exception -> 0x0864 }
            r9.<init>()     // Catch:{ Exception -> 0x0864 }
            java.util.List r7 = r7.$$a()     // Catch:{ Exception -> 0x0864 }
            boolean r10 = r7.isEmpty()     // Catch:{ Exception -> 0x0864 }
            if (r10 != 0) goto L_0x085b
            com.appsflyer.internal.i r10 = new com.appsflyer.internal.i     // Catch:{ Exception -> 0x0864 }
            r10.<init>()     // Catch:{ Exception -> 0x0864 }
            java.util.Map r7 = r10.$$b(r7)     // Catch:{ Exception -> 0x0864 }
            r9.put(r6, r7)     // Catch:{ Exception -> 0x0864 }
            goto L_0x0860
        L_0x085b:
            java.lang.String r7 = "na"
            r9.put(r6, r7)     // Catch:{ Exception -> 0x0864 }
        L_0x0860:
            r2.putAll(r9)     // Catch:{ Exception -> 0x0864 }
            goto L_0x087b
        L_0x0864:
            r0 = move-exception
            r7 = r0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ade }
            java.lang.String r10 = "Unexpected exception from AFSensorManager: "
            r9.<init>(r10)     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x0ade }
            r9.append(r7)     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = r9.toString()     // Catch:{ all -> 0x0ade }
            com.appsflyer.AFLogger.afRDLog(r7)     // Catch:{ all -> 0x0ade }
        L_0x087b:
            r7 = r18
            java.lang.String r9 = r1.getProperty(r7)     // Catch:{ all -> 0x0ade }
            if (r9 != 0) goto L_0x0897
            com.appsflyer.AdvertisingIdUtil.getGaid(r3, r2)     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = r1.getProperty(r7)     // Catch:{ all -> 0x0ade }
            java.lang.String r9 = "GAID_retry"
            if (r7 == 0) goto L_0x0892
            r2.put(r9, r12)     // Catch:{ all -> 0x0ade }
            goto L_0x0897
        L_0x0892:
            java.lang.String r7 = "false"
            r2.put(r9, r7)     // Catch:{ all -> 0x0ade }
        L_0x0897:
            android.content.ContentResolver r7 = r3.getContentResolver()     // Catch:{ all -> 0x0ade }
            com.appsflyer.AdvertisingIdObject r7 = com.appsflyer.AdvertisingIdUtil.getAmazonAID(r7)     // Catch:{ all -> 0x0ade }
            if (r7 == 0) goto L_0x08b7
            java.lang.String r9 = "amazon_aid"
            java.lang.String r10 = r7.getAdvertisingId()     // Catch:{ all -> 0x0ade }
            r2.put(r9, r10)     // Catch:{ all -> 0x0ade }
            java.lang.String r9 = "amazon_aid_limit"
            java.lang.Boolean r7 = r7.isLimitAdTracking()     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0ade }
            r2.put(r9, r7)     // Catch:{ all -> 0x0ade }
        L_0x08b7:
            boolean r7 = com.appsflyer.internal.event.uninstall.Register.isSent(r8)     // Catch:{ all -> 0x0ade }
            java.lang.String r9 = "registeredUninstall"
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0ade }
            r2.put(r9, r7)     // Catch:{ all -> 0x0ade }
            r7 = r38
            int r9 = r1.getLaunchCounter(r8, r7)     // Catch:{ all -> 0x0ade }
            java.lang.String r10 = "counter"
            java.lang.String r11 = java.lang.Integer.toString(r9)     // Catch:{ all -> 0x0ade }
            r2.put(r10, r11)     // Catch:{ all -> 0x0ade }
            java.lang.String r10 = "iaecounter"
            if (r5 == 0) goto L_0x08d9
            r5 = 1
            goto L_0x08da
        L_0x08d9:
            r5 = 0
        L_0x08da:
            java.lang.String r11 = "appsFlyerInAppEventCount"
            int r5 = AFDateFormat((android.content.SharedPreferences) r8, (java.lang.String) r11, (boolean) r5)     // Catch:{ all -> 0x0ade }
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch:{ all -> 0x0ade }
            r2.put(r10, r5)     // Catch:{ all -> 0x0ade }
            r5 = 2
            if (r7 == 0) goto L_0x095b
            java.lang.String r10 = "first_launch"
            r11 = 1
            if (r9 == r11) goto L_0x0911
            if (r9 == r5) goto L_0x08f2
            goto L_0x095b
        L_0x08f2:
            java.util.Map r4 = values((java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0ade }
            r11 = r43
            java.lang.String r12 = r11.getString(r10)     // Catch:{ all -> 0x0ade }
            if (r12 == 0) goto L_0x095d
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ all -> 0x0ade }
            r13.<init>(r12)     // Catch:{ all -> 0x0ade }
            java.util.Map r12 = com.appsflyer.AFHelper.toMap(r13)     // Catch:{ all -> 0x0ade }
            boolean r13 = r12.isEmpty()     // Catch:{ all -> 0x0ade }
            if (r13 != 0) goto L_0x095d
            r4.put(r10, r12)     // Catch:{ all -> 0x0ade }
            goto L_0x095d
        L_0x0911:
            r11 = r43
            r4.setFirstLaunchCalled()     // Catch:{ all -> 0x0ade }
            java.lang.String r4 = "waitForCustomerId"
            r12 = 0
            boolean r4 = AFDateFormat((java.lang.String) r4, (boolean) r12)     // Catch:{ all -> 0x0ade }
            if (r4 == 0) goto L_0x092c
            java.lang.String r4 = "wait_cid"
            r12 = 1
            java.lang.String r13 = java.lang.Boolean.toString(r12)     // Catch:{ all -> 0x0ade }
            r2.put(r4, r13)     // Catch:{ all -> 0x0ade }
            goto L_0x092d
        L_0x092c:
            r12 = 1
        L_0x092d:
            java.util.Map r4 = values((java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0ade }
            r13 = r17
            java.lang.String r14 = r11.getString(r13)     // Catch:{ all -> 0x0ade }
            if (r14 == 0) goto L_0x094b
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ all -> 0x0ade }
            r15.<init>(r14)     // Catch:{ all -> 0x0ade }
            java.util.Map r14 = com.appsflyer.AFHelper.toMap(r15)     // Catch:{ all -> 0x0ade }
            boolean r15 = r14.isEmpty()     // Catch:{ all -> 0x0ade }
            if (r15 != 0) goto L_0x094b
            r4.put(r13, r14)     // Catch:{ all -> 0x0ade }
        L_0x094b:
            org.json.JSONObject r13 = r1.AFKeystoreWrapper     // Catch:{ all -> 0x0ade }
            java.util.Map r13 = com.appsflyer.AFHelper.toMap(r13)     // Catch:{ all -> 0x0ade }
            boolean r14 = r13.isEmpty()     // Catch:{ all -> 0x0ade }
            if (r14 != 0) goto L_0x095e
            r4.put(r10, r13)     // Catch:{ all -> 0x0ade }
            goto L_0x095e
        L_0x095b:
            r11 = r43
        L_0x095d:
            r12 = 1
        L_0x095e:
            java.lang.String r4 = "isFirstCall"
            boolean r10 = firstCallSent(r8)     // Catch:{ all -> 0x0ade }
            if (r10 != 0) goto L_0x0967
            goto L_0x0968
        L_0x0967:
            r12 = 0
        L_0x0968:
            java.lang.String r10 = java.lang.Boolean.toString(r12)     // Catch:{ all -> 0x0ade }
            r2.put(r4, r10)     // Catch:{ all -> 0x0ade }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0ade }
            r4.<init>()     // Catch:{ all -> 0x0ade }
            java.lang.String r10 = "cpu_abi"
            java.lang.String r12 = "ro.product.cpu.abi"
            java.lang.String r12 = $$b((java.lang.String) r12)     // Catch:{ all -> 0x0ade }
            r4.put(r10, r12)     // Catch:{ all -> 0x0ade }
            java.lang.String r10 = "cpu_abi2"
            java.lang.String r12 = "ro.product.cpu.abi2"
            java.lang.String r12 = $$b((java.lang.String) r12)     // Catch:{ all -> 0x0ade }
            r4.put(r10, r12)     // Catch:{ all -> 0x0ade }
            java.lang.String r10 = "arch"
            java.lang.String r12 = "os.arch"
            java.lang.String r12 = $$b((java.lang.String) r12)     // Catch:{ all -> 0x0ade }
            r4.put(r10, r12)     // Catch:{ all -> 0x0ade }
            java.lang.String r10 = "build_display_id"
            java.lang.String r12 = "ro.build.display.id"
            java.lang.String r12 = $$b((java.lang.String) r12)     // Catch:{ all -> 0x0ade }
            r4.put(r10, r12)     // Catch:{ all -> 0x0ade }
            if (r7 == 0) goto L_0x0a2a
            boolean r7 = r1.addParams     // Catch:{ all -> 0x0ade }
            if (r7 == 0) goto L_0x09e7
            com.appsflyer.internal.s r7 = com.appsflyer.internal.C2097s.C2098c.values     // Catch:{ all -> 0x0ade }
            android.location.Location r7 = r7.AFDateFormat(r3)     // Catch:{ all -> 0x0ade }
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ all -> 0x0ade }
            r12 = 3
            r10.<init>(r12)     // Catch:{ all -> 0x0ade }
            if (r7 == 0) goto L_0x09dc
            java.lang.String r12 = "lat"
            double r13 = r7.getLatitude()     // Catch:{ all -> 0x0ade }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0ade }
            r10.put(r12, r13)     // Catch:{ all -> 0x0ade }
            java.lang.String r12 = "lon"
            double r13 = r7.getLongitude()     // Catch:{ all -> 0x0ade }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0ade }
            r10.put(r12, r13)     // Catch:{ all -> 0x0ade }
            java.lang.String r12 = "ts"
            long r13 = r7.getTime()     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0ade }
            r10.put(r12, r7)     // Catch:{ all -> 0x0ade }
        L_0x09dc:
            boolean r7 = r10.isEmpty()     // Catch:{ all -> 0x0ade }
            if (r7 != 0) goto L_0x09e7
            java.lang.String r7 = "loc"
            r4.put(r7, r10)     // Catch:{ all -> 0x0ade }
        L_0x09e7:
            com.appsflyer.internal.a r7 = com.appsflyer.internal.C2060a.C2062d.AFDateFormat     // Catch:{ all -> 0x0ade }
            com.appsflyer.internal.a$a r7 = r7.values(r3)     // Catch:{ all -> 0x0ade }
            java.lang.String r10 = "btl"
            float r12 = r7.$$b     // Catch:{ all -> 0x0ade }
            java.lang.String r12 = java.lang.Float.toString(r12)     // Catch:{ all -> 0x0ade }
            r4.put(r10, r12)     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = r7.AFDateFormat     // Catch:{ all -> 0x0ade }
            if (r7 == 0) goto L_0x0a01
            java.lang.String r10 = "btch"
            r4.put(r10, r7)     // Catch:{ all -> 0x0ade }
        L_0x0a01:
            if (r9 > r5) goto L_0x0a2a
            com.appsflyer.AFSensorManager r5 = com.appsflyer.AFSensorManager.values((android.content.Context) r3)     // Catch:{ all -> 0x0ade }
            j$.util.concurrent.ConcurrentHashMap r7 = new j$.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x0ade }
            r7.<init>()     // Catch:{ all -> 0x0ade }
            java.util.List r9 = r5.valueOf()     // Catch:{ all -> 0x0ade }
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x0ade }
            if (r10 != 0) goto L_0x0a1a
            r7.put(r6, r9)     // Catch:{ all -> 0x0ade }
            goto L_0x0a27
        L_0x0a1a:
            java.util.List r5 = r5.$$a()     // Catch:{ all -> 0x0ade }
            boolean r9 = r5.isEmpty()     // Catch:{ all -> 0x0ade }
            if (r9 != 0) goto L_0x0a27
            r7.put(r6, r5)     // Catch:{ all -> 0x0ade }
        L_0x0a27:
            r4.putAll(r7)     // Catch:{ all -> 0x0ade }
        L_0x0a2a:
            java.util.Map r5 = com.appsflyer.internal.C2092r.values(r3)     // Catch:{ all -> 0x0ade }
            java.lang.String r6 = "dim"
            r4.put(r6, r5)     // Catch:{ all -> 0x0ade }
            java.lang.String r5 = "deviceData"
            r2.put(r5, r4)     // Catch:{ all -> 0x0ade }
            com.appsflyer.HashUtils r4 = new com.appsflyer.HashUtils     // Catch:{ all -> 0x0ade }
            r4.<init>()     // Catch:{ all -> 0x0ade }
            java.lang.String r4 = r4.getHashCode(r2)     // Catch:{ all -> 0x0ade }
            java.lang.String r5 = "af_v"
            r2.put(r5, r4)     // Catch:{ all -> 0x0ade }
            com.appsflyer.HashUtils r4 = new com.appsflyer.HashUtils     // Catch:{ all -> 0x0ade }
            r4.<init>()     // Catch:{ all -> 0x0ade }
            java.lang.String r4 = r4.getHashCodeV2(r2)     // Catch:{ all -> 0x0ade }
            java.lang.String r5 = "af_v2"
            r2.put(r5, r4)     // Catch:{ all -> 0x0ade }
            boolean r4 = dateFormatUTC((android.content.Context) r3)     // Catch:{ all -> 0x0ade }
            java.lang.String r5 = "ivc"
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0ade }
            r2.put(r5, r4)     // Catch:{ all -> 0x0ade }
            java.lang.String r4 = "is_stop_tracking_used"
            boolean r4 = r8.contains(r4)     // Catch:{ all -> 0x0ade }
            if (r4 == 0) goto L_0x0a79
            java.lang.String r4 = "istu"
            java.lang.String r5 = "is_stop_tracking_used"
            r6 = 0
            boolean r5 = r8.getBoolean(r5, r6)     // Catch:{ all -> 0x0ade }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0ade }
            r2.put(r4, r5)     // Catch:{ all -> 0x0ade }
        L_0x0a79:
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0ade }
            r4.<init>()     // Catch:{ all -> 0x0ade }
            java.lang.String r5 = "mcc"
            android.content.res.Resources r6 = r3.getResources()     // Catch:{ all -> 0x0ade }
            android.content.res.Configuration r6 = r6.getConfiguration()     // Catch:{ all -> 0x0ade }
            int r6 = r6.mcc     // Catch:{ all -> 0x0ade }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0ade }
            r4.put(r5, r6)     // Catch:{ all -> 0x0ade }
            java.lang.String r5 = "mnc"
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ all -> 0x0ade }
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch:{ all -> 0x0ade }
            int r3 = r3.mnc     // Catch:{ all -> 0x0ade }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0ade }
            r4.put(r5, r3)     // Catch:{ all -> 0x0ade }
            java.lang.String r3 = "cell"
            r2.put(r3, r4)     // Catch:{ all -> 0x0ade }
            java.lang.String r3 = "sig"
            java.lang.String r4 = r11.signature()     // Catch:{ all -> 0x0ade }
            r2.put(r3, r4)     // Catch:{ all -> 0x0ade }
            java.lang.String r3 = "last_boot_time"
            long r4 = r11.bootTime()     // Catch:{ all -> 0x0ade }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0ade }
            r2.put(r3, r4)     // Catch:{ all -> 0x0ade }
            java.lang.String r3 = "disk"
            java.lang.String r4 = r11.disk()     // Catch:{ all -> 0x0ade }
            r2.put(r3, r4)     // Catch:{ all -> 0x0ade }
            java.lang.String[] r3 = r1.sharingFilter     // Catch:{ all -> 0x0ade }
            if (r3 == 0) goto L_0x0ae7
            java.lang.String r4 = "sharing_filter"
            r2.put(r4, r3)     // Catch:{ all -> 0x0ade }
            goto L_0x0ae7
        L_0x0ad2:
            java.lang.String r3 = "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. "
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch:{ all -> 0x0ade }
            java.lang.String r3 = "AppsFlyer will not track this event."
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch:{ all -> 0x0ade }
            r2 = 0
            return r2
        L_0x0ade:
            r0 = move-exception
            r3 = r0
            java.lang.String r4 = r3.getLocalizedMessage()
            com.appsflyer.AFLogger.afErrorLog(r4, r3)
        L_0x0ae7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.AFDateFormat(com.appsflyer.AFEvent):java.util.Map");
    }

    private String values(SimpleDateFormat simpleDateFormat, Context context2) {
        String str;
        String string = getSharedPreferences(context2).getString("appsFlyerFirstInstall", (String) null);
        if (string == null) {
            if (isAppsFlyerFirstLaunch(context2)) {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                str = simpleDateFormat.format(new Date());
            } else {
                str = "";
            }
            string = str;
            SharedPreferences.Editor edit = getSharedPreferences(context2).edit();
            edit.putString("appsFlyerFirstInstall", string);
            edit.apply();
        }
        AFLogger.afInfoLog("AppsFlyer: first launch date: ".concat(String.valueOf(string)));
        return string;
    }

    private static int AFDateFormat(SharedPreferences sharedPreferences, String str, boolean z) {
        int i = sharedPreferences.getInt(str, 0);
        if (z) {
            i++;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(str, i);
            edit.apply();
        }
        if (C2069ad.$$a().getInstance()) {
            C2069ad.$$a().$$a(String.valueOf(i));
        }
        return i;
    }

    /* access modifiers changed from: private */
    public static void AFDateFormat(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        if (scheduledExecutorService != null) {
            try {
                if (!scheduledExecutorService.isShutdown() && !scheduledExecutorService.isTerminated()) {
                    scheduledExecutorService.schedule(runnable, j, timeUnit);
                    return;
                }
            } catch (RejectedExecutionException e) {
                AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e);
                return;
            } catch (Throwable th) {
                AFLogger.afErrorLog("scheduleJob failed with Exception", th);
                return;
            }
        }
        AFLogger.afWarnLog("scheduler is null, shut downed or terminated");
    }

    public static /* synthetic */ void AFDateFormat(AppsFlyerLibCore appsFlyerLibCore, Context context2, String str, String str2) {
        SharedPreferences.Editor edit = getSharedPreferences(context2).edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
