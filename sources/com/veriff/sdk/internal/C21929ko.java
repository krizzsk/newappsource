package com.veriff.sdk.internal;

import android.nfc.tech.IsoDep;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/AndroidNfcTransceiver;", "Lcom/veriff/sdk/internal/nfc/NfcTransceiver;", "isoDep", "Landroid/nfc/tech/IsoDep;", "(Landroid/nfc/tech/IsoDep;)V", "supportsExtendedLength", "", "getSupportsExtendedLength", "()Z", "transceive", "", "bytes", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ko */
public final class C21929ko implements C21971ln {

    /* renamed from: a */
    private final boolean f55427a;

    /* renamed from: b */
    private final IsoDep f55428b;

    public C21929ko(IsoDep isoDep) {
        C24362h.m61211f(isoDep, "isoDep");
        this.f55428b = isoDep;
        this.f55427a = isoDep.isExtendedLengthApduSupported();
    }

    /* renamed from: a */
    public boolean mo55723a() {
        return this.f55427a;
    }

    /* renamed from: a */
    public byte[] mo55724a(byte[] bArr) {
        C24362h.m61211f(bArr, "bytes");
        byte[] transceive = this.f55428b.transceive(bArr);
        C24362h.m61210e(transceive, "isoDep.transceive(bytes)");
        return transceive;
    }
}
