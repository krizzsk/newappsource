package com.veriff.sdk.internal;

import com.appsflyer.ServerParameters;
import com.veriff.sdk.internal.C21430ba;
import com.veriff.sdk.internal.C21667gf;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/KotshiEvent_Additional_CountrySelectionJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$CountrySelection;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/k;", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "eventExperimentListAdapter", "Lcom/squareup/moshi/k;", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.hc */
public final class C21740hc extends aed<C21667gf.C21668a.C21696n> {

    /* renamed from: a */
    private final C21420av<List<C21667gf.C21711d>> f55004a;

    /* renamed from: b */
    private final C21430ba.C21431a f55005b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21740hc(C21450bi biVar) {
        super("KotshiJsonAdapter(Event.Additional.CountrySelection)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<List<C21667gf.C21711d>> a = biVar.mo54335a((Type) C21468bk.m51261a((Type) List.class, C21667gf.C21711d.class));
        C24362h.m61210e(a, "moshi.adapter(Types.newP…t::class.javaObjectType))");
        this.f55004a = a;
        C21430ba.C21431a a2 = C21430ba.C21431a.m51080a("preselected_country", "geoip_country", ServerParameters.COUNTRY, "preselected", "experiments", "veriff_sdk_version");
        C24362h.m61210e(a2, "JsonReader.Options.of(\n … \"veriff_sdk_version\"\n  )");
        this.f55005b = a2;
    }

    /* renamed from: b */
    public C21667gf.C21668a.C21696n mo54204a(C21430ba baVar) throws IOException {
        C21430ba baVar2 = baVar;
        C24362h.m61211f(baVar2, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C21667gf.C21668a.C21696n) baVar.mo54253l();
        }
        baVar.mo54246e();
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        List<C21667gf.C21711d> list = null;
        String str4 = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (baVar.mo54248g()) {
            switch (baVar2.mo54236a(this.f55005b)) {
                case -1:
                    baVar.mo54250i();
                    baVar.mo54257p();
                    break;
                case 0:
                    if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                        baVar.mo54257p();
                    } else {
                        str = baVar.mo54251j();
                    }
                    z = true;
                    break;
                case 1:
                    if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                        baVar.mo54257p();
                    } else {
                        str2 = baVar.mo54251j();
                    }
                    z2 = true;
                    break;
                case 2:
                    if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                        baVar.mo54257p();
                    } else {
                        str3 = baVar.mo54251j();
                    }
                    z3 = true;
                    break;
                case 3:
                    if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                        baVar.mo54257p();
                    } else {
                        bool = Boolean.valueOf(baVar.mo54252k());
                    }
                    z4 = true;
                    break;
                case 4:
                    list = this.f55004a.mo54204a(baVar2);
                    z5 = true;
                    break;
                case 5:
                    if (baVar.mo54249h() != C21430ba.C21432b.NULL) {
                        str4 = baVar.mo54251j();
                        break;
                    } else {
                        baVar.mo54257p();
                        break;
                    }
            }
        }
        baVar.mo54247f();
        C21667gf.C21668a.C21696n nVar = new C21667gf.C21668a.C21696n((String) null, (String) null, (String) null, (Boolean) null, (List) null, (String) null, 63, (DefaultConstructorMarker) null);
        if (!z) {
            str = nVar.mo55191a();
        }
        String str5 = str;
        if (!z2) {
            str2 = nVar.mo55192b();
        }
        String str6 = str2;
        if (!z3) {
            str3 = nVar.mo55193c();
        }
        String str7 = str3;
        if (!z4) {
            bool = nVar.mo55194d();
        }
        Boolean bool2 = bool;
        if (!z5) {
            list = nVar.mo55195e();
        }
        List<C21667gf.C21711d> list2 = list;
        if (str4 == null) {
            str4 = nVar.mo55197f();
        }
        return nVar.mo55190a(str5, str6, str7, bool2, list2, str4);
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C21667gf.C21668a.C21696n nVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (nVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("preselected_country");
        bfVar.mo54272b(nVar.mo55191a());
        bfVar.mo54269a("geoip_country");
        bfVar.mo54272b(nVar.mo55192b());
        bfVar.mo54269a(ServerParameters.COUNTRY);
        bfVar.mo54272b(nVar.mo55193c());
        bfVar.mo54269a("preselected");
        bfVar.mo54267a(nVar.mo55194d());
        bfVar.mo54269a("experiments");
        this.f55004a.mo54205a(bfVar, nVar.mo55195e());
        bfVar.mo54269a("veriff_sdk_version");
        bfVar.mo54272b(nVar.mo55197f());
        bfVar.mo54275d();
    }
}
