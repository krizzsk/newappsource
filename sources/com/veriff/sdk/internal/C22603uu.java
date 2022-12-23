package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/KotshiVerificationRejectionCategoryJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lmobi/lab/veriff/data/api/request/response/VerificationRejectionCategory;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.uu */
public final class C22603uu extends aed<C22617vf> {

    /* renamed from: a */
    private final C21430ba.C21431a f57009a;

    public C22603uu() {
        super("KotshiJsonAdapter(VerificationRejectionCategory)");
        C21430ba.C21431a a = C21430ba.C21431a.m51080a("code", "value");
        C24362h.m61210e(a, "JsonReader.Options.of(\n …\"code\",\n      \"value\"\n  )");
        this.f57009a = a;
    }

    /* renamed from: b */
    public C22617vf mo54204a(C21430ba baVar) throws IOException {
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C22617vf) baVar.mo54253l();
        }
        baVar.mo54246e();
        boolean z = false;
        Integer num = null;
        String str = null;
        boolean z2 = false;
        while (baVar.mo54248g()) {
            int a = baVar.mo54236a(this.f57009a);
            if (a == -1) {
                baVar.mo54250i();
                baVar.mo54257p();
            } else if (a == 0) {
                if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                    baVar.mo54257p();
                } else {
                    num = Integer.valueOf(baVar.mo54256o());
                }
                z = true;
            } else if (a == 1) {
                if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                    baVar.mo54257p();
                } else {
                    str = baVar.mo54251j();
                }
                z2 = true;
            }
        }
        baVar.mo54247f();
        C22617vf vfVar = new C22617vf((Integer) null, (String) null, 3, (DefaultConstructorMarker) null);
        if (!z) {
            num = vfVar.mo56945a();
        }
        if (!z2) {
            str = vfVar.mo56946b();
        }
        return vfVar.mo56944a(num, str);
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C22617vf vfVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (vfVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("code");
        bfVar.mo54268a((Number) vfVar.mo56945a());
        bfVar.mo54269a("value");
        bfVar.mo54272b(vfVar.mo56946b());
        bfVar.mo54275d();
    }
}
