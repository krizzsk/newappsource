package com.veriff.sdk.internal;

import ff0.C23349c;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.data.C24424c;
import mobi.lab.veriff.data.C24426d;
import sf0.C24859f;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068V@VX\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, mo59060d2 = {"Lcom/veriff/sdk/views/country/CountryModel;", "Lcom/veriff/sdk/views/country/CountryMVP$Model;", "Lcom/veriff/sdk/internal/network/ApiResult;", "Lmobi/lab/veriff/data/api/request/response/CountriesResponse;", "requestCountries", "(Lff0/c;)Ljava/lang/Object;", "Lmobi/lab/veriff/data/Country;", "<set-?>", "selectedCountry$delegate", "Lsf0/f;", "getSelectedCountry", "()Lmobi/lab/veriff/data/Country;", "setSelectedCountry", "(Lmobi/lab/veriff/data/Country;)V", "selectedCountry", "Lmobi/lab/veriff/data/SessionArguments;", "sessionArguments", "Lmobi/lab/veriff/data/SessionArguments;", "Lcom/veriff/sdk/internal/SessionServices;", "sessionServices", "Lcom/veriff/sdk/internal/SessionServices;", "Lcom/veriff/sdk/internal/data/VerificationState;", "state", "Lcom/veriff/sdk/internal/data/VerificationState;", "<init>", "(Lmobi/lab/veriff/data/SessionArguments;Lcom/veriff/sdk/internal/SessionServices;Lcom/veriff/sdk/internal/data/VerificationState;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.pi */
public final class C22261pi implements ph$a {

    /* renamed from: a */
    private final C24859f f56126a;

    /* renamed from: b */
    private final C24426d f56127b;

    /* renamed from: c */
    private final C21639fp f56128c;

    public C22261pi(C24426d dVar, C21639fp fpVar, C21900jz jzVar) {
        C24362h.m61211f(dVar, "sessionArguments");
        C24362h.m61211f(fpVar, "sessionServices");
        C24362h.m61211f(jzVar, "state");
        this.f56127b = dVar;
        this.f56128c = fpVar;
        this.f56126a = new C22262pj(jzVar);
    }

    /* renamed from: a */
    public Object mo56217a(C23349c<? super C21924kn<C22554tl>> cVar) {
        return this.f56128c.mo54907a().mo57061a(this.f56127b.mo60598c(), this.f56128c.mo54912f().mo60697c(), cVar);
    }

    /* renamed from: a */
    public C24424c mo56218a() {
        return (C24424c) this.f56126a.get();
    }

    /* renamed from: a */
    public void mo56219a(C24424c cVar) {
        this.f56126a.set(cVar);
    }
}
