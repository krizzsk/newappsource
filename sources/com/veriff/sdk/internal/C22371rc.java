package com.veriff.sdk.internal;

import android.content.Context;
import android.content.Intent;
import android.widget.FrameLayout;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.permission.C22254c;
import com.veriff.sdk.internal.permission.C22257e;
import com.veriff.sdk.views.C22808a;
import com.veriff.sdk.views.C22822c;
import com.veriff.sdk.views.base.verification.C22818e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import mobi.lab.veriff.util.C24457h;
import ye0.C25292a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BI\b\u0007\u0012\b\b\u0001\u00106\u001a\u000205\u0012\u0006\u0010\b\u001a\u00020L\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010B\u001a\u00020A\u0012\f\u0010T\u001a\b\u0012\u0004\u0012\u00020;0S\u0012\u0006\u00109\u001a\u000208¢\u0006\u0004\bV\u0010WJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016JF\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u001e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0006H\u0016J\u001c\u0010\u001f\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0018H\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0016J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0018H\u0002J\b\u0010,\u001a\u00020\u0004H\u0016J\b\u0010-\u001a\u00020\u0004H\u0016J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\rH\u0016J\b\u00100\u001a\u00020\u0004H\u0016J\b\u00101\u001a\u00020\u0004H\u0016J\u0016\u00104\u001a\u00020\u00042\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0006H\u0016R\u0014\u00106\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010H\u001a\u00020G8\u0016X\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010\b\u001a\u00020L8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010MR\u001a\u0010O\u001a\u00020N8\u0016X\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020;0S8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006X"}, mo59060d2 = {"Lcom/veriff/sdk/views/intro/IntroScreen;", "Lcom/veriff/sdk/views/LifecycleScreen;", "Lcom/veriff/sdk/views/intro/IntroMVP$View;", "Lcom/veriff/sdk/internal/permission/Permissions$Listener;", "Lbf0/d;", "create", "", "Lcom/veriff/sdk/internal/permission/Permission;", "permissions", "askForPermissions", "closeWebView", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "", "vendorName", "Lmobi/lab/veriff/data/api/request/response/TranslatedString;", "intros", "geoIPCountry", "geoIPState", "privacyPolicyUrl", "createNewView", "hideProgress", "", "onBackButtonPressed", "", "requestCode", "Lcom/veriff/sdk/internal/permission/PermissionResult;", "results", "onPermissionResults", "preselectedCountry", "preselectedDocument", "openCountrySelect", "type", "openError", "openLanguageView", "Lmobi/lab/veriff/data/api/request/response/ResubmittedSession;", "resubmittedSession", "openResubmissionFeedback", "showAudioRecordingPermissionsDeniedError", "Lcom/veriff/sdk/internal/analytics/EventSource;", "source", "showConfirmExitDialog", "errorCode", "showError", "showMissingNfcCapabilityError", "showNfcPermissionDeniedError", "url", "showPrivacyPolicy", "showProgress", "showVideoRecordingPermissionsDeniedError", "Lcom/veriff/sdk/internal/data/FlowStep;", "steps", "startAuthenticationFlow", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/veriff/sdk/views/intro/IntroMVP$Presenter;", "introPresenter", "Lcom/veriff/sdk/views/intro/IntroMVP$Presenter;", "Lcom/veriff/sdk/views/intro/ui/IntroView;", "introView", "Lcom/veriff/sdk/views/intro/ui/IntroView;", "Lmobi/lab/veriff/util/LanguageUtil;", "languageUtil", "Lmobi/lab/veriff/util/LanguageUtil;", "Lcom/veriff/sdk/views/base/navigation/NavigationManager;", "navigationManager", "Lcom/veriff/sdk/views/base/navigation/NavigationManager;", "Lcom/veriff/sdk/views/base/verification/Navigator;", "navigator", "Lcom/veriff/sdk/views/base/verification/Navigator;", "Lcom/veriff/sdk/internal/analytics/Page;", "page", "Lcom/veriff/sdk/internal/analytics/Page;", "getPage", "()Lcom/veriff/sdk/internal/analytics/Page;", "Lcom/veriff/sdk/internal/permission/Permissions;", "Lcom/veriff/sdk/internal/permission/Permissions;", "Landroid/widget/FrameLayout;", "view", "Landroid/widget/FrameLayout;", "getView", "()Landroid/widget/FrameLayout;", "Lye0/a;", "viewProvider", "Lye0/a;", "<init>", "(Landroid/content/Context;Lcom/veriff/sdk/internal/permission/Permissions;Lmobi/lab/veriff/util/LanguageUtil;Lcom/veriff/sdk/views/base/verification/Navigator;Lcom/veriff/sdk/views/base/navigation/NavigationManager;Lye0/a;Lcom/veriff/sdk/views/intro/IntroMVP$Presenter;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.rc */
public final class C22371rc extends C22822c implements C22257e.C22258a, qu$c {

    /* renamed from: a */
    private final C21783is f56458a = C21783is.intro;

    /* renamed from: b */
    private final FrameLayout f56459b;

    /* renamed from: c */
    private C22377ri f56460c;

    /* renamed from: e */
    private final C22257e f56461e;

    /* renamed from: f */
    private final C24457h f56462f;

    /* renamed from: g */
    private final C22818e f56463g;

    /* renamed from: h */
    private final C22243pa f56464h;

    /* renamed from: i */
    private final C25292a<C22377ri> f56465i;

    /* renamed from: j */
    private final qu$b f56466j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22371rc(Context context, C22257e eVar, C24457h hVar, C22818e eVar2, C22243pa paVar, C25292a<C22377ri> aVar, qu$b qu_b) {
        super((C22808a) null, 1, (DefaultConstructorMarker) null);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(eVar, "permissions");
        C24362h.m61211f(hVar, "languageUtil");
        C24362h.m61211f(eVar2, "navigator");
        C24362h.m61211f(paVar, "navigationManager");
        C24362h.m61211f(aVar, "viewProvider");
        C24362h.m61211f(qu_b, "introPresenter");
        this.f56461e = eVar;
        this.f56462f = hVar;
        this.f56463g = eVar2;
        this.f56464h = paVar;
        this.f56465i = aVar;
        this.f56466j = qu_b;
        this.f56459b = new FrameLayout(context);
    }

    /* renamed from: a */
    public void mo56403a(C21789ix ixVar, String str, List<C22614vd> list, String str2, String str3, String str4) {
        C24362h.m61211f(ixVar, "featureFlags");
        C24362h.m61211f(str4, "privacyPolicyUrl");
        C22377ri riVar = this.f56465i.get();
        C24362h.m61210e(riVar, "viewProvider.get()");
        C22377ri riVar2 = riVar;
        this.f56460c = riVar2;
        riVar2.mo56442a(ixVar, str, list, str2, str3, str4);
        C22377ri riVar3 = this.f56460c;
        if (riVar3 != null) {
            riVar3.setLayoutDirection(this.f56462f.mo60698d());
            getView().removeAllViews();
            FrameLayout i = getView();
            C22377ri riVar4 = this.f56460c;
            if (riVar4 != null) {
                i.addView(riVar4);
                this.f56466j.mo56398i();
                return;
            }
            C24362h.m61217l("introView");
            throw null;
        }
        C24362h.m61217l("introView");
        throw null;
    }

    /* renamed from: b */
    public void mo56409b(List<? extends C21791iy> list) {
        C24362h.m61211f(list, "steps");
        this.f56463g.mo57584a(list);
    }

    public void create() {
        super.create();
        this.f56461e.mo56204a(mo57590c(), (C22257e.C22258a) this);
        this.f56466j.mo56384a();
    }

    /* renamed from: e */
    public void mo56410e() {
        m54562b(30);
    }

    /* renamed from: f */
    public boolean mo56147f() {
        this.f56466j.mo56392c();
        return true;
    }

    /* renamed from: g */
    public void mo56411g() {
        C22377ri riVar = this.f56460c;
        if (riVar != null) {
            riVar.mo56446d();
        } else {
            C24362h.m61217l("introView");
            throw null;
        }
    }

    public C21783is getPage() {
        return this.f56458a;
    }

    /* renamed from: h */
    public void mo56412h() {
        C22377ri riVar = this.f56460c;
        if (riVar != null) {
            riVar.mo56447e();
        } else {
            C24362h.m61217l("introView");
            throw null;
        }
    }

    /* renamed from: i */
    public FrameLayout getView() {
        return this.f56459b;
    }

    /* renamed from: l_ */
    public void mo56413l_() {
        m54562b(27);
    }

    /* renamed from: m_ */
    public void mo56414m_() {
        m54562b(22);
    }

    /* renamed from: b */
    public void mo56408b() {
        m54562b(26);
    }

    /* renamed from: b */
    private final void m54562b(int i) {
        C22818e.C22819a.m56103a(this.f56463g, i, (C22661wm) null, (Intent) null, 6, (Object) null);
    }

    /* renamed from: a */
    public void mo56402a(C21789ix ixVar) {
        C24362h.m61211f(ixVar, "featureFlags");
        this.f56463g.mo57586c();
    }

    /* renamed from: a */
    public void mo56401a(C21719gi giVar) {
        C24362h.m61211f(giVar, "source");
        this.f56463g.mo57588a(getPage(), giVar, (C22661wm) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo56214a(int r6, java.util.List<com.veriff.sdk.internal.permission.C22256d> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "results"
            mf0.C24362h.m61211f(r7, r0)
            mobi.lab.veriff.util.j r0 = com.veriff.sdk.internal.C22372rd.f56467a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onRequestPermissionsResult("
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = ", "
            r1.append(r2)
            r1.append(r7)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.mo60705d(r1)
            r0 = 243(0xf3, float:3.4E-43)
            if (r6 != r0) goto L_0x008c
            boolean r6 = r7.isEmpty()
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x0038
        L_0x0036:
            r6 = 0
            goto L_0x005c
        L_0x0038:
            java.util.Iterator r6 = r7.iterator()
        L_0x003c:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0036
            java.lang.Object r2 = r6.next()
            com.veriff.sdk.internal.permission.d r2 = (com.veriff.sdk.internal.permission.C22256d) r2
            com.veriff.sdk.internal.permission.c r3 = r2.mo56209a()
            com.veriff.sdk.internal.permission.c r4 = com.veriff.sdk.internal.permission.C22254c.Camera
            if (r3 != r4) goto L_0x0058
            boolean r2 = r2.mo56210b()
            if (r2 == 0) goto L_0x0058
            r2 = 1
            goto L_0x0059
        L_0x0058:
            r2 = 0
        L_0x0059:
            if (r2 == 0) goto L_0x003c
            r6 = 1
        L_0x005c:
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L_0x0064
        L_0x0062:
            r0 = 0
            goto L_0x0087
        L_0x0064:
            java.util.Iterator r7 = r7.iterator()
        L_0x0068:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0062
            java.lang.Object r2 = r7.next()
            com.veriff.sdk.internal.permission.d r2 = (com.veriff.sdk.internal.permission.C22256d) r2
            com.veriff.sdk.internal.permission.c r3 = r2.mo56209a()
            com.veriff.sdk.internal.permission.c r4 = com.veriff.sdk.internal.permission.C22254c.Microphone
            if (r3 != r4) goto L_0x0084
            boolean r2 = r2.mo56210b()
            if (r2 == 0) goto L_0x0084
            r2 = 1
            goto L_0x0085
        L_0x0084:
            r2 = 0
        L_0x0085:
            if (r2 == 0) goto L_0x0068
        L_0x0087:
            com.veriff.sdk.internal.qu$b r7 = r5.f56466j
            r7.mo56389a((boolean) r6, (boolean) r0)
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22371rc.mo56214a(int, java.util.List):void");
    }

    /* renamed from: a */
    public void mo56407a(List<? extends C22254c> list) {
        C24362h.m61211f(list, "permissions");
        this.f56461e.mo56202a(243, list);
    }

    /* renamed from: a */
    public void mo56406a(String str, String str2) {
        this.f56464h.mo56179b();
    }

    /* renamed from: a */
    public void mo56404a(C22607uy uyVar) {
        C24362h.m61211f(uyVar, "resubmittedSession");
        this.f56463g.mo57580a(uyVar, false);
    }

    /* renamed from: a */
    public void mo56399a() {
        C22377ri riVar = this.f56460c;
        if (riVar != null) {
            riVar.mo56445c();
        } else {
            C24362h.m61217l("introView");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo56405a(String str) {
        C24362h.m61211f(str, "url");
        C22377ri riVar = this.f56460c;
        if (riVar != null) {
            riVar.mo56443a(str);
        } else {
            C24362h.m61217l("introView");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo56400a(int i) {
        C22818e.C22819a.m56103a(this.f56463g, i, (C22661wm) null, (Intent) null, 6, (Object) null);
    }
}
