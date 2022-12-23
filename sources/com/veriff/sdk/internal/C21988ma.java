package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21985lz;
import kotlin.Metadata;
import kotlin.collections.C23816b;
import mf0.C24362h;
import p584jl.C17885a;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/crypto/RetailMac;", "Lcom/veriff/sdk/internal/nfc/crypto/Digest;", "crypto", "Lcom/veriff/sdk/internal/nfc/crypto/NfcCrypto;", "key", "", "(Lcom/veriff/sdk/internal/nfc/crypto/NfcCrypto;[B)V", "compute", "input", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ma */
public final class C21988ma implements C21984ly {

    /* renamed from: a */
    private final C21985lz f55503a;

    /* renamed from: b */
    private final byte[] f55504b;

    public C21988ma(C21985lz lzVar, byte[] bArr) {
        C24362h.m61211f(lzVar, "crypto");
        C24362h.m61211f(bArr, LinksConfiguration.KEY_KEY);
        this.f55503a = lzVar;
        this.f55504b = bArr;
    }

    /* renamed from: a */
    public byte[] mo55811a(byte[] bArr) {
        C24362h.m61211f(bArr, "input");
        byte[] d1 = C23816b.m58448d1(this.f55504b, C17885a.m44393C0(0, 8));
        C21985lz lzVar = this.f55503a;
        C21985lz.C21986a aVar = C21985lz.C21986a.ENCRYPT;
        byte[] a = lzVar.mo55807a(aVar, d1, new byte[8]).mo55806a(bArr, 0, bArr.length - 8);
        return this.f55503a.mo55810b(aVar, this.f55504b, C23816b.m58448d1(a, C17885a.m44393C0(a.length - 8, a.length))).mo55806a(bArr, bArr.length - 8, 8);
    }
}
