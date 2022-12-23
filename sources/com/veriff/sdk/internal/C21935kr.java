package com.veriff.sdk.internal;

import kotlin.Metadata;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0004"}, mo59060d2 = {"EXTENDED_LC_LE_MASK", "", "toInt", "", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.kr */
public final class C21935kr {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final int m53532b(byte[] bArr) {
        byte b = 0;
        for (byte b2 : bArr) {
            b = (b << 8) | (b2 & 255);
        }
        return b;
    }
}
