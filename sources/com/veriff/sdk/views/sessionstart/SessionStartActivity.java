package com.veriff.sdk.views.sessionstart;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import bf0.C21050d;
import com.appboy.support.AppboyImageUtils;
import com.veriff.sdk.internal.C21618ez;
import com.veriff.sdk.internal.C21719gi;
import com.veriff.sdk.internal.C21783is;
import com.veriff.sdk.internal.C21789ix;
import com.veriff.sdk.internal.C21895jw;
import com.veriff.sdk.internal.C21898jx;
import com.veriff.sdk.internal.C21911kg;
import com.veriff.sdk.internal.C21989mb;
import com.veriff.sdk.internal.C22233ot;
import com.veriff.sdk.internal.C22512sg;
import com.veriff.sdk.internal.C22607uy;
import com.veriff.sdk.internal.C22661wm;
import com.veriff.sdk.internal.C22696xo;
import com.veriff.sdk.internal.C22700xq;
import com.veriff.sdk.views.base.verification.C22816c;
import com.veriff.sdk.views.base.verification.C22818e;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import mobi.lab.veriff.data.C24426d;
import mobi.lab.veriff.util.C24450d;
import mobi.lab.veriff.util.C24469n;
import p584jl.C17885a;
import wh0.C25211r0;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001+B\u0007¢\u0006\u0004\b)\u0010*J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J \u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016R\u0016\u0010!\u001a\u00020 8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, mo59060d2 = {"Lcom/veriff/sdk/views/sessionstart/SessionStartActivity;", "Lcom/veriff/sdk/views/base/BaseActivity;", "Lcom/veriff/sdk/views/sessionstart/SessionStartMVP$View;", "Landroid/os/Bundle;", "savedInstanceState", "Lbf0/d;", "onCreate", "onBackPressed", "closeDialog", "disableBranding", "", "success", "", "code", "endAuthenticationWithCode", "Lcom/veriff/sdk/internal/data/StartSessionData;", "sessionData", "Lcom/veriff/sdk/views/base/verification/LegacyVerificationNavigator;", "getLegacyNavigator", "data", "goToFinished", "type", "openError", "Lcom/veriff/sdk/internal/analytics/EventSource;", "backButton", "showConfirmExitDialog", "showIntroView", "Lmobi/lab/veriff/data/api/request/response/ResubmittedSession;", "resubmittedSession", "", "uuid", "showResubmission", "Lcom/veriff/sdk/views/sessionstart/ui/LoadingView;", "loadingView", "Lcom/veriff/sdk/views/sessionstart/ui/LoadingView;", "Lcom/veriff/sdk/views/sessionstart/SessionStartPresenter;", "sessionPresenter", "Lcom/veriff/sdk/views/sessionstart/SessionStartPresenter;", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "veriffResourcesProvider", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "<init>", "()V", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public final class SessionStartActivity extends C22233ot implements a$c {

    /* renamed from: f */
    public static final C23010a f58346f = new C23010a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String f58347j = "SessionStartActivity.IS_RELAUNCH";

    /* renamed from: g */
    private C23014c f58348g;

    /* renamed from: h */
    private C22700xq f58349h;

    /* renamed from: i */
    private C22512sg f58350i;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo59060d2 = {"Lcom/veriff/sdk/views/sessionstart/SessionStartActivity$Companion;", "", "Landroid/app/Activity;", "activity", "Lmobi/lab/veriff/data/SessionArguments;", "sessionArguments", "Landroid/content/Intent;", "createIntent", "", "requestCode", "Lbf0/d;", "start", "startForRelaunch", "", "IS_RELAUNCH", "Ljava/lang/String;", "getIS_RELAUNCH", "()Ljava/lang/String;", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.sessionstart.SessionStartActivity$a */
    public static final class C23010a {
        private C23010a() {
        }

        public /* synthetic */ C23010a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo57939a() {
            return SessionStartActivity.f58347j;
        }

        /* renamed from: b */
        public final void mo57940b(Activity activity, C24426d dVar) {
            C24362h.m61211f(activity, "activity");
            C24362h.m61211f(dVar, "sessionArguments");
            Intent a = mo57938a(activity, dVar);
            a.addFlags(AppboyImageUtils.MAX_IMAGE_CACHE_SIZE_BYTES);
            C22233ot.f56062e.mo56162a(a, dVar);
            a.putExtra(mo57939a(), true);
            C21618ez.f54604a.mo54890a(SessionStartActivity.class.getName());
            activity.startActivity(a);
        }

        /* renamed from: a */
        public final Intent mo57938a(Activity activity, C24426d dVar) {
            C24362h.m61211f(activity, "activity");
            C24362h.m61211f(dVar, "sessionArguments");
            return C22233ot.f56062e.mo56162a(new Intent(activity, SessionStartActivity.class), dVar);
        }
    }

    /* renamed from: a */
    public static final Intent m56812a(Activity activity, C24426d dVar) {
        return f58346f.mo57938a(activity, dVar);
    }

    /* renamed from: b */
    public static final void m56814b(Activity activity, C24426d dVar) {
        f58346f.mo57940b(activity, dVar);
    }

    /* renamed from: c */
    private final C22816c m56815c(C21895jw jwVar) {
        return new C22816c(this, mo56158h_(), jwVar, mo56159j().mo54912f());
    }

    /* renamed from: a */
    public void mo57931a() {
        C22696xo g = mo56158h_().mo60604g();
        C22696xo.C22697a aVar = C22696xo.f57357a;
        C24362h.m61206a(g, aVar.mo57107a());
        mo56154a(C24426d.m61426a(mo56158h_(), (String) null, (String) null, (String) null, (String) null, (Map) null, (C24450d) null, aVar.mo57107a(), false, (String) null, (Locale) null, 959, (Object) null));
    }

    /* renamed from: l */
    public void mo56161l() {
        super.mo56161l();
        C23014c cVar = this.f58348g;
        if (cVar != null) {
            cVar.mo57954d();
        } else {
            C24362h.m61217l("sessionPresenter");
            throw null;
        }
    }

    public void onBackPressed() {
        C23014c cVar = this.f58348g;
        if (cVar != null) {
            cVar.mo57952b();
        } else {
            C24362h.m61217l("sessionPresenter");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra(f58347j, false);
        if (!booleanExtra) {
            C21911kg.C21912a aVar = C21911kg.f55391a;
            aVar.mo55694a();
            aVar.mo55695a(mo56159j().mo54910d());
        }
        this.f58349h = new C22700xq(this, mo56158h_().mo60604g());
        C24469n.C24470a aVar2 = C24469n.f61931a;
        C24469n nVar = new C24469n(mo56158h_().mo60604g(), mo56159j().mo54912f().mo60691a(), (C21789ix) null);
        C24469n.C24470a aVar3 = C24469n.f61931a;
        aVar3.mo60715a(nVar);
        try {
            C22700xq xqVar = this.f58349h;
            if (xqVar != null) {
                this.f58350i = new C22512sg(this, xqVar);
                C21050d dVar = C21050d.f52856a;
                aVar3.mo60718d();
                C22512sg sgVar = this.f58350i;
                if (sgVar != null) {
                    setContentView((View) sgVar);
                    C23014c cVar = new C23014c(this, new C23011b(this, mo56158h_(), mo56159j(), new C21989mb(this, mo56159j().mo54910d())), mo56159j().mo54908b(), mo56159j().mo54910d(), mo56159j().mo54911e(), booleanExtra, C17885a.m44426W(this), C25211r0.f63482b);
                    this.f58348g = cVar;
                    cVar.mo56242a();
                    return;
                }
                C24362h.m61217l("loadingView");
                throw null;
            }
            C24362h.m61217l("veriffResourcesProvider");
            throw null;
        } catch (Throwable th) {
            C24469n.f61931a.mo60718d();
            throw th;
        }
    }

    /* renamed from: b */
    public void mo57937b(C21895jw jwVar) {
        C24362h.m61211f(jwVar, "data");
        m56815c(jwVar).mo57581a((C22661wm) null);
    }

    /* renamed from: a */
    public void mo57932a(int i) {
        mo57935a(C21898jx.m53437a(), i);
    }

    /* renamed from: a */
    public void mo57935a(C21895jw jwVar, int i) {
        C24362h.m61211f(jwVar, "sessionData");
        C22818e.C22819a.m56103a(m56815c(jwVar), i, (C22661wm) null, (Intent) null, 6, (Object) null);
    }

    /* renamed from: a */
    public void mo57934a(C21895jw jwVar) {
        C24362h.m61211f(jwVar, "data");
        m56815c(jwVar).mo57579a(jwVar);
    }

    /* renamed from: a */
    public void mo57936a(C21895jw jwVar, C22607uy uyVar, String str) {
        C24362h.m61211f(jwVar, "data");
        C24362h.m61211f(uyVar, "resubmittedSession");
        C24362h.m61211f(str, "uuid");
        m56815c(jwVar).mo57580a(uyVar, true);
    }

    /* renamed from: a */
    public void mo57933a(C21719gi giVar) {
        C24362h.m61211f(giVar, "backButton");
        mo56152a(C21783is.intro, giVar, (C22661wm) null);
        C23014c cVar = this.f58348g;
        if (cVar != null) {
            cVar.mo57953c();
        } else {
            C24362h.m61217l("sessionPresenter");
            throw null;
        }
    }
}
