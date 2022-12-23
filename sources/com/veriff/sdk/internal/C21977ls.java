package com.veriff.sdk.internal;

import bf0.C21050d;
import com.veriff.sdk.internal.C21985lz;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J \u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0019\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/crypto/AndroidDes;", "Lcom/veriff/sdk/internal/nfc/crypto/Cipher;", "cipherMode", "Lcom/veriff/sdk/internal/nfc/crypto/NfcCrypto$CipherMode;", "key", "", "initializationVector", "(Lcom/veriff/sdk/internal/nfc/crypto/NfcCrypto$CipherMode;[B[B)V", "cipher", "Ljavax/crypto/Cipher;", "kotlin.jvm.PlatformType", "getCipher", "()Ljavax/crypto/Cipher;", "apply", "bytes", "off", "", "length", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ls */
final class C21977ls implements C21982lx {

    /* renamed from: a */
    private final Cipher f55490a;

    public C21977ls(C21985lz.C21986a aVar, byte[] bArr, byte[] bArr2) {
        C24362h.m61211f(aVar, "cipherMode");
        C24362h.m61211f(bArr, LinksConfiguration.KEY_KEY);
        C24362h.m61211f(bArr2, "initializationVector");
        Cipher instance = Cipher.getInstance("DES/CBC/NoPadding");
        instance.init(C21979lu.m53617b(aVar), new SecretKeySpec(bArr, "DES"), new IvParameterSpec(bArr2));
        C21050d dVar = C21050d.f52856a;
        this.f55490a = instance;
    }

    /* renamed from: a */
    public byte[] mo55806a(byte[] bArr, int i, int i2) {
        C24362h.m61211f(bArr, "bytes");
        byte[] doFinal = this.f55490a.doFinal(bArr, i, i2);
        C24362h.m61210e(doFinal, "cipher.doFinal(bytes, off, length)");
        return doFinal;
    }
}
