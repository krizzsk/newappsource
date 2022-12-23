package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import com.veriff.sdk.internal.C21667gf;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/KotshiEvent_Additional_ClientDataJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$ClientData;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/k;", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "eventExperimentListAdapter", "Lcom/squareup/moshi/k;", "Lcom/veriff/sdk/internal/analytics/Event$ImplementationType;", "eventImplementationTypeAdapter", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.gy */
public final class C21735gy extends aed<C21667gf.C21668a.C21692j> {

    /* renamed from: a */
    private final C21420av<C21667gf.C21712e> f54993a;

    /* renamed from: b */
    private final C21420av<List<C21667gf.C21711d>> f54994b;

    /* renamed from: c */
    private final C21430ba.C21431a f54995c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21735gy(C21450bi biVar) {
        super("KotshiJsonAdapter(Event.Additional.ClientData)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<C21667gf.C21712e> a = biVar.mo54334a(C21667gf.C21712e.class);
        C24362h.m61210e(a, "moshi.adapter(Event.Impl…pe::class.javaObjectType)");
        this.f54993a = a;
        C21420av<List<C21667gf.C21711d>> a2 = biVar.mo54335a((Type) C21468bk.m51261a((Type) List.class, C21667gf.C21711d.class));
        C24362h.m61210e(a2, "moshi.adapter(Types.newP…t::class.javaObjectType))");
        this.f54994b = a2;
        C21430ba.C21431a a3 = C21430ba.C21431a.m51080a("implementationType", "sdkApiVersion", "appPackageName", "appVersionCode", "experiments", "veriff_sdk_version");
        C24362h.m61210e(a3, "JsonReader.Options.of(\n … \"veriff_sdk_version\"\n  )");
        this.f54995c = a3;
    }

    /* renamed from: b */
    public C21667gf.C21668a.C21692j mo54204a(C21430ba baVar) throws IOException {
        StringBuilder sb;
        C21430ba baVar2 = baVar;
        C24362h.m61211f(baVar2, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C21667gf.C21668a.C21692j) baVar.mo54253l();
        }
        baVar.mo54246e();
        boolean z = false;
        long j = 0;
        List<C21667gf.C21711d> list = null;
        C21667gf.C21712e eVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z2 = false;
        while (baVar.mo54248g()) {
            switch (baVar2.mo54236a(this.f54995c)) {
                case -1:
                    baVar.mo54250i();
                    baVar.mo54257p();
                    break;
                case 0:
                    eVar = this.f54993a.mo54204a(baVar2);
                    break;
                case 1:
                    if (baVar.mo54249h() != C21430ba.C21432b.NULL) {
                        str = baVar.mo54251j();
                        break;
                    } else {
                        baVar.mo54257p();
                        break;
                    }
                case 2:
                    if (baVar.mo54249h() != C21430ba.C21432b.NULL) {
                        str2 = baVar.mo54251j();
                        break;
                    } else {
                        baVar.mo54257p();
                        break;
                    }
                case 3:
                    if (baVar.mo54249h() != C21430ba.C21432b.NULL) {
                        j = baVar.mo54255n();
                        z = true;
                        break;
                    } else {
                        baVar.mo54257p();
                        break;
                    }
                case 4:
                    list = this.f54994b.mo54204a(baVar2);
                    z2 = true;
                    break;
                case 5:
                    if (baVar.mo54249h() != C21430ba.C21432b.NULL) {
                        str3 = baVar.mo54251j();
                        break;
                    } else {
                        baVar.mo54257p();
                        break;
                    }
            }
        }
        baVar.mo54247f();
        if (eVar == null) {
            sb = aec.m50903a((StringBuilder) null, "implementationType", (String) null, 2, (Object) null);
        } else {
            sb = null;
        }
        if (str == null) {
            sb = aec.m50903a(sb, "sdkApiVersion", (String) null, 2, (Object) null);
        }
        if (str2 == null) {
            sb = aec.m50903a(sb, "appPackageName", (String) null, 2, (Object) null);
        }
        if (!z) {
            sb = aec.m50903a(sb, "appVersionCode", (String) null, 2, (Object) null);
        }
        if (sb == null) {
            C24362h.m61208c(eVar);
            C24362h.m61208c(str);
            C24362h.m61208c(str2);
            C21667gf.C21668a.C21692j jVar = new C21667gf.C21668a.C21692j(eVar, str, str2, j, (List) null, (String) null, 48, (DefaultConstructorMarker) null);
            if (!z2) {
                list = jVar.mo55161e();
            }
            List<C21667gf.C21711d> list2 = list;
            if (str3 == null) {
                str3 = jVar.mo55163f();
            }
            return C21667gf.C21668a.C21692j.m52750a(jVar, (C21667gf.C21712e) null, (String) null, (String) null, 0, list2, str3, 15, (Object) null);
        }
        sb.append(" (at path ");
        sb.append(baVar.mo54259r());
        sb.append(')');
        throw new C21426ax(sb.toString());
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C21667gf.C21668a.C21692j jVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (jVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("implementationType");
        this.f54993a.mo54205a(bfVar, jVar.mo55157a());
        bfVar.mo54269a("sdkApiVersion");
        bfVar.mo54272b(jVar.mo55158b());
        bfVar.mo54269a("appPackageName");
        bfVar.mo54272b(jVar.mo55159c());
        bfVar.mo54269a("appVersionCode");
        bfVar.mo54266a(jVar.mo55160d());
        bfVar.mo54269a("experiments");
        this.f54994b.mo54205a(bfVar, jVar.mo55161e());
        bfVar.mo54269a("veriff_sdk_version");
        bfVar.mo54272b(jVar.mo55163f());
        bfVar.mo54275d();
    }
}
