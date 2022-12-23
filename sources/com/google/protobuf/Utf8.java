package com.google.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import p911xg.C20491a;
import p911xg.C20518x;

public final class Utf8 {

    /* renamed from: a */
    public static final C14576a f36813a;

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i2) {
            super(C13715c.m34244j("Unpaired surrogate at index ", i, " of ", i2));
        }
    }

    /* renamed from: com.google.protobuf.Utf8$a */
    public static abstract class C14576a {
        /* renamed from: a */
        public abstract int mo43979a(CharSequence charSequence, byte[] bArr, int i, int i2);

        /* renamed from: b */
        public abstract int mo43980b(int i, int i2, byte[] bArr);
    }

    /* renamed from: com.google.protobuf.Utf8$b */
    public static final class C14577b extends C14576a {
        /* renamed from: a */
        public final int mo43979a(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            int i5;
            char charAt;
            int length = charSequence.length();
            int i6 = i2 + i;
            int i7 = 0;
            while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
                bArr[i5] = (byte) charAt;
                i7++;
            }
            if (i7 == length) {
                return i + length;
            }
            int i8 = i + i7;
            while (i7 < length) {
                char charAt2 = charSequence.charAt(i7);
                if (charAt2 < 128 && i8 < i6) {
                    i3 = i8 + 1;
                    bArr[i8] = (byte) charAt2;
                } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                    i8 = i9 + 1;
                    bArr[i9] = (byte) ((charAt2 & '?') | 128);
                    i7++;
                } else if ((charAt2 < 55296 || 57343 < charAt2) && i8 <= i6 - 3) {
                    int i11 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 12) | 480);
                    int i12 = i11 + 1;
                    bArr[i11] = (byte) (((charAt2 >>> 6) & 63) | RecyclerView.C1119a0.FLAG_IGNORE);
                    i3 = i12 + 1;
                    bArr[i12] = (byte) ((charAt2 & '?') | 128);
                } else if (i8 <= i6 - 4) {
                    int i13 = i7 + 1;
                    if (i13 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i13);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i14 = i8 + 1;
                            bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                            int i15 = i14 + 1;
                            bArr[i14] = (byte) (((codePoint >>> 12) & 63) | RecyclerView.C1119a0.FLAG_IGNORE);
                            int i16 = i15 + 1;
                            bArr[i15] = (byte) (((codePoint >>> 6) & 63) | RecyclerView.C1119a0.FLAG_IGNORE);
                            i8 = i16 + 1;
                            bArr[i16] = (byte) ((codePoint & 63) | RecyclerView.C1119a0.FLAG_IGNORE);
                            i7 = i13;
                            i7++;
                        } else {
                            i7 = i13;
                        }
                    }
                    throw new UnpairedSurrogateException(i7 - 1, length);
                } else if (55296 > charAt2 || charAt2 > 57343 || ((i4 = i7 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i4)))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i8);
                } else {
                    throw new UnpairedSurrogateException(i7, length);
                }
                i8 = i3;
                i7++;
            }
            return i8;
        }

        /* renamed from: b */
        public final int mo43980b(int i, int i2, byte[] bArr) {
            while (r6 < i2 && bArr[r6] >= 0) {
                i = r6 + 1;
            }
            if (r6 < i2) {
                while (r6 < i2) {
                    int i3 = r6 + 1;
                    byte b = bArr[r6];
                    if (b < 0) {
                        if (b < -32) {
                            if (i3 >= i2) {
                                return b;
                            }
                            if (b >= -62) {
                                r6 = i3 + 1;
                                if (bArr[i3] > -65) {
                                }
                            }
                        } else if (b < -16) {
                            if (i3 >= i2 - 1) {
                                return Utf8.m36528a(i3, i2, bArr);
                            }
                            int i4 = i3 + 1;
                            byte b2 = bArr[i3];
                            if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                                r6 = i4 + 1;
                                if (bArr[i4] > -65) {
                                }
                            }
                        } else if (i3 >= i2 - 2) {
                            return Utf8.m36528a(i3, i2, bArr);
                        } else {
                            int i5 = i3 + 1;
                            byte b3 = bArr[i3];
                            if (b3 <= -65) {
                                if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                                    int i6 = i5 + 1;
                                    if (bArr[i5] <= -65) {
                                        i3 = i6 + 1;
                                        if (bArr[i6] > -65) {
                                        }
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    r6 = i3;
                }
            }
            return 0;
        }
    }

    /* renamed from: com.google.protobuf.Utf8$c */
    public static final class C14578c extends C14576a {
        /* renamed from: c */
        public static int m36536c(int i, int i2, long j, byte[] bArr) {
            if (i2 == 0) {
                C14576a aVar = Utf8.f36813a;
                if (i > -12) {
                    return -1;
                }
                return i;
            } else if (i2 == 1) {
                return Utf8.m36530c(i, C20518x.m48165h(j, bArr));
            } else {
                if (i2 == 2) {
                    return Utf8.m36531d(i, C20518x.m48165h(j, bArr), C20518x.m48165h(j + 1, bArr));
                }
                throw new AssertionError();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:38:0x00ef, LOOP_START, PHI: r2 r3 r4 r11 
          PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x002f, B:38:0x00ef] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:10:0x002f, B:38:0x00ef] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v3 long) = (r4v2 long), (r4v4 long) binds: [B:10:0x002f, B:38:0x00ef] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x002f, B:38:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo43979a(java.lang.CharSequence r21, byte[] r22, int r23, int r24) {
            /*
                r20 = this;
                r0 = r21
                r1 = r22
                r2 = r23
                r3 = r24
                long r4 = (long) r2
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r21.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L_0x0133
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L_0x0133
                r2 = 0
            L_0x001a:
                r11 = 1
                r3 = 128(0x80, float:1.794E-43)
                if (r2 >= r8) goto L_0x002f
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x002f
                long r11 = r11 + r4
                byte r3 = (byte) r13
                p911xg.C20518x.m48174q(r1, r4, r3)
                int r2 = r2 + 1
                r4 = r11
                goto L_0x001a
            L_0x002f:
                if (r2 != r8) goto L_0x0033
                int r0 = (int) r4
                return r0
            L_0x0033:
                if (r2 >= r8) goto L_0x0131
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x0045
                int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r3 >= 0) goto L_0x0045
                long r11 = r11 + r4
                byte r3 = (byte) r13
                p911xg.C20518x.m48174q(r1, r4, r3)
                goto L_0x009b
            L_0x0045:
                r3 = 2048(0x800, float:2.87E-42)
                if (r13 >= r3) goto L_0x0068
                r14 = 2
                long r14 = r6 - r14
                int r3 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r3 > 0) goto L_0x0068
                long r14 = r4 + r11
                int r3 = r13 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                p911xg.C20518x.m48174q(r1, r4, r3)
                long r3 = r14 + r11
                r5 = r13 & 63
                r5 = r5 | 128(0x80, float:1.794E-43)
                byte r5 = (byte) r5
                p911xg.C20518x.m48174q(r1, r14, r5)
                r4 = r3
                goto L_0x00ef
            L_0x0068:
                r3 = 57343(0xdfff, float:8.0355E-41)
                r14 = 55296(0xd800, float:7.7486E-41)
                if (r13 < r14) goto L_0x0072
                if (r3 >= r13) goto L_0x00a3
            L_0x0072:
                r15 = 3
                long r15 = r6 - r15
                int r17 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r17 > 0) goto L_0x00a3
                long r14 = r4 + r11
                int r3 = r13 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                p911xg.C20518x.m48174q(r1, r4, r3)
                long r11 = r11 + r14
                int r3 = r13 >>> 6
                r3 = r3 & 63
                r3 = r3 | 128(0x80, float:1.794E-43)
                byte r3 = (byte) r3
                p911xg.C20518x.m48174q(r1, r14, r3)
                r3 = 1
                long r3 = r3 + r11
                r5 = r13 & 63
                r5 = r5 | 128(0x80, float:1.794E-43)
                byte r5 = (byte) r5
                p911xg.C20518x.m48174q(r1, r11, r5)
                r11 = r3
            L_0x009b:
                r3 = 1
                r18 = r3
                r4 = r11
                r11 = r18
                goto L_0x00ef
            L_0x00a3:
                r11 = 4
                long r11 = r6 - r11
                int r15 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r15 > 0) goto L_0x00fe
                int r3 = r2 + 1
                if (r3 == r8) goto L_0x00f6
                char r2 = r0.charAt(r3)
                boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
                if (r11 == 0) goto L_0x00f5
                int r2 = java.lang.Character.toCodePoint(r13, r2)
                r11 = 1
                long r13 = r4 + r11
                int r15 = r2 >>> 18
                r15 = r15 | 240(0xf0, float:3.36E-43)
                byte r15 = (byte) r15
                p911xg.C20518x.m48174q(r1, r4, r15)
                long r11 = r11 + r13
                int r4 = r2 >>> 12
                r4 = r4 & 63
                r4 = r4 | 128(0x80, float:1.794E-43)
                byte r4 = (byte) r4
                p911xg.C20518x.m48174q(r1, r13, r4)
                r4 = 1
                long r4 = r4 + r11
                int r13 = r2 >>> 6
                r13 = r13 & 63
                r13 = r13 | 128(0x80, float:1.794E-43)
                byte r13 = (byte) r13
                p911xg.C20518x.m48174q(r1, r11, r13)
                r11 = 1
                long r13 = r4 + r11
                r2 = r2 & 63
                r2 = r2 | 128(0x80, float:1.794E-43)
                byte r2 = (byte) r2
                p911xg.C20518x.m48174q(r1, r4, r2)
                r2 = r3
                r4 = r13
            L_0x00ef:
                int r2 = r2 + 1
                r3 = 128(0x80, float:1.794E-43)
                goto L_0x0033
            L_0x00f5:
                r2 = r3
            L_0x00f6:
                com.google.protobuf.Utf8$UnpairedSurrogateException r0 = new com.google.protobuf.Utf8$UnpairedSurrogateException
                int r2 = r2 + -1
                r0.<init>(r2, r8)
                throw r0
            L_0x00fe:
                if (r14 > r13) goto L_0x0116
                if (r13 > r3) goto L_0x0116
                int r1 = r2 + 1
                if (r1 == r8) goto L_0x0110
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
                if (r0 != 0) goto L_0x0116
            L_0x0110:
                com.google.protobuf.Utf8$UnpairedSurrogateException r0 = new com.google.protobuf.Utf8$UnpairedSurrogateException
                r0.<init>(r2, r8)
                throw r0
            L_0x0116:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r13)
                r1.append(r9)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0131:
                int r0 = (int) r4
                return r0
            L_0x0133:
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r4 = p379.C13555b.m33972k(r10)
                int r8 = r8 + -1
                char r0 = r0.charAt(r8)
                r4.append(r0)
                r4.append(r9)
                int r0 = r2 + r3
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.C14578c.mo43979a(java.lang.CharSequence, byte[], int, int):int");
        }

        /* renamed from: b */
        public final int mo43980b(int i, int i2, byte[] bArr) {
            int i3;
            long j;
            int i4 = i;
            int i5 = i2;
            byte[] bArr2 = bArr;
            if ((i4 | i5 | (bArr2.length - i5)) >= 0) {
                long j2 = (long) i4;
                int i6 = (int) (((long) i5) - j2);
                if (i6 >= 16) {
                    long j3 = j2;
                    i3 = 0;
                    while (true) {
                        if (i3 >= i6) {
                            i3 = i6;
                            break;
                        }
                        long j4 = j3 + 1;
                        if (C20518x.m48165h(j3, bArr2) < 0) {
                            break;
                        }
                        i3++;
                        j3 = j4;
                    }
                } else {
                    i3 = 0;
                }
                int i7 = i6 - i3;
                long j5 = j2 + ((long) i3);
                while (true) {
                    byte b = 0;
                    while (true) {
                        if (i7 <= 0) {
                            break;
                        }
                        long j6 = j5 + 1;
                        b = C20518x.m48165h(j5, bArr2);
                        if (b < 0) {
                            j5 = j6;
                            break;
                        }
                        i7--;
                        j5 = j6;
                    }
                    if (i7 == 0) {
                        return 0;
                    }
                    int i8 = i7 - 1;
                    if (b >= -32) {
                        if (b >= -16) {
                            if (i8 >= 3) {
                                i7 = i8 - 3;
                                long j7 = j5 + 1;
                                byte h = C20518x.m48165h(j5, bArr2);
                                if (h > -65) {
                                    break;
                                }
                                if ((((h + 112) + (b << 28)) >> 30) != 0) {
                                    break;
                                }
                                long j8 = j7 + 1;
                                if (C20518x.m48165h(j7, bArr2) > -65) {
                                    break;
                                }
                                j = j8 + 1;
                                if (C20518x.m48165h(j8, bArr2) > -65) {
                                    break;
                                }
                            } else {
                                return m36536c(b, i8, j5, bArr2);
                            }
                        } else if (i8 >= 2) {
                            i7 = i8 - 2;
                            long j9 = j5 + 1;
                            byte h2 = C20518x.m48165h(j5, bArr2);
                            if (h2 > -65 || ((b == -32 && h2 < -96) || (b == -19 && h2 >= -96))) {
                                break;
                            }
                            j5 = j9 + 1;
                            if (C20518x.m48165h(j9, bArr2) > -65) {
                                break;
                            }
                        } else {
                            return m36536c(b, i8, j5, bArr2);
                        }
                    } else if (i8 != 0) {
                        i7 = i8 - 1;
                        if (b < -62) {
                            break;
                        }
                        j = j5 + 1;
                        if (C20518x.m48165h(j5, bArr2) > -65) {
                            break;
                        }
                    } else {
                        return b;
                    }
                    j5 = j;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr2.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }
    }

    static {
        boolean z;
        C14576a aVar;
        if (!C20518x.f51911e || !C20518x.f51910d) {
            z = false;
        } else {
            z = true;
        }
        if (!z || C20491a.m48115a()) {
            aVar = new C14577b();
        } else {
            aVar = new C14578c();
        }
        f36813a = aVar;
    }

    /* renamed from: a */
    public static int m36528a(int i, int i2, byte[] bArr) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                b = -1;
            }
            return b;
        } else if (i3 == 1) {
            return m36530c(b, bArr[i]);
        } else {
            if (i3 == 2) {
                return m36531d(b, bArr[i], bArr[i + 1]);
            }
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    public static int m36529b(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new UnpairedSurrogateException(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder k = C13555b.m33972k("UTF-8 length does not fit in int: ");
        k.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(k.toString());
    }

    /* renamed from: c */
    public static int m36530c(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: d */
    public static int m36531d(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
