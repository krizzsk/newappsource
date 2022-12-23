package com.veriff.sdk.internal;

import bf0.C21050d;
import cf0.C21136j;
import com.appboy.models.outgoing.FacebookUser;
import com.appsflyer.ServerParameters;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.veriff.sdk.internal.C21924kn;
import com.veriff.sdk.internal.C22554tl;
import ff0.C23349c;
import gf0.C23413c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import mf0.C24362h;
import mobi.lab.veriff.data.C24424c;
import mobi.lab.veriff.util.C24465j;
import p583jk.C17875h;
import p584jl.C17885a;
import uh0.C25081h;
import wh0.C25177g;
import wh0.C25235z;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BM\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0007\u0012\b\u00100\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b4\u00105J\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J&\u0010\n\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0016\u0010\u0018\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u000bH\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0016R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u0004\u0018\u00010$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u0010(R\u0016\u00100\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010(R\u0014\u00102\u001a\u0002018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, mo59060d2 = {"Lcom/veriff/sdk/views/country/CountryPresenter;", "Lcom/veriff/sdk/views/country/CountryMVP$Presenter;", "", "Lmobi/lab/veriff/data/api/request/response/CountriesResponse$CountryData;", "items", "Lmobi/lab/veriff/data/Country;", "getSelectedCountryByGeoIp", "", "code", "defaultValue", "getUpdatedCountryByCode", "Lbf0/d;", "onBackPressed", "onConfirmedCountryClicked", "country", "onContinueClicked", "onCountrySelected", "onLanguageChanged", "onLanguageClicked", "", "throwable", "location", "onNetworkFailedError", "onRequestCountriesFailed", "onRequestCountriesSuccess", "", "preselected", "proceedWithCountry", "requestCountries", "start", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "geoIpCountryCode", "Ljava/lang/String;", "Lwh0/z;", "lifecycleScope", "Lwh0/z;", "Lcom/veriff/sdk/views/country/CountryMVP$Model;", "model", "Lcom/veriff/sdk/views/country/CountryMVP$Model;", "preselectedCountry", "preselectedDocument", "Lcom/veriff/sdk/views/country/CountryMVP$View;", "view", "Lcom/veriff/sdk/views/country/CountryMVP$View;", "<init>", "(Lcom/veriff/sdk/views/country/CountryMVP$View;Lcom/veriff/sdk/views/country/CountryMVP$Model;Lcom/veriff/sdk/internal/analytics/Analytics;Lcom/veriff/sdk/internal/errors/ErrorReporter;Ljava/lang/String;Ljava/lang/String;Lcom/veriff/sdk/internal/data/FeatureFlags;Lwh0/z;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.pl */
public final class C22264pl implements ph$b {

    /* renamed from: a */
    private String f56132a;

    /* renamed from: b */
    private final ph$c f56133b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ph$a f56134c;

    /* renamed from: d */
    private final C21645fu f56135d;

    /* renamed from: e */
    private final C21910kf f56136e;

    /* renamed from: f */
    private final String f56137f;

    /* renamed from: g */
    private final String f56138g;

    /* renamed from: h */
    private final C21789ix f56139h;

    /* renamed from: i */
    private final C25235z f56140i;

    @C23413c(mo58554c = "com.veriff.sdk.views.country.CountryPresenter$requestCountries$1", mo58555f = "CountryPresenter.kt", mo58556l = {42}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.pl$a */
    public static final class C22265a extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f56141a;

        /* renamed from: b */
        public final /* synthetic */ C22264pl f56142b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22265a(C22264pl plVar, C23349c cVar) {
            super(2, cVar);
            this.f56142b = plVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22265a(this.f56142b, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22265a) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f56141a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                ph$a a = this.f56142b.f56134c;
                this.f56141a = 1;
                obj = a.mo56217a((C23349c<? super C21924kn<C22554tl>>) this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C17885a.m44475z0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C21924kn knVar = (C21924kn) obj;
            if (knVar instanceof C21924kn.C21925a) {
                this.f56142b.mo56244a((Throwable) ((C21924kn.C21925a) knVar).mo55705a(), "Request countries");
            } else if (knVar instanceof C21924kn.C21926b) {
                C22264pl plVar = this.f56142b;
                StringBuilder k = C13555b.m33972k("Backend call failed with ");
                k.append(((C21924kn.C21926b) knVar).mo55709a());
                plVar.mo56243a((Throwable) new IllegalStateException(k.toString()));
            } else if (knVar instanceof C21924kn.C21927c) {
                C21924kn.C21927c cVar = (C21924kn.C21927c) knVar;
                if (((C22554tl) cVar.mo55715a()).mo56727a() != null) {
                    this.f56142b.mo56245a(((C22554tl) cVar.mo55715a()).mo56727a());
                } else {
                    this.f56142b.mo56243a(new Throwable("Response has no body"));
                }
            } else if (knVar instanceof C21924kn.C21928d) {
                this.f56142b.mo56243a(((C21924kn.C21928d) knVar).mo55719a());
            }
            return C21050d.f52856a;
        }
    }

    public C22264pl(ph$c ph_c, ph$a ph_a, C21645fu fuVar, C21910kf kfVar, String str, String str2, C21789ix ixVar, C25235z zVar) {
        C24362h.m61211f(ph_c, Promotion.ACTION_VIEW);
        C24362h.m61211f(ph_a, ServerParameters.MODEL);
        C24362h.m61211f(fuVar, "analytics");
        C24362h.m61211f(kfVar, "errorReporter");
        C24362h.m61211f(zVar, "lifecycleScope");
        this.f56133b = ph_c;
        this.f56134c = ph_a;
        this.f56135d = fuVar;
        this.f56136e = kfVar;
        this.f56137f = str;
        this.f56138g = str2;
        this.f56139h = ixVar;
        this.f56140i = zVar;
    }

    /* renamed from: b */
    public void mo56221b() {
        C22266pm.f56143a.mo60705d("onLanguageClicked()");
        this.f56133b.mo56232g();
    }

    /* renamed from: c */
    public void mo56223c() {
        C22266pm.f56143a.mo60705d("onBackPressed(), showing confirm exit dialog");
        this.f56133b.mo56227a(C21719gi.BACK_BUTTON);
    }

    /* renamed from: d */
    public void mo56224d() {
        C21645fu fuVar = this.f56135d;
        C21667gf H = C21716gg.m52860H();
        C24362h.m61210e(H, "EventFactory.countrySelectDropdown()");
        fuVar.mo54921a(H);
        this.f56133b.mo56238k();
        this.f56133b.mo56237j_();
    }

    /* renamed from: e */
    public void mo56246e() {
        this.f56133b.mo56225a();
        C25177g.m63218b(this.f56140i, (CoroutineContext) null, new C22265a(this, (C23349c) null), 3);
    }

    /* renamed from: a */
    public void mo56242a() {
        C22266pm.f56143a.mo60705d("start(), making the start session request");
        this.f56133b.mo56231e();
        mo56246e();
        C21645fu fuVar = this.f56135d;
        C21667gf d = C21716gg.m52940d(this.f56139h);
        C24362h.m61210e(d, "EventFactory.deviceInfo(featureFlags)");
        fuVar.mo54921a(d);
    }

    /* renamed from: b */
    public void mo56222b(C24424c cVar) {
        C24362h.m61211f(cVar, ServerParameters.COUNTRY);
        C21645fu fuVar = this.f56135d;
        C21667gf G = C21716gg.m52859G();
        C24362h.m61210e(G, "EventFactory.countrySelectContinue()");
        fuVar.mo54921a(G);
        m54220a(cVar, false);
    }

    /* renamed from: b */
    private final C24424c m54221b(List<C22554tl.C22555a> list) {
        T t;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C22554tl.C22555a) t).mo56735d()) {
                break;
            }
        }
        C22554tl.C22555a aVar = (C22554tl.C22555a) t;
        if (aVar != null) {
            return new C24424c(aVar);
        }
        return null;
    }

    /* renamed from: a */
    public void mo56245a(List<C22554tl.C22555a> list) {
        T t;
        C24362h.m61211f(list, "items");
        C22266pm.f56143a.mo60705d("onRequestCountriesSuccess(), initializing countries recycler view");
        C24424c b = m54221b(list);
        String a = b != null ? b.mo60581a() : null;
        this.f56132a = a;
        C21645fu fuVar = this.f56135d;
        String str = this.f56137f;
        boolean z = false;
        C21667gf a2 = C21716gg.m52905a(str != null, a, str, this.f56139h);
        C24362h.m61210e(a2, "EventFactory.countrySele…y, featureFlags\n        )");
        fuVar.mo54921a(a2);
        String str2 = this.f56137f;
        if (str2 == null || str2.length() == 0) {
            z = true;
        }
        if (!z) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C25081h.m62830A(((C22554tl.C22555a) t).mo56732a(), this.f56137f, true)) {
                    break;
                }
            }
            C22554tl.C22555a aVar = (C22554tl.C22555a) t;
            C24424c cVar = aVar != null ? new C24424c(aVar) : null;
            if (cVar != null) {
                m54220a(cVar, true);
                C21645fu fuVar2 = this.f56135d;
                C21667gf c = C21716gg.m52934c(true, this.f56132a, this.f56137f, (String) null);
                C24362h.m61210e(c, "EventFactory.preselected…ull\n                    )");
                fuVar2.mo54921a(c);
                return;
            }
        }
        ph$c ph_c = this.f56133b;
        ArrayList arrayList = new ArrayList(C21136j.m49436X(list, 10));
        for (C22554tl.C22555a cVar2 : list) {
            arrayList.add(new C24424c(cVar2));
        }
        ph_c.mo56228a((List<? extends C24424c>) arrayList);
        this.f56133b.mo56230b();
        C24424c a3 = this.f56134c.mo56218a();
        if (a3 != null) {
            String a4 = a3.mo60581a();
            C24362h.m61210e(a4, "it.code");
            C24424c a5 = m54219a(list, a4, a3);
            if (a5 != null) {
                b = a5;
            }
        }
        this.f56134c.mo56219a(b);
        this.f56133b.mo56229a(b);
    }

    /* renamed from: a */
    public void mo56243a(Throwable th) {
        C24362h.m61211f(th, "throwable");
        C22266pm.f56143a.mo60705d("onRequestCountriesFailed(), opening error");
        this.f56133b.mo56230b();
        this.f56133b.mo56226a(22);
        this.f56136e.mo55690a(th, "onRequestCountriesFailed()", C21720gj.country_selection);
    }

    /* renamed from: a */
    public void mo56220a(C24424c cVar) {
        C24362h.m61211f(cVar, ServerParameters.COUNTRY);
        C21645fu fuVar = this.f56135d;
        C21667gf I = C21716gg.m52861I();
        C24362h.m61210e(I, "EventFactory.countrySelectChosen()");
        fuVar.mo54921a(I);
        this.f56134c.mo56219a(cVar);
        this.f56133b.mo56229a(cVar);
        this.f56133b.mo56235i_();
        C21645fu fuVar2 = this.f56135d;
        String str = this.f56137f;
        C21667gf a = C21716gg.m52906a(str != null, this.f56132a, str, cVar.mo60581a());
        C24362h.m61210e(a, "EventFactory.countrySele…   country.code\n        )");
        fuVar2.mo54921a(a);
    }

    /* renamed from: a */
    private final void m54220a(C24424c cVar, boolean z) {
        C24465j a = C22266pm.f56143a;
        StringBuilder k = C13555b.m33972k("proceedWithCountry() ");
        k.append(cVar.mo60583b());
        a.mo60705d(k.toString());
        if (cVar.mo60584c() != null) {
            List<String> c = cVar.mo60584c();
            C24362h.m61210e(c, "country.docs");
            boolean z2 = true;
            if (!c.isEmpty()) {
                C21645fu fuVar = this.f56135d;
                String str = this.f56137f;
                if (str == null) {
                    z2 = false;
                }
                C21667gf b = C21716gg.m52925b(z2, this.f56132a, str, cVar.mo60581a());
                C24362h.m61210e(b, "EventFactory.countrySele…ry.code\n                )");
                fuVar.mo54921a(b);
                if (z) {
                    String str2 = this.f56138g;
                    if (str2 == null || !cVar.mo60582a(str2)) {
                        this.f56134c.mo56219a(cVar);
                    } else {
                        this.f56134c.mo56219a(new C24424c(cVar.mo60581a(), cVar.mo60583b(), C17875h.m44280D(this.f56138g)));
                    }
                    this.f56133b.mo56233h();
                    return;
                }
                this.f56133b.mo56234i();
                return;
            }
        }
        this.f56133b.mo56236j();
    }

    /* renamed from: a */
    public void mo56244a(Throwable th, String str) {
        C24362h.m61211f(th, "throwable");
        C24362h.m61211f(str, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        this.f56133b.mo56230b();
        this.f56133b.mo56226a(24);
        this.f56136e.mo55691b(th, str, C21720gj.country_selection);
    }

    /* renamed from: a */
    private final C24424c m54219a(List<C22554tl.C22555a> list, String str, C24424c cVar) {
        T t;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C24362h.m61206a(((C22554tl.C22555a) t).mo56732a(), str)) {
                break;
            }
        }
        C22554tl.C22555a aVar = (C22554tl.C22555a) t;
        return aVar != null ? new C24424c(aVar) : cVar;
    }
}
