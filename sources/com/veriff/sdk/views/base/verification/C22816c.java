package com.veriff.sdk.views.base.verification;

import android.content.Intent;
import com.veriff.sdk.internal.C21791iy;
import com.veriff.sdk.internal.C21895jw;
import com.veriff.sdk.internal.C22233ot;
import com.veriff.sdk.internal.C22240oy;
import com.veriff.sdk.internal.C22247pc;
import com.veriff.sdk.internal.C22250pd;
import com.veriff.sdk.internal.C22607uy;
import com.veriff.sdk.internal.C22661wm;
import com.veriff.sdk.views.camera.FlowActivity;
import com.veriff.sdk.views.error.ErrorActivity;
import com.veriff.sdk.views.finished.FinishedActivity;
import com.veriff.sdk.views.language.LanguageActivity;
import com.veriff.sdk.views.resubmission.ResubmissionActivity;
import com.veriff.sdk.views.upload.UploadActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import mf0.C24362h;
import mobi.lab.veriff.data.C24424c;
import mobi.lab.veriff.data.C24426d;
import mobi.lab.veriff.util.C24457h;
import p583jk.C17875h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0007\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b*\u0010+J\b\u0010\u0004\u001a\u00020\u0003H\u0017J$\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\f\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007J&\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u000e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015J\u0016\u0010\u0018\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\b\u0010\u001f\u001a\u00020\u0003H\u0016R\u0014\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010)¨\u0006,"}, mo59060d2 = {"Lcom/veriff/sdk/views/base/verification/LegacyVerificationNavigator;", "Lcom/veriff/sdk/views/base/LegacyNavigator;", "Lcom/veriff/sdk/views/base/verification/Navigator;", "Lbf0/d;", "openCountrySelect", "", "type", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "session", "Landroid/content/Intent;", "returnIntent", "openError", "openFinishedScreen", "", "documentType", "Lmobi/lab/veriff/data/Country;", "selectedCountry", "", "Lcom/veriff/sdk/internal/data/FlowStep;", "steps", "openFlow", "Lcom/veriff/sdk/internal/data/StartSessionData;", "startSessionData", "openIntro", "openNonDocumentFlow", "Lmobi/lab/veriff/data/api/request/response/ResubmittedSession;", "resubmittedSession", "", "isFromDecision", "openResubmissionFeedback", "openUploadView", "showLanguagePicker", "Lcom/veriff/sdk/views/base/BaseActivity;", "activity", "Lcom/veriff/sdk/views/base/BaseActivity;", "Lmobi/lab/veriff/util/LanguageUtil;", "languageUtil", "Lmobi/lab/veriff/util/LanguageUtil;", "Lmobi/lab/veriff/data/SessionArguments;", "sessionArguments", "Lmobi/lab/veriff/data/SessionArguments;", "Lcom/veriff/sdk/internal/data/StartSessionData;", "<init>", "(Lcom/veriff/sdk/views/base/BaseActivity;Lmobi/lab/veriff/data/SessionArguments;Lcom/veriff/sdk/internal/data/StartSessionData;Lmobi/lab/veriff/util/LanguageUtil;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.base.verification.c */
public final class C22816c extends C22240oy implements C22818e {

    /* renamed from: a */
    private final C22233ot f57894a;

    /* renamed from: b */
    private final C24426d f57895b;

    /* renamed from: c */
    private final C21895jw f57896c;

    /* renamed from: d */
    private final C24457h f57897d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22816c(C22233ot otVar, C24426d dVar, C21895jw jwVar, C24457h hVar) {
        super(otVar);
        C24362h.m61211f(otVar, "activity");
        C24362h.m61211f(dVar, "sessionArguments");
        C24362h.m61211f(jwVar, "startSessionData");
        C24362h.m61211f(hVar, "languageUtil");
        this.f57894a = otVar;
        this.f57895b = dVar;
        this.f57896c = jwVar;
        this.f57897d = hVar;
    }

    /* renamed from: a */
    public final void mo57579a(C21895jw jwVar) {
        C24362h.m61211f(jwVar, "startSessionData");
        mo56170a(VeriffActivity.f57881p.mo57573a(this.f57894a, this.f57895b, jwVar, new C22247pc(C17875h.m44281E(C22250pd.Intro, C22250pd.CountrySelect, C22250pd.DocumentSelect), 0, this.f57897d.mo60696b())));
        mo56169a();
    }

    /* renamed from: b */
    public void mo57585b() {
        mo56170a(VeriffActivity.f57881p.mo57573a(this.f57894a, this.f57895b, this.f57896c, new C22247pc(C17875h.m44281E(C22250pd.CountrySelect, C22250pd.DocumentSelect), 0, this.f57897d.mo60696b())));
        mo56169a();
    }

    /* renamed from: c */
    public void mo57586c() {
        mo56171a(LanguageActivity.f58252l.mo57856a(this.f57894a, this.f57895b, this.f57896c), 8);
    }

    /* renamed from: a */
    public void mo57583a(String str, C24424c cVar, List<? extends C21791iy> list) {
        C24362h.m61211f(str, "documentType");
        C24362h.m61211f(cVar, "selectedCountry");
        C24362h.m61211f(list, "steps");
        Intent a = FlowActivity.m56115a(this.f57894a, this.f57895b, this.f57896c, str, cVar, list, EmptyList.f60173b);
        C24362h.m61210e(a, "intent");
        mo56170a(a);
        mo56169a();
    }

    /* renamed from: a */
    public void mo57584a(List<? extends C21791iy> list) {
        C24362h.m61211f(list, "steps");
        Intent a = FlowActivity.m56115a(this.f57894a, this.f57895b, this.f57896c, (String) null, (C24424c) null, list, EmptyList.f60173b);
        C24362h.m61210e(a, "intent");
        mo56170a(a);
        mo56169a();
    }

    /* renamed from: a */
    public void mo57580a(C22607uy uyVar, boolean z) {
        C24362h.m61211f(uyVar, "resubmittedSession");
        mo56170a(ResubmissionActivity.f58261l.mo57864a(this.f57894a, this.f57895b, this.f57896c, uyVar, z));
        mo56169a();
    }

    /* renamed from: a */
    public void mo57578a(int i, C22661wm wmVar, Intent intent) {
        Intent a = ErrorActivity.m56614a(this.f57894a, i, this.f57895b, this.f57896c, wmVar, intent);
        C24362h.m61210e(a, "intent");
        mo56170a(a);
        mo56169a();
    }

    /* renamed from: a */
    public final void mo57582a(C22661wm wmVar, String str) {
        C24362h.m61211f(wmVar, "session");
        mo56170a(UploadActivity.f58388l.mo57968a(this.f57894a, this.f57895b, this.f57896c, wmVar, str));
        mo56169a();
    }

    /* renamed from: a */
    public final void mo57581a(C22661wm wmVar) {
        mo56170a(FinishedActivity.f58242l.mo57851a(this.f57894a, this.f57895b, this.f57896c, wmVar));
        mo56169a();
    }
}
