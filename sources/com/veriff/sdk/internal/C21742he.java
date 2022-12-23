package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import com.veriff.sdk.internal.C21667gf;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000f¨\u0006\u0019"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/KotshiEvent_Additional_DecisionReceivedJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$DecisionReceived;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/k;", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "eventExperimentListAdapter", "Lcom/squareup/moshi/k;", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lmobi/lab/veriff/data/api/request/response/VerificationStatus;", "verificationStatusAdapter", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.he */
public final class C21742he extends aed<C21667gf.C21668a.C21698p> {

    /* renamed from: a */
    private final C21420av<C22621vh> f55008a;

    /* renamed from: b */
    private final C21420av<List<C21667gf.C21711d>> f55009b;

    /* renamed from: c */
    private final C21430ba.C21431a f55010c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21742he(C21450bi biVar) {
        super("KotshiJsonAdapter(Event.Additional.DecisionReceived)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<C22621vh> a = biVar.mo54334a(C22621vh.class);
        C24362h.m61210e(a, "moshi.adapter(Verificati…us::class.javaObjectType)");
        this.f55008a = a;
        C21420av<List<C21667gf.C21711d>> a2 = biVar.mo54335a((Type) C21468bk.m51261a((Type) List.class, C21667gf.C21711d.class));
        C24362h.m61210e(a2, "moshi.adapter(Types.newP…t::class.javaObjectType))");
        this.f55009b = a2;
        C21430ba.C21431a a3 = C21430ba.C21431a.m51080a("decision", "experiments", "veriff_sdk_version");
        C24362h.m61210e(a3, "JsonReader.Options.of(\n … \"veriff_sdk_version\"\n  )");
        this.f55010c = a3;
    }

    /* renamed from: b */
    public C21667gf.C21668a.C21698p mo54204a(C21430ba baVar) throws IOException {
        C21430ba baVar2 = baVar;
        C24362h.m61211f(baVar2, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C21667gf.C21668a.C21698p) baVar.mo54253l();
        }
        boolean z = false;
        baVar.mo54246e();
        StringBuilder sb = null;
        C22621vh vhVar = null;
        List<C21667gf.C21711d> list = null;
        String str = null;
        while (baVar.mo54248g()) {
            int a = baVar2.mo54236a(this.f55010c);
            if (a == -1) {
                baVar.mo54250i();
                baVar.mo54257p();
            } else if (a == 0) {
                vhVar = this.f55008a.mo54204a(baVar2);
            } else if (a == 1) {
                list = this.f55009b.mo54204a(baVar2);
                z = true;
            } else if (a == 2) {
                if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                    baVar.mo54257p();
                } else {
                    str = baVar.mo54251j();
                }
            }
        }
        baVar.mo54247f();
        if (vhVar == null) {
            sb = aec.m50903a((StringBuilder) null, "decision", (String) null, 2, (Object) null);
        }
        if (sb == null) {
            C24362h.m61208c(vhVar);
            C21667gf.C21668a.C21698p pVar = new C21667gf.C21668a.C21698p(vhVar, (List) null, (String) null, 6, (DefaultConstructorMarker) null);
            if (!z) {
                list = pVar.mo55209b();
            }
            List<C21667gf.C21711d> list2 = list;
            if (str == null) {
                str = pVar.mo55210c();
            }
            return C21667gf.C21668a.C21698p.m52788a(pVar, (C22621vh) null, list2, str, 1, (Object) null);
        }
        sb.append(" (at path ");
        sb.append(baVar.mo54259r());
        sb.append(')');
        throw new C21426ax(sb.toString());
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C21667gf.C21668a.C21698p pVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (pVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("decision");
        this.f55008a.mo54205a(bfVar, pVar.mo55208a());
        bfVar.mo54269a("experiments");
        this.f55009b.mo54205a(bfVar, pVar.mo55209b());
        bfVar.mo54269a("veriff_sdk_version");
        bfVar.mo54272b(pVar.mo55210c());
        bfVar.mo54275d();
    }
}
