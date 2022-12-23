package com.veriff.sdk.internal;

import kotlin.Metadata;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/ChipFileReader;", "", "readFile", "", "chip", "Lcom/veriff/sdk/internal/nfc/ChipInterface;", "fileIdMsb", "", "fileIdLsb", "chunkSize", "", "probeTlvLen", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ky */
public interface C21943ky {

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ky$a */
    public static final class C21944a {
        /* renamed from: a */
        public static /* synthetic */ byte[] m53560a(C21943ky kyVar, C21945kz kzVar, byte b, byte b2, int i, boolean z, int i2, Object obj) {
            boolean z2;
            if (obj == null) {
                if ((i2 & 16) != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                return kyVar.mo55749a(kzVar, b, b2, i, z2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readFile");
        }
    }

    /* renamed from: a */
    byte[] mo55749a(C21945kz kzVar, byte b, byte b2, int i, boolean z);
}
