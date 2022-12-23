package com.veriff.sdk.internal;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.C0249h;
import com.veriff.sdk.internal.C21610ep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import mobi.lab.veriff.R$style;
import mobi.lab.veriff.data.C24426d;
import mobi.lab.veriff.data.VeriffConstants;
import mobi.lab.veriff.service.VeriffStatusUpdatesService;
import mobi.lab.veriff.util.C24452e;
import p129j1.C5348a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001?B\u0007¢\u0006\u0004\b=\u0010>J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\"\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\"\u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0019\u0010\u0017\u001a\u00020\u00052\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\r\u001a\u0004\u0018\u00010\fR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0004@\u0004X.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0004@\u0004X.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00100\u001a\u00020/8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00107\u001a\u0002068\u0006@\u0006X.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006@"}, mo59060d2 = {"Lcom/veriff/sdk/views/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/veriff/sdk/views/base/BaseMVP$View;", "Landroid/os/Bundle;", "savedInstanceState", "Lbf0/d;", "onCreate", "closeDialog", "", "success", "", "statusCode", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "session", "closeLibrary", "endAuthenticationFlowWithStatusCode", "", "sessionToken", "status", "sendStatusBroadcast", "sendStatusCodeToVendor", "setReturnIntent", "color", "setStatusBarColor", "(Ljava/lang/Integer;)V", "Lcom/veriff/sdk/internal/analytics/Page;", "page", "Lcom/veriff/sdk/internal/analytics/EventSource;", "source", "showConfirmFlowCancellationDialog", "Lcom/veriff/sdk/views/base/BaseMVP$Presenter;", "basePresenter", "Lcom/veriff/sdk/views/base/BaseMVP$Presenter;", "Landroidx/appcompat/app/h;", "dialog", "Landroidx/appcompat/app/h;", "getDialog", "()Landroidx/appcompat/app/h;", "setDialog", "(Landroidx/appcompat/app/h;)V", "Lmobi/lab/veriff/data/SessionArguments;", "sessionArguments", "Lmobi/lab/veriff/data/SessionArguments;", "getSessionArguments", "()Lmobi/lab/veriff/data/SessionArguments;", "setSessionArguments", "(Lmobi/lab/veriff/data/SessionArguments;)V", "Lcom/veriff/sdk/internal/SessionServices;", "sessionServices", "Lcom/veriff/sdk/internal/SessionServices;", "getSessionServices", "()Lcom/veriff/sdk/internal/SessionServices;", "setSessionServices", "(Lcom/veriff/sdk/internal/SessionServices;)V", "Lcom/veriff/di/VerificationComponent$Factory;", "verificationComponentFactory", "Lcom/veriff/di/VerificationComponent$Factory;", "getVerificationComponentFactory", "()Lcom/veriff/di/VerificationComponent$Factory;", "setVerificationComponentFactory", "(Lcom/veriff/di/VerificationComponent$Factory;)V", "<init>", "()V", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ot */
public class C22233ot extends AppCompatActivity implements ov$c {

    /* renamed from: e */
    public static final C22234a f56062e = new C22234a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public C0249h f56063a;

    /* renamed from: b */
    public C24426d f56064b;

    /* renamed from: c */
    public C21639fp f56065c;

    /* renamed from: d */
    public C21610ep.C21611a f56066d;

    /* renamed from: f */
    private ov$b f56067f;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, mo59060d2 = {"Lcom/veriff/sdk/views/base/BaseActivity$Companion;", "", "()V", "populateIntentArguments", "Landroid/content/Intent;", "intent", "args", "Lmobi/lab/veriff/data/SessionArguments;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ot$a */
    public static final class C22234a {
        private C22234a() {
        }

        public /* synthetic */ C22234a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo56162a(Intent intent, C24426d dVar) {
            C24362h.m61211f(intent, "intent");
            C24362h.m61211f(dVar, "args");
            intent.putExtra("com.veriff.sdk.EXTRA_SESSION_ARGUMENTS", dVar);
            return intent;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo59060d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lbf0/d;", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ot$b */
    public static final class C22235b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C22233ot f56068a;

        /* renamed from: b */
        public final /* synthetic */ C21783is f56069b;

        /* renamed from: c */
        public final /* synthetic */ C21719gi f56070c;

        /* renamed from: d */
        public final /* synthetic */ C22661wm f56071d;

        public C22235b(C22233ot otVar, C21783is isVar, C21719gi giVar, C22661wm wmVar) {
            this.f56068a = otVar;
            this.f56069b = isVar;
            this.f56070c = giVar;
            this.f56071d = wmVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C21645fu b = this.f56068a.mo56159j().mo54908b();
            C21667gf b2 = C21716gg.m52917b(this.f56069b, this.f56070c);
            C24362h.m61210e(b2, "EventFactory.getQuitSess…firmedEvent(page, source)");
            b.mo54921a(b2);
            C22233ot.m54112a(this.f56068a).mo56167a(this.f56071d);
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo59060d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lbf0/d;", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ot$c */
    public static final class C22236c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C22233ot f56072a;

        /* renamed from: b */
        public final /* synthetic */ C21783is f56073b;

        /* renamed from: c */
        public final /* synthetic */ C21719gi f56074c;

        public C22236c(C22233ot otVar, C21783is isVar, C21719gi giVar) {
            this.f56072a = otVar;
            this.f56073b = isVar;
            this.f56074c = giVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C21645fu b = this.f56072a.mo56159j().mo54908b();
            C21667gf c = C21716gg.m52929c(this.f56073b, this.f56074c);
            C24362h.m61210e(c, "EventFactory.getQuitSess…celledEvent(page, source)");
            b.mo54921a(c);
            C22233ot.m54112a(this.f56072a).mo56166a();
        }
    }

    /* renamed from: a */
    public static final Intent m54111a(Intent intent, C24426d dVar) {
        return f56062e.mo56162a(intent, dVar);
    }

    /* renamed from: a */
    public static final /* synthetic */ ov$b m54112a(C22233ot otVar) {
        ov$b ov_b = otVar.f56067f;
        if (ov_b != null) {
            return ov_b;
        }
        C24362h.m61217l("basePresenter");
        throw null;
    }

    /* renamed from: b */
    public void mo56156b(int i) {
        C24426d dVar = this.f56064b;
        if (dVar != null) {
            String c = dVar.mo60598c();
            VeriffStatusUpdatesService.startInternal(this, i, c);
            m54113a(c, i);
            return;
        }
        C24362h.m61217l("sessionArguments");
        throw null;
    }

    /* renamed from: h_ */
    public final C24426d mo56158h_() {
        C24426d dVar = this.f56064b;
        if (dVar != null) {
            return dVar;
        }
        C24362h.m61217l("sessionArguments");
        throw null;
    }

    /* renamed from: j */
    public final C21639fp mo56159j() {
        C21639fp fpVar = this.f56065c;
        if (fpVar != null) {
            return fpVar;
        }
        C24362h.m61217l("sessionServices");
        throw null;
    }

    /* renamed from: k */
    public final C21610ep.C21611a mo56160k() {
        C21610ep.C21611a aVar = this.f56066d;
        if (aVar != null) {
            return aVar;
        }
        C24362h.m61217l("verificationComponentFactory");
        throw null;
    }

    /* renamed from: l */
    public void mo56161l() {
        C0249h hVar = this.f56063a;
        if (hVar != null) {
            hVar.cancel();
        } else {
            C24362h.m61217l("dialog");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        C21618ez.f54604a.mo54891b(getClass().getName());
        super.onCreate(bundle);
        if (C21566di.f54308a.mo54583a(this)) {
            this.f56067f = new C22239ox(this, new C22238ow());
            mo56153a((Integer) null);
        }
    }

    /* renamed from: a */
    public final void mo56154a(C24426d dVar) {
        C24362h.m61211f(dVar, "<set-?>");
        this.f56064b = dVar;
    }

    /* renamed from: a */
    public final void mo56153a(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            C24426d dVar = this.f56064b;
            if (dVar != null) {
                i = dVar.mo60604g().mo57097l();
            } else {
                C24362h.m61217l("sessionArguments");
                throw null;
            }
        }
        Window window = getWindow();
        C24362h.m61210e(window, "window");
        window.setStatusBarColor(i);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(67108864);
        if (Build.VERSION.SDK_INT >= 23) {
            double e = C5348a.m13409e(-1, i);
            Window window2 = getWindow();
            C24362h.m61210e(window2, "window");
            View decorView = window2.getDecorView();
            C24362h.m61210e(decorView, "window.decorView");
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (e < ((double) 2)) {
                Window window3 = getWindow();
                C24362h.m61210e(window3, "window");
                View decorView2 = window3.getDecorView();
                C24362h.m61210e(decorView2, "window.decorView");
                decorView2.setSystemUiVisibility(systemUiVisibility | 8192);
                return;
            }
            Window window4 = getWindow();
            C24362h.m61210e(window4, "window");
            View decorView3 = window4.getDecorView();
            C24362h.m61210e(decorView3, "window.decorView");
            decorView3.setSystemUiVisibility(systemUiVisibility & -8193);
        }
    }

    /* renamed from: b */
    public void mo56157b(boolean z, int i, C22661wm wmVar) {
        C24452e.m61501a((Context) this);
        C21639fp fpVar = this.f56065c;
        if (fpVar != null) {
            fpVar.mo54909c().mo55960h();
            mo57607a(z, i);
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        C24362h.m61217l("sessionServices");
        throw null;
    }

    /* renamed from: a */
    public final void mo56152a(C21783is isVar, C21719gi giVar, C22661wm wmVar) {
        C24362h.m61211f(isVar, "page");
        C24362h.m61211f(giVar, "source");
        C21639fp fpVar = this.f56065c;
        if (fpVar != null) {
            C21645fu b = fpVar.mo54908b();
            C21667gf a = C21716gg.m52890a(isVar, giVar);
            C24362h.m61210e(a, "EventFactory.getQuitSessionEvent(page, source)");
            b.mo54921a(a);
            C21639fp fpVar2 = this.f56065c;
            if (fpVar2 != null) {
                C21616ex a2 = fpVar2.mo54912f().mo60691a();
                CharSequence bl = a2.mo54748bl();
                CharSequence bC = a2.mo54713bC();
                CharSequence bD = a2.mo54714bD();
                C0249h.C0250a aVar = new C0249h.C0250a(new ContextThemeWrapper(this, R$style.vrffAlertDialogStyle));
                AlertController.C0216b bVar = aVar.f735a;
                bVar.f604f = bl;
                bVar.f609k = false;
                C22235b bVar2 = new C22235b(this, isVar, giVar, wmVar);
                AlertController.C0216b bVar3 = aVar.f735a;
                bVar3.f605g = bC;
                bVar3.f606h = bVar2;
                C22236c cVar = new C22236c(this, isVar, giVar);
                AlertController.C0216b bVar4 = aVar.f735a;
                bVar4.f607i = bD;
                bVar4.f608j = cVar;
                C0249h create = aVar.create();
                C24362h.m61210e(create, "builder.create()");
                this.f56063a = create;
                create.show();
                return;
            }
            C24362h.m61217l("sessionServices");
            throw null;
        }
        C24362h.m61217l("sessionServices");
        throw null;
    }

    /* renamed from: a */
    public void mo56155a(boolean z, int i, C22661wm wmVar) {
        ov$b ov_b = this.f56067f;
        if (ov_b != null) {
            ov_b.mo56168a(z, i, wmVar);
        } else {
            C24362h.m61217l("basePresenter");
            throw null;
        }
    }

    /* renamed from: a */
    private final void m54113a(String str, int i) {
        Intent intent = new Intent();
        intent.setAction("veriff.info.status");
        intent.putExtra(VeriffConstants.INTENT_EXTRA_SESSION_URL, str);
        intent.putExtra(VeriffConstants.INTENT_EXTRA_STATUS, i);
        StringBuilder sb = new StringBuilder();
        Context applicationContext = getApplicationContext();
        C24362h.m61210e(applicationContext, "applicationContext");
        sb.append(applicationContext.getPackageName());
        sb.append(".VERIFF_STATUS_BROADCAST_PERMISSION");
        sendBroadcast(intent, sb.toString());
    }

    /* renamed from: a */
    private final void mo57607a(boolean z, int i) {
        Intent intent = new Intent();
        intent.putExtra(VeriffConstants.INTENT_EXTRA_STATUS, i);
        String str = VeriffConstants.INTENT_EXTRA_SESSION_URL;
        C24426d dVar = this.f56064b;
        if (dVar != null) {
            intent.putExtra(str, dVar.mo60598c());
            setResult(z ? -1 : 0, intent);
            return;
        }
        C24362h.m61217l("sessionArguments");
        throw null;
    }
}
