package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/KotshiFeatureAreaJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/analytics/FeatureArea;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.io */
public final class C21779io extends aed<C21720gj> {

    /* renamed from: a */
    private final C21430ba.C21431a f55085a;

    public C21779io() {
        super("KotshiJsonAdapter(FeatureArea)");
        C21430ba.C21431a a = C21430ba.C21431a.m51080a("analytics_events", "camera", "session_start", "verification_flow", "instructions_screen", "privacy_policy", "permissions", "language_change", "country_selection", "document_selection", "preview_screen", "error_screen", "navigation", "upload", "inflow", "front_integration", "infrastructure", "barcode", "resubmission", "whitelabel", "nfc", "session_end", "decision_screen", "file_handling", "intro_screen", "ui_elements", "video", "auto_capture", "browserid", "address", "unknown");
        C24362h.m61210e(a, "JsonReader.Options.of(\n …ess\",\n      \"unknown\"\n  )");
        this.f55085a = a;
    }

    /* renamed from: b */
    public C21720gj mo54204a(C21430ba baVar) throws IOException {
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C21720gj) baVar.mo54253l();
        }
        switch (baVar.mo54241b(this.f55085a)) {
            case 0:
                return C21720gj.analytics_events;
            case 1:
                return C21720gj.camera;
            case 2:
                return C21720gj.session_start;
            case 3:
                return C21720gj.verification_flow;
            case 4:
                return C21720gj.instructions_screen;
            case 5:
                return C21720gj.privacy_policy;
            case 6:
                return C21720gj.permissions;
            case 7:
                return C21720gj.language_change;
            case 8:
                return C21720gj.country_selection;
            case 9:
                return C21720gj.document_selection;
            case 10:
                return C21720gj.preview_screen;
            case 11:
                return C21720gj.error_screen;
            case 12:
                return C21720gj.navigation;
            case 13:
                return C21720gj.upload;
            case 14:
                return C21720gj.inflow;
            case 15:
                return C21720gj.front_integration;
            case 16:
                return C21720gj.infrastructure;
            case 17:
                return C21720gj.barcode;
            case 18:
                return C21720gj.resubmission;
            case 19:
                return C21720gj.whitelabel;
            case 20:
                return C21720gj.nfc;
            case 21:
                return C21720gj.session_end;
            case 22:
                return C21720gj.decision_screen;
            case 23:
                return C21720gj.file_handling;
            case 24:
                return C21720gj.intro_screen;
            case 25:
                return C21720gj.ui_elements;
            case 26:
                return C21720gj.video;
            case 27:
                return C21720gj.auto_capture;
            case 28:
                return C21720gj.browserid;
            case 29:
                return C21720gj.address;
            case 30:
                return C21720gj.unknown;
            default:
                StringBuilder k = C13555b.m33972k("Expected one of [analytics_events, camera, session_start, verification_flow, instructions_screen, privacy_policy, permissions, language_change, country_selection, document_selection, preview_screen, error_screen, navigation, upload, inflow, front_integration, infrastructure, barcode, resubmission, whitelabel, nfc, session_end, decision_screen, file_handling, intro_screen, ui_elements, video, auto_capture, browserid, address, unknown] but was ");
                k.append(baVar.mo54251j());
                k.append(" at path ");
                k.append(baVar.mo54259r());
                throw new C21426ax(k.toString());
        }
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C21720gj gjVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (gjVar == null) {
            bfVar.mo54276e();
            return;
        }
        switch (C21780ip.f55086a[gjVar.ordinal()]) {
            case 1:
                bfVar.mo54272b("analytics_events");
                return;
            case 2:
                bfVar.mo54272b("camera");
                return;
            case 3:
                bfVar.mo54272b("session_start");
                return;
            case 4:
                bfVar.mo54272b("verification_flow");
                return;
            case 5:
                bfVar.mo54272b("instructions_screen");
                return;
            case 6:
                bfVar.mo54272b("privacy_policy");
                return;
            case 7:
                bfVar.mo54272b("permissions");
                return;
            case 8:
                bfVar.mo54272b("language_change");
                return;
            case 9:
                bfVar.mo54272b("country_selection");
                return;
            case 10:
                bfVar.mo54272b("document_selection");
                return;
            case 11:
                bfVar.mo54272b("preview_screen");
                return;
            case 12:
                bfVar.mo54272b("error_screen");
                return;
            case 13:
                bfVar.mo54272b("navigation");
                return;
            case 14:
                bfVar.mo54272b("upload");
                return;
            case 15:
                bfVar.mo54272b("inflow");
                return;
            case 16:
                bfVar.mo54272b("front_integration");
                return;
            case 17:
                bfVar.mo54272b("infrastructure");
                return;
            case 18:
                bfVar.mo54272b("barcode");
                return;
            case 19:
                bfVar.mo54272b("resubmission");
                return;
            case 20:
                bfVar.mo54272b("whitelabel");
                return;
            case 21:
                bfVar.mo54272b("nfc");
                return;
            case 22:
                bfVar.mo54272b("session_end");
                return;
            case 23:
                bfVar.mo54272b("decision_screen");
                return;
            case 24:
                bfVar.mo54272b("file_handling");
                return;
            case 25:
                bfVar.mo54272b("intro_screen");
                return;
            case 26:
                bfVar.mo54272b("ui_elements");
                return;
            case 27:
                bfVar.mo54272b("video");
                return;
            case 28:
                bfVar.mo54272b("auto_capture");
                return;
            case 29:
                bfVar.mo54272b("browserid");
                return;
            case 30:
                bfVar.mo54272b("address");
                return;
            case 31:
                bfVar.mo54272b("unknown");
                return;
            default:
                return;
        }
    }
}
