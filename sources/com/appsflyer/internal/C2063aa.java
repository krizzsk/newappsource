package com.appsflyer.internal;

import com.appboy.support.ValidationUtils;

/* renamed from: com.appsflyer.internal.aa */
public class C2063aa {
    private static void $$b(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static void AFDateFormat(int i, int i2, boolean z, int i3, int[] iArr, int[][] iArr2, int[] iArr3) {
        int[] iArr4 = iArr;
        if (!z) {
            $$b(iArr);
        }
        int i4 = i;
        int i5 = i2;
        int i6 = 0;
        while (i6 < i3) {
            int i7 = i4 ^ iArr4[i6];
            int i8 = (i7 >>> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
            int i9 = (i7 >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
            int i11 = i7 & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
            int[] iArr5 = iArr2[0];
            i6++;
            int i12 = i5 ^ ((iArr2[2][i9] ^ (iArr5[i7 >>> 24] + iArr2[1][i8])) + iArr2[3][i11]);
            i5 = i7;
            i4 = i12;
        }
        int i13 = i4 ^ iArr4[iArr4.length - 2];
        int i14 = i5 ^ iArr4[iArr4.length - 1];
        if (!z) {
            $$b(iArr);
        }
        iArr3[0] = i14;
        iArr3[1] = i13;
    }
}
