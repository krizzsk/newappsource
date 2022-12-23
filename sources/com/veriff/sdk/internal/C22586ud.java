package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import com.veriff.sdk.internal.C22561tq;
import java.io.IOException;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/KotshiInflowResponse_Feedback_ImageJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Feedback$Image;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/k;", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Feedback$Image$Meaning;", "inflowResponseFeedbackImageMeaningAdapter", "Lcom/squareup/moshi/k;", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ud */
public final class C22586ud extends aed<C22561tq.C22563b.C22564a> {

    /* renamed from: a */
    private final C21420av<C22561tq.C22563b.C22564a.C22565a> f56976a;

    /* renamed from: b */
    private final C21430ba.C21431a f56977b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22586ud(C21450bi biVar) {
        super("KotshiJsonAdapter(InflowResponse.Feedback.Image)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<C22561tq.C22563b.C22564a.C22565a> a = biVar.mo54334a(C22561tq.C22563b.C22564a.C22565a.class);
        C24362h.m61210e(a, "moshi.adapter(InflowResp…ng::class.javaObjectType)");
        this.f56976a = a;
        C21430ba.C21431a a2 = C21430ba.C21431a.m51080a("path", "meaning");
        C24362h.m61210e(a2, "JsonReader.Options.of(\n …ath\",\n      \"meaning\"\n  )");
        this.f56977b = a2;
    }

    /* renamed from: b */
    public C22561tq.C22563b.C22564a mo54204a(C21430ba baVar) throws IOException {
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C22561tq.C22563b.C22564a) baVar.mo54253l();
        }
        baVar.mo54246e();
        String str = null;
        C22561tq.C22563b.C22564a.C22565a aVar = null;
        while (baVar.mo54248g()) {
            int a = baVar.mo54236a(this.f56977b);
            if (a == -1) {
                baVar.mo54250i();
                baVar.mo54257p();
            } else if (a != 0) {
                if (a == 1) {
                    aVar = this.f56976a.mo54204a(baVar);
                }
            } else if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                baVar.mo54257p();
            } else {
                str = baVar.mo54251j();
            }
        }
        baVar.mo54247f();
        return new C22561tq.C22563b.C22564a(str, aVar);
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C22561tq.C22563b.C22564a aVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (aVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("path");
        bfVar.mo54272b(aVar.mo56778a());
        bfVar.mo54269a("meaning");
        this.f56976a.mo54205a(bfVar, aVar.mo56779b());
        bfVar.mo54275d();
    }
}
