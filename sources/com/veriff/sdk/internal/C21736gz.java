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

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/KotshiEvent_Additional_ConsentApprovedJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$ConsentApproved;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/k;", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "eventExperimentListAdapter", "Lcom/squareup/moshi/k;", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.gz */
public final class C21736gz extends aed<C21667gf.C21668a.C21693k> {

    /* renamed from: a */
    private final C21420av<List<C21667gf.C21711d>> f54996a;

    /* renamed from: b */
    private final C21430ba.C21431a f54997b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21736gz(C21450bi biVar) {
        super("KotshiJsonAdapter(Event.Additional.ConsentApproved)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<List<C21667gf.C21711d>> a = biVar.mo54335a((Type) C21468bk.m51261a((Type) List.class, C21667gf.C21711d.class));
        C24362h.m61210e(a, "moshi.adapter(Types.newP…t::class.javaObjectType))");
        this.f54996a = a;
        C21430ba.C21431a a2 = C21430ba.C21431a.m51080a(ServerParameters.COUNTRY, "state", "experiments", "veriff_sdk_version");
        C24362h.m61210e(a2, "JsonReader.Options.of(\n … \"veriff_sdk_version\"\n  )");
        this.f54997b = a2;
    }

    /* renamed from: b */
    public C21667gf.C21668a.C21693k mo54204a(C21430ba baVar) throws IOException {
        C21430ba baVar2 = baVar;
        C24362h.m61211f(baVar2, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C21667gf.C21668a.C21693k) baVar.mo54253l();
        }
        boolean z = false;
        baVar.mo54246e();
        String str = null;
        String str2 = null;
        List<C21667gf.C21711d> list = null;
        String str3 = null;
        while (baVar.mo54248g()) {
            int a = baVar2.mo54236a(this.f54997b);
            if (a == -1) {
                baVar.mo54250i();
                baVar.mo54257p();
            } else if (a != 0) {
                if (a != 1) {
                    if (a == 2) {
                        list = this.f54996a.mo54204a(baVar2);
                        z = true;
                    } else if (a == 3) {
                        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                            baVar.mo54257p();
                        } else {
                            str3 = baVar.mo54251j();
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
        C21667gf.C21668a.C21693k kVar = new C21667gf.C21668a.C21693k(str, str2, (List) null, (String) null, 12, (DefaultConstructorMarker) null);
        if (!z) {
            list = kVar.mo55169c();
        }
        List<C21667gf.C21711d> list2 = list;
        if (str3 == null) {
            str3 = kVar.mo55170d();
        }
        return C21667gf.C21668a.C21693k.m52758a(kVar, (String) null, (String) null, list2, str3, 3, (Object) null);
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C21667gf.C21668a.C21693k kVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (kVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a(ServerParameters.COUNTRY);
        bfVar.mo54272b(kVar.mo55167a());
        bfVar.mo54269a("state");
        bfVar.mo54272b(kVar.mo55168b());
        bfVar.mo54269a("experiments");
        this.f54996a.mo54205a(bfVar, kVar.mo55169c());
        bfVar.mo54269a("veriff_sdk_version");
        bfVar.mo54272b(kVar.mo55170d());
        bfVar.mo54275d();
    }
}
