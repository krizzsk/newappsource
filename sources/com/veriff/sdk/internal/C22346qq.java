package com.veriff.sdk.internal;

import android.content.Context;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C22349qs;
import com.veriff.sdk.views.C22932d;
import com.veriff.sdk.views.C22934e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import mf0.C24362h;
import mobi.lab.veriff.util.C24457h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, mo59060d2 = {"Lcom/veriff/sdk/views/instruction/InstructionScreen;", "Lcom/veriff/sdk/views/Screen;", "context", "Landroid/content/Context;", "host", "Lcom/veriff/sdk/views/ScreenHost;", "languageUtil", "Lmobi/lab/veriff/util/LanguageUtil;", "step", "Lcom/veriff/sdk/internal/data/FlowStep;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "veriffResourcesProvider", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "(Landroid/content/Context;Lcom/veriff/sdk/views/ScreenHost;Lmobi/lab/veriff/util/LanguageUtil;Lcom/veriff/sdk/internal/data/FlowStep;Lcom/veriff/sdk/internal/data/FeatureFlags;Lcom/veriff/sdk/internal/analytics/Analytics;Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;)V", "page", "Lcom/veriff/sdk/internal/analytics/Page;", "getPage", "()Lcom/veriff/sdk/internal/analytics/Page;", "view", "Lcom/veriff/sdk/views/instruction/InstructionView;", "getView", "()Lcom/veriff/sdk/views/instruction/InstructionView;", "onBackButtonPressed", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.qq */
public final class C22346qq implements C22932d {

    /* renamed from: a */
    private final C22349qs f56370a;

    /* renamed from: b */
    private final C21783is f56371b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C22934e f56372c;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, mo59060d2 = {"com/veriff/sdk/views/instruction/InstructionScreen$view$1", "Lcom/veriff/sdk/views/instruction/InstructionView$Listener;", "Lbf0/d;", "onClosePressed", "onOkPressed", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qq$a */
    public static final class C22347a implements C22349qs.C22352a {

        /* renamed from: a */
        public final /* synthetic */ C22346qq f56373a;

        /* renamed from: b */
        public final /* synthetic */ C21645fu f56374b;

        /* renamed from: c */
        public final /* synthetic */ C21791iy f56375c;

        public C22347a(C22346qq qqVar, C21645fu fuVar, C21791iy iyVar) {
            this.f56373a = qqVar;
            this.f56374b = fuVar;
            this.f56375c = iyVar;
        }

        /* renamed from: a */
        public void mo56359a() {
            this.f56373a.f56372c.mo57611d();
            C21645fu fuVar = this.f56374b;
            C21667gf a = C21716gg.m52895a(this.f56375c);
            C24362h.m61210e(a, "EventFactory.instructionScreenContinue(step)");
            fuVar.mo54921a(a);
        }

        /* renamed from: b */
        public void mo56360b() {
            this.f56373a.f56372c.mo57597a(this.f56373a.getPage(), C21719gi.CLOSE_BUTTON);
        }
    }

    public C22346qq(Context context, C22934e eVar, C24457h hVar, C21791iy iyVar, C21789ix ixVar, C21645fu fuVar, C22700xq xqVar) {
        C21783is isVar;
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(eVar, "host");
        C24362h.m61211f(hVar, "languageUtil");
        C24362h.m61211f(iyVar, "step");
        C24362h.m61211f(ixVar, "featureFlags");
        C24362h.m61211f(fuVar, "analytics");
        C24362h.m61211f(xqVar, "veriffResourcesProvider");
        this.f56372c = eVar;
        C21667gf c = C21716gg.m52931c(iyVar, ixVar);
        C24362h.m61210e(c, "EventFactory.instruction…Shown(step, featureFlags)");
        fuVar.mo54921a(c);
        this.f56370a = new C22349qs(context, iyVar, hVar.mo60691a(), xqVar, new C22347a(this, fuVar, iyVar));
        switch (C22348qr.f56376a[iyVar.ordinal()]) {
            case 1:
                isVar = C21783is.portrait_instructions;
                break;
            case 2:
                isVar = C21783is.passport_instructions;
                break;
            case 3:
            case 4:
            case 5:
                isVar = C21783is.document_front_instructions;
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                isVar = C21783is.document_back_instructions;
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                isVar = C21783is.document_and_face_instructions;
                break;
            case 14:
                isVar = C21783is.barcode_instructions;
                break;
            case 15:
                isVar = C21783is.nfc_instructions;
                break;
            case 16:
                isVar = C21783is.proof_of_address;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f56371b = isVar;
    }

    public void create() {
        C22932d.C22933a.m56592b(this);
    }

    public void destroy() {
        C22932d.C22933a.m56597g(this);
    }

    /* renamed from: f */
    public boolean mo56147f() {
        return false;
    }

    public C21783is getPage() {
        return this.f56371b;
    }

    public Integer getStatusBarColor() {
        return C22932d.C22933a.m56591a(this);
    }

    public void pause() {
        C22932d.C22933a.m56595e(this);
    }

    public void resume() {
        C22932d.C22933a.m56594d(this);
    }

    public void start() {
        C22932d.C22933a.m56593c(this);
    }

    public void stop() {
        C22932d.C22933a.m56596f(this);
    }

    /* renamed from: a */
    public C22349qs getView() {
        return this.f56370a;
    }
}
