package com.veriff.sdk.views.resubmission;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import bf0.C21050d;
import com.appboy.support.AppboyImageUtils;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C21616ex;
import com.veriff.sdk.internal.C21637fn;
import com.veriff.sdk.internal.C21719gi;
import com.veriff.sdk.internal.C21720gj;
import com.veriff.sdk.internal.C21783is;
import com.veriff.sdk.internal.C21789ix;
import com.veriff.sdk.internal.C21791iy;
import com.veriff.sdk.internal.C21895jw;
import com.veriff.sdk.internal.C21898jx;
import com.veriff.sdk.internal.C21910kf;
import com.veriff.sdk.internal.C22506se;
import com.veriff.sdk.internal.C22607uy;
import com.veriff.sdk.internal.C22661wm;
import com.veriff.sdk.internal.C22700xq;
import com.veriff.sdk.views.base.verification.C22814a;
import com.veriff.sdk.views.base.verification.C22816c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import mobi.lab.veriff.data.C24426d;
import mobi.lab.veriff.util.C24469n;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\"\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\u001a\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0014H\u0002R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, mo59060d2 = {"Lcom/veriff/sdk/views/resubmission/ResubmissionActivity;", "Lcom/veriff/sdk/views/base/verification/BaseVerificationActivity;", "Lcom/veriff/sdk/views/resubmission/ResubmissionMVP$View;", "Lbf0/d;", "onBackPressed", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "createNewView", "", "success", "code", "endAuthenticationWithCode", "isRecreate", "Landroid/os/Bundle;", "state", "onCreateLibraryActivity", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "openLanguageView", "Lcom/veriff/sdk/internal/analytics/EventSource;", "source", "showConfirmExitDialog", "flags", "startFlow", "Lcom/veriff/sdk/views/resubmission/ResubmissionMVP$Presenter;", "presenter", "Lcom/veriff/sdk/views/resubmission/ResubmissionMVP$Presenter;", "<init>", "()V", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public final class ResubmissionActivity extends C22814a implements a$b {

    /* renamed from: l */
    public static final C22948a f58261l = new C22948a((DefaultConstructorMarker) null);

    /* renamed from: m */
    private a$a f58262m;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo59060d2 = {"Lcom/veriff/sdk/views/resubmission/ResubmissionActivity$Companion;", "", "()V", "EXTRA_IS_FROM_DECISION", "", "EXTRA_RESUBMISSION", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "sessionArguments", "Lmobi/lab/veriff/data/SessionArguments;", "startSessionData", "Lcom/veriff/sdk/internal/data/StartSessionData;", "resubmittedSession", "Lmobi/lab/veriff/data/api/request/response/ResubmittedSession;", "isFromDecision", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.resubmission.ResubmissionActivity$a */
    public static final class C22948a {
        private C22948a() {
        }

        public /* synthetic */ C22948a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo57864a(Context context, C24426d dVar, C21895jw jwVar, C22607uy uyVar, boolean z) {
            C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
            C24362h.m61211f(dVar, "sessionArguments");
            C24362h.m61211f(jwVar, "startSessionData");
            C24362h.m61211f(uyVar, "resubmittedSession");
            Intent intent = new Intent(context, ResubmissionActivity.class);
            intent.setFlags(AppboyImageUtils.MAX_IMAGE_CACHE_SIZE_BYTES);
            C22814a.m56078a(intent, dVar, jwVar);
            intent.putExtra("mobi.lab.veriff.views.resubmission.EXTRA_RESUBMISSION", uyVar);
            intent.putExtra("mobi.lab.veriff.views.resubmission.EXTRA_IS_FROM_DECISION", z);
            return intent;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006¸\u0006\u0000"}, mo59060d2 = {"com/veriff/sdk/views/resubmission/ResubmissionActivity$createNewView$1$resubmissionView$1", "Lcom/veriff/sdk/views/resubmission/ui/ResubmissionView$Listener;", "Lbf0/d;", "onCloseButtonPressed", "onLanguageClicked", "onStartClicked", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.resubmission.ResubmissionActivity$b */
    public static final class C22949b implements C22506se.C22510a {

        /* renamed from: a */
        public final /* synthetic */ ResubmissionActivity f58263a;

        public C22949b(ResubmissionActivity resubmissionActivity, C22953d dVar, C22700xq xqVar) {
            this.f58263a = resubmissionActivity;
        }

        /* renamed from: a */
        public void mo56637a() {
            ResubmissionActivity resubmissionActivity = this.f58263a;
            C21789ix a = resubmissionActivity.mo57577m();
            C24362h.m61210e(a, "featureFlags");
            resubmissionActivity.m56725b(a);
        }

        /* renamed from: b */
        public void mo56638b() {
            ResubmissionActivity.m56724b(this.f58263a).mo57866a();
        }

        /* renamed from: c */
        public void mo56639c() {
            ResubmissionActivity.m56724b(this.f58263a).mo57870c();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.resubmission.ResubmissionActivity$c */
    public static final class C22950c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ResubmissionActivity f58264a;

        public C22950c(ResubmissionActivity resubmissionActivity) {
            this.f58264a = resubmissionActivity;
        }

        public final void run() {
            ResubmissionActivity.m56724b(this.f58264a).mo57868a(this.f58264a.mo56159j().mo54912f().mo60696b());
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ a$a m56724b(ResubmissionActivity resubmissionActivity) {
        a$a a_a = resubmissionActivity.f58262m;
        if (a_a != null) {
            return a_a;
        }
        C24362h.m61217l("presenter");
        throw null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 8 && i2 == -1) {
            C21637fn.m52523c().mo54894a(new C22950c(this));
        }
    }

    public void onBackPressed() {
        a$a a_a = this.f58262m;
        if (a_a != null) {
            a_a.mo57869b();
        } else {
            C24362h.m61217l("presenter");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m56725b(C21789ix ixVar) {
        if (!ixVar.mo55458j() || !ixVar.mo55462n()) {
            this.f57890h.mo57585b();
            return;
        }
        C22816c cVar = this.f57890h;
        C21791iy.C21840a aVar = C21791iy.f55198q;
        C21895jw jwVar = this.f57888f;
        C24362h.m61210e(jwVar, "startSessionData");
        cVar.mo57584a((List<? extends C21791iy>) aVar.mo55540a(ixVar, C21898jx.m53438a(jwVar)));
    }

    /* renamed from: a */
    public void mo57572a(boolean z, Bundle bundle) {
        C21789ix m = mo57577m();
        if (m != null) {
            this.f58262m = new C22951b(this, m, mo56159j().mo54908b());
            mo57861a();
            return;
        }
        throw new IllegalStateException("Feature flags cannot be null");
    }

    /* renamed from: a */
    public void mo57861a() {
        C22607uy uyVar = (C22607uy) getIntent().getParcelableExtra("mobi.lab.veriff.views.resubmission.EXTRA_RESUBMISSION");
        if (uyVar != null) {
            boolean booleanExtra = getIntent().getBooleanExtra("mobi.lab.veriff.views.resubmission.EXTRA_IS_FROM_DECISION", false);
            C22954e a = C22954e.f58279h.mo57879a(uyVar.mo56891c());
            C22953d a2 = a != null ? a.mo57878a(uyVar.mo56892d()) : null;
            if (a2 == null) {
                C21910kf d = mo56159j().mo54910d();
                StringBuilder k = C13555b.m33972k("No UI for resubmission code=");
                k.append(uyVar.mo56891c());
                k.append(' ');
                k.append("doc=");
                k.append(uyVar.mo56892d());
                d.mo55690a(new IllegalStateException(k.toString()), "ResubmissionActivity", C21720gj.resubmission);
                C21789ix m = mo57577m();
                C24362h.m61210e(m, "featureFlags");
                m56725b(m);
                return;
            }
            C22700xq xqVar = new C22700xq(this, mo56158h_().mo60604g());
            C24469n.C24470a aVar = C24469n.f61931a;
            C24469n nVar = new C24469n(mo56158h_().mo60604g(), mo56159j().mo54912f().mo60691a(), mo57577m());
            C24469n.C24470a aVar2 = C24469n.f61931a;
            aVar2.mo60715a(nVar);
            try {
                C21616ex a3 = mo56159j().mo54912f().mo60691a();
                C21789ix m2 = mo57577m();
                C24362h.m61210e(m2, "featureFlags");
                setContentView(new C22506se(this, a3, a2, m2, mo56159j().mo54908b(), xqVar, new C22949b(this, a2, xqVar)));
                C21050d dVar = C21050d.f52856a;
                aVar2.mo60718d();
                a$a a_a = this.f58262m;
                if (a_a != null) {
                    a_a.mo57867a(uyVar.mo56891c(), booleanExtra);
                } else {
                    C24362h.m61217l("presenter");
                    throw null;
                }
            } catch (Throwable th) {
                C24469n.f61931a.mo60718d();
                throw th;
            }
        } else {
            throw new IllegalStateException("ResubmittedSession cannot be null");
        }
    }

    /* renamed from: a */
    public void mo57862a(C21719gi giVar) {
        C24362h.m61211f(giVar, "source");
        mo56152a(C21783is.resubmission_feedback, C21719gi.BACK_BUTTON, (C22661wm) null);
    }

    /* renamed from: a */
    public void mo57863a(C21789ix ixVar) {
        C24362h.m61211f(ixVar, "featureFlags");
        this.f57890h.mo57586c();
    }
}
