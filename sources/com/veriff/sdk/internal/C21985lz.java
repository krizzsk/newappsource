package com.veriff.sdk.internal;

import kotlin.Metadata;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0010J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J \u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0011"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/crypto/NfcCrypto;", "", "get3des", "Lcom/veriff/sdk/internal/nfc/crypto/Cipher;", "cipherMode", "Lcom/veriff/sdk/internal/nfc/crypto/NfcCrypto$CipherMode;", "key", "", "initializationVector", "getDes", "ciphermode", "getRandomBytes", "count", "", "getSha1", "Lcom/veriff/sdk/internal/nfc/crypto/Digest;", "CipherMode", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.lz */
public interface C21985lz {

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/crypto/NfcCrypto$CipherMode;", "", "(Ljava/lang/String;I)V", "ENCRYPT", "DECRYPT", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.lz$a */
    public enum C21986a {
        ENCRYPT,
        DECRYPT
    }

    /* renamed from: a */
    C21982lx mo55807a(C21986a aVar, byte[] bArr, byte[] bArr2);

    /* renamed from: a */
    C21984ly mo55808a();

    /* renamed from: a */
    byte[] mo55809a(int i);

    /* renamed from: b */
    C21982lx mo55810b(C21986a aVar, byte[] bArr, byte[] bArr2);
}
