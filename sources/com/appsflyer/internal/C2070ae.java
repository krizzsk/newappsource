package com.appsflyer.internal;

import com.appboy.support.ValidationUtils;

/* renamed from: com.appsflyer.internal.ae */
public final class C2070ae {
    public static void $$b(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int[] AFDateFormat(char[] cArr, int[] iArr, boolean z) {
        int i = (cArr[0] << 16) + cArr[1];
        int i2 = (cArr[2] << 16) + cArr[3];
        if (!z) {
            $$b(iArr);
        }
        int i3 = 0;
        while (i3 < 16) {
            int i4 = i ^ iArr[i3];
            i3++;
            int $$b = i2 ^ $$b(i4);
            i2 = i4;
            i = $$b;
        }
        int i5 = i ^ iArr[16];
        int i6 = iArr[17] ^ i2;
        int[] iArr2 = {i6, i5};
        cArr[0] = (char) (i6 >>> 16);
        cArr[1] = (char) i6;
        cArr[2] = (char) (i5 >>> 16);
        cArr[3] = (char) i5;
        if (!z) {
            $$b(iArr);
        }
        return iArr2;
    }

    public static int $$b(int i) {
        C2068ac acVar = C2068ac.f6858d;
        int i2 = i >>> 24;
        int i3 = (i >>> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        int i4 = (i >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        int i5 = i & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        int[][] iArr = acVar.f6860c;
        return ((iArr[0][i2] + iArr[1][i3]) ^ iArr[2][i4]) + iArr[3][i5];
    }
}
