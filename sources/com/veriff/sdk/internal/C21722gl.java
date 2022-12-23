package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/KotshiCodecInfoJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/analytics/CodecInfo;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/k;", "", "Lcom/veriff/sdk/internal/analytics/CodecType;", "codecTypeListAdapter", "Lcom/squareup/moshi/k;", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.gl */
public final class C21722gl extends aed<C21662gb> {

    /* renamed from: a */
    private final C21420av<List<C21663gc>> f54966a;

    /* renamed from: b */
    private final C21430ba.C21431a f54967b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21722gl(C21450bi biVar) {
        super("KotshiJsonAdapter(CodecInfo)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<List<C21663gc>> a = biVar.mo54335a((Type) C21468bk.m51261a((Type) List.class, C21663gc.class));
        C24362h.m61210e(a, "moshi.adapter(Types.newP…e::class.javaObjectType))");
        this.f54966a = a;
        C21430ba.C21431a a2 = C21430ba.C21431a.m51080a("name", "types");
        C24362h.m61210e(a2, "JsonReader.Options.of(\n …\"name\",\n      \"types\"\n  )");
        this.f54967b = a2;
    }

    /* renamed from: b */
    public C21662gb mo54204a(C21430ba baVar) throws IOException {
        StringBuilder sb;
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C21662gb) baVar.mo54253l();
        }
        baVar.mo54246e();
        String str = null;
        List list = null;
        while (baVar.mo54248g()) {
            int a = baVar.mo54236a(this.f54967b);
            if (a == -1) {
                baVar.mo54250i();
                baVar.mo54257p();
            } else if (a != 0) {
                if (a == 1) {
                    list = this.f54966a.mo54204a(baVar);
                }
            } else if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                baVar.mo54257p();
            } else {
                str = baVar.mo54251j();
            }
        }
        baVar.mo54247f();
        if (str == null) {
            sb = aec.m50903a((StringBuilder) null, "name", (String) null, 2, (Object) null);
        } else {
            sb = null;
        }
        if (list == null) {
            sb = aec.m50903a(sb, "types", (String) null, 2, (Object) null);
        }
        if (sb == null) {
            C24362h.m61208c(str);
            C24362h.m61208c(list);
            return new C21662gb(str, list);
        }
        sb.append(" (at path ");
        sb.append(baVar.mo54259r());
        sb.append(')');
        throw new C21426ax(sb.toString());
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C21662gb gbVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (gbVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("name");
        bfVar.mo54272b(gbVar.mo54945a());
        bfVar.mo54269a("types");
        this.f54966a.mo54205a(bfVar, gbVar.mo54946b());
        bfVar.mo54275d();
    }
}
