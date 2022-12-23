package com.veriff.sdk.internal;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.veriff.sdk.internal.af */
final class C21392af {

    /* renamed from: a */
    private static final char[] f53823a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b */
    private static final char[] f53824b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c */
    private static final BigInteger[] f53825c;

    /* renamed from: com.veriff.sdk.internal.af$1 */
    public static /* synthetic */ class C213931 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53826a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.veriff.sdk.internal.af$a[] r0 = com.veriff.sdk.internal.C21392af.C21394a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f53826a = r0
                com.veriff.sdk.internal.af$a r1 = com.veriff.sdk.internal.C21392af.C21394a.ALPHA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f53826a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.veriff.sdk.internal.af$a r1 = com.veriff.sdk.internal.C21392af.C21394a.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f53826a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.veriff.sdk.internal.af$a r1 = com.veriff.sdk.internal.C21392af.C21394a.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f53826a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.veriff.sdk.internal.af$a r1 = com.veriff.sdk.internal.C21392af.C21394a.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f53826a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.veriff.sdk.internal.af$a r1 = com.veriff.sdk.internal.C21392af.C21394a.ALPHA_SHIFT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f53826a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.veriff.sdk.internal.af$a r1 = com.veriff.sdk.internal.C21392af.C21394a.PUNCT_SHIFT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21392af.C213931.<clinit>():void");
        }
    }

    /* renamed from: com.veriff.sdk.internal.af$a */
    public enum C21394a {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f53825c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        bigIntegerArr[1] = valueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f53825c;
            if (i < bigIntegerArr2.length) {
                bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(valueOf);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static C22582u m50907a(int[] iArr, String str) throws C21842j {
        int i;
        StringBuilder sb = new StringBuilder(iArr.length << 1);
        Charset charset = StandardCharsets.ISO_8859_1;
        int i2 = iArr[1];
        C21278aa aaVar = new C21278aa();
        int i3 = 2;
        while (i3 < iArr[0]) {
            if (i2 != 913) {
                switch (i2) {
                    case STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS:
                        i = m50906a(iArr, i3, sb);
                        break;
                    case 901:
                        i = m50904a(i2, iArr, charset, i3, sb);
                        break;
                    case 902:
                        i = m50910b(iArr, i3, sb);
                        break;
                    default:
                        switch (i2) {
                            case 922:
                            case 923:
                                throw C21842j.m53315a();
                            case 924:
                                break;
                            case 925:
                                i = i3 + 1;
                                break;
                            case 926:
                                i = i3 + 2;
                                break;
                            case 927:
                                i = i3 + 1;
                                charset = Charset.forName(C22541t.m54907a(iArr[i3]).name());
                                break;
                            case 928:
                                i = m50905a(iArr, i3, aaVar);
                                break;
                            default:
                                i = m50906a(iArr, i3 - 1, sb);
                                break;
                        }
                        i = m50904a(i2, iArr, charset, i3, sb);
                        break;
                }
            } else {
                i = i3 + 1;
                sb.append((char) iArr[i3]);
            }
            if (i < iArr.length) {
                i3 = i + 1;
                i2 = iArr[i];
            } else {
                throw C21842j.m53315a();
            }
        }
        if (sb.length() != 0) {
            C22582u uVar = new C22582u((byte[]) null, sb.toString(), (List<byte[]>) null, str);
            uVar.mo56839a((Object) aaVar);
            return uVar;
        }
        throw C21842j.m53315a();
    }

    /* renamed from: b */
    private static int m50910b(int[] iArr, int i, StringBuilder sb) throws C21842j {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (true) {
            int i3 = iArr[0];
            if (i >= i3 || z) {
                return i;
            }
            int i4 = i + 1;
            int i5 = iArr[i];
            if (i4 == i3) {
                z = true;
            }
            if (i5 < 900) {
                iArr2[i2] = i5;
                i2++;
            } else {
                if (!(i5 == 900 || i5 == 901 || i5 == 928)) {
                    switch (i5) {
                        case 922:
                        case 923:
                        case 924:
                            break;
                    }
                }
                i4--;
                z = true;
            }
            if ((i2 % 15 == 0 || i5 == 902 || z) && i2 > 0) {
                sb.append(m50908a(iArr2, i2));
                i2 = 0;
            }
            i = i4;
        }
        return i;
    }

    /* renamed from: a */
    public static int m50905a(int[] iArr, int i, C21278aa aaVar) throws C21842j {
        if (i + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            int i2 = 0;
            while (i2 < 2) {
                iArr2[i2] = iArr[i];
                i2++;
                i++;
            }
            aaVar.mo53646a(Integer.parseInt(m50908a(iArr2, 2)));
            StringBuilder sb = new StringBuilder();
            int a = m50906a(iArr, i, sb);
            aaVar.mo53648a(sb.toString());
            int i3 = iArr[a] == 923 ? a + 1 : -1;
            while (a < iArr[0]) {
                int i4 = iArr[a];
                if (i4 == 922) {
                    a++;
                    aaVar.mo53649a(true);
                } else if (i4 == 923) {
                    int i5 = a + 1;
                    switch (iArr[i5]) {
                        case 0:
                            StringBuilder sb2 = new StringBuilder();
                            a = m50906a(iArr, i5 + 1, sb2);
                            aaVar.mo53657d(sb2.toString());
                            break;
                        case 1:
                            StringBuilder sb3 = new StringBuilder();
                            a = m50910b(iArr, i5 + 1, sb3);
                            aaVar.mo53652b(Integer.parseInt(sb3.toString()));
                            break;
                        case 2:
                            StringBuilder sb4 = new StringBuilder();
                            a = m50910b(iArr, i5 + 1, sb4);
                            aaVar.mo53653b(Long.parseLong(sb4.toString()));
                            break;
                        case 3:
                            StringBuilder sb5 = new StringBuilder();
                            a = m50906a(iArr, i5 + 1, sb5);
                            aaVar.mo53654b(sb5.toString());
                            break;
                        case 4:
                            StringBuilder sb6 = new StringBuilder();
                            a = m50906a(iArr, i5 + 1, sb6);
                            aaVar.mo53656c(sb6.toString());
                            break;
                        case 5:
                            StringBuilder sb7 = new StringBuilder();
                            a = m50910b(iArr, i5 + 1, sb7);
                            aaVar.mo53647a(Long.parseLong(sb7.toString()));
                            break;
                        case 6:
                            StringBuilder sb8 = new StringBuilder();
                            a = m50910b(iArr, i5 + 1, sb8);
                            aaVar.mo53655c(Integer.parseInt(sb8.toString()));
                            break;
                        default:
                            throw C21842j.m53315a();
                    }
                } else {
                    throw C21842j.m53315a();
                }
            }
            if (i3 != -1) {
                int i6 = a - i3;
                if (aaVar.mo53651a()) {
                    i6--;
                }
                aaVar.mo53650a(Arrays.copyOfRange(iArr, i3, i6 + i3));
            }
            return a;
        }
        throw C21842j.m53315a();
    }

    /* renamed from: a */
    private static int m50906a(int[] iArr, int i, StringBuilder sb) {
        int i2 = iArr[0];
        int[] iArr2 = new int[((i2 - i) << 1)];
        int[] iArr3 = new int[((i2 - i) << 1)];
        boolean z = false;
        int i3 = 0;
        while (i < iArr[0] && !z) {
            int i4 = i + 1;
            int i5 = iArr[i];
            if (i5 < 900) {
                iArr2[i3] = i5 / 30;
                iArr2[i3 + 1] = i5 % 30;
                i3 += 2;
            } else if (i5 != 913) {
                if (i5 != 928) {
                    switch (i5) {
                        case STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS:
                            iArr2[i3] = 900;
                            i3++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i5) {
                                case 922:
                                case 923:
                                case 924:
                                    break;
                            }
                    }
                }
                i = i4 - 1;
                z = true;
            } else {
                iArr2[i3] = 913;
                i = i4 + 1;
                iArr3[i3] = iArr[i4];
                i3++;
            }
            i = i4;
        }
        m50909a(iArr2, iArr3, i3, sb);
        return i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b3, code lost:
        r6 = (char) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bf, code lost:
        r6 = 0;
        r11 = r2;
        r2 = r0;
        r0 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d4, code lost:
        if (r6 == 0) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d6, code lost:
        r15.append(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d9, code lost:
        r3 = r3 + 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m50909a(int[] r12, int[] r13, int r14, java.lang.StringBuilder r15) {
        /*
            com.veriff.sdk.internal.af$a r0 = com.veriff.sdk.internal.C21392af.C21394a.ALPHA
            r1 = 0
            r2 = r0
            r3 = 0
        L_0x0005:
            if (r3 >= r14) goto L_0x00dd
            r4 = r12[r3]
            int[] r5 = com.veriff.sdk.internal.C21392af.C213931.f53826a
            int r6 = r0.ordinal()
            r5 = r5[r6]
            r6 = 32
            r7 = 29
            r8 = 26
            r9 = 913(0x391, float:1.28E-42)
            r10 = 900(0x384, float:1.261E-42)
            switch(r5) {
                case 1: goto L_0x00af;
                case 2: goto L_0x008f;
                case 3: goto L_0x0068;
                case 4: goto L_0x004c;
                case 5: goto L_0x003b;
                case 6: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x00d3
        L_0x0020:
            if (r4 >= r7) goto L_0x0027
            char[] r0 = f53823a
            char r6 = r0[r4]
            goto L_0x0040
        L_0x0027:
            if (r4 == r7) goto L_0x0037
            if (r4 == r10) goto L_0x0037
            if (r4 == r9) goto L_0x002e
            goto L_0x0034
        L_0x002e:
            r0 = r13[r3]
            char r0 = (char) r0
            r15.append(r0)
        L_0x0034:
            r0 = r2
            goto L_0x00d3
        L_0x0037:
            com.veriff.sdk.internal.af$a r0 = com.veriff.sdk.internal.C21392af.C21394a.ALPHA
            goto L_0x00d3
        L_0x003b:
            if (r4 >= r8) goto L_0x0043
            int r4 = r4 + 65
            char r6 = (char) r4
        L_0x0040:
            r0 = r2
            goto L_0x00d4
        L_0x0043:
            if (r4 == r8) goto L_0x0040
            if (r4 == r10) goto L_0x0048
            goto L_0x0034
        L_0x0048:
            com.veriff.sdk.internal.af$a r0 = com.veriff.sdk.internal.C21392af.C21394a.ALPHA
            goto L_0x00d3
        L_0x004c:
            if (r4 >= r7) goto L_0x0054
            char[] r5 = f53823a
            char r6 = r5[r4]
            goto L_0x00d4
        L_0x0054:
            if (r4 == r7) goto L_0x0064
            if (r4 == r10) goto L_0x0064
            if (r4 == r9) goto L_0x005c
            goto L_0x00d3
        L_0x005c:
            r4 = r13[r3]
            char r4 = (char) r4
            r15.append(r4)
            goto L_0x00d3
        L_0x0064:
            com.veriff.sdk.internal.af$a r0 = com.veriff.sdk.internal.C21392af.C21394a.ALPHA
            goto L_0x00d3
        L_0x0068:
            r5 = 25
            if (r4 >= r5) goto L_0x0072
            char[] r5 = f53824b
            char r6 = r5[r4]
            goto L_0x00d4
        L_0x0072:
            if (r4 == r10) goto L_0x008c
            if (r4 == r9) goto L_0x0085
            switch(r4) {
                case 25: goto L_0x0082;
                case 26: goto L_0x00d4;
                case 27: goto L_0x007e;
                case 28: goto L_0x008c;
                case 29: goto L_0x007b;
                default: goto L_0x0079;
            }
        L_0x0079:
            goto L_0x00d3
        L_0x007b:
            com.veriff.sdk.internal.af$a r2 = com.veriff.sdk.internal.C21392af.C21394a.PUNCT_SHIFT
            goto L_0x00bf
        L_0x007e:
            com.veriff.sdk.internal.af$a r0 = com.veriff.sdk.internal.C21392af.C21394a.LOWER
            goto L_0x00d3
        L_0x0082:
            com.veriff.sdk.internal.af$a r0 = com.veriff.sdk.internal.C21392af.C21394a.PUNCT
            goto L_0x00d3
        L_0x0085:
            r4 = r13[r3]
            char r4 = (char) r4
            r15.append(r4)
            goto L_0x00d3
        L_0x008c:
            com.veriff.sdk.internal.af$a r0 = com.veriff.sdk.internal.C21392af.C21394a.ALPHA
            goto L_0x00d3
        L_0x008f:
            if (r4 >= r8) goto L_0x0094
            int r4 = r4 + 97
            goto L_0x00b3
        L_0x0094:
            if (r4 == r10) goto L_0x00ac
            if (r4 == r9) goto L_0x00a5
            switch(r4) {
                case 26: goto L_0x00d4;
                case 27: goto L_0x00a2;
                case 28: goto L_0x009f;
                case 29: goto L_0x009c;
                default: goto L_0x009b;
            }
        L_0x009b:
            goto L_0x00d3
        L_0x009c:
            com.veriff.sdk.internal.af$a r2 = com.veriff.sdk.internal.C21392af.C21394a.PUNCT_SHIFT
            goto L_0x00bf
        L_0x009f:
            com.veriff.sdk.internal.af$a r0 = com.veriff.sdk.internal.C21392af.C21394a.MIXED
            goto L_0x00d3
        L_0x00a2:
            com.veriff.sdk.internal.af$a r2 = com.veriff.sdk.internal.C21392af.C21394a.ALPHA_SHIFT
            goto L_0x00bf
        L_0x00a5:
            r4 = r13[r3]
            char r4 = (char) r4
            r15.append(r4)
            goto L_0x00d3
        L_0x00ac:
            com.veriff.sdk.internal.af$a r0 = com.veriff.sdk.internal.C21392af.C21394a.ALPHA
            goto L_0x00d3
        L_0x00af:
            if (r4 >= r8) goto L_0x00b5
            int r4 = r4 + 65
        L_0x00b3:
            char r6 = (char) r4
            goto L_0x00d4
        L_0x00b5:
            if (r4 == r10) goto L_0x00d1
            if (r4 == r9) goto L_0x00ca
            switch(r4) {
                case 26: goto L_0x00d4;
                case 27: goto L_0x00c7;
                case 28: goto L_0x00c4;
                case 29: goto L_0x00bd;
                default: goto L_0x00bc;
            }
        L_0x00bc:
            goto L_0x00d3
        L_0x00bd:
            com.veriff.sdk.internal.af$a r2 = com.veriff.sdk.internal.C21392af.C21394a.PUNCT_SHIFT
        L_0x00bf:
            r6 = 0
            r11 = r2
            r2 = r0
            r0 = r11
            goto L_0x00d4
        L_0x00c4:
            com.veriff.sdk.internal.af$a r0 = com.veriff.sdk.internal.C21392af.C21394a.MIXED
            goto L_0x00d3
        L_0x00c7:
            com.veriff.sdk.internal.af$a r0 = com.veriff.sdk.internal.C21392af.C21394a.LOWER
            goto L_0x00d3
        L_0x00ca:
            r4 = r13[r3]
            char r4 = (char) r4
            r15.append(r4)
            goto L_0x00d3
        L_0x00d1:
            com.veriff.sdk.internal.af$a r0 = com.veriff.sdk.internal.C21392af.C21394a.ALPHA
        L_0x00d3:
            r6 = 0
        L_0x00d4:
            if (r6 == 0) goto L_0x00d9
            r15.append(r6)
        L_0x00d9:
            int r3 = r3 + 1
            goto L_0x0005
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21392af.m50909a(int[], int[], int, java.lang.StringBuilder):void");
    }

    /* renamed from: a */
    private static int m50904a(int i, int[] iArr, Charset charset, int i2, StringBuilder sb) {
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int i7 = i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        long j2 = 900;
        int i8 = 6;
        if (i7 == 901) {
            int[] iArr2 = new int[6];
            int i9 = i2 + 1;
            int i11 = iArr[i2];
            boolean z = false;
            while (true) {
                i6 = 0;
                long j3 = 0;
                while (true) {
                    int i12 = iArr[0];
                    if (i5 < i12 && !z) {
                        int i13 = i6 + 1;
                        iArr2[i6] = i4;
                        j3 = (j3 * j) + ((long) i4);
                        int i14 = i5 + 1;
                        i11 = iArr[i5];
                        if (i11 != 928) {
                            switch (i11) {
                                case STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS:
                                case 901:
                                case 902:
                                    break;
                                default:
                                    switch (i11) {
                                        case 922:
                                        case 923:
                                        case 924:
                                            break;
                                        default:
                                            if (i13 % 5 != 0 || i13 <= 0) {
                                                i4 = i11;
                                                i5 = i14;
                                                i6 = i13;
                                                j = 900;
                                                i8 = 6;
                                                break;
                                            } else {
                                                int i15 = 0;
                                                while (i15 < i8) {
                                                    byteArrayOutputStream.write((byte) ((int) (j3 >> ((5 - i15) * 8))));
                                                    i15++;
                                                    i11 = i11;
                                                    i8 = 6;
                                                }
                                                int i16 = i11;
                                                i9 = i14;
                                                j2 = 900;
                                            }
                                    }
                                    break;
                            }
                        }
                        i5 = i14 - 1;
                        i4 = i11;
                        i6 = i13;
                        j = 900;
                        i8 = 6;
                        z = true;
                    } else if (i5 == i12 && i4 < 900) {
                        iArr2[i6] = i4;
                        i6++;
                    }
                }
            }
            iArr2[i6] = i4;
            i6++;
            for (int i17 = 0; i17 < i6; i17++) {
                byteArrayOutputStream.write((byte) iArr2[i17]);
            }
            i3 = i5;
        } else if (i7 != 924) {
            i3 = i2;
        } else {
            i3 = i2;
            boolean z2 = false;
            while (true) {
                int i18 = 0;
                long j4 = 0;
                while (i3 < iArr[0] && !z2) {
                    int i19 = i3 + 1;
                    int i21 = iArr[i3];
                    if (i21 < 900) {
                        i18++;
                        j4 = (j4 * 900) + ((long) i21);
                    } else {
                        if (i21 != 928) {
                            switch (i21) {
                                case STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS:
                                case 901:
                                case 902:
                                    break;
                                default:
                                    switch (i21) {
                                        case 922:
                                        case 923:
                                        case 924:
                                            break;
                                    }
                            }
                        }
                        i3 = i19 - 1;
                        z2 = true;
                        if (i18 % 5 != 0 && i18 > 0) {
                            for (int i22 = 0; i22 < 6; i22++) {
                                byteArrayOutputStream.write((byte) ((int) (j4 >> ((5 - i22) * 8))));
                            }
                        }
                    }
                    i3 = i19;
                    if (i18 % 5 != 0) {
                    }
                }
            }
        }
        sb.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return i3;
    }

    /* renamed from: a */
    private static String m50908a(int[] iArr, int i) throws C21842j {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(f53825c[(i - i2) - 1].multiply(BigInteger.valueOf((long) iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw C21842j.m53315a();
    }
}
