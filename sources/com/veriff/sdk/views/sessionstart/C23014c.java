package com.veriff.sdk.views.sessionstart;

import bf0.C21050d;
import ci0.C21206a;
import com.appsflyer.ServerParameters;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.veriff.sdk.internal.C21645fu;
import com.veriff.sdk.internal.C21667gf;
import com.veriff.sdk.internal.C21716gg;
import com.veriff.sdk.internal.C21719gi;
import com.veriff.sdk.internal.C21720gj;
import com.veriff.sdk.internal.C21787iw;
import com.veriff.sdk.internal.C21789ix;
import com.veriff.sdk.internal.C21886js;
import com.veriff.sdk.internal.C21895jw;
import com.veriff.sdk.internal.C21903ka;
import com.veriff.sdk.internal.C21910kf;
import com.veriff.sdk.internal.C21924kn;
import com.veriff.sdk.internal.C22199oh;
import com.veriff.sdk.internal.C22556tm;
import com.veriff.sdk.internal.C22559to;
import com.veriff.sdk.internal.C22574ts;
import com.veriff.sdk.internal.C22607uy;
import com.veriff.sdk.internal.C22609uz;
import com.veriff.sdk.internal.C22611va;
import com.veriff.sdk.internal.C22613vc;
import com.veriff.sdk.internal.C22614vd;
import com.veriff.sdk.internal.C22616ve;
import com.veriff.sdk.internal.C22619vg;
import com.veriff.sdk.internal.C22621vh;
import ff0.C23349c;
import gf0.C23413c;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf0.C24240p;
import mf0.C24362h;
import mobi.lab.veriff.util.C24454g;
import mobi.lab.veriff.util.C24465j;
import p584jl.C17885a;
import wh0.C25162c0;
import wh0.C25177g;
import wh0.C25184i0;
import wh0.C25235z;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BG\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010'\u001a\u00020\u001d¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0012H\u0016J\b\u0010\u0019\u001a\u00020\u0002H\u0016R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001fR\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010-\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, mo59060d2 = {"Lcom/veriff/sdk/views/sessionstart/SessionStartPresenter;", "Lcom/veriff/sdk/views/sessionstart/SessionStartMVP$Presenter;", "Lbf0/d;", "exitCancelled", "exiting", "Lcom/veriff/sdk/internal/network/ApiResult;", "Lmobi/lab/veriff/data/api/request/response/StartSessionResponse;", "response", "handleStartSessionResponse", "onBackPressed", "", "throwable", "", "location", "onNetworkFailedError", "onStartSessionRequestFailure", "onStartSessionRequestSuccess", "onVersionDeprecated", "Lcom/veriff/sdk/internal/data/StartSessionData;", "data", "proceedToView", "reportNullFlags", "sendClientStarted", "sessionData", "sessionInitSuccessful", "start", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "Lwh0/z;", "coroutineScope", "Lwh0/z;", "Lcom/veriff/sdk/internal/data/StartSessionData;", "Lcom/veriff/sdk/views/autocapture/DetectorProvider;", "detectorProvider", "Lcom/veriff/sdk/views/autocapture/DetectorProvider;", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "globalScope", "", "isExiting", "Z", "isRelaunch", "Lcom/veriff/sdk/views/sessionstart/SessionStartMVP$Model;", "model", "Lcom/veriff/sdk/views/sessionstart/SessionStartMVP$Model;", "Lcom/veriff/sdk/views/sessionstart/SessionStartMVP$View;", "view", "Lcom/veriff/sdk/views/sessionstart/SessionStartMVP$View;", "<init>", "(Lcom/veriff/sdk/views/sessionstart/SessionStartMVP$View;Lcom/veriff/sdk/views/sessionstart/SessionStartMVP$Model;Lcom/veriff/sdk/internal/analytics/Analytics;Lcom/veriff/sdk/internal/errors/ErrorReporter;Lcom/veriff/sdk/views/autocapture/DetectorProvider;ZLwh0/z;Lwh0/z;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.sessionstart.c */
public final class C23014c implements a$b {

    /* renamed from: a */
    private boolean f58363a;

    /* renamed from: b */
    private C21895jw f58364b;

    /* renamed from: c */
    private final a$c f58365c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final a$a f58366d;

    /* renamed from: e */
    private final C21645fu f58367e;

    /* renamed from: f */
    private final C21910kf f58368f;

    /* renamed from: g */
    private final C22199oh f58369g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final boolean f58370h;

    /* renamed from: i */
    private final C25235z f58371i;

    /* renamed from: j */
    private final C25235z f58372j;

    @C23413c(mo58554c = "com.veriff.sdk.views.sessionstart.SessionStartPresenter$onStartSessionRequestSuccess$1", mo58555f = "SessionStartPresenter.kt", mo58556l = {187}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.sessionstart.c$a */
    public static final class C23015a extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f58373a;

        /* renamed from: b */
        public final /* synthetic */ C23014c f58374b;

        /* renamed from: c */
        public final /* synthetic */ C21895jw f58375c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23015a(C23014c cVar, C21895jw jwVar, C23349c cVar2) {
            super(2, cVar2);
            this.f58374b = cVar;
            this.f58375c = jwVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C23015a(this.f58374b, this.f58375c, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C23015a) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f58373a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                C21206a aVar = C25184i0.f63460b;
                C230161 r1 = new C24240p<C25235z, C23349c<? super C21050d>, Object>(this, (C23349c) null) {

                    /* renamed from: a */
                    public int f58376a;

                    /* renamed from: b */
                    public final /* synthetic */ C23015a f58377b;

                    {
                        this.f58377b = r1;
                    }

                    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                        C24362h.m61211f(cVar, "completion");
                        return 

                        @C23413c(mo58554c = "com.veriff.sdk.views.sessionstart.SessionStartPresenter$onStartSessionRequestSuccess$2", mo58555f = "SessionStartPresenter.kt", mo58556l = {194}, mo58557m = "invokeSuspend")
                        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
                        /* renamed from: com.veriff.sdk.views.sessionstart.c$b */
                        public static final class C23017b extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

                            /* renamed from: a */
                            public int f58378a;

                            /* renamed from: b */
                            public final /* synthetic */ C23014c f58379b;

                            /* renamed from: c */
                            public final /* synthetic */ C22609uz f58380c;

                            /* renamed from: d */
                            public final /* synthetic */ C21895jw f58381d;

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            public C23017b(C23014c cVar, C22609uz uzVar, C21895jw jwVar, C23349c cVar2) {
                                super(2, cVar2);
                                this.f58379b = cVar;
                                this.f58380c = uzVar;
                                this.f58381d = jwVar;
                            }

                            public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                                C24362h.m61211f(cVar, "completion");
                                return new C23017b(this.f58379b, this.f58380c, this.f58381d, cVar);
                            }

                            public final Object invoke(Object obj, Object obj2) {
                                return ((C23017b) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
                            }

                            public final Object invokeSuspend(Object obj) {
                                String str;
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                int i = this.f58378a;
                                if (i == 0) {
                                    C17885a.m44475z0(obj);
                                    a$a a = this.f58379b.f58366d;
                                    C22574ts c = this.f58380c.mo56905c();
                                    if (c != null) {
                                        str = c.mo56820a();
                                    } else {
                                        str = null;
                                    }
                                    String b = this.f58379b.f58366d.mo57945b();
                                    boolean b2 = this.f58379b.f58370h;
                                    this.f58378a = 1;
                                    obj = a.mo57943a(str, b, b2, this);
                                    if (obj == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } else if (i == 1) {
                                    C17885a.m44475z0(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                this.f58379b.mo57951a(C21895jw.m53424a(this.f58381d, (C22619vg) null, (C22619vg) null, (C21789ix) null, (String) null, (String) null, (String) null, (C22607uy) null, ((C24454g) obj).mo60678c(), (List) null, 383, (Object) null));
                                return C21050d.f52856a;
                            }
                        }

                        @C23413c(mo58554c = "com.veriff.sdk.views.sessionstart.SessionStartPresenter$start$1", mo58555f = "SessionStartPresenter.kt", mo58556l = {53, 55}, mo58557m = "invokeSuspend")
                        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
                        /* renamed from: com.veriff.sdk.views.sessionstart.c$c */
                        public static final class C23018c extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

                            /* renamed from: a */
                            public int f58382a;

                            /* renamed from: b */
                            public final /* synthetic */ C23014c f58383b;

                            /* renamed from: c */
                            private /* synthetic */ Object f58384c;

                            @C23413c(mo58554c = "com.veriff.sdk.views.sessionstart.SessionStartPresenter$start$1$languageInit$1", mo58555f = "SessionStartPresenter.kt", mo58556l = {52}, mo58557m = "invokeSuspend")
                            @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lmobi/lab/veriff/util/LanguageCountryLocale;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
                            /* renamed from: com.veriff.sdk.views.sessionstart.c$c$a */
                            public static final class C23019a extends SuspendLambda implements C24240p<C25235z, C23349c<? super C24454g>, Object> {

                                /* renamed from: a */
                                public int f58385a;

                                /* renamed from: b */
                                public final /* synthetic */ C23018c f58386b;

                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                public C23019a(C23018c cVar, C23349c cVar2) {
                                    super(2, cVar2);
                                    this.f58386b = cVar;
                                }

                                public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                                    C24362h.m61211f(cVar, "completion");
                                    return new C23019a(this.f58386b, cVar);
                                }

                                public final Object invoke(Object obj, Object obj2) {
                                    return ((C23019a) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
                                }

                                public final Object invokeSuspend(Object obj) {
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    int i = this.f58385a;
                                    if (i == 0) {
                                        C17885a.m44475z0(obj);
                                        a$a a = this.f58386b.f58383b.f58366d;
                                        String b = this.f58386b.f58383b.f58366d.mo57945b();
                                        boolean b2 = this.f58386b.f58383b.f58370h;
                                        this.f58385a = 1;
                                        obj = a.mo57943a((String) null, b, b2, this);
                                        if (obj == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } else if (i == 1) {
                                        C17885a.m44475z0(obj);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    return obj;
                                }
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            public C23018c(C23014c cVar, C23349c cVar2) {
                                super(2, cVar2);
                                this.f58383b = cVar;
                            }

                            public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                                C24362h.m61211f(cVar, "completion");
                                C23018c cVar2 = new C23018c(this.f58383b, cVar);
                                cVar2.f58384c = obj;
                                return cVar2;
                            }

                            public final Object invoke(Object obj, Object obj2) {
                                return ((C23018c) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
                            }

                            public final Object invokeSuspend(Object obj) {
                                C21924kn knVar;
                                C25162c0 c0Var;
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                int i = this.f58382a;
                                if (i == 0) {
                                    C17885a.m44475z0(obj);
                                    c0Var = C25177g.m63217a((C25235z) this.f58384c, new C23019a(this, (C23349c) null));
                                    a$a a = this.f58383b.f58366d;
                                    this.f58384c = c0Var;
                                    this.f58382a = 1;
                                    obj = a.mo57942a(this);
                                    if (obj == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } else if (i == 1) {
                                    c0Var = (C25162c0) this.f58384c;
                                    C17885a.m44475z0(obj);
                                } else if (i == 2) {
                                    knVar = (C21924kn) this.f58384c;
                                    C17885a.m44475z0(obj);
                                    this.f58383b.m56856a((C21924kn<C22609uz>) knVar);
                                    return C21050d.f52856a;
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                C21924kn knVar2 = (C21924kn) obj;
                                this.f58384c = knVar2;
                                this.f58382a = 2;
                                if (c0Var.mo61764h(this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                knVar = knVar2;
                                this.f58383b.m56856a((C21924kn<C22609uz>) knVar);
                                return C21050d.f52856a;
                            }
                        }

                        public C23014c(a$c a_c, a$a a_a, C21645fu fuVar, C21910kf kfVar, C22199oh ohVar, boolean z, C25235z zVar, C25235z zVar2) {
                            C24362h.m61211f(a_c, Promotion.ACTION_VIEW);
                            C24362h.m61211f(a_a, ServerParameters.MODEL);
                            C24362h.m61211f(fuVar, "analytics");
                            C24362h.m61211f(kfVar, "errorReporter");
                            C24362h.m61211f(ohVar, "detectorProvider");
                            C24362h.m61211f(zVar, "coroutineScope");
                            C24362h.m61211f(zVar2, "globalScope");
                            this.f58365c = a_c;
                            this.f58366d = a_a;
                            this.f58367e = fuVar;
                            this.f58368f = kfVar;
                            this.f58369g = ohVar;
                            this.f58370h = z;
                            this.f58371i = zVar;
                            this.f58372j = zVar2;
                            a_a.mo57037a(this);
                        }

                        /* renamed from: e */
                        private final void m56863e() {
                            C23020d.f58387a.mo60705d("Unsupported version detected");
                            this.f58365c.mo57932a(29);
                        }

                        /* renamed from: f */
                        private final void m56864f() {
                            this.f58368f.mo55690a(new IllegalStateException("null feature flags from backend"), "onStartSessionRequestSuccess", C21720gj.session_start);
                        }

                        /* renamed from: g */
                        private final void m56865g() {
                            C21645fu fuVar = this.f58367e;
                            C21667gf a = C21716gg.m52886a(this.f58366d.mo57946c(), this.f58366d.mo57947d(), this.f58366d.mo57948e(), this.f58366d.mo57949f());
                            C24362h.m61210e(a, "EventFactory.clientStart…VersionCode\n            )");
                            fuVar.mo54921a(a);
                        }

                        /* renamed from: c */
                        public void mo57953c() {
                            this.f58363a = true;
                        }

                        /* renamed from: d */
                        public void mo57954d() {
                            this.f58363a = false;
                            C21895jw jwVar = this.f58364b;
                            if (jwVar != null) {
                                m56861b(jwVar);
                            }
                        }

                        /* renamed from: b */
                        public void mo57952b() {
                            C23020d.f58387a.mo60705d("onBackPressed(), showing confirm exit dialog");
                            this.f58365c.mo57933a(C21719gi.BACK_BUTTON);
                        }

                        /* renamed from: a */
                        public void mo56242a() {
                            this.f58366d.mo57944a();
                            C25177g.m63218b(this.f58371i, (CoroutineContext) null, new C23018c(this, (C23349c) null), 3);
                            C21645fu fuVar = this.f58367e;
                            C21667gf d = C21716gg.m52940d((C21789ix) null);
                            C24362h.m61210e(d, "EventFactory.deviceInfo(null)");
                            fuVar.mo54921a(d);
                            m56865g();
                        }

                        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
                            r0 = r0.mo56958b();
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
                            r0 = (r0 = r5.mo55638a()).mo56958b();
                         */
                        /* renamed from: b */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        private final void m56861b(com.veriff.sdk.internal.C21895jw r5) {
                            /*
                                r4 = this;
                                com.veriff.sdk.internal.vg r0 = r5.mo55638a()
                                r1 = 0
                                r2 = 1
                                if (r0 == 0) goto L_0x0014
                                com.veriff.sdk.internal.vh r0 = r0.mo56958b()
                                if (r0 == 0) goto L_0x0014
                                boolean r0 = r0.mo56970a()
                                if (r0 == r2) goto L_0x0026
                            L_0x0014:
                                com.veriff.sdk.internal.vg r0 = r5.mo55638a()
                                if (r0 == 0) goto L_0x0028
                                com.veriff.sdk.internal.vh r0 = r0.mo56958b()
                                if (r0 == 0) goto L_0x0028
                                boolean r0 = r0.mo56973d()
                                if (r0 != r2) goto L_0x0028
                            L_0x0026:
                                r0 = 1
                                goto L_0x0029
                            L_0x0028:
                                r0 = 0
                            L_0x0029:
                                com.veriff.sdk.internal.vg r3 = r5.mo55639b()
                                if (r3 == 0) goto L_0x003b
                                com.veriff.sdk.internal.vh r3 = r3.mo56958b()
                                if (r3 == 0) goto L_0x003b
                                boolean r3 = r3.mo56970a()
                                if (r3 == r2) goto L_0x004d
                            L_0x003b:
                                com.veriff.sdk.internal.vg r3 = r5.mo55639b()
                                if (r3 == 0) goto L_0x004e
                                com.veriff.sdk.internal.vh r3 = r3.mo56958b()
                                if (r3 == 0) goto L_0x004e
                                boolean r3 = r3.mo56973d()
                                if (r3 != r2) goto L_0x004e
                            L_0x004d:
                                r1 = 1
                            L_0x004e:
                                if (r0 != 0) goto L_0x00ba
                                boolean r0 = com.veriff.sdk.internal.C21898jx.m53439b(r5)
                                if (r0 == 0) goto L_0x0059
                                if (r1 == 0) goto L_0x0059
                                goto L_0x00ba
                            L_0x0059:
                                boolean r0 = r4.f58370h
                                if (r0 == 0) goto L_0x00b4
                                com.veriff.sdk.internal.uy r0 = r5.mo55646g()
                                if (r0 == 0) goto L_0x00b4
                                boolean r0 = com.veriff.sdk.views.resubmission.C23009u.m56807a((com.veriff.sdk.internal.C21895jw) r5)
                                if (r0 == 0) goto L_0x0091
                                com.veriff.sdk.internal.vg r0 = r5.mo55638a()
                                if (r0 == 0) goto L_0x0074
                                java.lang.String r0 = r0.mo56957a()
                                goto L_0x0075
                            L_0x0074:
                                r0 = 0
                            L_0x0075:
                                if (r0 == 0) goto L_0x0089
                                com.veriff.sdk.views.sessionstart.a$c r0 = r4.f58365c
                                com.veriff.sdk.internal.uy r1 = r5.mo55646g()
                                com.veriff.sdk.internal.vg r2 = r5.mo55638a()
                                java.lang.String r2 = r2.mo56957a()
                                r0.mo57936a(r5, r1, r2)
                                return
                            L_0x0089:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r0 = "idvSession cannot be null for resubmission"
                                r5.<init>(r0)
                                throw r5
                            L_0x0091:
                                com.veriff.sdk.internal.kf r0 = r4.f58368f
                                java.lang.Throwable r1 = new java.lang.Throwable
                                java.lang.String r2 = "Unsupported reason "
                                java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
                                com.veriff.sdk.internal.uy r3 = r5.mo55646g()
                                java.lang.Integer r3 = r3.mo56891c()
                                r2.append(r3)
                                java.lang.String r2 = r2.toString()
                                r1.<init>(r2)
                                com.veriff.sdk.internal.gj r2 = com.veriff.sdk.internal.C21720gj.session_start
                                java.lang.String r3 = "SessionStartPresenter#proceedToView()"
                                r0.mo55690a(r1, r3, r2)
                            L_0x00b4:
                                com.veriff.sdk.views.sessionstart.a$c r0 = r4.f58365c
                                r0.mo57934a((com.veriff.sdk.internal.C21895jw) r5)
                                return
                            L_0x00ba:
                                com.veriff.sdk.views.sessionstart.a$c r0 = r4.f58365c
                                r0.mo57937b(r5)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.sessionstart.C23014c.m56861b(com.veriff.sdk.internal.jw):void");
                        }

                        /* renamed from: a */
                        public void mo57951a(C21895jw jwVar) {
                            C22619vg b;
                            C22621vh b2;
                            C22619vg b3;
                            C22621vh b4;
                            C22621vh b5;
                            C22621vh b6;
                            C24362h.m61211f(jwVar, "sessionData");
                            C24465j a = C23020d.f58387a;
                            a.mo60705d("sessionInitSuccessful() called with: sessionData = [" + jwVar + ']');
                            C22619vg a2 = jwVar.mo55638a();
                            if ((a2 == null || (b6 = a2.mo56958b()) == null || !b6.mo56971b()) && ((b = jwVar.mo55639b()) == null || (b5 = b.mo56958b()) == null || !b5.mo56971b())) {
                                C22619vg a3 = jwVar.mo55638a();
                                if (a3 == null || (b2 = a3.mo56958b()) == null || !b2.mo56972c() || (b3 = jwVar.mo55639b()) == null || (b4 = b3.mo56958b()) == null || !b4.mo56972c()) {
                                    C23020d.f58387a.mo60705d("Something went wrong, showing error");
                                    this.f58368f.mo55690a(new Throwable("Anomaly error"), "sessionInitSuccessful()", C21720gj.session_start);
                                    this.f58365c.mo57935a(jwVar, 22);
                                    return;
                                }
                                this.f58365c.mo57935a(jwVar, 21);
                                return;
                            }
                            C23020d.f58387a.mo60705d("Starting selfId flow");
                            this.f58364b = jwVar;
                            if (!this.f58363a) {
                                m56861b(jwVar);
                            }
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public final void m56856a(C21924kn<C22609uz> knVar) {
                            if (knVar instanceof C21924kn.C21927c) {
                                m56857a((C22609uz) ((C21924kn.C21927c) knVar).mo55715a());
                            } else if (knVar instanceof C21924kn.C21925a) {
                                m56860a((Throwable) ((C21924kn.C21925a) knVar).mo55705a(), "startSession");
                            } else if (knVar instanceof C21924kn.C21926b) {
                                C21924kn.C21926b bVar = (C21924kn.C21926b) knVar;
                                if (bVar.mo55709a() == 400) {
                                    try {
                                        C22559to c = ((C21924kn.C21926b) knVar).mo55711c();
                                        if (C24362h.m61206a(c != null ? c.mo56752b() : null, Boolean.TRUE)) {
                                            m56863e();
                                            return;
                                        }
                                    } catch (IOException e) {
                                        this.f58368f.mo55690a(e, "startSession", C21720gj.session_start);
                                    }
                                }
                                StringBuilder k = C13555b.m33972k("Backend call failed with ");
                                k.append(bVar.mo55709a());
                                m56859a((Throwable) new IllegalStateException(k.toString()));
                            } else if (knVar instanceof C21924kn.C21928d) {
                                m56859a(((C21924kn.C21928d) knVar).mo55719a());
                            }
                        }

                        /* renamed from: a */
                        private final void m56860a(Throwable th, String str) {
                            C23020d.f58387a.mo60706d("Failed to start session token due to network issues, opening error - NETWORK", th);
                            this.f58365c.mo57932a(24);
                            this.f58368f.mo55691b(th, str, C21720gj.session_start);
                        }

                        /* renamed from: a */
                        private final void m56859a(Throwable th) {
                            C23020d.f58387a.mo60706d("onStartSessionRequestFailure()", th);
                            this.f58365c.mo57932a(22);
                            this.f58368f.mo55690a(th, "onStartSessionRequestFailure()", C21720gj.session_start);
                        }

                        /* renamed from: a */
                        private final void m56857a(C22609uz uzVar) {
                            C21789ix ixVar;
                            C22556tm c;
                            C22556tm c2;
                            C23020d.f58387a.mo60705d("Session start success");
                            C22619vg e = uzVar.mo56907e();
                            if (e == null) {
                                e = uzVar.mo56910g();
                            }
                            if (e != null) {
                                C22616ve d = uzVar.mo56906d();
                                if (d == null || (ixVar = d.mo56941f()) == null) {
                                    ixVar = new C21789ix(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (C21886js) null, 0.0d, (C21903ka) null, (C21787iw) null, (List) null, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, false, false, 0, -1, 32767, (DefaultConstructorMarker) null);
                                    m56864f();
                                }
                                C21789ix ixVar2 = ixVar;
                                if (!ixVar2.mo55464p()) {
                                    this.f58365c.mo57931a();
                                }
                                C22621vh b = e.mo56958b();
                                if (b == null || !b.mo56971b()) {
                                    this.f58365c.mo57932a(21);
                                    C21910kf kfVar = this.f58368f;
                                    StringBuilder k = C13555b.m33972k("Status ");
                                    k.append(e.mo56958b());
                                    k.append(" not allowed");
                                    kfVar.mo55690a(new Throwable(k.toString()), "onStartSessionRequestSuccess()", C21720gj.session_start);
                                } else if (e.mo56957a() == null) {
                                    this.f58365c.mo57932a(22);
                                    this.f58368f.mo55690a(new Throwable("returned verification has no UUID"), "onStartSessionRequestSuccess()", C21720gj.session_start);
                                } else {
                                    C22613vc i = uzVar.mo56913i();
                                    List<C22614vd> a = i != null ? i.mo56919a() : null;
                                    C22619vg e2 = uzVar.mo56907e();
                                    C22619vg g = uzVar.mo56910g();
                                    C22616ve d2 = uzVar.mo56906d();
                                    String c3 = d2 != null ? d2.mo56937c() : null;
                                    C22574ts c4 = uzVar.mo56905c();
                                    String a2 = (c4 == null || (c2 = c4.mo56822c()) == null) ? null : c2.mo56740a();
                                    C22574ts c5 = uzVar.mo56905c();
                                    C21895jw jwVar = new C21895jw(e2, g, ixVar2, c3, a2, (c5 == null || (c = c5.mo56822c()) == null) ? null : c.mo56741b(), C22611va.m55124a(uzVar), (String) null, a);
                                    this.f58369g.mo56108a();
                                    C25177g.m63218b(this.f58372j, (CoroutineContext) null, new C23015a(this, jwVar, (C23349c) null), 3);
                                    C25177g.m63218b(this.f58371i, (CoroutineContext) null, new C23017b(this, uzVar, jwVar, (C23349c) null), 3);
                                }
                            } else {
                                this.f58365c.mo57932a(22);
                                this.f58368f.mo55690a(new Throwable("Invalid response"), "onStartSessionRequestSuccess()", C21720gj.session_start);
                            }
                        }
                    }
