package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import com.veriff.sdk.internal.C21667gf;
import java.io.IOException;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/KotshiEvent_NfcDisabledReasonJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/analytics/Event$NfcDisabledReason;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ik */
public final class C21775ik extends aed<C21667gf.C21713f> {

    /* renamed from: a */
    private final C21430ba.C21431a f55081a;

    public C21775ik() {
        super("KotshiJsonAdapter(Event.NfcDisabledReason)");
        C21430ba.C21431a a = C21430ba.C21431a.m51080a("flag_disabled", "country_unsupported", "document_unsupported", "device_unsupported", "app_unsupported");
        C24362h.m61210e(a, "JsonReader.Options.of(\n …    \"app_unsupported\"\n  )");
        this.f55081a = a;
    }

    /* renamed from: b */
    public C21667gf.C21713f mo54204a(C21430ba baVar) throws IOException {
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C21667gf.C21713f) baVar.mo54253l();
        }
        int b = baVar.mo54241b(this.f55081a);
        if (b == 0) {
            return C21667gf.C21713f.flag_disabled;
        }
        if (b == 1) {
            return C21667gf.C21713f.country_unsupported;
        }
        if (b == 2) {
            return C21667gf.C21713f.document_unsupported;
        }
        if (b == 3) {
            return C21667gf.C21713f.device_unsupported;
        }
        if (b == 4) {
            return C21667gf.C21713f.app_unsupported;
        }
        StringBuilder k = C13555b.m33972k("Expected one of [flag_disabled, country_unsupported, document_unsupported, device_unsupported, app_unsupported] but was ");
        k.append(baVar.mo54251j());
        k.append(" at path ");
        k.append(baVar.mo54259r());
        throw new C21426ax(k.toString());
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C21667gf.C21713f fVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (fVar == null) {
            bfVar.mo54276e();
            return;
        }
        int i = C21776il.f55082a[fVar.ordinal()];
        if (i == 1) {
            bfVar.mo54272b("flag_disabled");
        } else if (i == 2) {
            bfVar.mo54272b("country_unsupported");
        } else if (i == 3) {
            bfVar.mo54272b("document_unsupported");
        } else if (i == 4) {
            bfVar.mo54272b("device_unsupported");
        } else if (i == 5) {
            bfVar.mo54272b("app_unsupported");
        }
    }
}
