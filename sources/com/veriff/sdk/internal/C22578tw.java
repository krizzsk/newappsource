package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import com.veriff.sdk.internal.C22554tl;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/KotshiCountriesResponse_CountryDataJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lmobi/lab/veriff/data/api/request/response/CountriesResponse$CountryData;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/squareup/moshi/k;", "", "", "stringListAdapter", "Lcom/squareup/moshi/k;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.tw */
public final class C22578tw extends aed<C22554tl.C22555a> {

    /* renamed from: a */
    private final C21420av<List<String>> f56960a;

    /* renamed from: b */
    private final C21430ba.C21431a f56961b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22578tw(C21450bi biVar) {
        super("KotshiJsonAdapter(CountriesResponse.CountryData)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<List<String>> a = biVar.mo54335a((Type) C21468bk.m51261a((Type) List.class, String.class));
        C24362h.m61210e(a, "moshi.adapter(Types.newP…g::class.javaObjectType))");
        this.f56960a = a;
        C21430ba.C21431a a2 = C21430ba.C21431a.m51080a("code", "name", "documents", "matchIp");
        C24362h.m61210e(a2, "JsonReader.Options.of(\n …nts\",\n      \"matchIp\"\n  )");
        this.f56961b = a2;
    }

    /* renamed from: b */
    public C22554tl.C22555a mo54204a(C21430ba baVar) throws IOException {
        StringBuilder sb;
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C22554tl.C22555a) baVar.mo54253l();
        }
        baVar.mo54246e();
        boolean z = false;
        String str = null;
        String str2 = null;
        List list = null;
        boolean z2 = false;
        while (baVar.mo54248g()) {
            int a = baVar.mo54236a(this.f56961b);
            if (a == -1) {
                baVar.mo54250i();
                baVar.mo54257p();
            } else if (a != 0) {
                if (a != 1) {
                    if (a == 2) {
                        list = this.f56960a.mo54204a(baVar);
                    } else if (a == 3) {
                        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                            baVar.mo54257p();
                        } else {
                            z2 = baVar.mo54252k();
                            z = true;
                        }
                    }
                } else if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                    baVar.mo54257p();
                } else {
                    str2 = baVar.mo54251j();
                }
            } else if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                baVar.mo54257p();
            } else {
                str = baVar.mo54251j();
            }
        }
        baVar.mo54247f();
        if (str == null) {
            sb = aec.m50903a((StringBuilder) null, "code", (String) null, 2, (Object) null);
        } else {
            sb = null;
        }
        if (str2 == null) {
            sb = aec.m50903a(sb, "name", (String) null, 2, (Object) null);
        }
        if (list == null) {
            sb = aec.m50903a(sb, "documents", (String) null, 2, (Object) null);
        }
        if (sb == null) {
            C24362h.m61208c(str);
            C24362h.m61208c(str2);
            C24362h.m61208c(list);
            C22554tl.C22555a aVar = new C22554tl.C22555a(str, str2, list, false, 8, (DefaultConstructorMarker) null);
            if (!z) {
                z2 = aVar.mo56735d();
            }
            return C22554tl.C22555a.m54938a(aVar, (String) null, (String) null, (List) null, z2, 7, (Object) null);
        }
        sb.append(" (at path ");
        sb.append(baVar.mo54259r());
        sb.append(')');
        throw new C21426ax(sb.toString());
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C22554tl.C22555a aVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (aVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("code");
        bfVar.mo54272b(aVar.mo56732a());
        bfVar.mo54269a("name");
        bfVar.mo54272b(aVar.mo56733b());
        bfVar.mo54269a("documents");
        this.f56960a.mo54205a(bfVar, aVar.mo56734c());
        bfVar.mo54269a("matchIp");
        bfVar.mo54270a(aVar.mo56735d());
        bfVar.mo54275d();
    }
}
