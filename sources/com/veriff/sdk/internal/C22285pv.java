package com.veriff.sdk.internal;

import bf0.C21050d;
import com.appsflyer.ServerParameters;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.veriff.sdk.internal.C21924kn;
import com.veriff.sdk.internal.permission.C22257e;
import ff0.C23349c;
import gf0.C23413c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import mf0.C24362h;
import mobi.lab.veriff.data.C24424c;
import mobi.lab.veriff.data.C24429e;
import mobi.lab.veriff.util.C24452e;
import mobi.lab.veriff.util.C24465j;
import p583jk.C17875h;
import p584jl.C17885a;
import wh0.C25177g;
import wh0.C25235z;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00109\u001a\u000208¢\u0006\u0004\bE\u0010FJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u001b\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0016R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R(\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000e0;8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010D\u0002\u0004\n\u0002\b\u0019¨\u0006G"}, mo59060d2 = {"Lcom/veriff/sdk/views/document/DocumentPresenter;", "Lcom/veriff/sdk/views/document/DocumentMVP$Presenter;", "Lcom/veriff/sdk/internal/analytics/EventSource;", "source", "Lbf0/d;", "onBackPressed", "onCloseButtonPressed", "", "type", "onDocumentRegistered", "(Ljava/lang/String;Lff0/c;)Ljava/lang/Object;", "", "throwable", "onDocumentSelectFailed", "Lmobi/lab/veriff/data/UiDocument;", "doc", "onDocumentSelected", "onInvalidSessionData", "onLanguageClicked", "location", "onNetworkFailedError", "onStatusChangeFailure", "documentType", "", "Lcom/veriff/sdk/internal/data/FlowStep;", "steps", "onStatusChangeSuccess", "start", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "Lmobi/lab/veriff/data/Country;", "country", "Lmobi/lab/veriff/data/Country;", "getCountry", "()Lmobi/lab/veriff/data/Country;", "setCountry", "(Lmobi/lab/veriff/data/Country;)V", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "Lcom/veriff/sdk/views/document/DocumentMVP$Model;", "model", "Lcom/veriff/sdk/views/document/DocumentMVP$Model;", "Lcom/veriff/sdk/views/nfc/NfcClient;", "nfcClient", "Lcom/veriff/sdk/views/nfc/NfcClient;", "Lcom/veriff/sdk/internal/permission/Permissions;", "permissions", "Lcom/veriff/sdk/internal/permission/Permissions;", "Lwh0/z;", "scope", "Lwh0/z;", "Lcom/veriff/sdk/internal/data/StartSessionData;", "sessionData", "Lcom/veriff/sdk/internal/data/StartSessionData;", "", "supportedDocs", "[Lmobi/lab/veriff/data/UiDocument;", "getSupportedDocs", "()[Lmobi/lab/veriff/data/UiDocument;", "setSupportedDocs", "([Lmobi/lab/veriff/data/UiDocument;)V", "Lcom/veriff/sdk/views/document/DocumentMVP$View;", "view", "Lcom/veriff/sdk/views/document/DocumentMVP$View;", "<init>", "(Lcom/veriff/sdk/views/document/DocumentMVP$View;Lcom/veriff/sdk/views/document/DocumentMVP$Model;Lcom/veriff/sdk/internal/analytics/Analytics;Lcom/veriff/sdk/internal/errors/ErrorReporter;Lcom/veriff/sdk/internal/data/FeatureFlags;Lcom/veriff/sdk/internal/permission/Permissions;Lcom/veriff/sdk/views/nfc/NfcClient;Lwh0/z;Lcom/veriff/sdk/internal/data/StartSessionData;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.pv */
public final class C22285pv implements pr$b {

    /* renamed from: a */
    public C24424c f56208a;

    /* renamed from: c */
    private final pr$c f56209c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final pr$a f56210d;

    /* renamed from: e */
    private final C21645fu f56211e;

    /* renamed from: f */
    private final C21910kf f56212f;

    /* renamed from: g */
    private final C21789ix f56213g;

    /* renamed from: h */
    private final C22257e f56214h;

    /* renamed from: i */
    private final C22420rr f56215i;

    /* renamed from: j */
    private final C25235z f56216j;

    /* renamed from: k */
    private final C21895jw f56217k;

    @C23413c(mo58554c = "com.veriff.sdk.views.document.DocumentPresenter", mo58555f = "DocumentPresenter.kt", mo58556l = {151}, mo58557m = "onDocumentRegistered")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H@"}, mo59060d2 = {"", "type", "Lff0/c;", "Lbf0/d;", "continuation", "", "onDocumentRegistered"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.pv$a */
    public static final class C22286a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f56218a;

        /* renamed from: b */
        public int f56219b;

        /* renamed from: c */
        public final /* synthetic */ C22285pv f56220c;

        /* renamed from: d */
        public Object f56221d;

        /* renamed from: e */
        public Object f56222e;

        /* renamed from: f */
        public Object f56223f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22286a(C22285pv pvVar, C23349c cVar) {
            super(cVar);
            this.f56220c = pvVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f56218a = obj;
            this.f56219b |= Integer.MIN_VALUE;
            return this.f56220c.mo56289a((String) null, (C23349c<? super C21050d>) this);
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.document.DocumentPresenter$onDocumentSelected$1", mo58555f = "DocumentPresenter.kt", mo58556l = {77, 79}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.pv$b */
    public static final class C22287b extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f56224a;

        /* renamed from: b */
        public final /* synthetic */ C22285pv f56225b;

        /* renamed from: c */
        public final /* synthetic */ C24429e f56226c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22287b(C22285pv pvVar, C24429e eVar, C23349c cVar) {
            super(2, cVar);
            this.f56225b = pvVar;
            this.f56226c = eVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22287b(this.f56225b, this.f56226c, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22287b) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f56224a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                pr$a a = this.f56225b.f56210d;
                String a2 = this.f56226c.mo60618a();
                C24362h.m61210e(a2, "doc.key");
                String a3 = this.f56225b.mo56290d().mo60581a();
                C24362h.m61210e(a3, "country.code");
                this.f56224a = 1;
                obj = a.mo56274a(a2, a3, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C17885a.m44475z0(obj);
            } else if (i == 2) {
                C17885a.m44475z0(obj);
                return C21050d.f52856a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C21924kn knVar = (C21924kn) obj;
            if (knVar instanceof C21924kn.C21927c) {
                C22285pv pvVar = this.f56225b;
                String a4 = this.f56226c.mo60618a();
                C24362h.m61210e(a4, "doc.key");
                this.f56224a = 2;
                if (pvVar.mo56289a(a4, (C23349c<? super C21050d>) this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (knVar instanceof C21924kn.C21925a) {
                this.f56225b.m54321a((Throwable) ((C21924kn.C21925a) knVar).mo55705a(), "Document selection");
            } else if (knVar instanceof C21924kn.C21926b) {
                C22285pv pvVar2 = this.f56225b;
                StringBuilder k = C13555b.m33972k("Backend call failed with ");
                k.append(((C21924kn.C21926b) knVar).mo55709a());
                pvVar2.m54320a((Throwable) new IllegalStateException(k.toString()));
            } else if (knVar instanceof C21924kn.C21928d) {
                this.f56225b.m54320a(((C21924kn.C21928d) knVar).mo55719a());
            }
            return C21050d.f52856a;
        }
    }

    public C22285pv(pr$c pr_c, pr$a pr_a, C21645fu fuVar, C21910kf kfVar, C21789ix ixVar, C22257e eVar, C22420rr rrVar, C25235z zVar, C21895jw jwVar) {
        C24362h.m61211f(pr_c, Promotion.ACTION_VIEW);
        C24362h.m61211f(pr_a, ServerParameters.MODEL);
        C24362h.m61211f(fuVar, "analytics");
        C24362h.m61211f(kfVar, "errorReporter");
        C24362h.m61211f(ixVar, "featureFlags");
        C24362h.m61211f(eVar, "permissions");
        C24362h.m61211f(rrVar, "nfcClient");
        C24362h.m61211f(zVar, "scope");
        C24362h.m61211f(jwVar, "sessionData");
        this.f56209c = pr_c;
        this.f56210d = pr_a;
        this.f56211e = fuVar;
        this.f56212f = kfVar;
        this.f56213g = ixVar;
        this.f56214h = eVar;
        this.f56215i = rrVar;
        this.f56216j = zVar;
        this.f56217k = jwVar;
    }

    /* renamed from: b */
    public void mo56280b() {
        C22288pw.f56227a.mo60705d("onLanguageClicked()");
        this.f56209c.mo56282a();
    }

    /* renamed from: c */
    public void mo56281c() {
        C22288pw.f56227a.mo60705d("onCloseButtonPresssed()");
        this.f56209c.mo56287b(C21719gi.CLOSE_BUTTON);
    }

    /* renamed from: d */
    public final C24424c mo56290d() {
        C24424c cVar = this.f56208a;
        if (cVar != null) {
            return cVar;
        }
        C24362h.m61217l(ServerParameters.COUNTRY);
        throw null;
    }

    /* renamed from: b */
    private final void m54322b(Throwable th) {
        C22288pw.f56227a.mo60706d("onStatusChangeFailure()", th);
        this.f56209c.mo56283a(22);
        this.f56212f.mo55690a(th, "onStatusChangeFailure()", C21720gj.document_selection);
    }

    /* renamed from: a */
    public void mo56242a() {
        C24424c a = this.f56210d.mo56275a();
        if (a == null) {
            this.f56212f.mo55689a(new IllegalArgumentException("Doc presenter started without any country"));
            this.f56209c.mo56283a(22);
            return;
        }
        this.f56208a = a;
        if (this.f56217k.mo55645f() != null) {
            this.f56210d.mo56276a(this.f56217k.mo55645f());
            pr$c pr_c = this.f56209c;
            C24429e[] a2 = C24452e.m61506a((List<String>) C17875h.m44280D(this.f56217k.mo55645f()));
            C24362h.m61210e(a2, "getUiDocument(listOf(ses…ata.preselectedDocument))");
            pr_c.mo56286a(a2);
            return;
        }
        C24424c cVar = this.f56208a;
        if (cVar != null) {
            C24429e[] a3 = C24452e.m61506a(cVar.mo60584c());
            C24362h.m61210e(a3, "getUiDocument(this.country.docs)");
            this.f56209c.mo56286a(a3);
            return;
        }
        C24362h.m61217l(ServerParameters.COUNTRY);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo56289a(java.lang.String r13, ff0.C23349c<? super bf0.C21050d> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.veriff.sdk.internal.C22285pv.C22286a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.veriff.sdk.internal.pv$a r0 = (com.veriff.sdk.internal.C22285pv.C22286a) r0
            int r1 = r0.f56219b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f56219b = r1
            goto L_0x0018
        L_0x0013:
            com.veriff.sdk.internal.pv$a r0 = new com.veriff.sdk.internal.pv$a
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f56218a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f56219b
            r3 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r13 = r0.f56223f
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r1 = r0.f56222e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f56221d
            com.veriff.sdk.internal.pv r0 = (com.veriff.sdk.internal.C22285pv) r0
            p584jl.C17885a.m44475z0(r14)
            r11 = r14
            r14 = r13
            r13 = r1
            r1 = r0
            r0 = r11
            goto L_0x00e7
        L_0x0039:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0041:
            p584jl.C17885a.m44475z0(r14)
            mobi.lab.veriff.util.j r14 = com.veriff.sdk.internal.C22288pw.f56227a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Document selection registered: "
            r2.append(r4)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            r14.mo60705d(r2)
            com.veriff.sdk.internal.iy$a r14 = com.veriff.sdk.internal.C21791iy.f55198q
            mobi.lab.veriff.data.c r6 = r12.f56208a
            r2 = 0
            java.lang.String r10 = "country"
            if (r6 == 0) goto L_0x0135
            com.veriff.sdk.internal.permission.e r4 = r12.f56214h
            com.veriff.sdk.internal.permission.c r5 = com.veriff.sdk.internal.permission.C22254c.Nfc
            boolean r7 = r4.mo56205a(r5)
            com.veriff.sdk.internal.rr r4 = r12.f56215i
            boolean r8 = r4.mo56466b()
            com.veriff.sdk.internal.ix r9 = r12.f56213g
            r4 = r14
            r5 = r13
            com.veriff.sdk.internal.gf$f r4 = r4.mo55537a((java.lang.String) r5, (mobi.lab.veriff.data.C24424c) r6, (boolean) r7, (boolean) r8, (com.veriff.sdk.internal.C21789ix) r9)
            if (r4 != 0) goto L_0x0080
            r5 = 1
            r8 = 1
            goto L_0x0082
        L_0x0080:
            r5 = 0
            r8 = 0
        L_0x0082:
            if (r8 == 0) goto L_0x0095
            com.veriff.sdk.internal.fu r4 = r12.f56211e
            com.veriff.sdk.internal.ix r5 = r12.f56213g
            com.veriff.sdk.internal.gf r5 = com.veriff.sdk.internal.C21716gg.m52950g(r5)
            java.lang.String r6 = "EventFactory.nfcEnabled(featureFlags)"
            mf0.C24362h.m61210e(r5, r6)
            r4.mo54921a((com.veriff.sdk.internal.C21667gf) r5)
            goto L_0x00a5
        L_0x0095:
            com.veriff.sdk.internal.fu r5 = r12.f56211e
            com.veriff.sdk.internal.ix r6 = r12.f56213g
            com.veriff.sdk.internal.gf r4 = com.veriff.sdk.internal.C21716gg.m52887a((com.veriff.sdk.internal.C21667gf.C21713f) r4, (com.veriff.sdk.internal.C21789ix) r6)
            java.lang.String r6 = "EventFactory.nfcDisabled…bledReason, featureFlags)"
            mf0.C24362h.m61210e(r4, r6)
            r5.mo54921a((com.veriff.sdk.internal.C21667gf) r4)
        L_0x00a5:
            com.veriff.sdk.internal.ix r5 = r12.f56213g
            mobi.lab.veriff.data.c r7 = r12.f56208a
            if (r7 == 0) goto L_0x0131
            com.veriff.sdk.internal.jw r2 = r12.f56217k
            boolean r9 = com.veriff.sdk.internal.C21898jx.m53438a(r2)
            r4 = r14
            r6 = r13
            java.util.List r14 = r4.mo55539a((com.veriff.sdk.internal.C21789ix) r5, (java.lang.String) r6, (mobi.lab.veriff.data.C24424c) r7, (boolean) r8, (boolean) r9)
            boolean r2 = r14.isEmpty()
            if (r2 == 0) goto L_0x00d5
            com.veriff.sdk.internal.kf r13 = r12.f56212f
            java.lang.Throwable r14 = new java.lang.Throwable
            java.lang.String r0 = "Number of verifications steps are empty"
            r14.<init>(r0)
            com.veriff.sdk.internal.gj r0 = com.veriff.sdk.internal.C21720gj.session_start
            java.lang.String r1 = "DocumentPresenter#onDocumentRegistered()"
            r13.mo55690a(r14, r1, r0)
            com.veriff.sdk.internal.pr$c r13 = r12.f56209c
            r14 = 22
            r13.mo56283a((int) r14)
            goto L_0x012e
        L_0x00d5:
            com.veriff.sdk.internal.pr$a r2 = r12.f56210d
            r0.f56221d = r12
            r0.f56222e = r13
            r0.f56223f = r14
            r0.f56219b = r3
            java.lang.Object r0 = r2.mo56273a(r13, r0)
            if (r0 != r1) goto L_0x00e6
            return r1
        L_0x00e6:
            r1 = r12
        L_0x00e7:
            com.veriff.sdk.internal.kn r0 = (com.veriff.sdk.internal.C21924kn) r0
            boolean r2 = r0 instanceof com.veriff.sdk.internal.C21924kn.C21927c
            if (r2 == 0) goto L_0x00f1
            r1.m54319a((java.lang.String) r13, (java.util.List<? extends com.veriff.sdk.internal.C21791iy>) r14)
            goto L_0x012e
        L_0x00f1:
            boolean r13 = r0 instanceof com.veriff.sdk.internal.C21924kn.C21925a
            if (r13 == 0) goto L_0x0101
            com.veriff.sdk.internal.kn$a r0 = (com.veriff.sdk.internal.C21924kn.C21925a) r0
            java.io.IOException r13 = r0.mo55705a()
            java.lang.String r14 = "changeStatusToStarted"
            r1.m54321a((java.lang.Throwable) r13, (java.lang.String) r14)
            goto L_0x012e
        L_0x0101:
            boolean r13 = r0 instanceof com.veriff.sdk.internal.C21924kn.C21926b
            if (r13 == 0) goto L_0x0121
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Backend call failed with "
            java.lang.StringBuilder r14 = p379.C13555b.m33972k(r14)
            com.veriff.sdk.internal.kn$b r0 = (com.veriff.sdk.internal.C21924kn.C21926b) r0
            int r0 = r0.mo55709a()
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            r1.m54322b(r13)
            goto L_0x012e
        L_0x0121:
            boolean r13 = r0 instanceof com.veriff.sdk.internal.C21924kn.C21928d
            if (r13 == 0) goto L_0x012e
            com.veriff.sdk.internal.kn$d r0 = (com.veriff.sdk.internal.C21924kn.C21928d) r0
            java.lang.Throwable r13 = r0.mo55719a()
            r1.m54322b(r13)
        L_0x012e:
            bf0.d r13 = bf0.C21050d.f52856a
            return r13
        L_0x0131:
            mf0.C24362h.m61217l(r10)
            throw r2
        L_0x0135:
            mf0.C24362h.m61217l(r10)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22285pv.mo56289a(java.lang.String, ff0.c):java.lang.Object");
    }

    /* renamed from: a */
    public void mo56279a(C24429e eVar) {
        C24362h.m61211f(eVar, "doc");
        C24465j a = C22288pw.f56227a;
        a.mo60705d("onDocumentSelected(" + eVar + ')');
        C21645fu fuVar = this.f56211e;
        C21667gf b = C21716gg.m52922b(eVar.mo60618a());
        C24362h.m61210e(b, "EventFactory.documentTypeSelected(doc.key)");
        fuVar.mo54921a(b);
        this.f56210d.mo56276a(eVar.mo60618a());
        C25177g.m63218b(this.f56216j, (CoroutineContext) null, new C22287b(this, eVar, (C23349c) null), 3);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m54321a(Throwable th, String str) {
        this.f56209c.mo56283a(24);
        this.f56212f.mo55691b(th, str, C21720gj.document_selection);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m54320a(Throwable th) {
        C22288pw.f56227a.mo60706d("Document selection failed", th);
        this.f56209c.mo56283a(22);
        this.f56212f.mo55690a(th, "onDocumentSelectFailed()", C21720gj.document_selection);
    }

    /* renamed from: a */
    private final void m54319a(String str, List<? extends C21791iy> list) {
        C22288pw.f56227a.mo60705d("onStatusChangeSuccess()");
        C21645fu fuVar = this.f56211e;
        C21667gf i = C21716gg.m52953i();
        C24362h.m61210e(i, "EventFactory.flowStarted()");
        fuVar.mo54921a(i);
        C21645fu fuVar2 = this.f56211e;
        C21667gf a = C21716gg.m52891a(this.f56213g);
        C24362h.m61210e(a, "EventFactory.sessionStarted(featureFlags)");
        fuVar2.mo54921a(a);
        pr$c pr_c = this.f56209c;
        C24424c cVar = this.f56208a;
        if (cVar != null) {
            pr_c.mo56285a(str, cVar, list);
        } else {
            C24362h.m61217l(ServerParameters.COUNTRY);
            throw null;
        }
    }

    /* renamed from: a */
    public void mo56278a(C21719gi giVar) {
        C24362h.m61211f(giVar, "source");
        C22288pw.f56227a.mo60705d("onBackPressed(), showing confirm exit dialog");
        if (this.f56210d.mo56277b()) {
            this.f56209c.mo56287b(giVar);
        } else {
            this.f56209c.mo56284a(giVar);
        }
    }
}
