package com.moovit;

import a80.C7514b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.http.HttpResponseCache;
import android.os.AsyncTask;
import android.view.ViewConfiguration;
import android.webkit.CookieSyncManager;
import androidx.lifecycle.C1031o;
import androidx.lifecycle.C1045x;
import androidx.lifecycle.C1047z;
import androidx.lifecycle.Lifecycle;
import androidx.multidex.MultiDexApplication;
import c30.C1774d;
import c70.C13752e;
import c70.C13756i;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.security.ProviderInstaller;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.appdata.UserContextLoader;
import com.moovit.car.operators.C15684a;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.DataUnit;
import com.moovit.gcm.topic.GcmTopicManager;
import com.moovit.location.C16202a;
import com.moovit.maintenance.MaintenanceManager;
import com.moovit.offline.GtfsConfiguration;
import com.moovit.request.RequestOptions;
import com.moovit.tripplanner.C7864a;
import d10.C16532a;
import f00.C16919g;
import f10.C16935f;
import f80.C12637c;
import g30.C4773f;
import g30.C4775g;
import i80.C12760b;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import n20.C18511a;
import n20.C18512b;
import n20.C18513c;
import n20.C18514d;
import n20.C18515e;
import n20.C18516f;
import n20.C18520g;
import n20.C18521h;
import o20.C18710p;
import p001a0.C0016g;
import p066e0.C4436j0;
import p130j2.C5367a;
import p241s0.C6307g;
import p269u2.C6677a;
import p40.C6067b;
import p40.C6069c;
import p40.C6070d;
import p40.C6072f;
import p40.C6073g;
import p40.C6075h;
import p40.C6076i;
import p40.C6078j;
import p40.C6080k;
import p40.C6081l;
import p40.C6083m;
import p40.C6085n;
import p40.C6088o;
import p40.C6090p;
import p401bz.C13709c;
import p435de.C16596f;
import p528gz.C17269d;
import p528gz.C17290i;
import p543hq.C17474b;
import p555ie.C17579b;
import p555ie.C17589h;
import p555ie.C17590i;
import p567iq.C17635b;
import p646lz.C18299a;
import p646lz.C18304b;
import p646lz.C18305c;
import p686ns.C18587a;
import p743qd.C19107d;
import p824tp.C19722a0;
import p824tp.C19724c;
import p824tp.C19725d;
import p824tp.C19727e;
import p824tp.C19728f;
import p824tp.C19731i;
import p824tp.C19733k;
import p824tp.C19747y;
import p848up.C19976a;
import p896wp.C20382b;
import p896wp.C20386f;
import p896wp.C20387g;
import p906wz.C20431c;
import p906wz.C20436g;
import p929xy.C20658b;
import p929xy.C20661d;
import p929xy.C20662e;
import p929xy.C20665h;
import p929xy.C20667i;
import p929xy.C20670j;
import p929xy.C20671k;
import p929xy.C20672l;
import p929xy.C20674m;
import p929xy.C20675n;
import p977zz.C20927a0;
import p977zz.C20930c;
import p977zz.C20934d0;
import p977zz.C20943i;
import p977zz.C20955o;
import p977zz.C20975x0;
import q00.C19047a;
import q00.C19051c;
import r10.C19217a;
import s00.C19390c;
import s00.C19391d;
import y90.C13266a;
import y90.C13272f;
import z90.C13343a;

public abstract class MoovitApplication<G extends C19390c, M extends C19391d, C extends C19731i<G, M>> extends MultiDexApplication implements C1031o, C18304b, C13756i.C13760d {

    /* renamed from: k */
    public static volatile MoovitApplication<?, ?, ?> f37317k;

    /* renamed from: b */
    public final C19727e f37318b = new C19727e();

    /* renamed from: c */
    public boolean f37319c;

    /* renamed from: d */
    public boolean f37320d = false;

    /* renamed from: e */
    public C18299a f37321e;

    /* renamed from: f */
    public C13756i f37322f;

    /* renamed from: g */
    public C19725d f37323g;

    /* renamed from: h */
    public C18710p f37324h = null;

    /* renamed from: i */
    public C18710p f37325i;

    /* renamed from: j */
    public C f37326j = null;

    /* renamed from: n */
    public static boolean m36934n() {
        return C1047z.f3987j.f3993g.f3971c.isAtLeast(Lifecycle.State.STARTED);
    }

    /* renamed from: N */
    public final void mo40691N(C20431c cVar, ServerException serverException, boolean z) {
    }

    /* renamed from: Y */
    public final void mo40692Y(C20431c cVar, IOException iOException, boolean z) {
        if (!z) {
            C16596f.m42113a().mo49364c(iOException);
        }
    }

    /* renamed from: a */
    public final void mo40693a() {
    }

    /* renamed from: c */
    public final void mo40694c(C20431c cVar, C20436g gVar) {
    }

    /* renamed from: d */
    public final void mo44553d(Object obj, String str) {
        Exception exc;
        if (obj instanceof Exception) {
            exc = (Exception) obj;
        } else {
            exc = new AppDataPartLoadFailedException("Failed to load " + str + ", reason=" + obj, (String) null, (Throwable) null);
        }
        C16596f.m42113a().mo49364c(exc);
    }

    /* renamed from: g */
    public final void mo44554g(Object obj, String str) {
        if ("USER_CONTEXT".equals(str)) {
            mo44572t((C19722a0) obj);
        } else if ("METRO_CONTEXT".equals(str)) {
            mo44570r((C19728f) obj);
        } else if ("CONFIGURATION".equals(str)) {
            mo44562o((C19047a) obj);
        } else if ("GTFS_CONFIGURATION".equals(str)) {
            GtfsConfiguration gtfsConfiguration = (GtfsConfiguration) obj;
            if (this.f37319c && gtfsConfiguration.mo19763c()) {
                this.f37321e.mo50697i("GTFS_STATIC_DATA_DOWNLOADER", (C18299a.C18300a) null);
                this.f37321e.mo50697i("GTFS_DYNAMIC_DATA_DOWNLOADER", (C18299a.C18300a) null);
                this.f37321e.mo50697i("GTFS_REMOTE_IMAGES_PARSER_LOADER", (C18299a.C18300a) null);
                this.f37321e.mo50697i("GTFS_LINE_GROUPS_PARSER_LOADER", (C18299a.C18300a) null);
                this.f37321e.mo50697i("GTFS_STOPS_PARSER_LOADER", (C18299a.C18300a) null);
                this.f37321e.mo50697i("SEARCH_LINE_FTS", (C18299a.C18300a) null);
                this.f37321e.mo50697i("SEARCH_STOP_FTS", (C18299a.C18300a) null);
                this.f37321e.mo50697i("GTFS_PATTERNS_PARSER_LOADER", (C18299a.C18300a) null);
                this.f37321e.mo50697i("GTFS_BICYCLE_STOPS_PARSER_LOADER", (C18299a.C18300a) null);
                this.f37321e.mo50697i("GTFS_SHAPES_PARSER_LOADER", (C18299a.C18300a) null);
                this.f37321e.mo50697i("GTFS_SHAPE_SEGMENTS_PARSER_LOADER", (C18299a.C18300a) null);
                this.f37321e.mo50697i("GTFS_FREQUENCIES_PARSER_LOADER", (C18299a.C18300a) null);
            }
        } else if ("GOOGLE_PLAY_SERVICES".equals(str)) {
            C16202a.get(this).onGooglePlayServicesAvailable();
        }
    }

    public Object getSystemService(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1817785029:
                if (str.equals("user_context")) {
                    c = 0;
                    break;
                }
                break;
            case -598704137:
                if (str.equals("car_operator_provider_service")) {
                    c = 1;
                    break;
                }
                break;
            case -493109629:
                if (str.equals("twitter_service_alerts_feeds")) {
                    c = 2;
                    break;
                }
                break;
            case -433561463:
                if (str.equals("metro_context")) {
                    c = 3;
                    break;
                }
                break;
            case 635108337:
                if (str.equals("gtfs_configuration")) {
                    c = 4;
                    break;
                }
                break;
            case 1422895613:
                if (str.equals("request_manager")) {
                    c = 5;
                    break;
                }
                break;
            case 1505637250:
                if (str.equals("user_configuration")) {
                    c = 6;
                    break;
                }
                break;
            case 2093653651:
                if (str.equals("destruction_notifier")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return mo44557i("USER_CONTEXT");
            case 1:
                return C15684a.m40087a();
            case 2:
                return mo44557i("TWITTER_SERVICE_ALERTS_FEEDS");
            case 3:
                return mo44557i("METRO_CONTEXT");
            case 4:
                return mo44557i("GTFS_CONFIGURATION");
            case 5:
                return this.f37322f;
            case 6:
                return mo44557i("CONFIGURATION");
            case 7:
                return this.f37323g;
            default:
                return super.getSystemService(str);
        }
    }

    /* renamed from: h */
    public abstract C17635b mo44556h();

    /* renamed from: i */
    public final <T> T mo44557i(String str) {
        return this.f37321e.mo50690c(str);
    }

    /* renamed from: j */
    public final C mo44558j() {
        if (this.f37326j == null) {
            synchronized (this) {
                if (this.f37326j == null) {
                    this.f37326j = mo44556h();
                }
            }
        }
        return this.f37326j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.moovit.map.MapImplType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o20.C18710p mo44559k(android.content.Context r4) {
        /*
            r3 = this;
            o20.p r0 = r3.f37324h
            if (r0 != 0) goto L_0x0079
            q00.a$a r0 = q00.C19047a.f48441d
            java.lang.String r0 = "user_configuration"
            java.lang.Object r4 = r4.getSystemService(r0)
            q00.a r4 = (q00.C19047a) r4
            o20.p r0 = r3.f37325i
            f00.g$b r1 = a10.C13386a.f33221a
            T r1 = r1.f43936b
            com.moovit.map.MapImplType r1 = (com.moovit.map.MapImplType) r1
            if (r1 != 0) goto L_0x0021
            q00.d$k r1 = q00.C19053d.f48467f
            java.lang.Object r4 = r4.mo51505b(r1)
            r1 = r4
            com.moovit.map.MapImplType r1 = (com.moovit.map.MapImplType) r1
        L_0x0021:
            java.lang.String r4 = r1.getFactoryClassName()
            if (r0 == 0) goto L_0x0036
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x0036
            goto L_0x006c
        L_0x0036:
            if (r0 == 0) goto L_0x003b
            r0.mo48826f()
        L_0x003b:
            java.lang.String r4 = r1.getFactoryClassName()
            r0 = 0
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x004e }
            java.lang.Object r4 = r4.newInstance()     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x004e }
            o20.p r4 = (o20.C18710p) r4     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x004e }
            r4.mo48825e(r3)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x004e }
            goto L_0x004f
        L_0x004e:
            r4 = r0
        L_0x004f:
            if (r4 != 0) goto L_0x0069
            com.moovit.map.MapImplType r2 = com.moovit.map.MapImplType.NUTITEQ
            if (r1 == r2) goto L_0x0069
            java.lang.String r4 = r2.getFactoryClassName()
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x0067 }
            java.lang.Object r4 = r4.newInstance()     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x0067 }
            o20.p r4 = (o20.C18710p) r4     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x0067 }
            r4.mo48825e(r3)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x0067 }
            goto L_0x0069
        L_0x0067:
            goto L_0x006a
        L_0x0069:
            r0 = r4
        L_0x006a:
            if (r0 == 0) goto L_0x0071
        L_0x006c:
            r3.f37324h = r0
            r3.f37325i = r0
            goto L_0x0079
        L_0x0071:
            com.moovit.commons.utils.ApplicationBugException r4 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.String r0 = "Unable to create map view implementation factory"
            r4.<init>((java.lang.String) r0)
            throw r4
        L_0x0079:
            o20.p r4 = r3.f37324h
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.MoovitApplication.mo44559k(android.content.Context):o20.p");
    }

    /* renamed from: l */
    public final C13752e mo44560l() {
        return this.f37322f.mo40679b();
    }

    /* renamed from: m */
    public final void mo44561m() {
        StringBuilder k = C13555b.m33972k("Main Process: ");
        k.append(getApplicationInfo().processName);
        k.append(", My process: ");
        k.append(C20930c.m49022d(this));
        k.append(", isMainProcess=");
        k.append(this.f37319c);
        C16596f.m42113a().mo49363b(k.toString());
        registerActivityLifecycleCallbacks(new C19724c());
        mo44575w((C19728f) null);
        if (this.f37319c) {
            C19733k kVar = new C19733k(this, Thread.getDefaultUncaughtExceptionHandler());
            SharedPreferences sharedPreferences = kVar.f50179b.getSharedPreferences("uncaught_exception_handler", 0);
            C16919g.C16920a aVar = C19733k.f50178c;
            boolean booleanValue = aVar.mo19759a(sharedPreferences).booleanValue();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            aVar.mo19760c(edit, Boolean.FALSE);
            edit.commit();
            this.f37320d = booleanValue;
            Thread.setDefaultUncaughtExceptionHandler(kVar);
            if (this.f37320d) {
                C17474b bVar = new C17474b(AnalyticsEventKey.CRASH);
                C6677a aVar2 = C19731i.m47197a(this).f50173c;
                aVar2.getClass();
                C6677a.m15759j(this, AnalyticsFlowKey.CRASH, true, bVar);
            }
        }
    }

    /* renamed from: m0 */
    public final void mo40695m0(C20431c<?, ?> cVar, IOException iOException, boolean z) {
        if (!z) {
            C16596f.m42113a().mo49364c(iOException);
        }
    }

    /* renamed from: o */
    public void mo44562o(C19047a aVar) {
        C13709c.f33785b.mo49545d(getSharedPreferences("kinesis_constants", 0), Long.valueOf(aVar.f48444c));
    }

    /* renamed from: o0 */
    public final void mo40696o0(C20431c<?, ?> cVar, HttpURLConnection httpURLConnection, BadResponseException badResponseException) {
        cVar.getClass();
    }

    @C1045x(Lifecycle.Event.ON_START)
    public void onApplicationStart() {
        C5367a.m13473a(this).mo21147c(new Intent("com.moovit.app.action.foreground"));
        C6677a aVar = C19731i.m47197a(this).f50173c;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.APP;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.FOREGROUND);
        aVar2.mo49941i(AnalyticsAttributeKey.IS_LOCATION_ENABLED, C20934d0.m49034e(this));
        aVar2.mo49939g(AnalyticsAttributeKey.LOCATION_PERMISSIONS, C0016g.m21d(this));
        aVar2.mo49939g(AnalyticsAttributeKey.LOCATION_PROVIDERS, C0016g.m22e(this));
        C17474b[] bVarArr = {aVar2.mo49933a()};
        aVar.getClass();
        C6677a.m15759j(this, analyticsFlowKey, true, bVarArr);
        Tasks.call(MoovitExecutors.f37327IO, new C18516f.C18519c(false, "app_start"));
    }

    @C1045x(Lifecycle.Event.ON_STOP)
    public void onApplicationStop() {
        Tasks.call(MoovitExecutors.f37327IO, new C18516f.C18519c(true, "app_stop"));
        C5367a.m13473a(this).mo21147c(new Intent("com.moovit.app.action.background"));
        C6677a aVar = C19731i.m47197a(this).f50173c;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.APP;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BACKGROUND);
        aVar2.mo49941i(AnalyticsAttributeKey.IS_LOCATION_ENABLED, C20934d0.m49034e(this));
        aVar2.mo49939g(AnalyticsAttributeKey.LOCATION_PERMISSIONS, C0016g.m21d(this));
        aVar2.mo49939g(AnalyticsAttributeKey.LOCATION_PROVIDERS, C0016g.m22e(this));
        C17474b[] bVarArr = {aVar2.mo49933a()};
        aVar.getClass();
        C6677a.m15759j(this, analyticsFlowKey, true, bVarArr);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C18710p pVar;
        super.onConfigurationChanged(configuration);
        setTheme(0);
        setTheme(C19747y.MoovitTheme);
        if (this.f37319c && (pVar = this.f37324h) != null) {
            pVar.mo48824d();
        }
        if (this.f37319c) {
            C18299a aVar = this.f37321e;
            synchronized (aVar) {
                aVar.f46665d = this;
                HashSet hashSet = new HashSet();
                Iterator it = ((C6307g.C6309b) aVar.f46670i.entrySet()).iterator();
                while (true) {
                    C6307g.C6311d dVar = (C6307g.C6311d) it;
                    if (!dVar.hasNext()) {
                        break;
                    }
                    dVar.next();
                    Map.Entry entry = dVar;
                    String str = (String) entry.getKey();
                    C18305c cVar = (C18305c) aVar.f46667f.getOrDefault(str, null);
                    if (cVar != null) {
                        if (!C20975x0.m49118e(((C18299a.C18303d) entry.getValue()).f46682a, cVar.mo46174a(this, configuration, aVar))) {
                            hashSet.addAll(aVar.mo50691d(str));
                        }
                    }
                }
                if (!hashSet.isEmpty()) {
                    aVar.mo50688a(hashSet);
                }
            }
            this.f37321e.mo50697i("USER_LOCALE_UPDATER", (C18299a.C18300a) null);
        }
        C19217a.f48815b.mo51619a(configuration);
    }

    public final void onCreate() {
        boolean z;
        super.onCreate();
        Context applicationContext = getApplicationContext();
        ProviderInstaller.installIfNeededAsync(applicationContext, new C12760b(applicationContext));
        try {
            Class.forName("android.os.AsyncTask");
        } catch (Throwable unused) {
        }
        f37317k = this;
        String str = getApplicationInfo().processName;
        String d = C20930c.m49022d(this);
        if (d == null || d.equals(str)) {
            z = true;
        } else {
            z = false;
        }
        this.f37319c = z;
        if (z) {
            mo44568p();
        } else {
            mo44569q();
        }
    }

    public final void onLowMemory() {
        C18710p pVar;
        super.onLowMemory();
        if (this.f37319c && (pVar = this.f37324h) != null) {
            pVar.mo48827g();
        }
    }

    /* renamed from: p */
    public void mo44568p() {
        Field declaredField;
        setTheme(C19747y.MoovitTheme);
        try {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(this);
            if (viewConfiguration.hasPermanentMenuKey() && (declaredField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey")) != null) {
                declaredField.setAccessible(true);
                declaredField.setBoolean(viewConfiguration, false);
            }
        } catch (Throwable unused) {
        }
        mo44561m();
        C1047z.f3987j.f3993g.mo4224a(this);
        if (true ^ C20943i.m49051d(21)) {
            try {
                C20955o.f52704a = CookieSyncManager.createInstance(this);
            } catch (Throwable unused2) {
            }
        }
        C13756i iVar = new C13756i(new RequestOptions(), this);
        this.f37322f = iVar;
        iVar.mo40685h(new C13752e(this, (C19722a0) null, (AnalyticsFlowKey) null));
        C18305c.f46685b = new C4436j0(7);
        C18299a aVar = new C18299a((Context) this);
        mo44573u(aVar);
        aVar.mo50704p();
        synchronized (aVar) {
            aVar.f46672k.add(this);
        }
        this.f37321e = aVar;
        this.f37323g = new C19725d(this);
        registerActivityLifecycleCallbacks(this.f37318b);
        MaintenanceManager.m41335a(new C18520g());
        MaintenanceManager.m41335a(new C18515e());
        MaintenanceManager.m41335a(new C18514d());
        MaintenanceManager.m41335a(new C18511a());
        MaintenanceManager.m41335a(new C18512b());
        MaintenanceManager.m41335a(new C18513c());
        MaintenanceManager.m41335a(new C18516f());
        MaintenanceManager.m41335a(new C18521h());
        try {
            HttpResponseCache.install(new File(getCacheDir(), "httpCache"), Math.round(DataUnit.MiB.toBytes(10.0d)));
        } catch (IOException unused3) {
        }
        synchronized (C17269d.class) {
            if (C17269d.f44636e == null) {
                C17269d.f44636e = new C17269d(this);
            }
        }
    }

    /* renamed from: q */
    public void mo44569q() {
        C19107d.m46268i(this);
        mo44561m();
    }

    /* renamed from: r */
    public void mo44570r(C19728f fVar) {
        mo44575w(fVar);
        if (this.f37319c) {
            this.f37321e.mo50697i("METRO_CONTEXT_REVISIONS_CLEANUP", (C18299a.C18300a) null);
            this.f37321e.mo50697i("SEARCH_CUSTOM_POI_FTS", (C18299a.C18300a) null);
        }
    }

    /* renamed from: s */
    public void mo44571s(Intent intent, Activity activity, C18299a aVar) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("onMetroUpdated: activityToStart: ");
        sb.append(intent);
        sb.append(", fromActivity:");
        sb.append(activity);
        sb.append(", updatedAppDataManager: ");
        if (aVar != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C16596f.m42113a().mo49363b(sb.toString());
        C5367a.m13473a(this).mo21147c(new Intent("com.moovit.app.action.update_parts"));
        if (aVar == null || aVar.mo50690c("METRO_CONTEXT") == null) {
            C18299a aVar2 = this.f37321e;
            synchronized (aVar2) {
                aVar2.mo50688a(aVar2.mo50691d("METRO_CONTEXT"));
            }
        } else {
            this.f37321e = aVar;
        }
        this.f37322f.f33873g.evictAll();
        if (intent != null) {
            mo44574v(activity, intent);
        } else if (activity != null) {
            activity.recreate();
        }
    }

    /* renamed from: t */
    public void mo44572t(C19722a0 a0Var) {
        boolean z;
        C16596f a = C16596f.m42113a();
        String str = a0Var.f50160a.f32925a;
        C17590i iVar = a.f43244a.f44855g.f36483d;
        iVar.getClass();
        String a2 = C17579b.m43694a(1024, str);
        synchronized (iVar.f45238f) {
            String reference = iVar.f45238f.getReference();
            if (a2 != null) {
                z = a2.equals(reference);
            } else if (reference == null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                iVar.f45238f.set(a2, true);
                iVar.f45234b.mo49869a(new C17589h(iVar, 0));
            }
        }
        this.f37322f.mo40685h(new C13752e(this, a0Var, (AnalyticsFlowKey) null));
        if (this.f37319c) {
            C13709c.m34225a(this, a0Var);
            C16935f.m42759b(this);
            Context applicationContext = getApplicationContext();
            if (UserContextLoader.m40004l(applicationContext) && !C16935f.m42760c(applicationContext)) {
                FirebaseMessaging.getInstance().getToken().addOnSuccessListener((Executor) MoovitExecutors.SINGLE, new C18587a(applicationContext, 2));
            }
            Task call = Tasks.call(AsyncTask.THREAD_POOL_EXECUTOR, new C20382b(this));
            Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(this).getAppSetIdInfo();
            Tasks.whenAllComplete((Task<?>[]) new Task[]{call, appSetIdInfo}).continueWith(AsyncTask.THREAD_POOL_EXECUTOR, new C20386f(appSetIdInfo, call, this)).addOnSuccessListener(AsyncTask.THREAD_POOL_EXECUTOR, new C20387g(this, a0Var));
            String str2 = GcmTopicManager.f41617b;
            C13272f fVar = a0Var.f50160a;
            GcmTopicManager.m40721a(this, fVar.f32927c, fVar.f32926b);
            C16919g.C16925f fVar2 = C13266a.f32919d;
            SharedPreferences sharedPreferences = getSharedPreferences("app_infos", 0);
            long currentTimeMillis = System.currentTimeMillis();
            long longValue = C13266a.f32919d.mo19759a(sharedPreferences).longValue();
            if (longValue <= 0 || currentTimeMillis - longValue >= C13266a.f32918c) {
                C13266a.m33390e(this);
            }
            new C17290i(this).mo49820a();
        }
    }

    /* renamed from: u */
    public void mo44573u(C18299a aVar) {
        aVar.mo50703o("ENVIRONMENT_VALIDATOR", new C16532a());
        aVar.mo50703o("GOOGLE_PLAY_SERVICES", new C20662e());
        aVar.mo50703o("AB_TESTING_MANAGER", new C19976a());
        aVar.mo50703o("CONFIGURATION", new C19051c());
        aVar.mo50703o("USER_EXTRA_INFO_AVAILABILITY", new C13343a());
        aVar.mo50703o("USER_LOCALE_UPDATER", new C20675n());
        aVar.mo50703o("METRO_CONTEXT", new C4773f());
        aVar.mo50703o("METRO_CONTEXT_REVISIONS_CLEANUP", new C4775g(aVar.f46663b));
        aVar.mo50703o("REMOTE_IMAGES", new C20665h());
        aVar.mo50703o("SUPPORTED_METROS", new C20672l());
        aVar.mo50703o("SUPPORTED_METRO_LANGUAGES", new C1774d());
        aVar.mo50703o("SEARCH_LINE_DATA", new C20667i());
        aVar.mo50703o("SEARCH_LINE_FTS", new C20670j());
        aVar.mo50703o("SEARCH_STOP_FTS", new C20671k());
        aVar.mo50703o("TRIP_PLANNER_CONFIGURATION", new C7864a());
        aVar.mo50703o("TWITTER_SERVICE_ALERTS_FEEDS", new C20674m());
        aVar.mo50703o("RECENT_SEARCH_LOCATIONS_STORE", new C12637c());
        aVar.mo50703o("SEARCH_CUSTOM_POI_DATA", new C20658b());
        aVar.mo50703o("SEARCH_CUSTOM_POI_FTS", new C20661d());
        aVar.mo50703o("METRO_POPULAR_LOCATIONS_CONFIGURATION", new C7514b());
        aVar.mo50703o("GTFS_CONFIGURATION", new C6069c());
        aVar.mo50703o("GTFS_STATIC_DATA_DOWNLOADER", new C6080k());
        aVar.mo50703o("GTFS_DYNAMIC_DATA_DOWNLOADER", new C6070d());
        aVar.mo50703o("GTFS_REMOTE_IMAGES_PARSER_LOADER", new C6075h());
        aVar.mo50703o("GTFS_METRO_INFO_PARSER_LOADER", new C6073g());
        aVar.mo50703o("GTFS_LINE_GROUPS_PARSER_LOADER", new C6083m());
        aVar.mo50703o("GTFS_STOPS_PARSER_LOADER", new C6088o());
        aVar.mo50703o("GTFS_PATTERNS_PARSER_LOADER", new C6085n());
        aVar.mo50703o("GTFS_BICYCLE_STOPS_PARSER_LOADER", new C6067b());
        aVar.mo50703o("GTFS_SHAPES_PARSER_LOADER", new C6078j());
        aVar.mo50703o("GTFS_SHAPE_SEGMENTS_PARSER_LOADER", new C6076i());
        aVar.mo50703o("GTFS_FREQUENCIES_PARSER_LOADER", new C6081l());
        aVar.mo50703o("GTFS_METRO_ENTITIES_LOADER", new C6072f());
        aVar.mo50703o("GTFS_TRIPS_SCHEDULE_LOADER", new C6090p());
    }

    /* renamed from: v */
    public final void mo44574v(Activity activity, Intent intent) {
        C20927a0.m49015j(intent);
        intent.addFlags(268468224);
        startActivity(intent);
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055 A[Catch:{ Exception -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d A[Catch:{ Exception -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44575w(p824tp.C19728f r6) {
        /*
            r5 = this;
            de.f r0 = p435de.C16596f.m42113a()     // Catch:{ Exception -> 0x007d }
            java.lang.String r1 = "android_id"
            java.lang.String r2 = p977zz.C20975x0.m49119f(r5)     // Catch:{ Exception -> 0x007d }
            he.t r3 = r0.f43244a     // Catch:{ Exception -> 0x007d }
            r3.mo49885c(r1, r2)     // Catch:{ Exception -> 0x007d }
            java.lang.String r1 = "flavor_type"
            java.lang.String r2 = "world"
            he.t r3 = r0.f43244a     // Catch:{ Exception -> 0x007d }
            r3.mo49885c(r1, r2)     // Catch:{ Exception -> 0x007d }
            java.lang.String r1 = p977zz.C20930c.m49022d(r5)     // Catch:{ Exception -> 0x007d }
            java.lang.String r2 = "process_type"
            java.lang.String r3 = "unknown"
            if (r1 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = r3
        L_0x0024:
            he.t r4 = r0.f43244a     // Catch:{ Exception -> 0x007d }
            r4.mo49885c(r2, r1)     // Catch:{ Exception -> 0x007d }
            java.lang.String r1 = "com.google.android.gms"
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0039 }
            r4 = 0
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r1, r4)     // Catch:{ NameNotFoundException -> 0x0039 }
            if (r1 == 0) goto L_0x0039
            java.lang.String r1 = r1.versionName     // Catch:{ NameNotFoundException -> 0x0039 }
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            java.lang.String r2 = "google_play_services_version"
            if (r1 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r1 = r3
        L_0x0040:
            he.t r4 = r0.f43244a     // Catch:{ Exception -> 0x007d }
            r4.mo49885c(r2, r1)     // Catch:{ Exception -> 0x007d }
            java.lang.String r1 = r5.getPackageName()     // Catch:{ Exception -> 0x007d }
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch:{ Exception -> 0x007d }
            java.lang.String r1 = r2.getInstallerPackageName(r1)     // Catch:{ Exception -> 0x007d }
            java.lang.String r2 = "installer_package_name"
            if (r1 == 0) goto L_0x0056
            r3 = r1
        L_0x0056:
            he.t r1 = r0.f43244a     // Catch:{ Exception -> 0x007d }
            r1.mo49885c(r2, r3)     // Catch:{ Exception -> 0x007d }
            if (r6 == 0) goto L_0x007d
            java.lang.String r1 = "metro_id"
            g30.h r2 = r6.f50165a     // Catch:{ Exception -> 0x007d }
            com.moovit.network.model.ServerId r2 = r2.f16126a     // Catch:{ Exception -> 0x007d }
            int r2 = r2.f15142b     // Catch:{ Exception -> 0x007d }
            he.t r3 = r0.f43244a     // Catch:{ Exception -> 0x007d }
            java.lang.String r2 = java.lang.Integer.toString(r2)     // Catch:{ Exception -> 0x007d }
            r3.mo49885c(r1, r2)     // Catch:{ Exception -> 0x007d }
            java.lang.String r1 = "metro_revision"
            g30.h r6 = r6.f50165a     // Catch:{ Exception -> 0x007d }
            long r2 = r6.f16127b     // Catch:{ Exception -> 0x007d }
            he.t r6 = r0.f43244a     // Catch:{ Exception -> 0x007d }
            java.lang.String r0 = java.lang.Long.toString(r2)     // Catch:{ Exception -> 0x007d }
            r6.mo49885c(r1, r0)     // Catch:{ Exception -> 0x007d }
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.MoovitApplication.mo44575w(tp.f):void");
    }
}
