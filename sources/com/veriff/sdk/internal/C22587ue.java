package com.veriff.sdk.internal;

import com.appsflyer.internal.referrer.Payload;
import com.veriff.sdk.internal.C21430ba;
import com.veriff.sdk.internal.C22561tq;
import java.io.IOException;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/KotshiInflowResponse_Feedback_Image_MeaningJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Feedback$Image$Meaning;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ue */
public final class C22587ue extends aed<C22561tq.C22563b.C22564a.C22565a> {

    /* renamed from: a */
    private final C21430ba.C21431a f56978a;

    public C22587ue() {
        super("KotshiJsonAdapter(InflowResponse.Feedback.Image.Meaning)");
        C21430ba.C21431a a = C21430ba.C21431a.m51080a(Payload.RESPONSE_OK, "NOK", "UNKNOWN");
        C24362h.m61210e(a, "JsonReader.Options.of(\n …NOK\",\n      \"UNKNOWN\"\n  )");
        this.f56978a = a;
    }

    /* renamed from: b */
    public C22561tq.C22563b.C22564a.C22565a mo54204a(C21430ba baVar) throws IOException {
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C22561tq.C22563b.C22564a.C22565a) baVar.mo54253l();
        }
        int b = baVar.mo54241b(this.f56978a);
        if (b == 0) {
            return C22561tq.C22563b.C22564a.C22565a.f56937a;
        }
        if (b == 1) {
            return C22561tq.C22563b.C22564a.C22565a.NOK;
        }
        if (b == 2) {
            return C22561tq.C22563b.C22564a.C22565a.UNKNOWN;
        }
        baVar.mo54257p();
        return C22561tq.C22563b.C22564a.C22565a.UNKNOWN;
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C22561tq.C22563b.C22564a.C22565a aVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (aVar == null) {
            bfVar.mo54276e();
            return;
        }
        int i = C22588uf.f56979a[aVar.ordinal()];
        if (i == 1) {
            bfVar.mo54272b(Payload.RESPONSE_OK);
        } else if (i == 2) {
            bfVar.mo54272b("NOK");
        } else if (i == 3) {
            bfVar.mo54272b("UNKNOWN");
        }
    }
}
