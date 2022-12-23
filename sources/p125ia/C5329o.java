package p125ia;

import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;

/* renamed from: ia.o */
public final class C5329o {

    /* renamed from: a */
    public static final String[] f17552a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b */
    public static final int[] f17553b = {44100, 48000, 32000};

    /* renamed from: c */
    public static final int[] f17554c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d */
    public static final int[] f17555d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e */
    public static final int[] f17556e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f */
    public static final int[] f17557f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g */
    public static final int[] f17558g = {ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: ia.o$a */
    public static final class C5330a {

        /* renamed from: a */
        public int f17559a;

        /* renamed from: b */
        public String f17560b;

        /* renamed from: c */
        public int f17561c;

        /* renamed from: d */
        public int f17562d;

        /* renamed from: e */
        public int f17563e;

        /* renamed from: f */
        public int f17564f;

        /* renamed from: g */
        public int f17565g;

        /* renamed from: a */
        public final boolean mo21110a(int i) {
            boolean z;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            if ((i & -2097152) == -2097152) {
                z = true;
            } else {
                z = false;
            }
            if (!z || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.f17559a = i2;
            this.f17560b = C5329o.f17552a[3 - i3];
            int i8 = C5329o.f17553b[i5];
            this.f17562d = i8;
            int i9 = 2;
            if (i2 == 2) {
                this.f17562d = i8 / 2;
            } else if (i2 == 0) {
                this.f17562d = i8 / 4;
            }
            int i11 = (i >>> 9) & 1;
            int i12 = 1152;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        i12 = 384;
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
            } else if (i2 != 3) {
                i12 = 576;
            }
            this.f17565g = i12;
            if (i3 == 3) {
                if (i2 == 3) {
                    i7 = C5329o.f17554c[i4 - 1];
                } else {
                    i7 = C5329o.f17555d[i4 - 1];
                }
                this.f17564f = i7;
                this.f17561c = (((i7 * 12) / this.f17562d) + i11) * 4;
            } else {
                int i13 = 144;
                if (i2 == 3) {
                    if (i3 == 2) {
                        i6 = C5329o.f17556e[i4 - 1];
                    } else {
                        i6 = C5329o.f17557f[i4 - 1];
                    }
                    this.f17564f = i6;
                    this.f17561c = ((i6 * 144) / this.f17562d) + i11;
                } else {
                    int i14 = C5329o.f17558g[i4 - 1];
                    this.f17564f = i14;
                    if (i3 == 1) {
                        i13 = 72;
                    }
                    this.f17561c = ((i13 * i14) / this.f17562d) + i11;
                }
            }
            if (((i >> 6) & 3) == 3) {
                i9 = 1;
            }
            this.f17563e = i9;
            return true;
        }
    }

    /* renamed from: a */
    public static int m13362a(int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i & -2097152) == -2097152) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = f17553b[i5];
        if (i2 == 2) {
            i8 /= 2;
        } else if (i2 == 0) {
            i8 /= 4;
        }
        int i9 = (i >>> 9) & 1;
        if (i3 == 3) {
            if (i2 == 3) {
                i7 = f17554c[i4 - 1];
            } else {
                i7 = f17555d[i4 - 1];
            }
            return (((i7 * 12) / i8) + i9) * 4;
        }
        if (i2 != 3) {
            i6 = f17558g[i4 - 1];
        } else if (i3 == 2) {
            i6 = f17556e[i4 - 1];
        } else {
            i6 = f17557f[i4 - 1];
        }
        int i11 = 144;
        if (i2 == 3) {
            return C13715c.m34237b(i6, 144, i8, i9);
        }
        if (i3 == 1) {
            i11 = 72;
        }
        return C13715c.m34237b(i11, i6, i8, i9);
    }

    /* renamed from: b */
    public static int m13363b(int i) {
        int i2;
        int i3;
        if (!((i & -2097152) == -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        if (i3 == 1) {
            return i2 == 3 ? 1152 : 576;
        }
        if (i3 == 2) {
            return 1152;
        }
        if (i3 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }
}
