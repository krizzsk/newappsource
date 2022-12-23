package com.fyber.inneractive.sdk.external;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewTreeObserver;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.models.InAppMessageBase;
import com.appboy.models.outgoing.TwitterUser;
import com.fyber.inneractive.sdk.C2540b;
import com.fyber.inneractive.sdk.bidder.C2566a;
import com.fyber.inneractive.sdk.bidder.C2589e;
import com.fyber.inneractive.sdk.cache.session.C2601b;
import com.fyber.inneractive.sdk.cache.session.C2604d;
import com.fyber.inneractive.sdk.config.C2620b;
import com.fyber.inneractive.sdk.config.C2625c;
import com.fyber.inneractive.sdk.config.C2627d;
import com.fyber.inneractive.sdk.config.C2628d0;
import com.fyber.inneractive.sdk.config.C2630e;
import com.fyber.inneractive.sdk.config.C2667h;
import com.fyber.inneractive.sdk.config.C2668i;
import com.fyber.inneractive.sdk.config.C2671j;
import com.fyber.inneractive.sdk.config.C2672k;
import com.fyber.inneractive.sdk.config.C2676l;
import com.fyber.inneractive.sdk.config.C2677m;
import com.fyber.inneractive.sdk.config.C2679n;
import com.fyber.inneractive.sdk.config.C2680o;
import com.fyber.inneractive.sdk.config.C2696s;
import com.fyber.inneractive.sdk.config.C2701x;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C2634a;
import com.fyber.inneractive.sdk.config.global.C2665r;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.fyber.inneractive.sdk.factories.C2751a;
import com.fyber.inneractive.sdk.factories.C2754b;
import com.fyber.inneractive.sdk.factories.C2757c;
import com.fyber.inneractive.sdk.logger.FMPLogger;
import com.fyber.inneractive.sdk.mraid.IAMraidKit;
import com.fyber.inneractive.sdk.network.C2891c;
import com.fyber.inneractive.sdk.network.C2894d;
import com.fyber.inneractive.sdk.network.C2900f0;
import com.fyber.inneractive.sdk.network.C2922o;
import com.fyber.inneractive.sdk.network.C2924p;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.network.C2938w;
import com.fyber.inneractive.sdk.p048dv.C2713c;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.C3669a0;
import com.fyber.inneractive.sdk.util.C3671b0;
import com.fyber.inneractive.sdk.util.C3685f0;
import com.fyber.inneractive.sdk.util.C3699i;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.C3717n0;
import com.fyber.inneractive.sdk.util.C3725r;
import com.fyber.inneractive.sdk.util.C3731t0;
import com.fyber.inneractive.sdk.util.C3733u0;
import com.fyber.inneractive.sdk.util.C3738v;
import com.fyber.inneractive.sdk.util.C3741w0;
import com.fyber.inneractive.sdk.util.C3747z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.video.IAVideoKit;
import com.fyber.inneractive.sdk.web.C3790r;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public final class InneractiveAdManager implements C2668i.C2670b {
    public static final String GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT = "sdk_first_init";

    /* renamed from: c */
    public static IAConfigManager.OnConfigurationReadyAndValidListener f9489c;

    /* renamed from: a */
    public volatile Context f9490a;

    /* renamed from: b */
    public String f9491b;

    public enum GdprConsentSource {
        Internal,
        External
    }

    /* renamed from: com.fyber.inneractive.sdk.external.InneractiveAdManager$a */
    public class C2744a implements IAConfigManager.OnConfigurationReadyAndValidListener {

        /* renamed from: a */
        public final /* synthetic */ Context f9493a;

        /* renamed from: b */
        public final /* synthetic */ OnFyberMarketplaceInitializedListener f9494b;

        public C2744a(Context context, OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
            this.f9493a = context;
            this.f9494b = onFyberMarketplaceInitializedListener;
        }

        public void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
            OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus;
            if (this.f9493a.getApplicationContext() != null) {
                IAConfigManager.removeListener(this);
                InneractiveAdManager.f9489c = null;
                if (z) {
                    InneractiveAdManager.m6869a(this.f9494b, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, (String) null);
                    return;
                }
                OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener = this.f9494b;
                if (exc instanceof InvalidAppIdException) {
                    fyberInitStatus = OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID;
                } else {
                    fyberInitStatus = OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED;
                }
                InneractiveAdManager.m6869a(onFyberMarketplaceInitializedListener, fyberInitStatus, exc.getLocalizedMessage());
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.external.InneractiveAdManager$b */
    public static class C2745b {

        /* renamed from: a */
        public static volatile InneractiveAdManager f9495a = new InneractiveAdManager();
    }

    /* renamed from: a */
    public static void m6869a(OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus, String str) {
        if (onFyberMarketplaceInitializedListener != null) {
            onFyberMarketplaceInitializedListener.onFyberMarketplaceInitialized(fyberInitStatus);
        }
        if (C2745b.f9495a.f9490a != null && fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
            C2926q.C2927a aVar = new C2926q.C2927a(C2922o.FMP_SDK_INIT_FAILED, (InneractiveAdRequest) null, (C3648e) null, (JSONArray) null);
            if (!TextUtils.isEmpty(str)) {
                aVar.mo13716a(InAppMessageBase.MESSAGE, str);
            }
            aVar.mo13716a("init_status", fyberInitStatus.name());
            aVar.mo13717a((String) null);
        }
    }

    @Deprecated
    public static boolean areNativeAdsSupportedForOS() {
        return true;
    }

    public static void clearGdprConsentData() {
        C2627d dVar = IAConfigManager.f9202J.f9207D;
        if (dVar != null) {
            IAlog.m9902a("Clearing GDPR Consent String and status", new Object[0]);
            if (C3707l.f12893a == null) {
                IAlog.m9906e("ClearGdprConsent was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            dVar.mo13208b();
            dVar.f9271a = null;
            dVar.f9272b = null;
            SharedPreferences sharedPreferences = dVar.f9277g;
            if (sharedPreferences != null) {
                sharedPreferences.edit().remove("IAGdprConsentData").remove("IAGDPRBool").remove("IAGdprSource").apply();
                return;
            }
            return;
        }
        IAlog.m9906e("clearGdprConsentData() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void clearImpressionDataListener() {
        IAConfigManager.f9202J.f9204A.f12884a = null;
    }

    public static void clearLgpdConsentData() {
        C2627d dVar = IAConfigManager.f9202J.f9207D;
        if (dVar != null) {
            IAlog.m9902a("Clearing LGPD consent status", new Object[0]);
            if (C3707l.f12893a == null) {
                IAlog.m9906e("clearLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            dVar.mo13208b();
            dVar.f9276f = null;
            SharedPreferences sharedPreferences = dVar.f9277g;
            if (sharedPreferences != null) {
                sharedPreferences.edit().remove("IALgpdConsentStatus").apply();
                return;
            }
            return;
        }
        IAlog.m9906e("clearLgpdConsentData was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void clearUSPrivacyString() {
        C2627d dVar = IAConfigManager.f9202J.f9207D;
        dVar.getClass();
        IAlog.m9902a("Clearing CCPA Consent String", new Object[0]);
        if (C3707l.f12893a == null) {
            IAlog.m9906e("clearUSPrivacyString was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        dVar.mo13208b();
        dVar.f9275e = null;
        SharedPreferences sharedPreferences = dVar.f9277g;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IACCPAConsentData").apply();
        }
    }

    public static void destroy() {
        IAlog.m9902a("InneractiveAdManager:destroy called", new Object[0]);
        if (C2745b.f9495a.f9490a == null) {
            IAlog.m9902a("InneractiveAdManager:destroy called, but manager is not initialized", new Object[0]);
            return;
        }
        C2745b.f9495a.f9490a = null;
        IAConfigManager.removeListener(f9489c);
        f9489c = null;
        IAConfigManager iAConfigManager = IAConfigManager.f9202J;
        iAConfigManager.f9204A.f12884a = null;
        iAConfigManager.f9220h = false;
        C3747z zVar = C3747z.C3748a.f12955a;
        IAlog.m9902a("%sdestroy called", "Location Manager: ");
        Runnable runnable = zVar.f12951d;
        if (runnable != null) {
            C3714n.f12902b.removeCallbacks(runnable);
        }
        zVar.mo15401a(zVar.f12952e);
        zVar.mo15401a(zVar.f12953f);
        zVar.f12952e = null;
        zVar.f12953f = null;
        zVar.f12948a = null;
        zVar.f12950c = null;
        C3685f0 f0Var = C3685f0.C3689d.f12862a;
        f0Var.f12857b.clear();
        for (Context context : f0Var.f12856a.keySet()) {
            Pair pair = f0Var.f12856a.get(context);
            if (pair != null && ((ViewTreeObserver) pair.first).isAlive()) {
                ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
            }
        }
        f0Var.f12856a.clear();
        C3671b0 b0Var = C3671b0.C3672a.f12828a;
        synchronized (b0Var) {
            if (b0Var.f12826c != null) {
                IAlog.m9902a("%sremoving screen state receiver and destroying singleton", IAlog.m9899a((Object) b0Var));
                b0Var.f12826c.unregisterReceiver(b0Var.f12827d);
                b0Var.f12826c = null;
                b0Var.f12827d = null;
                b0Var.f12824a.clear();
            }
        }
        C2754b.C2755a.f9535a.f9534a.clear();
        C2751a.C2753b.f9533a.f9532a.clear();
        C2757c.C2759b.f9537a.f9536a.clear();
        InneractiveAdSpotManager.destroy();
        ((HashMap) C3707l.C3709b.f12895a).clear();
        C2566a aVar = C2566a.f9066h;
        C2589e eVar = aVar.f9070d;
        if (eVar != null) {
            try {
                C3707l.f12893a.unregisterReceiver(eVar);
            } catch (Exception unused) {
            }
        }
        aVar.f9070d = null;
    }

    public static String getAppId() {
        return IAConfigManager.f9202J.f9215c;
    }

    @Deprecated
    public static String getDevPlatform() {
        return C2745b.f9495a.f9491b;
    }

    public static Boolean getGdprConsent() {
        return IAConfigManager.f9202J.f9207D.mo13205a();
    }

    public static GdprConsentSource getGdprStatusSource() {
        C2627d dVar = IAConfigManager.f9202J.f9207D;
        if (dVar != null) {
            return dVar.f9273c;
        }
        IAlog.m9906e("getGdprStatusSource() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        return null;
    }

    @Deprecated
    public static String getKeywords() {
        return IAConfigManager.f9202J.f9223k;
    }

    public static boolean getMuteVideo() {
        return IAConfigManager.f9202J.f9224l;
    }

    public static String getUserId() {
        return IAConfigManager.m6635e();
    }

    public static InneractiveUserConfig getUserParams() {
        return IAConfigManager.f9202J.f9222j;
    }

    public static String getVersion() {
        return "8.1.5";
    }

    public static void initialize(Context context, String str) {
        initialize(context, str, (OnFyberMarketplaceInitializedListener) null);
    }

    @Deprecated
    public static boolean isCurrentDeviceSupportsVideo() {
        return true;
    }

    @Deprecated
    public static void setDevPlatform(String str) {
        C2745b.f9495a.f9491b = str;
    }

    public static void setGdprConsent(boolean z) {
        setGdprConsent(z, GdprConsentSource.Internal);
    }

    public static void setGdprConsentString(String str) {
        C2627d dVar = IAConfigManager.f9202J.f9207D;
        if (dVar == null) {
            IAlog.m9906e("setGdprConsentString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        } else if (C3707l.f12893a == null) {
            IAlog.m9906e("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        } else {
            dVar.f9272b = str;
            if (!dVar.mo13206a("IAGdprConsentData", str)) {
                IAlog.m9906e("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
            }
        }
    }

    public static void setImpressionDataListener(OnGlobalImpressionDataListener onGlobalImpressionDataListener) {
        IAConfigManager.f9202J.f9204A.f12884a = onGlobalImpressionDataListener;
    }

    @Deprecated
    public static void setKeywords(String str) {
        IAConfigManager.f9202J.f9223k = str;
    }

    public static void setLgpdConsent(boolean z) {
        C2627d dVar = IAConfigManager.f9202J.f9207D;
        if (dVar == null) {
            IAlog.m9906e("setLgpdConsent was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        } else if (C3707l.f12893a == null) {
            IAlog.m9906e("setLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        } else {
            dVar.f9276f = Boolean.valueOf(z);
            if (!dVar.mo13207a("IALgpdConsentStatus", z)) {
                IAlog.m9906e("setLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            }
        }
    }

    public static void setLogLevel(int i) {
        IAlog.f12814a = i;
    }

    public static void setMediationName(String str) {
        IAConfigManager.f9202J.f9225m = str;
    }

    public static void setMediationVersion(String str) {
        if (str != null) {
            IAConfigManager.f9202J.f9227o = str;
        }
    }

    public static void setMuteVideo(boolean z) {
        IAConfigManager.f9202J.f9224l = z;
    }

    public static void setUSPrivacyString(String str) {
        C2627d dVar = IAConfigManager.f9202J.f9207D;
        if (dVar == null) {
            IAlog.m9906e("setUSPrivacyString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        } else if (C3707l.f12893a == null) {
            IAlog.m9906e("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        } else {
            dVar.f9275e = str;
            if (!dVar.mo13206a("IACCPAConsentData", str)) {
                IAlog.m9906e("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
            }
        }
    }

    public static void setUseLocation(boolean z) {
        IAConfigManager.f9202J.f9231s = z;
    }

    public static void setUserId(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.f9202J;
        if (C3707l.f12893a == null) {
            IAlog.m9906e("setUsedId() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        C2627d dVar = IAConfigManager.f9202J.f9207D;
        dVar.getClass();
        if (C3707l.f12893a != null) {
            dVar.mo13208b();
            if (TextUtils.isEmpty(str)) {
                dVar.f9274d = str;
                SharedPreferences sharedPreferences = dVar.f9277g;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().remove("keyUserID").apply();
                    return;
                }
                return;
            }
            if (str.length() > 256) {
                str = str.substring(0, 256);
            }
            SharedPreferences sharedPreferences2 = dVar.f9277g;
            if (sharedPreferences2 != null) {
                dVar.f9274d = str;
                sharedPreferences2.edit().putString("keyUserID", str).apply();
            }
        }
    }

    public static void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        IAConfigManager.f9202J.f9222j = inneractiveUserConfig;
        StringBuilder k = C13555b.m33972k("config manager: setUserParams called with: age:");
        k.append(inneractiveUserConfig.getAge());
        k.append(" gender: ");
        k.append(inneractiveUserConfig.getGender());
        k.append(" zip: ");
        k.append(inneractiveUserConfig.getZipCode());
        IAlog.m9902a(k.toString(), new Object[0]);
    }

    public static void useSecureConnections(boolean z) {
        IAConfigManager.f9202J.f9230r = z;
        IAlog.m9902a("config manager: useSecureConnections called with: isSecured: + %s", Boolean.valueOf(z));
        if (!C3725r.m9983a() && !z) {
            IAlog.m9906e("************************************************************************************************************************", new Object[0]);
            IAlog.m9906e("*** useSecureConnections was set to false while secure traffic is enabled in the network security config", new Object[0]);
            IAlog.m9906e("***  The traffic will be Secured  ", new Object[0]);
            IAlog.m9906e("************************************************************************************************************************", new Object[0]);
        }
    }

    public static boolean wasInitialized() {
        return C2745b.f9495a.f9490a != null;
    }

    public Context getAppContext() {
        return this.f9490a;
    }

    public void onGlobalConfigChanged(C2668i iVar, C2667h hVar) {
        if (hVar != null && hVar.mo13273a(GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT, false)) {
            C3714n.f12902b.post(new C2750b(this));
        }
    }

    public static void initialize(Context context, String str, OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
        OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus;
        String str2;
        int i;
        String str3;
        Context context2 = context;
        String str4 = str;
        OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener2 = onFyberMarketplaceInitializedListener;
        if (context2 == null || str4 == null) {
            IAlog.m9903b("InneractiveAdManager:initialize. No context or App Id given", new Object[0]);
            Object[] objArr = new Object[1];
            objArr[0] = str4 == null ? "appid" : AppActionRequest.KEY_CONTEXT;
            String format = String.format("%s is null", objArr);
            if (str4 == null || TextUtils.isEmpty(str.trim())) {
                fyberInitStatus = OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID;
            } else {
                fyberInitStatus = OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED;
            }
            m6869a(onFyberMarketplaceInitializedListener2, fyberInitStatus, format);
            return;
        }
        String str5 = IAConfigManager.f9202J.f9215c;
        boolean z = str5 != null && !str5.equalsIgnoreCase(str4);
        if (C2745b.f9495a.f9490a == null || z) {
            ((CopyOnWriteArrayList) IAlog.f12816c).retainAll(Collections.singleton(IAlog.f12815b));
            int i2 = C2630e.f9283a;
            String property = System.getProperty("ia.testEnvironmentConfiguration.logger");
            if (property != null) {
                for (String cls : property.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR)) {
                    try {
                        FMPLogger fMPLogger = (FMPLogger) Class.forName(cls).newInstance();
                        fMPLogger.initialize(context2);
                        ((CopyOnWriteArrayList) IAlog.f12816c).add(fMPLogger);
                    } catch (Throwable unused) {
                    }
                }
            }
            C3707l.f12893a = (Application) context.getApplicationContext();
            C3671b0 b0Var = C3671b0.C3672a.f12828a;
            Context applicationContext = context.getApplicationContext();
            b0Var.getClass();
            IAlog.m9902a("%sinit called", IAlog.m9899a((Object) b0Var));
            b0Var.f12826c = applicationContext;
            b0Var.f12827d = new C3669a0(b0Var);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            b0Var.f12826c.registerReceiver(b0Var.f12827d, intentFilter);
            Intent intent = new Intent();
            intent.setAction("com.fyber.inneractive.sdk.intent.action.REGISTER_KIT");
            intent.setPackage(C3707l.f12893a.getPackageName());
            Context applicationContext2 = context.getApplicationContext();
            if (applicationContext2 != null) {
                List<BroadcastReceiver> asList = Arrays.asList(new BroadcastReceiver[]{new IAMraidKit(), new IAVideoKit(), new C2713c()});
                for (BroadcastReceiver broadcastReceiver : asList) {
                    try {
                        broadcastReceiver.onReceive(applicationContext2, intent);
                    } catch (Throwable unused2) {
                        IAlog.m9906e("%sCould not trigger receiver for %s", IAlog.m9898a((Class<?>) C2540b.class), broadcastReceiver);
                    }
                }
                C2754b.C2755a.f9535a.f9534a.size();
                if (asList.size() == 0) {
                    IAlog.m9903b("InneractiveAdManager:initialize. please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project", new Object[0]);
                    m6869a(onFyberMarketplaceInitializedListener2, OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED_NO_KITS_DETECTED, (String) null);
                    return;
                }
                C2744a aVar = new C2744a(context2, onFyberMarketplaceInitializedListener2);
                f9489c = aVar;
                IAConfigManager.addListener(aVar);
                if (z) {
                    IAConfigManager iAConfigManager = IAConfigManager.f9202J;
                    iAConfigManager.f9215c = str4;
                    Map<String, C2701x> map = iAConfigManager.f9213a;
                    if (map != null) {
                        map.clear();
                    }
                    Map<String, C2702y> map2 = iAConfigManager.f9214b;
                    if (map2 != null) {
                        map2.clear();
                    }
                    iAConfigManager.f9217e = null;
                    iAConfigManager.f9216d = "";
                    IAConfigManager.m6631a();
                } else {
                    Context applicationContext3 = context.getApplicationContext();
                    IAConfigManager iAConfigManager2 = IAConfigManager.f9202J;
                    if (!iAConfigManager2.f9220h) {
                        C3733u0 u0Var = new C3733u0();
                        iAConfigManager2.f9237y = u0Var;
                        u0Var.f12929b = applicationContext3.getApplicationContext();
                        C3714n.m9976a(new C3731t0(u0Var));
                        C2938w wVar = iAConfigManager2.f9232t;
                        if (!wVar.f10065b) {
                            wVar.f10065b = true;
                            for (int i3 = 0; i3 < 6; i3++) {
                                wVar.f10067d.submit(wVar.f10068e);
                            }
                        }
                        C3714n.m9976a(new C2677m(iAConfigManager2, iAConfigManager2, applicationContext3));
                        C3790r.f13063c.getClass();
                        iAConfigManager2.f9207D = new C2627d();
                        C2668i iVar = new C2668i(applicationContext3);
                        iAConfigManager2.f9234v = iVar;
                        iAConfigManager2.f9235w = new C2671j(iVar);
                        iVar.mo13277b();
                        C2891c cVar = iAConfigManager2.f9210G;
                        Application application = (Application) applicationContext3.getApplicationContext();
                        if (!cVar.f9882g) {
                            cVar.f9882g = true;
                            cVar.f9878c.start();
                            cVar.f9879d = new C3717n0(cVar.f9878c.getLooper(), cVar);
                        }
                        application.registerActivityLifecycleCallbacks(new C2894d(cVar));
                        iAConfigManager2.f9234v.f9338c.add(new C2676l(iAConfigManager2));
                        iAConfigManager2.f9238z = new C2634a(new C2665r());
                        IAlog.m9902a("Initializing config manager", new Object[0]);
                        IAlog.m9902a("Config manager: lib name = %s", "Android");
                        IAlog.m9902a("Config manager: app version = %s", "8.1.5");
                        C3747z zVar = C3747z.C3748a.f12955a;
                        Context applicationContext4 = applicationContext3.getApplicationContext();
                        zVar.f12948a = applicationContext4;
                        if (applicationContext4 != null && IAConfigManager.f9202J.f9231s) {
                            C3738v vVar = new C3738v(zVar);
                            zVar.f12950c = vVar;
                            C3699i.m9941a(applicationContext4, vVar);
                        }
                        C2672k kVar = C2672k.C2674b.f9345a;
                        if (kVar.f9343a == null) {
                            kVar.f9343a = applicationContext3;
                            new Thread(new C2696s(applicationContext3, kVar)).start();
                        }
                        if (!str4.matches("[0-9]+")) {
                            IAlog.m9903b("************************************************************************************************************************", new Object[0]);
                            IAlog.m9903b("*************************************** APP ID Must contain only numbers ***********************************************", new Object[0]);
                            IAlog.m9903b("*************************************** Are you sure that you are using the correct APP ID *****************************", new Object[0]);
                            IAlog.m9903b("************************************************************************************************************************", new Object[0]);
                        }
                        iAConfigManager2.f9218f = applicationContext3;
                        iAConfigManager2.f9215c = str4;
                        iAConfigManager2.f9222j = new InneractiveUserConfig();
                        iAConfigManager2.f9220h = true;
                        C2628d0 d0Var = iAConfigManager2.f9236x;
                        d0Var.getClass();
                        C2620b bVar = new C2620b(d0Var);
                        IAConfigManager iAConfigManager3 = IAConfigManager.f9202J;
                        C2668i iVar2 = iAConfigManager3.f9234v;
                        if (!iVar2.f9339d) {
                            iVar2.f9338c.add(bVar);
                        }
                        C3741w0 w0Var = new C3741w0(TimeUnit.MINUTES, (long) iAConfigManager3.f9234v.f9337b.mo13271a("session_duration", 30, 1));
                        bVar.f9260c = w0Var;
                        w0Var.f12943e = bVar.f9263f;
                        d0Var.f9280c.put("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                        C2604d dVar = new C2604d(25, (C2604d.C2605a) null);
                        d0Var.f9278a = dVar;
                        C3714n.m9976a(new C2601b(dVar));
                        iAConfigManager2.f9205B = new C2900f0(new C2679n(iAConfigManager2), iAConfigManager2.f9218f, new C2625c());
                        C3714n.m9976a(new C2680o(iAConfigManager2));
                        try {
                            str3 = Locale.getDefault().getLanguage();
                            try {
                                IAlog.m9902a("Available device language: %s", str3);
                            } catch (Exception unused3) {
                            }
                        } catch (Exception unused4) {
                            str3 = null;
                        }
                        iAConfigManager2.f9228p = str3;
                        iAConfigManager2.f9208E.mo13330a();
                    }
                }
                C2745b.f9495a.f9490a = context.getApplicationContext();
                SharedPreferences sharedPreferences = context2.getSharedPreferences("Fyber_Shared_File", 0);
                String string = sharedPreferences.getString("FyberExceptionKey", "empty");
                String string2 = sharedPreferences.getString("FyberDescriptionKey", "empty");
                String string3 = sharedPreferences.getString("FyberNameKey", "empty");
                String string4 = sharedPreferences.getString("FyberVersionKey", getVersion());
                IAlog.m9902a(" name- %s   description - %s exception - %s", string3, string2, string);
                if (!string.contains("OutOfMemoryError") && !string.equals("empty") && !string2.equals("empty") && !string3.equals("empty")) {
                    IAlog.m9902a("Firing Event 999 for %s", string);
                    C2924p pVar = C2924p.IA_UNCAUGHT_EXCEPTION;
                    C2926q.C2927a aVar2 = new C2926q.C2927a((C3648e) null);
                    aVar2.f10042c = pVar;
                    aVar2.f10040a = null;
                    aVar2.f10043d = null;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("exception_name", string3);
                        str2 = "FyberNameKey";
                        i = 2;
                    } catch (Exception unused5) {
                        str2 = "FyberNameKey";
                        i = 2;
                        IAlog.m9906e("Got exception adding param to json object: %s, %s", "exception_name", string3);
                    }
                    try {
                        jSONObject.put(TwitterUser.DESCRIPTION_KEY, string2);
                    } catch (Exception unused6) {
                        Object[] objArr2 = new Object[i];
                        objArr2[0] = TwitterUser.DESCRIPTION_KEY;
                        objArr2[1] = string2;
                        IAlog.m9906e("Got exception adding param to json object: %s, %s", objArr2);
                    }
                    try {
                        jSONObject.put("stack_trace", string);
                    } catch (Exception unused7) {
                        Object[] objArr3 = new Object[i];
                        objArr3[0] = "stack_trace";
                        objArr3[1] = string;
                        IAlog.m9906e("Got exception adding param to json object: %s, %s", objArr3);
                    }
                    aVar2.f10045f.put(jSONObject);
                    aVar2.mo13717a(string4);
                    sharedPreferences.edit().remove("FyberExceptionKey").remove("FyberVersionKey").remove("FyberDescriptionKey").remove(str2).apply();
                }
                Thread.setDefaultUncaughtExceptionHandler(new C2749a(sharedPreferences, Thread.getDefaultUncaughtExceptionHandler()));
                IAConfigManager iAConfigManager4 = IAConfigManager.f9202J;
                iAConfigManager4.f9234v.f9338c.remove(C2745b.f9495a);
                iAConfigManager4.f9234v.f9338c.add(C2745b.f9495a);
                return;
            }
            throw new IllegalArgumentException("Context can't be null");
        }
        IAlog.m9902a("InneractiveAdManager:initialize called, but manager is already initialized. ignoring", new Object[0]);
        m6869a(onFyberMarketplaceInitializedListener2, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, (String) null);
    }

    public static void setGdprConsent(boolean z, GdprConsentSource gdprConsentSource) {
        C2627d dVar = IAConfigManager.f9202J.f9207D;
        if (dVar == null) {
            IAlog.m9906e("setGdprConsent() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        } else if (C3707l.f12893a == null) {
            IAlog.m9906e("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        } else {
            dVar.f9271a = Boolean.valueOf(z);
            if (!dVar.mo13207a("IAGDPRBool", z)) {
                IAlog.m9906e("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            }
            dVar.f9273c = gdprConsentSource;
            if (!dVar.mo13206a("IAGdprSource", gdprConsentSource.name())) {
                IAlog.m9906e("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            }
        }
    }

    public static void setMediationName(InneractiveMediationName inneractiveMediationName) {
        if (inneractiveMediationName != null) {
            IAConfigManager iAConfigManager = IAConfigManager.f9202J;
            iAConfigManager.f9226n = inneractiveMediationName;
            iAConfigManager.f9225m = inneractiveMediationName.getKey();
        }
    }
}
