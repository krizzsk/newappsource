package com.google.firebase.perf.config;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.perf.provider.FirebasePerfProvider;
import com.google.firebase.remoteconfig.internal.C14535a;
import com.google.firebase.remoteconfig.internal.C14537b;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p578jf.C17843u;
import p578jf.C17844v;
import p626lf.C18200a;
import p790sf.C19454b;
import p862vf.C20118b;
import p862vf.C20119c;
import p862vf.C20122f;
import p956ze.C20839b;
import p988j$.util.concurrent.ConcurrentHashMap;

@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final C18200a logger = C18200a.m44901d();
    private final ConcurrentHashMap<String, C20119c> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final Executor executor;
    private C20118b firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private C20839b<C20122f> firebaseRemoteConfigProvider;

    private RemoteConfigManager() {
        this(new ThreadPoolExecutor(0, 1, 0, TimeUnit.SECONDS, new LinkedBlockingQueue()), (C20118b) null);
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private C20119c getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        C20119c cVar = this.allRcConfigMap.get(str);
        if (cVar.mo52363e() != 2) {
            return null;
        }
        logger.mo50611b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", cVar.mo52359a(), str);
        return cVar;
    }

    @VisibleForTesting
    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j) {
        return j - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j) {
        return j - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    /* access modifiers changed from: private */
    /* renamed from: lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0 */
    public /* synthetic */ void m36073xc904e813(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.mo52356c());
    }

    /* access modifiers changed from: private */
    /* renamed from: lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1 */
    public /* synthetic */ void m36074xc904e814(Exception exc) {
        this.firebaseRemoteConfigLastFetchTimestampMs = 0;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        if (!hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) || !hasLastFetchBecomeStale(currentSystemTimeMillis)) {
            return false;
        }
        return true;
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.mo52355b().addOnSuccessListener(this.executor, new C17843u(this, 0)).addOnFailureListener(this.executor, (OnFailureListener) new C17844v(this, 0));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                syncConfigValues(this.firebaseRemoteConfig.mo52356c());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public C19454b<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.mo50610a();
            return new C19454b<>();
        }
        C20119c remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new C19454b<>(Boolean.valueOf(remoteConfigValue.mo52362d()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo52359a().isEmpty()) {
                    logger.mo50611b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo52359a(), str);
                }
            }
        }
        return new C19454b<>();
    }

    @VisibleForTesting
    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public C19454b<Float> getFloat(String str) {
        if (str == null) {
            logger.mo50610a();
            return new C19454b<>();
        }
        C20119c remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new C19454b<>(Float.valueOf(Double.valueOf(remoteConfigValue.mo52361c()).floatValue()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo52359a().isEmpty()) {
                    logger.mo50611b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo52359a(), str);
                }
            }
        }
        return new C19454b<>();
    }

    public C19454b<Long> getLong(String str) {
        if (str == null) {
            logger.mo50610a();
            return new C19454b<>();
        }
        C20119c remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new C19454b<>(Long.valueOf(remoteConfigValue.mo52360b()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo52359a().isEmpty()) {
                    logger.mo50611b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo52359a(), str);
                }
            }
        }
        return new C19454b<>();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T getRemoteConfigValueOrDefault(java.lang.String r8, T r9) {
        /*
            r7 = this;
            vf.c r0 = r7.getRemoteConfigValue(r8)
            if (r0 == 0) goto L_0x0077
            r1 = 1
            r2 = 0
            boolean r3 = r9 instanceof java.lang.Boolean     // Catch:{ IllegalArgumentException -> 0x005a }
            if (r3 == 0) goto L_0x0016
            boolean r3 = r0.mo52362d()     // Catch:{ IllegalArgumentException -> 0x005a }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x005a }
        L_0x0014:
            r9 = r8
            goto L_0x0077
        L_0x0016:
            boolean r3 = r9 instanceof java.lang.Float     // Catch:{ IllegalArgumentException -> 0x005a }
            if (r3 == 0) goto L_0x002b
            double r3 = r0.mo52361c()     // Catch:{ IllegalArgumentException -> 0x005a }
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x005a }
            float r3 = r3.floatValue()     // Catch:{ IllegalArgumentException -> 0x005a }
            java.lang.Float r8 = java.lang.Float.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x005a }
            goto L_0x0014
        L_0x002b:
            boolean r3 = r9 instanceof java.lang.Long     // Catch:{ IllegalArgumentException -> 0x005a }
            if (r3 != 0) goto L_0x0051
            boolean r3 = r9 instanceof java.lang.Integer     // Catch:{ IllegalArgumentException -> 0x005a }
            if (r3 == 0) goto L_0x0034
            goto L_0x0051
        L_0x0034:
            boolean r3 = r9 instanceof java.lang.String     // Catch:{ IllegalArgumentException -> 0x005a }
            if (r3 == 0) goto L_0x003d
            java.lang.String r8 = r0.mo52359a()     // Catch:{ IllegalArgumentException -> 0x005a }
            goto L_0x0014
        L_0x003d:
            java.lang.String r3 = r0.mo52359a()     // Catch:{ IllegalArgumentException -> 0x005a }
            lf.a r4 = logger     // Catch:{ IllegalArgumentException -> 0x004e }
            java.lang.String r5 = "No matching type found for the defaultValue: '%s', using String."
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ IllegalArgumentException -> 0x004e }
            r6[r2] = r9     // Catch:{ IllegalArgumentException -> 0x004e }
            r4.mo50611b(r5, r6)     // Catch:{ IllegalArgumentException -> 0x004e }
            r9 = r3
            goto L_0x0077
        L_0x004e:
            r9 = r3
            goto L_0x005b
        L_0x0051:
            long r3 = r0.mo52360b()     // Catch:{ IllegalArgumentException -> 0x005a }
            java.lang.Long r8 = java.lang.Long.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x005a }
            goto L_0x0014
        L_0x005a:
        L_0x005b:
            java.lang.String r3 = r0.mo52359a()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0077
            lf.a r3 = logger
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r0 = r0.mo52359a()
            r4[r2] = r0
            r4[r1] = r8
            java.lang.String r8 = "Could not parse value: '%s' for key: '%s'."
            r3.mo50611b(r8, r4)
        L_0x0077:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.RemoteConfigManager.getRemoteConfigValueOrDefault(java.lang.String, java.lang.Object):java.lang.Object");
    }

    public C19454b<String> getString(String str) {
        if (str == null) {
            logger.mo50610a();
            return new C19454b<>();
        }
        C20119c remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            return new C19454b<>(remoteConfigValue.mo52359a());
        }
        return new C19454b<>();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        C20839b<C20122f> bVar;
        C20122f fVar;
        if (!(this.firebaseRemoteConfig != null || (bVar = this.firebaseRemoteConfigProvider) == null || (fVar = bVar.get()) == null)) {
            this.firebaseRemoteConfig = fVar.mo52366a(FIREPERF_FRC_NAMESPACE_NAME);
        }
        if (this.firebaseRemoteConfig != null) {
            return true;
        }
        return false;
    }

    public boolean isLastFetchFailed() {
        int i;
        C20118b bVar = this.firebaseRemoteConfig;
        if (bVar != null) {
            C14537b bVar2 = bVar.f51046h;
            synchronized (bVar2.f36701b) {
                bVar2.f36700a.getLong("last_fetch_time_in_millis", -1);
                i = bVar2.f36700a.getInt("last_fetch_status", 0);
                int[] iArr = C14535a.f36685k;
                long j = bVar2.f36700a.getLong("fetch_timeout_in_seconds", 60);
                if (j >= 0) {
                    long j2 = bVar2.f36700a.getLong("minimum_fetch_interval_in_seconds", C14535a.f36684j);
                    if (j2 < 0) {
                        throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j2 + " is an invalid argument");
                    }
                } else {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", new Object[]{Long.valueOf(j)}));
                }
            }
            if (i != 1) {
                return false;
            }
        }
        return true;
    }

    public void setFirebaseRemoteConfigProvider(C20839b<C20122f> bVar) {
        this.firebaseRemoteConfigProvider = bVar;
    }

    @VisibleForTesting
    public void syncConfigValues(Map<String, C20119c> map) {
        this.allRcConfigMap.putAll(map);
        for (String next : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(next)) {
                this.allRcConfigMap.remove(next);
            }
        }
    }

    public RemoteConfigManager(Executor executor2, C20118b bVar) {
        this(executor2, bVar, ((long) new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS)) + 5000);
    }

    @VisibleForTesting
    public RemoteConfigManager(Executor executor2, C20118b bVar, long j) {
        ConcurrentHashMap<String, C20119c> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = 0;
        this.executor = executor2;
        this.firebaseRemoteConfig = bVar;
        if (bVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(bVar.mo52356c());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = TimeUnit.MICROSECONDS.toMillis(FirebasePerfProvider.getAppStartTime().f36654b);
        this.appStartConfigFetchDelayInMs = j;
    }
}
