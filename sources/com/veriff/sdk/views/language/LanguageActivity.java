package com.veriff.sdk.views.language;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import bf0.C21050d;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C21789ix;
import com.veriff.sdk.internal.C21895jw;
import com.veriff.sdk.internal.C22392rm;
import com.veriff.sdk.internal.C22700xq;
import com.veriff.sdk.views.base.verification.C22814a;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf0.C24240p;
import mf0.C24362h;
import mobi.lab.veriff.data.C24426d;
import mobi.lab.veriff.util.C24454g;
import mobi.lab.veriff.util.C24457h;
import mobi.lab.veriff.util.C24469n;
import p584jl.C17885a;
import wh0.C25177g;
import wh0.C25235z;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001a\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, mo59060d2 = {"Lcom/veriff/sdk/views/language/LanguageActivity;", "Lcom/veriff/sdk/views/base/verification/BaseVerificationActivity;", "Lcom/veriff/sdk/views/language/LanguageMVP$View;", "Lmobi/lab/veriff/util/LanguageCountryLocale;", "languageCountryLocale", "Lbf0/d;", "changeLanguage", "", "success", "closeView", "isRecreate", "Landroid/os/Bundle;", "state", "onCreateLibraryActivity", "Lcom/veriff/sdk/views/language/LanguageMVP$Presenter;", "presenter", "Lcom/veriff/sdk/views/language/LanguageMVP$Presenter;", "Lcom/veriff/sdk/views/language/ui/LanguageView;", "view", "Lcom/veriff/sdk/views/language/ui/LanguageView;", "<init>", "()V", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public final class LanguageActivity extends C22814a implements a$b {

    /* renamed from: l */
    public static final C22943a f58252l = new C22943a((DefaultConstructorMarker) null);

    /* renamed from: m */
    private a$a f58253m;

    /* renamed from: n */
    private C22392rm f58254n;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, mo59060d2 = {"Lcom/veriff/sdk/views/language/LanguageActivity$Companion;", "", "()V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "sessionArguments", "Lmobi/lab/veriff/data/SessionArguments;", "startSessionData", "Lcom/veriff/sdk/internal/data/StartSessionData;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.language.LanguageActivity$a */
    public static final class C22943a {
        private C22943a() {
        }

        public /* synthetic */ C22943a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo57856a(Context context, C24426d dVar, C21895jw jwVar) {
            C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
            C24362h.m61211f(jwVar, "startSessionData");
            Intent a = C22814a.m56078a(new Intent(context, LanguageActivity.class), dVar, jwVar);
            C24362h.m61210e(a, "populateIntentArguments(…SessionData\n            )");
            return a;
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.language.LanguageActivity$changeLanguage$1", mo58555f = "LanguageActivity.kt", mo58556l = {54}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.language.LanguageActivity$b */
    public static final class C22944b extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f58255a;

        /* renamed from: b */
        public final /* synthetic */ LanguageActivity f58256b;

        /* renamed from: c */
        public final /* synthetic */ C24454g f58257c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22944b(LanguageActivity languageActivity, C24454g gVar, C23349c cVar) {
            super(2, cVar);
            this.f58256b = languageActivity;
            this.f58257c = gVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22944b(this.f58256b, this.f58257c, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22944b) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f58255a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                C24457h f = this.f58256b.mo56159j().mo54912f();
                C24454g gVar = this.f58257c;
                this.f58255a = 1;
                if (f.mo60694a(gVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C17885a.m44475z0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LanguageActivity.m56704a(this.f58256b).mo57859b();
            return C21050d.f52856a;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007¸\u0006\u0000"}, mo59060d2 = {"com/veriff/sdk/views/language/LanguageActivity$onCreateLibraryActivity$1$1", "Lcom/veriff/sdk/views/language/ui/LanguageView$Listener;", "Lbf0/d;", "onCloseClicked", "Lmobi/lab/veriff/util/LanguageCountryLocale;", "languageCountryLocale", "onLanguageSelected", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.language.LanguageActivity$c */
    public static final class C22945c implements C22392rm.C22393a {

        /* renamed from: a */
        public final /* synthetic */ LanguageActivity f58258a;

        public C22945c(LanguageActivity languageActivity, C22700xq xqVar, C24457h hVar, boolean z) {
            this.f58258a = languageActivity;
        }

        /* renamed from: a */
        public void mo56462a(C24454g gVar) {
            C24362h.m61211f(gVar, "languageCountryLocale");
            LanguageActivity.m56704a(this.f58258a).mo57858a(gVar);
        }

        /* renamed from: a */
        public void mo56461a() {
            LanguageActivity.m56704a(this.f58258a).mo57857a();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ a$a m56704a(LanguageActivity languageActivity) {
        a$a a_a = languageActivity.f58253m;
        if (a_a != null) {
            return a_a;
        }
        C24362h.m61217l("presenter");
        throw null;
    }

    /* renamed from: a */
    public void mo57572a(boolean z, Bundle bundle) {
        this.f58253m = new C22946b(this);
        C21789ix m = mo57577m();
        boolean i = m != null ? m.mo55457i() : false;
        C22700xq xqVar = new C22700xq(this, mo56158h_().mo60604g());
        C24457h f = mo56159j().mo54912f();
        C24469n.C24470a aVar = C24469n.f61931a;
        C24469n nVar = new C24469n(mo56158h_().mo60604g(), mo56159j().mo54912f().mo60691a(), mo57577m());
        C24469n.C24470a aVar2 = C24469n.f61931a;
        aVar2.mo60715a(nVar);
        try {
            C22392rm rmVar = new C22392rm(this, xqVar, mo57577m(), mo56159j().mo54912f().mo60691a(), f.mo60696b(), i, new C22945c(this, xqVar, f, i));
            this.f58254n = rmVar;
            setContentView(rmVar);
            C22392rm rmVar2 = this.f58254n;
            if (rmVar2 != null) {
                rmVar2.mo56460a((AppCompatActivity) this);
                C21050d dVar = C21050d.f52856a;
                aVar2.mo60718d();
                return;
            }
            C24362h.m61217l(Promotion.ACTION_VIEW);
            throw null;
        } catch (Throwable th) {
            C24469n.f61931a.mo60718d();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo57855a(boolean z) {
        setResult(z ? -1 : 0);
        finish();
    }

    /* renamed from: a */
    public void mo57854a(C24454g gVar) {
        C24362h.m61211f(gVar, "languageCountryLocale");
        if (!C24362h.m61206a(gVar, mo56159j().mo54912f().mo60696b())) {
            C22392rm rmVar = this.f58254n;
            if (rmVar != null) {
                rmVar.mo56459a();
                C25177g.m63218b(C17885a.m44426W(this), (CoroutineContext) null, new C22944b(this, gVar, (C23349c) null), 3);
                return;
            }
            C24362h.m61217l(Promotion.ACTION_VIEW);
            throw null;
        }
        a$a a_a = this.f58253m;
        if (a_a != null) {
            a_a.mo57860c();
        } else {
            C24362h.m61217l("presenter");
            throw null;
        }
    }
}
