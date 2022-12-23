package com.veriff.sdk.internal;

import android.content.Context;
import bf0.C21050d;
import com.appboy.models.outgoing.FacebookUser;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C21667gf;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import lf0.C24240p;
import mf0.C24362h;
import p584jl.C17885a;
import wh0.C25177g;
import wh0.C25211r0;
import wh0.C25235z;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J \u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, mo59060d2 = {"Lcom/veriff/sdk/internal/errors/BackendErrorReporter;", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "", "e", "Lbf0/d;", "reportCrash", "Lcom/veriff/sdk/internal/analytics/Event$ErrorReportSeverity;", "severity", "", "location", "Lcom/veriff/sdk/internal/analytics/FeatureArea;", "feature", "reportError", "reportNotice", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "Lmobi/lab/veriff/network/VeriffApi$ApiService;", "apiService", "Lmobi/lab/veriff/network/VeriffApi$ApiService;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lkotlinx/coroutines/CoroutineDispatcher;", "main", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Landroid/content/Context;Lcom/veriff/sdk/internal/analytics/Analytics;Lmobi/lab/veriff/network/VeriffApi$ApiService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.kb */
public final class C21905kb implements C21910kf {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f55377a;

    /* renamed from: b */
    private final C21645fu f55378b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final xb$a f55379c;

    /* renamed from: d */
    private final CoroutineDispatcher f55380d;

    @C23413c(mo58554c = "com.veriff.sdk.internal.errors.BackendErrorReporter$reportError$1", mo58555f = "BackendErrorReporter.kt", mo58556l = {47}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.kb$a */
    public static final class C21906a extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55381a;

        /* renamed from: b */
        public final /* synthetic */ C21905kb f55382b;

        /* renamed from: c */
        public final /* synthetic */ Throwable f55383c;

        /* renamed from: d */
        public final /* synthetic */ String f55384d;

        /* renamed from: e */
        public final /* synthetic */ C21667gf.C21710c f55385e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21906a(C21905kb kbVar, Throwable th, String str, C21667gf.C21710c cVar, C23349c cVar2) {
            super(2, cVar2);
            this.f55382b = kbVar;
            this.f55383c = th;
            this.f55384d = str;
            this.f55385e = cVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C21906a(this.f55382b, this.f55383c, this.f55384d, this.f55385e, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C21906a) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f55381a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                xb$a a = this.f55382b.f55379c;
                C21887jt a2 = C21893ju.m53420a(this.f55383c, this.f55382b.f55377a, this.f55384d, C21907kc.m53466b(this.f55385e));
                this.f55381a = 1;
                if (a.mo57054a(a2, (C23349c<? super C21924kn<C22558tn>>) this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C17885a.m44475z0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C21050d.f52856a;
        }
    }

    public C21905kb(Context context, C21645fu fuVar, xb$a xb_a, CoroutineDispatcher coroutineDispatcher) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(fuVar, "analytics");
        C24362h.m61211f(xb_a, "apiService");
        C24362h.m61211f(coroutineDispatcher, "main");
        this.f55377a = context;
        this.f55378b = fuVar;
        this.f55379c = xb_a;
        this.f55380d = coroutineDispatcher;
    }

    /* renamed from: a */
    public void mo55689a(Throwable th) {
        C24362h.m61211f(th, "e");
        m53460a(th, C21667gf.C21710c.f54902a, "Uncaught exception", C21720gj.unknown);
    }

    /* renamed from: b */
    public void mo55691b(Throwable th, String str, C21720gj gjVar) {
        C24362h.m61211f(th, "e");
        C24362h.m61211f(str, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        C24362h.m61211f(gjVar, "feature");
        m53460a(th, C21667gf.C21710c.notice, str, gjVar);
    }

    /* renamed from: a */
    public void mo55690a(Throwable th, String str, C21720gj gjVar) {
        C24362h.m61211f(th, "e");
        C24362h.m61211f(str, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        C24362h.m61211f(gjVar, "feature");
        m53460a(th, C21667gf.C21710c.error, str, gjVar);
    }

    /* renamed from: a */
    private final void m53460a(Throwable th, C21667gf.C21710c cVar, String str, C21720gj gjVar) {
        C21645fu fuVar = this.f55378b;
        C21667gf a = C21716gg.m52885a(cVar, th, str, gjVar);
        C24362h.m61210e(a, "EventFactory.errorCaptur…ty, e, location, feature)");
        fuVar.mo54921a(a);
        if (cVar != C21667gf.C21710c.notice) {
            C25177g.m63218b(C25211r0.f63482b, this.f55380d, new C21906a(this, th, str, cVar, (C23349c) null), 2);
        }
    }
}
