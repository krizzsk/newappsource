package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/KotshiCodecTypeJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/analytics/CodecType;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/k;", "", "", "intSetAdapter", "Lcom/squareup/moshi/k;", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.gm */
public final class C21723gm extends aed<C21663gc> {

    /* renamed from: a */
    private final C21420av<Set<Integer>> f54968a;

    /* renamed from: b */
    private final C21430ba.C21431a f54969b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21723gm(C21450bi biVar) {
        super("KotshiJsonAdapter(CodecType)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<Set<Integer>> a = biVar.mo54335a((Type) C21468bk.m51261a((Type) Set.class, Integer.class));
        C24362h.m61210e(a, "moshi.adapter(Types.newP…t::class.javaObjectType))");
        this.f54968a = a;
        C21430ba.C21431a a2 = C21430ba.C21431a.m51080a("mime_type", "colors");
        C24362h.m61210e(a2, "JsonReader.Options.of(\n …type\",\n      \"colors\"\n  )");
        this.f54969b = a2;
    }

    /* renamed from: b */
    public C21663gc mo54204a(C21430ba baVar) throws IOException {
        StringBuilder sb;
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C21663gc) baVar.mo54253l();
        }
        baVar.mo54246e();
        String str = null;
        Set set = null;
        while (baVar.mo54248g()) {
            int a = baVar.mo54236a(this.f54969b);
            if (a == -1) {
                baVar.mo54250i();
                baVar.mo54257p();
            } else if (a != 0) {
                if (a == 1) {
                    set = this.f54968a.mo54204a(baVar);
                }
            } else if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                baVar.mo54257p();
            } else {
                str = baVar.mo54251j();
            }
        }
        baVar.mo54247f();
        if (str == null) {
            sb = aec.m50903a((StringBuilder) null, "mime_type", (String) null, 2, (Object) null);
        } else {
            sb = null;
        }
        if (set == null) {
            sb = aec.m50903a(sb, "colors", (String) null, 2, (Object) null);
        }
        if (sb == null) {
            C24362h.m61208c(str);
            C24362h.m61208c(set);
            return new C21663gc(str, set);
        }
        sb.append(" (at path ");
        sb.append(baVar.mo54259r());
        sb.append(')');
        throw new C21426ax(sb.toString());
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C21663gc gcVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (gcVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("mime_type");
        bfVar.mo54272b(gcVar.mo54950a());
        bfVar.mo54269a("colors");
        this.f54968a.mo54205a(bfVar, gcVar.mo54951b());
        bfVar.mo54275d();
    }
}
