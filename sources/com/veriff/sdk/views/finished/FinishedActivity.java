package com.veriff.sdk.views.finished;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import bf0.C21050d;
import com.appboy.support.AppboyImageUtils;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C21616ex;
import com.veriff.sdk.internal.C21645fu;
import com.veriff.sdk.internal.C21719gi;
import com.veriff.sdk.internal.C21783is;
import com.veriff.sdk.internal.C21789ix;
import com.veriff.sdk.internal.C21895jw;
import com.veriff.sdk.internal.C22323qi;
import com.veriff.sdk.internal.C22661wm;
import com.veriff.sdk.internal.C22700xq;
import com.veriff.sdk.views.base.verification.C22814a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import mobi.lab.veriff.data.C24426d;
import mobi.lab.veriff.util.C24469n;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0012\u0018\u00002\u00020\u00012\u00020\u0002:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\u001a\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, mo59060d2 = {"Lcom/veriff/sdk/views/finished/FinishedActivity;", "Lcom/veriff/sdk/views/base/verification/BaseVerificationActivity;", "Lcom/veriff/sdk/views/finished/FinishedMVP$View;", "Lbf0/d;", "onBackPressed", "", "isSuccessful", "", "status", "endAuthenticationWithCode", "finishVerificationSuccessfully", "isRecreate", "Landroid/os/Bundle;", "state", "onCreateLibraryActivity", "Lcom/veriff/sdk/internal/analytics/EventSource;", "source", "showConfirmExitDialog", "com/veriff/sdk/views/finished/FinishedActivity$listener$1", "listener", "Lcom/veriff/sdk/views/finished/FinishedActivity$listener$1;", "Lcom/veriff/sdk/views/finished/FinishedMVP$Presenter;", "presenter", "Lcom/veriff/sdk/views/finished/FinishedMVP$Presenter;", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "session", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "veriffResourcesProvider", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "<init>", "()V", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public final class FinishedActivity extends C22814a implements a$b {

    /* renamed from: l */
    public static final C22940a f58242l = new C22940a((DefaultConstructorMarker) null);

    /* renamed from: m */
    private C22661wm f58243m;

    /* renamed from: n */
    private C22700xq f58244n;

    /* renamed from: o */
    private a$a f58245o;

    /* renamed from: p */
    private final C22941b f58246p = new C22941b(this);

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo59060d2 = {"Lcom/veriff/sdk/views/finished/FinishedActivity$Companion;", "", "()V", "EXTRA_FLOW_SESSION", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "sessionArguments", "Lmobi/lab/veriff/data/SessionArguments;", "startSessionData", "Lcom/veriff/sdk/internal/data/StartSessionData;", "session", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.finished.FinishedActivity$a */
    public static final class C22940a {
        private C22940a() {
        }

        public /* synthetic */ C22940a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo57851a(Context context, C24426d dVar, C21895jw jwVar, C22661wm wmVar) {
            C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
            C24362h.m61211f(dVar, "sessionArguments");
            C24362h.m61211f(jwVar, "startSessionData");
            Intent intent = new Intent(context, FinishedActivity.class);
            intent.setFlags(AppboyImageUtils.MAX_IMAGE_CACHE_SIZE_BYTES);
            C22814a.m56078a(intent, dVar, jwVar);
            intent.putExtra("EXTRA_FLOW_SESSION", wmVar);
            return intent;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo59060d2 = {"com/veriff/sdk/views/finished/FinishedActivity$listener$1", "Lcom/veriff/sdk/views/finished/ui/FinishedView$Listener;", "Lbf0/d;", "onDoneClicked", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.finished.FinishedActivity$b */
    public static final class C22941b implements C22323qi.C22325a {

        /* renamed from: a */
        public final /* synthetic */ FinishedActivity f58247a;

        public C22941b(FinishedActivity finishedActivity) {
            this.f58247a = finishedActivity;
        }

        /* renamed from: a */
        public void mo56333a() {
            FinishedActivity.m56691a(this.f58247a).mo57852b();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ a$a m56691a(FinishedActivity finishedActivity) {
        a$a a_a = finishedActivity.f58245o;
        if (a_a != null) {
            return a_a;
        }
        C24362h.m61217l("presenter");
        throw null;
    }

    public void onBackPressed() {
        a$a a_a = this.f58245o;
        if (a_a != null) {
            a_a.mo57853c();
        } else {
            C24362h.m61217l("presenter");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo57572a(boolean z, Bundle bundle) {
        this.f58243m = (C22661wm) getIntent().getParcelableExtra("EXTRA_FLOW_SESSION");
        C24469n.C24470a aVar = C24469n.f61931a;
        C24469n nVar = new C24469n(mo56158h_().mo60604g(), mo56159j().mo54912f().mo60691a(), mo57577m());
        C24469n.C24470a aVar2 = C24469n.f61931a;
        aVar2.mo60715a(nVar);
        try {
            C21645fu b = mo56159j().mo54908b();
            C21789ix m = mo57577m();
            C24362h.m61210e(m, "featureFlags");
            this.f58245o = new C22942b(this, b, m);
            this.f58244n = new C22700xq(this, mo56158h_().mo60604g());
            C21789ix m2 = mo57577m();
            C24362h.m61210e(m2, "featureFlags");
            C21616ex a = mo56159j().mo54912f().mo60691a();
            C22700xq xqVar = this.f58244n;
            if (xqVar != null) {
                setContentView(new C22323qi(this, m2, a, xqVar, this.f58246p));
                a$a a_a = this.f58245o;
                if (a_a != null) {
                    a_a.mo56242a();
                    C21050d dVar = C21050d.f52856a;
                    aVar2.mo60718d();
                    return;
                }
                C24362h.m61217l("presenter");
                throw null;
            }
            C24362h.m61217l("veriffResourcesProvider");
            throw null;
        } catch (Throwable th) {
            C24469n.f61931a.mo60718d();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo57850a(C21719gi giVar) {
        C24362h.m61211f(giVar, "source");
        mo56152a(C21783is.finished, giVar, this.f58243m);
    }

    /* renamed from: a */
    public void mo57849a() {
        mo56155a(true, 100, this.f58243m);
    }
}
