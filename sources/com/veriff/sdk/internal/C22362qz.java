package com.veriff.sdk.internal;

import bf0.C21050d;
import com.appboy.models.outgoing.FacebookUser;
import com.appsflyer.ServerParameters;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.veriff.sdk.internal.permission.C22254c;
import com.veriff.sdk.views.resubmission.C23009u;
import ff0.C23349c;
import gf0.C23413c;
import he0.C23454a;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import lf0.C24240p;
import mf0.C24362h;
import p583jk.C17875h;
import p584jl.C17885a;
import wh0.C25177g;
import wh0.C25235z;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010+\u001a\u00020*\u0012\b\b\u0001\u00102\u001a\u000201¢\u0006\u0004\bC\u0010DJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J,\u0010\u0012\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0016\u0010\u001e\u001a\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000fH\u0016J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0016J\b\u0010#\u001a\u00020\u0002H\u0016J\b\u0010$\u001a\u00020\u0002H\u0016R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u00100R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u0010&R\u0014\u00106\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u00100R\u0014\u0010=\u001a\u00020<8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006E"}, mo59060d2 = {"Lcom/veriff/sdk/views/intro/IntroPresenter;", "Lcom/veriff/sdk/views/intro/IntroMVP$Presenter;", "Lbf0/d;", "checkForPermissions", "", "checkNfc", "closePrivacyPolicy", "", "languageCode", "createPrivacyPolicyUrl", "gotAllPermissions", "onBackPressed", "onCloseButtonPressed", "geoIPCountry", "geoIPState", "", "Lmobi/lab/veriff/data/api/request/response/TranslatedString;", "intros", "onConfigurationsReceived", "strings", "onIntroStringsSuccess", "onLanguageClicked", "", "throwable", "location", "onNetworkFailedError", "onNewIntroStringsError", "onStatusChangeFailure", "Lcom/veriff/sdk/internal/data/FlowStep;", "steps", "onStatusChangeSuccess", "onViewReady", "videoGranted", "audioGranted", "setRecordingPermissionsGranted", "showPrivacyPolicy", "start", "alreadyGotPermissions", "Z", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "Lwh0/z;", "coroutineScope", "Lwh0/z;", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "Ljava/lang/String;", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "isWebViewVisible", "Lcom/veriff/sdk/views/intro/IntroMVP$Model;", "model", "Lcom/veriff/sdk/views/intro/IntroMVP$Model;", "Lcom/veriff/sdk/views/intro/PermissionChecks;", "permissionChecks", "Lcom/veriff/sdk/views/intro/PermissionChecks;", "privacyPolicyUrl", "Lcom/veriff/sdk/internal/data/StartSessionData;", "sessionData", "Lcom/veriff/sdk/internal/data/StartSessionData;", "Lhe0/a;", "Lcom/veriff/sdk/views/intro/IntroMVP$View;", "view", "Lhe0/a;", "<init>", "(Lhe0/a;Lcom/veriff/sdk/views/intro/PermissionChecks;Lcom/veriff/sdk/views/intro/IntroMVP$Model;Lcom/veriff/sdk/internal/analytics/Analytics;Lcom/veriff/sdk/internal/errors/ErrorReporter;Lcom/veriff/sdk/internal/data/StartSessionData;Lwh0/z;Lkotlinx/coroutines/CoroutineDispatcher;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.qz */
public final class C22362qz implements qu$b {

    /* renamed from: a */
    private boolean f56422a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f56423b;

    /* renamed from: e */
    private boolean f56424e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C23454a<qu$c> f56425f;

    /* renamed from: g */
    private final C22374rf f56426g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final qu$a f56427h;

    /* renamed from: i */
    private final C21645fu f56428i;

    /* renamed from: j */
    private final C21910kf f56429j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C21895jw f56430k;

    /* renamed from: l */
    private final C25235z f56431l;

    /* renamed from: m */
    private final CoroutineDispatcher f56432m;

    @C23413c(mo58554c = "com.veriff.sdk.views.intro.IntroPresenter$onConfigurationsReceived$1", mo58555f = "IntroPresenter.kt", mo58556l = {}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qz$a */
    public static final class C22363a extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f56433a;

        /* renamed from: b */
        public final /* synthetic */ C22362qz f56434b;

        /* renamed from: c */
        public final /* synthetic */ List f56435c;

        /* renamed from: d */
        public final /* synthetic */ String f56436d;

        /* renamed from: e */
        public final /* synthetic */ String f56437e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22363a(C22362qz qzVar, List list, String str, String str2, C23349c cVar) {
            super(2, cVar);
            this.f56434b = qzVar;
            this.f56435c = list;
            this.f56436d = str;
            this.f56437e = str2;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22363a(this.f56434b, this.f56435c, this.f56436d, this.f56437e, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22363a) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f56433a == 0) {
                C17885a.m44475z0(obj);
                ((qu$c) this.f56434b.f56425f.get()).mo56412h();
                ((qu$c) this.f56434b.f56425f.get()).mo56403a(this.f56434b.f56427h.mo56372d(), this.f56434b.f56427h.mo56380l(), this.f56435c, this.f56436d, this.f56437e, this.f56434b.f56423b);
                return C21050d.f52856a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.intro.IntroPresenter$onIntroStringsSuccess$1", mo58555f = "IntroPresenter.kt", mo58556l = {241}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qz$b */
    public static final class C22364b extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f56438a;

        /* renamed from: b */
        public final /* synthetic */ C22362qz f56439b;

        /* renamed from: c */
        public final /* synthetic */ List f56440c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22364b(C22362qz qzVar, List list, C23349c cVar) {
            super(2, cVar);
            this.f56439b = qzVar;
            this.f56440c = list;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22364b(this.f56439b, this.f56440c, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22364b) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f56438a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                qu$a a = this.f56439b.f56427h;
                List list = this.f56440c;
                this.f56438a = 1;
                if (a.mo56367a(list, this) == coroutineSingletons) {
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

    @C23413c(mo58554c = "com.veriff.sdk.views.intro.IntroPresenter$onNewIntroStringsError$1", mo58555f = "IntroPresenter.kt", mo58556l = {}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qz$c */
    public static final class C22365c extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f56441a;

        /* renamed from: b */
        public final /* synthetic */ C22362qz f56442b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22365c(C22362qz qzVar, C23349c cVar) {
            super(2, cVar);
            this.f56442b = qzVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22365c(this.f56442b, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22365c) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f56441a == 0) {
                C17885a.m44475z0(obj);
                ((qu$c) this.f56442b.f56425f.get()).mo56412h();
                ((qu$c) this.f56442b.f56425f.get()).mo56403a(this.f56442b.f56427h.mo56372d(), this.f56442b.f56427h.mo56380l(), (List<C22614vd>) null, this.f56442b.getClass(), this.f56442b.getClass(), this.f56442b.f56423b);
                return C21050d.f52856a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.intro.IntroPresenter$start$1", mo58555f = "IntroPresenter.kt", mo58556l = {70}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qz$d */
    public static final class C22366d extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f56443a;

        /* renamed from: b */
        public final /* synthetic */ C22362qz f56444b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22366d(C22362qz qzVar, C23349c cVar) {
            super(2, cVar);
            this.f56444b = qzVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22366d(this.f56444b, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22366d) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f56443a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                qu$a a = this.f56444b.f56427h;
                this.f56443a = 1;
                if (a.mo56366a((C23349c<? super C21050d>) this) == coroutineSingletons) {
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

    @C23413c(mo58554c = "com.veriff.sdk.views.intro.IntroPresenter$start$2", mo58555f = "IntroPresenter.kt", mo58556l = {75}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qz$e */
    public static final class C22367e extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f56445a;

        /* renamed from: b */
        public final /* synthetic */ C22362qz f56446b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22367e(C22362qz qzVar, C23349c cVar) {
            super(2, cVar);
            this.f56446b = qzVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22367e(this.f56446b, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22367e) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f56445a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                qu$a a = this.f56446b.f56427h;
                List<C22614vd> i2 = this.f56446b.f56430k.mo55649i();
                this.f56445a = 1;
                if (a.mo56367a(i2, this) == coroutineSingletons) {
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

    public C22362qz(C23454a<qu$c> aVar, C22374rf rfVar, qu$a qu_a, C21645fu fuVar, C21910kf kfVar, C21895jw jwVar, C25235z zVar, CoroutineDispatcher coroutineDispatcher) {
        C24362h.m61211f(aVar, Promotion.ACTION_VIEW);
        C24362h.m61211f(rfVar, "permissionChecks");
        C24362h.m61211f(qu_a, ServerParameters.MODEL);
        C24362h.m61211f(fuVar, "analytics");
        C24362h.m61211f(kfVar, "errorReporter");
        C24362h.m61211f(jwVar, "sessionData");
        C24362h.m61211f(zVar, "coroutineScope");
        C24362h.m61211f(coroutineDispatcher, "ioDispatcher");
        this.f56425f = aVar;
        this.f56426g = rfVar;
        this.f56427h = qu_a;
        this.f56428i = fuVar;
        this.f56429j = kfVar;
        this.f56430k = jwVar;
        this.f56431l = zVar;
        this.f56432m = coroutineDispatcher;
        this.f56423b = m54527a(qu_a.mo56371c());
        qu_a.mo56368a((qu$b) this);
    }

    /* renamed from: a */
    private final String m54527a(String str) {
        StringBuilder k = C13555b.m33972k("https://www.veriff.com/privacy-policy?navigation=slim&lang=");
        if (str == null) {
            str = "";
        }
        k.append(str);
        return k.toString();
    }

    /* renamed from: j */
    private final boolean m54533j() {
        if (!this.f56427h.mo56375g()) {
            return true;
        }
        if (!this.f56427h.mo56377i()) {
            this.f56429j.mo55690a(new IllegalStateException("NFC enabled but no permission"), "intro", C21720gj.nfc);
            this.f56425f.get().mo56414m_();
            return false;
        } else if (this.f56427h.mo56376h()) {
            return true;
        } else {
            this.f56425f.get().mo56410e();
            return false;
        }
    }

    /* renamed from: k */
    private final void m54534k() {
        if (this.f56427h.mo56378j()) {
            C22607uy g = this.f56430k.mo55646g();
            Integer num = null;
            if (g == null || !C23009u.m56808a(g.mo56891c())) {
                g = null;
            }
            if (g != null) {
                this.f56425f.get().mo56404a(g);
                return;
            }
            C21910kf kfVar = this.f56429j;
            StringBuilder k = C13555b.m33972k("Unsupported reason ");
            C22607uy g2 = this.f56430k.mo55646g();
            if (g2 != null) {
                num = g2.mo56891c();
            }
            k.append(num);
            kfVar.mo55690a(new Throwable(k.toString()), "IntroPresenter#gotAllPermissions()", C21720gj.resubmission);
            this.f56425f.get().mo56406a(this.f56427h.mo56381m(), this.f56427h.mo56382n());
        } else if (this.f56427h.mo56383o()) {
            this.f56425f.get().mo56406a(this.f56427h.mo56381m(), this.f56427h.mo56382n());
        } else {
            List<C21791iy> a = C21791iy.f55198q.mo55540a(this.f56427h.mo56372d(), C21898jx.m53439b(this.f56427h.mo56365a()));
            if (a.isEmpty()) {
                this.f56429j.mo55690a(new Throwable("Number of verifications steps are empty"), "IntroPresenter#gotAllPermissions()", C21720gj.session_start);
                this.f56425f.get().mo56400a(22);
                return;
            }
            this.f56427h.mo56369a(a);
        }
    }

    /* renamed from: g */
    public void mo56396g() {
        C22369ra.f56449a.mo60705d("closePrivacyPolicy()");
        this.f56422a = false;
        this.f56425f.get().mo56399a();
    }

    /* renamed from: h */
    public void mo56397h() {
        C25177g.m63218b(this.f56431l, (CoroutineContext) null, new C22365c(this, (C23349c) null), 3);
    }

    /* renamed from: i */
    public void mo56398i() {
        if (this.f56427h.mo56379k()) {
            C22369ra.f56449a.mo60705d("Skipping intro screen");
            this.f56425f.get().mo56411g();
            if (!this.f56424e) {
                mo56393d();
                return;
            }
            return;
        }
        C21645fu fuVar = this.f56428i;
        C21667gf f = C21716gg.m52948f(this.f56427h.mo56372d());
        C24362h.m61210e(f, "EventFactory.introScreen…Event(model.featureFlags)");
        fuVar.mo54921a(f);
    }

    /* renamed from: b */
    public void mo56390b() {
        this.f56425f.get().mo56401a(C21719gi.CLOSE_BUTTON);
    }

    /* renamed from: c */
    public void mo56392c() {
        if (this.f56422a) {
            this.f56422a = false;
            this.f56425f.get().mo56399a();
            return;
        }
        C22369ra.f56449a.mo60705d("onBackPressed(), showing confirm exit dialog");
        this.f56425f.get().mo56401a(C21719gi.BACK_BUTTON);
    }

    /* renamed from: d */
    public void mo56393d() {
        if (m54533j()) {
            boolean k = this.f56426g.mo56418k();
            boolean l = this.f56426g.mo56419l();
            boolean e = this.f56427h.mo56373e();
            if (!k || (e && !l)) {
                if (!k) {
                    C21645fu fuVar = this.f56428i;
                    C21667gf l2 = C21716gg.m52956l();
                    C24362h.m61210e(l2, "EventFactory.videoRecordingPermissionTriggered()");
                    fuVar.mo54921a(l2);
                }
                if (e && !l) {
                    C21645fu fuVar2 = this.f56428i;
                    C21667gf o = C21716gg.m52959o();
                    C24362h.m61210e(o, "EventFactory.audioRecordingPermissionTriggered()");
                    fuVar2.mo54921a(o);
                }
                if (e) {
                    this.f56425f.get().mo56407a((List<? extends C22254c>) C17875h.m44281E(C22254c.Camera, C22254c.Microphone));
                    return;
                }
                this.f56425f.get().mo56407a((List<? extends C22254c>) C17875h.m44280D(C22254c.Camera));
                return;
            }
            C21645fu fuVar3 = this.f56428i;
            C21667gf j = C21716gg.m52954j();
            C24362h.m61210e(j, "EventFactory.cameraPermissionsGranted()");
            fuVar3.mo54921a(j);
            this.f56424e = true;
            m54534k();
        }
    }

    /* renamed from: e */
    public void mo56394e() {
        C22369ra.f56449a.mo60705d("onLanguageClicked()");
        this.f56425f.get().mo56402a(this.f56427h.mo56372d());
    }

    /* renamed from: f */
    public void mo56395f() {
        this.f56422a = true;
        this.f56425f.get().mo56405a(this.f56423b);
    }

    /* renamed from: b */
    public void mo56391b(List<C22614vd> list) {
        C25177g.m63218b(this.f56431l, (CoroutineContext) null, new C22364b(this, list, (C23349c) null), 3);
    }

    /* renamed from: a */
    public void mo56384a() {
        this.f56423b = m54527a(this.f56427h.mo56371c());
        this.f56425f.get().mo56403a(this.f56430k.mo55640c(), this.f56427h.mo56380l(), this.f56430k.mo55649i(), (String) null, (String) null, this.f56423b);
        if (this.f56427h.mo56370b()) {
            this.f56425f.get().mo56411g();
            C25177g.m63218b(this.f56431l, this.f56432m, new C22366d(this, (C23349c) null), 2);
            return;
        }
        this.f56425f.get().mo56411g();
        C25177g.m63218b(this.f56431l, this.f56432m, new C22367e(this, (C23349c) null), 2);
    }

    /* renamed from: a */
    public void mo56389a(boolean z, boolean z2) {
        C22369ra.f56449a.mo60705d("setRecordingPermissionsGranted()");
        if (z) {
            C21645fu fuVar = this.f56428i;
            C21667gf m = C21716gg.m52957m();
            C24362h.m61210e(m, "EventFactory.videoRecordingPermissionGranted()");
            fuVar.mo54921a(m);
        } else {
            C21645fu fuVar2 = this.f56428i;
            C21667gf n = C21716gg.m52958n();
            C24362h.m61210e(n, "EventFactory.videoRecordingPermissionDeclined()");
            fuVar2.mo54921a(n);
        }
        if (this.f56427h.mo56373e()) {
            if (z2) {
                C21645fu fuVar3 = this.f56428i;
                C21667gf p = C21716gg.m52960p();
                C24362h.m61210e(p, "EventFactory.audioRecordingPermissionGranted()");
                fuVar3.mo54921a(p);
            } else {
                C21645fu fuVar4 = this.f56428i;
                C21667gf q = C21716gg.m52961q();
                C24362h.m61210e(q, "EventFactory.audioRecordingPermissionDeclined()");
                fuVar4.mo54921a(q);
            }
        }
        if (!z) {
            C21645fu fuVar5 = this.f56428i;
            C21667gf k = C21716gg.m52955k();
            C24362h.m61210e(k, "EventFactory.cameraPermissionsDenied()");
            fuVar5.mo54921a(k);
            this.f56425f.get().mo56408b();
        } else if (z2 || !this.f56427h.mo56373e() || !this.f56427h.mo56374f()) {
            C21645fu fuVar6 = this.f56428i;
            C21667gf j = C21716gg.m52954j();
            C24362h.m61210e(j, "EventFactory.cameraPermissionsGranted()");
            fuVar6.mo54921a(j);
            m54534k();
        } else {
            C21645fu fuVar7 = this.f56428i;
            C21667gf k2 = C21716gg.m52955k();
            C24362h.m61210e(k2, "EventFactory.cameraPermissionsDenied()");
            fuVar7.mo54921a(k2);
            this.f56425f.get().mo56413l_();
        }
    }

    /* renamed from: a */
    public void mo56388a(List<? extends C21791iy> list) {
        C24362h.m61211f(list, "steps");
        C22369ra.f56449a.mo60705d("onStatusChangeSuccess()");
        C21645fu fuVar = this.f56428i;
        C21667gf i = C21716gg.m52953i();
        C24362h.m61210e(i, "EventFactory.flowStarted()");
        fuVar.mo54921a(i);
        C21645fu fuVar2 = this.f56428i;
        C21667gf a = C21716gg.m52891a(this.f56427h.mo56372d());
        C24362h.m61210e(a, "EventFactory.sessionStarted(model.featureFlags)");
        fuVar2.mo54921a(a);
        this.f56425f.get().mo56409b(list);
    }

    /* renamed from: a */
    public void mo56386a(Throwable th) {
        C24362h.m61211f(th, "throwable");
        C22369ra.f56449a.mo60706d("Document selection failed", th);
        this.f56425f.get().mo56400a(22);
        this.f56429j.mo55690a(th, "onStatusChangeFailure()", C21720gj.session_start);
    }

    /* renamed from: a */
    public void mo56387a(Throwable th, String str) {
        C24362h.m61211f(th, "throwable");
        C24362h.m61211f(str, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        this.f56425f.get().mo56400a(24);
        this.f56429j.mo55691b(th, str, C21720gj.session_start);
    }

    /* renamed from: a */
    public void mo56385a(String str, String str2, List<C22614vd> list) {
        C25177g.m63218b(this.f56431l, (CoroutineContext) null, new C22363a(this, list, str, str2, (C23349c) null), 3);
    }
}
