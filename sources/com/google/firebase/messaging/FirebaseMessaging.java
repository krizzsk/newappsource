package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.appcompat.widget.C0416i1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.messaging.C14471a;
import h60.C17327j1;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p041ca.C1829o;
import p054d0.C4280f0;
import p237r9.C6273f;
import p304x.C7082o;
import p304x.C7109v;
import p316y.C7219n;
import p358af.C13436c;
import p373au.C13533e;
import p484ff.C16962c0;
import p484ff.C16966d0;
import p484ff.C16971f0;
import p484ff.C16973g0;
import p484ff.C16974h;
import p484ff.C16981k;
import p484ff.C16983l;
import p484ff.C16984m;
import p484ff.C16985n;
import p484ff.C16987p;
import p484ff.C16989r;
import p484ff.C16990s;
import p484ff.C16994w;
import p484ff.C16996y;
import p484ff.C16997z;
import p743qd.C19107d;
import p838uf.C19906g;
import p885we.C20294d;
import p933ye.C20713a;
import p956ze.C20839b;

public class FirebaseMessaging {
    private static final String EXTRA_DUMMY_P_INTENT = "app";
    public static final String GMS_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final String INSTANCE_ID_SCOPE = "FCM";
    private static final long MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8);
    private static final long MIN_DELAY_SEC = 30;
    private static final String SEND_INTENT_ACTION = "com.google.android.gcm.intent.SEND";
    private static final String SUBTYPE_DEFAULT = "";
    public static final String TAG = "FirebaseMessaging";
    private static C14471a store;
    public static ScheduledExecutorService syncExecutor;
    @SuppressLint({"FirebaseUnknownNullness"})
    public static C6273f transportFactory;
    private final C14470a autoInit;
    private final Context context;
    private final Executor fileExecutor;
    /* access modifiers changed from: private */
    public final C19107d firebaseApp;
    private final C13436c fis;
    private final C16987p gmsRpc;
    private final C20713a iid;
    private final Executor initExecutor;
    private final Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private final C16990s metadata;
    private final C16997z requestDeduplicator;
    private boolean syncScheduledOrRunning;
    private final Executor taskExecutor;
    private final Task<C16973g0> topicsSubscriberTask;

    /* renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    public class C14470a {

        /* renamed from: a */
        public final C20294d f36580a;

        /* renamed from: b */
        public boolean f36581b;

        /* renamed from: c */
        public C16985n f36582c;

        /* renamed from: d */
        public Boolean f36583d;

        public C14470a(C20294d dVar) {
            this.f36580a = dVar;
        }

        /* renamed from: a */
        public final synchronized void mo43431a() {
            if (!this.f36581b) {
                Boolean b = mo43432b();
                this.f36583d = b;
                if (b == null) {
                    C16985n nVar = new C16985n(this);
                    this.f36582c = nVar;
                    this.f36580a.mo40733b(nVar);
                }
                this.f36581b = true;
            }
        }

        /* renamed from: b */
        public final Boolean mo43432b() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            C19107d access$000 = FirebaseMessaging.this.firebaseApp;
            access$000.mo51535a();
            Context context = access$000.f48568a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), RecyclerView.C1119a0.FLAG_IGNORE)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FirebaseMessaging(C19107d dVar, C20713a aVar, C20839b<C19906g> bVar, C20839b<HeartBeatInfo> bVar2, C13436c cVar, C6273f fVar, C20294d dVar2) {
        this(dVar, aVar, bVar, bVar2, cVar, fVar, dVar2, new C16990s(dVar.f48568a));
        dVar.mo51535a();
    }

    public static synchronized void clearStoreForTest() {
        synchronized (FirebaseMessaging.class) {
            store = null;
        }
    }

    public static void clearTransportFactoryForTest() {
        transportFactory = null;
    }

    public static synchronized FirebaseMessaging getInstance() {
        FirebaseMessaging instance;
        synchronized (FirebaseMessaging.class) {
            instance = getInstance(C19107d.m46265d());
        }
        return instance;
    }

    private static synchronized C14471a getStore(Context context2) {
        C14471a aVar;
        synchronized (FirebaseMessaging.class) {
            if (store == null) {
                store = new C14471a(context2);
            }
            aVar = store;
        }
        return aVar;
    }

    private String getSubtype() {
        C19107d dVar = this.firebaseApp;
        dVar.mo51535a();
        if ("[DEFAULT]".equals(dVar.f48569b)) {
            return "";
        }
        return this.firebaseApp.mo51538f();
    }

    public static C6273f getTransportFactory() {
        return transportFactory;
    }

    /* access modifiers changed from: private */
    /* renamed from: invokeOnTokenRefresh */
    public void lambda$new$0(String str) {
        C19107d dVar = this.firebaseApp;
        dVar.mo51535a();
        if ("[DEFAULT]".equals(dVar.f48569b)) {
            if (Log.isLoggable(TAG, 3)) {
                this.firebaseApp.mo51535a();
            }
            Intent intent = new Intent(FirebaseMessagingService.ACTION_NEW_TOKEN);
            intent.putExtra(FirebaseMessagingService.EXTRA_TOKEN, str);
            new C16981k(this.context).mo49610b(intent);
        }
    }

    private Task lambda$blockingGetToken$10(String str, C14471a.C14472a aVar) {
        C16987p pVar = this.gmsRpc;
        return pVar.mo49619a(pVar.mo49621c(new Bundle(), C16990s.m42831a(pVar.f44092a), "*")).onSuccessTask(this.fileExecutor, new C1829o(1, this, str, aVar));
    }

    /* access modifiers changed from: private */
    public Task lambda$blockingGetToken$9(String str, C14471a.C14472a aVar, String str2) throws Exception {
        String str3;
        String str4;
        C14471a store2 = getStore(this.context);
        String subtype = getSubtype();
        C16990s sVar = this.metadata;
        synchronized (sVar) {
            if (sVar.f44102b == null) {
                sVar.mo49625c();
            }
            str3 = sVar.f44102b;
        }
        synchronized (store2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i = C14471a.C14472a.f36589e;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(FirebaseMessagingService.EXTRA_TOKEN, str2);
                jSONObject.put("appVersion", str3);
                jSONObject.put("timestamp", currentTimeMillis);
                str4 = jSONObject.toString();
            } catch (JSONException e) {
                e.toString();
                str4 = null;
            }
            if (str4 != null) {
                SharedPreferences.Editor edit = store2.f36587a.edit();
                edit.putString(C14471a.m36063a(subtype, str), str4);
                edit.commit();
            }
        }
        if (aVar == null || !str2.equals(aVar.f36590a)) {
            lambda$new$0(str2);
        }
        return Tasks.forResult(str2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteToken$5(TaskCompletionSource taskCompletionSource) {
        try {
            C20713a aVar = this.iid;
            C16990s.m42831a(this.firebaseApp);
            aVar.mo52856a();
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
        r5.setException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void lambda$deleteToken$6(com.google.android.gms.tasks.TaskCompletionSource r5) {
        /*
            r4 = this;
            ff.p r0 = r4.gmsRpc     // Catch:{ Exception -> 0x004e }
            r0.getClass()     // Catch:{ Exception -> 0x004e }
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ Exception -> 0x004e }
            r1.<init>()     // Catch:{ Exception -> 0x004e }
            java.lang.String r2 = "delete"
            java.lang.String r3 = "1"
            r1.putString(r2, r3)     // Catch:{ Exception -> 0x004e }
            qd.d r2 = r0.f44092a     // Catch:{ Exception -> 0x004e }
            java.lang.String r2 = p484ff.C16990s.m42831a(r2)     // Catch:{ Exception -> 0x004e }
            java.lang.String r3 = "*"
            com.google.android.gms.tasks.Task r1 = r0.mo49621c(r1, r2, r3)     // Catch:{ Exception -> 0x004e }
            com.google.android.gms.tasks.Task r0 = r0.mo49619a(r1)     // Catch:{ Exception -> 0x004e }
            com.google.android.gms.tasks.Tasks.await(r0)     // Catch:{ Exception -> 0x004e }
            android.content.Context r0 = r4.context     // Catch:{ Exception -> 0x004e }
            com.google.firebase.messaging.a r0 = getStore(r0)     // Catch:{ Exception -> 0x004e }
            java.lang.String r1 = r4.getSubtype()     // Catch:{ Exception -> 0x004e }
            qd.d r2 = r4.firebaseApp     // Catch:{ Exception -> 0x004e }
            java.lang.String r2 = p484ff.C16990s.m42831a(r2)     // Catch:{ Exception -> 0x004e }
            monitor-enter(r0)     // Catch:{ Exception -> 0x004e }
            java.lang.String r1 = com.google.firebase.messaging.C14471a.m36063a(r1, r2)     // Catch:{ all -> 0x004b }
            android.content.SharedPreferences r2 = r0.f36587a     // Catch:{ all -> 0x004b }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x004b }
            r2.remove(r1)     // Catch:{ all -> 0x004b }
            r2.commit()     // Catch:{ all -> 0x004b }
            monitor-exit(r0)     // Catch:{ Exception -> 0x004e }
            r0 = 0
            r5.setResult(r0)     // Catch:{ Exception -> 0x004e }
            goto L_0x0052
        L_0x004b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ Exception -> 0x004e }
            throw r1     // Catch:{ Exception -> 0x004e }
        L_0x004e:
            r0 = move-exception
            r5.setException(r0)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.lambda$deleteToken$6(com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getToken$4(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(blockingGetToken());
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1() {
        if (isAutoInitEnabled()) {
            startSyncIfNecessary();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(C16973g0 g0Var) {
        if (isAutoInitEnabled()) {
            g0Var.mo49602e();
        }
    }

    /* access modifiers changed from: private */
    public void lambda$new$3() {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context context2 = this.context;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context2;
        }
        if (!applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
            C16974h hVar = new C16974h(2);
            try {
                Context applicationContext2 = context2.getApplicationContext();
                PackageManager packageManager = applicationContext2.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext2.getPackageName(), RecyclerView.C1119a0.FLAG_IGNORE)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled"))) {
                    z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                    C16994w.m42843a(context2, hVar, z);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z = true;
            C16994w.m42843a(context2, hVar, z);
        }
    }

    /* access modifiers changed from: private */
    public static Task lambda$subscribeToTopic$7(String str, C16973g0 g0Var) throws Exception {
        g0Var.getClass();
        Task<Void> d = g0Var.mo49601d(new C16966d0("S", str));
        g0Var.mo49602e();
        return d;
    }

    /* access modifiers changed from: private */
    public static Task lambda$unsubscribeFromTopic$8(String str, C16973g0 g0Var) throws Exception {
        g0Var.getClass();
        Task<Void> d = g0Var.mo49601d(new C16966d0("U", str));
        g0Var.mo49602e();
        return d;
    }

    private synchronized void startSync() {
        if (!this.syncScheduledOrRunning) {
            syncWithDelaySecondsInternal(0);
        }
    }

    /* access modifiers changed from: private */
    public void startSyncIfNecessary() {
        C20713a aVar = this.iid;
        if (aVar != null) {
            aVar.getToken();
        } else if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    public String blockingGetToken() throws IOException {
        Task task;
        C20713a aVar = this.iid;
        if (aVar != null) {
            try {
                return (String) Tasks.await(aVar.mo52858c());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        } else {
            C14471a.C14472a tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
            if (!tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
                return tokenWithoutTriggeringSync.f36590a;
            }
            String a = C16990s.m42831a(this.firebaseApp);
            C16997z zVar = this.requestDeduplicator;
            synchronized (zVar) {
                task = (Task) zVar.f44114b.getOrDefault(a, null);
                if (task == null) {
                    task = lambda$blockingGetToken$10(a, tokenWithoutTriggeringSync).continueWithTask(zVar.f44113a, new C16996y(zVar, a));
                    zVar.f44114b.put(a, task);
                }
            }
            try {
                return (String) Tasks.await(task);
            } catch (InterruptedException | ExecutionException e2) {
                throw new IOException(e2);
            }
        }
    }

    public Task<Void> deleteToken() {
        if (this.iid != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.initExecutor.execute(new C7219n(9, this, taskCompletionSource));
            return taskCompletionSource.getTask();
        } else if (getTokenWithoutTriggeringSync() == null) {
            return Tasks.forResult(null);
        } else {
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io")).execute(new C7109v(9, this, taskCompletionSource2));
            return taskCompletionSource2.getTask();
        }
    }

    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return C16989r.m42828a();
    }

    public void enqueueTaskWithDelaySeconds(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (syncExecutor == null) {
                syncExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            syncExecutor.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public Context getApplicationContext() {
        return this.context;
    }

    public Task<String> getToken() {
        C20713a aVar = this.iid;
        if (aVar != null) {
            return aVar.mo52858c();
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.initExecutor.execute(new C4280f0(5, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public C14471a.C14472a getTokenWithoutTriggeringSync() {
        C14471a.C14472a a;
        C14471a store2 = getStore(this.context);
        String subtype = getSubtype();
        String a2 = C16990s.m42831a(this.firebaseApp);
        synchronized (store2) {
            a = C14471a.C14472a.m36064a(store2.f36587a.getString(C14471a.m36063a(subtype, a2), (String) null));
        }
        return a;
    }

    public Task<C16973g0> getTopicsSubscriberTask() {
        return this.topicsSubscriberTask;
    }

    public boolean isAutoInitEnabled() {
        boolean z;
        C14470a aVar = this.autoInit;
        synchronized (aVar) {
            aVar.mo43431a();
            Boolean bool = aVar.f36583d;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = FirebaseMessaging.this.firebaseApp.mo51541j();
            }
        }
        return z;
    }

    public boolean isGmsCorePresent() {
        return this.metadata.mo49624b();
    }

    public boolean isNotificationDelegationEnabled() {
        boolean z;
        Context context2 = this.context;
        if (PlatformVersion.isAtLeastQ()) {
            if (Binder.getCallingUid() == context2.getApplicationInfo().uid) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                context2.getPackageName();
            } else if ("com.google.android.gms".equals(((NotificationManager) context2.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                return true;
            }
        }
        return false;
    }

    public void send(RemoteMessage remoteMessage) {
        int i;
        if (!TextUtils.isEmpty(remoteMessage.f36585b.getString("google.to"))) {
            Intent intent = new Intent(SEND_INTENT_ACTION);
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            Context context2 = this.context;
            if (Build.VERSION.SDK_INT >= 23) {
                i = 67108864;
            } else {
                i = 0;
            }
            intent.putExtra("app", PendingIntent.getBroadcast(context2, 0, intent2, i));
            intent.setPackage("com.google.android.gms");
            intent.putExtras(remoteMessage.f36585b);
            this.context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    public void setAutoInitEnabled(boolean z) {
        C14470a aVar = this.autoInit;
        synchronized (aVar) {
            aVar.mo43431a();
            C16985n nVar = aVar.f36582c;
            if (nVar != null) {
                aVar.f36580a.mo40732a(nVar);
                aVar.f36582c = null;
            }
            C19107d access$000 = FirebaseMessaging.this.firebaseApp;
            access$000.mo51535a();
            SharedPreferences.Editor edit = access$000.f48568a.getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z);
            edit.apply();
            if (z) {
                FirebaseMessaging.this.startSyncIfNecessary();
            }
            aVar.f36583d = Boolean.valueOf(z);
        }
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z) {
        C19107d d = C19107d.m46265d();
        d.mo51535a();
        d.f48568a.getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z).apply();
    }

    public Task<Void> setNotificationDelegationEnabled(boolean z) {
        return C16994w.m42843a(this.context, this.initExecutor, z);
    }

    public synchronized void setSyncScheduledOrRunning(boolean z) {
        this.syncScheduledOrRunning = z;
    }

    public Task<Void> subscribeToTopic(String str) {
        return this.topicsSubscriberTask.onSuccessTask(new C13533e(str, 5));
    }

    public synchronized void syncWithDelaySecondsInternal(long j) {
        enqueueTaskWithDelaySeconds(new C16962c0(this, Math.min(Math.max(MIN_DELAY_SEC, 2 * j), MAX_DELAY_SEC)), j);
        this.syncScheduledOrRunning = true;
    }

    public boolean tokenNeedsRefresh(C14471a.C14472a aVar) {
        String str;
        boolean z;
        if (aVar == null) {
            return true;
        }
        C16990s sVar = this.metadata;
        synchronized (sVar) {
            if (sVar.f44102b == null) {
                sVar.mo49625c();
            }
            str = sVar.f44102b;
        }
        if (System.currentTimeMillis() > aVar.f36592c + C14471a.C14472a.f36588d || !str.equals(aVar.f36591b)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public Task<Void> unsubscribeFromTopic(String str) {
        return this.topicsSubscriberTask.onSuccessTask(new C17327j1(str, 8));
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(C19107d dVar) {
        FirebaseMessaging firebaseMessaging;
        Class cls = FirebaseMessaging.class;
        synchronized (cls) {
            firebaseMessaging = (FirebaseMessaging) dVar.mo51536b(cls);
            Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public FirebaseMessaging(C19107d dVar, C20713a aVar, C20839b<C19906g> bVar, C20839b<HeartBeatInfo> bVar2, C13436c cVar, C6273f fVar, C20294d dVar2, C16990s sVar) {
        this(dVar, aVar, cVar, fVar, dVar2, sVar, new C16987p(dVar, sVar, bVar, bVar2, cVar), Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task")), new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init")), new ThreadPoolExecutor(0, 1, MIN_DELAY_SEC, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io")));
    }

    public FirebaseMessaging(C19107d dVar, C20713a aVar, C13436c cVar, C6273f fVar, C20294d dVar2, C16990s sVar, C16987p pVar, Executor executor, Executor executor2, Executor executor3) {
        C19107d dVar3 = dVar;
        C20713a aVar2 = aVar;
        Executor executor4 = executor;
        Executor executor5 = executor2;
        this.syncScheduledOrRunning = false;
        transportFactory = fVar;
        this.firebaseApp = dVar3;
        this.iid = aVar2;
        this.fis = cVar;
        this.autoInit = new C14470a(dVar2);
        dVar.mo51535a();
        Context context2 = dVar3.f48568a;
        this.context = context2;
        C16983l lVar = new C16983l();
        this.lifecycleCallbacks = lVar;
        this.metadata = sVar;
        this.taskExecutor = executor4;
        this.gmsRpc = pVar;
        this.requestDeduplicator = new C16997z(executor4);
        this.initExecutor = executor5;
        this.fileExecutor = executor3;
        dVar.mo51535a();
        Context context3 = dVar3.f48568a;
        if (context3 instanceof Application) {
            ((Application) context3).registerActivityLifecycleCallbacks(lVar);
        } else {
            Objects.toString(context3);
        }
        if (aVar2 != null) {
            aVar.mo52857b();
        }
        executor5.execute(new C7082o(this, 8));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i = C16973g0.f44054j;
        Task<C16973g0> call = Tasks.call(scheduledThreadPoolExecutor, new C16971f0(context2, this, pVar, sVar, scheduledThreadPoolExecutor));
        this.topicsSubscriberTask = call;
        call.addOnSuccessListener(executor5, (OnSuccessListener<? super C16973g0>) new C16984m(this, 0));
        executor5.execute(new C0416i1(this, 8));
    }
}
