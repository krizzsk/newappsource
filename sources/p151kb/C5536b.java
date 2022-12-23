package p151kb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.ValidationUtils;
import p277ub.C6774a0;
import p277ub.C6802q;

/* renamed from: kb.b */
public final class C5536b {

    /* renamed from: h */
    public static final byte[] f18130h = {0, 7, 8, 15};

    /* renamed from: i */
    public static final byte[] f18131i = {0, 119, -120, -1};

    /* renamed from: j */
    public static final byte[] f18132j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    public final Paint f18133a;

    /* renamed from: b */
    public final Paint f18134b;

    /* renamed from: c */
    public final Canvas f18135c = new Canvas();

    /* renamed from: d */
    public final C5538b f18136d = new C5538b(719, 575, 0, 719, 0, 575);

    /* renamed from: e */
    public final C5537a f18137e = new C5537a(0, new int[]{0, -1, -16777216, -8421505}, m13750a(), m13751b());

    /* renamed from: f */
    public final C5544h f18138f;

    /* renamed from: g */
    public Bitmap f18139g;

    /* renamed from: kb.b$a */
    public static final class C5537a {

        /* renamed from: a */
        public final int f18140a;

        /* renamed from: b */
        public final int[] f18141b;

        /* renamed from: c */
        public final int[] f18142c;

        /* renamed from: d */
        public final int[] f18143d;

        public C5537a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f18140a = i;
            this.f18141b = iArr;
            this.f18142c = iArr2;
            this.f18143d = iArr3;
        }
    }

    /* renamed from: kb.b$b */
    public static final class C5538b {

        /* renamed from: a */
        public final int f18144a;

        /* renamed from: b */
        public final int f18145b;

        /* renamed from: c */
        public final int f18146c;

        /* renamed from: d */
        public final int f18147d;

        /* renamed from: e */
        public final int f18148e;

        /* renamed from: f */
        public final int f18149f;

        public C5538b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f18144a = i;
            this.f18145b = i2;
            this.f18146c = i3;
            this.f18147d = i4;
            this.f18148e = i5;
            this.f18149f = i6;
        }
    }

    /* renamed from: kb.b$c */
    public static final class C5539c {

        /* renamed from: a */
        public final int f18150a;

        /* renamed from: b */
        public final boolean f18151b;

        /* renamed from: c */
        public final byte[] f18152c;

        /* renamed from: d */
        public final byte[] f18153d;

        public C5539c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f18150a = i;
            this.f18151b = z;
            this.f18152c = bArr;
            this.f18153d = bArr2;
        }
    }

    /* renamed from: kb.b$d */
    public static final class C5540d {

        /* renamed from: a */
        public final int f18154a;

        /* renamed from: b */
        public final int f18155b;

        /* renamed from: c */
        public final SparseArray<C5541e> f18156c;

        public C5540d(int i, int i2, SparseArray sparseArray) {
            this.f18154a = i;
            this.f18155b = i2;
            this.f18156c = sparseArray;
        }
    }

    /* renamed from: kb.b$e */
    public static final class C5541e {

        /* renamed from: a */
        public final int f18157a;

        /* renamed from: b */
        public final int f18158b;

        public C5541e(int i, int i2) {
            this.f18157a = i;
            this.f18158b = i2;
        }
    }

    /* renamed from: kb.b$f */
    public static final class C5542f {

        /* renamed from: a */
        public final int f18159a;

        /* renamed from: b */
        public final boolean f18160b;

        /* renamed from: c */
        public final int f18161c;

        /* renamed from: d */
        public final int f18162d;

        /* renamed from: e */
        public final int f18163e;

        /* renamed from: f */
        public final int f18164f;

        /* renamed from: g */
        public final int f18165g;

        /* renamed from: h */
        public final int f18166h;

        /* renamed from: i */
        public final int f18167i;

        /* renamed from: j */
        public final SparseArray<C5543g> f18168j;

        public C5542f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, SparseArray sparseArray) {
            this.f18159a = i;
            this.f18160b = z;
            this.f18161c = i2;
            this.f18162d = i3;
            this.f18163e = i4;
            this.f18164f = i5;
            this.f18165g = i6;
            this.f18166h = i7;
            this.f18167i = i8;
            this.f18168j = sparseArray;
        }
    }

    /* renamed from: kb.b$g */
    public static final class C5543g {

        /* renamed from: a */
        public final int f18169a;

        /* renamed from: b */
        public final int f18170b;

        public C5543g(int i, int i2) {
            this.f18169a = i;
            this.f18170b = i2;
        }
    }

    /* renamed from: kb.b$h */
    public static final class C5544h {

        /* renamed from: a */
        public final int f18171a;

        /* renamed from: b */
        public final int f18172b;

        /* renamed from: c */
        public final SparseArray<C5542f> f18173c = new SparseArray<>();

        /* renamed from: d */
        public final SparseArray<C5537a> f18174d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C5539c> f18175e = new SparseArray<>();

        /* renamed from: f */
        public final SparseArray<C5537a> f18176f = new SparseArray<>();

        /* renamed from: g */
        public final SparseArray<C5539c> f18177g = new SparseArray<>();

        /* renamed from: h */
        public C5538b f18178h;

        /* renamed from: i */
        public C5540d f18179i;

        public C5544h(int i, int i2) {
            this.f18171a = i;
            this.f18172b = i2;
        }
    }

    public C5536b(int i, int i2) {
        Paint paint = new Paint();
        this.f18133a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.f18134b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        this.f18138f = new C5544h(i, i2);
    }

    /* renamed from: a */
    public static int[] m13750a() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i6 = 1; i6 < 16; i6++) {
            if (i6 < 8) {
                if ((i6 & 1) != 0) {
                    i3 = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                } else {
                    i3 = 0;
                }
                if ((i6 & 2) != 0) {
                    i4 = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                } else {
                    i4 = 0;
                }
                if ((i6 & 4) != 0) {
                    i5 = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                } else {
                    i5 = 0;
                }
                iArr[i6] = m13752c(ValidationUtils.APPBOY_STRING_MAX_LENGTH, i3, i4, i5);
            } else {
                int i7 = 127;
                if ((i6 & 1) != 0) {
                    i = 127;
                } else {
                    i = 0;
                }
                if ((i6 & 2) != 0) {
                    i2 = 127;
                } else {
                    i2 = 0;
                }
                if ((i6 & 4) == 0) {
                    i7 = 0;
                }
                iArr[i6] = m13752c(ValidationUtils.APPBOY_STRING_MAX_LENGTH, i, i2, i7);
            }
        }
        return iArr;
    }

    /* renamed from: b */
    public static int[] m13751b() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i21 = 0; i21 < 256; i21++) {
            int i22 = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
            if (i21 < 8) {
                if ((i21 & 1) != 0) {
                    i18 = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                } else {
                    i18 = 0;
                }
                if ((i21 & 2) != 0) {
                    i19 = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                } else {
                    i19 = 0;
                }
                if ((i21 & 4) == 0) {
                    i22 = 0;
                }
                iArr[i21] = m13752c(63, i18, i19, i22);
            } else {
                int i23 = i21 & 136;
                int i24 = 170;
                int i25 = 85;
                if (i23 == 0) {
                    if ((i21 & 1) != 0) {
                        i = 85;
                    } else {
                        i = 0;
                    }
                    if ((i21 & 16) != 0) {
                        i2 = 170;
                    } else {
                        i2 = 0;
                    }
                    int i26 = i + i2;
                    if ((i21 & 2) != 0) {
                        i3 = 85;
                    } else {
                        i3 = 0;
                    }
                    if ((i21 & 32) != 0) {
                        i4 = 170;
                    } else {
                        i4 = 0;
                    }
                    int i27 = i3 + i4;
                    if ((i21 & 4) == 0) {
                        i25 = 0;
                    }
                    if ((i21 & 64) == 0) {
                        i24 = 0;
                    }
                    iArr[i21] = m13752c(ValidationUtils.APPBOY_STRING_MAX_LENGTH, i26, i27, i25 + i24);
                } else if (i23 != 8) {
                    int i28 = 43;
                    if (i23 == 128) {
                        if ((i21 & 1) != 0) {
                            i9 = 43;
                        } else {
                            i9 = 0;
                        }
                        int i29 = i9 + 127;
                        if ((i21 & 16) != 0) {
                            i11 = 85;
                        } else {
                            i11 = 0;
                        }
                        int i31 = i29 + i11;
                        if ((i21 & 2) != 0) {
                            i12 = 43;
                        } else {
                            i12 = 0;
                        }
                        int i32 = i12 + 127;
                        if ((i21 & 32) != 0) {
                            i13 = 85;
                        } else {
                            i13 = 0;
                        }
                        int i33 = i32 + i13;
                        if ((i21 & 4) == 0) {
                            i28 = 0;
                        }
                        int i34 = i28 + 127;
                        if ((i21 & 64) == 0) {
                            i25 = 0;
                        }
                        iArr[i21] = m13752c(ValidationUtils.APPBOY_STRING_MAX_LENGTH, i31, i33, i34 + i25);
                    } else if (i23 == 136) {
                        if ((i21 & 1) != 0) {
                            i14 = 43;
                        } else {
                            i14 = 0;
                        }
                        if ((i21 & 16) != 0) {
                            i15 = 85;
                        } else {
                            i15 = 0;
                        }
                        int i35 = i14 + i15;
                        if ((i21 & 2) != 0) {
                            i16 = 43;
                        } else {
                            i16 = 0;
                        }
                        if ((i21 & 32) != 0) {
                            i17 = 85;
                        } else {
                            i17 = 0;
                        }
                        int i36 = i16 + i17;
                        if ((i21 & 4) == 0) {
                            i28 = 0;
                        }
                        if ((i21 & 64) == 0) {
                            i25 = 0;
                        }
                        iArr[i21] = m13752c(ValidationUtils.APPBOY_STRING_MAX_LENGTH, i35, i36, i28 + i25);
                    }
                } else {
                    if ((i21 & 1) != 0) {
                        i5 = 85;
                    } else {
                        i5 = 0;
                    }
                    if ((i21 & 16) != 0) {
                        i6 = 170;
                    } else {
                        i6 = 0;
                    }
                    int i37 = i5 + i6;
                    if ((i21 & 2) != 0) {
                        i7 = 85;
                    } else {
                        i7 = 0;
                    }
                    if ((i21 & 32) != 0) {
                        i8 = 170;
                    } else {
                        i8 = 0;
                    }
                    int i38 = i7 + i8;
                    if ((i21 & 4) == 0) {
                        i25 = 0;
                    }
                    if ((i21 & 64) == 0) {
                        i24 = 0;
                    }
                    iArr[i21] = m13752c(127, i37, i38, i25 + i24);
                }
            }
        }
        return iArr;
    }

    /* renamed from: c */
    public static int m13752c(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v51, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v14, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r4v5, types: [byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01e9 A[LOOP:3: B:81:0x0153->B:111:0x01e9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x012b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01e3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0102 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0131 A[LOOP:2: B:36:0x009b->B:68:0x0131, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x015a  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m13753d(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            r0 = r23
            r1 = r25
            r8 = r28
            ub.q r9 = new ub.q
            int r2 = r0.length
            r9.<init>(r0, r2)
            r2 = r26
            r10 = r27
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0013:
            int r3 = r9.mo22969b()
            if (r3 == 0) goto L_0x0227
            r14 = 8
            int r3 = r9.mo22973f(r14)
            r4 = 240(0xf0, float:3.36E-43)
            if (r3 == r4) goto L_0x0221
            r15 = 3
            r7 = 4
            r6 = 2
            r5 = 1
            r16 = 0
            switch(r3) {
                case 16: goto L_0x0139;
                case 17: goto L_0x008b;
                case 18: goto L_0x0031;
                default: goto L_0x002c;
            }
        L_0x002c:
            r0 = 4
            switch(r3) {
                case 32: goto L_0x0212;
                case 33: goto L_0x0201;
                case 34: goto L_0x01ee;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0013
        L_0x0031:
            r15 = r2
            r2 = 0
        L_0x0033:
            int r3 = r9.mo22973f(r14)
            if (r3 == 0) goto L_0x003e
            r17 = r2
            r18 = 1
            goto L_0x0064
        L_0x003e:
            boolean r3 = r9.mo22972e()
            r4 = 7
            if (r3 != 0) goto L_0x0057
            int r3 = r9.mo22973f(r4)
            if (r3 == 0) goto L_0x0051
            r17 = r2
            r18 = r3
            r3 = 0
            goto L_0x0064
        L_0x0051:
            r3 = 0
            r17 = 1
            r18 = 0
            goto L_0x0064
        L_0x0057:
            int r3 = r9.mo22973f(r4)
            int r4 = r9.mo22973f(r14)
            r17 = r2
            r18 = r3
            r3 = r4
        L_0x0064:
            if (r18 == 0) goto L_0x0080
            if (r8 == 0) goto L_0x0080
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r15
            float r4 = (float) r10
            int r2 = r15 + r18
            float r6 = (float) r2
            int r2 = r10 + 1
            float r7 = (float) r2
            r2 = r29
            r0 = 1
            r5 = r6
            r6 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0081
        L_0x0080:
            r0 = 1
        L_0x0081:
            int r15 = r15 + r18
            if (r17 == 0) goto L_0x0087
            r2 = r15
            goto L_0x0013
        L_0x0087:
            r2 = r17
            r5 = 1
            goto L_0x0033
        L_0x008b:
            r0 = 1
            if (r1 != r15) goto L_0x0097
            if (r12 != 0) goto L_0x0093
            byte[] r3 = f18132j
            goto L_0x0094
        L_0x0093:
            r3 = r12
        L_0x0094:
            r17 = r3
            goto L_0x0099
        L_0x0097:
            r17 = 0
        L_0x0099:
            r5 = r2
            r2 = 0
        L_0x009b:
            int r3 = r9.mo22973f(r7)
            if (r3 == 0) goto L_0x00a2
            goto L_0x00fb
        L_0x00a2:
            boolean r3 = r9.mo22972e()
            if (r3 != 0) goto L_0x00b8
            int r3 = r9.mo22973f(r15)
            if (r3 == 0) goto L_0x00b6
            int r3 = r3 + 2
            r18 = r2
            r19 = r3
            r4 = 0
            goto L_0x0100
        L_0x00b6:
            r2 = 1
            goto L_0x00d4
        L_0x00b8:
            boolean r3 = r9.mo22972e()
            if (r3 != 0) goto L_0x00c8
            int r3 = r9.mo22973f(r6)
            int r3 = r3 + r7
            int r4 = r9.mo22973f(r7)
            goto L_0x00ef
        L_0x00c8:
            int r3 = r9.mo22973f(r6)
            if (r3 == 0) goto L_0x00fa
            if (r3 == r0) goto L_0x00f4
            if (r3 == r6) goto L_0x00e5
            if (r3 == r15) goto L_0x00da
        L_0x00d4:
            r18 = r2
            r4 = 0
            r19 = 0
            goto L_0x0100
        L_0x00da:
            int r3 = r9.mo22973f(r14)
            int r3 = r3 + 25
            int r4 = r9.mo22973f(r7)
            goto L_0x00ef
        L_0x00e5:
            int r3 = r9.mo22973f(r7)
            int r3 = r3 + 9
            int r4 = r9.mo22973f(r7)
        L_0x00ef:
            r18 = r2
            r19 = r3
            goto L_0x0100
        L_0x00f4:
            r18 = r2
            r4 = 0
            r19 = 2
            goto L_0x0100
        L_0x00fa:
            r3 = 0
        L_0x00fb:
            r18 = r2
            r4 = r3
            r19 = 1
        L_0x0100:
            if (r19 == 0) goto L_0x0124
            if (r8 == 0) goto L_0x0124
            if (r17 == 0) goto L_0x0108
            byte r4 = r17[r4]
        L_0x0108:
            r2 = r24[r4]
            r8.setColor(r2)
            float r3 = (float) r5
            float r4 = (float) r10
            int r2 = r5 + r19
            float r2 = (float) r2
            int r6 = r10 + 1
            float r6 = (float) r6
            r20 = r2
            r2 = r29
            r21 = r5
            r5 = r20
            r14 = 2
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0127
        L_0x0124:
            r21 = r5
            r14 = 2
        L_0x0127:
            int r5 = r21 + r19
            if (r18 == 0) goto L_0x0131
            r9.mo22970c()
            r2 = r5
            goto L_0x0013
        L_0x0131:
            r2 = r18
            r6 = 2
            r7 = 4
            r14 = 8
            goto L_0x009b
        L_0x0139:
            r0 = 1
            r14 = 2
            if (r1 != r15) goto L_0x0144
            if (r11 != 0) goto L_0x0142
            byte[] r3 = f18131i
            goto L_0x014c
        L_0x0142:
            r3 = r11
            goto L_0x014c
        L_0x0144:
            if (r1 != r14) goto L_0x014f
            if (r13 != 0) goto L_0x014b
            byte[] r3 = f18130h
            goto L_0x014c
        L_0x014b:
            r3 = r13
        L_0x014c:
            r17 = r3
            goto L_0x0151
        L_0x014f:
            r17 = 0
        L_0x0151:
            r7 = r2
            r5 = 0
        L_0x0153:
            int r2 = r9.mo22973f(r14)
            if (r2 == 0) goto L_0x015a
            goto L_0x0172
        L_0x015a:
            boolean r2 = r9.mo22972e()
            if (r2 == 0) goto L_0x016b
            int r2 = r9.mo22973f(r15)
            int r2 = r2 + r15
            int r3 = r9.mo22973f(r14)
            r6 = 4
            goto L_0x01a4
        L_0x016b:
            boolean r2 = r9.mo22972e()
            if (r2 == 0) goto L_0x0178
            r2 = 0
        L_0x0172:
            r18 = r5
            r6 = 4
            r19 = 1
            goto L_0x01b8
        L_0x0178:
            int r2 = r9.mo22973f(r14)
            if (r2 == 0) goto L_0x01b1
            if (r2 == r0) goto L_0x01aa
            if (r2 == r14) goto L_0x0199
            if (r2 == r15) goto L_0x0186
            r6 = 4
            goto L_0x01b3
        L_0x0186:
            r2 = 8
            int r3 = r9.mo22973f(r2)
            int r3 = r3 + 29
            int r2 = r9.mo22973f(r14)
            r6 = 4
            r22 = r3
            r3 = r2
            r2 = r22
            goto L_0x01a4
        L_0x0199:
            r6 = 4
            int r2 = r9.mo22973f(r6)
            int r2 = r2 + 12
            int r3 = r9.mo22973f(r14)
        L_0x01a4:
            r19 = r2
            r2 = r3
            r18 = r5
            goto L_0x01b8
        L_0x01aa:
            r6 = 4
            r18 = r5
            r2 = 0
            r19 = 2
            goto L_0x01b8
        L_0x01b1:
            r6 = 4
            r5 = 1
        L_0x01b3:
            r18 = r5
            r2 = 0
            r19 = 0
        L_0x01b8:
            if (r19 == 0) goto L_0x01dc
            if (r8 == 0) goto L_0x01dc
            if (r17 == 0) goto L_0x01c0
            byte r2 = r17[r2]
        L_0x01c0:
            r2 = r24[r2]
            r8.setColor(r2)
            float r3 = (float) r7
            float r4 = (float) r10
            int r2 = r7 + r19
            float r5 = (float) r2
            int r2 = r10 + 1
            float r2 = (float) r2
            r21 = r2
            r2 = r29
            r0 = 4
            r6 = r21
            r21 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x01df
        L_0x01dc:
            r21 = r7
            r0 = 4
        L_0x01df:
            int r7 = r21 + r19
            if (r18 == 0) goto L_0x01e9
            r9.mo22970c()
            r2 = r7
            goto L_0x0013
        L_0x01e9:
            r5 = r18
            r0 = 1
            goto L_0x0153
        L_0x01ee:
            r0 = 16
            byte[] r12 = new byte[r0]
            r3 = 0
        L_0x01f3:
            if (r3 >= r0) goto L_0x0013
            r4 = 8
            int r5 = r9.mo22973f(r4)
            byte r4 = (byte) r5
            r12[r3] = r4
            int r3 = r3 + 1
            goto L_0x01f3
        L_0x0201:
            byte[] r11 = new byte[r0]
            r3 = 0
        L_0x0204:
            if (r3 >= r0) goto L_0x0013
            r4 = 8
            int r5 = r9.mo22973f(r4)
            byte r5 = (byte) r5
            r11[r3] = r5
            int r3 = r3 + 1
            goto L_0x0204
        L_0x0212:
            byte[] r13 = new byte[r0]
            r3 = 0
        L_0x0215:
            if (r3 >= r0) goto L_0x0013
            int r4 = r9.mo22973f(r0)
            byte r4 = (byte) r4
            r13[r3] = r4
            int r3 = r3 + 1
            goto L_0x0215
        L_0x0221:
            int r10 = r10 + 2
            r2 = r26
            goto L_0x0013
        L_0x0227:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p151kb.C5536b.m13753d(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    /* renamed from: e */
    public static C5537a m13754e(C6802q qVar, int i) {
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        C6802q qVar2 = qVar;
        int i6 = 8;
        int f = qVar2.mo22973f(8);
        qVar2.mo22979l(8);
        int i7 = i - 2;
        int i8 = 4;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] a = m13750a();
        int[] b = m13751b();
        while (i7 > 0) {
            int f2 = qVar2.mo22973f(i6);
            int f3 = qVar2.mo22973f(i6);
            int i9 = i7 - 2;
            if ((f3 & RecyclerView.C1119a0.FLAG_IGNORE) != 0) {
                iArr = iArr2;
            } else if ((f3 & 64) != 0) {
                iArr = a;
            } else {
                iArr = b;
            }
            if ((f3 & 1) != 0) {
                i5 = qVar2.mo22973f(i6);
                i4 = qVar2.mo22973f(i6);
                i3 = qVar2.mo22973f(i6);
                i2 = qVar2.mo22973f(i6);
                i7 = i9 - 4;
            } else {
                i7 = i9 - 2;
                i4 = qVar2.mo22973f(i8) << i8;
                i2 = qVar2.mo22973f(2) << 6;
                i5 = qVar2.mo22973f(6) << 2;
                i3 = qVar2.mo22973f(i8) << i8;
            }
            if (i5 == 0) {
                i4 = 0;
                i3 = 0;
                i2 = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
            }
            double d = (double) i5;
            double d2 = (double) (i4 - 128);
            double d3 = (double) (i3 - 128);
            iArr[f2] = m13752c((byte) (255 - (i2 & ValidationUtils.APPBOY_STRING_MAX_LENGTH)), C6774a0.m15947g((int) ((1.402d * d2) + d), 0, ValidationUtils.APPBOY_STRING_MAX_LENGTH), C6774a0.m15947g((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, ValidationUtils.APPBOY_STRING_MAX_LENGTH), C6774a0.m15947g((int) ((d3 * 1.772d) + d), 0, ValidationUtils.APPBOY_STRING_MAX_LENGTH));
            iArr2 = iArr2;
            f = f;
            i6 = 8;
            i8 = 4;
        }
        return new C5537a(f, iArr2, a, b);
    }

    /* renamed from: f */
    public static C5539c m13755f(C6802q qVar) {
        byte[] bArr;
        int f = qVar.mo22973f(16);
        qVar.mo22979l(4);
        int f2 = qVar.mo22973f(2);
        boolean e = qVar.mo22972e();
        qVar.mo22979l(1);
        byte[] bArr2 = C6774a0.f20964f;
        if (f2 == 1) {
            qVar.mo22979l(qVar.mo22973f(8) * 16);
        } else if (f2 == 0) {
            int f3 = qVar.mo22973f(16);
            int f4 = qVar.mo22973f(16);
            if (f3 > 0) {
                bArr2 = new byte[f3];
                qVar.mo22975h(f3, bArr2);
            }
            if (f4 > 0) {
                bArr = new byte[f4];
                qVar.mo22975h(f4, bArr);
                return new C5539c(f, e, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C5539c(f, e, bArr2, bArr);
    }
}
