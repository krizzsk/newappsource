package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/KotshiResolutionJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/data/Resolution;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.jf */
public final class C21872jf extends aed<C21886js> {

    /* renamed from: a */
    private final C21430ba.C21431a f55290a;

    public C21872jf() {
        super("KotshiJsonAdapter(Resolution)");
        C21430ba.C21431a a = C21430ba.C21431a.m51080a("360p", "480p", "720p", "1080p", "1440p", "2160p");
        C24362h.m61210e(a, "JsonReader.Options.of(\n …1440p\",\n      \"2160p\"\n  )");
        this.f55290a = a;
    }

    /* renamed from: b */
    public C21886js mo54204a(C21430ba baVar) throws IOException {
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C21886js) baVar.mo54253l();
        }
        int b = baVar.mo54241b(this.f55290a);
        if (b == 0) {
            return C21886js.R360P;
        }
        if (b == 1) {
            return C21886js.R480P;
        }
        if (b == 2) {
            return C21886js.R720P;
        }
        if (b == 3) {
            return C21886js.R1080P;
        }
        if (b == 4) {
            return C21886js.R1440P;
        }
        if (b == 5) {
            return C21886js.R2160P;
        }
        baVar.mo54257p();
        return C21886js.R1080P;
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C21886js jsVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (jsVar == null) {
            bfVar.mo54276e();
            return;
        }
        switch (C21873jg.f55291a[jsVar.ordinal()]) {
            case 1:
                bfVar.mo54272b("360p");
                return;
            case 2:
                bfVar.mo54272b("480p");
                return;
            case 3:
                bfVar.mo54272b("720p");
                return;
            case 4:
                bfVar.mo54272b("1080p");
                return;
            case 5:
                bfVar.mo54272b("1440p");
                return;
            case 6:
                bfVar.mo54272b("2160p");
                return;
            default:
                return;
        }
    }
}
