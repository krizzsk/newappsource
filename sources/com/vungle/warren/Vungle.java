package com.vungle.warren;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.Keep;
import be0.C21033n;
import ce0.C21087a;
import ce0.C21095c;
import ce0.C21103h;
import ce0.C21119t;
import com.appsflyer.AdvertisingIdUtil;
import com.appsflyer.ServerParameters;
import com.google.android.gms.appset.AppSet;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import com.usebutton.sdk.context.Identifiers;
import com.usebutton.sdk.internal.GroupedInventoryCardActivity;
import com.vungle.warren.AdConfig;
import com.vungle.warren.C23097c;
import com.vungle.warren.C23181n1;
import com.vungle.warren.C23248w1;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.downloader.C23127h;
import com.vungle.warren.downloader.Downloader;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.admarkup.AdMarkup;
import com.vungle.warren.p979ui.PresenterAdOpenCallback;
import com.vungle.warren.p979ui.VungleActivity;
import com.vungle.warren.persistence.C23192a;
import com.vungle.warren.persistence.C23211d;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import de0.C23265c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mf0.C24361g;
import nd0.C24486e;
import od0.C24545c;
import od0.C24559j;
import od0.C24566m;
import od0.C24573q;
import p130j2.C5367a;
import p359ag.C13452i;
import p389bl.C13641g;
import p988j$.util.concurrent.ConcurrentHashMap;
import qd0.C24726b;
import qd0.C24732e;
import td0.C24927a;
import td0.C24933d;
import td0.C24935e;
import td0.C24938h;
import td0.C24939i;
import ud0.C25017a;
import ud0.C25024h;
import xd0.C25247e;

@Keep
public class Vungle {
    private static final int DEFAULT_SESSION_TIMEOUT = 900;
    /* access modifiers changed from: private */
    public static final String TAG = Vungle.class.getCanonicalName();
    public static final Vungle _instance = new Vungle();
    /* access modifiers changed from: private */
    public static C24927a.C24930c cacheListener = new C23077j();
    private static Gson gson = new GsonBuilder().create();
    /* access modifiers changed from: private */
    public static AtomicBoolean isDepInit = new AtomicBoolean(false);
    private static volatile boolean isInitialized;
    /* access modifiers changed from: private */
    public static AtomicBoolean isInitializing = new AtomicBoolean(false);
    public volatile String appID;
    /* access modifiers changed from: private */
    public final AtomicReference<Consent> ccpaStatus = new AtomicReference<>();
    /* access modifiers changed from: private */
    public final AtomicReference<Consent> consent = new AtomicReference<>();
    /* access modifiers changed from: private */
    public volatile String consentVersion;
    /* access modifiers changed from: private */
    public Context context;
    /* access modifiers changed from: private */
    public AtomicInteger hbpOrdinalViewCount = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public Map<String, Boolean> playOperations = new ConcurrentHashMap();

    @Keep
    public enum Consent {
        OPTED_IN,
        OPTED_OUT
    }

    /* renamed from: com.vungle.warren.Vungle$a */
    public class C23066a implements Callable<Boolean> {

        /* renamed from: b */
        public final /* synthetic */ Context f58513b;

        /* renamed from: c */
        public final /* synthetic */ String f58514c;

        /* renamed from: d */
        public final /* synthetic */ String f58515d;

        public C23066a(Context context, String str, String str2) {
            this.f58513b = context;
            this.f58514c = str;
            this.f58515d = str2;
        }

        public final Object call() throws Exception {
            String str;
            if (!Vungle.isInitialized()) {
                String unused = Vungle.TAG;
                return Boolean.FALSE;
            }
            C23192a aVar = (C23192a) C23236v0.m57280a(this.f58513b).mo58350c(C23192a.class);
            AdMarkup a = C21095c.m49293a(this.f58514c);
            if (a != null) {
                str = a.mo58243a();
            } else {
                str = null;
            }
            C24566m mVar = (C24566m) aVar.mo58281p(C24566m.class, this.f58515d).get();
            if (mVar == null || !mVar.f62264h) {
                return Boolean.FALSE;
            }
            if (mVar.mo60833c() && str == null) {
                return Boolean.FALSE;
            }
            C24545c cVar = aVar.mo58277l(this.f58515d, str).get();
            if (cVar == null) {
                return Boolean.FALSE;
            }
            if (mVar.f62265i == 1 || (!AdConfig.AdSize.isDefaultAdSize(mVar.mo60831a()) && !mVar.mo60831a().equals(cVar.f62224w.mo58261a()))) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(Vungle.canPlayAd(cVar));
        }
    }

    /* renamed from: com.vungle.warren.Vungle$b */
    public class C23067b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f58516b;

        /* renamed from: c */
        public final /* synthetic */ C23135f0 f58517c;

        public C23067b(String str, C23138g0 g0Var) {
            this.f58516b = str;
            this.f58517c = g0Var;
        }

        public final void run() {
            Vungle.onPlayError(this.f58516b, this.f58517c, new VungleException(39));
        }
    }

    /* renamed from: com.vungle.warren.Vungle$c */
    public class C23068c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f58518b;

        /* renamed from: c */
        public final /* synthetic */ String f58519c;

        /* renamed from: d */
        public final /* synthetic */ C23097c f58520d;

        /* renamed from: e */
        public final /* synthetic */ C23135f0 f58521e;

        /* renamed from: f */
        public final /* synthetic */ C23192a f58522f;

        /* renamed from: g */
        public final /* synthetic */ AdConfig f58523g;

        /* renamed from: h */
        public final /* synthetic */ VungleApiClient f58524h;

        /* renamed from: i */
        public final /* synthetic */ C21103h f58525i;

        /* renamed from: j */
        public final /* synthetic */ Runnable f58526j;

        /* renamed from: com.vungle.warren.Vungle$c$a */
        public class C23069a implements C24726b<C13452i> {

            /* renamed from: a */
            public final /* synthetic */ boolean f58527a;

            /* renamed from: b */
            public final /* synthetic */ AdRequest f58528b;

            /* renamed from: c */
            public final /* synthetic */ C24566m f58529c;

            /* renamed from: d */
            public final /* synthetic */ C24545c f58530d;

            public C23069a(boolean z, AdRequest adRequest, C24566m mVar, C24545c cVar) {
                this.f58527a = z;
                this.f58528b = adRequest;
                this.f58529c = mVar;
                this.f58530d = cVar;
            }

            /* renamed from: a */
            public final void mo58057a(C24732e eVar) {
                C23068c.this.f58525i.mo53305j().mo53324a(new C23189p1(this, eVar), C23068c.this.f58526j);
            }

            public final void onFailure(Throwable th) {
                C23068c.this.f58525i.mo53305j().mo53324a(new C23216q1(this), C23068c.this.f58526j);
            }
        }

        public C23068c(String str, String str2, C23097c cVar, C23138g0 g0Var, C23192a aVar, AdConfig adConfig, VungleApiClient vungleApiClient, C21103h hVar, C23067b bVar) {
            this.f58518b = str;
            this.f58519c = str2;
            this.f58520d = cVar;
            this.f58521e = g0Var;
            this.f58522f = aVar;
            this.f58523g = adConfig;
            this.f58524h = vungleApiClient;
            this.f58525i = hVar;
            this.f58526j = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:45:0x0132  */
        /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r13 = this;
                java.lang.String r0 = r13.f58518b
                com.vungle.warren.model.admarkup.AdMarkup r0 = ce0.C21095c.m49293a(r0)
                com.vungle.warren.AdRequest r4 = new com.vungle.warren.AdRequest
                java.lang.String r1 = r13.f58519c
                r2 = 0
                r4.<init>(r1, r0, r2)
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                com.vungle.warren.Vungle r1 = com.vungle.warren.Vungle._instance
                java.util.Map r3 = r1.playOperations
                java.lang.String r5 = r13.f58519c
                java.lang.Object r3 = r3.get(r5)
                boolean r0 = r0.equals(r3)
                if (r0 != 0) goto L_0x01df
                com.vungle.warren.c r0 = r13.f58520d
                j$.util.concurrent.ConcurrentHashMap r0 = r0.f58615a
                java.lang.Object r0 = r0.get(r4)
                com.vungle.warren.c$g r0 = (com.vungle.warren.C23097c.C23105g) r0
                r3 = 1
                if (r0 == 0) goto L_0x0039
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f58651i
                boolean r0 = r0.get()
                if (r0 == 0) goto L_0x0039
                r0 = 1
                goto L_0x003a
            L_0x0039:
                r0 = 0
            L_0x003a:
                if (r0 == 0) goto L_0x003e
                goto L_0x01df
            L_0x003e:
                com.vungle.warren.persistence.a r0 = r13.f58522f
                java.lang.String r5 = r13.f58519c
                java.lang.Class<od0.m> r6 = od0.C24566m.class
                td0.e r0 = r0.mo58281p(r6, r5)
                java.lang.Object r0 = r0.get()
                od0.m r0 = (od0.C24566m) r0
                if (r0 != 0) goto L_0x005f
                java.lang.String r0 = r13.f58519c
                com.vungle.warren.f0 r1 = r13.f58521e
                com.vungle.warren.error.VungleException r2 = new com.vungle.warren.error.VungleException
                r3 = 13
                r2.<init>((int) r3)
                com.vungle.warren.Vungle.onPlayError(r0, r1, r2)
                return
            L_0x005f:
                com.vungle.warren.AdConfig$AdSize r5 = r0.mo60831a()
                boolean r5 = com.vungle.warren.AdConfig.AdSize.isBannerAdSize(r5)
                if (r5 == 0) goto L_0x007b
                java.lang.String unused = com.vungle.warren.Vungle.TAG
                java.lang.String r0 = r13.f58519c
                com.vungle.warren.f0 r1 = r13.f58521e
                com.vungle.warren.error.VungleException r2 = new com.vungle.warren.error.VungleException
                r3 = 28
                r2.<init>((int) r3)
                com.vungle.warren.Vungle.onPlayError(r0, r1, r2)
                return
            L_0x007b:
                com.vungle.warren.persistence.a r5 = r13.f58522f
                java.lang.String r6 = r13.f58519c
                java.lang.String r7 = r4.mo58037c()
                r5.getClass()
                td0.e r8 = new td0.e
                ce0.u r9 = r5.f58875b
                td0.q r10 = new td0.q
                r10.<init>(r5, r7, r6)
                java.util.concurrent.Future r5 = r9.submit(r10)
                r8.<init>(r5)
                java.lang.Object r5 = r8.get()
                r11 = r5
                od0.c r11 = (od0.C24545c) r11
                long r5 = java.lang.System.currentTimeMillis()     // Catch:{ DBException -> 0x01d0 }
                r7 = 1000(0x3e8, double:4.94E-321)
                long r5 = r5 / r7
                if (r11 == 0) goto L_0x00b0
                long r9 = r11.f62207f     // Catch:{ DBException -> 0x01d0 }
                long r9 = r9 * r7
                int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r7 >= 0) goto L_0x00b0
                r12 = 1
                goto L_0x00b1
            L_0x00b0:
                r12 = 0
            L_0x00b1:
                boolean r5 = com.vungle.warren.Vungle.canPlayAd((od0.C24545c) r11)     // Catch:{ DBException -> 0x01d0 }
                if (r5 == 0) goto L_0x00d2
                if (r12 == 0) goto L_0x00ba
                goto L_0x00d2
            L_0x00ba:
                com.vungle.warren.AdConfig r5 = r13.f58523g     // Catch:{ DBException -> 0x01d0 }
                if (r5 != 0) goto L_0x00c9
                r11.getClass()     // Catch:{ DBException -> 0x01d0 }
                com.vungle.warren.AdConfig r5 = new com.vungle.warren.AdConfig     // Catch:{ DBException -> 0x01d0 }
                r5.<init>()     // Catch:{ DBException -> 0x01d0 }
                r11.f62224w = r5     // Catch:{ DBException -> 0x01d0 }
                goto L_0x00cb
            L_0x00c9:
                r11.f62224w = r5     // Catch:{ DBException -> 0x01d0 }
            L_0x00cb:
                com.vungle.warren.persistence.a r5 = r13.f58522f     // Catch:{ DBException -> 0x01d0 }
                r5.mo58288w(r11)     // Catch:{ DBException -> 0x01d0 }
                r5 = 0
                goto L_0x012c
            L_0x00d2:
                if (r11 == 0) goto L_0x00ef
                int r5 = r11.f62192N     // Catch:{ DBException -> 0x01d0 }
                if (r5 == r3) goto L_0x00da
                if (r12 == 0) goto L_0x00ef
            L_0x00da:
                com.vungle.warren.persistence.a r5 = r13.f58522f     // Catch:{ DBException -> 0x01d0 }
                java.lang.String r6 = r13.f58519c     // Catch:{ DBException -> 0x01d0 }
                r7 = 4
                r5.mo58290y(r11, r6, r7)     // Catch:{ DBException -> 0x01d0 }
                com.vungle.warren.c r5 = r13.f58520d     // Catch:{ DBException -> 0x01d0 }
                com.vungle.warren.AdConfig$AdSize r7 = r0.mo60831a()     // Catch:{ DBException -> 0x01d0 }
                r8 = 0
                r10 = 0
                r6 = r0
                r5.mo58106m(r6, r7, r8, r10)     // Catch:{ DBException -> 0x01d0 }
            L_0x00ef:
                if (r12 == 0) goto L_0x012b
                com.vungle.warren.n1 r0 = com.vungle.warren.C23181n1.m57208b()     // Catch:{ DBException -> 0x01d0 }
                ag.i r1 = new ag.i     // Catch:{ DBException -> 0x01d0 }
                r1.<init>()     // Catch:{ DBException -> 0x01d0 }
                com.vungle.warren.session.SessionEvent r2 = com.vungle.warren.session.SessionEvent.AD_EXPIRED     // Catch:{ DBException -> 0x01d0 }
                java.lang.String r3 = r2.toString()     // Catch:{ DBException -> 0x01d0 }
                java.lang.String r5 = "event"
                r1.mo40349F(r5, r3)     // Catch:{ DBException -> 0x01d0 }
                com.vungle.warren.session.SessionAttribute r3 = com.vungle.warren.session.SessionAttribute.EVENT_ID     // Catch:{ DBException -> 0x01d0 }
                java.lang.String r5 = r11.getId()     // Catch:{ DBException -> 0x01d0 }
                java.lang.String r3 = r3.toString()     // Catch:{ DBException -> 0x01d0 }
                r1.mo40349F(r3, r5)     // Catch:{ DBException -> 0x01d0 }
                od0.q r3 = new od0.q     // Catch:{ DBException -> 0x01d0 }
                r3.<init>((com.vungle.warren.session.SessionEvent) r2, (p359ag.C13452i) r1)     // Catch:{ DBException -> 0x01d0 }
                r0.mo58250d(r3)     // Catch:{ DBException -> 0x01d0 }
                java.lang.String r0 = r4.mo58041f()     // Catch:{ DBException -> 0x01d0 }
                com.vungle.warren.f0 r1 = r13.f58521e     // Catch:{ DBException -> 0x01d0 }
                com.vungle.warren.error.VungleException r2 = new com.vungle.warren.error.VungleException     // Catch:{ DBException -> 0x01d0 }
                r3 = 37
                r2.<init>((int) r3)     // Catch:{ DBException -> 0x01d0 }
                com.vungle.warren.Vungle.onPlayError(r0, r1, r2)     // Catch:{ DBException -> 0x01d0 }
                return
            L_0x012b:
                r5 = 1
            L_0x012c:
                android.content.Context r1 = r1.context
                if (r1 == 0) goto L_0x01cf
                com.vungle.warren.VungleApiClient r1 = r13.f58524h
                boolean r6 = r1.f58577n
                if (r6 == 0) goto L_0x0142
                java.lang.String r1 = r1.f58570g
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L_0x0142
                r1 = 1
                goto L_0x0143
            L_0x0142:
                r1 = 0
            L_0x0143:
                if (r1 == 0) goto L_0x01bb
                com.vungle.warren.VungleApiClient r1 = r13.f58524h
                java.lang.String r3 = r0.f62257a
                boolean r6 = r0.mo60832b()
                if (r5 == 0) goto L_0x0152
                java.lang.String r7 = ""
                goto L_0x0154
            L_0x0152:
                java.lang.String r7 = r11.f62226y
            L_0x0154:
                r1.getClass()
                ag.i r8 = new ag.i
                r8.<init>()
                ag.i r2 = r1.mo58076d(r2)
                java.lang.String r9 = "device"
                r8.mo40346C(r2, r9)
                ag.i r2 = r1.f58576m
                java.lang.String r9 = "app"
                r8.mo40346C(r2, r9)
                ag.i r2 = r1.mo58079h()
                java.lang.String r9 = "user"
                r8.mo40346C(r2, r9)
                ag.i r2 = new ag.i
                r2.<init>()
                ag.i r9 = new ag.i
                r9.<init>()
                java.lang.String r10 = "reference_id"
                r9.mo40349F(r10, r3)
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
                java.lang.String r6 = "is_auto_cached"
                r9.mo40347D(r6, r3)
                java.lang.String r3 = "placement"
                r2.mo40346C(r9, r3)
                java.lang.String r3 = "ad_token"
                r2.mo40349F(r3, r7)
                java.lang.String r3 = "request"
                r8.mo40346C(r2, r3)
                qd0.f r2 = r1.f58580q
                java.lang.String r3 = com.vungle.warren.VungleApiClient.f58560C
                java.lang.String r1 = r1.f58570g
                qd0.d r7 = r2.mo61220b(r3, r1, r8)
                com.vungle.warren.Vungle$c$a r8 = new com.vungle.warren.Vungle$c$a
                r1 = r8
                r2 = r13
                r3 = r5
                r5 = r0
                r6 = r11
                r1.<init>(r3, r4, r5, r6)
                hi0.e r0 = r7.f62595b
                qd0.c r1 = new qd0.c
                r1.<init>(r7, r8)
                com.google.firebase.perf.network.FirebasePerfOkHttpClient.enqueue(r0, r1)
                goto L_0x01cf
            L_0x01bb:
                if (r5 == 0) goto L_0x01ca
                java.lang.String r0 = r13.f58519c
                com.vungle.warren.f0 r1 = r13.f58521e
                com.vungle.warren.error.VungleException r2 = new com.vungle.warren.error.VungleException
                r2.<init>((int) r3)
                com.vungle.warren.Vungle.onPlayError(r0, r1, r2)
                goto L_0x01cf
            L_0x01ca:
                com.vungle.warren.f0 r1 = r13.f58521e
                com.vungle.warren.Vungle.renderAd(r4, r1, r0, r11)
            L_0x01cf:
                return
            L_0x01d0:
                java.lang.String r0 = r13.f58519c
                com.vungle.warren.f0 r1 = r13.f58521e
                com.vungle.warren.error.VungleException r2 = new com.vungle.warren.error.VungleException
                r3 = 26
                r2.<init>((int) r3)
                com.vungle.warren.Vungle.onPlayError(r0, r1, r2)
                return
            L_0x01df:
                java.lang.String r0 = r13.f58519c
                com.vungle.warren.f0 r1 = r13.f58521e
                com.vungle.warren.error.VungleException r2 = new com.vungle.warren.error.VungleException
                r3 = 8
                r2.<init>((int) r3)
                com.vungle.warren.Vungle.onPlayError(r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.Vungle.C23068c.run():void");
        }
    }

    /* renamed from: com.vungle.warren.Vungle$d */
    public class C23070d extends C23094b {
        public C23070d(AdRequest adRequest, Map map, C23135f0 f0Var, C23192a aVar, C23097c cVar, C25024h hVar, C23186o1 o1Var, C24566m mVar, C24545c cVar2) {
            super(adRequest, map, f0Var, aVar, cVar, hVar, o1Var, mVar, cVar2);
        }

        /* renamed from: c */
        public final void mo58059c() {
            super.mo58059c();
            AdActivity.f58486k = null;
        }
    }

    /* renamed from: com.vungle.warren.Vungle$e */
    public class C23071e implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C23236v0 f58532b;

        public C23071e(C23236v0 v0Var) {
            this.f58532b = v0Var;
        }

        public final void run() {
            ((Downloader) this.f58532b.mo58350c(Downloader.class)).mo58148c();
            ((C23097c) this.f58532b.mo58350c(C23097c.class)).mo58097b();
            C23192a aVar = (C23192a) this.f58532b.mo58350c(C23192a.class);
            DatabaseHelper databaseHelper = aVar.f58874a;
            synchronized (databaseHelper) {
                ((C23192a.C23208o) databaseHelper.f58872b).mo58305b(databaseHelper.mo58264e());
                databaseHelper.close();
                databaseHelper.onCreate(databaseHelper.mo58264e());
            }
            aVar.f58877d.mo61488a();
            Vungle vungle = Vungle._instance;
            vungle.playOperations.clear();
            vungle.ccpaStatus.set((Object) null);
            vungle.configure(((C23171k0) this.f58532b.mo58350c(C23171k0.class)).f58820b.get(), true);
        }
    }

    /* renamed from: com.vungle.warren.Vungle$f */
    public class C23072f implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C23236v0 f58533b;

        /* renamed from: com.vungle.warren.Vungle$f$a */
        public class C23073a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ C23192a f58534b;

            public C23073a(C23192a aVar) {
                this.f58534b = aVar;
            }

            public final void run() {
                List<C24545c> list = this.f58534b.mo58282q(C24545c.class).get();
                if (list != null) {
                    for (C24545c id : list) {
                        try {
                            this.f58534b.mo58272g(id.getId());
                        } catch (DatabaseHelper.DBException unused) {
                        }
                    }
                }
            }
        }

        public C23072f(C23236v0 v0Var) {
            this.f58533b = v0Var;
        }

        public final void run() {
            ((Downloader) this.f58533b.mo58350c(Downloader.class)).mo58148c();
            ((C23097c) this.f58533b.mo58350c(C23097c.class)).mo58097b();
            ((C21103h) this.f58533b.mo58350c(C21103h.class)).mo53305j().execute(new C23073a((C23192a) this.f58533b.mo58350c(C23192a.class)));
        }
    }

    /* renamed from: com.vungle.warren.Vungle$g */
    public class C23074g implements C23192a.C23206m<C24559j> {

        /* renamed from: a */
        public final /* synthetic */ Consent f58535a;

        /* renamed from: b */
        public final /* synthetic */ String f58536b;

        /* renamed from: c */
        public final /* synthetic */ C23192a f58537c;

        public C23074g(C23192a aVar, Consent consent, String str) {
            this.f58535a = consent;
            this.f58536b = str;
            this.f58537c = aVar;
        }

        /* renamed from: a */
        public final void mo58063a(Object obj) {
            String str;
            C24559j jVar = (C24559j) obj;
            if (jVar == null) {
                jVar = new C24559j("consentIsImportantToVungle");
            }
            if (this.f58535a == Consent.OPTED_IN) {
                str = "opted_in";
            } else {
                str = "opted_out";
            }
            jVar.mo60827d(str, "consent_status");
            jVar.mo60827d(Long.valueOf(System.currentTimeMillis() / 1000), "timestamp");
            jVar.mo60827d("publisher", "consent_source");
            String str2 = this.f58536b;
            if (str2 == null) {
                str2 = "";
            }
            jVar.mo60827d(str2, "consent_message_version");
            this.f58537c.mo58289x(jVar, (C23192a.C23207n) null, false);
        }
    }

    /* renamed from: com.vungle.warren.Vungle$h */
    public class C23075h implements C23192a.C23206m<C24559j> {

        /* renamed from: a */
        public final /* synthetic */ Consent f58538a;

        /* renamed from: b */
        public final /* synthetic */ C23192a f58539b;

        public C23075h(C23192a aVar, Consent consent) {
            this.f58538a = consent;
            this.f58539b = aVar;
        }

        /* renamed from: a */
        public final void mo58063a(Object obj) {
            String str;
            C24559j jVar = (C24559j) obj;
            if (jVar == null) {
                jVar = new C24559j("ccpaIsImportantToVungle");
            }
            if (this.f58538a == Consent.OPTED_OUT) {
                str = "opted_out";
            } else {
                str = "opted_in";
            }
            jVar.mo60827d(str, "ccpa_status");
            this.f58539b.mo58289x(jVar, (C23192a.C23207n) null, false);
        }
    }

    /* renamed from: com.vungle.warren.Vungle$i */
    public class C23076i implements Callable<String> {

        /* renamed from: b */
        public final /* synthetic */ C23187p f58540b;

        /* renamed from: c */
        public final /* synthetic */ String f58541c;

        /* renamed from: d */
        public final /* synthetic */ int f58542d;

        public C23076i(C23187p pVar, String str, int i) {
            this.f58540b = pVar;
            this.f58541c = str;
            this.f58542d = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x003b, code lost:
            if (r8.equals(r6.mo60826c("ccpa_status")) != false) goto L_0x0040;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object call() throws java.lang.Exception {
            /*
                r23 = this;
                r0 = r23
                com.vungle.warren.p r1 = r0.f58540b
                java.lang.String r2 = r0.f58541c
                int r3 = r0.f58542d
                com.vungle.warren.Vungle r4 = com.vungle.warren.Vungle._instance
                java.util.concurrent.atomic.AtomicInteger r4 = r4.hbpOrdinalViewCount
                int r4 = r4.incrementAndGet()
                java.lang.Class<od0.j> r5 = od0.C24559j.class
                com.vungle.warren.persistence.a r6 = r1.f58864a
                java.lang.String r7 = "ccpaIsImportantToVungle"
                td0.e r6 = r6.mo58281p(r5, r7)
                ce0.t r7 = r1.f58865b
                long r7 = r7.mo53295a()
                java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
                java.lang.Object r6 = r6.get(r7, r9)
                od0.j r6 = (od0.C24559j) r6
                pd0.a r7 = new pd0.a
                if (r6 != 0) goto L_0x002f
                goto L_0x003e
            L_0x002f:
                java.lang.String r8 = "ccpa_status"
                java.lang.String r6 = r6.mo60826c(r8)
                java.lang.String r8 = "opted_out"
                boolean r6 = r8.equals(r6)
                if (r6 == 0) goto L_0x003e
                goto L_0x0040
            L_0x003e:
                java.lang.String r8 = "opted_in"
            L_0x0040:
                r7.<init>(r8)
                com.vungle.warren.persistence.a r6 = r1.f58864a
                ce0.t r8 = r1.f58865b
                java.lang.String r10 = "consentIsImportantToVungle"
                td0.e r6 = r6.mo58281p(r5, r10)
                long r11 = r8.mo53295a()
                java.lang.Object r6 = r6.get(r11, r9)
                od0.j r6 = (od0.C24559j) r6
                java.lang.String r8 = "timestamp"
                java.lang.String r11 = "consent_source"
                java.lang.String r12 = "consent_status"
                java.lang.String r13 = "consent_message_version"
                java.lang.String r14 = ""
                r15 = r2
                r16 = r3
                r2 = 0
                if (r6 != 0) goto L_0x0081
                od0.j r6 = new od0.j
                r6.<init>(r10)
                r6.mo60827d(r14, r13)
                java.lang.String r10 = "unknown"
                r6.mo60827d(r10, r12)
                java.lang.String r10 = "no_interaction"
                r6.mo60827d(r10, r11)
                java.lang.Long r10 = java.lang.Long.valueOf(r2)
                r6.mo60827d(r10, r8)
            L_0x0081:
                java.lang.String r10 = r6.mo60826c(r11)
                java.lang.String r11 = r6.mo60826c(r12)
                java.lang.Long r8 = r6.mo60825b(r8)
                long r17 = r8.longValue()
                java.lang.Long r8 = java.lang.Long.valueOf(r17)
                java.lang.String r6 = r6.mo60826c(r13)
                pd0.f r12 = new pd0.f
                r12.<init>(r11, r10, r8, r6)
                com.vungle.warren.PrivacyManager r6 = com.vungle.warren.PrivacyManager.m57004b()
                r6.getClass()
                com.vungle.warren.PrivacyManager$COPPA r6 = com.vungle.warren.PrivacyManager.m57003a()
                com.vungle.warren.PrivacyManager$COPPA r8 = com.vungle.warren.PrivacyManager.COPPA.COPPA_NOTSET
                if (r6 != r8) goto L_0x00af
                r8 = 0
                goto L_0x00b8
            L_0x00af:
                pd0.c r8 = new pd0.c
                boolean r6 = r6.getValue()
                r8.<init>(r6)
            L_0x00b8:
                pd0.b r6 = new pd0.b
                r6.<init>(r7, r12, r8)
                pd0.e r7 = new pd0.e
                de0.c r8 = r1.f58867d
                boolean r8 = r8.mo58369d()
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                de0.c r11 = r1.f58867d
                boolean r11 = r11.mo58373h()
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
                de0.c r12 = r1.f58867d
                boolean r12 = r12.mo58371f()
                java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
                r7.<init>(r8, r11, r12)
                pd0.d r8 = new pd0.d
                de0.c r11 = r1.f58867d
                boolean r11 = r11.mo58368c()
                java.lang.Boolean r18 = java.lang.Boolean.valueOf(r11)
                md0.a r11 = r1.f58868e
                java.lang.String r19 = r11.mo60495b()
                md0.a r11 = r1.f58868e
                java.lang.String r20 = r11.mo60494a()
                de0.c r11 = r1.f58867d
                double r11 = r11.mo58367b()
                java.lang.Double r21 = java.lang.Double.valueOf(r11)
                r17 = r8
                r22 = r7
                r17.<init>(r18, r19, r20, r21, r22)
                pd0.g r7 = new pd0.g
                com.vungle.warren.persistence.a r11 = r1.f58864a
                java.lang.String r12 = "config_extension"
                td0.e r5 = r11.mo58281p(r5, r12)
                ce0.t r11 = r1.f58865b
                long r10 = r11.mo53295a()
                java.lang.Object r5 = r5.get(r10, r9)
                od0.j r5 = (od0.C24559j) r5
                if (r5 == 0) goto L_0x0125
                java.lang.String r14 = r5.mo60826c(r12)
            L_0x0125:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                if (r16 > 0) goto L_0x0131
                r9 = 2147483646(0x7ffffffe, float:NaN)
                r16 = 2147483646(0x7ffffffe, float:NaN)
            L_0x0131:
                com.vungle.warren.persistence.a r9 = r1.f58864a
                java.lang.String r4 = java.lang.Integer.toString(r4)
                java.lang.String r10 = "2"
                byte[] r10 = r10.getBytes()
                int r10 = r10.length
                int r16 = r16 - r10
                java.lang.String r10 = ":"
                byte[] r11 = r10.getBytes()
                int r11 = r11.length
                int r16 = r16 - r11
                int r11 = r16 / 4
                double r11 = (double) r11
                double r11 = java.lang.Math.floor(r11)
                r16 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r11 = r11 * r16
                byte[] r10 = r10.getBytes()
                int r10 = r10.length
                r17 = r14
                double r13 = (double) r10
                double r11 = r11 - r13
                byte[] r4 = r4.getBytes()
                int r4 = r4.length
                double r13 = (double) r4
                double r11 = r11 - r13
                int r4 = (int) r11
                double r10 = (double) r4
                r12 = 4616189618054758400(0x4010000000000000, double:4.0)
                double r10 = r10 / r12
                long r10 = java.lang.Math.round(r10)
                r12 = 4
                long r10 = r10 * r12
                long r2 = java.lang.Math.max(r10, r2)
                int r3 = (int) r2
                java.lang.String r2 = ","
                byte[] r2 = r2.getBytes()
                int r2 = r2.length
                r9.getClass()
                td0.e r4 = new td0.e
                ce0.u r10 = r9.f58875b
                td0.j r11 = new td0.j
                r12 = r15
                r11.<init>(r9, r12, r3, r2)
                java.util.concurrent.Future r2 = r10.submit(r11)
                r4.<init>(r2)
                java.lang.Object r2 = r4.get()
                java.util.List r2 = (java.util.List) r2
                java.lang.String r3 = com.vungle.warren.VungleApiClient.f58560C
                r14 = r17
                r7.<init>(r14, r5, r2, r3)
                od0.g r2 = new od0.g
                r2.<init>(r8, r7, r6)
                com.google.gson.Gson r1 = r1.f58866c
                java.lang.String r1 = r1.toJson((java.lang.Object) r2)
                java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
                int r3 = r1.length()
                r2.<init>(r3)
                java.util.zip.GZIPOutputStream r3 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x01df }
                r3.<init>(r2)     // Catch:{ IOException -> 0x01df }
                byte[] r1 = r1.getBytes()     // Catch:{ IOException -> 0x01df }
                r3.write(r1)     // Catch:{ IOException -> 0x01df }
                r3.close()     // Catch:{ IOException -> 0x01df }
                byte[] r1 = r2.toByteArray()     // Catch:{ IOException -> 0x01df }
                r3 = 2
                java.lang.String r1 = android.util.Base64.encodeToString(r1, r3)     // Catch:{ IOException -> 0x01df }
                r2.close()     // Catch:{ IOException -> 0x01df }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01df }
                r2.<init>()     // Catch:{ IOException -> 0x01df }
                java.lang.String r3 = "3:"
                r2.append(r3)     // Catch:{ IOException -> 0x01df }
                r2.append(r1)     // Catch:{ IOException -> 0x01df }
                java.lang.String r10 = r2.toString()     // Catch:{ IOException -> 0x01df }
                goto L_0x01e0
            L_0x01df:
                r10 = 0
            L_0x01e0:
                java.lang.String unused = com.vungle.warren.Vungle.TAG
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.Vungle.C23076i.call():java.lang.Object");
        }
    }

    /* renamed from: com.vungle.warren.Vungle$j */
    public class C23077j implements C24927a.C24930c {
        /* renamed from: b */
        public final void mo58065b() {
            Vungle vungle = Vungle._instance;
            if (vungle.context != null) {
                Vungle.stopPlaying();
                C23236v0 a = C23236v0.m57280a(vungle.context);
                C24927a aVar = (C24927a) a.mo58350c(C24927a.class);
                Downloader downloader = (Downloader) a.mo58350c(Downloader.class);
                if (aVar.mo61483c() != null) {
                    ArrayList<C23127h> f = downloader.mo58151f();
                    String path = aVar.mo61483c().getPath();
                    for (C23127h hVar : f) {
                        if (!hVar.f58715c.startsWith(path)) {
                            downloader.mo58154i(hVar);
                        }
                    }
                }
                downloader.mo58147b();
            }
        }
    }

    /* renamed from: com.vungle.warren.Vungle$k */
    public class C23078k implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f58543b;

        /* renamed from: c */
        public final /* synthetic */ C23171k0 f58544c;

        /* renamed from: d */
        public final /* synthetic */ C23236v0 f58545d;

        /* renamed from: e */
        public final /* synthetic */ Context f58546e;

        public C23078k(String str, C23171k0 k0Var, C23236v0 v0Var, Context context) {
            this.f58543b = str;
            this.f58544c = k0Var;
            this.f58545d = v0Var;
            this.f58546e = context;
        }

        public final void run() {
            String str;
            String str2;
            Class cls = C25024h.class;
            Class cls2 = C23192a.class;
            Class<C24559j> cls3 = C24559j.class;
            Vungle vungle = Vungle._instance;
            vungle.appID = this.f58543b;
            C23250x xVar = this.f58544c.f58820b.get();
            if (!Vungle.isDepInit.getAndSet(true)) {
                C24486e eVar = (C24486e) this.f58545d.mo58350c(C24486e.class);
                VungleLogger.LoggerLevel loggerLevel = VungleLogger.LoggerLevel.DEBUG;
                VungleLogger vungleLogger = VungleLogger.f58591c;
                vungleLogger.f58592a = loggerLevel;
                vungleLogger.f58593b = eVar;
                eVar.f61974a.f62000f = 100;
                C24927a aVar = (C24927a) this.f58545d.mo58350c(C24927a.class);
                C23248w1 w1Var = this.f58544c.f58821c.get();
                if (w1Var == null || aVar.mo61482b(1) >= w1Var.f59000a) {
                    C24927a.C24930c access$200 = Vungle.cacheListener;
                    synchronized (aVar) {
                        aVar.mo61481a();
                        aVar.f63009c.add(access$200);
                        if (aVar.f63012f) {
                            access$200.mo58065b();
                        }
                    }
                    Context unused = vungle.context = this.f58546e;
                    C23192a aVar2 = (C23192a) this.f58545d.mo58350c(cls2);
                    try {
                        aVar2.getClass();
                        aVar2.mo58287v(new C24938h(aVar2));
                        PrivacyManager.m57004b().mo58051c(((C21103h) this.f58545d.mo58350c(C21103h.class)).mo53305j(), aVar2);
                        VungleApiClient vungleApiClient = (VungleApiClient) this.f58545d.mo58350c(VungleApiClient.class);
                        Context context = vungleApiClient.f58565b;
                        synchronized (vungleApiClient) {
                            C13452i iVar = new C13452i();
                            iVar.mo40349F("bundle", context.getPackageName());
                            try {
                                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                            } catch (PackageManager.NameNotFoundException unused2) {
                                str = null;
                            }
                            if (str == null) {
                                str = "1.0";
                            }
                            iVar.mo40349F("ver", str);
                            C13452i iVar2 = new C13452i();
                            String str3 = Build.MANUFACTURER;
                            iVar2.mo40349F("make", str3);
                            iVar2.mo40349F(ServerParameters.MODEL, Build.MODEL);
                            iVar2.mo40349F("osv", Build.VERSION.RELEASE);
                            iVar2.mo40349F(ServerParameters.CARRIER, ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName());
                            if (AdvertisingIdUtil.AMAZON_MANUFACTURER.equals(str3)) {
                                str2 = Identifiers.IDENTIFIER_AMAZON;
                            } else {
                                str2 = MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID;
                            }
                            iVar2.mo40349F("os", str2);
                            DisplayMetrics displayMetrics = new DisplayMetrics();
                            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                            iVar2.mo40348E("w", Integer.valueOf(displayMetrics.widthPixels));
                            iVar2.mo40348E("h", Integer.valueOf(displayMetrics.heightPixels));
                            try {
                                String a = vungleApiClient.f58564a.mo58366a();
                                vungleApiClient.f58589z = a;
                                iVar2.mo40349F("ua", a);
                                vungleApiClient.f58564a.mo58372g(new C23219r1(vungleApiClient));
                            } catch (Exception e) {
                                e.getLocalizedMessage();
                            }
                            vungleApiClient.f58575l = iVar2;
                            vungleApiClient.f58576m = iVar;
                            vungleApiClient.f58584u = vungleApiClient.mo58078f();
                            try {
                                AppSet.getClient(vungleApiClient.f58565b).getAppSetIdInfo().addOnSuccessListener(new C23222s1(vungleApiClient));
                            } catch (NoClassDefFoundError e2) {
                                e2.getLocalizedMessage();
                            }
                        }
                        if (w1Var != null) {
                            vungleApiClient.f58587x = false;
                        }
                        C23097c cVar = (C23097c) this.f58545d.mo58350c(C23097c.class);
                        cVar.f58626l.set((C25024h) this.f58545d.mo58350c(cls));
                        cVar.f58624j.mo58147b();
                        Vungle vungle2 = Vungle._instance;
                        if (vungle2.consent.get() != null) {
                            Vungle.saveGDPRConsent(aVar2, (Consent) vungle2.consent.get(), vungle2.consentVersion);
                        } else {
                            C24559j jVar = (C24559j) aVar2.mo58281p(cls3, "consentIsImportantToVungle").get();
                            if (jVar == null) {
                                vungle2.consent.set((Object) null);
                                String unused3 = vungle2.consentVersion = null;
                            } else {
                                vungle2.consent.set(Vungle.getConsent(jVar));
                                String unused4 = vungle2.consentVersion = Vungle.getConsentMessageVersion(jVar);
                            }
                        }
                        if (vungle2.ccpaStatus.get() != null) {
                            Vungle.updateCCPAStatus(aVar2, (Consent) vungle2.ccpaStatus.get());
                        } else {
                            vungle2.ccpaStatus.set(Vungle.getCCPAStatus((C24559j) aVar2.mo58281p(cls3, "ccpaIsImportantToVungle").get()));
                        }
                    } catch (DatabaseHelper.DBException unused5) {
                        Vungle.onInitError(xVar, new VungleException(26));
                        Vungle.deInit();
                        return;
                    }
                } else {
                    Vungle.onInitError(xVar, new VungleException(16));
                    Vungle.deInit();
                    return;
                }
            }
            C23192a aVar3 = (C23192a) this.f58545d.mo58350c(cls2);
            C24559j jVar2 = (C24559j) aVar3.mo58281p(cls3, "appId").get();
            if (jVar2 == null) {
                jVar2 = new C24559j("appId");
            }
            jVar2.mo60827d(this.f58543b, "appId");
            try {
                aVar3.mo58288w(jVar2);
                Vungle._instance.configure(xVar, false);
                ((C25024h) this.f58545d.mo58350c(cls)).mo58356b(C25017a.m62725b((String) null, 2, 1, (String[]) null));
                return;
            } catch (DatabaseHelper.DBException unused6) {
                if (xVar != null) {
                    Vungle.onInitError(xVar, new VungleException(26));
                }
                Vungle.isInitializing.set(false);
                return;
            }
        }
    }

    /* renamed from: com.vungle.warren.Vungle$l */
    public class C23079l implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C23250x f58547b;

        public C23079l(C23250x xVar) {
            this.f58547b = xVar;
        }

        public final void run() {
            Vungle.onInitError(this.f58547b, new VungleException(39));
        }
    }

    /* renamed from: com.vungle.warren.Vungle$m */
    public class C23080m implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C23171k0 f58548b;

        public C23080m(C23171k0 k0Var) {
            this.f58548b = k0Var;
        }

        public final void run() {
            Vungle._instance.configure(this.f58548b.f58820b.get(), true);
        }
    }

    /* renamed from: com.vungle.warren.Vungle$n */
    public class C23081n implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C23171k0 f58549b;

        public C23081n(C23171k0 k0Var) {
            this.f58549b = k0Var;
        }

        public final void run() {
            Vungle.onInitError(this.f58549b.f58820b.get(), new VungleException(39));
        }
    }

    /* renamed from: com.vungle.warren.Vungle$o */
    public class C23082o implements C23181n1.C23183b {
    }

    /* renamed from: com.vungle.warren.Vungle$p */
    public class C23083p implements Comparator<C24566m> {

        /* renamed from: b */
        public final /* synthetic */ C23248w1 f58550b;

        public C23083p(C23248w1 w1Var) {
            this.f58550b = w1Var;
        }

        public final int compare(Object obj, Object obj2) {
            C24566m mVar = (C24566m) obj;
            C24566m mVar2 = (C24566m) obj2;
            if (this.f58550b != null) {
                if (mVar.f62257a.equals((Object) null)) {
                    return -1;
                }
                String str = mVar2.f62257a;
                this.f58550b.getClass();
                if (str.equals((Object) null)) {
                    return 1;
                }
            }
            return Integer.valueOf(mVar.f62262f).compareTo(Integer.valueOf(mVar2.f62262f));
        }
    }

    /* renamed from: com.vungle.warren.Vungle$q */
    public class C23084q implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ List f58551b;

        /* renamed from: c */
        public final /* synthetic */ C23097c f58552c;

        public C23084q(ArrayList arrayList, C23097c cVar) {
            this.f58551b = arrayList;
            this.f58552c = cVar;
        }

        public final void run() {
            for (C24566m mVar : this.f58551b) {
                this.f58552c.mo58106m(mVar, mVar.mo60831a(), 0, false);
            }
        }
    }

    /* renamed from: com.vungle.warren.Vungle$r */
    public class C23085r implements C24726b<C13452i> {

        /* renamed from: a */
        public final /* synthetic */ C24933d f58553a;

        public C23085r(C24933d dVar) {
            this.f58553a = dVar;
        }

        /* renamed from: a */
        public final void mo58057a(C24732e eVar) {
            if (eVar.mo61217a()) {
                this.f58553a.mo61498g("reported", true);
                this.f58553a.mo61492a();
                String unused = Vungle.TAG;
            }
        }

        public final void onFailure(Throwable th) {
        }
    }

    /* renamed from: com.vungle.warren.Vungle$s */
    public class C23086s implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C23236v0 f58554b;

        /* renamed from: c */
        public final /* synthetic */ String f58555c;

        /* renamed from: d */
        public final /* synthetic */ String f58556d;

        /* renamed from: e */
        public final /* synthetic */ String f58557e;

        /* renamed from: f */
        public final /* synthetic */ String f58558f;

        /* renamed from: g */
        public final /* synthetic */ String f58559g;

        public C23086s(C23236v0 v0Var, String str, String str2, String str3, String str4, String str5) {
            this.f58554b = v0Var;
            this.f58555c = str;
            this.f58556d = str2;
            this.f58557e = str3;
            this.f58558f = str4;
            this.f58559g = str5;
        }

        public final void run() {
            String str;
            String str2;
            String str3;
            String str4;
            if (!Vungle.isInitialized()) {
                String unused = Vungle.TAG;
                return;
            }
            C23192a aVar = (C23192a) this.f58554b.mo58350c(C23192a.class);
            C24559j jVar = (C24559j) aVar.mo58281p(C24559j.class, "incentivizedTextSetByPub").get();
            if (jVar == null) {
                jVar = new C24559j("incentivizedTextSetByPub");
            }
            String str5 = "";
            if (TextUtils.isEmpty(this.f58555c)) {
                str = str5;
            } else {
                str = this.f58555c;
            }
            if (TextUtils.isEmpty(this.f58556d)) {
                str2 = str5;
            } else {
                str2 = this.f58556d;
            }
            if (TextUtils.isEmpty(this.f58557e)) {
                str3 = str5;
            } else {
                str3 = this.f58557e;
            }
            if (TextUtils.isEmpty(this.f58558f)) {
                str4 = str5;
            } else {
                str4 = this.f58558f;
            }
            if (!TextUtils.isEmpty(this.f58559g)) {
                str5 = this.f58559g;
            }
            jVar.mo60827d(str, "title");
            jVar.mo60827d(str2, GroupedInventoryCardActivity.EXTRA_BODY);
            jVar.mo60827d(str3, "continue");
            jVar.mo60827d(str4, "close");
            jVar.mo60827d(str5, "userID");
            try {
                aVar.mo58288w(jVar);
            } catch (DatabaseHelper.DBException unused2) {
                String unused3 = Vungle.TAG;
            }
        }
    }

    private Vungle() {
    }

    public static Context appContext() {
        Vungle vungle = _instance;
        if (vungle != null) {
            return vungle.context;
        }
        return null;
    }

    public static boolean canPlayAd(String str) {
        return canPlayAd(str, (String) null);
    }

    private static void clearAdvertisements() {
        if (isInitialized()) {
            C23236v0 a = C23236v0.m57280a(_instance.context);
            ((C21103h) a.mo58350c(C21103h.class)).mo53305j().execute(new C23072f(a));
        }
    }

    private static void clearCache() {
        if (isInitialized()) {
            C23236v0 a = C23236v0.m57280a(_instance.context);
            ((C21103h) a.mo58350c(C21103h.class)).mo53305j().execute(new C23071e(a));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: java.lang.String} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0271 A[Catch:{ JsonSyntaxException -> 0x012a, all -> 0x0512 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02a4 A[Catch:{ JsonSyntaxException -> 0x012a, all -> 0x0512 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02ae A[Catch:{ JsonSyntaxException -> 0x012a, all -> 0x0512 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02fa A[Catch:{ JsonSyntaxException -> 0x012a, all -> 0x0512 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0325 A[Catch:{ JsonSyntaxException -> 0x012a, all -> 0x0512 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0337 A[Catch:{ JsonSyntaxException -> 0x012a, all -> 0x0512 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x035a A[Catch:{ JsonSyntaxException -> 0x012a, all -> 0x0512 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0390 A[Catch:{ all -> 0x050f, all -> 0x050d }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03d5 A[Catch:{ DBException -> 0x0404 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03e4 A[Catch:{ DBException -> 0x0404 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03ef A[Catch:{ DBException -> 0x0404 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0443 A[Catch:{ all -> 0x050f, all -> 0x050d }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0470 A[Catch:{ all -> 0x050f, all -> 0x050d }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x04a9 A[Catch:{ all -> 0x050f, all -> 0x050d }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x04ac A[Catch:{ all -> 0x050f, all -> 0x050d }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x04ae A[Catch:{ all -> 0x050f, all -> 0x050d }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x04f6 A[Catch:{ all -> 0x050f, all -> 0x050d }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0535  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0541  */
    /* JADX WARNING: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0130 A[Catch:{ JsonSyntaxException -> 0x012a, all -> 0x0512 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0193 A[Catch:{ JsonSyntaxException -> 0x012a, all -> 0x0512 }, LOOP:0: B:66:0x018d->B:68:0x0193, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01b9 A[SYNTHETIC, Splitter:B:72:0x01b9] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x024f A[Catch:{ JsonSyntaxException -> 0x012a, all -> 0x0512 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0257 A[Catch:{ JsonSyntaxException -> 0x012a, all -> 0x0512 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void configure(com.vungle.warren.C23250x r38, boolean r39) {
        /*
            r37 = this;
            r1 = r37
            r2 = r38
            java.lang.String r0 = "vision"
            java.lang.String r3 = "config"
            java.lang.String r4 = "ri"
            java.lang.String r5 = "ud0.i"
            java.lang.String r6 = "max_send_amount"
            java.lang.String r7 = "collect_filter"
            java.lang.String r8 = "interval"
            java.lang.String r9 = "configSettings"
            java.lang.String r10 = "cache_bust"
            java.lang.Class<nd0.e> r11 = nd0.C24486e.class
            java.lang.String r12 = "crash_report"
            java.lang.String r13 = "logging"
            java.lang.String r14 = "gdpr"
            java.lang.String r15 = "session"
            r16 = r0
            java.lang.Class<com.vungle.warren.persistence.a> r0 = com.vungle.warren.persistence.C23192a.class
            r17 = r3
            java.lang.Class<com.vungle.warren.VungleApiClient> r3 = com.vungle.warren.VungleApiClient.class
            r18 = r4
            java.lang.String r4 = "event"
            r19 = r4
            java.lang.String r4 = "clever_cache"
            r20 = r9
            android.content.Context r9 = r1.context     // Catch:{ all -> 0x0522 }
            if (r9 == 0) goto L_0x0517
            com.vungle.warren.v0 r9 = com.vungle.warren.C23236v0.m57280a(r9)     // Catch:{ all -> 0x0522 }
            java.lang.Object r21 = r9.mo58350c(r3)     // Catch:{ all -> 0x0522 }
            r22 = r8
            r8 = r21
            com.vungle.warren.VungleApiClient r8 = (com.vungle.warren.VungleApiClient) r8     // Catch:{ all -> 0x0522 }
            r21 = r10
            java.lang.String r10 = r1.appID     // Catch:{ all -> 0x0522 }
            ag.i r1 = r8.f58576m     // Catch:{ all -> 0x0512 }
            r23 = r6
            java.lang.String r6 = "id"
            r1.mo40349F(r6, r10)     // Catch:{ all -> 0x0512 }
            java.lang.Object r1 = r9.mo58350c(r0)     // Catch:{ all -> 0x0512 }
            com.vungle.warren.persistence.a r1 = (com.vungle.warren.persistence.C23192a) r1     // Catch:{ all -> 0x0512 }
            java.lang.Class<ud0.h> r6 = ud0.C25024h.class
            java.lang.Object r6 = r9.mo58350c(r6)     // Catch:{ all -> 0x0512 }
            ud0.h r6 = (ud0.C25024h) r6     // Catch:{ all -> 0x0512 }
            java.lang.Class<com.vungle.warren.k0> r10 = com.vungle.warren.C23171k0.class
            java.lang.Object r10 = r9.mo58350c(r10)     // Catch:{ all -> 0x0512 }
            com.vungle.warren.k0 r10 = (com.vungle.warren.C23171k0) r10     // Catch:{ all -> 0x0512 }
            r24 = r10
            qd0.e r10 = r8.mo58074b()     // Catch:{ all -> 0x0512 }
            boolean r25 = r10.mo61217a()     // Catch:{ all -> 0x0512 }
            r26 = 0
            r28 = r8
            java.lang.String r8 = "appId"
            r29 = r7
            r7 = 1
            if (r25 != 0) goto L_0x00c6
            long r0 = com.vungle.warren.VungleApiClient.m57014g(r10)     // Catch:{ all -> 0x0512 }
            int r3 = (r0 > r26 ? 1 : (r0 == r26 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b4
            com.vungle.warren.Vungle r3 = _instance     // Catch:{ all -> 0x0512 }
            java.lang.String r3 = r3.appID     // Catch:{ all -> 0x0512 }
            int r4 = ud0.C25025i.f63206b     // Catch:{ all -> 0x0512 }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ all -> 0x0512 }
            r4.<init>()     // Catch:{ all -> 0x0512 }
            r4.putString(r8, r3)     // Catch:{ all -> 0x0512 }
            ud0.g r3 = new ud0.g     // Catch:{ all -> 0x0512 }
            r3.<init>(r5)     // Catch:{ all -> 0x0512 }
            r3.f63202g = r4     // Catch:{ all -> 0x0512 }
            r3.f63198c = r7     // Catch:{ all -> 0x0512 }
            r4 = 4
            r3.f63204i = r4     // Catch:{ all -> 0x0512 }
            r3.f63199d = r0     // Catch:{ all -> 0x0512 }
            r6.mo58356b(r3)     // Catch:{ all -> 0x0512 }
            com.vungle.warren.error.VungleException r0 = new com.vungle.warren.error.VungleException     // Catch:{ all -> 0x0512 }
            r1 = 14
            r0.<init>((int) r1)     // Catch:{ all -> 0x0512 }
            onInitError(r2, r0)     // Catch:{ all -> 0x0512 }
            java.util.concurrent.atomic.AtomicBoolean r0 = isInitializing     // Catch:{ all -> 0x0512 }
            r1 = 0
            r0.set(r1)     // Catch:{ all -> 0x00c4 }
            return
        L_0x00b4:
            com.vungle.warren.error.VungleException r0 = new com.vungle.warren.error.VungleException     // Catch:{ all -> 0x0512 }
            r1 = 3
            r0.<init>((int) r1)     // Catch:{ all -> 0x0512 }
            onInitError(r2, r0)     // Catch:{ all -> 0x0512 }
            java.util.concurrent.atomic.AtomicBoolean r0 = isInitializing     // Catch:{ all -> 0x0512 }
            r1 = 0
            r0.set(r1)     // Catch:{ all -> 0x00c4 }
            return
        L_0x00c4:
            r0 = move-exception
            goto L_0x00ec
        L_0x00c6:
            java.lang.Class<td0.d> r7 = td0.C24933d.class
            java.lang.Object r7 = r9.mo58350c(r7)     // Catch:{ all -> 0x0512 }
            td0.d r7 = (td0.C24933d) r7     // Catch:{ all -> 0x0512 }
            T r10 = r10.f62602b     // Catch:{ all -> 0x0512 }
            ag.i r10 = (p359ag.C13452i) r10     // Catch:{ all -> 0x0512 }
            r30 = r6
            java.lang.String r6 = "placements"
            ag.d r6 = r10.mo40352J(r6)     // Catch:{ all -> 0x0512 }
            if (r6 != 0) goto L_0x00f2
            com.vungle.warren.error.VungleException r0 = new com.vungle.warren.error.VungleException     // Catch:{ all -> 0x0512 }
            r1 = 3
            r0.<init>((int) r1)     // Catch:{ all -> 0x0512 }
            onInitError(r2, r0)     // Catch:{ all -> 0x0512 }
            java.util.concurrent.atomic.AtomicBoolean r0 = isInitializing     // Catch:{ all -> 0x0512 }
            r1 = 0
            r0.set(r1)     // Catch:{ all -> 0x00c4 }
            return
        L_0x00ec:
            r4 = r37
        L_0x00ee:
            r5 = r19
            goto L_0x0526
        L_0x00f2:
            com.vungle.warren.s r2 = com.vungle.warren.C23220s.m57253a(r10)     // Catch:{ all -> 0x0512 }
            r31 = r5
            java.lang.Class<com.vungle.warren.downloader.Downloader> r5 = com.vungle.warren.downloader.Downloader.class
            java.lang.Object r5 = r9.mo58350c(r5)     // Catch:{ all -> 0x0512 }
            com.vungle.warren.downloader.Downloader r5 = (com.vungle.warren.downloader.Downloader) r5     // Catch:{ all -> 0x0512 }
            if (r2 == 0) goto L_0x0172
            r32 = r8
            r8 = 0
            r33 = r12
            java.lang.String r12 = r7.mo61494c(r4, r8)     // Catch:{ all -> 0x0512 }
            if (r12 != 0) goto L_0x0110
            r34 = r11
            goto L_0x012d
        L_0x0110:
            com.google.gson.GsonBuilder r34 = new com.google.gson.GsonBuilder     // Catch:{ JsonSyntaxException -> 0x012a }
            r34.<init>()     // Catch:{ JsonSyntaxException -> 0x012a }
            com.google.gson.Gson r8 = r34.create()     // Catch:{ JsonSyntaxException -> 0x012a }
            r34 = r11
            java.lang.Class<ag.i> r11 = p359ag.C13452i.class
            java.lang.Object r8 = r8.fromJson((java.lang.String) r12, r11)     // Catch:{ JsonSyntaxException -> 0x0128 }
            ag.i r8 = (p359ag.C13452i) r8     // Catch:{ JsonSyntaxException -> 0x0128 }
            com.vungle.warren.s r8 = com.vungle.warren.C23220s.m57253a(r8)     // Catch:{ all -> 0x0512 }
            goto L_0x012e
        L_0x0128:
            goto L_0x012d
        L_0x012a:
            r34 = r11
            goto L_0x0128
        L_0x012d:
            r8 = 0
        L_0x012e:
            if (r8 == 0) goto L_0x013f
            long r11 = r8.mo58313b()     // Catch:{ all -> 0x0512 }
            long r35 = r2.mo58313b()     // Catch:{ all -> 0x0512 }
            int r8 = (r11 > r35 ? 1 : (r11 == r35 ? 0 : -1))
            if (r8 == 0) goto L_0x013d
            goto L_0x013f
        L_0x013d:
            r8 = 0
            goto L_0x0140
        L_0x013f:
            r8 = 1
        L_0x0140:
            boolean r11 = r2.mo58314c()     // Catch:{ all -> 0x0512 }
            if (r11 == 0) goto L_0x0148
            if (r8 == 0) goto L_0x014b
        L_0x0148:
            r5.mo58146a()     // Catch:{ all -> 0x0512 }
        L_0x014b:
            boolean r8 = r2.mo58314c()     // Catch:{ all -> 0x0512 }
            r5.mo58153h(r8)     // Catch:{ all -> 0x0512 }
            ag.i r5 = new ag.i     // Catch:{ all -> 0x0512 }
            r5.<init>()     // Catch:{ all -> 0x0512 }
            com.google.gson.GsonBuilder r8 = new com.google.gson.GsonBuilder     // Catch:{ all -> 0x0512 }
            r8.<init>()     // Catch:{ all -> 0x0512 }
            com.google.gson.Gson r8 = r8.create()     // Catch:{ all -> 0x0512 }
            ag.g r2 = r8.toJsonTree(r2)     // Catch:{ all -> 0x0512 }
            r5.mo40346C(r2, r4)     // Catch:{ all -> 0x0512 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0512 }
            r7.mo61496e(r4, r2)     // Catch:{ all -> 0x0512 }
            r7.mo61492a()     // Catch:{ all -> 0x0512 }
            goto L_0x017c
        L_0x0172:
            r32 = r8
            r34 = r11
            r33 = r12
            r2 = 1
            r5.mo58153h(r2)     // Catch:{ all -> 0x0512 }
        L_0x017c:
            java.lang.Class<com.vungle.warren.c> r2 = com.vungle.warren.C23097c.class
            java.lang.Object r2 = r9.mo58350c(r2)     // Catch:{ all -> 0x0512 }
            com.vungle.warren.c r2 = (com.vungle.warren.C23097c) r2     // Catch:{ all -> 0x0512 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0512 }
            r4.<init>()     // Catch:{ all -> 0x0512 }
            java.util.Iterator r5 = r6.iterator()     // Catch:{ all -> 0x0512 }
        L_0x018d:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0512 }
            if (r6 == 0) goto L_0x01a6
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0512 }
            ag.g r6 = (p359ag.C13450g) r6     // Catch:{ all -> 0x0512 }
            od0.m r8 = new od0.m     // Catch:{ all -> 0x0512 }
            ag.i r6 = r6.mo40342u()     // Catch:{ all -> 0x0512 }
            r8.<init>(r6)     // Catch:{ all -> 0x0512 }
            r4.add(r8)     // Catch:{ all -> 0x0512 }
            goto L_0x018d
        L_0x01a6:
            r1.getClass()     // Catch:{ all -> 0x0512 }
            td0.k r5 = new td0.k     // Catch:{ all -> 0x0512 }
            r5.<init>(r1, r4)     // Catch:{ all -> 0x0512 }
            r1.mo58287v(r5)     // Catch:{ all -> 0x0512 }
            boolean r4 = r10.mo40354L(r15)     // Catch:{ all -> 0x0512 }
            java.lang.String r5 = "enabled"
            if (r4 == 0) goto L_0x024f
            ag.i r4 = r10.mo40353K(r15)     // Catch:{ all -> 0x0512 }
            boolean r6 = p389bl.C13641g.m34129r(r4, r5)     // Catch:{ all -> 0x0512 }
            if (r6 == 0) goto L_0x01cf
            ag.g r6 = r4.mo40351I(r5)     // Catch:{ all -> 0x0512 }
            boolean r6 = r6.mo40333i()     // Catch:{ all -> 0x0512 }
            if (r6 == 0) goto L_0x01cf
            r6 = 1
            goto L_0x01d0
        L_0x01cf:
            r6 = 0
        L_0x01d0:
            java.lang.String r8 = "limit"
            boolean r11 = p389bl.C13641g.m34129r(r4, r8)     // Catch:{ all -> 0x0512 }
            if (r11 == 0) goto L_0x01e5
            ag.i r11 = r4.mo40342u()     // Catch:{ all -> 0x0512 }
            ag.g r8 = r11.mo40351I(r8)     // Catch:{ all -> 0x0512 }
            int r8 = r8.mo40337p()     // Catch:{ all -> 0x0512 }
            goto L_0x01e6
        L_0x01e5:
            r8 = 0
        L_0x01e6:
            com.vungle.warren.n1 r11 = com.vungle.warren.C23181n1.m57208b()     // Catch:{ all -> 0x0512 }
            com.vungle.warren.Vungle$o r12 = new com.vungle.warren.Vungle$o     // Catch:{ all -> 0x0512 }
            r12.<init>()     // Catch:{ all -> 0x0512 }
            lf.b r15 = new lf.b     // Catch:{ all -> 0x0512 }
            r15.<init>()     // Catch:{ all -> 0x0512 }
            java.lang.Object r0 = r9.mo58350c(r0)     // Catch:{ all -> 0x0512 }
            com.vungle.warren.persistence.a r0 = (com.vungle.warren.persistence.C23192a) r0     // Catch:{ all -> 0x0512 }
            r35 = r7
            java.lang.Class<ce0.q> r7 = ce0.C21115q.class
            java.lang.Object r7 = r9.mo58350c(r7)     // Catch:{ all -> 0x0512 }
            ce0.q r7 = (ce0.C21115q) r7     // Catch:{ all -> 0x0512 }
            r7.getClass()     // Catch:{ all -> 0x0512 }
            ce0.u r7 = ce0.C21115q.f52981l     // Catch:{ all -> 0x0512 }
            java.lang.Object r3 = r9.mo58350c(r3)     // Catch:{ all -> 0x0512 }
            com.vungle.warren.VungleApiClient r3 = (com.vungle.warren.VungleApiClient) r3     // Catch:{ all -> 0x0512 }
            r11.f58846e = r12     // Catch:{ all -> 0x0512 }
            r11.f58842a = r15     // Catch:{ all -> 0x0512 }
            r11.f58843b = r7     // Catch:{ all -> 0x0512 }
            r11.f58854m = r0     // Catch:{ all -> 0x0512 }
            r11.f58844c = r6     // Catch:{ all -> 0x0512 }
            r11.f58850i = r3     // Catch:{ all -> 0x0512 }
            if (r8 > 0) goto L_0x021f
            r8 = 40
        L_0x021f:
            r11.f58851j = r8     // Catch:{ all -> 0x0512 }
            if (r6 != 0) goto L_0x0229
            java.util.List<od0.q> r0 = r11.f58847f     // Catch:{ all -> 0x0512 }
            r0.clear()     // Catch:{ all -> 0x0512 }
            goto L_0x0231
        L_0x0229:
            com.vungle.warren.l1 r3 = new com.vungle.warren.l1     // Catch:{ all -> 0x0512 }
            r3.<init>(r11, r6, r0)     // Catch:{ all -> 0x0512 }
            r7.submit((java.lang.Runnable) r3)     // Catch:{ all -> 0x0512 }
        L_0x0231:
            com.vungle.warren.n1 r0 = com.vungle.warren.C23181n1.m57208b()     // Catch:{ all -> 0x0512 }
            java.lang.String r3 = "timeout"
            r6 = 900(0x384, float:1.261E-42)
            boolean r7 = p389bl.C13641g.m34129r(r4, r3)     // Catch:{ all -> 0x0512 }
            if (r7 == 0) goto L_0x024b
            ag.i r4 = r4.mo40342u()     // Catch:{ all -> 0x0512 }
            ag.g r3 = r4.mo40351I(r3)     // Catch:{ all -> 0x0512 }
            int r6 = r3.mo40337p()     // Catch:{ all -> 0x0512 }
        L_0x024b:
            long r3 = (long) r6     // Catch:{ all -> 0x0512 }
            r0.f58845d = r3     // Catch:{ all -> 0x0512 }
            goto L_0x0251
        L_0x024f:
            r35 = r7
        L_0x0251:
            boolean r0 = r10.mo40354L(r14)     // Catch:{ all -> 0x0512 }
            if (r0 == 0) goto L_0x026b
            java.lang.Class<ce0.t> r0 = ce0.C21119t.class
            java.lang.Object r0 = r9.mo58350c(r0)     // Catch:{ all -> 0x0512 }
            ce0.t r0 = (ce0.C21119t) r0     // Catch:{ all -> 0x0512 }
            od0.l r3 = new od0.l     // Catch:{ all -> 0x0512 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x0512 }
            ag.i r0 = r10.mo40353K(r14)     // Catch:{ all -> 0x0512 }
            r3.mo60830a(r0)     // Catch:{ all -> 0x0512 }
        L_0x026b:
            boolean r0 = r10.mo40354L(r13)     // Catch:{ all -> 0x0512 }
            if (r0 == 0) goto L_0x02a4
            r0 = r34
            java.lang.Object r3 = r9.mo58350c(r0)     // Catch:{ all -> 0x0512 }
            nd0.e r3 = (nd0.C24486e) r3     // Catch:{ all -> 0x0512 }
            ag.i r4 = r10.mo40353K(r13)     // Catch:{ all -> 0x0512 }
            boolean r6 = p389bl.C13641g.m34129r(r4, r5)     // Catch:{ all -> 0x0512 }
            if (r6 == 0) goto L_0x028c
            ag.g r4 = r4.mo40351I(r5)     // Catch:{ all -> 0x0512 }
            boolean r4 = r4.mo40333i()     // Catch:{ all -> 0x0512 }
            goto L_0x028d
        L_0x028c:
            r4 = 0
        L_0x028d:
            java.util.concurrent.atomic.AtomicBoolean r6 = r3.f61979f     // Catch:{ all -> 0x0512 }
            r7 = r4 ^ 1
            boolean r6 = r6.compareAndSet(r7, r4)     // Catch:{ all -> 0x0512 }
            if (r6 == 0) goto L_0x02a6
            td0.d r6 = r3.f61977d     // Catch:{ all -> 0x0512 }
            java.lang.String r7 = "logging_enabled"
            r6.mo61498g(r7, r4)     // Catch:{ all -> 0x0512 }
            td0.d r3 = r3.f61977d     // Catch:{ all -> 0x0512 }
            r3.mo61492a()     // Catch:{ all -> 0x0512 }
            goto L_0x02a6
        L_0x02a4:
            r0 = r34
        L_0x02a6:
            r3 = r33
            boolean r4 = r10.mo40354L(r3)     // Catch:{ all -> 0x0512 }
            if (r4 == 0) goto L_0x02f2
            java.lang.Object r0 = r9.mo58350c(r0)     // Catch:{ all -> 0x0512 }
            nd0.e r0 = (nd0.C24486e) r0     // Catch:{ all -> 0x0512 }
            ag.i r3 = r10.mo40353K(r3)     // Catch:{ all -> 0x0512 }
            boolean r4 = p389bl.C13641g.m34129r(r3, r5)     // Catch:{ all -> 0x0512 }
            if (r4 == 0) goto L_0x02c9
            ag.g r4 = r3.mo40351I(r5)     // Catch:{ all -> 0x0512 }
            boolean r4 = r4.mo40333i()     // Catch:{ all -> 0x0512 }
            r6 = r29
            goto L_0x02cc
        L_0x02c9:
            r6 = r29
            r4 = 0
        L_0x02cc:
            boolean r7 = p389bl.C13641g.m34129r(r3, r6)     // Catch:{ all -> 0x0512 }
            if (r7 == 0) goto L_0x02db
            ag.g r6 = r3.mo40351I(r6)     // Catch:{ all -> 0x0512 }
            java.lang.String r6 = r6.mo40326B()     // Catch:{ all -> 0x0512 }
            goto L_0x02dd
        L_0x02db:
            java.lang.String r6 = nd0.C24486e.f61973o     // Catch:{ all -> 0x0512 }
        L_0x02dd:
            r7 = r23
            boolean r8 = p389bl.C13641g.m34129r(r3, r7)     // Catch:{ all -> 0x0512 }
            if (r8 == 0) goto L_0x02ee
            ag.g r3 = r3.mo40351I(r7)     // Catch:{ all -> 0x0512 }
            int r3 = r3.mo40337p()     // Catch:{ all -> 0x0512 }
            goto L_0x02ef
        L_0x02ee:
            r3 = 5
        L_0x02ef:
            r0.mo60739c(r6, r3, r4)     // Catch:{ all -> 0x0512 }
        L_0x02f2:
            r0 = r21
            boolean r3 = r10.mo40354L(r0)     // Catch:{ all -> 0x0512 }
            if (r3 == 0) goto L_0x0325
            ag.i r0 = r10.mo40353K(r0)     // Catch:{ all -> 0x0512 }
            boolean r3 = r0.mo40354L(r5)     // Catch:{ all -> 0x0512 }
            if (r3 == 0) goto L_0x030f
            ag.g r3 = r0.mo40351I(r5)     // Catch:{ all -> 0x0512 }
            boolean r3 = r3.mo40333i()     // Catch:{ all -> 0x0512 }
            r4 = r22
            goto L_0x0312
        L_0x030f:
            r4 = r22
            r3 = 0
        L_0x0312:
            boolean r6 = r0.mo40354L(r4)     // Catch:{ all -> 0x0512 }
            if (r6 == 0) goto L_0x0323
            ag.g r0 = r0.mo40351I(r4)     // Catch:{ all -> 0x0512 }
            int r0 = r0.mo40337p()     // Catch:{ all -> 0x0512 }
            int r0 = r0 * 1000
            goto L_0x0327
        L_0x0323:
            r0 = 0
            goto L_0x0327
        L_0x0325:
            r0 = 0
            r3 = 0
        L_0x0327:
            java.lang.Class<od0.j> r4 = od0.C24559j.class
            r6 = r20
            td0.e r4 = r1.mo58281p(r4, r6)     // Catch:{ all -> 0x0512 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0512 }
            od0.j r4 = (od0.C24559j) r4     // Catch:{ all -> 0x0512 }
            if (r4 != 0) goto L_0x033c
            od0.j r4 = new od0.j     // Catch:{ all -> 0x0512 }
            r4.<init>(r6)     // Catch:{ all -> 0x0512 }
        L_0x033c:
            java.lang.String r6 = "ad_load_optimization"
            ag.i r6 = r10.mo40353K(r6)     // Catch:{ all -> 0x0512 }
            r7 = 0
            boolean r6 = p389bl.C13641g.m34122j(r6, r5, r7)     // Catch:{ all -> 0x0512 }
            r2.f58630p = r6     // Catch:{ all -> 0x0512 }
            java.lang.String r7 = "isAdDownloadOptEnabled"
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0512 }
            r4.mo60827d(r6, r7)     // Catch:{ all -> 0x0512 }
            r6 = r18
            boolean r7 = r10.mo40354L(r6)     // Catch:{ all -> 0x0512 }
            if (r7 == 0) goto L_0x036f
            ag.i r6 = r10.mo40353K(r6)     // Catch:{ all -> 0x0512 }
            ag.g r5 = r6.mo40351I(r5)     // Catch:{ all -> 0x0512 }
            boolean r5 = r5.mo40333i()     // Catch:{ all -> 0x0512 }
            java.lang.String r6 = "isReportIncentivizedEnabled"
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0512 }
            r4.mo60827d(r5, r6)     // Catch:{ all -> 0x0512 }
        L_0x036f:
            r1.mo58288w(r4)     // Catch:{ all -> 0x0512 }
            java.lang.String r5 = "disable_ad_id"
            r6 = 1
            boolean r5 = p389bl.C13641g.m34122j(r10, r5, r6)     // Catch:{ all -> 0x0512 }
            com.vungle.warren.PrivacyManager r6 = com.vungle.warren.PrivacyManager.m57004b()     // Catch:{ all -> 0x0512 }
            r6.mo58052e(r5)     // Catch:{ all -> 0x0512 }
            r1.mo58288w(r4)     // Catch:{ all -> 0x0512 }
            r4 = r37
            r4.saveConfigExtension(r1, r10)     // Catch:{ all -> 0x050f }
            r5 = r17
            boolean r6 = r10.mo40354L(r5)     // Catch:{ all -> 0x050f }
            if (r6 == 0) goto L_0x03c3
            ag.i r5 = r10.mo40353K(r5)     // Catch:{ all -> 0x050f }
            java.lang.String r6 = "refresh_time"
            ag.g r5 = r5.mo40351I(r6)     // Catch:{ all -> 0x050f }
            long r5 = r5.mo40339z()     // Catch:{ all -> 0x050f }
            java.lang.String r7 = r4.appID     // Catch:{ all -> 0x050f }
            int r8 = ud0.C25025i.f63206b     // Catch:{ all -> 0x050f }
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ all -> 0x050f }
            r8.<init>()     // Catch:{ all -> 0x050f }
            r11 = r32
            r8.putString(r11, r7)     // Catch:{ all -> 0x050f }
            ud0.g r7 = new ud0.g     // Catch:{ all -> 0x050f }
            r11 = r31
            r7.<init>(r11)     // Catch:{ all -> 0x050f }
            r7.f63202g = r8     // Catch:{ all -> 0x050f }
            r8 = 1
            r7.f63198c = r8     // Catch:{ all -> 0x050f }
            r8 = 4
            r7.f63204i = r8     // Catch:{ all -> 0x050f }
            r7.f63199d = r5     // Catch:{ all -> 0x050f }
            r6 = r30
            r6.mo58356b(r7)     // Catch:{ all -> 0x050f }
            goto L_0x03c5
        L_0x03c3:
            r6 = r30
        L_0x03c5:
            java.lang.Class<com.vungle.warren.o1> r5 = com.vungle.warren.C23186o1.class
            java.lang.Object r5 = r9.mo58350c(r5)     // Catch:{ DBException -> 0x0404 }
            com.vungle.warren.o1 r5 = (com.vungle.warren.C23186o1) r5     // Catch:{ DBException -> 0x0404 }
            r7 = r16
            boolean r8 = p389bl.C13641g.m34129r(r10, r7)     // Catch:{ DBException -> 0x0404 }
            if (r8 == 0) goto L_0x03e4
            com.google.gson.Gson r8 = gson     // Catch:{ DBException -> 0x0404 }
            ag.i r7 = r10.mo40353K(r7)     // Catch:{ DBException -> 0x0404 }
            java.lang.Class<ee0.c> r10 = ee0.C23287c.class
            java.lang.Object r7 = r8.fromJson((p359ag.C13450g) r7, r10)     // Catch:{ DBException -> 0x0404 }
            ee0.c r7 = (ee0.C23287c) r7     // Catch:{ DBException -> 0x0404 }
            goto L_0x03e9
        L_0x03e4:
            ee0.c r7 = new ee0.c     // Catch:{ DBException -> 0x0404 }
            r7.<init>()     // Catch:{ DBException -> 0x0404 }
        L_0x03e9:
            r5.f58863c = r7     // Catch:{ DBException -> 0x0404 }
            boolean r8 = r7.f59061a     // Catch:{ DBException -> 0x0404 }
            if (r8 == 0) goto L_0x0404
            com.vungle.warren.persistence.a r5 = r5.f58861a     // Catch:{ DBException -> 0x0404 }
            ee0.c$a r7 = r7.f59064d     // Catch:{ DBException -> 0x0404 }
            if (r7 == 0) goto L_0x03f8
            int r7 = r7.f59065a     // Catch:{ DBException -> 0x0404 }
            goto L_0x03f9
        L_0x03f8:
            r7 = 0
        L_0x03f9:
            r5.getClass()     // Catch:{ DBException -> 0x0404 }
            td0.m r8 = new td0.m     // Catch:{ DBException -> 0x0404 }
            r8.<init>(r5, r7)     // Catch:{ DBException -> 0x0404 }
            r5.mo58287v(r8)     // Catch:{ DBException -> 0x0404 }
        L_0x0404:
            r5 = 1
            isInitialized = r5     // Catch:{ all -> 0x050f }
            r38.onSuccess()     // Catch:{ all -> 0x050f }
            java.lang.String r5 = "Vungle#init"
            java.lang.String r7 = "onSuccess"
            com.vungle.warren.VungleLogger.m57028a(r5, r7)     // Catch:{ all -> 0x050f }
            java.util.concurrent.atomic.AtomicBoolean r5 = isInitializing     // Catch:{ all -> 0x050f }
            r7 = 0
            r5.set(r7)     // Catch:{ all -> 0x050f }
            com.vungle.warren.n1 r5 = com.vungle.warren.C23181n1.m57208b()     // Catch:{ all -> 0x050f }
            r5.getClass()     // Catch:{ all -> 0x050f }
            ce0.a r7 = ce0.C21087a.f52911k     // Catch:{ all -> 0x050f }
            com.vungle.warren.n1$a r5 = r5.f58855n     // Catch:{ all -> 0x050f }
            r7.mo53275a(r5)     // Catch:{ all -> 0x050f }
            td0.e r1 = r1.mo58286u()     // Catch:{ all -> 0x050f }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x050f }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x050f }
            int r5 = ud0.C25019c.f63190d     // Catch:{ all -> 0x050f }
            ud0.g r5 = new ud0.g     // Catch:{ all -> 0x050f }
            java.lang.String r7 = "ud0.c"
            r5.<init>(r7)     // Catch:{ all -> 0x050f }
            r7 = 0
            r5.f63204i = r7     // Catch:{ all -> 0x050f }
            r7 = 1
            r5.f63198c = r7     // Catch:{ all -> 0x050f }
            r6.mo58356b(r5)     // Catch:{ all -> 0x050f }
            if (r1 == 0) goto L_0x046e
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x050f }
            r5.<init>(r1)     // Catch:{ all -> 0x050f }
            r10 = r24
            java.util.concurrent.atomic.AtomicReference<com.vungle.warren.w1> r1 = r10.f58821c     // Catch:{ all -> 0x050f }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x050f }
            com.vungle.warren.w1 r1 = (com.vungle.warren.C23248w1) r1     // Catch:{ all -> 0x050f }
            com.vungle.warren.Vungle$p r7 = new com.vungle.warren.Vungle$p     // Catch:{ all -> 0x050f }
            r7.<init>(r1)     // Catch:{ all -> 0x050f }
            java.util.Collections.sort(r5, r7)     // Catch:{ all -> 0x050f }
            java.lang.Class<ce0.h> r1 = ce0.C21103h.class
            java.lang.Object r1 = r9.mo58350c(r1)     // Catch:{ all -> 0x050f }
            ce0.h r1 = (ce0.C21103h) r1     // Catch:{ all -> 0x050f }
            ce0.q$a r1 = r1.mo53301f()     // Catch:{ all -> 0x050f }
            com.vungle.warren.Vungle$q r7 = new com.vungle.warren.Vungle$q     // Catch:{ all -> 0x050f }
            r7.<init>(r5, r2)     // Catch:{ all -> 0x050f }
            r1.execute(r7)     // Catch:{ all -> 0x050f }
        L_0x046e:
            if (r3 == 0) goto L_0x04a9
            java.lang.Class<com.vungle.warren.r> r1 = com.vungle.warren.C23217r.class
            java.lang.Object r1 = r9.mo58350c(r1)     // Catch:{ all -> 0x050f }
            com.vungle.warren.r r1 = (com.vungle.warren.C23217r) r1     // Catch:{ all -> 0x050f }
            long r2 = (long) r0     // Catch:{ all -> 0x050f }
            int r0 = (r2 > r26 ? 1 : (r2 == r26 ? 0 : -1))
            if (r0 <= 0) goto L_0x0487
            r1.getClass()     // Catch:{ all -> 0x050f }
            r7 = 900000(0xdbba0, double:4.44659E-318)
            long r26 = java.lang.Math.max(r2, r7)     // Catch:{ all -> 0x050f }
        L_0x0487:
            r2 = r26
            long r7 = r1.f58922b     // Catch:{ all -> 0x050f }
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x04a4
            r1.f58922b = r2     // Catch:{ all -> 0x050f }
            int r0 = r1.f58925e     // Catch:{ all -> 0x050f }
            r2 = 1
            if (r0 != r2) goto L_0x04a5
            ud0.h r0 = r1.f58921a     // Catch:{ all -> 0x050f }
            java.lang.String[] r3 = ud0.C25018b.f63186d     // Catch:{ all -> 0x050f }
            r0.mo58355a()     // Catch:{ all -> 0x050f }
            r3 = 0
            r1.f58925e = r3     // Catch:{ all -> 0x050f }
            r1.mo58312a()     // Catch:{ all -> 0x050f }
            goto L_0x04a5
        L_0x04a4:
            r2 = 1
        L_0x04a5:
            r1.mo58312a()     // Catch:{ all -> 0x050f }
            goto L_0x04aa
        L_0x04a9:
            r2 = 1
        L_0x04aa:
            if (r39 != 0) goto L_0x04ae
            r7 = 1
            goto L_0x04af
        L_0x04ae:
            r7 = 0
        L_0x04af:
            ud0.g r0 = ud0.C25028k.m62740b(r7)     // Catch:{ all -> 0x050f }
            r6.mo58356b(r0)     // Catch:{ all -> 0x050f }
            int r0 = ud0.C25027j.f63208b     // Catch:{ all -> 0x050f }
            ud0.g r0 = new ud0.g     // Catch:{ all -> 0x050f }
            java.lang.String r1 = "j"
            r0.<init>(r1)     // Catch:{ all -> 0x050f }
            r1 = 2
            r0.f63204i = r1     // Catch:{ all -> 0x050f }
            r6.mo58356b(r0)     // Catch:{ all -> 0x050f }
            com.vungle.warren.n1 r0 = com.vungle.warren.C23181n1.m57208b()     // Catch:{ all -> 0x050f }
            ag.i r1 = new ag.i     // Catch:{ all -> 0x050f }
            r1.<init>()     // Catch:{ all -> 0x050f }
            com.vungle.warren.session.SessionEvent r2 = com.vungle.warren.session.SessionEvent.INIT_END     // Catch:{ all -> 0x050f }
            java.lang.String r3 = r2.toString()     // Catch:{ all -> 0x050f }
            r5 = r19
            r1.mo40349F(r5, r3)     // Catch:{ all -> 0x050d }
            com.vungle.warren.session.SessionAttribute r3 = com.vungle.warren.session.SessionAttribute.SUCCESS     // Catch:{ all -> 0x050d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x050d }
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x050d }
            r1.mo40347D(r3, r6)     // Catch:{ all -> 0x050d }
            od0.q r3 = new od0.q     // Catch:{ all -> 0x050d }
            r3.<init>((com.vungle.warren.session.SessionEvent) r2, (p359ag.C13452i) r1)     // Catch:{ all -> 0x050d }
            r0.mo58250d(r3)     // Catch:{ all -> 0x050d }
            java.lang.String r0 = "reported"
            r7 = r35
            boolean r0 = r7.mo61493b(r0)     // Catch:{ all -> 0x050d }
            if (r0 != 0) goto L_0x0594
            qd0.a r0 = r28.mo58083l()     // Catch:{ all -> 0x050d }
            com.vungle.warren.Vungle$r r1 = new com.vungle.warren.Vungle$r     // Catch:{ all -> 0x050d }
            r1.<init>(r7)     // Catch:{ all -> 0x050d }
            qd0.d r0 = (qd0.C24728d) r0     // Catch:{ all -> 0x050d }
            hi0.e r2 = r0.f62595b     // Catch:{ all -> 0x050d }
            qd0.c r3 = new qd0.c     // Catch:{ all -> 0x050d }
            r3.<init>(r0, r1)     // Catch:{ all -> 0x050d }
            com.google.firebase.perf.network.FirebasePerfOkHttpClient.enqueue(r2, r3)     // Catch:{ all -> 0x050d }
            goto L_0x0594
        L_0x050d:
            r0 = move-exception
            goto L_0x0526
        L_0x050f:
            r0 = move-exception
            goto L_0x00ee
        L_0x0512:
            r0 = move-exception
            r4 = r37
            goto L_0x00ee
        L_0x0517:
            r4 = r1
            r5 = r19
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x050d }
            java.lang.String r1 = "Context is null"
            r0.<init>(r1)     // Catch:{ all -> 0x050d }
            throw r0     // Catch:{ all -> 0x050d }
        L_0x0522:
            r0 = move-exception
            r4 = r1
            goto L_0x00ee
        L_0x0526:
            r1 = 0
            isInitialized = r1
            java.util.concurrent.atomic.AtomicBoolean r2 = isInitializing
            r2.set(r1)
            android.util.Log.getStackTraceString(r0)
            boolean r1 = r0 instanceof com.vungle.warren.network.HttpException
            if (r1 == 0) goto L_0x0541
            com.vungle.warren.error.VungleException r0 = new com.vungle.warren.error.VungleException
            r1 = 3
            r0.<init>((int) r1)
            r1 = r38
            onInitError(r1, r0)
            goto L_0x056f
        L_0x0541:
            r1 = r38
            boolean r2 = r0 instanceof com.vungle.warren.persistence.DatabaseHelper.DBException
            if (r2 == 0) goto L_0x0552
            com.vungle.warren.error.VungleException r0 = new com.vungle.warren.error.VungleException
            r2 = 26
            r0.<init>((int) r2)
            onInitError(r1, r0)
            goto L_0x056f
        L_0x0552:
            boolean r2 = r0 instanceof java.net.UnknownHostException
            if (r2 != 0) goto L_0x0565
            boolean r0 = r0 instanceof java.lang.SecurityException
            if (r0 == 0) goto L_0x055b
            goto L_0x0565
        L_0x055b:
            com.vungle.warren.error.VungleException r0 = new com.vungle.warren.error.VungleException
            r2 = 2
            r0.<init>((int) r2)
            onInitError(r1, r0)
            goto L_0x056f
        L_0x0565:
            com.vungle.warren.error.VungleException r0 = new com.vungle.warren.error.VungleException
            r2 = 33
            r0.<init>((int) r2)
            onInitError(r1, r0)
        L_0x056f:
            com.vungle.warren.n1 r0 = com.vungle.warren.C23181n1.m57208b()
            ag.i r1 = new ag.i
            r1.<init>()
            com.vungle.warren.session.SessionEvent r2 = com.vungle.warren.session.SessionEvent.INIT_END
            java.lang.String r3 = r2.toString()
            r1.mo40349F(r5, r3)
            com.vungle.warren.session.SessionAttribute r3 = com.vungle.warren.session.SessionAttribute.SUCCESS
            java.lang.String r3 = r3.toString()
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r1.mo40347D(r3, r5)
            od0.q r3 = new od0.q
            r3.<init>((com.vungle.warren.session.SessionEvent) r2, (p359ag.C13452i) r1)
            r0.mo58250d(r3)
        L_0x0594:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.Vungle.configure(com.vungle.warren.x, boolean):void");
    }

    public static void deInit() {
        Class cls = C23097c.class;
        Class cls2 = Downloader.class;
        Class cls3 = C24927a.class;
        Vungle vungle = _instance;
        Context context2 = vungle.context;
        if (context2 != null) {
            C23236v0 a = C23236v0.m57280a(context2);
            if (a.mo58352e(cls3)) {
                C24927a aVar = (C24927a) a.mo58350c(cls3);
                C24927a.C24930c cVar = cacheListener;
                synchronized (aVar) {
                    aVar.f63009c.remove(cVar);
                }
            }
            if (a.mo58352e(cls2)) {
                ((Downloader) a.mo58350c(cls2)).mo58148c();
            }
            if (a.mo58352e(cls)) {
                ((C23097c) a.mo58350c(cls)).mo58097b();
            }
            vungle.playOperations.clear();
        }
        synchronized (C23236v0.class) {
            C23236v0.f58971d = null;
        }
        isInitialized = false;
        isDepInit.set(false);
        isInitializing.set(false);
    }

    public static Context getAppContext() {
        return _instance.context;
    }

    public static String getAvailableBidTokens(Context context2) {
        return getAvailableBidTokens(context2, (String) null, 0);
    }

    @Deprecated
    public static String getAvailableBidTokensBySize(Context context2, int i) {
        return getAvailableBidTokens(context2, (String) null, i);
    }

    public static C21033n getBannerViewInternal(String str, AdMarkup adMarkup, AdConfig adConfig, C23135f0 f0Var) {
        String str2 = str;
        C23135f0 f0Var2 = f0Var;
        if (!isInitialized()) {
            onPlayError(str2, f0Var2, new VungleException(9));
            return null;
        } else if (TextUtils.isEmpty(str)) {
            onPlayError(str2, f0Var2, new VungleException(13));
            return null;
        } else {
            Vungle vungle = _instance;
            C23236v0 a = C23236v0.m57280a(vungle.context);
            C23097c cVar = (C23097c) a.mo58350c(C23097c.class);
            boolean z = true;
            AdRequest adRequest = new AdRequest(str2, adMarkup, true);
            C23097c.C23105g gVar = (C23097c.C23105g) cVar.f58615a.get(adRequest);
            if (gVar == null || !gVar.f58651i.get()) {
                z = false;
            }
            if (Boolean.TRUE.equals(vungle.playOperations.get(str2)) || z) {
                Objects.toString(vungle.playOperations.get(adRequest.mo58041f()));
                onPlayError(str2, f0Var2, new VungleException(8));
                return null;
            }
            try {
                AdRequest adRequest2 = adRequest;
                C23135f0 f0Var3 = f0Var;
                AdRequest adRequest3 = adRequest;
                return new C21033n(vungle.context.getApplicationContext(), adRequest3, adConfig, (C23157i0) a.mo58350c(C23157i0.class), new C23094b(adRequest2, vungle.playOperations, f0Var3, (C23192a) a.mo58350c(C23192a.class), cVar, (C25024h) a.mo58350c(C25024h.class), (C23186o1) a.mo58350c(C23186o1.class), (C24566m) null, (C24545c) null));
            } catch (Exception e) {
                StringBuilder k = C13555b.m33972k("Vungle banner ad fail: ");
                k.append(e.getLocalizedMessage());
                VungleLogger.m57029b("Vungle#playAd", k.toString());
                if (f0Var2 != null) {
                    f0Var2.onError(str2, new VungleException(10));
                }
                return null;
            }
        }
    }

    public static Consent getCCPAStatus() {
        return _instance.ccpaStatus.get();
    }

    /* access modifiers changed from: private */
    public static Consent getConsent(C24559j jVar) {
        if (jVar == null) {
            return null;
        }
        return "opted_in".equals(jVar.mo60826c("consent_status")) ? Consent.OPTED_IN : Consent.OPTED_OUT;
    }

    public static String getConsentMessageVersion() {
        return _instance.consentVersion;
    }

    private static String getConsentSource(C24559j jVar) {
        if (jVar == null) {
            return null;
        }
        return jVar.mo60826c("consent_source");
    }

    public static Consent getConsentStatus() {
        if (!isInitialized() || !isDepInit.get()) {
            return _instance.consent.get();
        }
        return getConsentStatus(getGDPRConsent());
    }

    public static C23094b getEventListener(AdRequest adRequest, C23135f0 f0Var) {
        Vungle vungle = _instance;
        C23236v0 a = C23236v0.m57280a(vungle.context);
        return new C23094b(adRequest, vungle.playOperations, f0Var, (C23192a) a.mo58350c(C23192a.class), (C23097c) a.mo58350c(C23097c.class), (C25024h) a.mo58350c(C25024h.class), (C23186o1) a.mo58350c(C23186o1.class), (C24566m) null, (C24545c) null);
    }

    private static C24559j getGDPRConsent() {
        C23236v0 a = C23236v0.m57280a(_instance.context);
        return (C24559j) ((C23192a) a.mo58350c(C23192a.class)).mo58281p(C24559j.class, "consentIsImportantToVungle").get(((C21119t) a.mo58350c(C21119t.class)).mo53295a(), TimeUnit.MILLISECONDS);
    }

    public static Collection<C24545c> getValidAdvertisementModels(String str) {
        if (!isInitialized()) {
            return Collections.emptyList();
        }
        C23236v0 a = C23236v0.m57280a(_instance.context);
        Collection<C24545c> collection = ((C23192a) a.mo58350c(C23192a.class)).mo58278m(str, (String) null).get(((C21119t) a.mo58350c(C21119t.class)).mo53295a(), TimeUnit.MILLISECONDS);
        if (collection == null) {
            return Collections.emptyList();
        }
        return collection;
    }

    public static Collection<C24566m> getValidPlacementModels() {
        if (!isInitialized()) {
            return Collections.emptyList();
        }
        C23236v0 a = C23236v0.m57280a(_instance.context);
        Collection<C24566m> collection = ((C23192a) a.mo58350c(C23192a.class)).mo58286u().get(((C21119t) a.mo58350c(C21119t.class)).mo53295a(), TimeUnit.MILLISECONDS);
        if (collection == null) {
            return Collections.emptyList();
        }
        return collection;
    }

    public static Collection<String> getValidPlacements() {
        if (!isInitialized()) {
            return Collections.emptyList();
        }
        C23236v0 a = C23236v0.m57280a(_instance.context);
        C23192a aVar = (C23192a) a.mo58350c(C23192a.class);
        aVar.getClass();
        Collection<String> collection = (Collection) new C24935e(aVar.f58875b.submit(new C24939i(aVar))).get(((C21119t) a.mo58350c(C21119t.class)).mo53295a(), TimeUnit.MILLISECONDS);
        if (collection == null) {
            return Collections.emptyList();
        }
        return collection;
    }

    @Deprecated
    public static void init(Collection<String> collection, String str, Context context2, C23250x xVar) throws IllegalArgumentException {
        init(str, context2, xVar, new C23248w1(new C23248w1.C23249a()));
    }

    public static boolean isInitialized() {
        return isInitialized && _instance.context != null;
    }

    public static void loadAd(String str, C23258z zVar) {
        loadAd(str, new AdConfig(), zVar);
    }

    public static void loadAdInternal(String str, String str2, AdConfig adConfig, C23258z zVar) {
        C23258z zVar2;
        AdConfig adConfig2;
        String str3 = str;
        C23258z zVar3 = zVar;
        Class cls = C21103h.class;
        if (!isInitialized()) {
            onLoadError(str3, zVar3, new VungleException(9));
            return;
        }
        C23236v0 a = C23236v0.m57280a(_instance.context);
        if (zVar3 instanceof C23095b0) {
            zVar2 = new C23106c0(((C21103h) a.mo58350c(cls)).mo53301f(), (C23095b0) zVar3);
        } else {
            zVar2 = new C23090a0(((C21103h) a.mo58350c(cls)).mo53301f(), zVar3);
        }
        AdMarkup a2 = C21095c.m49293a(str2);
        if (str2 == null || a2 != null) {
            AdMarkup a3 = C21095c.m49293a(str2);
            C23097c cVar = (C23097c) a.mo58350c(C23097c.class);
            if (adConfig == null) {
                adConfig2 = new AdConfig();
            } else {
                adConfig2 = adConfig;
            }
            AdRequest adRequest = new AdRequest(str3, a3, true);
            cVar.getClass();
            cVar.mo58105l(new C23097c.C23105g(adRequest, adConfig2.mo58261a(), 0, 2000, 5, 0, 0, true, 0, zVar2));
            return;
        }
        onLoadError(str3, zVar3, new VungleException(36));
    }

    /* access modifiers changed from: private */
    public static void onInitError(C23250x xVar, VungleException vungleException) {
        String str;
        if (xVar != null) {
            xVar.mo15748a(vungleException);
        }
        if (vungleException != null) {
            if (vungleException.getLocalizedMessage() == null || !vungleException.getLocalizedMessage().isEmpty()) {
                str = Integer.toString(vungleException.mo58207a());
            } else {
                str = vungleException.getLocalizedMessage();
            }
            VungleLogger.m57029b("Vungle#init", str);
        }
    }

    private static void onLoadError(String str, C23258z zVar, VungleException vungleException) {
        String str2;
        if (zVar != null) {
            zVar.onError(str, vungleException);
        }
        if (vungleException != null) {
            if (vungleException.getLocalizedMessage() == null || !vungleException.getLocalizedMessage().isEmpty()) {
                str2 = Integer.toString(vungleException.mo58207a());
            } else {
                str2 = vungleException.getLocalizedMessage();
            }
            VungleLogger.m57029b("Vungle#loadAd", str2);
        }
    }

    /* access modifiers changed from: private */
    public static void onPlayError(String str, C23135f0 f0Var, VungleException vungleException) {
        String str2;
        if (f0Var != null) {
            f0Var.onError(str, vungleException);
        }
        if (vungleException != null) {
            if (vungleException.getLocalizedMessage() == null || !vungleException.getLocalizedMessage().isEmpty()) {
                str2 = Integer.toString(vungleException.mo58207a());
            } else {
                str2 = vungleException.getLocalizedMessage();
            }
            VungleLogger.m57029b("Vungle#playAd", str2);
        }
        C23181n1 b = C23181n1.m57208b();
        C13452i iVar = new C13452i();
        SessionEvent sessionEvent = SessionEvent.PLAY_AD;
        iVar.mo40349F("event", sessionEvent.toString());
        iVar.mo40347D(SessionAttribute.SUCCESS.toString(), Boolean.FALSE);
        b.mo58250d(new C24573q(sessionEvent, iVar));
    }

    public static void playAd(String str, AdConfig adConfig, C23135f0 f0Var) {
        playAd(str, (String) null, adConfig, f0Var);
    }

    public static void reConfigure() {
        Vungle vungle = _instance;
        Context context2 = vungle.context;
        if (context2 != null) {
            C23236v0 a = C23236v0.m57280a(context2);
            C21103h hVar = (C21103h) a.mo58350c(C21103h.class);
            C23171k0 k0Var = (C23171k0) a.mo58350c(C23171k0.class);
            if (isInitialized()) {
                hVar.mo53305j().mo53324a(new C23080m(k0Var), new C23081n(k0Var));
            } else {
                init(vungle.appID, vungle.context, k0Var.f58820b.get());
            }
        }
    }

    /* access modifiers changed from: private */
    public static synchronized void renderAd(AdRequest adRequest, C23135f0 f0Var, C24566m mVar, C24545c cVar) {
        synchronized (Vungle.class) {
            if (isInitialized()) {
                Vungle vungle = _instance;
                C23236v0 a = C23236v0.m57280a(vungle.context);
                AdActivity.f58486k = new C23070d(adRequest, vungle.playOperations, f0Var, (C23192a) a.mo58350c(C23192a.class), (C23097c) a.mo58350c(C23097c.class), (C25024h) a.mo58350c(C25024h.class), (C23186o1) a.mo58350c(C23186o1.class), mVar, cVar);
                Intent intent = new Intent(vungle.context, VungleActivity.class);
                intent.addFlags(268435456);
                Bundle bundle = new Bundle();
                AdRequest adRequest2 = adRequest;
                bundle.putSerializable("request", adRequest);
                intent.putExtras(bundle);
                C21087a.m49280d(vungle.context, (Intent) null, intent, (C25247e) null, (PresenterAdOpenCallback) null);
            }
        }
    }

    private void saveConfigExtension(C23192a aVar, C13452i iVar) throws DatabaseHelper.DBException {
        C24559j jVar = new C24559j("config_extension");
        String str = "";
        if (iVar.mo40354L("config_extension")) {
            str = C13641g.m34123k(iVar, "config_extension", str);
        }
        jVar.mo60827d(str, "config_extension");
        aVar.mo58288w(jVar);
    }

    /* access modifiers changed from: private */
    public static void saveGDPRConsent(C23192a aVar, Consent consent2, String str) {
        aVar.f58875b.execute(new C23211d(aVar, "consentIsImportantToVungle", C24559j.class, new C23074g(aVar, consent2, str)));
    }

    public static void setHeaderBiddingCallback(C23235v vVar) {
        Context context2 = _instance.context;
        if (context2 != null) {
            C23236v0 a = C23236v0.m57280a(context2);
            ((C23171k0) a.mo58350c(C23171k0.class)).f58819a.set(new C23244w(((C21103h) a.mo58350c(C21103h.class)).mo53301f(), vVar));
        }
    }

    public static void setIncentivizedFields(String str, String str2, String str3, String str4, String str5) {
        if (isInitialized()) {
            C23236v0 a = C23236v0.m57280a(_instance.context);
            ((C21103h) a.mo58350c(C21103h.class)).mo53305j().execute(new C23086s(a, str2, str3, str4, str5, str));
        }
    }

    /* access modifiers changed from: private */
    public static void stopPlaying() {
        Vungle vungle = _instance;
        if (vungle.context != null) {
            Intent intent = new Intent("AdvertisementBus");
            intent.putExtra("command", "stopAll");
            C5367a.m13473a(vungle.context).mo21147c(intent);
        }
    }

    public static void updateCCPAStatus(Consent consent2) {
        if (consent2 != null) {
            Vungle vungle = _instance;
            vungle.ccpaStatus.set(consent2);
            if (isInitialized() && isDepInit.get()) {
                updateCCPAStatus((C23192a) C23236v0.m57280a(vungle.context).mo58350c(C23192a.class), consent2);
            }
        }
    }

    public static void updateConsentStatus(Consent consent2, String str) {
        if (consent2 != null) {
            Vungle vungle = _instance;
            vungle.consent.set(consent2);
            vungle.consentVersion = str;
            if (isInitialized() && isDepInit.get()) {
                saveGDPRConsent((C23192a) C23236v0.m57280a(vungle.context).mo58350c(C23192a.class), vungle.consent.get(), vungle.consentVersion);
            }
        }
    }

    public static void updateUserCoppaStatus(boolean z) {
        ExecutorService executorService;
        PrivacyManager b = PrivacyManager.m57004b();
        Boolean valueOf = Boolean.valueOf(z);
        b.getClass();
        if (valueOf != null) {
            PrivacyManager.f58508c.set(valueOf);
            if (!(b.f58511a == null || (executorService = b.f58512b) == null)) {
                executorService.execute(new C23168j0(b, valueOf));
            }
        }
        isInitialized();
    }

    public static boolean canPlayAd(String str, String str2) {
        Context context2 = _instance.context;
        if (context2 == null || TextUtils.isEmpty(str)) {
            return false;
        }
        AdMarkup a = C21095c.m49293a(str2);
        if (str2 != null && a == null) {
            return false;
        }
        C23236v0 a2 = C23236v0.m57280a(context2);
        return Boolean.TRUE.equals(new C24935e(((C21103h) a2.mo58350c(C21103h.class)).mo53296a().submit(new C23066a(context2, str2, str))).get(((C21119t) a2.mo58350c(C21119t.class)).mo53295a(), TimeUnit.MILLISECONDS));
    }

    public static String getAvailableBidTokens(Context context2, String str, int i) {
        if (context2 == null) {
            return null;
        }
        C23236v0 a = C23236v0.m57280a(context2);
        return (String) new C24935e(((C21103h) a.mo58350c(C21103h.class)).mo53296a().submit(new C23076i((C23187p) a.mo58350c(C23187p.class), str, i))).get(((C21119t) a.mo58350c(C21119t.class)).mo53295a(), TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: private */
    public static Consent getCCPAStatus(C24559j jVar) {
        if (jVar == null) {
            return null;
        }
        return "opted_out".equals(jVar.mo60826c("ccpa_status")) ? Consent.OPTED_OUT : Consent.OPTED_IN;
    }

    /* access modifiers changed from: private */
    public static String getConsentMessageVersion(C24559j jVar) {
        if (jVar == null) {
            return null;
        }
        return jVar.mo60826c("consent_message_version");
    }

    public static void loadAd(String str, AdConfig adConfig, C23258z zVar) {
        loadAd(str, (String) null, adConfig, zVar);
    }

    public static void playAd(String str, String str2, AdConfig adConfig, C23135f0 f0Var) {
        VungleLogger.m57028a("Vungle#playAd", "playAd call invoked");
        C23181n1 b = C23181n1.m57208b();
        b.getClass();
        if (adConfig != null && adConfig.f58860c) {
            C13452i iVar = new C13452i();
            SessionEvent sessionEvent = SessionEvent.MUTE;
            iVar.mo40349F("event", sessionEvent.toString());
            iVar.mo40347D(SessionAttribute.MUTED.toString(), Boolean.valueOf((adConfig.f58858a & 1) == 1));
            b.mo58250d(new C24573q(sessionEvent, iVar));
        }
        if (adConfig != null && adConfig.f58501f) {
            C13452i iVar2 = new C13452i();
            SessionEvent sessionEvent2 = SessionEvent.ORIENTATION;
            iVar2.mo40349F("event", sessionEvent2.toString());
            SessionAttribute sessionAttribute = SessionAttribute.ORIENTATION;
            int c = adConfig.mo58028c();
            iVar2.mo40349F(sessionAttribute.toString(), c != 0 ? c != 1 ? c != 2 ? c != 3 ? "none" : "match_video" : "auto_rotate" : "landscape" : "portrait");
            b.mo58250d(new C24573q(sessionEvent2, iVar2));
        }
        if (!isInitialized()) {
            if (f0Var != null) {
                onPlayError(str, f0Var, new VungleException(9));
            }
        } else if (TextUtils.isEmpty(str)) {
            onPlayError(str, f0Var, new VungleException(13));
        } else {
            AdMarkup a = C21095c.m49293a(str2);
            if (str2 == null || a != null) {
                C23236v0 a2 = C23236v0.m57280a(_instance.context);
                C21103h hVar = (C21103h) a2.mo58350c(C21103h.class);
                C23097c cVar = (C23097c) a2.mo58350c(C23097c.class);
                C23138g0 g0Var = new C23138g0(hVar.mo53301f(), f0Var);
                C23067b bVar = new C23067b(str, g0Var);
                hVar.mo53305j().mo53324a(new C23068c(str2, str, cVar, g0Var, (C23192a) a2.mo58350c(C23192a.class), adConfig, (VungleApiClient) a2.mo58350c(VungleApiClient.class), hVar, bVar), bVar);
                return;
            }
            onPlayError(str, f0Var, new VungleException(36));
        }
    }

    public static void loadAd(String str, String str2, AdConfig adConfig, C23258z zVar) {
        VungleLogger.m57028a("Vungle#loadAd", "loadAd API call invoked");
        if (!isInitialized()) {
            onLoadError(str, zVar, new VungleException(9));
        } else if (adConfig == null || AdConfig.AdSize.isDefaultAdSize(adConfig.mo58261a())) {
            C23236v0 a = C23236v0.m57280a(_instance.context);
            C24566m mVar = (C24566m) ((C23192a) a.mo58350c(C23192a.class)).mo58281p(C24566m.class, str).get(((C21119t) a.mo58350c(C21119t.class)).mo53295a(), TimeUnit.MILLISECONDS);
            if (mVar == null || mVar.f62265i != 4) {
                loadAdInternal(str, str2, adConfig, zVar);
            } else {
                onLoadError(str, zVar, new VungleException(41));
            }
        } else {
            onLoadError(str, zVar, new VungleException(29));
        }
    }

    public static void init(String str, Context context2, C23250x xVar) throws IllegalArgumentException {
        init(str, context2, xVar, new C23248w1(new C23248w1.C23249a()));
    }

    private static Consent getConsentStatus(C24559j jVar) {
        if (jVar == null) {
            return null;
        }
        String c = jVar.mo60826c("consent_status");
        c.getClass();
        char c2 = 65535;
        switch (c.hashCode()) {
            case -83053070:
                if (c.equals("opted_in")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1230717015:
                if (c.equals("opted_out_by_timeout")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1720328225:
                if (c.equals("opted_out")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                AtomicReference<Consent> atomicReference = _instance.consent;
                Consent consent2 = Consent.OPTED_IN;
                atomicReference.set(consent2);
                return consent2;
            case 1:
            case 2:
                AtomicReference<Consent> atomicReference2 = _instance.consent;
                Consent consent3 = Consent.OPTED_OUT;
                atomicReference2.set(consent3);
                return consent3;
            default:
                return null;
        }
    }

    /* access modifiers changed from: private */
    public static void updateCCPAStatus(C23192a aVar, Consent consent2) {
        aVar.f58875b.execute(new C23211d(aVar, "ccpaIsImportantToVungle", C24559j.class, new C23075h(aVar, consent2)));
    }

    public static void init(String str, Context context2, C23250x xVar, C23248w1 w1Var) throws IllegalArgumentException {
        C23250x xVar2;
        VungleLogger.m57028a("Vungle#init", "init request");
        C23181n1 b = C23181n1.m57208b();
        C13452i iVar = new C13452i();
        SessionEvent sessionEvent = SessionEvent.INIT;
        iVar.mo40349F("event", sessionEvent.toString());
        b.mo58250d(new C24573q(sessionEvent, iVar));
        if (xVar == null) {
            C23181n1 b2 = C23181n1.m57208b();
            C13452i iVar2 = new C13452i();
            SessionEvent sessionEvent2 = SessionEvent.INIT_END;
            iVar2.mo40349F("event", sessionEvent2.toString());
            iVar2.mo40347D(SessionAttribute.SUCCESS.toString(), Boolean.FALSE);
            b2.mo58250d(new C24573q(sessionEvent2, iVar2));
            throw new IllegalArgumentException("A valid InitCallback required to ensure API calls are being made after initialize is successful");
        } else if (context2 == null) {
            C23181n1 b3 = C23181n1.m57208b();
            C13452i iVar3 = new C13452i();
            SessionEvent sessionEvent3 = SessionEvent.INIT_END;
            iVar3.mo40349F("event", sessionEvent3.toString());
            iVar3.mo40347D(SessionAttribute.SUCCESS.toString(), Boolean.FALSE);
            b3.mo58250d(new C24573q(sessionEvent3, iVar3));
            xVar.mo15748a(new VungleException(6));
        } else {
            C23236v0 a = C23236v0.m57280a(context2);
            ((C23265c) a.mo58350c(C23265c.class)).mo58370e();
            C23171k0 k0Var = (C23171k0) C23236v0.m57280a(context2).mo58350c(C23171k0.class);
            k0Var.f58821c.set(w1Var);
            C21103h hVar = (C21103h) a.mo58350c(C21103h.class);
            if (xVar instanceof C23253y) {
                xVar2 = xVar;
            } else {
                xVar2 = new C23253y(hVar.mo53301f(), xVar);
            }
            if (str == null || str.isEmpty()) {
                xVar2.mo15748a(new VungleException(6));
                C23181n1 b4 = C23181n1.m57208b();
                C13452i iVar4 = new C13452i();
                SessionEvent sessionEvent4 = SessionEvent.INIT_END;
                iVar4.mo40349F("event", sessionEvent4.toString());
                iVar4.mo40347D(SessionAttribute.SUCCESS.toString(), Boolean.FALSE);
                b4.mo58250d(new C24573q(sessionEvent4, iVar4));
            } else if (!(context2 instanceof Application)) {
                xVar2.mo15748a(new VungleException(7));
                C23181n1 b5 = C23181n1.m57208b();
                C13452i iVar5 = new C13452i();
                SessionEvent sessionEvent5 = SessionEvent.INIT_END;
                iVar5.mo40349F("event", sessionEvent5.toString());
                iVar5.mo40347D(SessionAttribute.SUCCESS.toString(), Boolean.FALSE);
                b5.mo58250d(new C24573q(sessionEvent5, iVar5));
            } else if (isInitialized()) {
                xVar2.onSuccess();
                VungleLogger.m57028a("Vungle#init", "init already complete");
                C23181n1 b6 = C23181n1.m57208b();
                C13452i iVar6 = new C13452i();
                SessionEvent sessionEvent6 = SessionEvent.INIT_END;
                iVar6.mo40349F("event", sessionEvent6.toString());
                iVar6.mo40347D(SessionAttribute.SUCCESS.toString(), Boolean.FALSE);
                b6.mo58250d(new C24573q(sessionEvent6, iVar6));
            } else if (isInitializing.getAndSet(true)) {
                onInitError(xVar2, new VungleException(8));
                C23181n1 b7 = C23181n1.m57208b();
                C13452i iVar7 = new C13452i();
                SessionEvent sessionEvent7 = SessionEvent.INIT_END;
                iVar7.mo40349F("event", sessionEvent7.toString());
                iVar7.mo40347D(SessionAttribute.SUCCESS.toString(), Boolean.FALSE);
                b7.mo58250d(new C24573q(sessionEvent7, iVar7));
            } else if (C24361g.m61183r(context2, "android.permission.ACCESS_NETWORK_STATE") == 0 && C24361g.m61183r(context2, "android.permission.INTERNET") == 0) {
                C23181n1 b8 = C23181n1.m57208b();
                long currentTimeMillis = System.currentTimeMillis();
                b8.getClass();
                C23181n1.f58841p = currentTimeMillis;
                k0Var.f58820b.set(xVar2);
                hVar.mo53305j().mo53324a(new C23078k(str, k0Var, a, context2), new C23079l(xVar));
            } else {
                onInitError(xVar2, new VungleException(34));
                isInitializing.set(false);
                C23181n1 b9 = C23181n1.m57208b();
                C13452i iVar8 = new C13452i();
                SessionEvent sessionEvent8 = SessionEvent.INIT_END;
                iVar8.mo40349F("event", sessionEvent8.toString());
                iVar8.mo40347D(SessionAttribute.SUCCESS.toString(), Boolean.FALSE);
                b9.mo58250d(new C24573q(sessionEvent8, iVar8));
            }
        }
    }

    public static boolean canPlayAd(C24545c cVar) {
        Context context2 = _instance.context;
        if (context2 == null) {
            return false;
        }
        C23097c cVar2 = (C23097c) C23236v0.m57280a(context2).mo58350c(C23097c.class);
        cVar2.getClass();
        if (cVar == null || cVar.f62192N != 1) {
            return false;
        }
        return cVar2.mo58103i(cVar);
    }
}
