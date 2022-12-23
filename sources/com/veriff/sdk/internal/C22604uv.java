package com.veriff.sdk.internal;

import com.appsflyer.ServerParameters;
import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000e¨\u0006\u001a"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/KotshiVerificationSessionJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lmobi/lab/veriff/data/api/request/response/VerificationSession;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/k;", "Lmobi/lab/veriff/data/api/request/response/Document;", "documentAdapter", "Lcom/squareup/moshi/k;", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lmobi/lab/veriff/data/api/request/response/VerificationRejectionCategory;", "verificationRejectionCategoryAdapter", "Lmobi/lab/veriff/data/api/request/response/VerificationStatus;", "verificationStatusAdapter", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.uv */
public final class C22604uv extends aed<C22619vg> {

    /* renamed from: a */
    private final C21420av<C22621vh> f57010a;

    /* renamed from: b */
    private final C21420av<C22556tm> f57011b;

    /* renamed from: c */
    private final C21420av<C22617vf> f57012c;

    /* renamed from: d */
    private final C21430ba.C21431a f57013d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22604uv(C21450bi biVar) {
        super("KotshiJsonAdapter(VerificationSession)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<C22621vh> a = biVar.mo54334a(C22621vh.class);
        C24362h.m61210e(a, "moshi.adapter(Verificati…us::class.javaObjectType)");
        this.f57010a = a;
        C21420av<C22556tm> a2 = biVar.mo54334a(C22556tm.class);
        C24362h.m61210e(a2, "moshi.adapter(Document::class.javaObjectType)");
        this.f57011b = a2;
        C21420av<C22617vf> a3 = biVar.mo54334a(C22617vf.class);
        C24362h.m61210e(a3, "moshi.adapter(Verificati…ry::class.javaObjectType)");
        this.f57012c = a3;
        C21430ba.C21431a a4 = C21430ba.C21431a.m51080a("id", ServerParameters.STATUS, "document", "verificationRejectionCategory");
        C24362h.m61210e(a4, "JsonReader.Options.of(\n …ionRejectionCategory\"\n  )");
        this.f57013d = a4;
    }

    /* renamed from: b */
    public C22619vg mo54204a(C21430ba baVar) throws IOException {
        C21430ba baVar2 = baVar;
        C24362h.m61211f(baVar2, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C22619vg) baVar.mo54253l();
        }
        baVar.mo54246e();
        boolean z = false;
        String str = null;
        C22621vh vhVar = null;
        C22556tm tmVar = null;
        C22617vf vfVar = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (baVar.mo54248g()) {
            int a = baVar2.mo54236a(this.f57013d);
            if (a == -1) {
                baVar.mo54250i();
                baVar.mo54257p();
            } else if (a == 0) {
                if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                    baVar.mo54257p();
                } else {
                    str = baVar.mo54251j();
                }
                z = true;
            } else if (a == 1) {
                vhVar = this.f57010a.mo54204a(baVar2);
                z2 = true;
            } else if (a == 2) {
                tmVar = this.f57011b.mo54204a(baVar2);
                z3 = true;
            } else if (a == 3) {
                vfVar = this.f57012c.mo54204a(baVar2);
                z4 = true;
            }
        }
        baVar.mo54247f();
        C22619vg vgVar = new C22619vg((String) null, (C22621vh) null, (C22556tm) null, (C22617vf) null, 15, (DefaultConstructorMarker) null);
        if (!z) {
            str = vgVar.mo56957a();
        }
        if (!z2) {
            vhVar = vgVar.mo56958b();
        }
        if (!z3) {
            tmVar = vgVar.mo56959c();
        }
        if (!z4) {
            vfVar = vgVar.mo56960d();
        }
        return vgVar.mo56956a(str, vhVar, tmVar, vfVar);
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C22619vg vgVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (vgVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("id");
        bfVar.mo54272b(vgVar.mo56957a());
        bfVar.mo54269a(ServerParameters.STATUS);
        this.f57010a.mo54205a(bfVar, vgVar.mo56958b());
        bfVar.mo54269a("document");
        this.f57011b.mo54205a(bfVar, vgVar.mo56959c());
        bfVar.mo54269a("verificationRejectionCategory");
        this.f57012c.mo54205a(bfVar, vgVar.mo56960d());
        bfVar.mo54275d();
    }
}
