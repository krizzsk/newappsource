package com.veriff.sdk.internal;

import bf0.C21050d;
import ff0.C23349c;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J#\u0010\t\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000fR\u0016\u0010!\u001a\u0004\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u000fR\u0016\u0010#\u001a\u0004\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u000fR\u001c\u0010)\u001a\u00020$8&@&X¦\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0019R\u0014\u0010/\u001a\u00020,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0019R\u0014\u00103\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0019R\u0014\u00105\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0019R\u0016\u00107\u001a\u0004\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u00068"}, mo59060d2 = {"Lcom/veriff/sdk/views/intro/IntroMVP$Model;", "", "", "Lcom/veriff/sdk/internal/data/FlowStep;", "flowSteps", "Lbf0/d;", "changeStatusToStarted", "Lmobi/lab/veriff/data/api/request/response/TranslatedString;", "intros", "getConfiguration", "(Ljava/util/List;Lff0/c;)Ljava/lang/Object;", "getIntroStrings", "(Lff0/c;)Ljava/lang/Object;", "", "getCurrentlanguageCode", "()Ljava/lang/String;", "currentlanguageCode", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "getFeatureFlags", "()Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "getIdvSessionUuid", "idvSessionUuid", "", "isNfcPermitted", "()Z", "isNfcRequired", "isNfcSupportedDevice", "isVideoEnabled", "isVideoRequired", "getPoaSessionUuid", "poaSessionUuid", "getPreselectedCountry", "preselectedCountry", "getPreselectedDocument", "preselectedDocument", "Lcom/veriff/sdk/views/intro/IntroMVP$Presenter;", "getPresenter", "()Lcom/veriff/sdk/views/intro/IntroMVP$Presenter;", "setPresenter", "(Lcom/veriff/sdk/views/intro/IntroMVP$Presenter;)V", "presenter", "getRequiresStringsRefetch", "requiresStringsRefetch", "Lcom/veriff/sdk/internal/data/StartSessionData;", "getSessionData", "()Lcom/veriff/sdk/internal/data/StartSessionData;", "sessionData", "getShouldShowCountrySelection", "shouldShowCountrySelection", "getShouldShowResubmissionFeedback", "shouldShowResubmissionFeedback", "getShouldSkipIntro", "shouldSkipIntro", "getVendorName", "vendorName", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public interface qu$a {
    /* renamed from: a */
    C21895jw mo56365a();

    /* renamed from: a */
    Object mo56366a(C23349c<? super C21050d> cVar);

    /* renamed from: a */
    Object mo56367a(List<C22614vd> list, C23349c<? super C21050d> cVar);

    /* renamed from: a */
    void mo56368a(qu$b qu_b);

    /* renamed from: a */
    void mo56369a(List<C21791iy> list);

    /* renamed from: b */
    boolean mo56370b();

    /* renamed from: c */
    String mo56371c();

    /* renamed from: d */
    C21789ix mo56372d();

    /* renamed from: e */
    boolean mo56373e();

    /* renamed from: f */
    boolean mo56374f();

    /* renamed from: g */
    boolean mo56375g();

    /* renamed from: h */
    boolean mo56376h();

    /* renamed from: i */
    boolean mo56377i();

    /* renamed from: j */
    boolean mo56378j();

    /* renamed from: k */
    boolean mo56379k();

    /* renamed from: l */
    String mo56380l();

    /* renamed from: m */
    String mo56381m();

    /* renamed from: n */
    String mo56382n();

    /* renamed from: o */
    boolean mo56383o();
}
