package com.veriff.sdk.internal;

import com.appsflyer.ServerParameters;
import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/KotshiPageJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/analytics/Page;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.iq */
public final class C21781iq extends aed<C21783is> {

    /* renamed from: a */
    private final C21430ba.C21431a f55087a;

    public C21781iq() {
        super("KotshiJsonAdapter(Page)");
        C21430ba.C21431a a = C21430ba.C21431a.m51080a("intro", "document", ServerParameters.COUNTRY, "portrait_instructions", "portrait", "portrait_preview", "passport_instructions", "passport", "passport_preview", "document_front_instructions", "document_front", "document_front_preview", "document_back_instructions", "document_back", "document_back_preview", "document_and_face_instructions", "document_and_face", "document_and_face_preview", "barcode_instructions", "nfc_instructions", "nfc_confirm_document", "nfc", "nfc_error", "mrz_manual_input", "barcode", "error", "leave_user_waiting", "upload", "finished", "resubmission_feedback", "inflow_at_end", "consent", "proof_of_address", "unknown");
        C24362h.m61210e(a, "JsonReader.Options.of(\n …ess\",\n      \"unknown\"\n  )");
        this.f55087a = a;
    }

    /* renamed from: b */
    public C21783is mo54204a(C21430ba baVar) throws IOException {
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C21783is) baVar.mo54253l();
        }
        switch (baVar.mo54241b(this.f55087a)) {
            case 0:
                return C21783is.intro;
            case 1:
                return C21783is.document;
            case 2:
                return C21783is.f55100c;
            case 3:
                return C21783is.portrait_instructions;
            case 4:
                return C21783is.portrait;
            case 5:
                return C21783is.portrait_preview;
            case 6:
                return C21783is.passport_instructions;
            case 7:
                return C21783is.passport;
            case 8:
                return C21783is.passport_preview;
            case 9:
                return C21783is.document_front_instructions;
            case 10:
                return C21783is.document_front;
            case 11:
                return C21783is.document_front_preview;
            case 12:
                return C21783is.document_back_instructions;
            case 13:
                return C21783is.document_back;
            case 14:
                return C21783is.document_back_preview;
            case 15:
                return C21783is.document_and_face_instructions;
            case 16:
                return C21783is.document_and_face;
            case 17:
                return C21783is.document_and_face_preview;
            case 18:
                return C21783is.barcode_instructions;
            case 19:
                return C21783is.nfc_instructions;
            case 20:
                return C21783is.nfc_confirm_document;
            case 21:
                return C21783is.nfc;
            case 22:
                return C21783is.nfc_error;
            case 23:
                return C21783is.mrz_manual_input;
            case 24:
                return C21783is.barcode;
            case 25:
                return C21783is.error;
            case 26:
                return C21783is.leave_user_waiting;
            case 27:
                return C21783is.upload;
            case 28:
                return C21783is.finished;
            case 29:
                return C21783is.resubmission_feedback;
            case 30:
                return C21783is.inflow_at_end;
            case 31:
                return C21783is.consent;
            case 32:
                return C21783is.proof_of_address;
            case 33:
                return C21783is.unknown;
            default:
                StringBuilder k = C13555b.m33972k("Expected one of [intro, document, country, portrait_instructions, portrait, portrait_preview, passport_instructions, passport, passport_preview, document_front_instructions, document_front, document_front_preview, document_back_instructions, document_back, document_back_preview, document_and_face_instructions, document_and_face, document_and_face_preview, barcode_instructions, nfc_instructions, nfc_confirm_document, nfc, nfc_error, mrz_manual_input, barcode, error, leave_user_waiting, upload, finished, resubmission_feedback, inflow_at_end, consent, proof_of_address, unknown] but was ");
                k.append(baVar.mo54251j());
                k.append(" at path ");
                k.append(baVar.mo54259r());
                throw new C21426ax(k.toString());
        }
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C21783is isVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (isVar == null) {
            bfVar.mo54276e();
            return;
        }
        switch (C21782ir.f55088a[isVar.ordinal()]) {
            case 1:
                bfVar.mo54272b("intro");
                return;
            case 2:
                bfVar.mo54272b("document");
                return;
            case 3:
                bfVar.mo54272b(ServerParameters.COUNTRY);
                return;
            case 4:
                bfVar.mo54272b("portrait_instructions");
                return;
            case 5:
                bfVar.mo54272b("portrait");
                return;
            case 6:
                bfVar.mo54272b("portrait_preview");
                return;
            case 7:
                bfVar.mo54272b("passport_instructions");
                return;
            case 8:
                bfVar.mo54272b("passport");
                return;
            case 9:
                bfVar.mo54272b("passport_preview");
                return;
            case 10:
                bfVar.mo54272b("document_front_instructions");
                return;
            case 11:
                bfVar.mo54272b("document_front");
                return;
            case 12:
                bfVar.mo54272b("document_front_preview");
                return;
            case 13:
                bfVar.mo54272b("document_back_instructions");
                return;
            case 14:
                bfVar.mo54272b("document_back");
                return;
            case 15:
                bfVar.mo54272b("document_back_preview");
                return;
            case 16:
                bfVar.mo54272b("document_and_face_instructions");
                return;
            case 17:
                bfVar.mo54272b("document_and_face");
                return;
            case 18:
                bfVar.mo54272b("document_and_face_preview");
                return;
            case 19:
                bfVar.mo54272b("barcode_instructions");
                return;
            case 20:
                bfVar.mo54272b("nfc_instructions");
                return;
            case 21:
                bfVar.mo54272b("nfc_confirm_document");
                return;
            case 22:
                bfVar.mo54272b("nfc");
                return;
            case 23:
                bfVar.mo54272b("nfc_error");
                return;
            case 24:
                bfVar.mo54272b("mrz_manual_input");
                return;
            case 25:
                bfVar.mo54272b("barcode");
                return;
            case 26:
                bfVar.mo54272b("error");
                return;
            case 27:
                bfVar.mo54272b("leave_user_waiting");
                return;
            case 28:
                bfVar.mo54272b("upload");
                return;
            case 29:
                bfVar.mo54272b("finished");
                return;
            case 30:
                bfVar.mo54272b("resubmission_feedback");
                return;
            case 31:
                bfVar.mo54272b("inflow_at_end");
                return;
            case 32:
                bfVar.mo54272b("consent");
                return;
            case 33:
                bfVar.mo54272b("proof_of_address");
                return;
            case 34:
                bfVar.mo54272b("unknown");
                return;
            default:
                return;
        }
    }
}
