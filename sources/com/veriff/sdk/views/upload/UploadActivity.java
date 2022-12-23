package com.veriff.sdk.views.upload;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import bf0.C21050d;
import com.appboy.support.AppboyImageUtils;
import com.appsflyer.ServerParameters;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C21645fu;
import com.veriff.sdk.internal.C21667gf;
import com.veriff.sdk.internal.C21716gg;
import com.veriff.sdk.internal.C21719gi;
import com.veriff.sdk.internal.C21783is;
import com.veriff.sdk.internal.C21789ix;
import com.veriff.sdk.internal.C21883jq;
import com.veriff.sdk.internal.C21895jw;
import com.veriff.sdk.internal.C21898jx;
import com.veriff.sdk.internal.C21910kf;
import com.veriff.sdk.internal.C22006me;
import com.veriff.sdk.internal.C22060ng;
import com.veriff.sdk.internal.C22062ni;
import com.veriff.sdk.internal.C22064nk;
import com.veriff.sdk.internal.C22517sk;
import com.veriff.sdk.internal.C22661wm;
import com.veriff.sdk.internal.C22696xo;
import com.veriff.sdk.internal.xb$a;
import com.veriff.sdk.views.base.verification.C22814a;
import com.veriff.sdk.views.base.verification.C22816c;
import ff0.C23349c;
import gf0.C23413c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf0.C24240p;
import mf0.C24362h;
import mobi.lab.veriff.data.C24426d;
import mobi.lab.veriff.service.SendAuthenticationFlowDataToServerService;
import mobi.lab.veriff.service.VeriffStatusUpdatesService;
import mobi.lab.veriff.util.C24450d;
import mobi.lab.veriff.util.C24467l;
import p584jl.C17885a;
import wh0.C25235z;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u00010\u0018\u00002\u00020\u00012\u00020\u0002:\u00018B\u0007¢\u0006\u0004\b6\u00107J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0014J\b\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001a\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\fH\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\fH\u0016J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\nH\u0016J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u0005H\u0016J\b\u0010#\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016R\u0018\u0010%\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X.¢\u0006\u0006\n\u0004\b4\u00105¨\u00069"}, mo59060d2 = {"Lcom/veriff/sdk/views/upload/UploadActivity;", "Lcom/veriff/sdk/views/base/verification/BaseVerificationActivity;", "Lcom/veriff/sdk/views/upload/UploadMVP$View;", "Landroid/os/Bundle;", "outState", "Lbf0/d;", "onSaveInstanceState", "onBackPressed", "onDestroy", "checkForDecision", "", "isSuccessful", "", "status", "endAuthenticationWithCode", "isRecreate", "state", "onCreateLibraryActivity", "errorType", "openError", "retryFailedUploads", "", "sessionToken", "sendStatusCode", "currentStep", "setCurrentStep", "showUploadViewWithDecision", "setupView", "Lcom/veriff/sdk/internal/analytics/EventSource;", "source", "showConfirmExitDialog", "showFinishedScreen", "showRetryFailedUploads", "showUploadDecision", "startUpload", "updatedSessionStatus", "uploadResubmit", "documentType", "Ljava/lang/String;", "Lcom/veriff/sdk/views/upload/UploadMVP$Model;", "model", "Lcom/veriff/sdk/views/upload/UploadMVP$Model;", "Lcom/veriff/sdk/views/upload/UploadMVP$Presenter;", "presenter", "Lcom/veriff/sdk/views/upload/UploadMVP$Presenter;", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "session", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "com/veriff/sdk/views/upload/UploadActivity$uploadStatusListener$1", "uploadStatusListener", "Lcom/veriff/sdk/views/upload/UploadActivity$uploadStatusListener$1;", "Lcom/veriff/sdk/views/upload/ui/UploadUI;", "view", "Lcom/veriff/sdk/views/upload/ui/UploadUI;", "<init>", "()V", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public final class UploadActivity extends C22814a implements f$c {

    /* renamed from: l */
    public static final C23021a f58388l = new C23021a((DefaultConstructorMarker) null);

    /* renamed from: m */
    private C22661wm f58389m;

    /* renamed from: n */
    private String f58390n;

    /* renamed from: o */
    private f$b f58391o;

    /* renamed from: p */
    private C22517sk f58392p;

    /* renamed from: q */
    private f$a f58393q;

    /* renamed from: r */
    private final C23024d f58394r = new C23024d(this);

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e¨\u0006\u000f"}, mo59060d2 = {"Lcom/veriff/sdk/views/upload/UploadActivity$Companion;", "", "()V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "sessionArguments", "Lmobi/lab/veriff/data/SessionArguments;", "startSessionData", "Lcom/veriff/sdk/internal/data/StartSessionData;", "session", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "documentType", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.upload.UploadActivity$a */
    public static final class C23021a {
        private C23021a() {
        }

        public /* synthetic */ C23021a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo57968a(Context context, C24426d dVar, C21895jw jwVar, C22661wm wmVar, String str) {
            C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
            C24362h.m61211f(dVar, "sessionArguments");
            C24362h.m61211f(jwVar, "startSessionData");
            C24362h.m61211f(wmVar, "session");
            Intent intent = new Intent(context, UploadActivity.class);
            intent.setFlags(AppboyImageUtils.MAX_IMAGE_CACHE_SIZE_BYTES);
            C22814a.m56078a(intent, dVar, jwVar);
            intent.putExtra("mobi.lab.veriff.views.upload.EXTRA_FLOW_SESSION", wmVar);
            intent.putExtra("mobi.lab.veriff.views.upload.EXTRA_DOCUMENT_TYPE", str);
            return intent;
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.upload.UploadActivity$checkForDecision$1", mo58555f = "UploadActivity.kt", mo58556l = {214}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.upload.UploadActivity$b */
    public static final class C23022b extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f58395a;

        /* renamed from: b */
        public final /* synthetic */ UploadActivity f58396b;

        /* renamed from: c */
        public final /* synthetic */ long f58397c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23022b(UploadActivity uploadActivity, long j, C23349c cVar) {
            super(2, cVar);
            this.f58396b = uploadActivity;
            this.f58397c = j;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C23022b(this.f58396b, this.f58397c, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C23022b) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f58395a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                f$b a = UploadActivity.m56872a(this.f58396b);
                long j = this.f58397c;
                this.f58395a = 1;
                if (a.mo57985a(j, (C23349c<? super C21050d>) this) == coroutineSingletons) {
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

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, mo59060d2 = {"com/veriff/sdk/views/upload/UploadActivity$setupView$listener$1", "Lcom/veriff/sdk/views/upload/ui/UploadUI$Listener;", "Lbf0/d;", "finishSuccessfully", "goToFinishedScreen", "onCloseButtonPressed", "onRetryClicked", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.upload.UploadActivity$c */
    public static final class C23023c implements C22517sk.C22518a {

        /* renamed from: a */
        public final /* synthetic */ UploadActivity f58398a;

        public C23023c(UploadActivity uploadActivity) {
            this.f58398a = uploadActivity;
        }

        /* renamed from: a */
        public void mo56649a() {
            UploadActivity.m56872a(this.f58398a).mo57995g();
        }

        /* renamed from: b */
        public void mo56650b() {
            UploadActivity.m56872a(this.f58398a).mo57992d();
        }

        /* renamed from: c */
        public void mo56651c() {
            UploadActivity.m56872a(this.f58398a).mo57996h();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo59060d2 = {"com/veriff/sdk/views/upload/UploadActivity$uploadStatusListener$1", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager$UploadStatusListener;", "Lcom/veriff/sdk/internal/upload/SessionUploadStatus;", "status", "Lbf0/d;", "onUploadStatusChanged", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.upload.UploadActivity$d */
    public static final class C23024d implements C22064nk.C22065a {

        /* renamed from: a */
        public final /* synthetic */ UploadActivity f58399a;

        public C23024d(UploadActivity uploadActivity) {
            this.f58399a = uploadActivity;
        }

        /* renamed from: a */
        public void mo55961a(C22060ng ngVar) {
            C24362h.m61211f(ngVar, "upload");
            C22064nk.C22065a.C22066a.m53820a((C22064nk.C22065a) this, ngVar);
        }

        /* renamed from: a */
        public void mo55962a(C22062ni niVar) {
            C24362h.m61211f(niVar, ServerParameters.STATUS);
            if (C23030c.f58407a[niVar.ordinal()] == 1) {
                UploadActivity.m56872a(this.f58399a).mo57986a(this.f58399a.mo56159j().mo54909c(), this.f58399a.mo56158h_().mo60598c());
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ f$b m56872a(UploadActivity uploadActivity) {
        f$b f_b = uploadActivity.f58391o;
        if (f_b != null) {
            return f_b;
        }
        C24362h.m61217l("presenter");
        throw null;
    }

    /* renamed from: c */
    public void mo57961c() {
        C22661wm wmVar = this.f58389m;
        if (wmVar != null) {
            wmVar.mo57029m().mo55967a(true);
            f$b f_b = this.f58391o;
            if (f_b != null) {
                f_b.mo57993e();
            } else {
                C24362h.m61217l("presenter");
                throw null;
            }
        } else {
            C24362h.m61217l("session");
            throw null;
        }
    }

    /* renamed from: d */
    public void mo57963d() {
        C21645fu b = mo56159j().mo54908b();
        C21667gf u = C21716gg.m52965u();
        C24362h.m61210e(u, "EventFactory.uploadRetryFailed()");
        b.mo54921a(u);
        mo57955a();
        C22517sk skVar = this.f58392p;
        if (skVar != null) {
            skVar.mo56644a();
        } else {
            C24362h.m61217l(Promotion.ACTION_VIEW);
            throw null;
        }
    }

    /* renamed from: e */
    public void mo57964e() {
        C22816c cVar = this.f57890h;
        C22661wm wmVar = this.f58389m;
        if (wmVar != null) {
            cVar.mo57581a(wmVar);
        } else {
            C24362h.m61217l("session");
            throw null;
        }
    }

    /* renamed from: f */
    public void mo57965f() {
        C17885a.m44426W(this).mo4311d(new C23022b(this, new C24467l().mo60661a(), (C23349c) null));
    }

    /* renamed from: g */
    public void mo57966g() {
        C22517sk skVar = this.f58392p;
        if (skVar != null) {
            skVar.mo56646c();
        } else {
            C24362h.m61217l(Promotion.ACTION_VIEW);
            throw null;
        }
    }

    /* renamed from: h */
    public void mo57967h() {
        C22006me.m53663b(this, C24426d.m61426a(mo56158h_(), (String) null, (String) null, (String) null, (String) null, (Map) null, (C24450d) null, (C22696xo) null, false, (String) null, mo56159j().mo54912f().mo60699e(), 511, (Object) null));
        finish();
    }

    public void onBackPressed() {
        f$b f_b = this.f58391o;
        if (f_b != null) {
            f_b.mo57994f();
        } else {
            C24362h.m61217l("presenter");
            throw null;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        mo56159j().mo54909c().mo55953b((C22064nk.C22065a) this.f58394r);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C24362h.m61211f(bundle, "outState");
        C22661wm wmVar = this.f58389m;
        if (wmVar != null) {
            bundle.putParcelable("mobi.lab.veriff.views.upload.UploadActivity.STATE_FLOW_SESSION", wmVar);
            f$b f_b = this.f58391o;
            if (f_b != null) {
                bundle.putInt("mobi.lab.veriff.views.upload.UploadActivity.STATE_UPLOAD_RETRIES", f_b.mo57984a());
                super.onSaveInstanceState(bundle);
                return;
            }
            C24362h.m61217l("presenter");
            throw null;
        }
        C24362h.m61217l("session");
        throw null;
    }

    /* renamed from: a */
    public void mo57572a(boolean z, Bundle bundle) {
        int i;
        String str;
        Bundle bundle2 = bundle;
        this.f58390n = getIntent().getStringExtra("mobi.lab.veriff.views.upload.EXTRA_DOCUMENT_TYPE");
        if (bundle2 == null) {
            C22661wm wmVar = (C22661wm) getIntent().getParcelableExtra("mobi.lab.veriff.views.upload.EXTRA_FLOW_SESSION");
            if (wmVar != null) {
                this.f58389m = wmVar;
                i = 0;
            } else {
                throw new IllegalStateException("Session cannot be null");
            }
        } else {
            C22661wm wmVar2 = (C22661wm) bundle2.getParcelable("mobi.lab.veriff.views.upload.UploadActivity.STATE_FLOW_SESSION");
            if (wmVar2 != null) {
                this.f58389m = wmVar2;
                i = bundle2.getInt("mobi.lab.veriff.views.upload.UploadActivity.STATE_UPLOAD_RETRIES");
            } else {
                throw new IllegalStateException("Session cannot be null");
            }
        }
        xb$a a = mo56159j().mo54907a();
        C21789ix m = mo57577m();
        C24362h.m61210e(m, "featureFlags");
        C21883jq jqVar = new C21883jq(a, m, mo56159j().mo54910d());
        C21895jw jwVar = this.f57888f;
        C24362h.m61210e(jwVar, "startSessionData");
        if (C21898jx.m53438a(jwVar)) {
            C22661wm wmVar3 = this.f58389m;
            if (wmVar3 != null) {
                str = wmVar3.mo57016b();
            } else {
                C24362h.m61217l("session");
                throw null;
            }
        } else {
            str = null;
        }
        C21789ix m2 = mo57577m();
        C24362h.m61210e(m2, "featureFlags");
        xb$a a2 = mo56159j().mo54907a();
        C21645fu b = mo56159j().mo54908b();
        C21910kf d = mo56159j().mo54910d();
        C22064nk c = mo56159j().mo54909c();
        C24467l lVar = new C24467l();
        C21895jw jwVar2 = this.f57888f;
        C24362h.m61210e(jwVar2, "startSessionData");
        C23033g gVar = new C23033g(str, m2, a2, b, d, c, jqVar, lVar, C21898jx.m53439b(jwVar2));
        this.f58393q = gVar;
        C21645fu b2 = mo56159j().mo54908b();
        C21910kf d2 = mo56159j().mo54910d();
        C21789ix m3 = mo57577m();
        C24362h.m61210e(m3, "featureFlags");
        C23052i iVar = new C23052i(this, gVar, b2, d2, i, m3);
        this.f58391o = iVar;
        f$a f_a = this.f58393q;
        if (f_a != null) {
            f_a.mo57981a(iVar);
            f$b f_b = this.f58391o;
            if (f_b != null) {
                f_b.mo57989b();
            } else {
                C24362h.m61217l("presenter");
                throw null;
            }
        } else {
            C24362h.m61217l(ServerParameters.MODEL);
            throw null;
        }
    }

    /* renamed from: b */
    public void mo57960b() {
        C23031d.f58408a.mo60705d("showRetryFailedUploads");
        C22517sk skVar = this.f58392p;
        if (skVar != null) {
            skVar.mo56645b();
        } else {
            C24362h.m61217l(Promotion.ACTION_VIEW);
            throw null;
        }
    }

    /* renamed from: c */
    public void mo57962c(int i) {
        C22517sk skVar = this.f58392p;
        if (skVar != null) {
            skVar.setCurrentStep(i);
        } else {
            C24362h.m61217l(Promotion.ACTION_VIEW);
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: com.veriff.sdk.internal.sm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: com.veriff.sdk.internal.sl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: com.veriff.sdk.internal.sm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.veriff.sdk.internal.sm} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00af  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo57959a(boolean r11) {
        /*
            r10 = this;
            com.veriff.sdk.views.upload.UploadActivity$c r4 = new com.veriff.sdk.views.upload.UploadActivity$c
            r4.<init>(r10)
            com.veriff.sdk.internal.xq r3 = new com.veriff.sdk.internal.xq
            mobi.lab.veriff.data.d r0 = r10.mo56158h_()
            com.veriff.sdk.internal.xo r0 = r0.mo60604g()
            r3.<init>(r10, r0)
            mobi.lab.veriff.util.n$a r0 = mobi.lab.veriff.util.C24469n.f61931a
            mobi.lab.veriff.data.d r0 = r10.mo56158h_()
            com.veriff.sdk.internal.xo r0 = r0.mo60604g()
            com.veriff.sdk.internal.fp r1 = r10.mo56159j()
            mobi.lab.veriff.util.h r1 = r1.mo54912f()
            com.veriff.sdk.internal.ex r1 = r1.mo60691a()
            com.veriff.sdk.internal.ix r2 = r10.mo57577m()
            mobi.lab.veriff.util.n r5 = new mobi.lab.veriff.util.n
            r5.<init>(r0, r1, r2)
            mobi.lab.veriff.util.n$a r8 = mobi.lab.veriff.util.C24469n.f61931a
            r8.mo60715a(r5)
            r9 = 0
            if (r11 == 0) goto L_0x0074
            com.veriff.sdk.internal.ix r11 = r10.mo57577m()     // Catch:{ all -> 0x00b5 }
            if (r11 == 0) goto L_0x0074
            com.veriff.sdk.internal.sm r11 = new com.veriff.sdk.internal.sm     // Catch:{ all -> 0x00b5 }
            com.veriff.sdk.internal.fp r0 = r10.mo56159j()     // Catch:{ all -> 0x00b5 }
            mobi.lab.veriff.util.h r0 = r0.mo54912f()     // Catch:{ all -> 0x00b5 }
            com.veriff.sdk.internal.ex r2 = r0.mo60691a()     // Catch:{ all -> 0x00b5 }
            com.veriff.sdk.internal.fp r0 = r10.mo56159j()     // Catch:{ all -> 0x00b5 }
            com.veriff.sdk.internal.fu r5 = r0.mo54908b()     // Catch:{ all -> 0x00b5 }
            com.veriff.sdk.views.upload.f$a r0 = r10.f58393q     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x006e
            java.util.List r6 = r0.mo57983b()     // Catch:{ all -> 0x00b5 }
            com.veriff.sdk.internal.jw r0 = r10.f57888f     // Catch:{ all -> 0x00b5 }
            java.lang.String r1 = "startSessionData"
            mf0.C24362h.m61210e(r0, r1)     // Catch:{ all -> 0x00b5 }
            boolean r7 = com.veriff.sdk.internal.C21898jx.m53439b(r0)     // Catch:{ all -> 0x00b5 }
            r0 = r11
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00b5 }
            goto L_0x0085
        L_0x006e:
            java.lang.String r11 = "model"
            mf0.C24362h.m61217l(r11)     // Catch:{ all -> 0x00b5 }
            throw r9     // Catch:{ all -> 0x00b5 }
        L_0x0074:
            com.veriff.sdk.internal.sl r11 = new com.veriff.sdk.internal.sl     // Catch:{ all -> 0x00b5 }
            com.veriff.sdk.internal.fp r0 = r10.mo56159j()     // Catch:{ all -> 0x00b5 }
            mobi.lab.veriff.util.h r0 = r0.mo54912f()     // Catch:{ all -> 0x00b5 }
            com.veriff.sdk.internal.ex r0 = r0.mo60691a()     // Catch:{ all -> 0x00b5 }
            r11.<init>(r10, r0, r3, r4)     // Catch:{ all -> 0x00b5 }
        L_0x0085:
            r10.f58392p = r11     // Catch:{ all -> 0x00b5 }
            android.view.View r11 = r11.getView()     // Catch:{ all -> 0x00b5 }
            r10.setContentView(r11)     // Catch:{ all -> 0x00b5 }
            bf0.d r11 = bf0.C21050d.f52856a     // Catch:{ all -> 0x00b5 }
            r8.mo60718d()
            com.veriff.sdk.views.upload.f$b r11 = r10.f58391o
            if (r11 == 0) goto L_0x00af
            r11.mo57991c()
            com.veriff.sdk.internal.fp r11 = r10.mo56159j()
            com.veriff.sdk.internal.fu r11 = r11.mo54908b()
            com.veriff.sdk.internal.gf r0 = com.veriff.sdk.internal.C21716gg.m52949g()
            java.lang.String r1 = "EventFactory.uploadScreenShown()"
            mf0.C24362h.m61210e(r0, r1)
            r11.mo54921a((com.veriff.sdk.internal.C21667gf) r0)
            return
        L_0x00af:
            java.lang.String r11 = "presenter"
            mf0.C24362h.m61217l(r11)
            throw r9
        L_0x00b5:
            r11 = move-exception
            mobi.lab.veriff.util.n$a r0 = mobi.lab.veriff.util.C24469n.f61931a
            r0.mo60718d()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.upload.UploadActivity.mo57959a(boolean):void");
    }

    /* renamed from: a */
    public void mo57955a() {
        if (!mo56159j().mo54909c().mo55950a()) {
            mo56159j().mo54909c().mo55949a((C22064nk.C22065a) this.f58394r);
            String str = SendAuthenticationFlowDataToServerService.f61853a;
            C24426d h_ = mo56158h_();
            C21895jw jwVar = this.f57888f;
            C22661wm wmVar = this.f58389m;
            if (wmVar != null) {
                SendAuthenticationFlowDataToServerService.m61475a(this, str, h_, jwVar, wmVar, this.f58390n, mo56159j().mo54908b());
            } else {
                C24362h.m61217l("session");
                throw null;
            }
        } else {
            C22661wm wmVar2 = this.f58389m;
            if (wmVar2 == null) {
                C24362h.m61217l("session");
                throw null;
            } else if (wmVar2.mo57029m().mo55968a()) {
                f$b f_b = this.f58391o;
                if (f_b != null) {
                    f_b.mo57993e();
                } else {
                    C24362h.m61217l("presenter");
                    throw null;
                }
            } else {
                C21645fu b = mo56159j().mo54908b();
                C21667gf c = C21716gg.m52932c("startUpload");
                C24362h.m61210e(c, "EventFactory.uploadSessionUpdate(\"startUpload\")");
                b.mo54921a(c);
                f$b f_b2 = this.f58391o;
                if (f_b2 != null) {
                    f_b2.mo57987a(mo56158h_().mo60598c());
                } else {
                    C24362h.m61217l("presenter");
                    throw null;
                }
            }
        }
        C22517sk skVar = this.f58392p;
        if (skVar != null) {
            skVar.mo56644a();
        } else {
            C24362h.m61217l(Promotion.ACTION_VIEW);
            throw null;
        }
    }

    /* renamed from: a */
    public void mo57958a(C21719gi giVar) {
        C24362h.m61211f(giVar, "source");
        C21783is isVar = C21783is.upload;
        C22661wm wmVar = this.f58389m;
        if (wmVar != null) {
            mo56152a(isVar, giVar, wmVar);
        } else {
            C24362h.m61217l("session");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo57607a(boolean z, int i) {
        C22661wm wmVar = this.f58389m;
        if (wmVar != null) {
            mo56155a(z, i, wmVar);
        } else {
            C24362h.m61217l("session");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo57956a(int i) {
        C22816c cVar = this.f57890h;
        C22661wm wmVar = this.f58389m;
        if (wmVar != null) {
            cVar.mo57578a(i, wmVar, (Intent) null);
        } else {
            C24362h.m61217l("session");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo57957a(int i, String str) {
        C24362h.m61211f(str, "sessionToken");
        VeriffStatusUpdatesService.startInternal(this, i, str);
        mo56156b(i);
    }
}
