package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import com.veriff.sdk.internal.C22561tq;
import java.io.IOException;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/KotshiInflowResponse_Mrz_ConfidenceJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Confidence;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/k;", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Confidence$Document;", "inflowResponseMrzConfidenceDocumentAdapter", "Lcom/squareup/moshi/k;", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Confidence$Person;", "inflowResponseMrzConfidencePersonAdapter", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.uh */
public final class C22590uh extends aed<C22561tq.C22566c.C22567a> {

    /* renamed from: a */
    private final C21420av<C22561tq.C22566c.C22567a.C22569b> f56983a;

    /* renamed from: b */
    private final C21420av<C22561tq.C22566c.C22567a.C22568a> f56984b;

    /* renamed from: c */
    private final C21430ba.C21431a f56985c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22590uh(C21450bi biVar) {
        super("KotshiJsonAdapter(InflowResponse.Mrz.Confidence)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<C22561tq.C22566c.C22567a.C22569b> a = biVar.mo54334a(C22561tq.C22566c.C22567a.C22569b.class);
        C24362h.m61210e(a, "moshi.adapter(InflowResp…on::class.javaObjectType)");
        this.f56983a = a;
        C21420av<C22561tq.C22566c.C22567a.C22568a> a2 = biVar.mo54334a(C22561tq.C22566c.C22567a.C22568a.class);
        C24362h.m61210e(a2, "moshi.adapter(InflowResp…nt::class.javaObjectType)");
        this.f56984b = a2;
        C21430ba.C21431a a3 = C21430ba.C21431a.m51080a("person", "document");
        C24362h.m61210e(a3, "JsonReader.Options.of(\n …on\",\n      \"document\"\n  )");
        this.f56985c = a3;
    }

    /* renamed from: b */
    public C22561tq.C22566c.C22567a mo54204a(C21430ba baVar) throws IOException {
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C22561tq.C22566c.C22567a) baVar.mo54253l();
        }
        baVar.mo54246e();
        C22561tq.C22566c.C22567a.C22569b bVar = null;
        C22561tq.C22566c.C22567a.C22568a aVar = null;
        while (baVar.mo54248g()) {
            int a = baVar.mo54236a(this.f56985c);
            if (a == -1) {
                baVar.mo54250i();
                baVar.mo54257p();
            } else if (a == 0) {
                bVar = this.f56983a.mo54204a(baVar);
            } else if (a == 1) {
                aVar = this.f56984b.mo54204a(baVar);
            }
        }
        baVar.mo54247f();
        return new C22561tq.C22566c.C22567a(bVar, aVar);
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C22561tq.C22566c.C22567a aVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (aVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("person");
        this.f56983a.mo54205a(bfVar, aVar.mo56791a());
        bfVar.mo54269a("document");
        this.f56984b.mo54205a(bfVar, aVar.mo56792b());
        bfVar.mo54275d();
    }
}
