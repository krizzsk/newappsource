package com.veriff.sdk.internal;

import bf0.C21050d;
import com.appboy.Constants;
import com.appsflyer.internal.referrer.Payload;
import ff0.C23349c;
import gf0.C23413c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mf0.C24362h;
import mobi.lab.veriff.data.C24426d;
import mobi.lab.veriff.util.C24457h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0002KLB1\b\u0007\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\bI\u0010JJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J#\u0010\t\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u001c8\u0016XD¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001eR\u001a\u0010\"\u001a\u00020\u001c8\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\"\u0010\u001eR\u001a\u0010#\u001a\u00020\u001c8\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b#\u0010\u001eR\u0014\u0010%\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010\u00108\u0016X\u0004¢\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010\u0012R\u001c\u0010,\u001a\u0004\u0018\u00010\u00108\u0016X\u0004¢\u0006\f\n\u0004\b,\u0010\u001a\u001a\u0004\b-\u0010\u0012R\u001c\u0010.\u001a\u0004\u0018\u00010\u00108\u0016X\u0004¢\u0006\f\n\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010\u0012R\"\u00101\u001a\u0002008\u0016@\u0016X.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0014\u00108\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u001eR\u0014\u0010:\u001a\u0002098\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010=\u001a\u00020<8\u0016X\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u001eR\u001a\u0010C\u001a\u00020\u001c8\u0016X\u0004¢\u0006\f\n\u0004\bC\u0010 \u001a\u0004\bD\u0010\u001eR\u001a\u0010E\u001a\u00020\u001c8\u0016X\u0004¢\u0006\f\n\u0004\bE\u0010 \u001a\u0004\bF\u0010\u001eR\u001c\u0010G\u001a\u0004\u0018\u00010\u00108\u0016X\u0004¢\u0006\f\n\u0004\bG\u0010\u001a\u001a\u0004\bH\u0010\u0012\u0002\u0004\n\u0002\b\u0019¨\u0006M"}, mo59060d2 = {"Lcom/veriff/sdk/views/intro/IntroModel;", "Lcom/veriff/sdk/views/intro/IntroMVP$Model;", "", "Lcom/veriff/sdk/internal/data/FlowStep;", "flowSteps", "Lbf0/d;", "changeStatusToStarted", "Lmobi/lab/veriff/data/api/request/response/TranslatedString;", "intros", "getConfiguration", "(Ljava/util/List;Lff0/c;)Ljava/lang/Object;", "getIntroStrings", "(Lff0/c;)Ljava/lang/Object;", "Lmobi/lab/veriff/network/VeriffApi$ApiService;", "apiService", "Lmobi/lab/veriff/network/VeriffApi$ApiService;", "", "getCurrentlanguageCode", "()Ljava/lang/String;", "currentlanguageCode", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "getFeatureFlags", "()Lcom/veriff/sdk/internal/data/FeatureFlags;", "idvSessionUuid", "Ljava/lang/String;", "getIdvSessionUuid", "", "isNfcPermitted", "()Z", "isNfcRequired", "Z", "isNfcSupportedDevice", "isVideoEnabled", "isVideoRequired", "Lmobi/lab/veriff/util/LanguageUtil;", "languageUtil", "Lmobi/lab/veriff/util/LanguageUtil;", "Lcom/veriff/sdk/views/nfc/NfcClient;", "nfc", "Lcom/veriff/sdk/views/nfc/NfcClient;", "poaSessionUuid", "getPoaSessionUuid", "preselectedCountry", "getPreselectedCountry", "preselectedDocument", "getPreselectedDocument", "Lcom/veriff/sdk/views/intro/IntroMVP$Presenter;", "presenter", "Lcom/veriff/sdk/views/intro/IntroMVP$Presenter;", "getPresenter", "()Lcom/veriff/sdk/views/intro/IntroMVP$Presenter;", "setPresenter", "(Lcom/veriff/sdk/views/intro/IntroMVP$Presenter;)V", "getRequiresStringsRefetch", "requiresStringsRefetch", "Lmobi/lab/veriff/data/SessionArguments;", "sessionArguments", "Lmobi/lab/veriff/data/SessionArguments;", "Lcom/veriff/sdk/internal/data/StartSessionData;", "sessionData", "Lcom/veriff/sdk/internal/data/StartSessionData;", "getSessionData", "()Lcom/veriff/sdk/internal/data/StartSessionData;", "getShouldShowCountrySelection", "shouldShowCountrySelection", "shouldShowResubmissionFeedback", "getShouldShowResubmissionFeedback", "shouldSkipIntro", "getShouldSkipIntro", "vendorName", "getVendorName", "<init>", "(Lcom/veriff/sdk/internal/data/StartSessionData;Lcom/veriff/sdk/views/nfc/NfcClient;Lmobi/lab/veriff/data/SessionArguments;Lmobi/lab/veriff/network/VeriffApi$ApiService;Lmobi/lab/veriff/util/LanguageUtil;)V", "POASessionStatusRequestCallback", "SessionStatusRequestCallback", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.qv */
public final class C22354qv implements qu$a {

    /* renamed from: a */
    public qu$b f56384a;

    /* renamed from: b */
    private final C21789ix f56385b = mo56365a().mo55640c();

    /* renamed from: c */
    private final boolean f56386c;

    /* renamed from: d */
    private final boolean f56387d;

    /* renamed from: f */
    private final String f56388f;

    /* renamed from: h */
    private final String f56389h;

    /* renamed from: i */
    private final String f56390i;

    /* renamed from: j */
    private final String f56391j;

    /* renamed from: k */
    private final boolean f56392k;

    /* renamed from: l */
    private final boolean f56393l;

    /* renamed from: m */
    private final C21895jw f56394m;

    /* renamed from: n */
    private final C22420rr f56395n;

    /* renamed from: o */
    private final C24426d f56396o;

    /* renamed from: p */
    private final xb$a f56397p;

    /* renamed from: q */
    private final C24457h f56398q;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016J$\u0010\f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, mo59060d2 = {"Lcom/veriff/sdk/views/intro/IntroModel$POASessionStatusRequestCallback;", "Lmobi/lab/veriff/network/RequestCallback;", "Lmobi/lab/veriff/data/api/request/response/EmptyResponse;", "Lck0/b;", "call", "Lck0/r;", "response", "Lbf0/d;", "onError", "", "t", "onFail", "onSuccess", "Lmobi/lab/veriff/network/VeriffApi$ApiService;", "apiService", "Lmobi/lab/veriff/network/VeriffApi$ApiService;", "", "Lcom/veriff/sdk/internal/data/FlowStep;", "flowSteps", "Ljava/util/List;", "Lcom/veriff/sdk/views/intro/IntroMVP$Presenter;", "presenter", "Lcom/veriff/sdk/views/intro/IntroMVP$Presenter;", "Lcom/veriff/sdk/internal/data/StartSessionData;", "sessionData", "Lcom/veriff/sdk/internal/data/StartSessionData;", "", "sessionToken", "Ljava/lang/String;", "<init>", "(Ljava/util/List;Lcom/veriff/sdk/views/intro/IntroMVP$Presenter;Lcom/veriff/sdk/internal/data/StartSessionData;Lmobi/lab/veriff/network/VeriffApi$ApiService;Ljava/lang/String;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qv$a */
    public static final class C22355a extends C22673wx<C22558tn> {

        /* renamed from: a */
        private final List<C21791iy> f56399a;

        /* renamed from: b */
        private final qu$b f56400b;

        /* renamed from: c */
        private final C21895jw f56401c;

        /* renamed from: d */
        private final xb$a f56402d;

        /* renamed from: e */
        private final String f56403e;

        public C22355a(List<? extends C21791iy> list, qu$b qu_b, C21895jw jwVar, xb$a xb_a, String str) {
            C24362h.m61211f(list, "flowSteps");
            C24362h.m61211f(qu_b, "presenter");
            C24362h.m61211f(jwVar, "sessionData");
            C24362h.m61211f(xb_a, "apiService");
            C24362h.m61211f(str, "sessionToken");
            this.f56399a = list;
            this.f56400b = qu_b;
            this.f56401c = jwVar;
            this.f56402d = xb_a;
            this.f56403e = str;
        }

        /* renamed from: a */
        public void mo54929a(ace<C22558tn> ace, Throwable th) {
            C24362h.m61211f(ace, "call");
            C24362h.m61211f(th, Constants.APPBOY_PUSH_TITLE_KEY);
            this.f56400b.mo56387a(th, "changeStatusToStarted()");
        }

        /* renamed from: a_ */
        public void mo54930a_(ace<C22558tn> ace, acu<C22558tn> acu) {
            C24362h.m61211f(ace, "call");
            C24362h.m61211f(acu, Payload.RESPONSE);
            if (C21898jx.m53439b(this.f56401c)) {
                this.f56400b.mo56388a((List<? extends C21791iy>) this.f56399a);
            } else {
                this.f56402d.mo57063b(this.f56403e, C22545td.f56892a.mo56702b()).mo54003a(new C22356b(this.f56399a, this.f56400b));
            }
        }

        /* renamed from: b */
        public void mo54931b(ace<C22558tn> ace, acu<C22558tn> acu) {
            C24362h.m61211f(ace, "call");
            C24362h.m61211f(acu, Payload.RESPONSE);
            StringBuilder k = C13555b.m33972k("Backend call failed with ");
            k.append(acu.mo54070a());
            this.f56400b.mo56386a((Throwable) new IllegalStateException(k.toString()));
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016J$\u0010\f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, mo59060d2 = {"Lcom/veriff/sdk/views/intro/IntroModel$SessionStatusRequestCallback;", "Lmobi/lab/veriff/network/RequestCallback;", "Lmobi/lab/veriff/data/api/request/response/EmptyResponse;", "Lck0/b;", "call", "Lck0/r;", "response", "Lbf0/d;", "onError", "", "t", "onFail", "onSuccess", "", "Lcom/veriff/sdk/internal/data/FlowStep;", "flowSteps", "Ljava/util/List;", "Lcom/veriff/sdk/views/intro/IntroMVP$Presenter;", "presenter", "Lcom/veriff/sdk/views/intro/IntroMVP$Presenter;", "<init>", "(Ljava/util/List;Lcom/veriff/sdk/views/intro/IntroMVP$Presenter;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qv$b */
    public static final class C22356b extends C22673wx<C22558tn> {

        /* renamed from: a */
        private final List<C21791iy> f56404a;

        /* renamed from: b */
        private final qu$b f56405b;

        public C22356b(List<? extends C21791iy> list, qu$b qu_b) {
            C24362h.m61211f(list, "flowSteps");
            C24362h.m61211f(qu_b, "presenter");
            this.f56404a = list;
            this.f56405b = qu_b;
        }

        /* renamed from: a */
        public void mo54929a(ace<C22558tn> ace, Throwable th) {
            C24362h.m61211f(ace, "call");
            C24362h.m61211f(th, Constants.APPBOY_PUSH_TITLE_KEY);
            this.f56405b.mo56387a(th, "changeStatusToStarted()");
        }

        /* renamed from: a_ */
        public void mo54930a_(ace<C22558tn> ace, acu<C22558tn> acu) {
            C24362h.m61211f(ace, "call");
            C24362h.m61211f(acu, Payload.RESPONSE);
            this.f56405b.mo56388a((List<? extends C21791iy>) this.f56404a);
        }

        /* renamed from: b */
        public void mo54931b(ace<C22558tn> ace, acu<C22558tn> acu) {
            C24362h.m61211f(ace, "call");
            C24362h.m61211f(acu, Payload.RESPONSE);
            StringBuilder k = C13555b.m33972k("Backend call failed with ");
            k.append(acu.mo54070a());
            this.f56405b.mo56386a((Throwable) new IllegalStateException(k.toString()));
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.intro.IntroModel", mo58555f = "IntroModel.kt", mo58556l = {162}, mo58557m = "getConfiguration")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, mo59060d2 = {"", "Lmobi/lab/veriff/data/api/request/response/TranslatedString;", "intros", "Lff0/c;", "Lbf0/d;", "continuation", "", "getConfiguration"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qv$c */
    public static final class C22357c extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f56406a;

        /* renamed from: b */
        public int f56407b;

        /* renamed from: c */
        public final /* synthetic */ C22354qv f56408c;

        /* renamed from: d */
        public Object f56409d;

        /* renamed from: e */
        public Object f56410e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22357c(C22354qv qvVar, C23349c cVar) {
            super(cVar);
            this.f56408c = qvVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f56406a = obj;
            this.f56407b |= Integer.MIN_VALUE;
            return this.f56408c.mo56367a((List<C22614vd>) null, this);
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.intro.IntroModel", mo58555f = "IntroModel.kt", mo58556l = {84}, mo58557m = "getIntroStrings")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo59060d2 = {"Lff0/c;", "Lbf0/d;", "continuation", "", "getIntroStrings"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qv$d */
    public static final class C22358d extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f56411a;

        /* renamed from: b */
        public int f56412b;

        /* renamed from: c */
        public final /* synthetic */ C22354qv f56413c;

        /* renamed from: d */
        public Object f56414d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22358d(C22354qv qvVar, C23349c cVar) {
            super(cVar);
            this.f56413c = qvVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f56411a = obj;
            this.f56412b |= Integer.MIN_VALUE;
            return this.f56413c.mo56366a((C23349c<? super C21050d>) this);
        }
    }

    public C22354qv(C21895jw jwVar, C22420rr rrVar, C24426d dVar, xb$a xb_a, C24457h hVar) {
        boolean z;
        boolean z2;
        C24362h.m61211f(jwVar, "sessionData");
        C24362h.m61211f(rrVar, "nfc");
        C24362h.m61211f(dVar, "sessionArguments");
        C24362h.m61211f(xb_a, "apiService");
        C24362h.m61211f(hVar, "languageUtil");
        this.f56394m = jwVar;
        this.f56395n = rrVar;
        this.f56396o = dVar;
        this.f56397p = xb_a;
        this.f56398q = hVar;
        boolean z3 = true;
        if (!mo56372d().mo55446a() || C21898jx.m53439b(mo56365a())) {
            z = false;
        } else {
            z = true;
        }
        this.f56386c = z;
        this.f56387d = mo56372d().mo55447b();
        this.f56388f = mo56365a().mo55641d();
        C22619vg a = mo56365a().mo55638a();
        String str = null;
        if (a != null) {
            a.mo56957a();
        }
        C22619vg b = mo56365a().mo55639b();
        this.f56389h = b != null ? b.mo56957a() : str;
        this.f56390i = mo56365a().mo55643e();
        this.f56391j = mo56365a().mo55645f();
        if (mo56365a().mo55646g() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f56392k = z2;
        this.f56393l = (!mo56372d().mo55463o() || !dVar.mo60605h()) ? false : z3;
    }

    /* renamed from: a */
    public C21895jw mo56365a() {
        return this.f56394m;
    }

    /* renamed from: b */
    public boolean mo56370b() {
        return (C24362h.m61206a(this.f56398q.mo60696b().mo60678c(), mo56365a().mo55647h()) ^ true) && mo56365a().mo55649i() != null;
    }

    /* renamed from: c */
    public String mo56371c() {
        return this.f56398q.mo60696b().mo60678c();
    }

    /* renamed from: d */
    public C21789ix mo56372d() {
        return this.f56385b;
    }

    /* renamed from: e */
    public boolean mo56373e() {
        return this.f56386c;
    }

    /* renamed from: f */
    public boolean mo56374f() {
        return this.f56387d;
    }

    /* renamed from: g */
    public boolean mo56375g() {
        return false;
    }

    /* renamed from: h */
    public boolean mo56376h() {
        return this.f56395n.mo56466b();
    }

    /* renamed from: i */
    public boolean mo56377i() {
        return this.f56395n.mo56465a();
    }

    /* renamed from: j */
    public boolean mo56378j() {
        return this.f56392k;
    }

    /* renamed from: k */
    public boolean mo56379k() {
        return this.f56393l;
    }

    /* renamed from: l */
    public String mo56380l() {
        return this.f56388f;
    }

    /* renamed from: m */
    public String mo56381m() {
        return this.f56390i;
    }

    /* renamed from: n */
    public String mo56382n() {
        return this.f56391j;
    }

    /* renamed from: o */
    public boolean mo56383o() {
        return !mo56372d().mo55462n() && !C21898jx.m53439b(mo56365a());
    }

    /* renamed from: p */
    public qu$b mo56415p() {
        qu$b qu_b = this.f56384a;
        if (qu_b != null) {
            return qu_b;
        }
        C24362h.m61217l("presenter");
        throw null;
    }

    /* renamed from: q */
    public String mo56416q() {
        return this.f56389h;
    }

    /* renamed from: a */
    public void mo56368a(qu$b qu_b) {
        C24362h.m61211f(qu_b, "<set-?>");
        this.f56384a = qu_b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo56366a(ff0.C23349c<? super bf0.C21050d> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.veriff.sdk.internal.C22354qv.C22358d
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.veriff.sdk.internal.qv$d r0 = (com.veriff.sdk.internal.C22354qv.C22358d) r0
            int r1 = r0.f56412b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f56412b = r1
            goto L_0x0018
        L_0x0013:
            com.veriff.sdk.internal.qv$d r0 = new com.veriff.sdk.internal.qv$d
            r0.<init>(r7, r8)
        L_0x0018:
            r4 = r0
            java.lang.Object r8 = r4.f56411a
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.f56412b
            r2 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r2) goto L_0x002c
            java.lang.Object r0 = r4.f56414d
            com.veriff.sdk.internal.qv r0 = (com.veriff.sdk.internal.C22354qv) r0
            p584jl.C17885a.m44475z0(r8)
            goto L_0x004d
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0034:
            p584jl.C17885a.m44475z0(r8)
            com.veriff.sdk.internal.xb$a r1 = r7.f56397p
            java.lang.String r8 = r7.mo56371c()
            r3 = 0
            r5 = 2
            r6 = 0
            r4.f56414d = r7
            r4.f56412b = r2
            r2 = r8
            java.lang.Object r8 = com.veriff.sdk.internal.xb$a.C22678a.m55295a(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L_0x004c
            return r0
        L_0x004c:
            r0 = r7
        L_0x004d:
            com.veriff.sdk.internal.kn r8 = (com.veriff.sdk.internal.C21924kn) r8
            boolean r1 = r8 instanceof com.veriff.sdk.internal.C21924kn.C21927c
            if (r1 == 0) goto L_0x0079
            com.veriff.sdk.internal.kn$c r8 = (com.veriff.sdk.internal.C21924kn.C21927c) r8
            java.lang.Object r8 = r8.mo55715a()
            com.veriff.sdk.internal.uz r8 = (com.veriff.sdk.internal.C22609uz) r8
            com.veriff.sdk.internal.vc r8 = r8.mo56913i()
            if (r8 == 0) goto L_0x0066
            java.util.List r8 = r8.mo56919a()
            goto L_0x0067
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 == 0) goto L_0x0071
            com.veriff.sdk.internal.qu$b r0 = r0.mo56415p()
            r0.mo56391b(r8)
            goto L_0x008e
        L_0x0071:
            com.veriff.sdk.internal.qu$b r8 = r0.mo56415p()
            r8.mo56397h()
            goto L_0x008e
        L_0x0079:
            boolean r1 = r8 instanceof com.veriff.sdk.internal.C21924kn.C21925a
            if (r1 == 0) goto L_0x007e
            goto L_0x0087
        L_0x007e:
            boolean r1 = r8 instanceof com.veriff.sdk.internal.C21924kn.C21926b
            if (r1 == 0) goto L_0x0083
            goto L_0x0087
        L_0x0083:
            boolean r8 = r8 instanceof com.veriff.sdk.internal.C21924kn.C21928d
            if (r8 == 0) goto L_0x008e
        L_0x0087:
            com.veriff.sdk.internal.qu$b r8 = r0.mo56415p()
            r8.mo56397h()
        L_0x008e:
            bf0.d r8 = bf0.C21050d.f52856a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22354qv.mo56366a(ff0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo56367a(java.util.List<com.veriff.sdk.internal.C22614vd> r5, ff0.C23349c<? super bf0.C21050d> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.veriff.sdk.internal.C22354qv.C22357c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.veriff.sdk.internal.qv$c r0 = (com.veriff.sdk.internal.C22354qv.C22357c) r0
            int r1 = r0.f56407b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f56407b = r1
            goto L_0x0018
        L_0x0013:
            com.veriff.sdk.internal.qv$c r0 = new com.veriff.sdk.internal.qv$c
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f56406a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f56407b
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.f56410e
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r0 = r0.f56409d
            com.veriff.sdk.internal.qv r0 = (com.veriff.sdk.internal.C22354qv) r0
            p584jl.C17885a.m44475z0(r6)
            goto L_0x004e
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            p584jl.C17885a.m44475z0(r6)
            com.veriff.sdk.internal.xb$a r6 = r4.f56397p
            java.lang.String r2 = r4.mo56371c()
            r0.f56409d = r4
            r0.f56410e = r5
            r0.f56407b = r3
            java.lang.Object r6 = r6.mo57059a((java.lang.String) r2, (ff0.C23349c<? super com.veriff.sdk.internal.C21924kn<com.veriff.sdk.internal.C22553tk>>) r0)
            if (r6 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r0 = r4
        L_0x004e:
            com.veriff.sdk.internal.kn r6 = (com.veriff.sdk.internal.C21924kn) r6
            boolean r1 = r6 instanceof com.veriff.sdk.internal.C21924kn.C21927c
            if (r1 == 0) goto L_0x0072
            com.veriff.sdk.internal.qu$b r0 = r0.mo56415p()
            com.veriff.sdk.internal.kn$c r6 = (com.veriff.sdk.internal.C21924kn.C21927c) r6
            java.lang.Object r1 = r6.mo55715a()
            com.veriff.sdk.internal.tk r1 = (com.veriff.sdk.internal.C22553tk) r1
            java.lang.String r1 = r1.mo56721c()
            java.lang.Object r6 = r6.mo55715a()
            com.veriff.sdk.internal.tk r6 = (com.veriff.sdk.internal.C22553tk) r6
            java.lang.String r6 = r6.mo56722d()
            r0.mo56385a(r1, r6, r5)
            goto L_0x0088
        L_0x0072:
            boolean r1 = r6 instanceof com.veriff.sdk.internal.C21924kn.C21925a
            if (r1 == 0) goto L_0x0077
            goto L_0x0080
        L_0x0077:
            boolean r1 = r6 instanceof com.veriff.sdk.internal.C21924kn.C21926b
            if (r1 == 0) goto L_0x007c
            goto L_0x0080
        L_0x007c:
            boolean r6 = r6 instanceof com.veriff.sdk.internal.C21924kn.C21928d
            if (r6 == 0) goto L_0x0088
        L_0x0080:
            com.veriff.sdk.internal.qu$b r6 = r0.mo56415p()
            r0 = 0
            r6.mo56385a(r0, r0, r5)
        L_0x0088:
            bf0.d r5 = bf0.C21050d.f52856a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22354qv.mo56367a(java.util.List, ff0.c):java.lang.Object");
    }

    /* renamed from: a */
    public void mo56369a(List<? extends C21791iy> list) {
        C24362h.m61211f(list, "flowSteps");
        if (!C21898jx.m53438a(mo56365a())) {
            this.f56397p.mo57063b(this.f56396o.mo60598c(), C22545td.f56892a.mo56702b()).mo54003a(new C22356b(list, mo56415p()));
        } else if (mo56416q() != null) {
            this.f56397p.mo57053a(mo56416q(), C22545td.f56892a.mo56702b()).mo54003a(new C22355a(list, mo56415p(), mo56365a(), this.f56397p, this.f56396o.mo60598c()));
        } else {
            throw new C22527sn("poaSessionUuid cannot be null at changeStatusToStarted when isPOAEnabledFlow");
        }
    }
}
