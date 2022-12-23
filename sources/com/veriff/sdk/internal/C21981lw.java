package com.veriff.sdk.internal;

import java.security.MessageDigest;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/crypto/AndroidSha1;", "Lcom/veriff/sdk/internal/nfc/crypto/Digest;", "()V", "digest", "Ljava/security/MessageDigest;", "kotlin.jvm.PlatformType", "compute", "", "input", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.lw */
final class C21981lw implements C21984ly {

    /* renamed from: a */
    private final MessageDigest f55494a = MessageDigest.getInstance("SHA1");

    /* renamed from: a */
    public byte[] mo55811a(byte[] bArr) {
        C24362h.m61211f(bArr, "input");
        byte[] digest = this.f55494a.digest(bArr);
        C24362h.m61210e(digest, "digest.digest(input)");
        return digest;
    }
}
