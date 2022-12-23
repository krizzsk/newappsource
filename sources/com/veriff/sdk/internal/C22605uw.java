package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/KotshiVerificationStatusJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lmobi/lab/veriff/data/api/request/response/VerificationStatus;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.uw */
public final class C22605uw extends aed<C22621vh> {

    /* renamed from: a */
    private final C21430ba.C21431a f57014a;

    public C22605uw() {
        super("KotshiJsonAdapter(VerificationStatus)");
        C21430ba.C21431a a = C21430ba.C21431a.m51080a("created", "started", "submitted", "preprocessed", "verification_tool_checks_dispatched", "resubmission_requested", "approved", "declined", "abandoned", "expired", "review", "completed", "unknown");
        C24362h.m61210e(a, "JsonReader.Options.of(\n …ted\",\n      \"unknown\"\n  )");
        this.f57014a = a;
    }

    /* renamed from: b */
    public C22621vh mo54204a(C21430ba baVar) throws IOException {
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C22621vh) baVar.mo54253l();
        }
        switch (baVar.mo54241b(this.f57014a)) {
            case 0:
                return C22621vh.created;
            case 1:
                return C22621vh.started;
            case 2:
                return C22621vh.submitted;
            case 3:
                return C22621vh.preprocessed;
            case 4:
                return C22621vh.verification_tool_checks_dispatched;
            case 5:
                return C22621vh.resubmission_requested;
            case 6:
                return C22621vh.approved;
            case 7:
                return C22621vh.declined;
            case 8:
                return C22621vh.abandoned;
            case 9:
                return C22621vh.expired;
            case 10:
                return C22621vh.review;
            case 11:
                return C22621vh.completed;
            case 12:
                return C22621vh.unknown;
            default:
                baVar.mo54257p();
                return C22621vh.unknown;
        }
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C22621vh vhVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (vhVar == null) {
            bfVar.mo54276e();
            return;
        }
        switch (C22606ux.f57015a[vhVar.ordinal()]) {
            case 1:
                bfVar.mo54272b("created");
                return;
            case 2:
                bfVar.mo54272b("started");
                return;
            case 3:
                bfVar.mo54272b("submitted");
                return;
            case 4:
                bfVar.mo54272b("preprocessed");
                return;
            case 5:
                bfVar.mo54272b("verification_tool_checks_dispatched");
                return;
            case 6:
                bfVar.mo54272b("resubmission_requested");
                return;
            case 7:
                bfVar.mo54272b("approved");
                return;
            case 8:
                bfVar.mo54272b("declined");
                return;
            case 9:
                bfVar.mo54272b("abandoned");
                return;
            case 10:
                bfVar.mo54272b("expired");
                return;
            case 11:
                bfVar.mo54272b("review");
                return;
            case 12:
                bfVar.mo54272b("completed");
                return;
            case 13:
                bfVar.mo54272b("unknown");
                return;
            default:
                return;
        }
    }
}
