package com.veriff.sdk.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.veriff.sdk.internal.ao */
public final class C21403ao {

    /* renamed from: a */
    private static final int[] f53852a = {0, 4, 1, 5};

    /* renamed from: b */
    private static final int[] f53853b = {6, 2, 7, 3};

    /* renamed from: c */
    private static final int[] f53854c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d */
    private static final int[] f53855d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: a */
    public static C21404ap m50994a(C21737h hVar, Map<Object, ?> map, boolean z) throws C21946l {
        C22469s a = hVar.mo55333a();
        List<C22292q[]> a2 = m50995a(z, a);
        if (a2.isEmpty()) {
            a = a.clone();
            a.mo56576a();
            a2 = m50995a(z, a);
        }
        return new C21404ap(a, a2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r4.hasNext() == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r5 = (com.veriff.sdk.internal.C22292q[]) r4.next();
        r7 = r5[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r7 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r3 = (int) java.lang.Math.max((float) r3, r7.mo56295b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r5 = r5[3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r5 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r3 = java.lang.Math.max(r3, (int) r5.mo56295b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r5 == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r4 = r0.iterator();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.veriff.sdk.internal.C22292q[]> m50995a(boolean r8, com.veriff.sdk.internal.C22469s r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = 0
        L_0x0008:
            r4 = 0
            r5 = 0
        L_0x000a:
            int r6 = r9.mo56581c()
            if (r3 >= r6) goto L_0x0076
            com.veriff.sdk.internal.q[] r4 = m50998a((com.veriff.sdk.internal.C22469s) r9, (int) r3, (int) r4)
            r6 = r4[r2]
            if (r6 != 0) goto L_0x004e
            r6 = 3
            r7 = r4[r6]
            if (r7 != 0) goto L_0x004e
            if (r5 == 0) goto L_0x0076
            java.util.Iterator r4 = r0.iterator()
        L_0x0023:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004b
            java.lang.Object r5 = r4.next()
            com.veriff.sdk.internal.q[] r5 = (com.veriff.sdk.internal.C22292q[]) r5
            r7 = r5[r1]
            if (r7 == 0) goto L_0x003d
            float r3 = (float) r3
            float r7 = r7.mo56295b()
            float r3 = java.lang.Math.max(r3, r7)
            int r3 = (int) r3
        L_0x003d:
            r5 = r5[r6]
            if (r5 == 0) goto L_0x0023
            float r5 = r5.mo56295b()
            int r5 = (int) r5
            int r3 = java.lang.Math.max(r3, r5)
            goto L_0x0023
        L_0x004b:
            int r3 = r3 + 5
            goto L_0x0008
        L_0x004e:
            r0.add(r4)
            if (r8 == 0) goto L_0x0076
            r3 = 2
            r5 = r4[r3]
            if (r5 == 0) goto L_0x0064
            float r5 = r5.mo56294a()
            int r5 = (int) r5
            r3 = r4[r3]
            float r3 = r3.mo56295b()
            goto L_0x0072
        L_0x0064:
            r3 = 4
            r5 = r4[r3]
            float r5 = r5.mo56294a()
            int r5 = (int) r5
            r3 = r4[r3]
            float r3 = r3.mo56295b()
        L_0x0072:
            int r3 = (int) r3
            r4 = r5
            r5 = 1
            goto L_0x000a
        L_0x0076:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21403ao.m50995a(boolean, com.veriff.sdk.internal.s):java.util.List");
    }

    /* renamed from: a */
    private static C22292q[] m50998a(C22469s sVar, int i, int i2) {
        int c = sVar.mo56581c();
        int b = sVar.mo56578b();
        C22292q[] qVarArr = new C22292q[8];
        m50996a(qVarArr, m50999a(sVar, c, b, i, i2, f53854c), f53852a);
        C22292q qVar = qVarArr[4];
        if (qVar != null) {
            i2 = (int) qVar.mo56294a();
            i = (int) qVarArr[4].mo56295b();
        }
        m50996a(qVarArr, m50999a(sVar, c, b, i, i2, f53855d), f53853b);
        return qVarArr;
    }

    /* renamed from: a */
    private static void m50996a(C22292q[] qVarArr, C22292q[] qVarArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            qVarArr[iArr[i]] = qVarArr2[i];
        }
    }

    /* renamed from: a */
    private static C22292q[] m50999a(C22469s sVar, int i, int i2, int i3, int i4, int[] iArr) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        C22292q[] qVarArr = new C22292q[4];
        int[] iArr2 = new int[iArr.length];
        int i9 = i3;
        while (true) {
            if (i9 >= i8) {
                z = false;
                break;
            }
            int[] a = m50997a(sVar, i4, i9, i2, false, iArr, iArr2);
            if (a != null) {
                int i11 = i9;
                int[] iArr3 = a;
                int i12 = i11;
                while (true) {
                    if (i12 <= 0) {
                        i7 = i12;
                        break;
                    }
                    int i13 = i12 - 1;
                    int[] a2 = m50997a(sVar, i4, i13, i2, false, iArr, iArr2);
                    if (a2 == null) {
                        i7 = i13 + 1;
                        break;
                    }
                    iArr3 = a2;
                    i12 = i13;
                }
                float f = (float) i7;
                qVarArr[0] = new C22292q((float) iArr3[0], f);
                qVarArr[1] = new C22292q((float) iArr3[1], f);
                i9 = i7;
                z = true;
            } else {
                i9 += 5;
            }
        }
        int i14 = i9 + 1;
        if (z) {
            int[] iArr4 = {(int) qVarArr[0].mo56294a(), (int) qVarArr[1].mo56294a()};
            int i15 = i14;
            int i16 = 0;
            while (true) {
                if (i15 >= i8) {
                    i5 = i16;
                    i6 = i15;
                    break;
                }
                i5 = i16;
                i6 = i15;
                int[] a3 = m50997a(sVar, iArr4[0], i15, i2, false, iArr, iArr2);
                if (a3 == null || Math.abs(iArr4[0] - a3[0]) >= 5 || Math.abs(iArr4[1] - a3[1]) >= 5) {
                    if (i5 > 25) {
                        break;
                    }
                    i16 = i5 + 1;
                } else {
                    iArr4 = a3;
                    i16 = 0;
                }
                i15 = i6 + 1;
            }
            i14 = i6 - (i5 + 1);
            float f2 = (float) i14;
            qVarArr[2] = new C22292q((float) iArr4[0], f2);
            qVarArr[3] = new C22292q((float) iArr4[1], f2);
        }
        if (i14 - i9 < 10) {
            Arrays.fill(qVarArr, (Object) null);
        }
        return qVarArr;
    }

    /* renamed from: a */
    private static int[] m50997a(C22469s sVar, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (sVar.mo56577a(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        int length = iArr.length;
        boolean z2 = z;
        int i6 = 0;
        int i7 = i;
        while (i < i3) {
            if (sVar.mo56577a(i, i2) != z2) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                if (i6 != length - 1) {
                    i6++;
                } else if (m50993a(iArr2, iArr, 0.8f) < 0.42f) {
                    return new int[]{i7, i};
                } else {
                    i7 += iArr2[0] + iArr2[1];
                    int i8 = i6 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i6] = 0;
                    i6--;
                }
                iArr2[i6] = 1;
                z2 = !z2;
            }
            i++;
        }
        if (i6 != length - 1 || m50993a(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i - 1};
    }

    /* renamed from: a */
    private static float m50993a(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = f * f3;
        float f5 = BitmapDescriptorFactory.HUE_RED;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = ((float) iArr2[i4]) * f3;
            float f7 = (float) i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }
}
