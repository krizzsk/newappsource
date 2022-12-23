package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\r"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/KotshiEmptyResponseJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lmobi/lab/veriff/data/api/request/response/EmptyResponse;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ty */
public final class C22580ty extends aed<C22558tn> {
    public C22580ty() {
        super("KotshiJsonAdapter(EmptyResponse)");
    }

    /* renamed from: b */
    public C22558tn mo54204a(C21430ba baVar) throws IOException {
        C24362h.m61211f(baVar, "reader");
        C21430ba.C21432b h = baVar.mo54249h();
        if (h != null) {
            int i = C22581tz.f56963a[h.ordinal()];
            if (i == 1) {
                return (C22558tn) baVar.mo54253l();
            }
            if (i == 2) {
                baVar.mo54257p();
                return C22558tn.f56922a;
            }
        }
        StringBuilder k = C13555b.m33972k("Expected BEGIN_OBJECT but was ");
        k.append(baVar.mo54249h());
        k.append(" at path ");
        k.append(baVar.mo54259r());
        throw new C21426ax(k.toString());
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C22558tn tnVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (tnVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54275d();
    }
}
