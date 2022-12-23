package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/KotshiResubmittedSessionJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lmobi/lab/veriff/data/api/request/response/ResubmittedSession;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.uo */
public final class C22597uo extends aed<C22607uy> {

    /* renamed from: a */
    private final C21430ba.C21431a f56995a;

    public C22597uo() {
        super("KotshiJsonAdapter(ResubmittedSession)");
        C21430ba.C21431a a = C21430ba.C21431a.m51080a("id", "reason", "reasonCode", "documentType");
        C24362h.m61210e(a, "JsonReader.Options.of(\n …\n      \"documentType\"\n  )");
        this.f56995a = a;
    }

    /* renamed from: b */
    public C22607uy mo54204a(C21430ba baVar) throws IOException {
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C22607uy) baVar.mo54253l();
        }
        baVar.mo54246e();
        String str = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        while (baVar.mo54248g()) {
            int a = baVar.mo54236a(this.f56995a);
            if (a == -1) {
                baVar.mo54250i();
                baVar.mo54257p();
            } else if (a != 0) {
                if (a != 1) {
                    if (a != 2) {
                        if (a == 3) {
                            if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                                baVar.mo54257p();
                            } else {
                                str3 = baVar.mo54251j();
                            }
                        }
                    } else if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                        baVar.mo54257p();
                    } else {
                        num = Integer.valueOf(baVar.mo54256o());
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
        return new C22607uy(str, str2, num, str3);
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C22607uy uyVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (uyVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("id");
        bfVar.mo54272b(uyVar.mo56889a());
        bfVar.mo54269a("reason");
        bfVar.mo54272b(uyVar.mo56890b());
        bfVar.mo54269a("reasonCode");
        bfVar.mo54268a((Number) uyVar.mo56891c());
        bfVar.mo54269a("documentType");
        bfVar.mo54272b(uyVar.mo56892d());
        bfVar.mo54275d();
    }
}
