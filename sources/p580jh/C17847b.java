package p580jh;

import com.google.zxing.FormatException;
import java.io.UnsupportedEncodingException;
import p043ch.C13832c;

/* renamed from: jh.b */
public final class C17847b {

    /* renamed from: a */
    public static final char[] f45821a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* renamed from: jh.b$a */
    public static /* synthetic */ class C17848a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f45822a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.zxing.qrcode.decoder.Mode[] r0 = com.google.zxing.qrcode.decoder.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f45822a = r0
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f45822a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f45822a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f45822a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f45822a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.TERMINATOR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f45822a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.FNC1_FIRST_POSITION     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f45822a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.FNC1_SECOND_POSITION     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f45822a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.STRUCTURED_APPEND     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f45822a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.ECI     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f45822a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.HANZI     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p580jh.C17847b.C17848a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m44226a(C13832c cVar, StringBuilder sb, int i, boolean z) throws FormatException {
        while (i > 1) {
            if (cVar.mo40771a() >= 11) {
                int c = cVar.mo40773c(11);
                sb.append(m44231f(c / 45));
                sb.append(m44231f(c % 45));
                i -= 2;
            } else {
                throw FormatException.m36739a();
            }
        }
        if (i == 1) {
            if (cVar.mo40771a() >= 6) {
                sb.append(m44231f(cVar.mo40773c(6)));
            } else {
                throw FormatException.m36739a();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, 29);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0143, code lost:
        if (r1 == 2) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0147, code lost:
        if ((r17 * 10) >= r0) goto L_0x0151;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m44227b(p043ch.C13832c r21, java.lang.StringBuilder r22, int r23, com.google.zxing.common.CharacterSetECI r24, java.util.ArrayList r25, java.util.Map r26) throws com.google.zxing.FormatException {
        /*
            r0 = r23
            r1 = r26
            int r2 = r0 << 3
            int r3 = r21.mo40771a()
            if (r2 > r3) goto L_0x0179
            byte[] r2 = new byte[r0]
            r3 = 0
            r4 = 0
        L_0x0010:
            if (r4 >= r0) goto L_0x0020
            r5 = 8
            r6 = r21
            int r5 = r6.mo40773c(r5)
            byte r5 = (byte) r5
            r2[r4] = r5
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0020:
            if (r24 != 0) goto L_0x015c
            java.lang.String r4 = p043ch.C13835f.f34045a
            if (r1 == 0) goto L_0x003a
            com.google.zxing.DecodeHintType r4 = com.google.zxing.DecodeHintType.CHARACTER_SET
            boolean r5 = r1.containsKey(r4)
            if (r5 == 0) goto L_0x003a
            java.lang.Object r0 = r1.get(r4)
            java.lang.String r0 = r0.toString()
            r20 = r2
            goto L_0x0162
        L_0x003a:
            r1 = 2
            r4 = 3
            r5 = 1
            if (r0 <= r4) goto L_0x0053
            byte r6 = r2[r3]
            r7 = -17
            if (r6 != r7) goto L_0x0053
            byte r6 = r2[r5]
            r7 = -69
            if (r6 != r7) goto L_0x0053
            byte r6 = r2[r1]
            r7 = -65
            if (r6 != r7) goto L_0x0053
            r6 = 1
            goto L_0x0054
        L_0x0053:
            r6 = 0
        L_0x0054:
            r1 = 0
            r7 = 1
            r8 = 1
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x0064:
            if (r9 >= r0) goto L_0x0117
            if (r5 != 0) goto L_0x006c
            if (r7 != 0) goto L_0x006c
            if (r8 == 0) goto L_0x0117
        L_0x006c:
            byte r4 = r2[r9]
            r4 = r4 & 255(0xff, float:3.57E-43)
            if (r8 == 0) goto L_0x00a4
            if (r10 <= 0) goto L_0x007d
            r20 = r2
            r2 = r4 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00a2
            int r10 = r10 + -1
            goto L_0x00a6
        L_0x007d:
            r20 = r2
            r2 = r4 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00a6
            r2 = r4 & 64
            if (r2 == 0) goto L_0x00a2
            int r10 = r10 + 1
            r2 = r4 & 32
            if (r2 != 0) goto L_0x0090
            int r12 = r12 + 1
            goto L_0x00a6
        L_0x0090:
            int r10 = r10 + 1
            r2 = r4 & 16
            if (r2 != 0) goto L_0x0099
            int r13 = r13 + 1
            goto L_0x00a6
        L_0x0099:
            int r10 = r10 + 1
            r2 = r4 & 8
            if (r2 != 0) goto L_0x00a2
            int r14 = r14 + 1
            goto L_0x00a6
        L_0x00a2:
            r8 = 0
            goto L_0x00a6
        L_0x00a4:
            r20 = r2
        L_0x00a6:
            r2 = 127(0x7f, float:1.78E-43)
            if (r5 == 0) goto L_0x00c4
            if (r4 <= r2) goto L_0x00b2
            r2 = 160(0xa0, float:2.24E-43)
            if (r4 >= r2) goto L_0x00b2
            r5 = 0
            goto L_0x00c4
        L_0x00b2:
            r2 = 159(0x9f, float:2.23E-43)
            if (r4 <= r2) goto L_0x00c4
            r2 = 192(0xc0, float:2.69E-43)
            if (r4 < r2) goto L_0x00c2
            r2 = 215(0xd7, float:3.01E-43)
            if (r4 == r2) goto L_0x00c2
            r2 = 247(0xf7, float:3.46E-43)
            if (r4 != r2) goto L_0x00c4
        L_0x00c2:
            int r17 = r17 + 1
        L_0x00c4:
            if (r7 == 0) goto L_0x0110
            if (r11 <= 0) goto L_0x00d8
            r2 = 64
            if (r4 < r2) goto L_0x010f
            r2 = 127(0x7f, float:1.78E-43)
            if (r4 == r2) goto L_0x010f
            r2 = 252(0xfc, float:3.53E-43)
            if (r4 <= r2) goto L_0x00d5
            goto L_0x010f
        L_0x00d5:
            int r11 = r11 + -1
            goto L_0x0110
        L_0x00d8:
            r2 = 128(0x80, float:1.794E-43)
            if (r4 == r2) goto L_0x010f
            r2 = 160(0xa0, float:2.24E-43)
            if (r4 == r2) goto L_0x010f
            r2 = 239(0xef, float:3.35E-43)
            if (r4 <= r2) goto L_0x00e5
            goto L_0x010f
        L_0x00e5:
            r2 = 160(0xa0, float:2.24E-43)
            if (r4 <= r2) goto L_0x00f9
            r2 = 224(0xe0, float:3.14E-43)
            if (r4 >= r2) goto L_0x00f9
            int r1 = r1 + 1
            int r2 = r19 + 1
            if (r2 <= r15) goto L_0x00f4
            r15 = r2
        L_0x00f4:
            r19 = r2
            r18 = 0
            goto L_0x0110
        L_0x00f9:
            r2 = 127(0x7f, float:1.78E-43)
            if (r4 <= r2) goto L_0x010a
            int r11 = r11 + 1
            int r2 = r18 + 1
            if (r2 <= r3) goto L_0x0107
            r3 = r2
            r18 = r3
            goto L_0x010c
        L_0x0107:
            r18 = r2
            goto L_0x010c
        L_0x010a:
            r18 = 0
        L_0x010c:
            r19 = 0
            goto L_0x0110
        L_0x010f:
            r7 = 0
        L_0x0110:
            int r9 = r9 + 1
            r2 = r20
            r4 = 3
            goto L_0x0064
        L_0x0117:
            r20 = r2
            if (r8 == 0) goto L_0x011e
            if (r10 <= 0) goto L_0x011e
            r8 = 0
        L_0x011e:
            if (r7 == 0) goto L_0x0125
            if (r11 <= 0) goto L_0x0125
            r16 = 0
            goto L_0x0127
        L_0x0125:
            r16 = r7
        L_0x0127:
            if (r8 == 0) goto L_0x0130
            if (r6 != 0) goto L_0x0156
            int r12 = r12 + r13
            int r12 = r12 + r14
            if (r12 <= 0) goto L_0x0130
            goto L_0x0156
        L_0x0130:
            if (r16 == 0) goto L_0x013c
            boolean r2 = p043ch.C13835f.f34046b
            if (r2 != 0) goto L_0x0151
            r2 = 3
            if (r15 >= r2) goto L_0x0151
            if (r3 < r2) goto L_0x013c
            goto L_0x0151
        L_0x013c:
            if (r5 == 0) goto L_0x014a
            if (r16 == 0) goto L_0x014a
            r2 = 2
            if (r15 != r2) goto L_0x0145
            if (r1 == r2) goto L_0x0151
        L_0x0145:
            int r1 = r17 * 10
            if (r1 < r0) goto L_0x014c
            goto L_0x0151
        L_0x014a:
            if (r5 == 0) goto L_0x014f
        L_0x014c:
            java.lang.String r0 = "ISO8859_1"
            goto L_0x0162
        L_0x014f:
            if (r16 == 0) goto L_0x0154
        L_0x0151:
            java.lang.String r0 = "SJIS"
            goto L_0x0162
        L_0x0154:
            if (r8 == 0) goto L_0x0159
        L_0x0156:
            java.lang.String r0 = "UTF8"
            goto L_0x0162
        L_0x0159:
            java.lang.String r0 = p043ch.C13835f.f34045a
            goto L_0x0162
        L_0x015c:
            r20 = r2
            java.lang.String r0 = r24.name()
        L_0x0162:
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0174 }
            r2 = r20
            r1.<init>(r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x0174 }
            r0 = r22
            r0.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x0174 }
            r0 = r25
            r0.add(r2)
            return
        L_0x0174:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.m36739a()
            throw r0
        L_0x0179:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.m36739a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p580jh.C17847b.m44227b(ch.c, java.lang.StringBuilder, int, com.google.zxing.common.CharacterSetECI, java.util.ArrayList, java.util.Map):void");
    }

    /* renamed from: c */
    public static void m44228c(C13832c cVar, StringBuilder sb, int i) throws FormatException {
        int i2;
        if (i * 13 <= cVar.mo40771a()) {
            byte[] bArr = new byte[(i * 2)];
            int i3 = 0;
            while (i > 0) {
                int c = cVar.mo40773c(13);
                int i4 = (c % 96) | ((c / 96) << 8);
                if (i4 < 959) {
                    i2 = 41377;
                } else {
                    i2 = 42657;
                }
                int i5 = i4 + i2;
                bArr[i3] = (byte) (i5 >> 8);
                bArr[i3 + 1] = (byte) i5;
                i3 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "GB2312"));
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.m36739a();
            }
        } else {
            throw FormatException.m36739a();
        }
    }

    /* renamed from: d */
    public static void m44229d(C13832c cVar, StringBuilder sb, int i) throws FormatException {
        int i2;
        if (i * 13 <= cVar.mo40771a()) {
            byte[] bArr = new byte[(i * 2)];
            int i3 = 0;
            while (i > 0) {
                int c = cVar.mo40773c(13);
                int i4 = (c % 192) | ((c / 192) << 8);
                if (i4 < 7936) {
                    i2 = 33088;
                } else {
                    i2 = 49472;
                }
                int i5 = i4 + i2;
                bArr[i3] = (byte) (i5 >> 8);
                bArr[i3 + 1] = (byte) i5;
                i3 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "SJIS"));
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.m36739a();
            }
        } else {
            throw FormatException.m36739a();
        }
    }

    /* renamed from: e */
    public static void m44230e(C13832c cVar, StringBuilder sb, int i) throws FormatException {
        while (i >= 3) {
            if (cVar.mo40771a() >= 10) {
                int c = cVar.mo40773c(10);
                if (c < 1000) {
                    sb.append(m44231f(c / 100));
                    sb.append(m44231f((c / 10) % 10));
                    sb.append(m44231f(c % 10));
                    i -= 3;
                } else {
                    throw FormatException.m36739a();
                }
            } else {
                throw FormatException.m36739a();
            }
        }
        if (i == 2) {
            if (cVar.mo40771a() >= 7) {
                int c2 = cVar.mo40773c(7);
                if (c2 < 100) {
                    sb.append(m44231f(c2 / 10));
                    sb.append(m44231f(c2 % 10));
                    return;
                }
                throw FormatException.m36739a();
            }
            throw FormatException.m36739a();
        } else if (i != 1) {
        } else {
            if (cVar.mo40771a() >= 4) {
                int c3 = cVar.mo40773c(4);
                if (c3 < 10) {
                    sb.append(m44231f(c3));
                    return;
                }
                throw FormatException.m36739a();
            }
            throw FormatException.m36739a();
        }
    }

    /* renamed from: f */
    public static char m44231f(int i) throws FormatException {
        char[] cArr = f45821a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw FormatException.m36739a();
    }
}
