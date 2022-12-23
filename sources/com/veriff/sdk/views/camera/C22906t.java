package com.veriff.sdk.views.camera;

import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C21789ix;
import com.veriff.sdk.internal.C22046na;
import com.veriff.sdk.internal.C22064nk;
import com.veriff.sdk.internal.C22466rz;
import com.veriff.sdk.internal.C22661wm;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\rR\"\u0010\u001c\u001a\u00020\u001b8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/FlowModel;", "Lcom/veriff/sdk/views/camera/FlowMVP$Model;", "", "context", "Lbf0/d;", "clearNonInflowMediaForContext", "Lcom/veriff/sdk/internal/upload/Media;", "media", "queueMedia", "uploadInflowMedia", "documentType", "Ljava/lang/String;", "getDocumentType", "()Ljava/lang/String;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "getIdvVerificationId", "idvVerificationId", "", "isMergedUiEnabled", "Z", "()Z", "isShowPortraitDocumentOnVideoFailure", "isVideoRequired", "language", "getLanguage", "Lcom/veriff/sdk/views/nfc/PendingMrzInfo;", "pendingMrzInfo", "Lcom/veriff/sdk/views/nfc/PendingMrzInfo;", "getPendingMrzInfo", "()Lcom/veriff/sdk/views/nfc/PendingMrzInfo;", "setPendingMrzInfo", "(Lcom/veriff/sdk/views/nfc/PendingMrzInfo;)V", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "session", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "getSession", "()Lmobi/lab/veriff/model/AuthenticationFlowSession;", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "uploadManager", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "<init>", "(Lcom/veriff/sdk/internal/data/FeatureFlags;Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;Lmobi/lab/veriff/model/AuthenticationFlowSession;Lcom/veriff/sdk/views/nfc/PendingMrzInfo;Ljava/lang/String;Ljava/lang/String;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.t */
public final class C22906t implements s$a {

    /* renamed from: a */
    private final boolean f58164a;

    /* renamed from: b */
    private final boolean f58165b;

    /* renamed from: c */
    private final boolean f58166c;

    /* renamed from: e */
    private final C22064nk f58167e;

    /* renamed from: f */
    private final C22661wm f58168f;

    /* renamed from: g */
    private C22466rz f58169g;

    /* renamed from: h */
    private final String f58170h;

    /* renamed from: i */
    private final String f58171i;

    public C22906t(C21789ix ixVar, C22064nk nkVar, C22661wm wmVar, C22466rz rzVar, String str, String str2) {
        C24362h.m61211f(ixVar, "featureFlags");
        C24362h.m61211f(nkVar, "uploadManager");
        C24362h.m61211f(wmVar, "session");
        C24362h.m61211f(rzVar, "pendingMrzInfo");
        C24362h.m61211f(str2, "language");
        this.f58167e = nkVar;
        this.f58168f = wmVar;
        this.f58169g = rzVar;
        this.f58170h = str;
        this.f58171i = str2;
        this.f58164a = ixVar.mo55447b();
        this.f58165b = ixVar.mo55449d();
        this.f58166c = ixVar.mo55466r();
    }

    /* renamed from: a */
    public C22661wm mo57765a() {
        return this.f58168f;
    }

    /* renamed from: b */
    public C22466rz mo57769b() {
        return this.f58169g;
    }

    /* renamed from: c */
    public String mo57770c() {
        return this.f58170h;
    }

    /* renamed from: d */
    public String mo57771d() {
        return this.f58171i;
    }

    /* renamed from: e */
    public String mo57772e() {
        String a = mo57765a().mo57012a();
        C24362h.m61210e(a, "session.idvVerificationId");
        return a;
    }

    /* renamed from: f */
    public boolean mo57773f() {
        return this.f58164a;
    }

    /* renamed from: g */
    public boolean mo57774g() {
        return this.f58165b;
    }

    /* renamed from: h */
    public boolean mo57775h() {
        return this.f58166c;
    }

    /* renamed from: i */
    public void mo57776i() {
        this.f58167e.mo55955c();
    }

    /* renamed from: a */
    public void mo57767a(C22466rz rzVar) {
        C24362h.m61211f(rzVar, "<set-?>");
        this.f58169g = rzVar;
    }

    /* renamed from: a */
    public void mo57766a(C22046na naVar) {
        C24362h.m61211f(naVar, "media");
        this.f58167e.mo55948a(naVar);
    }

    /* renamed from: a */
    public void mo57768a(String str) {
        C24362h.m61211f(str, AppActionRequest.KEY_CONTEXT);
        this.f58167e.mo55954b(str);
    }
}
