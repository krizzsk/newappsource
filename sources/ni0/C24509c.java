package ni0;

import ii0.C23610d;
import java.io.IOException;
import okio.ByteString;
import p001a0.C0016g;

/* renamed from: ni0.c */
public final class C24509c {

    /* renamed from: a */
    public static final ByteString f62038a = ByteString.C24633a.m61918a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    public static final String[] f62039b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    public static final String[] f62040c = new String[64];

    /* renamed from: d */
    public static final String[] f62041d = new String[256];

    static {
        ByteString byteString = ByteString.f62330d;
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f62041d;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = C23610d.m57802j("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f62040c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            String[] strArr3 = f62040c;
            strArr3[i4 | 8] = C0016g.m31o(new StringBuilder(), strArr3[i4], "|PADDED");
        }
        String[] strArr4 = f62040c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr5 = f62040c;
                int i9 = i8 | i6;
                strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr5[i8]);
                sb.append('|');
                strArr5[i9 | 8] = C0016g.m31o(sb, strArr5[i6], "|PADDED");
            }
        }
        while (true) {
            String[] strArr6 = f62040c;
            if (i < strArr6.length) {
                if (strArr6[i] == null) {
                    strArr6[i] = f62041d[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static String m61646a(boolean z, int i, int i2, byte b, byte b2) {
        String str;
        String str2;
        String str3;
        String str4;
        String[] strArr = f62039b;
        if (b < strArr.length) {
            str = strArr[b];
        } else {
            str = C23610d.m57802j("0x%02x", Byte.valueOf(b));
        }
        if (b2 == 0) {
            str2 = "";
        } else {
            if (!(b == 2 || b == 3)) {
                if (b == 4 || b == 6) {
                    if (b2 == 1) {
                        str2 = "ACK";
                    } else {
                        str2 = f62041d[b2];
                    }
                } else if (!(b == 7 || b == 8)) {
                    String[] strArr2 = f62040c;
                    if (b2 < strArr2.length) {
                        str4 = strArr2[b2];
                    } else {
                        str4 = f62041d[b2];
                    }
                    if (b == 5 && (b2 & 4) != 0) {
                        str2 = str4.replace("HEADERS", "PUSH_PROMISE");
                    } else if (b != 0 || (b2 & 32) == 0) {
                        str2 = str4;
                    } else {
                        str2 = str4.replace("PRIORITY", "COMPRESSED");
                    }
                }
            }
            str2 = f62041d[b2];
        }
        Object[] objArr = new Object[5];
        if (z) {
            str3 = "<<";
        } else {
            str3 = ">>";
        }
        objArr[0] = str3;
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = str;
        objArr[4] = str2;
        return C23610d.m57802j("%s 0x%08x %5d %-13s %s", objArr);
    }

    /* renamed from: b */
    public static void m61647b(String str, Object... objArr) throws IOException {
        throw new IOException(C23610d.m57802j(str, objArr));
    }
}
