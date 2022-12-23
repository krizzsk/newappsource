package com.veriff.sdk.internal;

import kotlin.Metadata;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&¨\u0006\b"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/crypto/Cipher;", "", "apply", "", "bytes", "off", "", "length", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.lx */
public interface C21982lx {

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.lx$a */
    public static final class C21983a {
        /* renamed from: a */
        public static /* synthetic */ byte[] m53620a(C21982lx lxVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 2) != 0) {
                    i = 0;
                }
                if ((i3 & 4) != 0) {
                    i2 = bArr.length;
                }
                return lxVar.mo55806a(bArr, i, i2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
        }
    }

    /* renamed from: a */
    byte[] mo55806a(byte[] bArr, int i, int i2);
}
