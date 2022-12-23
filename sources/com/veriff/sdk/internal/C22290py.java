package com.veriff.sdk.internal;

import android.content.Intent;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.veriff.sdk.views.C22808a;
import com.veriff.sdk.views.C22822c;
import com.veriff.sdk.views.base.verification.C22818e;
import he0.C23454a;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.data.C24424c;
import mobi.lab.veriff.data.C24429e;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B?\b\u0007\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u0010/\u001a\u00020.\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b5\u00106J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u001d\u0010\b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J&\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010&\u001a\u00020%8\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010/\u001a\u00020.8\u0016X\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00067"}, mo59060d2 = {"Lcom/veriff/sdk/views/document/DocumentScreen;", "Lcom/veriff/sdk/views/LifecycleScreen;", "Lcom/veriff/sdk/views/document/DocumentMVP$View;", "Lbf0/d;", "create", "", "Lmobi/lab/veriff/data/UiDocument;", "supportedDocs", "initDocumentsView", "([Lmobi/lab/veriff/data/UiDocument;)V", "", "onBackButtonPressed", "", "type", "openError", "openLanguageView", "Lcom/veriff/sdk/internal/analytics/EventSource;", "source", "reopenCountryActivity", "showConfirmExitDialog", "", "documentType", "Lmobi/lab/veriff/data/Country;", "selectedCountry", "", "Lcom/veriff/sdk/internal/data/FlowStep;", "steps", "startAuthenticationFlow", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "Lcom/veriff/sdk/views/base/navigation/NavigationManager;", "navigationManager", "Lcom/veriff/sdk/views/base/navigation/NavigationManager;", "Lcom/veriff/sdk/views/base/verification/Navigator;", "navigator", "Lcom/veriff/sdk/views/base/verification/Navigator;", "Lcom/veriff/sdk/internal/analytics/Page;", "page", "Lcom/veriff/sdk/internal/analytics/Page;", "getPage", "()Lcom/veriff/sdk/internal/analytics/Page;", "Lhe0/a;", "Lcom/veriff/sdk/views/document/DocumentMVP$Presenter;", "presenter", "Lhe0/a;", "Lcom/veriff/sdk/views/document/ui/DocumentView;", "view", "Lcom/veriff/sdk/views/document/ui/DocumentView;", "getView", "()Lcom/veriff/sdk/views/document/ui/DocumentView;", "Lcom/veriff/sdk/views/FloatingLifecycleOwner;", "owner", "<init>", "(Lcom/veriff/sdk/views/FloatingLifecycleOwner;Lcom/veriff/sdk/views/document/ui/DocumentView;Lhe0/a;Lcom/veriff/sdk/internal/analytics/Analytics;Lcom/veriff/sdk/views/base/verification/Navigator;Lcom/veriff/sdk/views/base/navigation/NavigationManager;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.py */
public final class C22290py extends C22822c implements pr$c {

    /* renamed from: a */
    private final C21783is f56237a = C21783is.document;

    /* renamed from: b */
    private final C22295qc f56238b;

    /* renamed from: c */
    private final C23454a<pr$b> f56239c;

    /* renamed from: d */
    private final C21645fu f56240d;

    /* renamed from: e */
    private final C22818e f56241e;

    /* renamed from: f */
    private final C22243pa f56242f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22290py(C22808a aVar, C22295qc qcVar, C23454a<pr$b> aVar2, C21645fu fuVar, C22818e eVar, C22243pa paVar) {
        super(aVar);
        C24362h.m61211f(aVar, "owner");
        C24362h.m61211f(qcVar, Promotion.ACTION_VIEW);
        C24362h.m61211f(aVar2, "presenter");
        C24362h.m61211f(fuVar, "analytics");
        C24362h.m61211f(eVar, "navigator");
        C24362h.m61211f(paVar, "navigationManager");
        this.f56238b = qcVar;
        this.f56239c = aVar2;
        this.f56240d = fuVar;
        this.f56241e = eVar;
        this.f56242f = paVar;
    }

    /* renamed from: a */
    public void mo56286a(C24429e[] eVarArr) {
        C24362h.m61211f(eVarArr, "supportedDocs");
        getView().mo56304a(eVarArr);
    }

    /* renamed from: b */
    public C22295qc getView() {
        return this.f56238b;
    }

    public void create() {
        super.create();
        this.f56239c.get().mo56242a();
    }

    /* renamed from: f */
    public boolean mo56147f() {
        this.f56239c.get().mo56278a(C21719gi.BACK_BUTTON);
        return true;
    }

    public C21783is getPage() {
        return this.f56237a;
    }

    /* renamed from: a */
    public void mo56283a(int i) {
        C22818e.C22819a.m56103a(this.f56241e, i, (C22661wm) null, (Intent) null, 6, (Object) null);
    }

    /* renamed from: b */
    public void mo56287b(C21719gi giVar) {
        C24362h.m61211f(giVar, "source");
        this.f56241e.mo57588a(getPage(), giVar, (C22661wm) null);
    }

    /* renamed from: a */
    public void mo56282a() {
        this.f56241e.mo57586c();
    }

    /* renamed from: a */
    public void mo56284a(C21719gi giVar) {
        C24362h.m61211f(giVar, "source");
        C21645fu fuVar = this.f56240d;
        C21667gf d = C21716gg.m52939d(C21783is.document, giVar);
        C24362h.m61210e(d, "EventFactory.countryReop…nt(Page.document, source)");
        fuVar.mo54921a(d);
        this.f56242f.mo56180c();
    }

    /* renamed from: a */
    public void mo56285a(String str, C24424c cVar, List<? extends C21791iy> list) {
        C24362h.m61211f(str, "documentType");
        C24362h.m61211f(cVar, "selectedCountry");
        C24362h.m61211f(list, "steps");
        this.f56241e.mo57583a(str, cVar, list);
    }
}
