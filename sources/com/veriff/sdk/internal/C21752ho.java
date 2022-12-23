package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import com.veriff.sdk.internal.C21667gf;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/KotshiEvent_Additional_LanguageAssignedJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$LanguageAssigned;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/k;", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "eventExperimentListAdapter", "Lcom/squareup/moshi/k;", "Lcom/veriff/sdk/internal/analytics/Event$PreselectedType;", "eventPreselectedTypeAdapter", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ho */
public final class C21752ho extends aed<C21667gf.C21668a.C21708z> {

    /* renamed from: a */
    private final C21420av<C21667gf.C21714g> f55036a;

    /* renamed from: b */
    private final C21420av<List<C21667gf.C21711d>> f55037b;

    /* renamed from: c */
    private final C21430ba.C21431a f55038c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21752ho(C21450bi biVar) {
        super("KotshiJsonAdapter(Event.Additional.LanguageAssigned)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<C21667gf.C21714g> a = biVar.mo54334a(C21667gf.C21714g.class);
        C24362h.m61210e(a, "moshi.adapter(Event.Pres…pe::class.javaObjectType)");
        this.f55036a = a;
        C21420av<List<C21667gf.C21711d>> a2 = biVar.mo54335a((Type) C21468bk.m51261a((Type) List.class, C21667gf.C21711d.class));
        C24362h.m61210e(a2, "moshi.adapter(Types.newP…t::class.javaObjectType))");
        this.f55037b = a2;
        C21430ba.C21431a a3 = C21430ba.C21431a.m51080a("language", "preselected", "preselected_type", "experiments", "veriff_sdk_version");
        C24362h.m61210e(a3, "JsonReader.Options.of(\n … \"veriff_sdk_version\"\n  )");
        this.f55038c = a3;
    }

    /* renamed from: b */
    public C21667gf.C21668a.C21708z mo54204a(C21430ba baVar) throws IOException {
        StringBuilder sb;
        C21430ba baVar2 = baVar;
        C24362h.m61211f(baVar2, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C21667gf.C21668a.C21708z) baVar.mo54253l();
        }
        baVar.mo54246e();
        boolean z = false;
        String str = null;
        C21667gf.C21714g gVar = null;
        List<C21667gf.C21711d> list = null;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        while (baVar.mo54248g()) {
            int a = baVar2.mo54236a(this.f55038c);
            if (a == -1) {
                baVar.mo54250i();
                baVar.mo54257p();
            } else if (a != 0) {
                if (a != 1) {
                    if (a == 2) {
                        gVar = this.f55036a.mo54204a(baVar2);
                    } else if (a == 3) {
                        list = this.f55037b.mo54204a(baVar2);
                        z3 = true;
                    } else if (a == 4) {
                        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                            baVar.mo54257p();
                        } else {
                            str2 = baVar.mo54251j();
                        }
                    }
                } else if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                    baVar.mo54257p();
                } else {
                    z2 = baVar.mo54252k();
                    z = true;
                }
            } else if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                baVar.mo54257p();
            } else {
                str = baVar.mo54251j();
            }
        }
        baVar.mo54247f();
        if (str == null) {
            sb = aec.m50903a((StringBuilder) null, "language", (String) null, 2, (Object) null);
        } else {
            sb = null;
        }
        if (!z) {
            sb = aec.m50903a(sb, "preselected", (String) null, 2, (Object) null);
        }
        if (sb == null) {
            C24362h.m61208c(str);
            C21667gf.C21668a.C21708z zVar = new C21667gf.C21668a.C21708z(str, z2, gVar, (List) null, (String) null, 24, (DefaultConstructorMarker) null);
            if (!z3) {
                list = zVar.mo55289d();
            }
            List<C21667gf.C21711d> list2 = list;
            if (str2 == null) {
                str2 = zVar.mo55290e();
            }
            return C21667gf.C21668a.C21708z.m52843a(zVar, (String) null, false, (C21667gf.C21714g) null, list2, str2, 7, (Object) null);
        }
        sb.append(" (at path ");
        sb.append(baVar.mo54259r());
        sb.append(')');
        throw new C21426ax(sb.toString());
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C21667gf.C21668a.C21708z zVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (zVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("language");
        bfVar.mo54272b(zVar.mo55286a());
        bfVar.mo54269a("preselected");
        bfVar.mo54270a(zVar.mo55287b());
        bfVar.mo54269a("preselected_type");
        this.f55036a.mo54205a(bfVar, zVar.mo55288c());
        bfVar.mo54269a("experiments");
        this.f55037b.mo54205a(bfVar, zVar.mo55289d());
        bfVar.mo54269a("veriff_sdk_version");
        bfVar.mo54272b(zVar.mo55290e());
        bfVar.mo54275d();
    }
}
