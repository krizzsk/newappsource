package com.veriff.sdk.internal;

import android.content.Context;
import android.content.Intent;
import android.widget.FrameLayout;
import bf0.C21050d;
import cf0.C21136j;
import com.appsflyer.ServerParameters;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C22274pq;
import com.veriff.sdk.views.C22808a;
import com.veriff.sdk.views.C22822c;
import com.veriff.sdk.views.base.verification.C22816c;
import com.veriff.sdk.views.base.verification.C22818e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import mobi.lab.veriff.data.C24424c;
import mobi.lab.veriff.data.C24426d;
import mobi.lab.veriff.util.C24454g;
import mobi.lab.veriff.util.C24469n;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BK\b\u0007\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\bI\u0010JJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u0012\u0010\u0016\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\u0002008\u0016X\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X.¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010E\u001a\u00020D8\u0016X\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006K"}, mo59060d2 = {"Lcom/veriff/sdk/views/country/CountryScreen;", "Lcom/veriff/sdk/views/LifecycleScreen;", "Lcom/veriff/sdk/views/country/CountryMVP$View;", "Lbf0/d;", "create", "clearSearchCountry", "createNewView", "hideProgress", "", "Lmobi/lab/veriff/data/Country;", "countryItems", "initCountryView", "", "onBackButtonPressed", "openDocumentView", "isRoot", "openDocumentViewForPreselectedCountry", "", "type", "openError", "openLanguageView", "country", "setSelectedCountry", "showConfirm", "Lcom/veriff/sdk/internal/analytics/EventSource;", "source", "showConfirmExitDialog", "showNoDocumentSnackbar", "showProgress", "showSearch", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/veriff/sdk/views/country/ui/CountryView;", "countryView", "Lcom/veriff/sdk/views/country/ui/CountryView;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "Lcom/veriff/sdk/views/country/CountryModel;", "model", "Lcom/veriff/sdk/views/country/CountryModel;", "Lcom/veriff/sdk/views/base/navigation/NavigationManager;", "navigationManager", "Lcom/veriff/sdk/views/base/navigation/NavigationManager;", "Lcom/veriff/sdk/views/base/verification/LegacyVerificationNavigator;", "navigator", "Lcom/veriff/sdk/views/base/verification/LegacyVerificationNavigator;", "Lcom/veriff/sdk/internal/analytics/Page;", "page", "Lcom/veriff/sdk/internal/analytics/Page;", "getPage", "()Lcom/veriff/sdk/internal/analytics/Page;", "Lcom/veriff/sdk/views/country/CountryMVP$Presenter;", "presenter", "Lcom/veriff/sdk/views/country/CountryMVP$Presenter;", "Lmobi/lab/veriff/data/SessionArguments;", "sessionArguments", "Lmobi/lab/veriff/data/SessionArguments;", "Lcom/veriff/sdk/internal/data/StartSessionData;", "sessionData", "Lcom/veriff/sdk/internal/data/StartSessionData;", "Lcom/veriff/sdk/internal/SessionServices;", "sessionServices", "Lcom/veriff/sdk/internal/SessionServices;", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "veriffResourcesProvider", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "Landroid/widget/FrameLayout;", "view", "Landroid/widget/FrameLayout;", "getView", "()Landroid/widget/FrameLayout;", "<init>", "(Landroid/content/Context;Lmobi/lab/veriff/data/SessionArguments;Lcom/veriff/sdk/internal/SessionServices;Lcom/veriff/sdk/internal/data/FeatureFlags;Lcom/veriff/sdk/views/base/verification/LegacyVerificationNavigator;Lcom/veriff/sdk/views/base/navigation/NavigationManager;Lcom/veriff/sdk/internal/data/StartSessionData;Lcom/veriff/sdk/views/country/CountryModel;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.pn */
public final class C22267pn extends C22822c implements ph$c {

    /* renamed from: a */
    private final C21783is f56144a = C21783is.f55100c;

    /* renamed from: b */
    private final FrameLayout f56145b;

    /* renamed from: c */
    private ph$b f56146c;

    /* renamed from: d */
    private C22274pq f56147d;

    /* renamed from: e */
    private C22700xq f56148e;

    /* renamed from: f */
    private final Context f56149f;

    /* renamed from: g */
    private final C24426d f56150g;

    /* renamed from: h */
    private final C21639fp f56151h;

    /* renamed from: i */
    private final C21789ix f56152i;

    /* renamed from: j */
    private final C22816c f56153j;

    /* renamed from: k */
    private final C22243pa f56154k;

    /* renamed from: l */
    private final C21895jw f56155l;

    /* renamed from: m */
    private final C22261pi f56156m;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, mo59060d2 = {"com/veriff/sdk/views/country/CountryScreen$createNewView$1$1", "Lcom/veriff/sdk/views/country/ui/CountryView$Listener;", "Lbf0/d;", "onBackButtonPressed", "onConfirmedCountryClicked", "Lmobi/lab/veriff/data/Country;", "country", "onContinueClicked", "onCountrySelected", "onLanguageClicked", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.pn$a */
    public static final class C22268a implements C22274pq.C22280a {

        /* renamed from: a */
        public final /* synthetic */ C22267pn f56157a;

        /* renamed from: b */
        public final /* synthetic */ C21616ex f56158b;

        public C22268a(C22267pn pnVar, C21616ex exVar) {
            this.f56157a = pnVar;
            this.f56158b = exVar;
        }

        /* renamed from: a */
        public void mo56248a() {
            C22267pn.m54233a(this.f56157a).mo56223c();
        }

        /* renamed from: b */
        public void mo56250b() {
            C22267pn.m54233a(this.f56157a).mo56221b();
        }

        /* renamed from: c */
        public void mo56252c() {
            C22267pn.m54233a(this.f56157a).mo56224d();
        }

        /* renamed from: a */
        public void mo56249a(C24424c cVar) {
            C24362h.m61211f(cVar, ServerParameters.COUNTRY);
            C22267pn.m54233a(this.f56157a).mo56222b(cVar);
        }

        /* renamed from: b */
        public void mo56251b(C24424c cVar) {
            C24362h.m61211f(cVar, ServerParameters.COUNTRY);
            C22267pn.m54233a(this.f56157a).mo56220a(cVar);
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/base/navigation/NavigationState;", "it", "invoke", "(Lcom/veriff/sdk/views/base/navigation/NavigationState;)Lcom/veriff/sdk/views/base/navigation/NavigationState;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.pn$b */
    public static final class C22269b extends Lambda implements C24236l<C22247pc, C22247pc> {

        /* renamed from: a */
        public static final C22269b f56159a = new C22269b();

        public C22269b() {
            super(1);
        }

        /* renamed from: a */
        public final C22247pc invoke(C22247pc pcVar) {
            C24362h.m61211f(pcVar, "it");
            List<C22250pd> b = pcVar.mo56187b();
            ArrayList arrayList = new ArrayList(C21136j.m49436X(b, 10));
            for (C22250pd pdVar : b) {
                if (pdVar == C22250pd.CountrySelect) {
                    pdVar = C22250pd.DocumentSelect;
                }
                arrayList.add(pdVar);
            }
            return C22247pc.m54156a(pcVar, arrayList, 0, (C24454g) null, 6, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22267pn(Context context, C24426d dVar, C21639fp fpVar, C21789ix ixVar, C22816c cVar, C22243pa paVar, C21895jw jwVar, C22261pi piVar) {
        super((C22808a) null, 1, (DefaultConstructorMarker) null);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(dVar, "sessionArguments");
        C24362h.m61211f(fpVar, "sessionServices");
        C24362h.m61211f(ixVar, "featureFlags");
        C24362h.m61211f(cVar, "navigator");
        C24362h.m61211f(paVar, "navigationManager");
        C24362h.m61211f(jwVar, "sessionData");
        C24362h.m61211f(piVar, ServerParameters.MODEL);
        this.f56149f = context;
        this.f56150g = dVar;
        this.f56151h = fpVar;
        this.f56152i = ixVar;
        this.f56153j = cVar;
        this.f56154k = paVar;
        this.f56155l = jwVar;
        this.f56156m = piVar;
        this.f56145b = new FrameLayout(context);
    }

    /* renamed from: a */
    public static final /* synthetic */ ph$b m54233a(C22267pn pnVar) {
        ph$b ph_b = pnVar.f56146c;
        if (ph_b != null) {
            return ph_b;
        }
        C24362h.m61217l("presenter");
        throw null;
    }

    /* renamed from: b */
    public void mo56230b() {
        C22274pq pqVar = this.f56147d;
        if (pqVar != null) {
            pqVar.mo56264f();
        } else {
            C24362h.m61217l("countryView");
            throw null;
        }
    }

    public void create() {
        super.create();
        this.f56148e = new C22700xq(this.f56149f, this.f56150g.mo60604g());
        C22264pl plVar = new C22264pl(this, this.f56156m, this.f56151h.mo54908b(), this.f56151h.mo54910d(), this.f56155l.mo55643e(), this.f56155l.mo55645f(), this.f56152i, mo57591d());
        this.f56146c = plVar;
        plVar.mo56242a();
    }

    /* renamed from: e */
    public void mo56231e() {
        C21616ex a = this.f56151h.mo54912f().mo60691a();
        C24469n.C24470a aVar = C24469n.f61931a;
        C24469n nVar = new C24469n(this.f56150g.mo60604g(), a, this.f56152i);
        C24469n.C24470a aVar2 = C24469n.f61931a;
        aVar2.mo60715a(nVar);
        try {
            Context context = this.f56149f;
            C22700xq xqVar = this.f56148e;
            if (xqVar != null) {
                C22274pq pqVar = new C22274pq(context, a, xqVar, this.f56152i, this.f56151h.mo54908b(), new C22268a(this, a));
                this.f56147d = pqVar;
                pqVar.setLayoutDirection(this.f56151h.mo54912f().mo60698d());
                getView().removeAllViews();
                FrameLayout l = getView();
                C22274pq pqVar2 = this.f56147d;
                if (pqVar2 != null) {
                    l.addView(pqVar2);
                    C21050d dVar = C21050d.f52856a;
                    aVar2.mo60718d();
                    return;
                }
                C24362h.m61217l("countryView");
                throw null;
            }
            C24362h.m61217l("veriffResourcesProvider");
            throw null;
        } catch (Throwable th) {
            C24469n.f61931a.mo60718d();
            throw th;
        }
    }

    /* renamed from: f */
    public boolean mo56147f() {
        ph$b ph_b = this.f56146c;
        if (ph_b != null) {
            ph_b.mo56223c();
            return true;
        }
        C24362h.m61217l("presenter");
        throw null;
    }

    /* renamed from: g */
    public void mo56232g() {
        this.f56153j.mo57586c();
    }

    public C21783is getPage() {
        return this.f56144a;
    }

    /* renamed from: h */
    public void mo56233h() {
        m54234a(true);
    }

    /* renamed from: i */
    public void mo56234i() {
        m54234a(false);
    }

    /* renamed from: i_ */
    public void mo56235i_() {
        C22274pq pqVar = this.f56147d;
        if (pqVar != null) {
            pqVar.mo56262d();
        } else {
            C24362h.m61217l("countryView");
            throw null;
        }
    }

    /* renamed from: j */
    public void mo56236j() {
        C22274pq pqVar = this.f56147d;
        if (pqVar != null) {
            pqVar.mo56265g();
        } else {
            C24362h.m61217l("countryView");
            throw null;
        }
    }

    /* renamed from: j_ */
    public void mo56237j_() {
        C22274pq pqVar = this.f56147d;
        if (pqVar != null) {
            pqVar.mo56260b();
        } else {
            C24362h.m61217l("countryView");
            throw null;
        }
    }

    /* renamed from: k */
    public void mo56238k() {
        C22274pq pqVar = this.f56147d;
        if (pqVar != null) {
            pqVar.mo56258a();
        } else {
            C24362h.m61217l("countryView");
            throw null;
        }
    }

    /* renamed from: l */
    public FrameLayout getView() {
        return this.f56145b;
    }

    /* renamed from: a */
    public void mo56225a() {
        C22274pq pqVar = this.f56147d;
        if (pqVar != null) {
            pqVar.mo56263e();
        } else {
            C24362h.m61217l("countryView");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo56229a(C24424c cVar) {
        C22274pq pqVar = this.f56147d;
        if (pqVar != null) {
            pqVar.setSelectedCountry(cVar);
        } else {
            C24362h.m61217l("countryView");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo56226a(int i) {
        C22818e.C22819a.m56103a(this.f56153j, i, (C22661wm) null, (Intent) null, 6, (Object) null);
    }

    /* renamed from: a */
    public void mo56227a(C21719gi giVar) {
        C24362h.m61211f(giVar, "source");
        this.f56153j.mo56172a(getPage(), giVar, (C22661wm) null);
    }

    /* renamed from: a */
    public void mo56228a(List<? extends C24424c> list) {
        C24362h.m61211f(list, "countryItems");
        mo56231e();
        C22274pq pqVar = this.f56147d;
        if (pqVar != null) {
            pqVar.mo56259a((List<C24424c>) list);
        } else {
            C24362h.m61217l("countryView");
            throw null;
        }
    }

    /* renamed from: a */
    private final void m54234a(boolean z) {
        if (z) {
            this.f56154k.mo56178a(C22269b.f56159a);
        } else {
            this.f56154k.mo56179b();
        }
    }
}
