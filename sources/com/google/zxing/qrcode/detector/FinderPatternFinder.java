package com.google.zxing.qrcode.detector;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import p043ch.C13831b;
import p604kh.C18044c;
import p935yg.C20726h;

public final class FinderPatternFinder {

    /* renamed from: a */
    public final C13831b f36921a;

    /* renamed from: b */
    public final ArrayList f36922b = new ArrayList();

    /* renamed from: c */
    public boolean f36923c;

    /* renamed from: d */
    public final int[] f36924d = new int[5];

    /* renamed from: e */
    public final C20726h f36925e;

    public static final class CenterComparator implements Serializable, Comparator<C18044c> {
        private final float average;

        public CenterComparator(float f) {
            this.average = f;
        }

        public final int compare(Object obj, Object obj2) {
            C18044c cVar = (C18044c) obj;
            C18044c cVar2 = (C18044c) obj2;
            int compare = Integer.compare(cVar2.f46166d, cVar.f46166d);
            if (compare == 0) {
                return Float.compare(Math.abs(cVar.f46165c - this.average), Math.abs(cVar2.f46165c - this.average));
            }
            return compare;
        }
    }

    public static final class FurthestFromAverageComparator implements Serializable, Comparator<C18044c> {
        private final float average;

        public FurthestFromAverageComparator(float f) {
            this.average = f;
        }

        public final int compare(Object obj, Object obj2) {
            return Float.compare(Math.abs(((C18044c) obj2).f46165c - this.average), Math.abs(((C18044c) obj).f46165c - this.average));
        }
    }

    public FinderPatternFinder(C13831b bVar, C20726h hVar) {
        this.f36921a = bVar;
        this.f36925e = hVar;
    }

    /* renamed from: a */
    public static float m36750a(int i, int[] iArr) {
        return ((float) ((i - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    /* renamed from: b */
    public static boolean m36751b(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = ((float) i) / 7.0f;
        float f2 = f / 2.0f;
        if (Math.abs(f - ((float) iArr[0])) >= f2 || Math.abs(f - ((float) iArr[1])) >= f2 || Math.abs((f * 3.0f) - ((float) iArr[2])) >= 3.0f * f2 || Math.abs(f - ((float) iArr[3])) >= f2 || Math.abs(f - ((float) iArr[4])) >= f2) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0353 A[LOOP:22: B:190:0x02ee->B:204:0x0353, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x032f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:269:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ee  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo44171c(int[] r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            r3 = r1[r2]
            r4 = 1
            r5 = r1[r4]
            int r3 = r3 + r5
            r5 = 2
            r6 = r1[r5]
            int r3 = r3 + r6
            r6 = 3
            r7 = r1[r6]
            int r3 = r3 + r7
            r7 = 4
            r8 = r1[r7]
            int r3 = r3 + r8
            r8 = r20
            float r8 = m36750a(r8, r1)
            int r8 = (int) r8
            r9 = r1[r5]
            ch.b r10 = r0.f36921a
            int r11 = r10.f34028c
            int[] r12 = r0.f36924d
            r13 = 0
        L_0x0027:
            int r14 = r12.length
            if (r13 >= r14) goto L_0x002f
            r12[r13] = r2
            int r13 = r13 + 1
            goto L_0x0027
        L_0x002f:
            int[] r12 = r0.f36924d
            r13 = r19
        L_0x0033:
            if (r13 < 0) goto L_0x0043
            boolean r14 = r10.mo40764b(r8, r13)
            if (r14 == 0) goto L_0x0043
            r14 = r12[r5]
            int r14 = r14 + r4
            r12[r5] = r14
            int r13 = r13 + -1
            goto L_0x0033
        L_0x0043:
            r15 = 5
            if (r13 >= 0) goto L_0x0048
            goto L_0x00e6
        L_0x0048:
            if (r13 < 0) goto L_0x005b
            boolean r16 = r10.mo40764b(r8, r13)
            if (r16 != 0) goto L_0x005b
            r14 = r12[r4]
            if (r14 > r9) goto L_0x005b
            int r14 = r14 + 1
            r12[r4] = r14
            int r13 = r13 + -1
            goto L_0x0048
        L_0x005b:
            if (r13 < 0) goto L_0x00e6
            r14 = r12[r4]
            if (r14 <= r9) goto L_0x0063
            goto L_0x00e6
        L_0x0063:
            if (r13 < 0) goto L_0x0076
            boolean r14 = r10.mo40764b(r8, r13)
            if (r14 == 0) goto L_0x0076
            r14 = r12[r2]
            if (r14 > r9) goto L_0x0076
            int r14 = r14 + 1
            r12[r2] = r14
            int r13 = r13 + -1
            goto L_0x0063
        L_0x0076:
            r13 = r12[r2]
            if (r13 <= r9) goto L_0x007c
            goto L_0x00e6
        L_0x007c:
            int r13 = r19 + 1
        L_0x007e:
            if (r13 >= r11) goto L_0x008e
            boolean r14 = r10.mo40764b(r8, r13)
            if (r14 == 0) goto L_0x008e
            r14 = r12[r5]
            int r14 = r14 + r4
            r12[r5] = r14
            int r13 = r13 + 1
            goto L_0x007e
        L_0x008e:
            if (r13 != r11) goto L_0x0091
            goto L_0x00e6
        L_0x0091:
            if (r13 >= r11) goto L_0x00a4
            boolean r14 = r10.mo40764b(r8, r13)
            if (r14 != 0) goto L_0x00a4
            r14 = r12[r6]
            if (r14 >= r9) goto L_0x00a4
            int r14 = r14 + 1
            r12[r6] = r14
            int r13 = r13 + 1
            goto L_0x0091
        L_0x00a4:
            if (r13 == r11) goto L_0x00e6
            r14 = r12[r6]
            if (r14 < r9) goto L_0x00ab
            goto L_0x00e6
        L_0x00ab:
            if (r13 >= r11) goto L_0x00be
            boolean r14 = r10.mo40764b(r8, r13)
            if (r14 == 0) goto L_0x00be
            r14 = r12[r7]
            if (r14 >= r9) goto L_0x00be
            int r14 = r14 + 1
            r12[r7] = r14
            int r13 = r13 + 1
            goto L_0x00ab
        L_0x00be:
            r10 = r12[r7]
            if (r10 < r9) goto L_0x00c3
            goto L_0x00e6
        L_0x00c3:
            r9 = r12[r2]
            r11 = r12[r4]
            int r9 = r9 + r11
            r11 = r12[r5]
            int r9 = r9 + r11
            r11 = r12[r6]
            int r9 = r9 + r11
            int r9 = r9 + r10
            int r9 = r9 - r3
            int r9 = java.lang.Math.abs(r9)
            int r9 = r9 * 5
            int r10 = r3 * 2
            if (r9 < r10) goto L_0x00db
            goto L_0x00e6
        L_0x00db:
            boolean r9 = m36751b(r12)
            if (r9 == 0) goto L_0x00e6
            float r9 = m36750a(r13, r12)
            goto L_0x00e8
        L_0x00e6:
            r9 = 2143289344(0x7fc00000, float:NaN)
        L_0x00e8:
            boolean r10 = java.lang.Float.isNaN(r9)
            if (r10 != 0) goto L_0x036b
            int r10 = (int) r9
            r1 = r1[r5]
            ch.b r11 = r0.f36921a
            int r12 = r11.f34027b
            int[] r13 = r0.f36924d
            r14 = 0
        L_0x00f8:
            int r15 = r13.length
            if (r14 >= r15) goto L_0x0100
            r13[r14] = r2
            int r14 = r14 + 1
            goto L_0x00f8
        L_0x0100:
            int[] r13 = r0.f36924d
            r14 = r8
        L_0x0103:
            if (r14 < 0) goto L_0x0113
            boolean r15 = r11.mo40764b(r14, r10)
            if (r15 == 0) goto L_0x0113
            r15 = r13[r5]
            int r15 = r15 + r4
            r13[r5] = r15
            int r14 = r14 + -1
            goto L_0x0103
        L_0x0113:
            if (r14 >= 0) goto L_0x0117
            goto L_0x01b3
        L_0x0117:
            if (r14 < 0) goto L_0x012a
            boolean r15 = r11.mo40764b(r14, r10)
            if (r15 != 0) goto L_0x012a
            r15 = r13[r4]
            if (r15 > r1) goto L_0x012a
            int r15 = r15 + 1
            r13[r4] = r15
            int r14 = r14 + -1
            goto L_0x0117
        L_0x012a:
            if (r14 < 0) goto L_0x01b3
            r15 = r13[r4]
            if (r15 <= r1) goto L_0x0132
            goto L_0x01b3
        L_0x0132:
            if (r14 < 0) goto L_0x0145
            boolean r15 = r11.mo40764b(r14, r10)
            if (r15 == 0) goto L_0x0145
            r15 = r13[r2]
            if (r15 > r1) goto L_0x0145
            int r15 = r15 + 1
            r13[r2] = r15
            int r14 = r14 + -1
            goto L_0x0132
        L_0x0145:
            r14 = r13[r2]
            if (r14 <= r1) goto L_0x014b
            goto L_0x01b3
        L_0x014b:
            int r8 = r8 + r4
        L_0x014c:
            if (r8 >= r12) goto L_0x015c
            boolean r14 = r11.mo40764b(r8, r10)
            if (r14 == 0) goto L_0x015c
            r14 = r13[r5]
            int r14 = r14 + r4
            r13[r5] = r14
            int r8 = r8 + 1
            goto L_0x014c
        L_0x015c:
            if (r8 != r12) goto L_0x015f
            goto L_0x01b3
        L_0x015f:
            if (r8 >= r12) goto L_0x0172
            boolean r14 = r11.mo40764b(r8, r10)
            if (r14 != 0) goto L_0x0172
            r14 = r13[r6]
            if (r14 >= r1) goto L_0x0172
            int r14 = r14 + 1
            r13[r6] = r14
            int r8 = r8 + 1
            goto L_0x015f
        L_0x0172:
            if (r8 == r12) goto L_0x01b3
            r14 = r13[r6]
            if (r14 < r1) goto L_0x0179
            goto L_0x01b3
        L_0x0179:
            if (r8 >= r12) goto L_0x018c
            boolean r14 = r11.mo40764b(r8, r10)
            if (r14 == 0) goto L_0x018c
            r14 = r13[r7]
            if (r14 >= r1) goto L_0x018c
            int r14 = r14 + 1
            r13[r7] = r14
            int r8 = r8 + 1
            goto L_0x0179
        L_0x018c:
            r11 = r13[r7]
            if (r11 < r1) goto L_0x0191
            goto L_0x01b3
        L_0x0191:
            r1 = r13[r2]
            r12 = r13[r4]
            int r1 = r1 + r12
            r12 = r13[r5]
            int r1 = r1 + r12
            r12 = r13[r6]
            int r1 = r1 + r12
            int r1 = r1 + r11
            int r1 = r1 - r3
            int r1 = java.lang.Math.abs(r1)
            r11 = 5
            int r1 = r1 * 5
            if (r1 < r3) goto L_0x01a8
            goto L_0x01b3
        L_0x01a8:
            boolean r1 = m36751b(r13)
            if (r1 == 0) goto L_0x01b3
            float r14 = m36750a(r8, r13)
            goto L_0x01b5
        L_0x01b3:
            r14 = 2143289344(0x7fc00000, float:NaN)
        L_0x01b5:
            boolean r1 = java.lang.Float.isNaN(r14)
            if (r1 != 0) goto L_0x036b
            int r1 = (int) r14
            int[] r8 = r0.f36924d
            r11 = 0
        L_0x01bf:
            int r12 = r8.length
            if (r11 >= r12) goto L_0x01c7
            r8[r11] = r2
            int r11 = r11 + 1
            goto L_0x01bf
        L_0x01c7:
            int[] r8 = r0.f36924d
            r11 = 0
        L_0x01ca:
            if (r10 < r11) goto L_0x01e2
            if (r1 < r11) goto L_0x01e2
            ch.b r12 = r0.f36921a
            int r13 = r1 - r11
            int r15 = r10 - r11
            boolean r12 = r12.mo40764b(r13, r15)
            if (r12 == 0) goto L_0x01e2
            r12 = r8[r5]
            int r12 = r12 + r4
            r8[r5] = r12
            int r11 = r11 + 1
            goto L_0x01ca
        L_0x01e2:
            r12 = r8[r5]
            if (r12 != 0) goto L_0x01e8
            goto L_0x02e6
        L_0x01e8:
            if (r10 < r11) goto L_0x0200
            if (r1 < r11) goto L_0x0200
            ch.b r12 = r0.f36921a
            int r15 = r1 - r11
            int r13 = r10 - r11
            boolean r12 = r12.mo40764b(r15, r13)
            if (r12 != 0) goto L_0x0200
            r12 = r8[r4]
            int r12 = r12 + r4
            r8[r4] = r12
            int r11 = r11 + 1
            goto L_0x01e8
        L_0x0200:
            r12 = r8[r4]
            if (r12 != 0) goto L_0x0206
            goto L_0x02e6
        L_0x0206:
            if (r10 < r11) goto L_0x021e
            if (r1 < r11) goto L_0x021e
            ch.b r12 = r0.f36921a
            int r13 = r1 - r11
            int r15 = r10 - r11
            boolean r12 = r12.mo40764b(r13, r15)
            if (r12 == 0) goto L_0x021e
            r12 = r8[r2]
            int r12 = r12 + r4
            r8[r2] = r12
            int r11 = r11 + 1
            goto L_0x0206
        L_0x021e:
            r11 = r8[r2]
            if (r11 != 0) goto L_0x0224
            goto L_0x02e6
        L_0x0224:
            ch.b r11 = r0.f36921a
            int r12 = r11.f34028c
            int r11 = r11.f34027b
            r13 = 1
        L_0x022b:
            int r15 = r10 + r13
            if (r15 >= r12) goto L_0x0245
            int r2 = r1 + r13
            if (r2 >= r11) goto L_0x0245
            ch.b r7 = r0.f36921a
            boolean r2 = r7.mo40764b(r2, r15)
            if (r2 == 0) goto L_0x0245
            r2 = r8[r5]
            int r2 = r2 + r4
            r8[r5] = r2
            int r13 = r13 + 1
            r2 = 0
            r7 = 4
            goto L_0x022b
        L_0x0245:
            int r2 = r10 + r13
            if (r2 >= r12) goto L_0x025d
            int r7 = r1 + r13
            if (r7 >= r11) goto L_0x025d
            ch.b r15 = r0.f36921a
            boolean r2 = r15.mo40764b(r7, r2)
            if (r2 != 0) goto L_0x025d
            r2 = r8[r6]
            int r2 = r2 + r4
            r8[r6] = r2
            int r13 = r13 + 1
            goto L_0x0245
        L_0x025d:
            r2 = r8[r6]
            if (r2 != 0) goto L_0x0263
            goto L_0x02e6
        L_0x0263:
            int r2 = r10 + r13
            if (r2 >= r12) goto L_0x027c
            int r7 = r1 + r13
            if (r7 >= r11) goto L_0x027c
            ch.b r15 = r0.f36921a
            boolean r2 = r15.mo40764b(r7, r2)
            if (r2 == 0) goto L_0x027c
            r2 = 4
            r7 = r8[r2]
            int r7 = r7 + r4
            r8[r2] = r7
            int r13 = r13 + 1
            goto L_0x0263
        L_0x027c:
            r2 = 4
            r1 = r8[r2]
            if (r1 != 0) goto L_0x0282
            goto L_0x02e6
        L_0x0282:
            r1 = 0
            r2 = 0
            r7 = 5
        L_0x0285:
            if (r1 >= r7) goto L_0x0290
            r10 = r8[r1]
            if (r10 != 0) goto L_0x028c
            goto L_0x02e6
        L_0x028c:
            int r2 = r2 + r10
            int r1 = r1 + 1
            goto L_0x0285
        L_0x0290:
            r1 = 7
            if (r2 >= r1) goto L_0x0294
            goto L_0x02e6
        L_0x0294:
            float r1 = (float) r2
            r2 = 1088421888(0x40e00000, float:7.0)
            float r1 = r1 / r2
            r2 = 1068146622(0x3faa9fbe, float:1.333)
            float r2 = r1 / r2
            r7 = 0
            r10 = r8[r7]
            float r7 = (float) r10
            float r7 = r1 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x02e6
            r7 = r8[r4]
            float r7 = (float) r7
            float r7 = r1 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x02e6
            r7 = 1077936128(0x40400000, float:3.0)
            float r10 = r1 * r7
            r5 = r8[r5]
            float r5 = (float) r5
            float r10 = r10 - r5
            float r5 = java.lang.Math.abs(r10)
            float r7 = r7 * r2
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x02e6
            r5 = r8[r6]
            float r5 = (float) r5
            float r5 = r1 - r5
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x02e6
            r5 = 4
            r5 = r8[r5]
            float r5 = (float) r5
            float r1 = r1 - r5
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x02e6
            r7 = 1
            goto L_0x02e7
        L_0x02e6:
            r7 = 0
        L_0x02e7:
            if (r7 == 0) goto L_0x036b
            float r1 = (float) r3
            r2 = 1088421888(0x40e00000, float:7.0)
            float r1 = r1 / r2
            r7 = 0
        L_0x02ee:
            java.util.ArrayList r2 = r0.f36922b
            int r2 = r2.size()
            if (r7 >= r2) goto L_0x0356
            java.util.ArrayList r2 = r0.f36922b
            java.lang.Object r2 = r2.get(r7)
            kh.c r2 = (p604kh.C18044c) r2
            float r3 = r2.f52327b
            float r3 = r9 - r3
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x032c
            float r3 = r2.f52326a
            float r3 = r14 - r3
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x032c
            float r3 = r2.f46165c
            float r3 = r1 - r3
            float r3 = java.lang.Math.abs(r3)
            r5 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x032a
            float r5 = r2.f46165c
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x032c
        L_0x032a:
            r3 = 1
            goto L_0x032d
        L_0x032c:
            r3 = 0
        L_0x032d:
            if (r3 == 0) goto L_0x0353
            java.util.ArrayList r3 = r0.f36922b
            int r5 = r2.f46166d
            int r6 = r5 + 1
            float r5 = (float) r5
            float r8 = r2.f52326a
            float r8 = r8 * r5
            float r8 = r8 + r14
            float r10 = (float) r6
            float r8 = r8 / r10
            float r11 = r2.f52327b
            float r11 = r11 * r5
            float r11 = r11 + r9
            float r11 = r11 / r10
            float r2 = r2.f46165c
            float r5 = r5 * r2
            float r5 = r5 + r1
            float r5 = r5 / r10
            kh.c r2 = new kh.c
            r2.<init>(r8, r11, r5, r6)
            r3.set(r7, r2)
            r2 = 1
            goto L_0x0357
        L_0x0353:
            int r7 = r7 + 1
            goto L_0x02ee
        L_0x0356:
            r2 = 0
        L_0x0357:
            if (r2 != 0) goto L_0x036a
            kh.c r2 = new kh.c
            r2.<init>(r14, r9, r1, r4)
            java.util.ArrayList r1 = r0.f36922b
            r1.add(r2)
            yg.h r1 = r0.f36925e
            if (r1 == 0) goto L_0x036a
            r1.mo52878a()
        L_0x036a:
            return r4
        L_0x036b:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.detector.FinderPatternFinder.mo44171c(int[], int, int):boolean");
    }

    /* renamed from: d */
    public final boolean mo44172d() {
        int size = this.f36922b.size();
        Iterator it = this.f36922b.iterator();
        float f = BitmapDescriptorFactory.HUE_RED;
        int i = 0;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        while (it.hasNext()) {
            C18044c cVar = (C18044c) it.next();
            if (cVar.f46166d >= 2) {
                i++;
                f2 += cVar.f46165c;
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / ((float) size);
        Iterator it2 = this.f36922b.iterator();
        while (it2.hasNext()) {
            f += Math.abs(((C18044c) it2.next()).f46165c - f3);
        }
        if (f <= f2 * 0.05f) {
            return true;
        }
        return false;
    }
}
