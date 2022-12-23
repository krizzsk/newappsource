package com.veriff.sdk.views.base.verification;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.support.AppboyImageUtils;
import com.veriff.sdk.internal.C21895jw;
import com.veriff.sdk.internal.C21910kf;
import com.veriff.sdk.internal.C22243pa;
import com.veriff.sdk.internal.C22247pc;
import com.veriff.sdk.internal.C22259pf;
import com.veriff.sdk.internal.permission.C22252a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import mobi.lab.veriff.data.C24426d;
import mobi.lab.veriff.util.C24457h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b8\u00109J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\f\u001a\u00020\u0004H\u0016J-\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u001a\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\u001e\u001a\u00020\u001d8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010%\u001a\u00020$8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u000f\u001a\u00020+8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0000@\u0000X.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006;"}, mo59060d2 = {"Lcom/veriff/sdk/views/base/verification/VeriffActivity;", "Lcom/veriff/sdk/views/base/verification/BaseVerificationActivity;", "Landroid/os/Bundle;", "outState", "Lbf0/d;", "onSaveInstanceState", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "onBackPressed", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lcom/veriff/sdk/views/base/navigation/NavigationState;", "navigationState", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "", "ensureNavigationState", "isRecreate", "state", "onCreateLibraryActivity", "Lmobi/lab/veriff/util/LanguageUtil;", "languageUtil", "Lmobi/lab/veriff/util/LanguageUtil;", "getLanguageUtil$veriff_library_dist", "()Lmobi/lab/veriff/util/LanguageUtil;", "setLanguageUtil$veriff_library_dist", "(Lmobi/lab/veriff/util/LanguageUtil;)V", "Lcom/veriff/sdk/views/base/navigation/NavigationManager;", "navigationManager", "Lcom/veriff/sdk/views/base/navigation/NavigationManager;", "getNavigationManager$veriff_library_dist", "()Lcom/veriff/sdk/views/base/navigation/NavigationManager;", "setNavigationManager$veriff_library_dist", "(Lcom/veriff/sdk/views/base/navigation/NavigationManager;)V", "Lcom/veriff/sdk/internal/permission/AndroidPermissions;", "Lcom/veriff/sdk/internal/permission/AndroidPermissions;", "getPermissions$veriff_library_dist", "()Lcom/veriff/sdk/internal/permission/AndroidPermissions;", "setPermissions$veriff_library_dist", "(Lcom/veriff/sdk/internal/permission/AndroidPermissions;)V", "Lcom/veriff/sdk/views/base/navigation/ScreenRenderer;", "renderer", "Lcom/veriff/sdk/views/base/navigation/ScreenRenderer;", "getRenderer$veriff_library_dist", "()Lcom/veriff/sdk/views/base/navigation/ScreenRenderer;", "setRenderer$veriff_library_dist", "(Lcom/veriff/sdk/views/base/navigation/ScreenRenderer;)V", "<init>", "()V", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public final class VeriffActivity extends C22814a {

    /* renamed from: p */
    public static final C22811a f57881p = new C22811a((DefaultConstructorMarker) null);

    /* renamed from: l */
    public C22243pa f57882l;

    /* renamed from: m */
    public C24457h f57883m;

    /* renamed from: n */
    public C22252a f57884n;

    /* renamed from: o */
    public C22259pf f57885o;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, mo59060d2 = {"Lcom/veriff/sdk/views/base/verification/VeriffActivity$Companion;", "", "()V", "getIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "sessionArguments", "Lmobi/lab/veriff/data/SessionArguments;", "startSessionData", "Lcom/veriff/sdk/internal/data/StartSessionData;", "navigationState", "Lcom/veriff/sdk/views/base/navigation/NavigationState;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.base.verification.VeriffActivity$a */
    public static final class C22811a {
        private C22811a() {
        }

        public /* synthetic */ C22811a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo57573a(Activity activity, C24426d dVar, C21895jw jwVar, C22247pc pcVar) {
            C24362h.m61211f(activity, "activity");
            C24362h.m61211f(dVar, "sessionArguments");
            C24362h.m61211f(jwVar, "startSessionData");
            C24362h.m61211f(pcVar, "navigationState");
            Intent intent = new Intent(activity, VeriffActivity.class);
            C22814a.m56078a(intent, dVar, jwVar);
            intent.putExtra("com.veriff.EXTRA_NAVIGATE", pcVar);
            intent.addFlags(AppboyImageUtils.MAX_IMAGE_CACHE_SIZE_BYTES);
            return intent;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/base/navigation/NavigationState;", "it", "invoke", "(Lcom/veriff/sdk/views/base/navigation/NavigationState;)Lcom/veriff/sdk/views/base/navigation/NavigationState;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.base.verification.VeriffActivity$b */
    public static final class C22812b extends Lambda implements C24236l<C22247pc, C22247pc> {

        /* renamed from: a */
        public final /* synthetic */ VeriffActivity f57886a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22812b(VeriffActivity veriffActivity) {
            super(1);
            this.f57886a = veriffActivity;
        }

        /* renamed from: a */
        public final C22247pc invoke(C22247pc pcVar) {
            C24362h.m61211f(pcVar, "it");
            return C22247pc.m54156a(pcVar, (List) null, 0, this.f57886a.mo57571a().mo60696b(), 3, (Object) null);
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/base/navigation/NavigationState;", "it", "invoke", "(Lcom/veriff/sdk/views/base/navigation/NavigationState;)Lcom/veriff/sdk/views/base/navigation/NavigationState;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.base.verification.VeriffActivity$c */
    public static final class C22813c extends Lambda implements C24236l<C22247pc, C22247pc> {

        /* renamed from: a */
        public final /* synthetic */ C22247pc f57887a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22813c(C22247pc pcVar) {
            super(1);
            this.f57887a = pcVar;
        }

        /* renamed from: a */
        public final C22247pc invoke(C22247pc pcVar) {
            C24362h.m61211f(pcVar, "it");
            return this.f57887a;
        }
    }

    /* renamed from: a */
    public final C24457h mo57571a() {
        C24457h hVar = this.f57883m;
        if (hVar != null) {
            return hVar;
        }
        C24362h.m61217l("languageUtil");
        throw null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 8 && i2 == -1) {
            C22243pa paVar = this.f57882l;
            if (paVar != null) {
                paVar.mo56178a(new C22812b(this));
            } else {
                C24362h.m61217l("navigationManager");
                throw null;
            }
        }
    }

    public void onBackPressed() {
        C22243pa paVar = this.f57882l;
        if (paVar == null) {
            C24362h.m61217l("navigationManager");
            throw null;
        } else if (!paVar.mo56181d()) {
            super.onBackPressed();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C24362h.m61211f(strArr, "permissions");
        C24362h.m61211f(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f57884n.mo56203a(i, strArr, iArr);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C24362h.m61211f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        C22243pa paVar = this.f57882l;
        if (paVar != null) {
            bundle.putParcelable("com.veriff.EXTRA_NAVIGATE", paVar.mo56177a());
        } else {
            C24362h.m61217l("navigationManager");
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r2v12, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo57572a(boolean r2, android.os.Bundle r3) {
        /*
            r1 = this;
            com.veriff.sdk.internal.cu$a r2 = r1.f57892j
            com.veriff.sdk.internal.cu r2 = r2.mo54555a(r1)
            r2.mo54554a(r1)
            com.veriff.sdk.internal.pf r2 = r1.f57885o
            r0 = 0
            if (r2 == 0) goto L_0x0057
            r2.mo56215b()
            java.lang.String r2 = "com.veriff.EXTRA_NAVIGATE"
            if (r3 == 0) goto L_0x001c
            android.os.Parcelable r3 = r3.getParcelable(r2)
            com.veriff.sdk.internal.pc r3 = (com.veriff.sdk.internal.C22247pc) r3
            goto L_0x001d
        L_0x001c:
            r3 = r0
        L_0x001d:
            if (r3 == 0) goto L_0x0020
            goto L_0x002b
        L_0x0020:
            android.content.Intent r3 = r1.getIntent()
            android.os.Parcelable r2 = r3.getParcelableExtra(r2)
            r3 = r2
            com.veriff.sdk.internal.pc r3 = (com.veriff.sdk.internal.C22247pc) r3
        L_0x002b:
            if (r3 == 0) goto L_0x004f
            com.veriff.sdk.internal.fp r2 = r1.mo56159j()
            com.veriff.sdk.internal.kf r2 = r2.mo54910d()
            boolean r2 = r1.m56072a((com.veriff.sdk.internal.C22247pc) r3, (com.veriff.sdk.internal.C21910kf) r2)
            if (r2 == 0) goto L_0x004e
            com.veriff.sdk.internal.pa r2 = r1.f57882l
            if (r2 == 0) goto L_0x0048
            com.veriff.sdk.views.base.verification.VeriffActivity$c r0 = new com.veriff.sdk.views.base.verification.VeriffActivity$c
            r0.<init>(r3)
            r2.mo56178a(r0)
            goto L_0x004e
        L_0x0048:
            java.lang.String r2 = "navigationManager"
            mf0.C24362h.m61217l(r2)
            throw r0
        L_0x004e:
            return
        L_0x004f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Navigation cannot be null"
            r2.<init>(r3)
            throw r2
        L_0x0057:
            java.lang.String r2 = "renderer"
            mf0.C24362h.m61217l(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.base.verification.VeriffActivity.mo57572a(boolean, android.os.Bundle):void");
    }

    /* renamed from: a */
    private final boolean m56072a(C22247pc pcVar, C21910kf kfVar) {
        if (pcVar != null) {
            return true;
        }
        kfVar.mo55689a(new IllegalStateException("Activity launched without any navigation state"));
        finish();
        return false;
    }
}
