package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/payload/KotshiVideoContextJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lmobi/lab/veriff/data/api/request/payload/VideoContext;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.sx */
public final class C22538sx extends aed<C22549tg> {

    /* renamed from: a */
    private final C21430ba.C21431a f56850a;

    public C22538sx() {
        super("KotshiJsonAdapter(VideoContext)");
        C21430ba.C21431a a = C21430ba.C21431a.m51080a("selfid_video", "face-pre-video", "document-front-pre-video", "document-back-pre-video", "document-and-face-pre-video", "document-back-barcode-pre-video");
        C24362h.m61210e(a, "JsonReader.Options.of(\n …ck-barcode-pre-video\"\n  )");
        this.f56850a = a;
    }

    /* renamed from: b */
    public C22549tg mo54204a(C21430ba baVar) throws IOException {
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C22549tg) baVar.mo54253l();
        }
        int b = baVar.mo54241b(this.f56850a);
        if (b == 0) {
            return C22549tg.GENERIC;
        }
        if (b == 1) {
            return C22549tg.FACE;
        }
        if (b == 2) {
            return C22549tg.DOCUMENT_FRONT;
        }
        if (b == 3) {
            return C22549tg.DOCUMENT_BACK;
        }
        if (b == 4) {
            return C22549tg.DOCUMENT_AND_FACE;
        }
        if (b == 5) {
            return C22549tg.DOCUMENT_BACK_BARCODE;
        }
        StringBuilder k = C13555b.m33972k("Expected one of [selfid_video, face-pre-video, document-front-pre-video, document-back-pre-video, document-and-face-pre-video, document-back-barcode-pre-video] but was ");
        k.append(baVar.mo54251j());
        k.append(" at path ");
        k.append(baVar.mo54259r());
        throw new C21426ax(k.toString());
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C22549tg tgVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (tgVar == null) {
            bfVar.mo54276e();
            return;
        }
        switch (C22539sy.f56851a[tgVar.ordinal()]) {
            case 1:
                bfVar.mo54272b("selfid_video");
                return;
            case 2:
                bfVar.mo54272b("face-pre-video");
                return;
            case 3:
                bfVar.mo54272b("document-front-pre-video");
                return;
            case 4:
                bfVar.mo54272b("document-back-pre-video");
                return;
            case 5:
                bfVar.mo54272b("document-and-face-pre-video");
                return;
            case 6:
                bfVar.mo54272b("document-back-barcode-pre-video");
                return;
            default:
                return;
        }
    }
}
