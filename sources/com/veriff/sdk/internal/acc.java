package com.veriff.sdk.internal;

import com.appboy.support.ValidationUtils;
import java.nio.charset.Charset;

final class acc {

    /* renamed from: a */
    public static final Charset f53612a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static int m50625a(int i) {
        return ((i & ValidationUtils.APPBOY_STRING_MAX_LENGTH) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: a */
    public static short m50626a(short s) {
        short s2 = s & 65535;
        return (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8));
    }

    /* renamed from: a */
    public static void m50627a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)}));
        }
    }

    /* renamed from: b */
    private static <T extends Throwable> void m50630b(Throwable th) throws Throwable {
        throw th;
    }

    /* renamed from: a */
    public static void m50628a(Throwable th) {
        m50630b(th);
    }

    /* renamed from: a */
    public static boolean m50629a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
