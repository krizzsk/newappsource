package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21985lz;
import java.security.SecureRandom;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J \u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/crypto/AndroidNfcCrypto;", "Lcom/veriff/sdk/internal/nfc/crypto/NfcCrypto;", "()V", "rand", "Ljava/security/SecureRandom;", "get3des", "Lcom/veriff/sdk/internal/nfc/crypto/Cipher;", "cipherMode", "Lcom/veriff/sdk/internal/nfc/crypto/NfcCrypto$CipherMode;", "key", "", "initializationVector", "getDes", "ciphermode", "getRandomBytes", "count", "", "getSha1", "Lcom/veriff/sdk/internal/nfc/crypto/Digest;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.lt */
public final class C21978lt implements C21985lz {

    /* renamed from: a */
    public static final C21978lt f55491a = new C21978lt();

    /* renamed from: b */
    private static final SecureRandom f55492b = new SecureRandom();

    private C21978lt() {
    }

    /* renamed from: a */
    public C21984ly mo55808a() {
        return new C21981lw();
    }

    /* renamed from: b */
    public C21982lx mo55810b(C21985lz.C21986a aVar, byte[] bArr, byte[] bArr2) {
        C24362h.m61211f(aVar, "cipherMode");
        C24362h.m61211f(bArr, LinksConfiguration.KEY_KEY);
        C24362h.m61211f(bArr2, "initializationVector");
        return new C21976lr(aVar, bArr, bArr2);
    }

    /* renamed from: a */
    public C21982lx mo55807a(C21985lz.C21986a aVar, byte[] bArr, byte[] bArr2) {
        C24362h.m61211f(aVar, "ciphermode");
        C24362h.m61211f(bArr, LinksConfiguration.KEY_KEY);
        C24362h.m61211f(bArr2, "initializationVector");
        return new C21977ls(aVar, bArr, bArr2);
    }

    /* renamed from: a */
    public byte[] mo55809a(int i) {
        byte[] bArr = new byte[i];
        f55492b.nextBytes(bArr);
        return bArr;
    }
}
