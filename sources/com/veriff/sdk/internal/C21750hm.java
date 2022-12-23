package com.veriff.sdk.internal;

import com.appboy.models.MessageButton;
import com.veriff.sdk.internal.C21430ba;
import com.veriff.sdk.internal.C21667gf;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000f¨\u0006\u0019"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/KotshiEvent_Additional_FeedbackDetailsJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$FeedbackDetails;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/k;", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "eventExperimentListAdapter", "Lcom/squareup/moshi/k;", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "", "stringListAdapter", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.hm */
public final class C21750hm extends aed<C21667gf.C21668a.C21706x> {

    /* renamed from: a */
    private final C21420av<List<String>> f55030a;

    /* renamed from: b */
    private final C21420av<List<C21667gf.C21711d>> f55031b;

    /* renamed from: c */
    private final C21430ba.C21431a f55032c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21750hm(C21450bi biVar) {
        super("KotshiJsonAdapter(Event.Additional.FeedbackDetails)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<List<String>> a = biVar.mo54335a((Type) C21468bk.m51261a((Type) List.class, String.class));
        C24362h.m61210e(a, "moshi.adapter(Types.newP…g::class.javaObjectType))");
        this.f55030a = a;
        C21420av<List<C21667gf.C21711d>> a2 = biVar.mo54335a((Type) C21468bk.m51261a((Type) List.class, C21667gf.C21711d.class));
        C24362h.m61210e(a2, "moshi.adapter(Types.newP…t::class.javaObjectType))");
        this.f55031b = a2;
        C21430ba.C21431a a3 = C21430ba.C21431a.m51080a(MessageButton.TEXT, "canContinue", "failed", "delay", "experiments", "veriff_sdk_version");
        C24362h.m61210e(a3, "JsonReader.Options.of(\n … \"veriff_sdk_version\"\n  )");
        this.f55032c = a3;
    }

    /* renamed from: b */
    public C21667gf.C21668a.C21706x mo54204a(C21430ba baVar) throws IOException {
        StringBuilder sb;
        C21430ba baVar2 = baVar;
        C24362h.m61211f(baVar2, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C21667gf.C21668a.C21706x) baVar.mo54253l();
        }
        baVar.mo54246e();
        boolean z = false;
        String str = null;
        List list = null;
        Double d = null;
        List<C21667gf.C21711d> list2 = null;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        while (baVar.mo54248g()) {
            switch (baVar2.mo54236a(this.f55032c)) {
                case -1:
                    baVar.mo54250i();
                    baVar.mo54257p();
                    break;
                case 0:
                    if (baVar.mo54249h() != C21430ba.C21432b.NULL) {
                        str = baVar.mo54251j();
                        break;
                    } else {
                        baVar.mo54257p();
                        break;
                    }
                case 1:
                    if (baVar.mo54249h() != C21430ba.C21432b.NULL) {
                        z2 = baVar.mo54252k();
                        z = true;
                        break;
                    } else {
                        baVar.mo54257p();
                        break;
                    }
                case 2:
                    list = this.f55030a.mo54204a(baVar2);
                    break;
                case 3:
                    if (baVar.mo54249h() != C21430ba.C21432b.NULL) {
                        d = Double.valueOf(baVar.mo54254m());
                        break;
                    } else {
                        baVar.mo54257p();
                        break;
                    }
                case 4:
                    list2 = this.f55031b.mo54204a(baVar2);
                    z3 = true;
                    break;
                case 5:
                    if (baVar.mo54249h() != C21430ba.C21432b.NULL) {
                        str2 = baVar.mo54251j();
                        break;
                    } else {
                        baVar.mo54257p();
                        break;
                    }
            }
        }
        baVar.mo54247f();
        if (str == null) {
            sb = aec.m50903a((StringBuilder) null, MessageButton.TEXT, (String) null, 2, (Object) null);
        } else {
            sb = null;
        }
        if (!z) {
            sb = aec.m50903a(sb, "canContinue", (String) null, 2, (Object) null);
        }
        if (sb == null) {
            C24362h.m61208c(str);
            C21667gf.C21668a.C21706x xVar = new C21667gf.C21668a.C21706x(str, z2, list, d, (List) null, (String) null, 48, (DefaultConstructorMarker) null);
            if (!z3) {
                list2 = xVar.mo55272e();
            }
            List<C21667gf.C21711d> list3 = list2;
            if (str2 == null) {
                str2 = xVar.mo55274f();
            }
            return C21667gf.C21668a.C21706x.m52829a(xVar, (String) null, false, (List) null, (Double) null, list3, str2, 15, (Object) null);
        }
        sb.append(" (at path ");
        sb.append(baVar.mo54259r());
        sb.append(')');
        throw new C21426ax(sb.toString());
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C21667gf.C21668a.C21706x xVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (xVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a(MessageButton.TEXT);
        bfVar.mo54272b(xVar.mo55268a());
        bfVar.mo54269a("canContinue");
        bfVar.mo54270a(xVar.mo55269b());
        bfVar.mo54269a("failed");
        this.f55030a.mo54205a(bfVar, xVar.mo55270c());
        bfVar.mo54269a("delay");
        bfVar.mo54268a((Number) xVar.mo55271d());
        bfVar.mo54269a("experiments");
        this.f55031b.mo54205a(bfVar, xVar.mo55272e());
        bfVar.mo54269a("veriff_sdk_version");
        bfVar.mo54272b(xVar.mo55274f());
        bfVar.mo54275d();
    }
}
