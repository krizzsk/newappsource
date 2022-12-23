package com.veriff.sdk.internal;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.util.C24465j;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0001\"\u001c\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo59060d2 = {"Ljava/nio/ByteBuffer;", "data", "", "imageWidth", "imageHeight", "rowStride", "pixelStride", "", "out", "Lbf0/d;", "rotateCW", "Lmobi/lab/veriff/util/Log;", "kotlin.jvm.PlatformType", "log", "Lmobi/lab/veriff/util/Log;", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.mg */
public final class C22014mg {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C24465j f55554a = C24465j.m61536a(C22007mf.class);

    /* renamed from: a */
    public static final void m53683a(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, byte[] bArr) {
        C24362h.m61211f(byteBuffer, "data");
        C24362h.m61211f(bArr, "out");
        for (int i5 = 0; i5 < i2; i5++) {
            for (int i6 = 0; i6 < i; i6++) {
                bArr[((i2 - i5) - 1) + (i6 * i2)] = byteBuffer.get((i6 * i4) + (i5 * i3));
            }
        }
    }
}
