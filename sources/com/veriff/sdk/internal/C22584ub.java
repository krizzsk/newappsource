package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import com.veriff.sdk.internal.C22561tq;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000e¨\u0006\u001b"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/KotshiInflowResponseJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lmobi/lab/veriff/data/api/request/response/InflowResponse;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/k;", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Feedback;", "inflowResponseFeedbackAdapter", "Lcom/squareup/moshi/k;", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz;", "inflowResponseMrzAdapter", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "", "", "stringListAdapter", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ub */
public final class C22584ub extends aed<C22561tq> {

    /* renamed from: a */
    private final C21420av<List<String>> f56970a;

    /* renamed from: b */
    private final C21420av<C22561tq.C22563b> f56971b;

    /* renamed from: c */
    private final C21420av<C22561tq.C22566c> f56972c;

    /* renamed from: d */
    private final C21430ba.C21431a f56973d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22584ub(C21450bi biVar) {
        super("KotshiJsonAdapter(InflowResponse)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<List<String>> a = biVar.mo54335a((Type) C21468bk.m51261a((Type) List.class, String.class));
        C24362h.m61210e(a, "moshi.adapter(Types.newP…g::class.javaObjectType))");
        this.f56970a = a;
        C21420av<C22561tq.C22563b> a2 = biVar.mo54334a(C22561tq.C22563b.class);
        C24362h.m61210e(a2, "moshi.adapter(InflowResp…ck::class.javaObjectType)");
        this.f56971b = a2;
        C21420av<C22561tq.C22566c> a3 = biVar.mo54334a(C22561tq.C22566c.class);
        C24362h.m61210e(a3, "moshi.adapter(InflowResp…rz::class.javaObjectType)");
        this.f56972c = a3;
        C21430ba.C21431a a4 = C21430ba.C21431a.m51080a(WidgetMessageParser.KEY_SUCCESS, "failed", "feedback", "mrz");
        C24362h.m61210e(a4, "JsonReader.Options.of(\n …eedback\",\n      \"mrz\"\n  )");
        this.f56973d = a4;
    }

    /* renamed from: b */
    public C22561tq mo54204a(C21430ba baVar) throws IOException {
        C21430ba baVar2 = baVar;
        C24362h.m61211f(baVar2, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C22561tq) baVar.mo54253l();
        }
        baVar.mo54246e();
        List<String> list = null;
        C22561tq.C22563b bVar = null;
        C22561tq.C22566c cVar = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (baVar.mo54248g()) {
            int a = baVar2.mo54236a(this.f56973d);
            if (a == -1) {
                baVar.mo54250i();
                baVar.mo54257p();
            } else if (a != 0) {
                if (a == 1) {
                    list = this.f56970a.mo54204a(baVar2);
                    z3 = true;
                } else if (a == 2) {
                    bVar = this.f56971b.mo54204a(baVar2);
                    z4 = true;
                } else if (a == 3) {
                    cVar = this.f56972c.mo54204a(baVar2);
                    z5 = true;
                }
            } else if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                baVar.mo54257p();
            } else {
                z2 = baVar.mo54252k();
                z = true;
            }
        }
        baVar.mo54247f();
        C22561tq tqVar = new C22561tq(false, (List) null, (C22561tq.C22563b) null, (C22561tq.C22566c) null, 15, (DefaultConstructorMarker) null);
        if (!z) {
            z2 = tqVar.mo56763b();
        }
        if (!z3) {
            list = tqVar.mo56764c();
        }
        if (!z4) {
            bVar = tqVar.mo56765d();
        }
        if (!z5) {
            cVar = tqVar.mo56766e();
        }
        return tqVar.mo56761a(z2, list, bVar, cVar);
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C22561tq tqVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (tqVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a(WidgetMessageParser.KEY_SUCCESS);
        bfVar.mo54270a(tqVar.mo56763b());
        bfVar.mo54269a("failed");
        this.f56970a.mo54205a(bfVar, tqVar.mo56764c());
        bfVar.mo54269a("feedback");
        this.f56971b.mo54205a(bfVar, tqVar.mo56765d());
        bfVar.mo54269a("mrz");
        this.f56972c.mo54205a(bfVar, tqVar.mo56766e());
        bfVar.mo54275d();
    }
}
