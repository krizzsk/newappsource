package nd0;

import android.content.Context;
import android.text.TextUtils;
import ce0.C21120u;
import com.google.gson.Gson;
import com.vungle.warren.Vungle;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.VungleLogger;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p988j$.util.concurrent.ConcurrentHashMap;
import td0.C24927a;
import td0.C24933d;

/* renamed from: nd0.e */
public final class C24486e {

    /* renamed from: o */
    public static String f61973o = "com.vungle";

    /* renamed from: a */
    public final C24491g f61974a;

    /* renamed from: b */
    public final C24494i f61975b;

    /* renamed from: c */
    public final Executor f61976c;

    /* renamed from: d */
    public final C24933d f61977d;

    /* renamed from: e */
    public C24484c f61978e;

    /* renamed from: f */
    public final AtomicBoolean f61979f;

    /* renamed from: g */
    public final AtomicBoolean f61980g;

    /* renamed from: h */
    public String f61981h = f61973o;

    /* renamed from: i */
    public AtomicInteger f61982i;

    /* renamed from: j */
    public boolean f61983j;

    /* renamed from: k */
    public final String f61984k;

    /* renamed from: l */
    public final ConcurrentHashMap f61985l;

    /* renamed from: m */
    public Gson f61986m;

    /* renamed from: n */
    public C24488b f61987n;

    /* renamed from: nd0.e$a */
    public class C24487a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f61988b;

        /* renamed from: c */
        public final /* synthetic */ VungleLogger.LoggerLevel f61989c;

        /* renamed from: d */
        public final /* synthetic */ String f61990d;

        /* renamed from: e */
        public final /* synthetic */ String f61991e;

        /* renamed from: f */
        public final /* synthetic */ String f61992f;

        /* renamed from: g */
        public final /* synthetic */ String f61993g;

        public C24487a(String str, VungleLogger.LoggerLevel loggerLevel, String str2, String str3, String str4, String str5) {
            this.f61988b = str;
            this.f61989c = loggerLevel;
            this.f61990d = str2;
            this.f61991e = str3;
            this.f61992f = str4;
            this.f61993g = str5;
        }

        public final void run() {
            String str;
            if (C24486e.this.f61979f.get()) {
                C24491g gVar = C24486e.this.f61974a;
                String str2 = this.f61988b;
                String loggerLevel = this.f61989c.toString();
                String str3 = this.f61990d;
                String str4 = this.f61991e;
                C24486e eVar = C24486e.this;
                String str5 = eVar.f61984k;
                if (eVar.f61985l.isEmpty()) {
                    str = null;
                } else {
                    str = eVar.f61986m.toJson((Object) eVar.f61985l);
                }
                String str6 = this.f61992f;
                String str7 = this.f61993g;
                gVar.getClass();
                String id = TimeZone.getDefault().getID();
                C24485d dVar = new C24485d(str2, loggerLevel, str3, str4, str5, id, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(new Date(System.currentTimeMillis())), str, str6, str7);
                File file = gVar.f61999e;
                String b = dVar.mo60736b();
                C24490f fVar = new C24490f(gVar);
                if (file == null || !file.exists()) {
                    file = gVar.mo60741f();
                    gVar.f61999e = file;
                    if (file == null || !file.exists()) {
                        return;
                    }
                }
                C24480a.m61580a(file, b, fVar);
            }
        }
    }

    /* renamed from: nd0.e$b */
    public class C24488b implements C24489c {
        public C24488b() {
        }
    }

    /* renamed from: nd0.e$c */
    public interface C24489c {
    }

    public C24486e(Context context, C24927a aVar, VungleApiClient vungleApiClient, C21120u uVar, C24933d dVar) {
        C24491g gVar = new C24491g(aVar.mo61483c());
        C24494i iVar = new C24494i(vungleApiClient, dVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f61979f = atomicBoolean;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        this.f61980g = atomicBoolean2;
        int i = 5;
        this.f61982i = new AtomicInteger(5);
        this.f61983j = false;
        this.f61985l = new ConcurrentHashMap();
        this.f61986m = new Gson();
        this.f61987n = new C24488b();
        this.f61984k = context.getPackageName();
        this.f61975b = iVar;
        this.f61974a = gVar;
        this.f61976c = uVar;
        this.f61977d = dVar;
        gVar.f61998d = this.f61987n;
        Package packageR = Vungle.class.getPackage();
        if (packageR != null) {
            f61973o = packageR.getName();
        }
        atomicBoolean.set(dVar.mo61493b("logging_enabled"));
        atomicBoolean2.set(dVar.mo61493b("crash_report_enabled"));
        this.f61981h = dVar.mo61494c("crash_collect_filter", f61973o);
        AtomicInteger atomicInteger = this.f61982i;
        Object obj = dVar.f63019c.get("crash_batch_max");
        atomicInteger.set(obj instanceof Integer ? ((Integer) obj).intValue() : i);
        mo60737a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo60737a() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f61983j     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0025
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f61980g     // Catch:{ all -> 0x0027 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x000f
            monitor-exit(r2)
            return
        L_0x000f:
            nd0.c r0 = r2.f61978e     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x001c
            nd0.c r0 = new nd0.c     // Catch:{ all -> 0x0027 }
            nd0.e$b r1 = r2.f61987n     // Catch:{ all -> 0x0027 }
            r0.<init>(r1)     // Catch:{ all -> 0x0027 }
            r2.f61978e = r0     // Catch:{ all -> 0x0027 }
        L_0x001c:
            nd0.c r0 = r2.f61978e     // Catch:{ all -> 0x0027 }
            java.lang.String r1 = r2.f61981h     // Catch:{ all -> 0x0027 }
            r0.f61961c = r1     // Catch:{ all -> 0x0027 }
            r0 = 1
            r2.f61983j = r0     // Catch:{ all -> 0x0027 }
        L_0x0025:
            monitor-exit(r2)
            return
        L_0x0027:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nd0.C24486e.mo60737a():void");
    }

    /* renamed from: b */
    public final void mo60738b(VungleLogger.LoggerLevel loggerLevel, String str, String str2, String str3, String str4) {
        String str5;
        String str6 = VungleApiClient.f58560C;
        if (loggerLevel != VungleLogger.LoggerLevel.CRASH || !this.f61980g.get()) {
            this.f61976c.execute(new C24487a(str2, loggerLevel, str, str6, str3, str4));
            return;
        }
        synchronized (this) {
            C24491g gVar = this.f61974a;
            String loggerLevel2 = loggerLevel.toString();
            String str7 = this.f61984k;
            if (this.f61985l.isEmpty()) {
                str5 = null;
            } else {
                str5 = this.f61986m.toJson((Object) this.f61985l);
            }
            gVar.mo60742g(str2, loggerLevel2, str, str6, str7, str5, str3, str4);
        }
    }

    /* renamed from: c */
    public final synchronized void mo60739c(String str, int i, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (this.f61980g.get() != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (TextUtils.isEmpty(str) || str.equals(this.f61981h)) {
            z3 = false;
        } else {
            z3 = true;
        }
        int max = Math.max(i, 0);
        if (this.f61982i.get() == max) {
            z4 = false;
        }
        if (z2 || z3 || z4) {
            if (z2) {
                this.f61980g.set(z);
                this.f61977d.mo61498g("crash_report_enabled", z);
            }
            if (z3) {
                if ("*".equals(str)) {
                    this.f61981h = "";
                } else {
                    this.f61981h = str;
                }
                this.f61977d.mo61496e("crash_collect_filter", this.f61981h);
            }
            if (z4) {
                this.f61982i.set(max);
                this.f61977d.mo61495d(max, "crash_batch_max");
            }
            this.f61977d.mo61492a();
            C24484c cVar = this.f61978e;
            if (cVar != null) {
                cVar.f61961c = this.f61981h;
            }
            if (z) {
                mo60737a();
            }
        }
    }
}
