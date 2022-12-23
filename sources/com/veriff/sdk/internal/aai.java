package com.veriff.sdk.internal;

import java.io.IOException;
import p001a0.C0016g;

public final class aai {

    /* renamed from: a */
    public static final abl f53364a = abl.m50461a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    public static final String[] f53365b = new String[64];

    /* renamed from: c */
    public static final String[] f53366c = new String[256];

    /* renamed from: d */
    private static final String[] f53367d = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f53366c;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = C22766za.m55824a("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f53365b;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            String[] strArr3 = f53365b;
            strArr3[i4 | 8] = C0016g.m31o(new StringBuilder(), strArr3[i4], "|PADDED");
        }
        String[] strArr4 = f53365b;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr5 = f53365b;
                int i9 = i8 | i6;
                strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr5[i8]);
                sb.append('|');
                strArr5[i9 | 8] = C0016g.m31o(sb, strArr5[i6], "|PADDED");
            }
        }
        while (true) {
            String[] strArr6 = f53365b;
            if (i < strArr6.length) {
                if (strArr6[i] == null) {
                    strArr6[i] = f53366c[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    private aai() {
    }

    /* renamed from: a */
    public static IllegalArgumentException m50044a(String str, Object... objArr) {
        throw new IllegalArgumentException(C22766za.m55824a(str, objArr));
    }

    /* renamed from: b */
    public static IOException m50047b(String str, Object... objArr) throws IOException {
        throw new IOException(C22766za.m55824a(str, objArr));
    }

    /* renamed from: a */
    public static String m50046a(boolean z, int i, int i2, byte b, byte b2) {
        String[] strArr = f53367d;
        String a = b < strArr.length ? strArr[b] : C22766za.m55824a("0x%02x", Byte.valueOf(b));
        String a2 = m50045a(b, b2);
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = a;
        objArr[4] = a2;
        return C22766za.m55824a("%s 0x%08x %5d %-13s %s", objArr);
    }

    /* renamed from: a */
    public static String m50045a(byte b, byte b2) {
        if (b2 == 0) {
            return "";
        }
        if (!(b == 2 || b == 3)) {
            if (b == 4 || b == 6) {
                if (b2 == 1) {
                    return "ACK";
                }
                return f53366c[b2];
            } else if (!(b == 7 || b == 8)) {
                String[] strArr = f53365b;
                String str = b2 < strArr.length ? strArr[b2] : f53366c[b2];
                if (b != 5 || (b2 & 4) == 0) {
                    return (b != 0 || (b2 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                }
                return str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f53366c[b2];
    }
}
