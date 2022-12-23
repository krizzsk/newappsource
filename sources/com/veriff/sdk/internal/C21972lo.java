package com.veriff.sdk.internal;

import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/PlainChipInterface;", "Lcom/veriff/sdk/internal/nfc/ChipInterface;", "transceiver", "Lcom/veriff/sdk/internal/nfc/NfcTransceiver;", "(Lcom/veriff/sdk/internal/nfc/NfcTransceiver;)V", "supportsExtendedLength", "", "getSupportsExtendedLength", "()Z", "send", "Lcom/veriff/sdk/internal/nfc/ResponseApdu;", "apdu", "Lcom/veriff/sdk/internal/nfc/Apdu;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.lo */
public final class C21972lo implements C21945kz {

    /* renamed from: a */
    private final C21971ln f55479a;

    public C21972lo(C21971ln lnVar) {
        C24362h.m61211f(lnVar, "transceiver");
        this.f55479a = lnVar;
    }

    /* renamed from: a */
    public boolean mo55752a() {
        return this.f55479a.mo55723a();
    }

    /* renamed from: a */
    public C21973lp mo55751a(C21930kp kpVar) {
        C24362h.m61211f(kpVar, "apdu");
        return C21973lp.f55480a.mo55798a(this.f55479a.mo55724a(kpVar.mo55725a()));
    }
}
