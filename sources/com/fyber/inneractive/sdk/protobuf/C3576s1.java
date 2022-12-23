package com.fyber.inneractive.sdk.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.protobuf.C3569r1;
import java.nio.ByteBuffer;

/* renamed from: com.fyber.inneractive.sdk.protobuf.s1 */
public final class C3576s1 {

    /* renamed from: a */
    public static final C3578b f12550a;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.s1$b */
    public static abstract class C3578b {
        /* renamed from: a */
        public abstract int mo15179a(int i, byte[] bArr, int i2, int i3);

        /* renamed from: a */
        public abstract int mo15180a(CharSequence charSequence, byte[] bArr, int i, int i2);

        /* renamed from: a */
        public final String mo15181a(ByteBuffer byteBuffer, int i, int i2) throws C3476a0 {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r13 < i3) {
                    byte b = byteBuffer.get(r13);
                    if (!C3577a.m9509a(b)) {
                        break;
                    }
                    i = r13 + 1;
                    cArr[i4] = (char) b;
                    i4++;
                }
                int i5 = i4;
                while (r13 < i3) {
                    int i6 = r13 + 1;
                    byte b2 = byteBuffer.get(r13);
                    if (C3577a.m9509a(b2)) {
                        int i7 = i5 + 1;
                        cArr[i5] = (char) b2;
                        r13 = i6;
                        while (true) {
                            i5 = i7;
                            if (r13 >= i3) {
                                break;
                            }
                            byte b3 = byteBuffer.get(r13);
                            if (!C3577a.m9509a(b3)) {
                                break;
                            }
                            r13++;
                            i7 = i5 + 1;
                            cArr[i5] = (char) b3;
                        }
                    } else if (C3577a.m9510b(b2)) {
                        if (i6 < i3) {
                            C3577a.m9508a(b2, byteBuffer.get(i6), cArr, i5);
                            r13 = i6 + 1;
                            i5++;
                        } else {
                            throw C3476a0.m8729c();
                        }
                    } else if (C3577a.m9511c(b2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            C3577a.m9507a(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                            r13 = i8 + 1;
                            i5++;
                        } else {
                            throw C3476a0.m8729c();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        byte b4 = byteBuffer.get(i6);
                        int i11 = i9 + 1;
                        C3577a.m9506a(b2, b4, byteBuffer.get(i9), byteBuffer.get(i11), cArr, i5);
                        i5 = i5 + 1 + 1;
                        r13 = i11 + 1;
                    } else {
                        throw C3476a0.m8729c();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: a */
        public abstract String mo15182a(byte[] bArr, int i, int i2) throws C3476a0;

        /* renamed from: b */
        public abstract String mo15183b(ByteBuffer byteBuffer, int i, int i2) throws C3476a0;
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.s1$d */
    public static class C3580d extends IllegalArgumentException {
        public C3580d(int i, int i2) {
            super(C13715c.m34244j("Unpaired surrogate at index ", i, " of ", i2));
        }
    }

    static {
        boolean z;
        C3578b bVar;
        if (!C3569r1.f12545g || !C3569r1.f12544f) {
            z = false;
        } else {
            z = true;
        }
        if (!z || C3487d.m8743a()) {
            bVar = new C3579c();
        } else {
            bVar = new C3581e();
        }
        f12550a = bVar;
    }

    /* renamed from: a */
    public static int m9499a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: a */
    public static int m9500a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: a */
    public static int m9501a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: a */
    public static boolean m9504a(byte[] bArr) {
        if (f12550a.mo15179a(0, bArr, 0, bArr.length) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m9505b(byte[] bArr, int i, int i2) {
        if (f12550a.mo15179a(0, bArr, i, i2) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.s1$a */
    public static class C3577a {
        /* renamed from: a */
        public static void m9508a(byte b, byte b2, char[] cArr, int i) throws C3476a0 {
            if (b < -62 || m9512d(b2)) {
                throw C3476a0.m8729c();
            }
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
        }

        /* renamed from: a */
        public static boolean m9509a(byte b) {
            return b >= 0;
        }

        /* renamed from: b */
        public static boolean m9510b(byte b) {
            return b < -32;
        }

        /* renamed from: c */
        public static boolean m9511c(byte b) {
            return b < -16;
        }

        /* renamed from: d */
        public static boolean m9512d(byte b) {
            return b > -65;
        }

        /* renamed from: a */
        public static void m9507a(byte b, byte b2, byte b3, char[] cArr, int i) throws C3476a0 {
            if (m9512d(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m9512d(b3)))) {
                throw C3476a0.m8729c();
            }
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
        }

        /* renamed from: a */
        public static void m9506a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws C3476a0 {
            if (!m9512d(b2)) {
                if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m9512d(b3) && !m9512d(b4)) {
                    byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                    cArr[i] = (char) ((b5 >>> 10) + 55232);
                    cArr[i + 1] = (char) ((b5 & 1023) + 56320);
                    return;
                }
            }
            throw C3476a0.m8729c();
        }
    }

    /* renamed from: a */
    public static int m9503a(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m9499a((int) b);
        }
        if (i3 == 1) {
            return m9500a(b, bArr[i]);
        }
        if (i3 == 2) {
            return m9501a((int) b, (int) bArr[i], (int) bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static int m9502a(CharSequence charSequence) {
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
                                throw new C3580d(i2, length2);
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

    /* renamed from: com.fyber.inneractive.sdk.protobuf.s1$c */
    public static final class C3579c extends C3578b {
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
            if (r13[r14] > -65) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0082, code lost:
            if (r13[r14] > -65) goto L_0x0084;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            if (r13[r14] > -65) goto L_0x0022;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo15179a(int r12, byte[] r13, int r14, int r15) {
            /*
                r11 = this;
                r0 = -19
                r1 = 0
                r2 = -62
                r3 = -16
                r4 = -96
                r5 = -1
                r6 = -32
                r7 = -65
                if (r12 == 0) goto L_0x0085
                if (r14 < r15) goto L_0x0013
                return r12
            L_0x0013:
                byte r8 = (byte) r12
                if (r8 >= r6) goto L_0x0023
                if (r8 < r2) goto L_0x0022
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r14 <= r7) goto L_0x001f
                goto L_0x0022
            L_0x001f:
                r14 = r12
                goto L_0x0085
            L_0x0022:
                return r5
            L_0x0023:
                if (r8 >= r3) goto L_0x004a
                int r12 = r12 >> 8
                int r12 = ~r12
                byte r12 = (byte) r12
                if (r12 != 0) goto L_0x0039
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r12 < r15) goto L_0x0036
                int r12 = com.fyber.inneractive.sdk.protobuf.C3576s1.m9500a(r8, r14)
                return r12
            L_0x0036:
                r10 = r14
                r14 = r12
                r12 = r10
            L_0x0039:
                if (r12 > r7) goto L_0x0049
                if (r8 != r6) goto L_0x003f
                if (r12 < r4) goto L_0x0049
            L_0x003f:
                if (r8 != r0) goto L_0x0043
                if (r12 >= r4) goto L_0x0049
            L_0x0043:
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r14 <= r7) goto L_0x001f
            L_0x0049:
                return r5
            L_0x004a:
                int r9 = r12 >> 8
                int r9 = ~r9
                byte r9 = (byte) r9
                if (r9 != 0) goto L_0x005e
                int r12 = r14 + 1
                byte r9 = r13[r14]
                if (r12 < r15) goto L_0x005b
                int r12 = com.fyber.inneractive.sdk.protobuf.C3576s1.m9500a(r8, r9)
                return r12
            L_0x005b:
                r14 = r12
                r12 = 0
                goto L_0x0061
            L_0x005e:
                int r12 = r12 >> 16
                byte r12 = (byte) r12
            L_0x0061:
                if (r12 != 0) goto L_0x0071
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r12 < r15) goto L_0x006e
                int r12 = com.fyber.inneractive.sdk.protobuf.C3576s1.m9501a((int) r8, (int) r9, (int) r14)
                return r12
            L_0x006e:
                r10 = r14
                r14 = r12
                r12 = r10
            L_0x0071:
                if (r9 > r7) goto L_0x0084
                int r8 = r8 << 28
                int r9 = r9 + 112
                int r9 = r9 + r8
                int r8 = r9 >> 30
                if (r8 != 0) goto L_0x0084
                if (r12 > r7) goto L_0x0084
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r14 <= r7) goto L_0x001f
            L_0x0084:
                return r5
            L_0x0085:
                if (r14 >= r15) goto L_0x008e
                byte r12 = r13[r14]
                if (r12 < 0) goto L_0x008e
                int r14 = r14 + 1
                goto L_0x0085
            L_0x008e:
                if (r14 < r15) goto L_0x0092
                goto L_0x00ef
            L_0x0092:
                if (r14 < r15) goto L_0x0095
                goto L_0x00ef
            L_0x0095:
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r14 >= 0) goto L_0x00f0
                if (r14 >= r6) goto L_0x00aa
                if (r12 < r15) goto L_0x00a1
                r1 = r14
                goto L_0x00ef
            L_0x00a1:
                if (r14 < r2) goto L_0x00ee
                int r14 = r12 + 1
                byte r12 = r13[r12]
                if (r12 <= r7) goto L_0x0092
                goto L_0x00ee
            L_0x00aa:
                if (r14 >= r3) goto L_0x00ca
                int r8 = r15 + -1
                if (r12 < r8) goto L_0x00b5
                int r1 = com.fyber.inneractive.sdk.protobuf.C3576s1.m9503a((byte[]) r13, (int) r12, (int) r15)
                goto L_0x00ef
            L_0x00b5:
                int r8 = r12 + 1
                byte r12 = r13[r12]
                if (r12 > r7) goto L_0x00ee
                if (r14 != r6) goto L_0x00bf
                if (r12 < r4) goto L_0x00ee
            L_0x00bf:
                if (r14 != r0) goto L_0x00c3
                if (r12 >= r4) goto L_0x00ee
            L_0x00c3:
                int r14 = r8 + 1
                byte r12 = r13[r8]
                if (r12 <= r7) goto L_0x0092
                goto L_0x00ee
            L_0x00ca:
                int r8 = r15 + -2
                if (r12 < r8) goto L_0x00d3
                int r1 = com.fyber.inneractive.sdk.protobuf.C3576s1.m9503a((byte[]) r13, (int) r12, (int) r15)
                goto L_0x00ef
            L_0x00d3:
                int r8 = r12 + 1
                byte r12 = r13[r12]
                if (r12 > r7) goto L_0x00ee
                int r14 = r14 << 28
                int r12 = r12 + 112
                int r12 = r12 + r14
                int r12 = r12 >> 30
                if (r12 != 0) goto L_0x00ee
                int r12 = r8 + 1
                byte r14 = r13[r8]
                if (r14 > r7) goto L_0x00ee
                int r14 = r12 + 1
                byte r12 = r13[r12]
                if (r12 <= r7) goto L_0x0092
            L_0x00ee:
                r1 = -1
            L_0x00ef:
                return r1
            L_0x00f0:
                r14 = r12
                goto L_0x0092
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3576s1.C3579c.mo15179a(int, byte[], int, int):int");
        }

        /* renamed from: b */
        public String mo15183b(ByteBuffer byteBuffer, int i, int i2) throws C3476a0 {
            return mo15181a(byteBuffer, i, i2);
        }

        /* renamed from: a */
        public String mo15182a(byte[] bArr, int i, int i2) throws C3476a0 {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r13 < i3) {
                    byte b = bArr[r13];
                    if (!C3577a.m9509a(b)) {
                        break;
                    }
                    i = r13 + 1;
                    cArr[i4] = (char) b;
                    i4++;
                }
                int i5 = i4;
                while (r13 < i3) {
                    int i6 = r13 + 1;
                    byte b2 = bArr[r13];
                    if (C3577a.m9509a(b2)) {
                        int i7 = i5 + 1;
                        cArr[i5] = (char) b2;
                        r13 = i6;
                        while (true) {
                            i5 = i7;
                            if (r13 >= i3) {
                                break;
                            }
                            byte b3 = bArr[r13];
                            if (!C3577a.m9509a(b3)) {
                                break;
                            }
                            r13++;
                            i7 = i5 + 1;
                            cArr[i5] = (char) b3;
                        }
                    } else if (C3577a.m9510b(b2)) {
                        if (i6 < i3) {
                            C3577a.m9508a(b2, bArr[i6], cArr, i5);
                            r13 = i6 + 1;
                            i5++;
                        } else {
                            throw C3476a0.m8729c();
                        }
                    } else if (C3577a.m9511c(b2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            C3577a.m9507a(b2, bArr[i6], bArr[i8], cArr, i5);
                            r13 = i8 + 1;
                            i5++;
                        } else {
                            throw C3476a0.m8729c();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        byte b4 = bArr[i6];
                        int i11 = i9 + 1;
                        C3577a.m9506a(b2, b4, bArr[i9], bArr[i11], cArr, i5);
                        i5 = i5 + 1 + 1;
                        r13 = i11 + 1;
                    } else {
                        throw C3476a0.m8729c();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: a */
        public int mo15180a(CharSequence charSequence, byte[] bArr, int i, int i2) {
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
                    i4 = i8 + 1;
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
                    i4 = i12 + 1;
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
                    throw new C3580d(i7 - 1, length);
                } else if (55296 > charAt2 || charAt2 > 57343 || ((i3 = i7 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i8);
                } else {
                    throw new C3580d(i7, length);
                }
                i8 = i4;
                i7++;
            }
            return i8;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.s1$e */
    public static final class C3581e extends C3578b {
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
            if (com.fyber.inneractive.sdk.protobuf.C3569r1.m9417a(r1, r8) > -65) goto L_0x003c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
            if (com.fyber.inneractive.sdk.protobuf.C3569r1.m9417a(r1, r8) > -65) goto L_0x0068;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00aa, code lost:
            if (com.fyber.inneractive.sdk.protobuf.C3569r1.m9417a(r1, r8) > -65) goto L_0x00ac;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo15179a(int r22, byte[] r23, int r24, int r25) {
            /*
                r21 = this;
                r0 = r22
                r1 = r23
                r2 = r24
                r3 = r25
                r4 = r2 | r3
                int r5 = r1.length
                int r5 = r5 - r3
                r4 = r4 | r5
                r5 = 2
                if (r4 < 0) goto L_0x014d
                long r8 = (long) r2
                long r2 = (long) r3
                r4 = -19
                r10 = -62
                r11 = -16
                r12 = 16
                r13 = -96
                r14 = -32
                r15 = -1
                r7 = -65
                r16 = 1
                if (r0 == 0) goto L_0x00ad
                int r18 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r18 < 0) goto L_0x002a
                return r0
            L_0x002a:
                byte r6 = (byte) r0
                if (r6 >= r14) goto L_0x003d
                if (r6 < r10) goto L_0x003c
                long r19 = r8 + r16
                byte r0 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9417a((byte[]) r1, (long) r8)
                if (r0 <= r7) goto L_0x0038
                goto L_0x003c
            L_0x0038:
                r8 = r19
                goto L_0x00ad
            L_0x003c:
                return r15
            L_0x003d:
                if (r6 >= r11) goto L_0x0069
                int r0 = r0 >> 8
                int r0 = ~r0
                byte r0 = (byte) r0
                if (r0 != 0) goto L_0x0056
                long r19 = r8 + r16
                byte r0 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9417a((byte[]) r1, (long) r8)
                int r8 = (r19 > r2 ? 1 : (r19 == r2 ? 0 : -1))
                if (r8 < 0) goto L_0x0054
                int r0 = com.fyber.inneractive.sdk.protobuf.C3576s1.m9500a(r6, r0)
                return r0
            L_0x0054:
                r8 = r19
            L_0x0056:
                if (r0 > r7) goto L_0x0068
                if (r6 != r14) goto L_0x005c
                if (r0 < r13) goto L_0x0068
            L_0x005c:
                if (r6 != r4) goto L_0x0060
                if (r0 >= r13) goto L_0x0068
            L_0x0060:
                long r19 = r8 + r16
                byte r0 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9417a((byte[]) r1, (long) r8)
                if (r0 <= r7) goto L_0x0038
            L_0x0068:
                return r15
            L_0x0069:
                int r4 = r0 >> 8
                int r4 = ~r4
                byte r4 = (byte) r4
                if (r4 != 0) goto L_0x0082
                long r19 = r8 + r16
                byte r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9417a((byte[]) r1, (long) r8)
                int r0 = (r19 > r2 ? 1 : (r19 == r2 ? 0 : -1))
                if (r0 < 0) goto L_0x007e
                int r0 = com.fyber.inneractive.sdk.protobuf.C3576s1.m9500a(r6, r4)
                return r0
            L_0x007e:
                r8 = r19
                r0 = 0
                goto L_0x0084
            L_0x0082:
                int r0 = r0 >> r12
                byte r0 = (byte) r0
            L_0x0084:
                if (r0 != 0) goto L_0x0097
                long r19 = r8 + r16
                byte r0 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9417a((byte[]) r1, (long) r8)
                int r8 = (r19 > r2 ? 1 : (r19 == r2 ? 0 : -1))
                if (r8 < 0) goto L_0x0095
                int r0 = com.fyber.inneractive.sdk.protobuf.C3576s1.m9501a((int) r6, (int) r4, (int) r0)
                return r0
            L_0x0095:
                r8 = r19
            L_0x0097:
                if (r4 > r7) goto L_0x00ac
                int r6 = r6 << 28
                int r4 = r4 + 112
                int r4 = r4 + r6
                int r4 = r4 >> 30
                if (r4 != 0) goto L_0x00ac
                if (r0 > r7) goto L_0x00ac
                long r19 = r8 + r16
                byte r0 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9417a((byte[]) r1, (long) r8)
                if (r0 <= r7) goto L_0x0038
            L_0x00ac:
                return r15
            L_0x00ad:
                long r2 = r2 - r8
                int r0 = (int) r2
                if (r0 >= r12) goto L_0x00b3
                r2 = 0
                goto L_0x00c6
            L_0x00b3:
                r3 = r8
                r2 = 0
            L_0x00b5:
                if (r2 >= r0) goto L_0x00c5
                long r19 = r3 + r16
                byte r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9417a((byte[]) r1, (long) r3)
                if (r3 >= 0) goto L_0x00c0
                goto L_0x00c6
            L_0x00c0:
                int r2 = r2 + 1
                r3 = r19
                goto L_0x00b5
            L_0x00c5:
                r2 = r0
            L_0x00c6:
                int r0 = r0 - r2
                long r2 = (long) r2
                long r8 = r8 + r2
            L_0x00c9:
                r2 = 0
            L_0x00ca:
                if (r0 <= 0) goto L_0x00db
                long r2 = r8 + r16
                byte r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9417a((byte[]) r1, (long) r8)
                if (r4 < 0) goto L_0x00d9
                int r0 = r0 + -1
                r8 = r2
                r2 = r4
                goto L_0x00ca
            L_0x00d9:
                r8 = r2
                r2 = r4
            L_0x00db:
                if (r0 != 0) goto L_0x00e0
                r7 = 0
                goto L_0x014c
            L_0x00e0:
                int r0 = r0 + -1
                if (r2 >= r14) goto L_0x00f8
                if (r0 != 0) goto L_0x00e9
                r7 = r2
                goto L_0x014c
            L_0x00e9:
                int r0 = r0 + -1
                if (r2 < r10) goto L_0x014b
                long r2 = r8 + r16
                byte r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9417a((byte[]) r1, (long) r8)
                if (r4 <= r7) goto L_0x00f6
                goto L_0x014b
            L_0x00f6:
                r8 = r2
                goto L_0x00c9
            L_0x00f8:
                if (r2 >= r11) goto L_0x011e
                if (r0 >= r5) goto L_0x0101
                int r7 = m9522a((byte[]) r1, (int) r2, (long) r8, (int) r0)
                goto L_0x014c
            L_0x0101:
                int r0 = r0 + -2
                long r3 = r8 + r16
                byte r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9417a((byte[]) r1, (long) r8)
                if (r6 > r7) goto L_0x014b
                if (r2 != r14) goto L_0x010f
                if (r6 < r13) goto L_0x014b
            L_0x010f:
                r12 = -19
                if (r2 != r12) goto L_0x0115
                if (r6 >= r13) goto L_0x014b
            L_0x0115:
                long r8 = r3 + r16
                byte r2 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9417a((byte[]) r1, (long) r3)
                if (r2 <= r7) goto L_0x00c9
                goto L_0x014b
            L_0x011e:
                r3 = 3
                r12 = -19
                if (r0 >= r3) goto L_0x0128
                int r7 = m9522a((byte[]) r1, (int) r2, (long) r8, (int) r0)
                goto L_0x014c
            L_0x0128:
                int r0 = r0 + -3
                long r3 = r8 + r16
                byte r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9417a((byte[]) r1, (long) r8)
                if (r6 > r7) goto L_0x014b
                int r2 = r2 << 28
                int r6 = r6 + 112
                int r6 = r6 + r2
                int r2 = r6 >> 30
                if (r2 != 0) goto L_0x014b
                long r8 = r3 + r16
                byte r2 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9417a((byte[]) r1, (long) r3)
                if (r2 > r7) goto L_0x014b
                long r2 = r8 + r16
                byte r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9417a((byte[]) r1, (long) r8)
                if (r4 <= r7) goto L_0x00f6
            L_0x014b:
                r7 = -1
            L_0x014c:
                return r7
            L_0x014d:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                int r1 = r1.length
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r6 = 0
                r4[r6] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
                r2 = 1
                r4[r2] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
                r4[r5] = r1
                java.lang.String r1 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r1 = java.lang.String.format(r1, r4)
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3576s1.C3581e.mo15179a(int, byte[], int, int):int");
        }

        /* renamed from: b */
        public String mo15183b(ByteBuffer byteBuffer, int i, int i2) throws C3476a0 {
            long j;
            int i3 = i;
            int i4 = i2;
            if ((i3 | i4 | ((byteBuffer.limit() - i3) - i4)) >= 0) {
                long a = C3569r1.m9419a(byteBuffer) + ((long) i3);
                long j2 = ((long) i4) + a;
                char[] cArr = new char[i4];
                int i5 = 0;
                while (j < j2) {
                    byte a2 = C3569r1.f12543e.mo15167a(j);
                    if (!C3577a.m9509a(a2)) {
                        break;
                    }
                    a = j + 1;
                    cArr[i5] = (char) a2;
                    i5++;
                }
                int i6 = i5;
                while (j < j2) {
                    long j3 = j + 1;
                    C3569r1.C3573d dVar = C3569r1.f12543e;
                    byte a3 = dVar.mo15167a(j);
                    if (C3577a.m9509a(a3)) {
                        cArr[i6] = (char) a3;
                        i6++;
                        j = j3;
                        while (j < j2) {
                            byte a4 = C3569r1.f12543e.mo15167a(j);
                            if (!C3577a.m9509a(a4)) {
                                break;
                            }
                            j++;
                            cArr[i6] = (char) a4;
                            i6++;
                        }
                    } else if (C3577a.m9510b(a3)) {
                        if (j3 < j2) {
                            C3577a.m9508a(a3, dVar.mo15167a(j3), cArr, i6);
                            i6++;
                            j = j3 + 1;
                        } else {
                            throw C3476a0.m8729c();
                        }
                    } else if (C3577a.m9511c(a3)) {
                        if (j3 < j2 - 1) {
                            long j4 = j3 + 1;
                            C3577a.m9507a(a3, dVar.mo15167a(j3), dVar.mo15167a(j4), cArr, i6);
                            i6++;
                            j = j4 + 1;
                        } else {
                            throw C3476a0.m8729c();
                        }
                    } else if (j3 < j2 - 2) {
                        long j5 = j3 + 1;
                        long j6 = j5 + 1;
                        long j7 = j6 + 1;
                        C3577a.m9506a(a3, dVar.mo15167a(j3), dVar.mo15167a(j5), dVar.mo15167a(j6), cArr, i6);
                        i6 = i6 + 1 + 1;
                        j = j7;
                    } else {
                        throw C3476a0.m8729c();
                    }
                }
                return new String(cArr, 0, i6);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: a */
        public String mo15182a(byte[] bArr, int i, int i2) throws C3476a0 {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r13 < i3) {
                    byte a = C3569r1.m9417a(bArr, (long) r13);
                    if (!C3577a.m9509a(a)) {
                        break;
                    }
                    i = r13 + 1;
                    cArr[i4] = (char) a;
                    i4++;
                }
                int i5 = i4;
                while (r13 < i3) {
                    int i6 = r13 + 1;
                    byte a2 = C3569r1.m9417a(bArr, (long) r13);
                    if (C3577a.m9509a(a2)) {
                        int i7 = i5 + 1;
                        cArr[i5] = (char) a2;
                        r13 = i6;
                        while (true) {
                            i5 = i7;
                            if (r13 >= i3) {
                                break;
                            }
                            byte a3 = C3569r1.m9417a(bArr, (long) r13);
                            if (!C3577a.m9509a(a3)) {
                                break;
                            }
                            r13++;
                            i7 = i5 + 1;
                            cArr[i5] = (char) a3;
                        }
                    } else if (C3577a.m9510b(a2)) {
                        if (i6 < i3) {
                            int i8 = i6 + 1;
                            C3577a.m9508a(a2, C3569r1.m9417a(bArr, (long) i6), cArr, i5);
                            r13 = i8;
                            i5++;
                        } else {
                            throw C3476a0.m8729c();
                        }
                    } else if (C3577a.m9511c(a2)) {
                        if (i6 < i3 - 1) {
                            int i9 = i6 + 1;
                            int i11 = i9 + 1;
                            C3577a.m9507a(a2, C3569r1.m9417a(bArr, (long) i6), C3569r1.m9417a(bArr, (long) i9), cArr, i5);
                            r13 = i11;
                            i5++;
                        } else {
                            throw C3476a0.m8729c();
                        }
                    } else if (i6 < i3 - 2) {
                        int i12 = i6 + 1;
                        byte a4 = C3569r1.m9417a(bArr, (long) i6);
                        int i13 = i12 + 1;
                        C3577a.m9506a(a2, a4, C3569r1.m9417a(bArr, (long) i12), C3569r1.m9417a(bArr, (long) i13), cArr, i5);
                        i5 = i5 + 1 + 1;
                        r13 = i13 + 1;
                    } else {
                        throw C3476a0.m8729c();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:38:0x00ec, LOOP_START, PHI: r2 r3 r4 r11 
          PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x002f, B:38:0x00ec] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:10:0x002f, B:38:0x00ec] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v3 long) = (r4v2 long), (r4v4 long) binds: [B:10:0x002f, B:38:0x00ec] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x002f, B:38:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo15180a(java.lang.CharSequence r19, byte[] r20, int r21, int r22) {
            /*
                r18 = this;
                r0 = r19
                r1 = r20
                r2 = r21
                r3 = r22
                long r4 = (long) r2
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r19.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L_0x0130
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L_0x0130
                r2 = 0
            L_0x001a:
                r3 = 128(0x80, float:1.794E-43)
                r11 = 1
                if (r2 >= r8) goto L_0x002f
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x002f
                long r11 = r11 + r4
                byte r3 = (byte) r13
                com.fyber.inneractive.sdk.protobuf.C3569r1.m9429a((byte[]) r1, (long) r4, (byte) r3)
                int r2 = r2 + 1
                r4 = r11
                goto L_0x001a
            L_0x002f:
                if (r2 != r8) goto L_0x0033
                int r0 = (int) r4
                return r0
            L_0x0033:
                if (r2 >= r8) goto L_0x012e
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x0046
                int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r3 >= 0) goto L_0x0046
                long r14 = r4 + r11
                byte r3 = (byte) r13
                com.fyber.inneractive.sdk.protobuf.C3569r1.m9429a((byte[]) r1, (long) r4, (byte) r3)
                goto L_0x009e
            L_0x0046:
                r3 = 2048(0x800, float:2.87E-42)
                if (r13 >= r3) goto L_0x0069
                r14 = 2
                long r14 = r6 - r14
                int r3 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r3 > 0) goto L_0x0069
                long r14 = r4 + r11
                int r3 = r13 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                com.fyber.inneractive.sdk.protobuf.C3569r1.m9429a((byte[]) r1, (long) r4, (byte) r3)
                long r3 = r14 + r11
                r5 = r13 & 63
                r5 = r5 | 128(0x80, float:1.794E-43)
                byte r5 = (byte) r5
                com.fyber.inneractive.sdk.protobuf.C3569r1.m9429a((byte[]) r1, (long) r14, (byte) r5)
                r4 = r3
                goto L_0x00ec
            L_0x0069:
                r3 = 57343(0xdfff, float:8.0355E-41)
                r14 = 55296(0xd800, float:7.7486E-41)
                if (r13 < r14) goto L_0x0073
                if (r3 >= r13) goto L_0x00a0
            L_0x0073:
                r15 = 3
                long r15 = r6 - r15
                int r17 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r17 > 0) goto L_0x00a0
                long r14 = r4 + r11
                int r3 = r13 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                com.fyber.inneractive.sdk.protobuf.C3569r1.m9429a((byte[]) r1, (long) r4, (byte) r3)
                long r11 = r11 + r14
                int r3 = r13 >>> 6
                r3 = r3 & 63
                r3 = r3 | 128(0x80, float:1.794E-43)
                byte r3 = (byte) r3
                com.fyber.inneractive.sdk.protobuf.C3569r1.m9429a((byte[]) r1, (long) r14, (byte) r3)
                r3 = 1
                long r14 = r11 + r3
                r3 = r13 & 63
                r3 = r3 | 128(0x80, float:1.794E-43)
                byte r3 = (byte) r3
                com.fyber.inneractive.sdk.protobuf.C3569r1.m9429a((byte[]) r1, (long) r11, (byte) r3)
                r11 = 1
            L_0x009e:
                r4 = r14
                goto L_0x00ec
            L_0x00a0:
                r11 = 4
                long r11 = r6 - r11
                int r15 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r15 > 0) goto L_0x00fb
                int r3 = r2 + 1
                if (r3 == r8) goto L_0x00f3
                char r2 = r0.charAt(r3)
                boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
                if (r11 == 0) goto L_0x00f2
                int r2 = java.lang.Character.toCodePoint(r13, r2)
                r11 = 1
                long r13 = r4 + r11
                int r15 = r2 >>> 18
                r15 = r15 | 240(0xf0, float:3.36E-43)
                byte r15 = (byte) r15
                com.fyber.inneractive.sdk.protobuf.C3569r1.m9429a((byte[]) r1, (long) r4, (byte) r15)
                long r11 = r11 + r13
                int r4 = r2 >>> 12
                r4 = r4 & 63
                r4 = r4 | 128(0x80, float:1.794E-43)
                byte r4 = (byte) r4
                com.fyber.inneractive.sdk.protobuf.C3569r1.m9429a((byte[]) r1, (long) r13, (byte) r4)
                r4 = 1
                long r4 = r4 + r11
                int r13 = r2 >>> 6
                r13 = r13 & 63
                r13 = r13 | 128(0x80, float:1.794E-43)
                byte r13 = (byte) r13
                com.fyber.inneractive.sdk.protobuf.C3569r1.m9429a((byte[]) r1, (long) r11, (byte) r13)
                r11 = 1
                long r13 = r4 + r11
                r2 = r2 & 63
                r2 = r2 | 128(0x80, float:1.794E-43)
                byte r2 = (byte) r2
                com.fyber.inneractive.sdk.protobuf.C3569r1.m9429a((byte[]) r1, (long) r4, (byte) r2)
                r2 = r3
                r4 = r13
            L_0x00ec:
                int r2 = r2 + 1
                r3 = 128(0x80, float:1.794E-43)
                goto L_0x0033
            L_0x00f2:
                r2 = r3
            L_0x00f3:
                com.fyber.inneractive.sdk.protobuf.s1$d r0 = new com.fyber.inneractive.sdk.protobuf.s1$d
                int r2 = r2 + -1
                r0.<init>(r2, r8)
                throw r0
            L_0x00fb:
                if (r14 > r13) goto L_0x0113
                if (r13 > r3) goto L_0x0113
                int r1 = r2 + 1
                if (r1 == r8) goto L_0x010d
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
                if (r0 != 0) goto L_0x0113
            L_0x010d:
                com.fyber.inneractive.sdk.protobuf.s1$d r0 = new com.fyber.inneractive.sdk.protobuf.s1$d
                r0.<init>(r2, r8)
                throw r0
            L_0x0113:
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
            L_0x012e:
                int r0 = (int) r4
                return r0
            L_0x0130:
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
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3576s1.C3581e.mo15180a(java.lang.CharSequence, byte[], int, int):int");
        }

        /* renamed from: a */
        public static int m9522a(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return C3576s1.m9499a(i);
            }
            if (i2 == 1) {
                return C3576s1.m9500a(i, C3569r1.m9417a(bArr, j));
            }
            if (i2 == 2) {
                return C3576s1.m9501a(i, (int) C3569r1.m9417a(bArr, j), (int) C3569r1.m9417a(bArr, j + 1));
            }
            throw new AssertionError();
        }
    }
}
