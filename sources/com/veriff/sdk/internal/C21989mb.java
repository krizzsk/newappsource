package com.veriff.sdk.internal;

import android.content.Context;
import android.view.Display;
import bf0.C21050d;
import com.usebutton.sdk.internal.api.AppActionRequest;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import lf0.C24240p;
import mf0.C24362h;
import org.json.JSONObject;
import p584jl.C17885a;
import wh0.C25235z;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018B\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J#\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ+\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, mo59060d2 = {"Lcom/veriff/sdk/internal/probity/AndroidCollector;", "Lcom/veriff/sdk/internal/probity/Collector;", "", "token", "Lorg/json/JSONObject;", "collectData", "Lcom/veriff/sdk/internal/network/ApiResult;", "", "post", "(Ljava/lang/String;Lff0/c;)Ljava/lang/Object;", "url", "(Ljava/lang/String;Ljava/lang/String;Lff0/c;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Landroid/view/Display;", "display", "Landroid/view/Display;", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;Lcom/veriff/sdk/internal/errors/ErrorReporter;)V", "(Landroid/content/Context;Landroid/view/Display;Lcom/veriff/sdk/internal/errors/ErrorReporter;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.mb */
public final class C21989mb implements C21995mc {

    /* renamed from: a */
    private final Context f55505a;

    /* renamed from: b */
    private final Display f55506b;

    /* renamed from: c */
    private final C21910kf f55507c;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"", "it", "", "invoke", "(I)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.mb$a */
    public static final class C21990a extends Lambda implements C24236l<Integer, CharSequence> {

        /* renamed from: a */
        public static final C21990a f55508a = new C21990a();

        public C21990a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence mo55814a(int i) {
            return String.valueOf(i);
        }

        public /* synthetic */ Object invoke(Object obj) {
            return mo55814a(((Number) obj).intValue());
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"", "it", "", "invoke", "(I)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.mb$b */
    public static final class C21991b extends Lambda implements C24236l<Integer, CharSequence> {

        /* renamed from: a */
        public static final C21991b f55509a = new C21991b();

        public C21991b() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence mo55815a(int i) {
            return String.valueOf(i);
        }

        public /* synthetic */ Object invoke(Object obj) {
            return mo55815a(((Number) obj).intValue());
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"", "it", "", "invoke", "(I)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.mb$c */
    public static final class C21992c extends Lambda implements C24236l<Integer, CharSequence> {

        /* renamed from: a */
        public static final C21992c f55510a = new C21992c();

        public C21992c() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence mo55816a(int i) {
            return String.valueOf(i);
        }

        public /* synthetic */ Object invoke(Object obj) {
            return mo55816a(((Number) obj).intValue());
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.internal.probity.AndroidCollector", mo58555f = "Collector.kt", mo58556l = {115}, mo58557m = "post")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0014\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0003H@"}, mo59060d2 = {"", "token", "url", "Lff0/c;", "Lcom/veriff/sdk/internal/network/ApiResult;", "", "continuation", "", "post"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.mb$d */
    public static final class C21993d extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f55511a;

        /* renamed from: b */
        public int f55512b;

        /* renamed from: c */
        public final /* synthetic */ C21989mb f55513c;

        /* renamed from: d */
        public Object f55514d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21993d(C21989mb mbVar, C23349c cVar) {
            super(cVar);
            this.f55513c = mbVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f55511a = obj;
            this.f55512b |= Integer.MIN_VALUE;
            return this.f55513c.mo55813a((String) null, (String) null, this);
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.internal.probity.AndroidCollector$post$body$1", mo58555f = "Collector.kt", mo58556l = {}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lorg/json/JSONObject;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.mb$e */
    public static final class C21994e extends SuspendLambda implements C24240p<C25235z, C23349c<? super JSONObject>, Object> {

        /* renamed from: a */
        public int f55515a;

        /* renamed from: b */
        public final /* synthetic */ C21989mb f55516b;

        /* renamed from: c */
        public final /* synthetic */ String f55517c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21994e(C21989mb mbVar, String str, C23349c cVar) {
            super(2, cVar);
            this.f55516b = mbVar;
            this.f55517c = str;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C21994e(this.f55516b, this.f55517c, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C21994e) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f55515a == 0) {
                C17885a.m44475z0(obj);
                return this.f55516b.m53631a(this.f55517c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C21989mb(Context context, Display display, C21910kf kfVar) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(display, "display");
        C24362h.m61211f(kfVar, "errorReporter");
        this.f55505a = context;
        this.f55506b = display;
        this.f55507c = kfVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo55813a(java.lang.String r8, java.lang.String r9, ff0.C23349c<? super com.veriff.sdk.internal.C21924kn<java.lang.Boolean>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.veriff.sdk.internal.C21989mb.C21993d
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.veriff.sdk.internal.mb$d r0 = (com.veriff.sdk.internal.C21989mb.C21993d) r0
            int r1 = r0.f55512b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f55512b = r1
            goto L_0x0018
        L_0x0013:
            com.veriff.sdk.internal.mb$d r0 = new com.veriff.sdk.internal.mb$d
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f55511a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f55512b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            java.lang.Object r8 = r0.f55514d
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            p584jl.C17885a.m44475z0(r10)
            goto L_0x004a
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            p584jl.C17885a.m44475z0(r10)
            r5 = 3000(0xbb8, double:1.482E-320)
            com.veriff.sdk.internal.mb$e r10 = new com.veriff.sdk.internal.mb$e
            r10.<init>(r7, r8, r3)
            r0.f55514d = r9
            r0.f55512b = r4
            java.lang.Object r10 = kotlinx.coroutines.TimeoutKt.m60598b(r5, r10, r0)
            if (r10 != r1) goto L_0x004a
            return r1
        L_0x004a:
            org.json.JSONObject r10 = (org.json.JSONObject) r10
            if (r10 == 0) goto L_0x00bd
            com.veriff.sdk.internal.ys$a r8 = new com.veriff.sdk.internal.ys$a
            r8.<init>()
            java.lang.String r0 = "application/json; charset=UTF-8"
            com.veriff.sdk.internal.yn r0 = com.veriff.sdk.internal.C22742yn.m55640b(r0)
            java.lang.String r10 = r10.toString()
            com.veriff.sdk.internal.yt r10 = com.veriff.sdk.internal.C22754yt.m55735a((com.veriff.sdk.internal.C22742yn) r0, (java.lang.String) r10)
            com.veriff.sdk.internal.ys$a r8 = r8.mo57404a((com.veriff.sdk.internal.C22754yt) r10)
            com.veriff.sdk.internal.ys$a r8 = r8.mo57406a((java.lang.String) r9)
            com.veriff.sdk.internal.ys r8 = r8.mo57409a()
            com.veriff.sdk.internal.eg$a r9 = com.veriff.sdk.internal.C21593eg.f54334a     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            com.veriff.sdk.internal.eg r9 = r9.mo54610a()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            com.veriff.sdk.internal.yp r9 = r9.mo54565b()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            com.veriff.sdk.internal.xw r8 = r9.mo57191a((com.veriff.sdk.internal.C22752ys) r8)     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            com.veriff.sdk.internal.yu r8 = r8.mo57188b()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            java.lang.String r9 = "resp"
            mf0.C24362h.m61210e(r8, r9)     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            boolean r9 = r8.mo57420d()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r9 == 0) goto L_0x0092
            com.veriff.sdk.internal.kn$c r8 = new com.veriff.sdk.internal.kn$c     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            r8.<init>(r9)     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            goto L_0x00bc
        L_0x0092:
            com.veriff.sdk.internal.kn$b r9 = new com.veriff.sdk.internal.kn$b     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            int r10 = r8.mo57418c()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            com.veriff.sdk.internal.yk r8 = r8.mo57423g()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            java.lang.String r0 = "resp.headers()"
            mf0.C24362h.m61210e(r8, r0)     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            com.veriff.sdk.internal.to r0 = new com.veriff.sdk.internal.to     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            java.lang.String r1 = "Collector post failed"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            r0.<init>(r1, r2)     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            r9.<init>(r10, r8, r0)     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            goto L_0x00bb
        L_0x00ae:
            r8 = move-exception
            com.veriff.sdk.internal.kn$d r9 = new com.veriff.sdk.internal.kn$d
            r9.<init>(r8)
            goto L_0x00bb
        L_0x00b5:
            r8 = move-exception
            com.veriff.sdk.internal.kn$a r9 = new com.veriff.sdk.internal.kn$a
            r9.<init>(r8)
        L_0x00bb:
            r8 = r9
        L_0x00bc:
            return r8
        L_0x00bd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21989mb.mo55813a(java.lang.String, java.lang.String, ff0.c):java.lang.Object");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C21989mb(android.app.Activity r3, com.veriff.sdk.internal.C21910kf r4) {
        /*
            r2 = this;
            java.lang.String r0 = "activity"
            mf0.C24362h.m61211f(r3, r0)
            java.lang.String r0 = "errorReporter"
            mf0.C24362h.m61211f(r4, r0)
            android.content.Context r0 = r3.getApplicationContext()
            java.lang.String r1 = "activity.applicationContext"
            mf0.C24362h.m61210e(r0, r1)
            android.view.WindowManager r3 = r3.getWindowManager()
            java.lang.String r1 = "activity.windowManager"
            mf0.C24362h.m61210e(r3, r1)
            android.view.Display r3 = r3.getDefaultDisplay()
            java.lang.String r1 = "activity.windowManager.defaultDisplay"
            mf0.C24362h.m61210e(r3, r1)
            r2.<init>(r0, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21989mb.<init>(android.app.Activity, com.veriff.sdk.internal.kf):void");
    }

    /* renamed from: a */
    public Object mo55812a(String str, C23349c<? super C21924kn<Boolean>> cVar) {
        return mo55813a(str, "https://handshake.probity.io/v2/grasp", cVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:91|(11:95|96|97|98|99|100|101|102|159|157|92)|158|106|107|108|111|113|114|(4:116|(1:(1:119)(2:120|122))|121|122)|123|124|(6:126|(1:128)(1:129)|(1:131)|132|136|(6:138|139|140|(3:142|(4:145|(2:147|164)(1:163)|161|143)|162)|148|150)(2:151|152))(2:133|134)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x0554 */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x055e A[Catch:{ Exception -> 0x05ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x05a6 A[Catch:{ Exception -> 0x05ae }] */
    @android.annotation.SuppressLint({"MissingPermission", "HardwareIds", "UsableSpace"})
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject m53631a(java.lang.String r27) {
        /*
            r26 = this;
            r1 = r26
            java.lang.String r2 = "health"
            java.lang.String r3 = "voltage"
            java.lang.String r4 = "temperature"
            java.lang.String r5 = "scale"
            java.lang.String r6 = "level"
            java.lang.String r7 = "status"
            java.lang.String r8 = "sensor"
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            android.content.Context r0 = r1.f55505a
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r10 = "context.resources"
            mf0.C24362h.m61210e(r0, r10)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            android.content.Context r11 = r1.f55505a
            android.content.res.Resources r11 = r11.getResources()
            mf0.C24362h.m61210e(r11, r10)
            android.content.res.Configuration r11 = r11.getConfiguration()
            android.content.Context r12 = r1.f55505a
            android.content.ContentResolver r12 = r12.getContentResolver()
            java.lang.String r13 = "android_id"
            java.lang.String r12 = android.provider.Settings.Secure.getString(r12, r13)
            android.content.Context r13 = r1.f55505a
            java.lang.String r14 = "phone"
            java.lang.Object r13 = r13.getSystemService(r14)
            if (r13 == 0) goto L_0x0747
            android.telephony.TelephonyManager r13 = (android.telephony.TelephonyManager) r13
            android.content.Context r14 = r1.f55505a
            android.content.Context r14 = r14.getApplicationContext()
            java.lang.String r15 = "wifi"
            java.lang.Object r14 = r14.getSystemService(r15)
            if (r14 == 0) goto L_0x073f
            android.net.wifi.WifiManager r14 = (android.net.wifi.WifiManager) r14
            java.lang.String r15 = "token"
            r16 = r2
            r2 = r27
            r9.put(r15, r2)
            java.lang.String r2 = "2"
            java.lang.String r15 = "sdk.platform"
            r9.put(r15, r2)
            java.lang.String r15 = "sdk.version"
            r17 = r3
            java.lang.String r3 = "0.1"
            r9.put(r15, r3)
            android.content.Context r3 = r1.f55505a
            java.lang.String r3 = com.veriff.sdk.internal.C21996md.m53649c(r3)
            java.lang.String r15 = "sdk.aguid"
            r9.put(r15, r3)
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r15 = "1"
            r9.put(r15, r3)
            java.lang.String r3 = android.os.Build.MODEL
            r9.put(r2, r3)
            java.lang.String r2 = android.os.Build.BOARD
            java.lang.String r3 = "3"
            r9.put(r3, r2)
            java.lang.String r2 = android.os.Build.BOOTLOADER
            java.lang.String r3 = "4"
            r9.put(r3, r2)
            java.lang.String r2 = android.os.Build.BRAND
            java.lang.String r3 = "5"
            r9.put(r3, r2)
            java.lang.String[] r2 = android.os.Build.SUPPORTED_ABIS
            java.lang.String r3 = "6"
            r9.put(r3, r2)
            java.lang.String r2 = android.os.Build.DEVICE
            java.lang.String r3 = "7"
            r9.put(r3, r2)
            java.lang.String r2 = android.os.Build.FINGERPRINT
            java.lang.String r3 = "8"
            r9.put(r3, r2)
            java.lang.String r2 = android.os.Build.HARDWARE
            java.lang.String r3 = "9"
            r9.put(r3, r2)
            java.lang.String r2 = android.os.Build.ID
            java.lang.String r3 = "10"
            r9.put(r3, r2)
            java.lang.String r2 = android.os.Build.getRadioVersion()
            java.lang.String r3 = "11"
            r9.put(r3, r2)
            java.lang.String r2 = android.os.Build.SERIAL
            java.lang.String r3 = "12"
            r9.put(r3, r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.String r15 = "13"
            r9.put(r15, r3)
            java.lang.String r3 = "14"
            java.lang.String r15 = "Android"
            r9.put(r3, r15)
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            java.lang.String r15 = "15"
            r9.put(r15, r3)
            float r3 = r11.fontScale
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.String r11 = "16"
            r9.put(r11, r3)
            java.io.File r3 = android.os.Environment.getDataDirectory()
            java.lang.String r11 = "Environment.getDataDirectory()"
            mf0.C24362h.m61210e(r3, r11)
            long r18 = r3.getUsableSpace()
            java.lang.Long r3 = java.lang.Long.valueOf(r18)
            java.lang.String r15 = "17"
            r9.put(r15, r3)
            java.io.File r3 = android.os.Environment.getDataDirectory()
            mf0.C24362h.m61210e(r3, r11)
            long r18 = r3.getTotalSpace()
            java.lang.Long r3 = java.lang.Long.valueOf(r18)
            java.lang.String r11 = "18"
            r9.put(r11, r3)
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r11 = "Environment.getExternalStorageDirectory()"
            mf0.C24362h.m61210e(r3, r11)
            long r18 = r3.getUsableSpace()
            java.lang.Long r3 = java.lang.Long.valueOf(r18)
            java.lang.String r15 = "19"
            r9.put(r15, r3)
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()
            mf0.C24362h.m61210e(r3, r11)
            long r18 = r3.getTotalSpace()
            java.lang.Long r3 = java.lang.Long.valueOf(r18)
            java.lang.String r11 = "20"
            r9.put(r11, r3)
            float r3 = r0.density
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.String r11 = "21"
            r9.put(r11, r3)
            int r3 = r0.densityDpi
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r11 = "22"
            r9.put(r11, r3)
            int r3 = r0.heightPixels
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r11 = "23"
            r9.put(r11, r3)
            float r3 = r0.scaledDensity
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.String r11 = "24"
            r9.put(r11, r3)
            int r3 = r0.widthPixels
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r11 = "25"
            r9.put(r11, r3)
            float r3 = r0.xdpi
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.String r11 = "26"
            r9.put(r11, r3)
            float r0 = r0.ydpi
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.String r3 = "27"
            r9.put(r3, r0)
            android.view.Display r0 = r1.f55506b
            int r0 = r0.getRotation()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = "28"
            r9.put(r3, r0)
            r0 = 30
            java.lang.String r3 = "tm.line1Number"
            java.lang.String r11 = "29"
            java.lang.String r15 = "android.permission.READ_PHONE_STATE"
            if (r2 >= r0) goto L_0x01d2
            android.content.Context r0 = r1.f55505a
            int r0 = p090g1.C4732a.checkSelfPermission(r0, r15)
            if (r0 == 0) goto L_0x01c1
            android.content.Context r0 = r1.f55505a
            java.lang.String r2 = "android.permission.READ_SMS"
            int r0 = p090g1.C4732a.checkSelfPermission(r0, r2)
            if (r0 != 0) goto L_0x01ec
        L_0x01c1:
            java.lang.String r0 = r13.getLine1Number()     // Catch:{ Exception -> 0x01c9 }
            r9.put(r11, r0)     // Catch:{ Exception -> 0x01c9 }
            goto L_0x01ec
        L_0x01c9:
            r0 = move-exception
            com.veriff.sdk.internal.kf r2 = r1.f55507c
            com.veriff.sdk.internal.gj r11 = com.veriff.sdk.internal.C21720gj.browserid
            r2.mo55690a(r0, r3, r11)
            goto L_0x01ec
        L_0x01d2:
            android.content.Context r0 = r1.f55505a
            java.lang.String r2 = "android.permission.READ_PHONE_NUMBERS"
            int r0 = p090g1.C4732a.checkSelfPermission(r0, r2)
            if (r0 != 0) goto L_0x01ec
            java.lang.String r0 = r13.getLine1Number()     // Catch:{ Exception -> 0x01e4 }
            r9.put(r11, r0)     // Catch:{ Exception -> 0x01e4 }
            goto L_0x01ec
        L_0x01e4:
            r0 = move-exception
            com.veriff.sdk.internal.kf r2 = r1.f55507c
            com.veriff.sdk.internal.gj r11 = com.veriff.sdk.internal.C21720gj.browserid
            r2.mo55690a(r0, r3, r11)
        L_0x01ec:
            android.content.Context r0 = r1.f55505a
            int r0 = p090g1.C4732a.checkSelfPermission(r0, r15)
            r2 = 29
            if (r0 != 0) goto L_0x0236
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r2) goto L_0x0222
            java.lang.String r0 = "30"
            java.lang.String r3 = r13.getDeviceId()     // Catch:{ Exception -> 0x0204 }
            r9.put(r0, r3)     // Catch:{ Exception -> 0x0204 }
            goto L_0x020e
        L_0x0204:
            r0 = move-exception
            com.veriff.sdk.internal.kf r3 = r1.f55507c
            com.veriff.sdk.internal.gj r11 = com.veriff.sdk.internal.C21720gj.browserid
            java.lang.String r15 = "tm.deviceId"
            r3.mo55690a(r0, r15, r11)
        L_0x020e:
            java.lang.String r0 = "32"
            java.lang.String r3 = r13.getSimSerialNumber()     // Catch:{ Exception -> 0x0218 }
            r9.put(r0, r3)     // Catch:{ Exception -> 0x0218 }
            goto L_0x0222
        L_0x0218:
            r0 = move-exception
            com.veriff.sdk.internal.kf r3 = r1.f55507c
            com.veriff.sdk.internal.gj r11 = com.veriff.sdk.internal.C21720gj.browserid
            java.lang.String r15 = "tm.simSerialNumber"
            r3.mo55690a(r0, r15, r11)
        L_0x0222:
            java.lang.String r0 = "31"
            java.lang.String r3 = r13.getDeviceSoftwareVersion()     // Catch:{ Exception -> 0x022c }
            r9.put(r0, r3)     // Catch:{ Exception -> 0x022c }
            goto L_0x0236
        L_0x022c:
            r0 = move-exception
            com.veriff.sdk.internal.kf r3 = r1.f55507c
            com.veriff.sdk.internal.gj r11 = com.veriff.sdk.internal.C21720gj.browserid
            java.lang.String r15 = "tm.deviceSoftwareVersion"
            r3.mo55690a(r0, r15, r11)
        L_0x0236:
            java.lang.String r0 = r13.getSimOperator()
            java.lang.String r3 = "33"
            r9.put(r3, r0)
            java.lang.String r0 = r13.getNetworkOperatorName()
            java.lang.String r3 = "34"
            r9.put(r3, r0)
            android.content.Context r0 = r1.f55505a
            java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = p090g1.C4732a.checkSelfPermission(r0, r3)
            if (r0 != 0) goto L_0x026a
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r2) goto L_0x026a
            java.lang.String r0 = "35"
            java.util.List r3 = r13.getAllCellInfo()     // Catch:{ Exception -> 0x0260 }
            r9.put(r0, r3)     // Catch:{ Exception -> 0x0260 }
            goto L_0x026a
        L_0x0260:
            r0 = move-exception
            com.veriff.sdk.internal.kf r3 = r1.f55507c
            com.veriff.sdk.internal.gj r11 = com.veriff.sdk.internal.C21720gj.browserid
            java.lang.String r13 = "tm.allCellInfo"
            r3.mo55690a(r0, r13, r11)
        L_0x026a:
            java.lang.String r0 = "36"
            r9.put(r0, r12)
            long r11 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            java.lang.String r3 = "37"
            r9.put(r3, r0)
            long r11 = android.os.SystemClock.uptimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            java.lang.String r3 = "38"
            r9.put(r3, r0)
            android.content.Context r0 = r1.f55505a
            android.content.ContentResolver r0 = r0.getContentResolver()
            r3 = -1
            java.lang.String r11 = "screen_brightness"
            int r0 = android.provider.Settings.System.getInt(r0, r11, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r11 = "39"
            r9.put(r11, r0)
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            long r11 = r0.totalMemory()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            java.lang.String r12 = "40"
            r9.put(r12, r11)
            long r11 = r0.freeMemory()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            java.lang.String r12 = "41"
            r9.put(r12, r11)
            int r0 = r0.availableProcessors()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r11 = "42"
            r9.put(r11, r0)
            android.content.Context r0 = r1.f55505a
            android.content.res.Resources r0 = r0.getResources()
            mf0.C24362h.m61210e(r0, r10)
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            java.lang.String r11 = "context.resources.configuration.locale"
            mf0.C24362h.m61210e(r0, r11)
            java.lang.String r0 = r0.getCountry()
            java.lang.String r12 = "43"
            r9.put(r12, r0)
            android.content.Context r0 = r1.f55505a
            android.content.res.Resources r0 = r0.getResources()
            mf0.C24362h.m61210e(r0, r10)
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            mf0.C24362h.m61210e(r0, r11)
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r10 = "44"
            r9.put(r10, r0)
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            java.lang.String r10 = "TimeZone.getDefault()"
            mf0.C24362h.m61210e(r0, r10)
            java.lang.String r0 = r0.getID()
            java.lang.String r10 = "45"
            r9.put(r10, r0)
            java.lang.String r0 = "os.name"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r10 = "46"
            r9.put(r10, r0)
            java.lang.String r0 = "os.arch"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r10 = "47"
            r9.put(r10, r0)
            java.lang.String r0 = "os.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r10 = "48"
            r9.put(r10, r0)
            android.content.Context r0 = r1.f55505a
            java.lang.String r10 = "android.permission.ACCESS_WIFI_STATE"
            int r0 = p090g1.C4732a.checkSelfPermission(r0, r10)
            if (r0 != 0) goto L_0x03f0
            android.net.wifi.WifiInfo r0 = r14.getConnectionInfo()     // Catch:{ Exception -> 0x0388 }
            java.lang.String r10 = "49"
            java.lang.String r11 = r0.getBSSID()     // Catch:{ Exception -> 0x0388 }
            r9.put(r10, r11)     // Catch:{ Exception -> 0x0388 }
            java.lang.String r10 = "50"
            java.lang.String r11 = r0.getSSID()     // Catch:{ Exception -> 0x0388 }
            r9.put(r10, r11)     // Catch:{ Exception -> 0x0388 }
            java.lang.String r10 = "51"
            java.lang.String r11 = r0.getMacAddress()     // Catch:{ Exception -> 0x0388 }
            r9.put(r10, r11)     // Catch:{ Exception -> 0x0388 }
            java.lang.String r10 = "52"
            int r11 = r0.getIpAddress()     // Catch:{ Exception -> 0x0388 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0388 }
            r9.put(r10, r11)     // Catch:{ Exception -> 0x0388 }
            java.lang.String r10 = "53"
            int r11 = r0.getRssi()     // Catch:{ Exception -> 0x0388 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0388 }
            r9.put(r10, r11)     // Catch:{ Exception -> 0x0388 }
            java.lang.String r10 = "54"
            int r0 = r0.getLinkSpeed()     // Catch:{ Exception -> 0x0388 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0388 }
            r9.put(r10, r0)     // Catch:{ Exception -> 0x0388 }
            bf0.d r0 = bf0.C21050d.f52856a     // Catch:{ Exception -> 0x0388 }
            goto L_0x0392
        L_0x0388:
            r0 = move-exception
            com.veriff.sdk.internal.kf r10 = r1.f55507c
            com.veriff.sdk.internal.gj r11 = com.veriff.sdk.internal.C21720gj.browserid
            java.lang.String r12 = "tm.connectionInfo"
            r10.mo55690a(r0, r12, r11)
        L_0x0392:
            android.net.DhcpInfo r0 = r14.getDhcpInfo()     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r10 = "55"
            int r11 = r0.ipAddress     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r11 = com.veriff.sdk.internal.C21996md.m53644b((int) r11)     // Catch:{ Exception -> 0x03e6 }
            r9.put(r10, r11)     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r10 = "56"
            int r11 = r0.gateway     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r11 = com.veriff.sdk.internal.C21996md.m53644b((int) r11)     // Catch:{ Exception -> 0x03e6 }
            r9.put(r10, r11)     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r10 = "57"
            int r11 = r0.dns1     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r11 = com.veriff.sdk.internal.C21996md.m53644b((int) r11)     // Catch:{ Exception -> 0x03e6 }
            r9.put(r10, r11)     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r10 = "58"
            int r11 = r0.dns2     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r11 = com.veriff.sdk.internal.C21996md.m53644b((int) r11)     // Catch:{ Exception -> 0x03e6 }
            r9.put(r10, r11)     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r10 = "59"
            int r11 = r0.serverAddress     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r11 = com.veriff.sdk.internal.C21996md.m53644b((int) r11)     // Catch:{ Exception -> 0x03e6 }
            r9.put(r10, r11)     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r10 = "60"
            int r11 = r0.netmask     // Catch:{ Exception -> 0x03e6 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x03e6 }
            r9.put(r10, r11)     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r10 = "61"
            int r0 = r0.leaseDuration     // Catch:{ Exception -> 0x03e6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x03e6 }
            r9.put(r10, r0)     // Catch:{ Exception -> 0x03e6 }
            bf0.d r0 = bf0.C21050d.f52856a     // Catch:{ Exception -> 0x03e6 }
            goto L_0x03f0
        L_0x03e6:
            r0 = move-exception
            com.veriff.sdk.internal.kf r10 = r1.f55507c
            com.veriff.sdk.internal.gj r11 = com.veriff.sdk.internal.C21720gj.browserid
            java.lang.String r12 = "tm.dhcInfo"
            r10.mo55690a(r0, r12, r11)
        L_0x03f0:
            r10 = 1
            r11 = 0
            android.content.Context r0 = r1.f55505a     // Catch:{ Exception -> 0x0449 }
            java.lang.String r12 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r12)     // Catch:{ Exception -> 0x0449 }
            if (r0 == 0) goto L_0x0441
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ Exception -> 0x0449 }
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ Exception -> 0x0449 }
            if (r0 == 0) goto L_0x0418
            java.lang.String r12 = "62"
            java.lang.String r13 = r0.getTypeName()     // Catch:{ Exception -> 0x0449 }
            r9.put(r12, r13)     // Catch:{ Exception -> 0x0449 }
            java.lang.String r12 = "63"
            java.lang.String r0 = r0.getSubtypeName()     // Catch:{ Exception -> 0x0449 }
            r9.put(r12, r0)     // Catch:{ Exception -> 0x0449 }
            bf0.d r0 = bf0.C21050d.f52856a     // Catch:{ Exception -> 0x0449 }
        L_0x0418:
            java.lang.String r0 = "64"
            java.lang.String r12 = com.veriff.sdk.internal.C21996md.m53647b((boolean) r10)     // Catch:{ Exception -> 0x0449 }
            java.lang.String r12 = com.veriff.sdk.internal.C21996md.m53646b((java.lang.String) r12)     // Catch:{ Exception -> 0x0449 }
            r9.put(r0, r12)     // Catch:{ Exception -> 0x0449 }
            java.lang.String r0 = "65"
            java.lang.String r12 = com.veriff.sdk.internal.C21996md.m53648c()     // Catch:{ Exception -> 0x0449 }
            r9.put(r0, r12)     // Catch:{ Exception -> 0x0449 }
            java.lang.String r0 = "66"
            java.lang.String r12 = com.veriff.sdk.internal.C21996md.m53647b((boolean) r11)     // Catch:{ Exception -> 0x0449 }
            r9.put(r0, r12)     // Catch:{ Exception -> 0x0449 }
            java.lang.String r0 = "67"
            java.lang.String r12 = com.veriff.sdk.internal.C21996md.m53647b((boolean) r10)     // Catch:{ Exception -> 0x0449 }
            r9.put(r0, r12)     // Catch:{ Exception -> 0x0449 }
            goto L_0x044d
        L_0x0441:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0449 }
            java.lang.String r12 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            r0.<init>(r12)     // Catch:{ Exception -> 0x0449 }
            throw r0     // Catch:{ Exception -> 0x0449 }
        L_0x0449:
            r0 = move-exception
            r0.printStackTrace()
        L_0x044d:
            r12 = 0
            java.io.BufferedReader r13 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0472 }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ Exception -> 0x0472 }
            java.lang.String r14 = "/proc/version"
            r0.<init>(r14)     // Catch:{ Exception -> 0x0472 }
            r14 = 256(0x100, float:3.59E-43)
            r13.<init>(r0, r14)     // Catch:{ Exception -> 0x0472 }
            java.lang.String r0 = "68"
            java.lang.String r14 = r13.readLine()     // Catch:{ all -> 0x0469 }
            p584jl.C17885a.m44462t(r13, r12)     // Catch:{ Exception -> 0x0472 }
            r9.put(r0, r14)     // Catch:{ Exception -> 0x0472 }
            goto L_0x0472
        L_0x0469:
            r0 = move-exception
            r14 = r0
            throw r14     // Catch:{ all -> 0x046c }
        L_0x046c:
            r0 = move-exception
            r15 = r0
            p584jl.C17885a.m44462t(r13, r14)     // Catch:{ Exception -> 0x0472 }
            throw r15     // Catch:{ Exception -> 0x0472 }
        L_0x0472:
            java.util.Map r0 = java.lang.System.getenv()
            java.lang.String r13 = "69"
            r9.put(r13, r0)
            int r0 = android.os.Process.myPid()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r13 = "70"
            r9.put(r13, r0)
            android.content.Context r0 = r1.f55505a
            java.lang.String r0 = com.veriff.sdk.internal.C21996md.m53651d(r0)
            java.lang.String r13 = "71"
            r9.put(r13, r0)
            android.content.Context r0 = r1.f55505a     // Catch:{ Exception -> 0x04f1 }
            java.lang.Object r0 = r0.getSystemService(r8)     // Catch:{ Exception -> 0x04f1 }
            if (r0 == 0) goto L_0x04e9
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0     // Catch:{ Exception -> 0x04f1 }
            java.util.List r0 = r0.getSensorList(r3)     // Catch:{ Exception -> 0x04f1 }
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ Exception -> 0x04f1 }
            r13.<init>()     // Catch:{ Exception -> 0x04f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x04f1 }
        L_0x04aa:
            boolean r14 = r0.hasNext()     // Catch:{ Exception -> 0x04f1 }
            if (r14 == 0) goto L_0x04e3
            java.lang.Object r14 = r0.next()     // Catch:{ Exception -> 0x04f1 }
            android.hardware.Sensor r14 = (android.hardware.Sensor) r14     // Catch:{ Exception -> 0x04f1 }
            mf0.C24362h.m61210e(r14, r8)     // Catch:{ JSONException -> 0x04aa }
            java.lang.String r15 = r14.getName()     // Catch:{ JSONException -> 0x04aa }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x04e0 }
            r2.<init>()     // Catch:{ JSONException -> 0x04e0 }
            java.lang.String r10 = r14.getVendor()     // Catch:{ JSONException -> 0x04dc }
            r2.append(r10)     // Catch:{ JSONException -> 0x04dc }
            r10 = 47
            r2.append(r10)     // Catch:{ JSONException -> 0x04dc }
            int r10 = r14.getVersion()     // Catch:{ JSONException -> 0x04dc }
            r2.append(r10)     // Catch:{ JSONException -> 0x04dc }
            java.lang.String r2 = r2.toString()     // Catch:{ JSONException -> 0x04dc }
            r13.put(r15, r2)     // Catch:{ JSONException -> 0x04dc }
        L_0x04dc:
            r2 = 29
            r10 = 1
            goto L_0x04aa
        L_0x04e0:
            r2 = 29
            goto L_0x04aa
        L_0x04e3:
            java.lang.String r0 = "72"
            r9.put(r0, r13)     // Catch:{ Exception -> 0x04f1 }
            goto L_0x04f1
        L_0x04e9:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x04f1 }
            java.lang.String r2 = "null cannot be cast to non-null type android.hardware.SensorManager"
            r0.<init>(r2)     // Catch:{ Exception -> 0x04f1 }
            throw r0     // Catch:{ Exception -> 0x04f1 }
        L_0x04f1:
            r0 = 5
            r2 = 2
            android.content.IntentFilter r8 = new android.content.IntentFilter     // Catch:{ Exception -> 0x0554 }
            java.lang.String r10 = "android.intent.action.BATTERY_CHANGED"
            r8.<init>(r10)     // Catch:{ Exception -> 0x0554 }
            android.content.Context r10 = r1.f55505a     // Catch:{ Exception -> 0x0554 }
            android.content.Intent r8 = r10.registerReceiver(r12, r8)     // Catch:{ Exception -> 0x0554 }
            if (r8 == 0) goto L_0x0554
            java.lang.String r10 = "73"
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ Exception -> 0x0554 }
            r13.<init>()     // Catch:{ Exception -> 0x0554 }
            int r14 = r8.getIntExtra(r7, r3)     // Catch:{ Exception -> 0x0554 }
            int r15 = r8.getIntExtra(r6, r3)     // Catch:{ Exception -> 0x0554 }
            r13.put(r6, r15)     // Catch:{ Exception -> 0x0554 }
            int r6 = r8.getIntExtra(r5, r3)     // Catch:{ Exception -> 0x0554 }
            r13.put(r5, r6)     // Catch:{ Exception -> 0x0554 }
            r13.put(r7, r14)     // Catch:{ Exception -> 0x0554 }
            java.lang.String r5 = "charging"
            if (r14 == r2) goto L_0x0527
            if (r14 != r0) goto L_0x0525
            goto L_0x0527
        L_0x0525:
            r6 = 0
            goto L_0x0528
        L_0x0527:
            r6 = 1
        L_0x0528:
            r13.put(r5, r6)     // Catch:{ Exception -> 0x0554 }
            java.lang.String r5 = "chargeplug"
            java.lang.String r6 = "plugged"
            int r6 = r8.getIntExtra(r6, r3)     // Catch:{ Exception -> 0x0554 }
            r13.put(r5, r6)     // Catch:{ Exception -> 0x0554 }
            int r5 = r8.getIntExtra(r4, r3)     // Catch:{ Exception -> 0x0554 }
            r13.put(r4, r5)     // Catch:{ Exception -> 0x0554 }
            r4 = r17
            int r5 = r8.getIntExtra(r4, r3)     // Catch:{ Exception -> 0x0554 }
            r13.put(r4, r5)     // Catch:{ Exception -> 0x0554 }
            r4 = r16
            int r3 = r8.getIntExtra(r4, r3)     // Catch:{ Exception -> 0x0554 }
            r13.put(r4, r3)     // Catch:{ Exception -> 0x0554 }
            bf0.d r3 = bf0.C21050d.f52856a     // Catch:{ Exception -> 0x0554 }
            r9.put(r10, r13)     // Catch:{ Exception -> 0x0554 }
        L_0x0554:
            android.content.Context r3 = r1.f55505a     // Catch:{ Exception -> 0x05ae }
            java.lang.String r4 = "clipboard"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch:{ Exception -> 0x05ae }
            if (r3 == 0) goto L_0x05a6
            android.content.ClipboardManager r3 = (android.content.ClipboardManager) r3     // Catch:{ Exception -> 0x05ae }
            android.content.ClipData r3 = r3.getPrimaryClip()     // Catch:{ Exception -> 0x05ae }
            if (r3 == 0) goto L_0x056b
            android.content.ClipData$Item r3 = r3.getItemAt(r11)     // Catch:{ Exception -> 0x05ae }
            goto L_0x056c
        L_0x056b:
            r3 = r12
        L_0x056c:
            if (r3 == 0) goto L_0x0572
            java.lang.CharSequence r12 = r3.getText()     // Catch:{ Exception -> 0x05ae }
        L_0x0572:
            java.lang.String r3 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x05ae }
            java.lang.String r4 = "74"
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ Exception -> 0x05ae }
            java.lang.String r6 = "%s.%d"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x05ae }
            int r8 = r3.hashCode()     // Catch:{ Exception -> 0x05ae }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x05ae }
            r7[r11] = r8     // Catch:{ Exception -> 0x05ae }
            int r3 = r3.length()     // Catch:{ Exception -> 0x05ae }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x05ae }
            r8 = 1
            r7[r8] = r3     // Catch:{ Exception -> 0x05ae }
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r7, r2)     // Catch:{ Exception -> 0x05ae }
            java.lang.String r3 = java.lang.String.format(r5, r6, r3)     // Catch:{ Exception -> 0x05ae }
            java.lang.String r5 = "java.lang.String.format(locale, format, *args)"
            mf0.C24362h.m61210e(r3, r5)     // Catch:{ Exception -> 0x05ae }
            r9.put(r4, r3)     // Catch:{ Exception -> 0x05ae }
            bf0.d r3 = bf0.C21050d.f52856a     // Catch:{ Exception -> 0x05ae }
            goto L_0x05af
        L_0x05a6:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x05ae }
            java.lang.String r4 = "null cannot be cast to non-null type android.content.ClipboardManager"
            r3.<init>(r4)     // Catch:{ Exception -> 0x05ae }
            throw r3     // Catch:{ Exception -> 0x05ae }
        L_0x05ae:
        L_0x05af:
            android.content.Context r3 = r1.f55505a
            java.lang.String r4 = "audio"
            java.lang.Object r3 = r3.getSystemService(r4)
            if (r3 == 0) goto L_0x0737
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            r4 = 7
            java.lang.Integer[] r5 = new java.lang.Integer[r4]
            r6 = 1
            int r7 = r3.getStreamVolume(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5[r11] = r7
            r7 = 3
            int r8 = r3.getStreamVolume(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5[r6] = r8
            r6 = 4
            int r8 = r3.getStreamVolume(r6)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5[r2] = r8
            int r8 = r3.getStreamVolume(r2)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5[r7] = r8
            int r8 = r3.getStreamVolume(r11)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5[r6] = r8
            int r8 = r3.getStreamVolume(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5[r0] = r8
            r8 = 8
            int r10 = r3.getStreamVolume(r8)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12 = 6
            r5[r12] = r10
            java.util.List r19 = p583jk.C17875h.m44281E(r5)
            r5 = 0
            r10 = 0
            com.veriff.sdk.internal.mb$c r23 = com.veriff.sdk.internal.C21989mb.C21992c.f55510a
            r25 = 30
            r21 = 0
            r22 = 0
            r24 = 30
            java.lang.String r20 = ","
            java.lang.String r13 = kotlin.collections.C23825c.m58520q0(r19, r20, r21, r22, r23, r24)
            java.lang.String r14 = "75"
            r9.put(r14, r13)
            java.lang.Integer[] r4 = new java.lang.Integer[r4]
            r13 = 1
            int r14 = r3.getStreamMaxVolume(r13)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r4[r11] = r14
            int r14 = r3.getStreamMaxVolume(r7)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r4[r13] = r14
            int r13 = r3.getStreamMaxVolume(r6)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r4[r2] = r13
            int r13 = r3.getStreamMaxVolume(r2)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r4[r7] = r13
            int r13 = r3.getStreamMaxVolume(r11)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r4[r6] = r13
            int r13 = r3.getStreamMaxVolume(r0)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r4[r0] = r13
            int r8 = r3.getStreamMaxVolume(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4[r12] = r8
            java.util.List r20 = p583jk.C17875h.m44281E(r4)
            com.veriff.sdk.internal.mb$a r24 = com.veriff.sdk.internal.C21989mb.C21990a.f55508a
            java.lang.String r21 = ","
            r22 = r5
            r23 = r10
            java.lang.String r4 = kotlin.collections.C23825c.m58520q0(r20, r21, r22, r23, r24, r25)
            java.lang.String r5 = "76"
            r9.put(r5, r4)
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            int r4 = r3.getMode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r11] = r4
            boolean r4 = r3.isMicrophoneMute()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 1
            r0[r5] = r4
            boolean r4 = r3.isMusicActive()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r2] = r4
            boolean r2 = r3.isSpeakerphoneOn()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r7] = r2
            boolean r2 = r3.isBluetoothA2dpOn()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r6] = r2
            java.util.List r12 = p583jk.C17875h.m44281E(r0)
            r14 = 0
            r15 = 0
            com.veriff.sdk.internal.mb$b r16 = com.veriff.sdk.internal.C21989mb.C21991b.f55509a
            r17 = 30
            java.lang.String r13 = ","
            java.lang.String r0 = kotlin.collections.C23825c.m58520q0(r12, r13, r14, r15, r16, r17)
            java.lang.String r2 = "77"
            r9.put(r2, r0)
            bf0.d r0 = bf0.C21050d.f52856a
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x0723 }
            r3 = 29
            if (r2 > r3) goto L_0x0723
            android.content.Context r2 = r1.f55505a     // Catch:{ JSONException -> 0x0723 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ JSONException -> 0x0723 }
            java.util.List r2 = r2.getInstalledPackages(r11)     // Catch:{ JSONException -> 0x0723 }
            java.lang.String r3 = "manager.getInstalledPackages(0)"
            mf0.C24362h.m61210e(r2, r3)     // Catch:{ JSONException -> 0x0723 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ JSONException -> 0x0723 }
        L_0x06ed:
            boolean r3 = r2.hasNext()     // Catch:{ JSONException -> 0x0723 }
            if (r3 == 0) goto L_0x0723
            java.lang.Object r3 = r2.next()     // Catch:{ JSONException -> 0x0723 }
            android.content.pm.PackageInfo r3 = (android.content.pm.PackageInfo) r3     // Catch:{ JSONException -> 0x0723 }
            android.content.pm.ApplicationInfo r4 = r3.applicationInfo     // Catch:{ JSONException -> 0x0723 }
            int r4 = r4.flags     // Catch:{ JSONException -> 0x0723 }
            r5 = 1
            r4 = r4 & r5
            if (r4 == r5) goto L_0x06ed
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0723 }
            r4.<init>()     // Catch:{ JSONException -> 0x0723 }
            java.lang.String r6 = "installTime"
            long r7 = r3.firstInstallTime     // Catch:{ JSONException -> 0x0723 }
            r4.put(r6, r7)     // Catch:{ JSONException -> 0x0723 }
            java.lang.String r6 = "updateTime"
            long r7 = r3.lastUpdateTime     // Catch:{ JSONException -> 0x0723 }
            r4.put(r6, r7)     // Catch:{ JSONException -> 0x0723 }
            java.lang.String r6 = "version"
            java.lang.String r7 = r3.versionName     // Catch:{ JSONException -> 0x0723 }
            r4.put(r6, r7)     // Catch:{ JSONException -> 0x0723 }
            bf0.d r6 = bf0.C21050d.f52856a     // Catch:{ JSONException -> 0x0723 }
            java.lang.String r3 = r3.packageName     // Catch:{ JSONException -> 0x0723 }
            r0.put(r3, r4)     // Catch:{ JSONException -> 0x0723 }
            goto L_0x06ed
        L_0x0723:
            java.lang.String r2 = "78"
            r9.put(r2, r0)
            java.lang.String r0 = com.veriff.sdk.internal.C21996md.m53650d()
            java.lang.String r2 = "79"
            r9.put(r2, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r9)
            return r0
        L_0x0737:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type android.media.AudioManager"
            r0.<init>(r2)
            throw r0
        L_0x073f:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type android.net.wifi.WifiManager"
            r0.<init>(r2)
            throw r0
        L_0x0747:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21989mb.m53631a(java.lang.String):org.json.JSONObject");
    }
}
