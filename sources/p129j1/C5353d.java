package p129j1;

import android.graphics.Path;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: j1.d */
public final class C5353d {
    /* renamed from: a */
    public static boolean m13423a(C5354a[] aVarArr, C5354a[] aVarArr2) {
        if (aVarArr == null || aVarArr2 == null || aVarArr.length != aVarArr2.length) {
            return false;
        }
        for (int i = 0; i < aVarArr.length; i++) {
            C5354a aVar = aVarArr[i];
            char c = aVar.f17651a;
            C5354a aVar2 = aVarArr2[i];
            if (c != aVar2.f17651a || aVar.f17652b.length != aVar2.f17652b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static float[] m13424b(int i, float[] fArr) {
        if (i >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int i2 = i - 0;
                int min = Math.min(i2, length - 0);
                float[] fArr2 = new float[i2];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (r13 == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008d, code lost:
        r11 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098 A[Catch:{ NumberFormatException -> 0x00b9 }, LOOP:3: B:25:0x006d->B:45:0x0098, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0097 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p129j1.C5353d.C5354a[] m13425c(java.lang.String r16) {
        /*
            r0 = r16
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 1
            r4 = 0
        L_0x000e:
            int r5 = r16.length()
            if (r3 >= r5) goto L_0x00de
        L_0x0014:
            int r5 = r16.length()
            r6 = 69
            r7 = 101(0x65, float:1.42E-43)
            if (r3 >= r5) goto L_0x003a
            char r5 = r0.charAt(r3)
            int r8 = r5 + -65
            int r9 = r5 + -90
            int r9 = r9 * r8
            if (r9 <= 0) goto L_0x0032
            int r8 = r5 + -97
            int r9 = r5 + -122
            int r9 = r9 * r8
            if (r9 > 0) goto L_0x0037
        L_0x0032:
            if (r5 == r7) goto L_0x0037
            if (r5 == r6) goto L_0x0037
            goto L_0x003a
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x0014
        L_0x003a:
            java.lang.String r4 = r0.substring(r4, r3)
            java.lang.String r4 = r4.trim()
            int r5 = r4.length()
            if (r5 <= 0) goto L_0x00d6
            char r5 = r4.charAt(r2)
            r8 = 122(0x7a, float:1.71E-43)
            if (r5 == r8) goto L_0x00c8
            char r5 = r4.charAt(r2)
            r8 = 90
            if (r5 != r8) goto L_0x005a
            goto L_0x00c8
        L_0x005a:
            int r2 = r4.length()     // Catch:{ NumberFormatException -> 0x00b9 }
            float[] r2 = new float[r2]     // Catch:{ NumberFormatException -> 0x00b9 }
            int r5 = r4.length()     // Catch:{ NumberFormatException -> 0x00b9 }
            r8 = 1
            r9 = 0
        L_0x0066:
            if (r8 >= r5) goto L_0x00b1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = r8
        L_0x006d:
            int r15 = r4.length()     // Catch:{ NumberFormatException -> 0x00b9 }
            if (r14 >= r15) goto L_0x009b
            char r15 = r4.charAt(r14)     // Catch:{ NumberFormatException -> 0x00b9 }
            r7 = 32
            if (r15 == r7) goto L_0x0091
            r7 = 101(0x65, float:1.42E-43)
            if (r15 == r6) goto L_0x008f
            if (r15 == r7) goto L_0x008f
            switch(r15) {
                case 44: goto L_0x0093;
                case 45: goto L_0x0089;
                case 46: goto L_0x0085;
                default: goto L_0x0084;
            }     // Catch:{ NumberFormatException -> 0x00b9 }
        L_0x0084:
            goto L_0x0094
        L_0x0085:
            if (r12 != 0) goto L_0x008d
            r12 = 1
            goto L_0x0094
        L_0x0089:
            if (r14 == r8) goto L_0x0094
            if (r13 != 0) goto L_0x0094
        L_0x008d:
            r11 = 1
            goto L_0x0093
        L_0x008f:
            r13 = 1
            goto L_0x0095
        L_0x0091:
            r7 = 101(0x65, float:1.42E-43)
        L_0x0093:
            r10 = 1
        L_0x0094:
            r13 = 0
        L_0x0095:
            if (r10 == 0) goto L_0x0098
            goto L_0x009b
        L_0x0098:
            int r14 = r14 + 1
            goto L_0x006d
        L_0x009b:
            if (r8 >= r14) goto L_0x00aa
            int r10 = r9 + 1
            java.lang.String r8 = r4.substring(r8, r14)     // Catch:{ NumberFormatException -> 0x00b9 }
            float r8 = java.lang.Float.parseFloat(r8)     // Catch:{ NumberFormatException -> 0x00b9 }
            r2[r9] = r8     // Catch:{ NumberFormatException -> 0x00b9 }
            r9 = r10
        L_0x00aa:
            if (r11 == 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            int r14 = r14 + 1
        L_0x00af:
            r8 = r14
            goto L_0x0066
        L_0x00b1:
            float[] r2 = m13424b(r9, r2)     // Catch:{ NumberFormatException -> 0x00b9 }
            r5 = 0
            r5 = r2
            r2 = 0
            goto L_0x00ca
        L_0x00b9:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "error in parsing \""
            java.lang.String r3 = "\""
            java.lang.String r2 = p358af.C13437d.m33706k(r2, r4, r3)
            r1.<init>(r2, r0)
            throw r1
        L_0x00c8:
            float[] r5 = new float[r2]
        L_0x00ca:
            char r2 = r4.charAt(r2)
            j1.d$a r4 = new j1.d$a
            r4.<init>(r2, r5)
            r1.add(r4)
        L_0x00d6:
            int r2 = r3 + 1
            r4 = 0
            r4 = r3
            r3 = r2
            r2 = 0
            goto L_0x000e
        L_0x00de:
            int r3 = r3 - r4
            r2 = 1
            if (r3 != r2) goto L_0x00f7
            int r2 = r16.length()
            if (r4 >= r2) goto L_0x00f7
            char r0 = r0.charAt(r4)
            r2 = 0
            float[] r2 = new float[r2]
            j1.d$a r3 = new j1.d$a
            r3.<init>(r0, r2)
            r1.add(r3)
        L_0x00f7:
            int r0 = r1.size()
            j1.d$a[] r0 = new p129j1.C5353d.C5354a[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            j1.d$a[] r0 = (p129j1.C5353d.C5354a[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p129j1.C5353d.m13425c(java.lang.String):j1.d$a[]");
    }

    /* renamed from: d */
    public static Path m13426d(String str) {
        Path path = new Path();
        C5354a[] c = m13425c(str);
        if (c == null) {
            return null;
        }
        try {
            C5354a.m13429b(c, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException(C25541a.m63881k("Error in parsing ", str), e);
        }
    }

    /* renamed from: e */
    public static C5354a[] m13427e(C5354a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        C5354a[] aVarArr2 = new C5354a[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            aVarArr2[i] = new C5354a(aVarArr[i]);
        }
        return aVarArr2;
    }

    /* renamed from: j1.d$a */
    public static class C5354a {

        /* renamed from: a */
        public char f17651a;

        /* renamed from: b */
        public float[] f17652b;

        public C5354a(char c, float[] fArr) {
            this.f17651a = c;
            this.f17652b = fArr;
        }

        /* renamed from: a */
        public static void m13428a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            boolean z3;
            float f8 = f;
            float f9 = f3;
            float f11 = f5;
            boolean z4 = z2;
            double radians = Math.toRadians((double) f7);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = (double) f8;
            double d4 = (double) f2;
            double d5 = (d4 * sin) + (d3 * cos);
            double d6 = d3;
            double d7 = (double) f11;
            double d8 = d5 / d7;
            double d9 = radians;
            double d11 = (double) f6;
            double d12 = ((d4 * cos) + (((double) (-f8)) * sin)) / d11;
            double d13 = d4;
            double d14 = (double) f4;
            double d15 = ((d14 * sin) + (((double) f9) * cos)) / d7;
            double d16 = ((d14 * cos) + (((double) (-f9)) * sin)) / d11;
            double d17 = d8 - d15;
            double d18 = d12 - d16;
            double d19 = (d8 + d15) / 2.0d;
            double d21 = (d12 + d16) / 2.0d;
            double d22 = (d18 * d18) + (d17 * d17);
            if (d22 != 0.0d) {
                double d23 = (1.0d / d22) - 0.25d;
                if (d23 < 0.0d) {
                    float sqrt = (float) (Math.sqrt(d22) / 1.99999d);
                    m13428a(path, f, f2, f3, f4, f11 * sqrt, f6 * sqrt, f7, z, z2);
                    return;
                }
                double sqrt2 = Math.sqrt(d23);
                double d24 = d17 * sqrt2;
                double d25 = sqrt2 * d18;
                if (z == z4) {
                    d2 = d19 - d25;
                    d = d21 + d24;
                } else {
                    d2 = d19 + d25;
                    d = d21 - d24;
                }
                double d26 = d12 - d;
                double d27 = sin;
                double atan2 = Math.atan2(d26, d8 - d2);
                double atan22 = Math.atan2(d16 - d, d15 - d2) - atan2;
                int i = 0;
                int i2 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
                if (i2 >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z4 != z3) {
                    if (i2 > 0) {
                        atan22 -= 6.283185307179586d;
                    } else {
                        atan22 += 6.283185307179586d;
                    }
                }
                double d28 = d2 * d7;
                double d29 = d * d11;
                double d31 = (d28 * cos) - (d29 * d27);
                double d32 = (d29 * cos) + (d28 * d27);
                int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
                double cos2 = Math.cos(d9);
                double sin2 = Math.sin(d9);
                double cos3 = Math.cos(atan2);
                double sin3 = Math.sin(atan2);
                double d33 = -d7;
                double d34 = d33 * cos2;
                double d35 = d11 * sin2;
                double d36 = (d34 * sin3) - (d35 * cos3);
                double d37 = d33 * sin2;
                double d38 = d11 * cos2;
                double d39 = (cos3 * d38) + (sin3 * d37);
                double d41 = atan22 / ((double) ceil);
                double d42 = atan2;
                while (i < ceil) {
                    double d43 = d42 + d41;
                    double sin4 = Math.sin(d43);
                    double cos4 = Math.cos(d43);
                    double d44 = d41;
                    double d45 = (((d7 * cos2) * cos4) + d31) - (d35 * sin4);
                    double d46 = d31;
                    double d47 = (d38 * sin4) + (d7 * sin2 * cos4) + d32;
                    double d48 = (d34 * sin4) - (d35 * cos4);
                    double d49 = (cos4 * d38) + (sin4 * d37);
                    double d51 = d43 - d42;
                    double tan = Math.tan(d51 / 2.0d);
                    double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d51)) / 3.0d;
                    double d52 = (d36 * sqrt3) + d6;
                    int i3 = ceil;
                    double d53 = d38;
                    double d54 = (d39 * sqrt3) + d13;
                    double d55 = d37;
                    path.rLineTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                    path.cubicTo((float) d52, (float) d54, (float) (d45 - (sqrt3 * d48)), (float) (d47 - (sqrt3 * d49)), (float) d45, (float) d47);
                    i++;
                    d38 = d53;
                    d37 = d55;
                    ceil = i3;
                    cos2 = cos2;
                    d42 = d43;
                    d7 = d7;
                    d39 = d49;
                    d36 = d48;
                    d6 = d45;
                    d13 = d47;
                    d41 = d44;
                    d31 = d46;
                }
            }
        }

        /* renamed from: b */
        public static void m13429b(C5354a[] aVarArr, Path path) {
            int i;
            float f;
            float f2;
            int i2;
            int i3;
            float[] fArr;
            char c;
            int i4;
            float[] fArr2;
            char c2;
            int i5;
            boolean z;
            boolean z2;
            float f3;
            float f4;
            float f5;
            float f6;
            int i6;
            boolean z3;
            boolean z4;
            float f7;
            float f8;
            int i7;
            float f9;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f21;
            float f22;
            float f23;
            float f24;
            float f25;
            float f26;
            float f27;
            C5354a[] aVarArr2 = aVarArr;
            Path path2 = path;
            float[] fArr3 = new float[6];
            char c3 = 'm';
            char c4 = 0;
            char c5 = 'm';
            int i8 = 0;
            while (i8 < aVarArr2.length) {
                C5354a aVar = aVarArr2[i8];
                char c6 = aVar.f17651a;
                float[] fArr4 = aVar.f17652b;
                float f28 = fArr3[c4];
                float f29 = fArr3[1];
                float f31 = fArr3[2];
                float f32 = fArr3[3];
                float f33 = fArr3[4];
                float f34 = fArr3[5];
                switch (c6) {
                    case 'A':
                    case 'a':
                        i = 7;
                        break;
                    case 'C':
                    case 'c':
                        i = 6;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path2.moveTo(f33, f34);
                        f28 = f33;
                        f31 = f28;
                        f29 = f34;
                        f32 = f29;
                        break;
                }
                i = 2;
                float f35 = f33;
                float f36 = f34;
                float f37 = f28;
                float f38 = f29;
                int i9 = 0;
                while (i9 < fArr4.length) {
                    if (c6 != 'A') {
                        if (c6 != 'C') {
                            if (c6 == 'H') {
                                i2 = i9;
                                fArr = fArr4;
                                c = c6;
                                i3 = i8;
                                int i11 = i2 + 0;
                                path2.lineTo(fArr[i11], f38);
                                f37 = fArr[i11];
                            } else if (c6 == 'Q') {
                                i6 = i9;
                                fArr = fArr4;
                                c = c6;
                                i3 = i8;
                                int i12 = i6 + 0;
                                int i13 = i6 + 1;
                                int i14 = i6 + 2;
                                int i15 = i6 + 3;
                                path2.quadTo(fArr[i12], fArr[i13], fArr[i14], fArr[i15]);
                                f6 = fArr[i12];
                                f5 = fArr[i13];
                                f37 = fArr[i14];
                                f38 = fArr[i15];
                            } else if (c6 == 'V') {
                                i2 = i9;
                                fArr = fArr4;
                                c = c6;
                                i3 = i8;
                                int i16 = i2 + 0;
                                path2.lineTo(f37, fArr[i16]);
                                f38 = fArr[i16];
                            } else if (c6 != 'a') {
                                if (c6 != 'c') {
                                    if (c6 == 'h') {
                                        i2 = i9;
                                        float f39 = f38;
                                        int i17 = i2 + 0;
                                        path2.rLineTo(fArr4[i17], BitmapDescriptorFactory.HUE_RED);
                                        f37 += fArr4[i17];
                                    } else if (c6 != 'q') {
                                        if (c6 != 'v') {
                                            if (c6 != 'L') {
                                                if (c6 == 'M') {
                                                    i2 = i9;
                                                    f18 = fArr4[i2 + 0];
                                                    f17 = fArr4[i2 + 1];
                                                    if (i2 > 0) {
                                                        path2.lineTo(f18, f17);
                                                    } else {
                                                        path2.moveTo(f18, f17);
                                                        f35 = f18;
                                                        f36 = f17;
                                                    }
                                                } else if (c6 == 'S') {
                                                    i7 = i9;
                                                    float f41 = f38;
                                                    float f42 = f37;
                                                    if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                        f19 = (f41 * 2.0f) - f;
                                                        f21 = (f42 * 2.0f) - f2;
                                                    } else {
                                                        f21 = f42;
                                                        f19 = f41;
                                                    }
                                                    int i18 = i7 + 0;
                                                    int i19 = i7 + 1;
                                                    int i21 = i7 + 2;
                                                    int i22 = i7 + 3;
                                                    path.cubicTo(f21, f19, fArr4[i18], fArr4[i19], fArr4[i21], fArr4[i22]);
                                                    float f43 = fArr4[i18];
                                                    float f44 = fArr4[i19];
                                                    f8 = fArr4[i21];
                                                    f7 = fArr4[i22];
                                                    f2 = f43;
                                                    f = f44;
                                                    f37 = f8;
                                                    f38 = f7;
                                                } else if (c6 == 'T') {
                                                    i2 = i9;
                                                    float f45 = f38;
                                                    float f46 = f37;
                                                    if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                        f22 = (f46 * 2.0f) - f2;
                                                        f23 = (f45 * 2.0f) - f;
                                                    } else {
                                                        f22 = f46;
                                                        f23 = f45;
                                                    }
                                                    int i23 = i2 + 0;
                                                    int i24 = i2 + 1;
                                                    path2.quadTo(f22, f23, fArr4[i23], fArr4[i24]);
                                                    f = f23;
                                                    f2 = f22;
                                                    fArr = fArr4;
                                                    c = c6;
                                                    i3 = i8;
                                                    f37 = fArr4[i23];
                                                    f38 = fArr4[i24];
                                                } else if (c6 == 'l') {
                                                    i2 = i9;
                                                    f15 = f38;
                                                    int i25 = i2 + 0;
                                                    int i26 = i2 + 1;
                                                    path2.rLineTo(fArr4[i25], fArr4[i26]);
                                                    f37 += fArr4[i25];
                                                    f16 = fArr4[i26];
                                                } else if (c6 == c3) {
                                                    i2 = i9;
                                                    float f47 = fArr4[i2 + 0];
                                                    f37 += f47;
                                                    float f48 = fArr4[i2 + 1];
                                                    f38 += f48;
                                                    if (i2 > 0) {
                                                        path2.rLineTo(f47, f48);
                                                    } else {
                                                        path2.rMoveTo(f47, f48);
                                                        f36 = f38;
                                                        f35 = f37;
                                                    }
                                                } else if (c6 != 's') {
                                                    if (c6 == 't') {
                                                        if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                            f26 = f37 - f2;
                                                            f27 = f38 - f;
                                                        } else {
                                                            f27 = BitmapDescriptorFactory.HUE_RED;
                                                            f26 = BitmapDescriptorFactory.HUE_RED;
                                                        }
                                                        int i27 = i9 + 0;
                                                        int i28 = i9 + 1;
                                                        path2.rQuadTo(f26, f27, fArr4[i27], fArr4[i28]);
                                                        float f49 = f26 + f37;
                                                        float f51 = f27 + f38;
                                                        f37 += fArr4[i27];
                                                        f38 += fArr4[i28];
                                                        f = f51;
                                                        f2 = f49;
                                                    }
                                                    i2 = i9;
                                                } else {
                                                    if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                        f24 = f38 - f;
                                                        f25 = f37 - f2;
                                                    } else {
                                                        f25 = BitmapDescriptorFactory.HUE_RED;
                                                        f24 = BitmapDescriptorFactory.HUE_RED;
                                                    }
                                                    int i29 = i9 + 0;
                                                    int i31 = i9 + 1;
                                                    int i32 = i9 + 2;
                                                    int i33 = i9 + 3;
                                                    i7 = i9;
                                                    f9 = f38;
                                                    float f52 = f37;
                                                    path.rCubicTo(f25, f24, fArr4[i29], fArr4[i31], fArr4[i32], fArr4[i33]);
                                                    f13 = fArr4[i29] + f52;
                                                    f12 = fArr4[i31] + f9;
                                                    f11 = f52 + fArr4[i32];
                                                    f14 = fArr4[i33];
                                                }
                                                f37 = f35;
                                                f38 = f36;
                                            } else {
                                                i2 = i9;
                                                int i34 = i2 + 0;
                                                int i35 = i2 + 1;
                                                path2.lineTo(fArr4[i34], fArr4[i35]);
                                                f18 = fArr4[i34];
                                                f17 = fArr4[i35];
                                            }
                                            f37 = f18;
                                            f38 = f17;
                                        } else {
                                            i2 = i9;
                                            f15 = f38;
                                            float f53 = f37;
                                            int i36 = i2 + 0;
                                            path2.rLineTo(BitmapDescriptorFactory.HUE_RED, fArr4[i36]);
                                            f16 = fArr4[i36];
                                        }
                                        f38 = f15 + f16;
                                    } else {
                                        i7 = i9;
                                        f9 = f38;
                                        float f54 = f37;
                                        int i37 = i7 + 0;
                                        int i38 = i7 + 1;
                                        int i39 = i7 + 2;
                                        int i41 = i7 + 3;
                                        path2.rQuadTo(fArr4[i37], fArr4[i38], fArr4[i39], fArr4[i41]);
                                        f13 = fArr4[i37] + f54;
                                        f12 = fArr4[i38] + f9;
                                        float f55 = f54 + fArr4[i39];
                                        float f56 = fArr4[i41];
                                        f11 = f55;
                                        f14 = f56;
                                    }
                                    fArr = fArr4;
                                    c = c6;
                                    i3 = i8;
                                } else {
                                    i7 = i9;
                                    f9 = f38;
                                    float f57 = f37;
                                    int i42 = i7 + 2;
                                    int i43 = i7 + 3;
                                    int i44 = i7 + 4;
                                    int i45 = i7 + 5;
                                    path.rCubicTo(fArr4[i7 + 0], fArr4[i7 + 1], fArr4[i42], fArr4[i43], fArr4[i44], fArr4[i45]);
                                    f13 = fArr4[i42] + f57;
                                    f12 = fArr4[i43] + f9;
                                    f11 = f57 + fArr4[i44];
                                    f14 = fArr4[i45];
                                }
                                f7 = f9 + f14;
                                f2 = f13;
                                f = f12;
                                f8 = f11;
                                f37 = f8;
                                f38 = f7;
                                fArr = fArr4;
                                c = c6;
                                i3 = i8;
                            } else {
                                i4 = i9;
                                float f58 = f38;
                                float f59 = f37;
                                int i46 = i4 + 5;
                                float f61 = fArr4[i46] + f59;
                                int i47 = i4 + 6;
                                float f62 = fArr4[i47] + f58;
                                float f63 = fArr4[i4 + 0];
                                float f64 = fArr4[i4 + 1];
                                float f65 = fArr4[i4 + 2];
                                if (fArr4[i4 + 3] != BitmapDescriptorFactory.HUE_RED) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (fArr4[i4 + 4] != BitmapDescriptorFactory.HUE_RED) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                fArr2 = fArr4;
                                float f66 = f65;
                                c2 = c6;
                                i5 = i8;
                                m13428a(path, f59, f58, f61, f62, f63, f64, f66, z3, z4);
                                f3 = f59 + fArr2[i46];
                                f4 = f58 + fArr2[i47];
                            }
                            i9 = i2 + i;
                            c5 = c;
                            c6 = c5;
                            fArr4 = fArr;
                            i8 = i3;
                            c3 = 'm';
                            C5354a[] aVarArr3 = aVarArr;
                        } else {
                            i6 = i9;
                            fArr = fArr4;
                            c = c6;
                            i3 = i8;
                            int i48 = i6 + 2;
                            int i49 = i6 + 3;
                            int i51 = i6 + 4;
                            int i52 = i6 + 5;
                            path.cubicTo(fArr[i6 + 0], fArr[i6 + 1], fArr[i48], fArr[i49], fArr[i51], fArr[i52]);
                            float f67 = fArr[i51];
                            float f68 = fArr[i52];
                            f6 = fArr[i48];
                            f37 = f67;
                            f38 = f68;
                            f5 = fArr[i49];
                        }
                        f2 = f6;
                        f = f5;
                        i9 = i2 + i;
                        c5 = c;
                        c6 = c5;
                        fArr4 = fArr;
                        i8 = i3;
                        c3 = 'm';
                        C5354a[] aVarArr32 = aVarArr;
                    } else {
                        i4 = i9;
                        float f69 = f38;
                        float f71 = f37;
                        fArr2 = fArr4;
                        c2 = c6;
                        i5 = i8;
                        int i53 = i4 + 5;
                        float f72 = fArr2[i53];
                        int i54 = i4 + 6;
                        float f73 = fArr2[i54];
                        float f74 = fArr2[i4 + 0];
                        float f75 = fArr2[i4 + 1];
                        float f76 = fArr2[i4 + 2];
                        if (fArr2[i4 + 3] != BitmapDescriptorFactory.HUE_RED) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fArr2[i4 + 4] != BitmapDescriptorFactory.HUE_RED) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        m13428a(path, f71, f69, f72, f73, f74, f75, f76, z, z2);
                        f3 = fArr2[i53];
                        f4 = fArr2[i54];
                    }
                    f = f38;
                    f2 = f37;
                    i9 = i2 + i;
                    c5 = c;
                    c6 = c5;
                    fArr4 = fArr;
                    i8 = i3;
                    c3 = 'm';
                    C5354a[] aVarArr322 = aVarArr;
                }
                int i55 = i8;
                fArr3[0] = f37;
                fArr3[1] = f38;
                fArr3[2] = f2;
                fArr3[3] = f;
                fArr3[4] = f35;
                fArr3[5] = f36;
                i8 = i55 + 1;
                c5 = aVarArr[i55].f17651a;
                c3 = 'm';
                c4 = 0;
                aVarArr2 = aVarArr;
            }
        }

        public C5354a(C5354a aVar) {
            this.f17651a = aVar.f17651a;
            float[] fArr = aVar.f17652b;
            this.f17652b = C5353d.m13424b(fArr.length, fArr);
        }
    }
}
