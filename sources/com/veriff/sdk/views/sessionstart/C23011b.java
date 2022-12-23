package com.veriff.sdk.views.sessionstart;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.veriff.sdk.internal.C21639fp;
import com.veriff.sdk.internal.C21667gf;
import com.veriff.sdk.internal.C21720gj;
import com.veriff.sdk.internal.C21895jw;
import com.veriff.sdk.internal.C21910kf;
import com.veriff.sdk.internal.C21924kn;
import com.veriff.sdk.internal.C21995mc;
import com.veriff.sdk.internal.C22609uz;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mf0.C24362h;
import mobi.lab.veriff.data.C24426d;
import mobi.lab.veriff.util.C24452e;
import mobi.lab.veriff.util.C24454g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b8\u00109J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001b\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0016\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0014\u0010%\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010.\u001a\u00020)8VX\u0004¢\u0006\f\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0018\u0010/R\u0016\u00101\u001a\u0004\u0018\u00010\b8VX\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u001eR\u0014\u00103\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, mo59060d2 = {"Lcom/veriff/sdk/views/sessionstart/SessionStartModel;", "Lcom/veriff/sdk/views/sessionstart/SessionStartMVP$Model;", "Lbf0/d;", "deletePreviousSessionFiles", "Lcom/veriff/sdk/internal/data/StartSessionData;", "data", "initBrowserId", "(Lcom/veriff/sdk/internal/data/StartSessionData;Lff0/c;)Ljava/lang/Object;", "", "serverLanguage", "overrideLanguage", "", "isRelaunch", "Lmobi/lab/veriff/util/LanguageCountryLocale;", "initLanguage", "(Ljava/lang/String;Ljava/lang/String;ZLff0/c;)Ljava/lang/Object;", "Lcom/veriff/sdk/internal/network/ApiResult;", "Lmobi/lab/veriff/data/api/request/response/StartSessionResponse;", "makeStartSessionRequest", "(Lff0/c;)Ljava/lang/Object;", "T", "result", "reportError", "Lcom/veriff/sdk/views/sessionstart/SessionStartMVP$Presenter;", "presenter", "setPresenter", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "getApiVersion", "()Ljava/lang/String;", "apiVersion", "getApplicationPackage", "applicationPackage", "", "getApplicationVersionCode", "()J", "applicationVersionCode", "Lcom/veriff/sdk/internal/probity/Collector;", "collector", "Lcom/veriff/sdk/internal/probity/Collector;", "Lcom/veriff/sdk/internal/analytics/Event$ImplementationType;", "getImplementationType", "()Lcom/veriff/sdk/internal/analytics/Event$ImplementationType;", "getImplementationType$annotations", "()V", "implementationType", "Lcom/veriff/sdk/views/sessionstart/SessionStartMVP$Presenter;", "getSdkLanguage", "sdkLanguage", "Lmobi/lab/veriff/data/SessionArguments;", "sessionArguments", "Lmobi/lab/veriff/data/SessionArguments;", "Lcom/veriff/sdk/internal/SessionServices;", "sessionServices", "Lcom/veriff/sdk/internal/SessionServices;", "<init>", "(Landroid/app/Activity;Lmobi/lab/veriff/data/SessionArguments;Lcom/veriff/sdk/internal/SessionServices;Lcom/veriff/sdk/internal/probity/Collector;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.sessionstart.b */
public final class C23011b implements a$a {

    /* renamed from: a */
    private a$b f58351a;

    /* renamed from: b */
    private final Activity f58352b;

    /* renamed from: c */
    private final C24426d f58353c;

    /* renamed from: d */
    private final C21639fp f58354d;

    /* renamed from: e */
    private final C21995mc f58355e;

    @C23413c(mo58554c = "com.veriff.sdk.views.sessionstart.SessionStartModel", mo58555f = "SessionStartModel.kt", mo58556l = {57, 77}, mo58557m = "initBrowserId")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H@"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/StartSessionData;", "data", "Lff0/c;", "Lbf0/d;", "continuation", "", "initBrowserId"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.sessionstart.b$a */
    public static final class C23012a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f58356a;

        /* renamed from: b */
        public int f58357b;

        /* renamed from: c */
        public final /* synthetic */ C23011b f58358c;

        /* renamed from: d */
        public Object f58359d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23012a(C23011b bVar, C23349c cVar) {
            super(cVar);
            this.f58358c = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f58356a = obj;
            this.f58357b |= Integer.MIN_VALUE;
            return this.f58358c.mo57941a((C21895jw) null, this);
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.sessionstart.SessionStartModel", mo58555f = "SessionStartModel.kt", mo58556l = {46}, mo58557m = "makeStartSessionRequest")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H@"}, mo59060d2 = {"Lff0/c;", "Lcom/veriff/sdk/internal/network/ApiResult;", "Lmobi/lab/veriff/data/api/request/response/StartSessionResponse;", "continuation", "", "makeStartSessionRequest"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.sessionstart.b$b */
    public static final class C23013b extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f58360a;

        /* renamed from: b */
        public int f58361b;

        /* renamed from: c */
        public final /* synthetic */ C23011b f58362c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23013b(C23011b bVar, C23349c cVar) {
            super(cVar);
            this.f58362c = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f58360a = obj;
            this.f58361b |= Integer.MIN_VALUE;
            return this.f58362c.mo57942a((C23349c<? super C21924kn<C22609uz>>) this);
        }
    }

    public C23011b(Activity activity, C24426d dVar, C21639fp fpVar, C21995mc mcVar) {
        C24362h.m61211f(activity, "activity");
        C24362h.m61211f(dVar, "sessionArguments");
        C24362h.m61211f(fpVar, "sessionServices");
        C24362h.m61211f(mcVar, "collector");
        this.f58352b = activity;
        this.f58353c = dVar;
        this.f58354d = fpVar;
        this.f58355e = mcVar;
    }

    /* renamed from: b */
    public String mo57945b() {
        C24454g a = C24454g.f61890a.mo60686a(this.f58353c.mo60608j());
        if (a != null) {
            return a.mo60678c();
        }
        return null;
    }

    /* renamed from: c */
    public C21667gf.C21712e mo57946c() {
        try {
            Class.forName("com.veriff.sdk.reactnative.VeriffSdkPackage");
            return C21667gf.C21712e.reactnative;
        } catch (Exception unused) {
            return C21667gf.C21712e.f54909b;
        }
    }

    /* renamed from: d */
    public String mo57947d() {
        return this.f58353c.mo60607i();
    }

    /* renamed from: e */
    public String mo57948e() {
        String packageName = this.f58352b.getPackageName();
        C24362h.m61210e(packageName, "activity.packageName");
        return packageName;
    }

    /* renamed from: f */
    public long mo57949f() {
        PackageInfo packageInfo = this.f58352b.getPackageManager().getPackageInfo(this.f58352b.getPackageName(), 0);
        if (Build.VERSION.SDK_INT >= 28) {
            if (packageInfo != null) {
                return packageInfo.getLongVersionCode();
            }
            return 0;
        } else if (packageInfo != null) {
            return (long) packageInfo.versionCode;
        } else {
            return 0;
        }
    }

    /* renamed from: a */
    public void mo57037a(a$b a_b) {
        C24362h.m61211f(a_b, "presenter");
        this.f58351a = a_b;
    }

    /* renamed from: a */
    public void mo57944a() {
        C24452e.m61501a((Context) this.f58352b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b7 A[Catch:{ Exception -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ca A[Catch:{ Exception -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo57941a(com.veriff.sdk.internal.C21895jw r7, ff0.C23349c<? super bf0.C21050d> r8) {
        /*
            r6 = this;
            boolean r7 = r8 instanceof com.veriff.sdk.views.sessionstart.C23011b.C23012a
            if (r7 == 0) goto L_0x0013
            r7 = r8
            com.veriff.sdk.views.sessionstart.b$a r7 = (com.veriff.sdk.views.sessionstart.C23011b.C23012a) r7
            int r0 = r7.f58357b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r7.f58357b = r0
            goto L_0x0018
        L_0x0013:
            com.veriff.sdk.views.sessionstart.b$a r7 = new com.veriff.sdk.views.sessionstart.b$a
            r7.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r7.f58356a
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.f58357b
            java.lang.String r2 = "initBrowserId()"
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0044
            if (r1 == r4) goto L_0x003c
            if (r1 != r3) goto L_0x0034
            java.lang.Object r7 = r7.f58359d
            com.veriff.sdk.views.sessionstart.b r7 = (com.veriff.sdk.views.sessionstart.C23011b) r7
            p584jl.C17885a.m44475z0(r8)     // Catch:{ Exception -> 0x0031 }
            goto L_0x00b3
        L_0x0031:
            r8 = move-exception
            goto L_0x00d2
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            java.lang.Object r1 = r7.f58359d
            com.veriff.sdk.views.sessionstart.b r1 = (com.veriff.sdk.views.sessionstart.C23011b) r1
            p584jl.C17885a.m44475z0(r8)
            goto L_0x005f
        L_0x0044:
            p584jl.C17885a.m44475z0(r8)
            com.veriff.sdk.internal.fp r8 = r6.f58354d
            com.veriff.sdk.internal.xb$a r8 = r8.mo54907a()
            mobi.lab.veriff.data.d r1 = r6.f58353c
            java.lang.String r1 = r1.mo60598c()
            r7.f58359d = r6
            r7.f58357b = r4
            java.lang.Object r8 = r8.mo57065b((java.lang.String) r1, (ff0.C23349c<? super com.veriff.sdk.internal.C21924kn<com.veriff.sdk.internal.C22552tj>>) r7)
            if (r8 != r0) goto L_0x005e
            return r0
        L_0x005e:
            r1 = r6
        L_0x005f:
            com.veriff.sdk.internal.kn r8 = (com.veriff.sdk.internal.C21924kn) r8
            boolean r5 = r8 instanceof com.veriff.sdk.internal.C21924kn.C21927c
            if (r5 != 0) goto L_0x006b
            r1.m56843a(r8)
            bf0.d r7 = bf0.C21050d.f52856a
            return r7
        L_0x006b:
            com.veriff.sdk.internal.kn$c r8 = (com.veriff.sdk.internal.C21924kn.C21927c) r8
            java.lang.Object r8 = r8.mo55715a()
            com.veriff.sdk.internal.tj r8 = (com.veriff.sdk.internal.C22552tj) r8
            java.lang.String r8 = r8.mo56714a()
            if (r8 == 0) goto L_0x0081
            int r5 = r8.length()
            if (r5 != 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r4 = 0
        L_0x0081:
            if (r4 == 0) goto L_0x009a
            com.veriff.sdk.internal.fp r7 = r1.f58354d
            com.veriff.sdk.internal.kf r7 = r7.mo54910d()
            java.lang.Throwable r8 = new java.lang.Throwable
            java.lang.String r0 = "BrowserId token is empty"
            r8.<init>(r0)
            com.veriff.sdk.internal.gj r0 = com.veriff.sdk.internal.C21720gj.session_start
            java.lang.String r1 = "initBrowserId()->ApiResult.Success"
            r7.mo55690a(r8, r1, r0)
            bf0.d r7 = bf0.C21050d.f52856a
            return r7
        L_0x009a:
            java.lang.String r4 = "browserid-fake-"
            boolean r4 = uh0.C25081h.m62835F(r8, r4)
            if (r4 == 0) goto L_0x00a5
            bf0.d r7 = bf0.C21050d.f52856a
            return r7
        L_0x00a5:
            com.veriff.sdk.internal.mc r4 = r1.f58355e     // Catch:{ Exception -> 0x00d4 }
            r7.f58359d = r1     // Catch:{ Exception -> 0x00d4 }
            r7.f58357b = r3     // Catch:{ Exception -> 0x00d4 }
            java.lang.Object r8 = r4.mo55812a(r8, r7)     // Catch:{ Exception -> 0x00d4 }
            if (r8 != r0) goto L_0x00b2
            return r0
        L_0x00b2:
            r7 = r1
        L_0x00b3:
            com.veriff.sdk.internal.kn r8 = (com.veriff.sdk.internal.C21924kn) r8     // Catch:{ Exception -> 0x0031 }
            if (r8 != 0) goto L_0x00ca
            com.veriff.sdk.internal.fp r8 = r7.f58354d     // Catch:{ Exception -> 0x0031 }
            com.veriff.sdk.internal.kf r8 = r8.mo54910d()     // Catch:{ Exception -> 0x0031 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = "Collector timed out collecting data"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0031 }
            com.veriff.sdk.internal.gj r1 = com.veriff.sdk.internal.C21720gj.session_start     // Catch:{ Exception -> 0x0031 }
            r8.mo55690a(r0, r2, r1)     // Catch:{ Exception -> 0x0031 }
            goto L_0x00e1
        L_0x00ca:
            boolean r0 = r8 instanceof com.veriff.sdk.internal.C21924kn.C21927c     // Catch:{ Exception -> 0x0031 }
            if (r0 != 0) goto L_0x00e1
            r7.m56843a(r8)     // Catch:{ Exception -> 0x0031 }
            goto L_0x00e1
        L_0x00d2:
            r1 = r7
            goto L_0x00d6
        L_0x00d4:
            r7 = move-exception
            r8 = r7
        L_0x00d6:
            com.veriff.sdk.internal.fp r7 = r1.f58354d
            com.veriff.sdk.internal.kf r7 = r7.mo54910d()
            com.veriff.sdk.internal.gj r0 = com.veriff.sdk.internal.C21720gj.session_start
            r7.mo55690a(r8, r2, r0)
        L_0x00e1:
            bf0.d r7 = bf0.C21050d.f52856a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.sessionstart.C23011b.mo57941a(com.veriff.sdk.internal.jw, ff0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo57942a(ff0.C23349c<? super com.veriff.sdk.internal.C21924kn<com.veriff.sdk.internal.C22609uz>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.veriff.sdk.views.sessionstart.C23011b.C23013b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.veriff.sdk.views.sessionstart.b$b r0 = (com.veriff.sdk.views.sessionstart.C23011b.C23013b) r0
            int r1 = r0.f58361b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f58361b = r1
            goto L_0x0018
        L_0x0013:
            com.veriff.sdk.views.sessionstart.b$b r0 = new com.veriff.sdk.views.sessionstart.b$b
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f58360a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f58361b
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p584jl.C17885a.m44475z0(r7)
            goto L_0x0086
        L_0x0027:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x002f:
            p584jl.C17885a.m44475z0(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = r6.mo57945b()
            if (r2 == 0) goto L_0x0044
            java.lang.String r2 = r6.mo57945b()
            r7.append(r2)
        L_0x0044:
            mobi.lab.veriff.util.h$b r2 = mobi.lab.veriff.util.C24457h.f61897a
            mobi.lab.veriff.util.g r2 = r2.mo60703c()
            if (r2 == 0) goto L_0x0051
            java.lang.String r2 = r2.mo60678c()
            goto L_0x0052
        L_0x0051:
            r2 = 0
        L_0x0052:
            if (r2 == 0) goto L_0x0068
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = ", "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r7.append(r2)
        L_0x0068:
            java.lang.String r7 = r7.toString()
            java.lang.String r2 = "StringBuilder().apply {\n…\") }\n        }.toString()"
            mf0.C24362h.m61210e(r7, r2)
            com.veriff.sdk.internal.fp r2 = r6.f58354d
            com.veriff.sdk.internal.xb$a r2 = r2.mo54907a()
            mobi.lab.veriff.data.d r4 = r6.f58353c
            java.util.Map r4 = r4.mo60601e()
            r0.f58361b = r3
            java.lang.Object r7 = r2.mo57062a((java.lang.String) r7, (java.util.Map<java.lang.String, java.lang.String>) r4, (ff0.C23349c<? super com.veriff.sdk.internal.C21924kn<com.veriff.sdk.internal.C22609uz>>) r0)
            if (r7 != r1) goto L_0x0086
            return r1
        L_0x0086:
            com.veriff.sdk.internal.kn r7 = (com.veriff.sdk.internal.C21924kn) r7
            boolean r0 = r7 instanceof com.veriff.sdk.internal.C21924kn.C21925a
            if (r0 == 0) goto L_0x0098
            com.veriff.sdk.internal.kn$a r0 = new com.veriff.sdk.internal.kn$a
            com.veriff.sdk.internal.kn$a r7 = (com.veriff.sdk.internal.C21924kn.C21925a) r7
            java.io.IOException r7 = r7.mo55705a()
            r0.<init>(r7)
            goto L_0x00cf
        L_0x0098:
            boolean r0 = r7 instanceof com.veriff.sdk.internal.C21924kn.C21926b
            if (r0 == 0) goto L_0x00b0
            com.veriff.sdk.internal.kn$b r0 = new com.veriff.sdk.internal.kn$b
            com.veriff.sdk.internal.kn$b r7 = (com.veriff.sdk.internal.C21924kn.C21926b) r7
            int r1 = r7.mo55709a()
            com.veriff.sdk.internal.yk r2 = r7.mo55710b()
            com.veriff.sdk.internal.to r7 = r7.mo55711c()
            r0.<init>(r1, r2, r7)
            goto L_0x00cf
        L_0x00b0:
            boolean r0 = r7 instanceof com.veriff.sdk.internal.C21924kn.C21927c
            if (r0 == 0) goto L_0x00c0
            com.veriff.sdk.internal.kn$c r0 = new com.veriff.sdk.internal.kn$c
            com.veriff.sdk.internal.kn$c r7 = (com.veriff.sdk.internal.C21924kn.C21927c) r7
            java.lang.Object r7 = r7.mo55715a()
            r0.<init>(r7)
            goto L_0x00cf
        L_0x00c0:
            boolean r0 = r7 instanceof com.veriff.sdk.internal.C21924kn.C21928d
            if (r0 == 0) goto L_0x00d0
            com.veriff.sdk.internal.kn$d r0 = new com.veriff.sdk.internal.kn$d
            com.veriff.sdk.internal.kn$d r7 = (com.veriff.sdk.internal.C21924kn.C21928d) r7
            java.lang.Throwable r7 = r7.mo55719a()
            r0.<init>(r7)
        L_0x00cf:
            return r0
        L_0x00d0:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.sessionstart.C23011b.mo57942a(ff0.c):java.lang.Object");
    }

    /* renamed from: a */
    public Object mo57943a(String str, String str2, boolean z, C23349c<? super C24454g> cVar) {
        return this.f58354d.mo54912f().mo60692a(str, str2, z, cVar);
    }

    /* renamed from: a */
    private final <T> void m56843a(C21924kn<T> knVar) {
        if (!(knVar instanceof C21924kn.C21927c)) {
            if (knVar instanceof C21924kn.C21926b) {
                C21924kn.C21926b bVar = (C21924kn.C21926b) knVar;
                int a = bVar.mo55709a();
                if (400 <= a && 499 >= a) {
                    C21910kf d = this.f58354d.mo54910d();
                    StringBuilder k = C13555b.m33972k("Backend call failed with ");
                    k.append(bVar.mo55709a());
                    d.mo55690a(new IllegalStateException(k.toString()), "initBrowserId()->ApiResult.RequestFailure", C21720gj.session_start);
                    return;
                }
                C21910kf d2 = this.f58354d.mo54910d();
                StringBuilder k2 = C13555b.m33972k("Backend call failed with ");
                k2.append(bVar.mo55709a());
                d2.mo55691b(new IllegalStateException(k2.toString()), "initBrowserId()->ApiResult.RequestFailure", C21720gj.session_start);
            } else if (knVar instanceof C21924kn.C21925a) {
                this.f58354d.mo54910d().mo55691b(((C21924kn.C21925a) knVar).mo55705a(), "initBrowserId()->ApiResult.NetworkFailure", C21720gj.session_start);
            } else if (knVar instanceof C21924kn.C21928d) {
                this.f58354d.mo54910d().mo55690a(((C21924kn.C21928d) knVar).mo55719a(), "initBrowserId()->ApiResult.UnknownFailure", C21720gj.session_start);
            }
        }
    }
}
