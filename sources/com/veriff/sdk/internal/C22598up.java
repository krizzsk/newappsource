package com.veriff.sdk.internal;

import com.appsflyer.ServerParameters;
import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00180\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000eR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u000e¨\u0006 "}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/KotshiStartSessionResponseJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lmobi/lab/veriff/data/api/request/response/StartSessionResponse;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/k;", "Lmobi/lab/veriff/data/api/request/response/InitData;", "initDataAdapter", "Lcom/squareup/moshi/k;", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lmobi/lab/veriff/data/api/request/response/Strings;", "stringsAdapter", "Lmobi/lab/veriff/data/api/request/response/VendorIntegration;", "vendorIntegrationAdapter", "Lmobi/lab/veriff/data/api/request/response/VerificationSession;", "verificationSessionAdapter", "", "verificationSessionListAdapter", "Lmobi/lab/veriff/data/api/request/response/VerificationStatus;", "verificationStatusAdapter", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.up */
public final class C22598up extends aed<C22609uz> {

    /* renamed from: a */
    private final C21420av<C22621vh> f56996a;

    /* renamed from: b */
    private final C21420av<C22574ts> f56997b;

    /* renamed from: c */
    private final C21420av<C22616ve> f56998c;

    /* renamed from: d */
    private final C21420av<C22619vg> f56999d;

    /* renamed from: e */
    private final C21420av<List<C22619vg>> f57000e;

    /* renamed from: f */
    private final C21420av<C22613vc> f57001f;

    /* renamed from: g */
    private final C21430ba.C21431a f57002g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22598up(C21450bi biVar) {
        super("KotshiJsonAdapter(StartSessionResponse)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<C22621vh> a = biVar.mo54334a(C22621vh.class);
        C24362h.m61210e(a, "moshi.adapter(Verificati…us::class.javaObjectType)");
        this.f56996a = a;
        C21420av<C22574ts> a2 = biVar.mo54334a(C22574ts.class);
        C24362h.m61210e(a2, "moshi.adapter(InitData::class.javaObjectType)");
        this.f56997b = a2;
        C21420av<C22616ve> a3 = biVar.mo54334a(C22616ve.class);
        C24362h.m61210e(a3, "moshi.adapter(VendorInte…on::class.javaObjectType)");
        this.f56998c = a3;
        C21420av<C22619vg> a4 = biVar.mo54334a(C22619vg.class);
        C24362h.m61210e(a4, "moshi.adapter(Verificati…on::class.javaObjectType)");
        this.f56999d = a4;
        C21420av<List<C22619vg>> a5 = biVar.mo54335a((Type) C21468bk.m51261a((Type) List.class, C22619vg.class));
        C24362h.m61210e(a5, "moshi.adapter(Types.newP…n::class.javaObjectType))");
        this.f57000e = a5;
        C21420av<C22613vc> a6 = biVar.mo54334a(C22613vc.class);
        C24362h.m61210e(a6, "moshi.adapter(Strings::class.javaObjectType)");
        this.f57001f = a6;
        C21430ba.C21431a a7 = C21430ba.C21431a.m51080a("id", ServerParameters.STATUS, "initData", "vendorIntegration", "activeVerificationSession", "previousVerificationSessions", "activeProofOfAddressSession", "previousProofOfAddressSessions", "copyStrings");
        C24362h.m61210e(a7, "JsonReader.Options.of(\n …,\n      \"copyStrings\"\n  )");
        this.f57002g = a7;
    }

    /* renamed from: b */
    public C22609uz mo54204a(C21430ba baVar) throws IOException {
        String str;
        C21430ba baVar2 = baVar;
        C24362h.m61211f(baVar2, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C22609uz) baVar.mo54253l();
        }
        baVar.mo54246e();
        boolean z = false;
        String str2 = null;
        C22621vh vhVar = null;
        C22574ts tsVar = null;
        C22616ve veVar = null;
        C22619vg vgVar = null;
        List<C22619vg> list = null;
        C22619vg vgVar2 = null;
        List<C22619vg> list2 = null;
        C22613vc vcVar = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (baVar.mo54248g()) {
            String str3 = str2;
            switch (baVar2.mo54236a(this.f57002g)) {
                case -1:
                    baVar.mo54250i();
                    baVar.mo54257p();
                    break;
                case 0:
                    if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                        baVar.mo54257p();
                        str2 = str3;
                    } else {
                        str2 = baVar.mo54251j();
                    }
                    z = true;
                    continue;
                case 1:
                    vhVar = this.f56996a.mo54204a(baVar2);
                    str2 = str3;
                    z2 = true;
                    continue;
                case 2:
                    tsVar = this.f56997b.mo54204a(baVar2);
                    str2 = str3;
                    z3 = true;
                    continue;
                case 3:
                    veVar = this.f56998c.mo54204a(baVar2);
                    str2 = str3;
                    z4 = true;
                    continue;
                case 4:
                    vgVar = this.f56999d.mo54204a(baVar2);
                    str2 = str3;
                    z5 = true;
                    continue;
                case 5:
                    list = this.f57000e.mo54204a(baVar2);
                    str2 = str3;
                    z6 = true;
                    continue;
                case 6:
                    vgVar2 = this.f56999d.mo54204a(baVar2);
                    str2 = str3;
                    z7 = true;
                    continue;
                case 7:
                    list2 = this.f57000e.mo54204a(baVar2);
                    str2 = str3;
                    z8 = true;
                    continue;
                case 8:
                    vcVar = this.f57001f.mo54204a(baVar2);
                    str2 = str3;
                    z9 = true;
                    continue;
            }
            str2 = str3;
        }
        String str4 = str2;
        baVar.mo54247f();
        C22609uz uzVar = new C22609uz((String) null, (C22621vh) null, (C22574ts) null, (C22616ve) null, (C22619vg) null, (List) null, (C22619vg) null, (List) null, (C22613vc) null, 511, (DefaultConstructorMarker) null);
        if (z) {
            str = str4;
        } else {
            str = uzVar.mo56903a();
        }
        if (!z2) {
            vhVar = uzVar.mo56904b();
        }
        C22621vh vhVar2 = vhVar;
        if (!z3) {
            tsVar = uzVar.mo56905c();
        }
        C22574ts tsVar2 = tsVar;
        if (!z4) {
            veVar = uzVar.mo56906d();
        }
        C22616ve veVar2 = veVar;
        if (!z5) {
            vgVar = uzVar.mo56907e();
        }
        C22619vg vgVar3 = vgVar;
        if (!z6) {
            list = uzVar.mo56909f();
        }
        List<C22619vg> list3 = list;
        if (!z7) {
            vgVar2 = uzVar.mo56910g();
        }
        C22619vg vgVar4 = vgVar2;
        if (!z8) {
            list2 = uzVar.mo56911h();
        }
        List<C22619vg> list4 = list2;
        if (!z9) {
            vcVar = uzVar.mo56913i();
        }
        return uzVar.mo56902a(str, vhVar2, tsVar2, veVar2, vgVar3, list3, vgVar4, list4, vcVar);
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C22609uz uzVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (uzVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("id");
        bfVar.mo54272b(uzVar.mo56903a());
        bfVar.mo54269a(ServerParameters.STATUS);
        this.f56996a.mo54205a(bfVar, uzVar.mo56904b());
        bfVar.mo54269a("initData");
        this.f56997b.mo54205a(bfVar, uzVar.mo56905c());
        bfVar.mo54269a("vendorIntegration");
        this.f56998c.mo54205a(bfVar, uzVar.mo56906d());
        bfVar.mo54269a("activeVerificationSession");
        this.f56999d.mo54205a(bfVar, uzVar.mo56907e());
        bfVar.mo54269a("previousVerificationSessions");
        this.f57000e.mo54205a(bfVar, uzVar.mo56909f());
        bfVar.mo54269a("activeProofOfAddressSession");
        this.f56999d.mo54205a(bfVar, uzVar.mo56910g());
        bfVar.mo54269a("previousProofOfAddressSessions");
        this.f57000e.mo54205a(bfVar, uzVar.mo56911h());
        bfVar.mo54269a("copyStrings");
        this.f57001f.mo54205a(bfVar, uzVar.mo56913i());
        bfVar.mo54275d();
    }
}
