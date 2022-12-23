package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import com.veriff.sdk.internal.C21667gf;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/KotshiEvent_Additional_DocumentSelectionJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$DocumentSelection;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/k;", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "eventExperimentListAdapter", "Lcom/squareup/moshi/k;", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.hg */
public final class C21744hg extends aed<C21667gf.C21668a.C21700r> {

    /* renamed from: a */
    private final C21420av<List<C21667gf.C21711d>> f55014a;

    /* renamed from: b */
    private final C21430ba.C21431a f55015b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21744hg(C21450bi biVar) {
        super("KotshiJsonAdapter(Event.Additional.DocumentSelection)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<List<C21667gf.C21711d>> a = biVar.mo54335a((Type) C21468bk.m51261a((Type) List.class, C21667gf.C21711d.class));
        C24362h.m61210e(a, "moshi.adapter(Types.newP…t::class.javaObjectType))");
        this.f55014a = a;
        C21430ba.C21431a a2 = C21430ba.C21431a.m51080a("document", "preselected", "experiments", "veriff_sdk_version");
        C24362h.m61210e(a2, "JsonReader.Options.of(\n … \"veriff_sdk_version\"\n  )");
        this.f55015b = a2;
    }

    /* renamed from: b */
    public C21667gf.C21668a.C21700r mo54204a(C21430ba baVar) throws IOException {
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C21667gf.C21668a.C21700r) baVar.mo54253l();
        }
        baVar.mo54246e();
        boolean z = false;
        String str = null;
        Boolean bool = null;
        List<C21667gf.C21711d> list = null;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        while (baVar.mo54248g()) {
            int a = baVar.mo54236a(this.f55015b);
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
                if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                    baVar.mo54257p();
                } else {
                    bool = Boolean.valueOf(baVar.mo54252k());
                }
                z2 = true;
            } else if (a == 2) {
                list = this.f55014a.mo54204a(baVar);
                z3 = true;
            } else if (a == 3) {
                if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                    baVar.mo54257p();
                } else {
                    str2 = baVar.mo54251j();
                }
            }
        }
        baVar.mo54247f();
        C21667gf.C21668a.C21700r rVar = new C21667gf.C21668a.C21700r((String) null, (Boolean) null, (List) null, (String) null, 15, (DefaultConstructorMarker) null);
        if (!z) {
            str = rVar.mo55222a();
        }
        if (!z2) {
            bool = rVar.mo55223b();
        }
        if (!z3) {
            list = rVar.mo55224c();
        }
        if (str2 == null) {
            str2 = rVar.mo55225d();
        }
        return rVar.mo55221a(str, bool, list, str2);
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C21667gf.C21668a.C21700r rVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (rVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("document");
        bfVar.mo54272b(rVar.mo55222a());
        bfVar.mo54269a("preselected");
        bfVar.mo54267a(rVar.mo55223b());
        bfVar.mo54269a("experiments");
        this.f55014a.mo54205a(bfVar, rVar.mo55224c());
        bfVar.mo54269a("veriff_sdk_version");
        bfVar.mo54272b(rVar.mo55225d());
        bfVar.mo54275d();
    }
}
