package com.appboy;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.activity.C0199g;
import androidx.annotation.Keep;
import androidx.appcompat.widget.C0416i1;
import androidx.appcompat.widget.C0441n1;
import androidx.camera.camera2.internal.C0509c;
import com.appboy.configuration.RuntimeAppConfigurationProvider;
import com.appboy.events.BrazeNetworkFailureEvent;
import com.appboy.events.BrazeSdkAuthenticationErrorEvent;
import com.appboy.events.ContentCardsUpdatedEvent;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.events.IEventSubscriber;
import com.appboy.events.IValueCallback;
import com.appboy.events.InAppMessageEvent;
import com.appboy.events.SessionStateChangedEvent;
import com.appboy.lrucache.AppboyLruImageLoader;
import com.appboy.models.IInAppMessage;
import com.appboy.models.cards.Card;
import com.appboy.models.outgoing.AppboyProperties;
import com.appboy.support.AppboyFileUtils;
import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import com.appboy.support.PermissionUtils;
import com.appboy.support.StringUtils;
import com.appboy.support.ValidationUtils;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.IBraze;
import com.braze.configuration.BrazeConfig;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.outgoing.BrazeProperties;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p019b0.C1436m;
import p030bo.app.C1522a0;
import p030bo.app.C1528a6;
import p030bo.app.C1535b2;
import p030bo.app.C1546c0;
import p030bo.app.C1550c4;
import p030bo.app.C1556d2;
import p030bo.app.C1558d4;
import p030bo.app.C1564e1;
import p030bo.app.C1565e2;
import p030bo.app.C1583g1;
import p030bo.app.C1592h0;
import p030bo.app.C1593h1;
import p030bo.app.C1594h2;
import p030bo.app.C1600i0;
import p030bo.app.C1601i1;
import p030bo.app.C1602i2;
import p030bo.app.C1607j;
import p030bo.app.C1609j1;
import p030bo.app.C1614j6;
import p030bo.app.C1618k1;
import p030bo.app.C1619k2;
import p030bo.app.C1623k6;
import p030bo.app.C1643n2;
import p030bo.app.C1665p4;
import p030bo.app.C1671q2;
import p030bo.app.C1679r1;
import p030bo.app.C1687s2;
import p030bo.app.C1693t1;
import p030bo.app.C1694t2;
import p030bo.app.C1701u2;
import p030bo.app.C1702u3;
import p030bo.app.C1705v;
import p030bo.app.C1707v1;
import p030bo.app.C1708v2;
import p030bo.app.C1711v5;
import p030bo.app.C1716w1;
import p030bo.app.C1721w5;
import p030bo.app.C1724x1;
import p030bo.app.C1725x2;
import p030bo.app.C1735y1;
import p030bo.app.C1742z1;
import p030bo.app.C1744z3;
import p032c0.C1751a;
import p054d0.C4278e0;
import p054d0.C4280f0;
import p066e0.C4419c0;
import p145k5.C5482a;
import p145k5.C5483b;
import p145k5.C5484c;
import p145k5.C5485d;
import p145k5.C5486e;
import p145k5.C5487f;
import p145k5.C5488g;
import p145k5.C5489h;
import p145k5.C5490i;
import p145k5.C5491j;
import p145k5.C5492k;
import p145k5.C5493l;
import p145k5.C5494m;
import p217q2.C6160i;
import p244s3.C6448w;
import p304x.C7067k;
import p304x.C7073m;
import p304x.C7087p;
import p304x.C7097r;
import p304x.C7099r1;
import p304x.C7103t;
import p304x.C7109v;
import p304x.C7112w;
import p316y.C7219n;
import p316y.C7229u;

@Keep
public class Appboy implements IBraze {
    public static final String EXTERNAL_EVENT_MANAGER_THREAD_NAME_PREFIX = "Appboy-External-Event-Manager-Thread";
    public static final Set<String> KNOWN_APP_CRAWLER_DEVICE_MODELS = new HashSet(Collections.singletonList("calypso appcrawler"));
    public static final Set<String> NECESSARY_APPBOY_SDK_PERMISSIONS = new HashSet(Arrays.asList(new String[]{"android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET"}));
    public static final String SINGLETON_EVENT_MANAGER_PARALLEL_EXECUTOR_IDENTIFIER = "singleton_event_manager_parallel_executor_identifier";
    public static final String SINGLETON_USER_DEPENDENCY_SERIAL_EXECUTOR_IDENTIFIER = "singleton_user_dependency_serial_executor_identifier";
    public static final String TAG = AppboyLogger.getBrazeLogTag(Appboy.class);
    public static final String USER_DEPENDENCY_THREAD_NAME_PREFIX = "Appboy-User-Dependency-Thread";
    public static volatile IAppboyEndpointProvider sAppboyEndpointProvider;
    public static final Object sBrazeEndpointProviderLock = new Object();
    public static volatile IAppboyNotificationFactory sCustomAppboyNotificationFactory;
    @SuppressLint({"StaticFieldLeak"})
    public static volatile Braze sInstance = null;
    public static volatile Boolean sIsApiKeyPresent = null;
    public static volatile boolean sMockNetworkRequestsAndDropEvents = false;
    public static volatile boolean sOutboundNetworkRequestsOffline = false;
    public static volatile C1550c4 sSdkEnablementProvider;
    public volatile BrazeUser mAppboyUser;
    public final Context mApplicationContext;
    public volatile C1618k1 mBrazeGeofenceManager;
    public volatile C1707v1 mBrazeManager;
    public final BrazeConfigurationProvider mConfigurationProvider;
    public volatile C1702u3 mContentCardsStorageProvider;
    public volatile C1565e2 mDependencyProvider;
    public volatile C1716w1 mDeviceDataProvider;
    public C1724x1 mDeviceIdReader;
    public volatile C1600i0 mErrorPublisher;
    public C1600i0 mExternalIEventMessenger;
    public volatile C1744z3 mFeedStorageProvider;
    public IBrazeImageLoader mImageLoader;
    public volatile boolean mIsInstanceStopped = false;
    public volatile C1735y1 mLocationManager;
    public final C1705v mOfflineUserStorageProvider;
    public final C1742z1 mRegistrationDataProvider;
    public volatile C1607j mSdkAuthenticationCache;
    public volatile C1558d4 mServerConfigStorageProvider;
    public final C1556d2 mTestUserDeviceLoggingManager;
    public volatile C1623k6 mTriggerManager;
    public final C1583g1 mUncaughtUserDependencyExceptionHandler;
    public final C1601i1 mUserDependencyExecutor;

    public Appboy(Context context) {
        long nanoTime = System.nanoTime();
        String str = TAG;
        AppboyLogger.m5448d(str, "Braze SDK Initializing");
        Context applicationContext = context.getApplicationContext();
        this.mApplicationContext = applicationContext;
        BrazeConfigurationProvider brazeConfigurationProvider = new BrazeConfigurationProvider(applicationContext);
        this.mConfigurationProvider = brazeConfigurationProvider;
        AppboyLogger.setInitialLogLevelFromConfiguration(brazeConfigurationProvider.getLoggerInitialLogLevel());
        C1564e1 e1Var = new C1564e1(EXTERNAL_EVENT_MANAGER_THREAD_NAME_PREFIX);
        C1583g1 g1Var = new C1583g1();
        e1Var.mo6028a(g1Var);
        C1593h1 h1Var = new C1593h1(SINGLETON_EVENT_MANAGER_PARALLEL_EXECUTOR_IDENTIFIER, e1Var);
        h1Var.execute(new C5491j());
        C1556d2 d2Var = new C1556d2();
        this.mTestUserDeviceLoggingManager = d2Var;
        AppboyLogger.setTestUserDeviceLoggingManager(d2Var);
        String str2 = Build.MODEL;
        if (str2 != null && KNOWN_APP_CRAWLER_DEVICE_MODELS.contains(str2.toLowerCase(Locale.US))) {
            AppboyLogger.m5453i(str, "Device build model matches a known crawler. Enabling mock network request mode. Device model: " + str2);
            enableMockAppboyNetworkRequestsAndDropEventsMode();
        }
        this.mImageLoader = new DefaultBrazeImageLoader(applicationContext);
        if (!StringUtils.isNullOrBlank(brazeConfigurationProvider.getCustomEndpoint())) {
            setConfiguredCustomEndpoint(brazeConfigurationProvider.getCustomEndpoint());
        }
        this.mOfflineUserStorageProvider = new C1705v(applicationContext);
        this.mDeviceIdReader = new C1679r1(applicationContext);
        this.mExternalIEventMessenger = new C1592h0(h1Var, sSdkEnablementProvider);
        this.mRegistrationDataProvider = new C1535b2(applicationContext, brazeConfigurationProvider);
        h1Var.execute(new C7229u(7, this, context));
        C1564e1 e1Var2 = new C1564e1(USER_DEPENDENCY_THREAD_NAME_PREFIX);
        C1583g1 g1Var2 = new C1583g1(this.mExternalIEventMessenger);
        this.mUncaughtUserDependencyExceptionHandler = g1Var2;
        e1Var2.mo6028a(g1Var2);
        g1Var.mo6084a(this.mExternalIEventMessenger);
        C1601i1 i1Var = new C1601i1(SINGLETON_USER_DEPENDENCY_SERIAL_EXECUTOR_IDENTIFIER, e1Var2);
        this.mUserDependencyExecutor = i1Var;
        i1Var.execute(new C7099r1(this, 3));
        long nanoTime2 = System.nanoTime();
        StringBuilder k = C13555b.m33972k("Braze SDK loaded in ");
        k.append(TimeUnit.MILLISECONDS.convert(nanoTime2 - nanoTime, TimeUnit.NANOSECONDS));
        k.append(" ms.");
        AppboyLogger.m5448d(str, k.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m5383a(Context context) {
        if (this.mConfigurationProvider.isFirebaseCloudMessagingRegistrationEnabled()) {
            C1693t1 t1Var = new C1693t1(context, this.mRegistrationDataProvider);
            if (t1Var.mo6374a()) {
                AppboyLogger.m5453i(TAG, "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.");
                t1Var.mo6373a(this.mConfigurationProvider.getFirebaseCloudMessagingSenderIdKey());
            } else {
                AppboyLogger.m5459w(TAG, "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.");
            }
        } else {
            AppboyLogger.m5453i(TAG, "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.");
        }
        if (!this.mConfigurationProvider.isAdmMessagingRegistrationEnabled()) {
            AppboyLogger.m5453i(TAG, "Automatic ADM registration not enabled in configuration. Braze will not register for ADM.");
        } else if (C1609j1.m4325a(this.mApplicationContext)) {
            AppboyLogger.m5453i(TAG, "Amazon Device Messaging found. Setting up Amazon Device Messaging");
            new C1609j1(this.mApplicationContext, this.mRegistrationDataProvider).mo6160b();
        } else {
            AppboyLogger.m5459w(TAG, "ADM manifest requirements not met. Braze will not register for ADM.");
        }
        try {
            verifyAppboySdkProperSetup();
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Failed to verify proper SDK setup", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m5398b(Activity activity) {
        if (activity == null) {
            try {
                AppboyLogger.m5459w(TAG, "Cannot open session with null activity.");
            } catch (Exception e) {
                AppboyLogger.m5452e(TAG, "Failed to open session.", e);
                publishError(e);
            }
        } else {
            this.mBrazeManager.openSession(activity);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m5407c(String str) {
        try {
            if (StringUtils.isNullOrBlank(str)) {
                AppboyLogger.m5459w(TAG, "Campaign ID cannot be null or blank. Not logging push notification opened.");
            } else {
                this.mBrazeManager.mo6243b((C1594h2) C1701u2.m4772n(str));
            }
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to log opened push.", e);
            publishError(e);
        }
    }

    public static void clearAppboyEndpointProvider() {
        synchronized (sBrazeEndpointProviderLock) {
            sAppboyEndpointProvider = null;
        }
    }

    public static void clearInstance() {
        synchronized (Appboy.class) {
            AppboyLogger.m5459w(TAG, "Clearing Appboy instance");
            if (sInstance != null) {
                if (sInstance.mUserDependencyExecutor != null) {
                    sInstance.mUserDependencyExecutor.shutdownNow();
                }
                if (!(sInstance.mDependencyProvider == null || sInstance.mDependencyProvider.mo6034e() == null)) {
                    sInstance.mDependencyProvider.mo6034e().mo6470h();
                }
            }
            sInstance = null;
            sMockNetworkRequestsAndDropEvents = false;
            sOutboundNetworkRequestsOffline = false;
            sSdkEnablementProvider = null;
            sIsApiKeyPresent = null;
            sAppboyEndpointProvider = null;
        }
    }

    public static boolean configure(Context context, BrazeConfig brazeConfig) {
        String str = TAG;
        AppboyLogger.m5448d(str, "Braze.configure() called with configuration: " + brazeConfig);
        synchronized (Appboy.class) {
            if (sInstance == null || sInstance.mIsInstanceStopped || !Boolean.TRUE.equals(sIsApiKeyPresent)) {
                RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = new RuntimeAppConfigurationProvider(context.getApplicationContext());
                if (brazeConfig != null) {
                    runtimeAppConfigurationProvider.setConfiguration(brazeConfig);
                } else {
                    AppboyLogger.m5453i(str, "Braze.configure() called with a null config; Clearing all configuration values.");
                    runtimeAppConfigurationProvider.clearAllConfigurationValues();
                }
                return true;
            }
            AppboyLogger.m5453i(str, "Braze.configure() can not be called while the singleton is still live.");
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m5410d() {
        try {
            this.mBrazeManager.mo6243b((C1594h2) C1687s2.m4722v());
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to log that the feed was displayed.", e);
            publishError(e);
        }
    }

    public static void disableSdk(Context context) {
        getSdkEnablementProvider(context).mo5957a(true);
        String str = TAG;
        AppboyLogger.m5459w(str, "Stopping the SDK instance.");
        stopInstance();
        AppboyLogger.m5459w(str, "Disabling all network requests");
        setOutboundNetworkRequestsOffline(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean enableMockAppboyNetworkRequestsAndDropEventsMode() {
        /*
            com.braze.Braze r0 = sInstance
            if (r0 != 0) goto L_0x0028
            java.lang.Class<com.appboy.Appboy> r0 = com.appboy.Appboy.class
            monitor-enter(r0)
            com.braze.Braze r1 = sInstance     // Catch:{ all -> 0x0025 }
            if (r1 != 0) goto L_0x0023
            boolean r1 = sMockNetworkRequestsAndDropEvents     // Catch:{ all -> 0x0025 }
            r2 = 1
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = TAG     // Catch:{ all -> 0x0025 }
            java.lang.String r3 = "Braze network requests already being mocked. Note that events dispatched in this mode are dropped."
            com.appboy.support.AppboyLogger.m5453i(r1, r3)     // Catch:{ all -> 0x0025 }
            goto L_0x0021
        L_0x0018:
            java.lang.String r1 = TAG     // Catch:{ all -> 0x0025 }
            java.lang.String r3 = "Braze network requests will be mocked. Events dispatched in this mode will be dropped."
            com.appboy.support.AppboyLogger.m5453i(r1, r3)     // Catch:{ all -> 0x0025 }
            sMockNetworkRequestsAndDropEvents = r2     // Catch:{ all -> 0x0025 }
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return r2
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            goto L_0x0028
        L_0x0025:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r1
        L_0x0028:
            java.lang.String r0 = TAG
            java.lang.String r1 = "Attempt to enable mocking Braze network requests had no effect since getInstance() has already been called."
            com.appboy.support.AppboyLogger.m5459w((java.lang.String) r0, (java.lang.String) r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appboy.Appboy.enableMockAppboyNetworkRequestsAndDropEventsMode():boolean");
    }

    public static void enableSdk(Context context) {
        String str = TAG;
        AppboyLogger.m5459w(str, "Setting SDK to enabled.");
        getSdkEnablementProvider(context).mo5957a(false);
        AppboyLogger.m5459w(str, "Enabling all network requests");
        setOutboundNetworkRequestsOffline(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m5415f() {
        AppboyLogger.m5457v(TAG, "Starting up a new user dependency manager");
        try {
            setUserSpecificMemberVariablesAndStartDispatch(new C1565e2(this.mApplicationContext, this.mOfflineUserStorageProvider, this.mConfigurationProvider, this.mExternalIEventMessenger, this.mDeviceIdReader, this.mRegistrationDataProvider, sMockNetworkRequestsAndDropEvents, sOutboundNetworkRequestsOffline, this.mTestUserDeviceLoggingManager));
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Failed to startup user dependency manager.", e);
            publishError(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m5417g() {
        try {
            this.mBrazeManager.mo6233a(new C1671q2.C1673b().mo6333b());
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to request refresh of feed.", e);
            publishError(e);
        }
    }

    public static Uri getAppboyApiEndpoint(Uri uri) {
        synchronized (sBrazeEndpointProviderLock) {
            if (sAppboyEndpointProvider != null) {
                try {
                    Uri apiEndpoint = sAppboyEndpointProvider.getApiEndpoint(uri);
                    if (apiEndpoint != null) {
                        return apiEndpoint;
                    }
                } catch (Exception unused) {
                    AppboyLogger.m5459w(TAG, "Caught exception trying to get a Braze API endpoint from the AppboyEndpointProvider. Using the original URI");
                }
            }
        }
        return uri;
    }

    private ContentCardsUpdatedEvent getCachedContentCardsUpdatedEvent() {
        if (isSdkDisabled()) {
            return null;
        }
        try {
            return (ContentCardsUpdatedEvent) this.mUserDependencyExecutor.submit(new C5488g(this, 0)).get();
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to retrieve the cached ContentCardsUpdatedEvent.", e);
            publishError(e);
            return null;
        }
    }

    public static String getConfiguredApiKey(Context context) {
        try {
            return new BrazeConfigurationProvider(context).getAppboyApiKey().toString();
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Caught exception while retrieving API key.", e);
            return null;
        }
    }

    public static IAppboyNotificationFactory getCustomAppboyNotificationFactory() {
        return sCustomAppboyNotificationFactory;
    }

    public static Braze getInstance(Context context) {
        if (shouldAllowSingletonInitialization()) {
            synchronized (Appboy.class) {
                if (shouldAllowSingletonInitialization()) {
                    setOutboundNetworkRequestsOffline(getSdkEnablementProvider(context).mo5958a());
                    sIsApiKeyPresent = Boolean.valueOf(!StringUtils.isNullOrBlank(getConfiguredApiKey(context)));
                    sInstance = new Braze(context);
                    sInstance.mIsInstanceStopped = false;
                    Braze braze = sInstance;
                    return braze;
                }
            }
        }
        return sInstance;
    }

    public static boolean getOutboundNetworkRequestsOffline() {
        return sOutboundNetworkRequestsOffline;
    }

    public static C1550c4 getSdkEnablementProvider(Context context) {
        if (sSdkEnablementProvider == null) {
            sSdkEnablementProvider = new C1550c4(context);
        }
        return sSdkEnablementProvider;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m5419h() {
        try {
            this.mExternalIEventMessenger.mo6134a(this.mFeedStorageProvider.getCachedCardsAsEvent(), FeedUpdatedEvent.class);
        } catch (JSONException e) {
            AppboyLogger.m5460w(TAG, "Failed to retrieve and publish feed from offline cache.", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m5421i() {
        try {
            if (this.mBrazeGeofenceManager != null) {
                this.mBrazeGeofenceManager.mo6171a();
            } else {
                AppboyLogger.m5448d(TAG, "Geofence manager was null. Not initializing geofences.");
            }
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to initialize geofences with the geofence manager.", e);
            publishError(e);
        }
    }

    public static boolean isSdkDisabled() {
        if (sSdkEnablementProvider == null) {
            AppboyLogger.m5448d(TAG, "SDK enablement provider was null. Returning SDK as enabled.");
            return false;
        } else if (Boolean.FALSE.equals(sIsApiKeyPresent)) {
            AppboyLogger.m5459w(TAG, "API key not present. Not performing action on SDK.");
            return true;
        } else {
            boolean a = sSdkEnablementProvider.mo5958a();
            if (a) {
                AppboyLogger.m5459w(TAG, "SDK is disabled. Not performing action on SDK.");
            }
            return a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m5423j() {
        try {
            this.mBrazeManager.mo6241b();
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to request data flush.", e);
            publishError(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m5425k() {
        try {
            if (this.mLocationManager != null) {
                this.mLocationManager.mo6220a();
            } else {
                AppboyLogger.m5448d(TAG, "Location manager was null. Not requesting single location update.");
            }
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to request single location update", e);
            publishError(e);
        }
    }

    /* renamed from: l */
    public static /* synthetic */ void m5427l() {
    }

    private void publishError(Throwable th) {
        if (this.mErrorPublisher == null) {
            AppboyLogger.m5452e(TAG, "Cannot publish error on null publisher. This is usually the result of a missing API key.", th);
            return;
        }
        try {
            this.mErrorPublisher.mo6134a(th, Throwable.class);
        } catch (Exception e) {
            String str = TAG;
            AppboyLogger.m5452e(str, "Failed to log throwable: " + th, e);
        }
    }

    public static void requestTriggersIfInAppMessageTestPush(Intent intent, C1707v1 v1Var) {
        if (v1Var == null) {
            AppboyLogger.m5459w(TAG, "Triggers requested for test in-app message with null AppboyManager. Doing nothing.");
            return;
        }
        String stringExtra = intent.getStringExtra(Constants.APPBOY_PUSH_FETCH_TEST_TRIGGERS_KEY);
        if (stringExtra != null && stringExtra.equals(InneractiveMediationDefs.SHOW_HOUSE_AD_YES)) {
            AppboyLogger.m5453i(TAG, "Push contained key for fetching test triggers, fetching triggers.");
            v1Var.mo6233a(new C1671q2.C1673b().mo6334c());
        }
    }

    public static void setAppboyEndpointProvider(IAppboyEndpointProvider iAppboyEndpointProvider) {
        synchronized (sBrazeEndpointProviderLock) {
            sAppboyEndpointProvider = iAppboyEndpointProvider;
        }
    }

    public static void setConfiguredCustomEndpoint(String str) {
        synchronized (sBrazeEndpointProviderLock) {
            setAppboyEndpointProvider(new C1436m(str, 2));
        }
    }

    public static void setCustomAppboyNotificationFactory(IAppboyNotificationFactory iAppboyNotificationFactory) {
        String str = TAG;
        AppboyLogger.m5448d(str, "Custom Braze notification factory set: " + iAppboyNotificationFactory);
        sCustomAppboyNotificationFactory = iAppboyNotificationFactory;
    }

    public static void setOutboundNetworkRequestsOffline(boolean z) {
        String str;
        String str2 = TAG;
        StringBuilder k = C13555b.m33972k("Appboy outbound network requests are now ");
        if (z) {
            str = "disabled";
        } else {
            str = "enabled";
        }
        k.append(str);
        AppboyLogger.m5453i(str2, k.toString());
        synchronized (Appboy.class) {
            sOutboundNetworkRequestsOffline = z;
            if (sInstance != null) {
                sInstance.setAppboyManagerAndSyncPolicyOffline(z);
            }
        }
    }

    private void setUserSpecificMemberVariablesAndStartDispatch(C1565e2 e2Var) {
        this.mDependencyProvider = e2Var;
        this.mBrazeManager = e2Var.mo6032c();
        this.mServerConfigStorageProvider = e2Var.mo6042m();
        this.mTriggerManager = e2Var.mo6043n();
        this.mBrazeGeofenceManager = e2Var.mo6040k();
        this.mContentCardsStorageProvider = e2Var.mo6033d();
        this.mLocationManager = e2Var.mo6031b();
        this.mDeviceDataProvider = e2Var.mo6035f();
        this.mSdkAuthenticationCache = e2Var.mo6041l();
        this.mAppboyUser = new BrazeUser(e2Var.mo6044o(), this.mBrazeManager, this.mOfflineUserStorageProvider.mo6406a(), e2Var.mo6031b(), this.mServerConfigStorageProvider);
        e2Var.mo6036g().mo6067a(e2Var.mo6037h());
        e2Var.mo6030a().mo6429c();
        this.mErrorPublisher = e2Var.mo6037h();
        this.mUncaughtUserDependencyExceptionHandler.mo6084a(this.mErrorPublisher);
        this.mFeedStorageProvider = e2Var.mo6039j();
        this.mTriggerManager = e2Var.mo6043n();
        e2Var.mo6038i().mo6362a((C1522a0) e2Var.mo6030a());
        this.mTestUserDeviceLoggingManager.mo5965a(this.mBrazeManager);
        this.mTestUserDeviceLoggingManager.mo5967a(this.mServerConfigStorageProvider.mo6016l());
    }

    public static boolean shouldAllowSingletonInitialization() {
        if (sInstance == null) {
            AppboyLogger.m5457v(TAG, "The instance is null. Allowing instance initialization");
            return true;
        } else if (sInstance.mIsInstanceStopped) {
            AppboyLogger.m5448d(TAG, "The instance was stopped. Allowing instance initialization");
            return true;
        } else if (!Boolean.FALSE.equals(sIsApiKeyPresent)) {
            return false;
        } else {
            AppboyLogger.m5448d(TAG, "No API key was found previously. Allowing instance initialization");
            return true;
        }
    }

    public static void stopInstance() {
        try {
            String str = TAG;
            AppboyLogger.m5453i(str, "Shutting down all queued work on the Braze SDK");
            synchronized (Appboy.class) {
                if (sInstance != null) {
                    if (sInstance.mUserDependencyExecutor != null) {
                        AppboyLogger.m5448d(str, "Shutting down the user dependency executor");
                        sInstance.mUserDependencyExecutor.shutdownNow();
                    }
                    C1565e2 e2Var = sInstance.mDependencyProvider;
                    if (e2Var != null) {
                        if (e2Var.mo6034e() != null) {
                            e2Var.mo6034e().mo6463a(true);
                        }
                        if (e2Var.mo6038i() != null) {
                            e2Var.mo6038i().mo6361a();
                        }
                        if (e2Var.mo6040k() != null) {
                            e2Var.mo6040k().mo6180b();
                        }
                    }
                    sInstance.mIsInstanceStopped = true;
                }
            }
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to shutdown queued work on the Braze SDK.", e);
        }
    }

    private void verifyAppboySdkProperSetup() {
        boolean z = false;
        boolean z2 = true;
        for (String next : NECESSARY_APPBOY_SDK_PERMISSIONS) {
            if (!PermissionUtils.hasPermission(this.mApplicationContext, next)) {
                String str = TAG;
                AppboyLogger.m5459w(str, "The Braze SDK requires the permission " + next + ". Check your AndroidManifest.");
                z2 = false;
            }
        }
        if (this.mConfigurationProvider.getAppboyApiKey().toString().equals("")) {
            AppboyLogger.m5459w(TAG, "The Braze SDK requires a non-empty API key. Check your braze.xml or BrazeConfig.");
        } else {
            z = z2;
        }
        if (!z) {
            AppboyLogger.m5459w(TAG, "The Braze SDK is not integrated correctly. Please visit https://www.braze.com/docs/developer_guide/platform_integration_guides/android/initial_sdk_setup/android_sdk_integration/");
        }
    }

    public static void wipeData(Context context) {
        stopInstance();
        try {
            C1614j6.m4339a(context);
            AppboyLruImageLoader.deleteStoredData(context);
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to delete data from the internal storage cache.", e);
        }
        try {
            File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
            if (file.exists() && file.isDirectory()) {
                for (File file2 : file.listFiles(new C5494m(0))) {
                    AppboyLogger.m5457v(TAG, "Deleting shared prefs file at: " + file2.getAbsolutePath());
                    AppboyFileUtils.deleteSharedPreferencesFile(context, file2);
                }
            }
        } catch (Exception e2) {
            AppboyLogger.m5460w(TAG, "Failed to delete shared preference data for the Braze SDK.", e2);
        }
    }

    public void addSerializedCardJsonToStorage(String str, String str2) {
        if (!isSdkDisabled()) {
            if (StringUtils.isNullOrBlank(str)) {
                String str3 = TAG;
                AppboyLogger.m5459w(str3, "Cannot add null or blank card json to storage. Returning. User id: " + str2 + " Serialized json: " + str);
                return;
            }
            this.mUserDependencyExecutor.execute(new C4419c0(1, this, str, str2));
        }
    }

    public void changeUser(String str) {
        changeUser(str, (String) null);
    }

    public void closeSession(Activity activity) {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C7109v(4, this, activity));
        }
    }

    public Card deserializeContentCard(String str) {
        if (isSdkDisabled()) {
            return null;
        }
        if (str == null) {
            AppboyLogger.m5459w(TAG, "Cannot deserialize null content card json string. Returning null.");
            return null;
        }
        try {
            return deserializeContentCard(new JSONObject(str));
        } catch (Exception e) {
            String str2 = TAG;
            AppboyLogger.m5452e(str2, "Failed to deserialize content card json string. Payload: " + str, e);
            publishError(e);
            return null;
        }
    }

    public IInAppMessage deserializeInAppMessageString(String str) {
        return C1665p4.m4607a(str, this.mBrazeManager);
    }

    @Deprecated
    public IAppboyImageLoader getAppboyImageLoader() {
        return getImageLoader();
    }

    public String getAppboyPushMessageRegistrationId() {
        return getRegisteredPushToken();
    }

    public List<Card> getCachedContentCards() {
        if (isSdkDisabled()) {
            return null;
        }
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getAllCards();
        }
        AppboyLogger.m5457v(TAG, "The ContentCardsUpdatedEvent was null. Returning null for the list of cached cards.");
        return null;
    }

    public int getContentCardCount() {
        if (isSdkDisabled()) {
            return -1;
        }
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getCardCount();
        }
        AppboyLogger.m5459w(TAG, "The ContentCardsUpdatedEvent was null. Returning the default value for the card count.");
        return -1;
    }

    public int getContentCardUnviewedCount() {
        if (isSdkDisabled()) {
            return -1;
        }
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getUnviewedCardCount();
        }
        AppboyLogger.m5459w(TAG, "The ContentCardsUpdatedEvent was null. Returning the default value for the unviewed card count.");
        return -1;
    }

    public long getContentCardsLastUpdatedInSecondsFromEpoch() {
        if (isSdkDisabled()) {
            return -1;
        }
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getLastUpdatedInSecondsFromEpoch();
        }
        AppboyLogger.m5459w(TAG, "The ContentCardsUpdatedEvent was null. Returning the default value for the last update timestamp.");
        return -1;
    }

    public <T extends AppboyUser> T getCurrentUser() {
        try {
            return (AppboyUser) this.mUserDependencyExecutor.submit(new C6448w(this, 1)).get();
        } catch (InterruptedException e) {
            AppboyLogger.m5460w(TAG, "Thread interrupted while retrieving the current user.", e);
            return null;
        } catch (Exception e2) {
            AppboyLogger.m5460w(TAG, "Failed to retrieve the current user.", e2);
            publishError(e2);
            return null;
        }
    }

    public String getDeviceId() {
        return this.mDeviceIdReader.mo6342a();
    }

    public IBrazeImageLoader getImageLoader() {
        if (this.mImageLoader == null) {
            AppboyLogger.m5448d(TAG, "The Image Loader was null. Creating a new Image Loader and returning it.");
            this.mImageLoader = new DefaultBrazeImageLoader(this.mApplicationContext);
        }
        return this.mImageLoader;
    }

    @Deprecated
    public String getInstallTrackingId() {
        return getDeviceId();
    }

    public String getRegisteredPushToken() {
        if (isSdkDisabled()) {
            return "";
        }
        try {
            return this.mRegistrationDataProvider.mo5912a();
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to get the registration ID.", e);
            publishError(e);
            return null;
        }
    }

    public void handleInAppMessageTestPush(Intent intent) {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C7219n(2, this, intent));
        }
    }

    public void logContentCardsDisplayed() {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C5492k(this, 1));
        }
    }

    public void logCustomEvent(String str) {
        logCustomEvent(str, (BrazeProperties) null);
    }

    public void logFeedCardClick(String str) {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C7097r(7, this, str));
        }
    }

    public void logFeedCardImpression(String str) {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C5486e(this, str, 1));
        }
    }

    public void logFeedDisplayed() {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C0199g(this, 5));
        }
    }

    public void logLocationRecordedEventFromLocationUpdate(C1602i2 i2Var) {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C7103t(3, this, i2Var));
        }
    }

    public void logPurchase(String str, String str2, BigDecimal bigDecimal) {
        logPurchase(str, str2, bigDecimal, 1);
    }

    public void logPushNotificationActionClicked(String str, String str2, String str3) {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C5493l(this, str, str2, str3, 0));
        }
    }

    public void logPushNotificationOpened(String str) {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C7219n(3, this, str));
        }
    }

    public void logPushStoryPageClicked(String str, String str2) {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C5485d(0, this, str, str2));
        }
    }

    public void openSession(Activity activity) {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C0509c(6, this, activity));
        }
    }

    public void recordGeofenceTransition(String str, C1546c0 c0Var) {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C7112w(2, this, str, c0Var));
        }
    }

    public void registerAppboyPushMessages(String str) {
        registerPushToken(str);
    }

    public void registerPushToken(String str) {
        if (!isSdkDisabled()) {
            try {
                if (StringUtils.isNullOrBlank(str)) {
                    AppboyLogger.m5459w(TAG, "Push token must not be null or blank. Not registering for push with Braze.");
                    return;
                }
                String str2 = TAG;
                AppboyLogger.m5453i(str2, "Push token " + str + " registered and immediately being flushed.");
                this.mRegistrationDataProvider.mo5913a(str);
                requestImmediateDataFlush();
            } catch (Exception e) {
                String str3 = TAG;
                AppboyLogger.m5460w(str3, "Failed to set the push token " + str, e);
                publishError(e);
            }
        }
    }

    public <T> void removeSingleSubscription(IEventSubscriber<T> iEventSubscriber, Class<T> cls) {
        try {
            this.mExternalIEventMessenger.mo6138c(iEventSubscriber, cls);
        } catch (Exception e) {
            String str = TAG;
            StringBuilder k = C13555b.m33972k("Failed to remove ");
            k.append(cls.getName());
            k.append(" subscriber.");
            AppboyLogger.m5460w(str, k.toString(), e);
            publishError(e);
        }
    }

    public void requestContentCardsRefresh(boolean z) {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C1751a(1, this, z));
        }
    }

    public void requestFeedRefresh() {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C4278e0(this, 3));
        }
    }

    public void requestFeedRefreshFromCache() {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C0416i1(this, 5));
        }
    }

    public void requestGeofenceRefresh(C1602i2 i2Var) {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C7087p(7, this, i2Var));
        }
    }

    public void requestGeofences(double d, double d2) {
        if (!isSdkDisabled()) {
            if (!ValidationUtils.isValidLocation(d, d2)) {
                String str = TAG;
                AppboyLogger.m5459w(str, "Location provided is invalid. Not requesting refresh of Braze Geofences. Provided latitude - longitude: " + d + " - " + d2);
                return;
            }
            this.mUserDependencyExecutor.execute(new C5482a(this, d, d2));
        }
    }

    public void requestGeofencesInitialization() {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C0441n1(this, 5));
        }
    }

    public void requestImmediateDataFlush() {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C5492k(this, 0));
        }
    }

    public void requestLocationInitialization() {
        AppboyLogger.m5448d(TAG, "Location permissions were granted. Requesting geofence and location initialization.");
        requestGeofencesInitialization();
        requestSingleLocationUpdate();
    }

    public void requestSingleLocationUpdate() {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C7073m(this, 3));
        }
    }

    public void resetBrazeManager(C1707v1 v1Var) {
        waitForUserDependencyThread();
        this.mBrazeManager = v1Var;
    }

    @Deprecated
    public void setAppboyImageLoader(IAppboyImageLoader iAppboyImageLoader) {
        setImageLoader((IBrazeImageLoader) iAppboyImageLoader);
    }

    public void setAppboyManagerAndSyncPolicyOffline(boolean z) {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C5490i(0, this, z));
        }
    }

    public void setGoogleAdvertisingId(String str, boolean z) {
        String str2 = TAG;
        AppboyLogger.m5457v(str2, "Google Advertising ID: " + str + " and limit-ad-tracking: " + z);
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C5489h(this, str, z));
        }
    }

    public void setImageLoader(IBrazeImageLoader iBrazeImageLoader) {
        if (this.mImageLoader == null) {
            AppboyLogger.m5459w(TAG, "The Image Loader cannot be set to null. Doing nothing.");
        } else {
            this.mImageLoader = iBrazeImageLoader;
        }
    }

    public void setSdkAuthenticationSignature(String str) {
        String str2 = TAG;
        AppboyLogger.m5457v(str2, "Got new sdk auth signature " + str);
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C5486e(this, str, 0));
        }
    }

    public void subscribeToContentCardsUpdates(IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber) {
        try {
            this.mExternalIEventMessenger.mo6132a(iEventSubscriber, ContentCardsUpdatedEvent.class);
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to add subscriber for Content Cards updates.", e);
            publishError(e);
        }
    }

    public void subscribeToFeedUpdates(IEventSubscriber<FeedUpdatedEvent> iEventSubscriber) {
        try {
            this.mExternalIEventMessenger.mo6132a(iEventSubscriber, FeedUpdatedEvent.class);
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to add subscriber for feed updates.", e);
            publishError(e);
        }
    }

    public void subscribeToNetworkFailures(IEventSubscriber<BrazeNetworkFailureEvent> iEventSubscriber) {
        try {
            this.mExternalIEventMessenger.mo6132a(iEventSubscriber, BrazeNetworkFailureEvent.class);
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to add subscriber for network failures.", e);
            publishError(e);
        }
    }

    public void subscribeToNewInAppMessages(IEventSubscriber<InAppMessageEvent> iEventSubscriber) {
        try {
            this.mExternalIEventMessenger.mo6132a(iEventSubscriber, InAppMessageEvent.class);
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to add subscriber to new in-app messages.", e);
            publishError(e);
        }
    }

    public void subscribeToSdkAuthenticationFailures(IEventSubscriber<BrazeSdkAuthenticationErrorEvent> iEventSubscriber) {
        try {
            this.mExternalIEventMessenger.mo6132a(iEventSubscriber, BrazeSdkAuthenticationErrorEvent.class);
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to add subscriber for SDK authentication failures.", e);
            publishError(e);
        }
    }

    public void subscribeToSessionUpdates(IEventSubscriber<SessionStateChangedEvent> iEventSubscriber) {
        try {
            this.mExternalIEventMessenger.mo6132a(iEventSubscriber, SessionStateChangedEvent.class);
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to add subscriber for session updates.", e);
            publishError(e);
        }
    }

    public void waitForUserDependencyThread() {
        try {
            this.mUserDependencyExecutor.submit(new C7067k(1)).get();
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Caught exception while waiting for previous tasks in user dependency queue to finish.", e);
        }
    }

    public void changeUser(String str, String str2) {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C6160i(1, this, str, str2));
        }
    }

    public void logCustomEvent(String str, BrazeProperties brazeProperties) {
        logCustomEvent(str, (AppboyProperties) brazeProperties);
    }

    public void logPurchase(String str, String str2, BigDecimal bigDecimal, AppboyProperties appboyProperties) {
        logPurchase(str, str2, bigDecimal, 1, appboyProperties);
    }

    public void logCustomEvent(String str, AppboyProperties appboyProperties) {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C6160i(2, this, str, appboyProperties));
        }
    }

    public void logPurchase(String str, String str2, BigDecimal bigDecimal, BrazeProperties brazeProperties) {
        logPurchase(str, str2, bigDecimal, 1, (AppboyProperties) brazeProperties);
    }

    public void logPushNotificationOpened(Intent intent) {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C4280f0(2, this, intent));
        }
    }

    public void requestGeofenceRefresh(boolean z) {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C5484c(this, z));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m5412d(String str) {
        try {
            if (StringUtils.isNullOrBlank(str)) {
                AppboyLogger.m5459w(TAG, "SDK authentication signature cannot be null or blank");
            } else {
                this.mSdkAuthenticationCache.mo6158a(str);
            }
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Failed to set SDK authentication signature on device", e);
            publishError(e);
        }
    }

    public void logPurchase(String str, String str2, BigDecimal bigDecimal, int i) {
        logPurchase(str, str2, bigDecimal, i, (BrazeProperties) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m5399b(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY);
            if (!StringUtils.isNullOrBlank(stringExtra)) {
                String str = TAG;
                AppboyLogger.m5453i(str, "Logging push click. Campaign Id: " + stringExtra);
                this.mBrazeManager.mo6243b((C1594h2) C1701u2.m4772n(stringExtra));
            } else {
                AppboyLogger.m5453i(TAG, "No campaign Id associated with this notification. Not logging push click.");
            }
            requestTriggersIfInAppMessageTestPush(intent, this.mBrazeManager);
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Error logging push notification", e);
        }
    }

    public <T extends AppboyUser> void getCurrentUser(IValueCallback<T> iValueCallback) {
        if (isSdkDisabled()) {
            iValueCallback.onError();
            return;
        }
        try {
            this.mUserDependencyExecutor.execute(new C4280f0(1, this, iValueCallback));
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to retrieve the current user.", e);
            iValueCallback.onError();
            publishError(e);
        }
    }

    public void logPurchase(String str, String str2, BigDecimal bigDecimal, int i, BrazeProperties brazeProperties) {
        logPurchase(str, str2, bigDecimal, i, (AppboyProperties) brazeProperties);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m5408c(String str, String str2) {
        try {
            if (!ValidationUtils.isValidPushStoryClickInput(str, str2)) {
                AppboyLogger.m5459w(TAG, "Push story page click input was invalid. Not logging in-app purchase to Appboy.");
            } else {
                this.mBrazeManager.mo6243b((C1594h2) C1708v2.m4823g(str, str2));
            }
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, C25541a.m63882l("Failed to log push story page clicked for page id: ", str2, " cid: ", str), e);
            publishError(e);
        }
    }

    public Card deserializeContentCard(JSONObject jSONObject) {
        if (isSdkDisabled()) {
            return null;
        }
        if (jSONObject == null) {
            AppboyLogger.m5459w(TAG, "Cannot deserialize null content card json. Returning null.");
            return null;
        }
        try {
            return (Card) this.mUserDependencyExecutor.submit(new C5487f(0, this, jSONObject)).get();
        } catch (Exception e) {
            String str = TAG;
            AppboyLogger.m5452e(str, "Failed to deserialize content card json. Payload: " + jSONObject, e);
            publishError(e);
            return null;
        }
    }

    public void logPurchase(String str, String str2, BigDecimal bigDecimal, int i, AppboyProperties appboyProperties) {
        if (!isSdkDisabled()) {
            this.mUserDependencyExecutor.execute(new C5483b(this, str, str2, bigDecimal, i, appboyProperties));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m5403b(String str, String str2) {
        try {
            if (StringUtils.isNullOrEmpty(str)) {
                AppboyLogger.m5459w(TAG, "ArgumentException: userId passed to changeUser was null or empty. The current user will remain the active user.");
            } else if (StringUtils.getByteSize(str) > 997) {
                String str3 = TAG;
                AppboyLogger.m5459w(str3, "Rejected user id with byte length longer than 997. Not changing user. Input user id: " + str);
            } else {
                String userId = this.mAppboyUser.getUserId();
                if (userId.equals(str)) {
                    String str4 = TAG;
                    AppboyLogger.m5453i(str4, "Received request to change current user " + str + " to the same user id. Doing nothing.");
                    return;
                }
                if (userId.equals("")) {
                    String str5 = TAG;
                    AppboyLogger.m5453i(str5, "Changing anonymous user to " + str);
                    this.mOfflineUserStorageProvider.mo6407a(str);
                    this.mAppboyUser.setUserId(str);
                } else {
                    String str6 = TAG;
                    AppboyLogger.m5453i(str6, "Changing current user " + userId + " to new user " + str + ".");
                    this.mExternalIEventMessenger.mo6134a(new FeedUpdatedEvent(new ArrayList(), str, false, DateTimeUtils.nowInSeconds()), FeedUpdatedEvent.class);
                }
                this.mBrazeManager.mo6247d();
                this.mOfflineUserStorageProvider.mo6407a(str);
                C1565e2 e2Var = this.mDependencyProvider;
                setUserSpecificMemberVariablesAndStartDispatch(new C1565e2(this.mApplicationContext, this.mOfflineUserStorageProvider, this.mConfigurationProvider, this.mExternalIEventMessenger, this.mDeviceIdReader, this.mRegistrationDataProvider, sMockNetworkRequestsAndDropEvents, sOutboundNetworkRequestsOffline, this.mTestUserDeviceLoggingManager));
                if (!StringUtils.isNullOrBlank(str2)) {
                    String str7 = TAG;
                    AppboyLogger.m5448d(str7, "Set sdk auth signature on changeUser call: " + str2);
                    this.mSdkAuthenticationCache.mo6158a(str2);
                }
                this.mDependencyProvider.mo6044o().mo6112g();
                this.mBrazeManager.mo6244c();
                this.mBrazeManager.mo6233a(new C1671q2.C1673b().mo6333b());
                requestContentCardsRefresh(false);
                e2Var.mo6045q();
            }
        } catch (Exception e) {
            String str8 = TAG;
            AppboyLogger.m5460w(str8, "Failed to set external id to: " + str, e);
            publishError(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m5382a(Activity activity) {
        if (activity == null) {
            try {
                AppboyLogger.m5459w(TAG, "Cannot close session with null activity.");
            } catch (Exception e) {
                AppboyLogger.m5460w(TAG, "Failed to close session.", e);
                publishError(e);
            }
        } else {
            C1619k2 closeSession = this.mBrazeManager.closeSession(activity);
            if (closeSession != null) {
                String str = TAG;
                AppboyLogger.m5453i(str, "Closed session with ID: " + closeSession.mo6187n());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m5405c() {
        try {
            this.mBrazeManager.mo6243b((C1594h2) C1687s2.m4710e());
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to log that Content Cards was displayed.", e);
            publishError(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m5390a(String str, AppboyProperties appboyProperties) {
        try {
            if (!ValidationUtils.isValidLogCustomEventInput(str, this.mServerConfigStorageProvider)) {
                String str2 = TAG;
                AppboyLogger.m5459w(str2, "Logged custom event with name " + str + " was invalid. Not logging custom event to Braze.");
            } else if (appboyProperties == null || !appboyProperties.isInvalid()) {
                String ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(str);
                C1687s2 a = C1687s2.m4695a(ensureBrazeFieldLength, appboyProperties);
                if (this.mBrazeManager.mo6243b((C1594h2) a)) {
                    this.mTriggerManager.mo6124a((C1721w5) new C1711v5(ensureBrazeFieldLength, appboyProperties, a));
                }
            } else {
                String str3 = TAG;
                AppboyLogger.m5459w(str3, "Custom event with name " + str + " logged with invalid properties. Not logging custom event to Braze.");
            }
        } catch (Exception e) {
            String str4 = TAG;
            AppboyLogger.m5460w(str4, "Failed to log custom event: " + str, e);
            publishError(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m5409c(boolean z) {
        this.mBrazeManager.mo6240a(z);
        this.mDependencyProvider.mo6034e().mo6463a(z);
        if (this.mImageLoader != null) {
            String str = TAG;
            AppboyLogger.m5448d(str, "Setting the image loader deny network downloads to " + z);
            this.mImageLoader.setOffline(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m5393a(String str, String str2, BigDecimal bigDecimal, int i, AppboyProperties appboyProperties) {
        try {
            if (!ValidationUtils.isValidLogPurchaseInput(str, str2, bigDecimal, i, this.mServerConfigStorageProvider)) {
                AppboyLogger.m5459w(TAG, "Log purchase input was invalid. Not logging in-app purchase to Braze.");
            } else if (appboyProperties == null || !appboyProperties.isInvalid()) {
                String ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(str);
                C1687s2 a = C1687s2.m4697a(ensureBrazeFieldLength, str2, bigDecimal, i, appboyProperties);
                if (this.mBrazeManager.mo6243b((C1594h2) a)) {
                    this.mTriggerManager.mo6124a((C1721w5) new C1528a6(ensureBrazeFieldLength, appboyProperties, a));
                }
            } else {
                AppboyLogger.m5459w(TAG, "Purchase logged with invalid properties. Not logging custom event to Braze.");
            }
        } catch (Exception e) {
            String str3 = TAG;
            AppboyLogger.m5460w(str3, "Failed to log purchase event of " + str, e);
            publishError(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ BrazeUser m5397b() {
        return this.mAppboyUser;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m5392a(String str, String str2, String str3) {
        try {
            if (StringUtils.isNullOrBlank(str)) {
                AppboyLogger.m5459w(TAG, "Campaign ID cannot be null or blank. Not logging push notification action clicked.");
            } else if (StringUtils.isNullOrBlank(str2)) {
                AppboyLogger.m5459w(TAG, "Action ID cannot be null or blank");
            } else {
                this.mBrazeManager.mo6243b((C1594h2) C1694t2.m4757a(str, str2, str3));
            }
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to log push notification action clicked.", e);
            publishError(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m5402b(String str) {
        try {
            if (StringUtils.isNullOrBlank(str)) {
                AppboyLogger.m5459w(TAG, "Card ID cannot be null or blank.");
                return;
            }
            this.mBrazeManager.mo6243b((C1594h2) C1687s2.m4715g(str));
            this.mFeedStorageProvider.markCardAsViewed(str);
        } catch (Exception e) {
            String str2 = TAG;
            AppboyLogger.m5460w(str2, "Failed to log feed card impression. Card id: " + str, e);
            publishError(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m5400b(C1602i2 i2Var) {
        try {
            if (this.mBrazeGeofenceManager != null) {
                this.mBrazeGeofenceManager.mo6174a(i2Var);
            } else {
                AppboyLogger.m5448d(TAG, "Geofence manager was null. Not requesting geofence refresh.");
            }
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to request geofence refresh.", e);
            publishError(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m5395a(boolean z) {
        if (z) {
            try {
                this.mExternalIEventMessenger.mo6134a(this.mContentCardsStorageProvider.getCachedCardsAsEvent(), ContentCardsUpdatedEvent.class);
            } catch (Exception e) {
                String str = TAG;
                AppboyLogger.m5460w(str, "Failed to request Content Cards refresh. Requesting from cache: " + z, e);
                publishError(e);
            }
        } else if (this.mServerConfigStorageProvider.mo6017m()) {
            this.mBrazeManager.mo6229a(this.mContentCardsStorageProvider.mo6393d(), this.mContentCardsStorageProvider.mo6395e());
        } else {
            AppboyLogger.m5448d(TAG, "Content Cards is not enabled, skipping API call to refresh");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m5404b(boolean z) {
        try {
            if (this.mBrazeGeofenceManager != null) {
                this.mBrazeGeofenceManager.mo6183b(z);
            } else {
                AppboyLogger.m5448d(TAG, "Geofence manager was null. Not requesting geofence refresh.");
            }
        } catch (Exception e) {
            String str = TAG;
            AppboyLogger.m5460w(str, "Failed to request geofence refresh with rate limit ignore: " + z, e);
            publishError(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m5387a(IValueCallback iValueCallback) {
        if (this.mAppboyUser != null) {
            iValueCallback.onSuccess(this.mAppboyUser);
        } else {
            iValueCallback.onError();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Card m5380a(JSONObject jSONObject) {
        try {
            return this.mContentCardsStorageProvider.mo6380a(jSONObject);
        } catch (JSONException e) {
            String str = TAG;
            AppboyLogger.m5452e(str, "Failed to deserialize content card json. Payload: " + jSONObject, e);
            publishError(e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m5388a(String str) {
        try {
            if (StringUtils.isNullOrBlank(str)) {
                AppboyLogger.m5459w(TAG, "Card ID cannot be null or blank.");
            } else {
                this.mBrazeManager.mo6243b((C1594h2) C1687s2.m4713f(str));
            }
        } catch (Exception e) {
            String str2 = TAG;
            AppboyLogger.m5452e(str2, "Failed to log feed card clicked. Card id: " + str, e);
            publishError(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m5381a(double d, double d2) {
        try {
            if (this.mBrazeGeofenceManager != null) {
                String str = TAG;
                AppboyLogger.m5459w(str, "Manually requesting Geofence refresh of with provided latitude - longitude: " + d + " - " + d2);
                this.mBrazeGeofenceManager.mo6174a((C1602i2) new C1643n2(d, d2));
                return;
            }
            AppboyLogger.m5448d(TAG, "Geofence manager was null. Not requesting geofence refresh.");
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to request geofence refresh.", e);
            publishError(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m5394a(String str, boolean z) {
        try {
            if (StringUtils.isNullOrBlank(str)) {
                AppboyLogger.m5459w(TAG, "Google Advertising ID cannot be null or blank");
                return;
            }
            this.mDeviceDataProvider.mo6310a(str);
            this.mDeviceDataProvider.mo6311a(z);
        } catch (Exception e) {
            String str2 = TAG;
            AppboyLogger.m5452e(str2, "Failed to set Google Advertising ID data on device. Google Advertising ID: " + str + " and limit-ad-tracking: " + z, e);
            publishError(e);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m5396a(File file, String str) {
        return str.startsWith("com.appboy") && !str.equals(RuntimeAppConfigurationProvider.SHARED_PREFERENCES_NAME);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m5389a(String str, C1546c0 c0Var) {
        try {
            if (this.mBrazeGeofenceManager != null) {
                this.mBrazeGeofenceManager.mo6182b(str, c0Var);
            } else {
                AppboyLogger.m5448d(TAG, "Geofence manager was null. Not posting geofence report");
            }
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to post geofence report.", e);
            publishError(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m5391a(String str, String str2) {
        try {
            this.mContentCardsStorageProvider.mo6378a(new C1725x2(str), str2);
            this.mExternalIEventMessenger.mo6134a(this.mContentCardsStorageProvider.getCachedCardsAsEvent(), ContentCardsUpdatedEvent.class);
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, C25541a.m63882l("Failed to update ContentCard storage provider with single card update. User id: ", str2, " Serialized json: ", str), e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m5385a(C1602i2 i2Var) {
        try {
            this.mBrazeManager.mo6243b((C1594h2) C1687s2.m4690a(i2Var));
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to log location recorded event.", e);
            publishError(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m5384a(Intent intent) {
        try {
            requestTriggersIfInAppMessageTestPush(intent, this.mBrazeManager);
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Error handling test in-app message push", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ ContentCardsUpdatedEvent m5379a() {
        return this.mContentCardsStorageProvider.getCachedCardsAsEvent();
    }

    /* renamed from: a */
    public static /* synthetic */ Uri m5378a(String str, Uri uri) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String encodedAuthority = parse.getEncodedAuthority();
        Uri.Builder buildUpon = uri.buildUpon();
        if (StringUtils.isNullOrBlank(scheme) || StringUtils.isNullOrBlank(encodedAuthority)) {
            return buildUpon.encodedAuthority(str).build();
        }
        buildUpon.encodedAuthority(encodedAuthority);
        buildUpon.scheme(scheme);
        return buildUpon.build();
    }
}
