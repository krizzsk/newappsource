package p604kh;

import java.util.ArrayList;
import p043ch.C13831b;
import p935yg.C20726h;

/* renamed from: kh.b */
public final class C18043b {

    /* renamed from: a */
    public final C13831b f46156a;

    /* renamed from: b */
    public final ArrayList f46157b = new ArrayList(5);

    /* renamed from: c */
    public final int f46158c;

    /* renamed from: d */
    public final int f46159d;

    /* renamed from: e */
    public final int f46160e;

    /* renamed from: f */
    public final int f46161f;

    /* renamed from: g */
    public final float f46162g;

    /* renamed from: h */
    public final int[] f46163h;

    /* renamed from: i */
    public final C20726h f46164i;

    public C18043b(C13831b bVar, int i, int i2, int i3, int i4, float f, C20726h hVar) {
        this.f46156a = bVar;
        this.f46158c = i;
        this.f46159d = i2;
        this.f46160e = i3;
        this.f46161f = i4;
        this.f46162g = f;
        this.f46163h = new int[3];
        this.f46164i = hVar;
    }

    /* renamed from: a */
    public final boolean mo50517a(int[] iArr) {
        float f = this.f46162g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - ((float) iArr[i])) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x0105 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p604kh.C18042a mo50518b(int[] r16, int r17, int r18) {
        /*
            r15 = this;
            r0 = r15
            r1 = 0
            r2 = r16[r1]
            r3 = 1
            r4 = r16[r3]
            int r2 = r2 + r4
            r5 = 2
            r6 = r16[r5]
            int r2 = r2 + r6
            int r6 = r18 - r6
            float r6 = (float) r6
            float r7 = (float) r4
            r8 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r8
            float r6 = r6 - r7
            int r7 = (int) r6
            int r4 = r4 * 2
            ch.b r9 = r0.f46156a
            int r10 = r9.f34028c
            int[] r11 = r0.f46163h
            r11[r1] = r1
            r11[r3] = r1
            r11[r5] = r1
            r12 = r17
        L_0x0025:
            if (r12 < 0) goto L_0x0038
            boolean r13 = r9.mo40764b(r7, r12)
            if (r13 == 0) goto L_0x0038
            r13 = r11[r3]
            if (r13 > r4) goto L_0x0038
            int r13 = r13 + 1
            r11[r3] = r13
            int r12 = r12 + -1
            goto L_0x0025
        L_0x0038:
            r13 = 2143289344(0x7fc00000, float:NaN)
            if (r12 < 0) goto L_0x00b0
            r14 = r11[r3]
            if (r14 <= r4) goto L_0x0042
            goto L_0x00b0
        L_0x0042:
            if (r12 < 0) goto L_0x0055
            boolean r14 = r9.mo40764b(r7, r12)
            if (r14 != 0) goto L_0x0055
            r14 = r11[r1]
            if (r14 > r4) goto L_0x0055
            int r14 = r14 + 1
            r11[r1] = r14
            int r12 = r12 + -1
            goto L_0x0042
        L_0x0055:
            r12 = r11[r1]
            if (r12 <= r4) goto L_0x005a
            goto L_0x00b0
        L_0x005a:
            int r12 = r17 + 1
        L_0x005c:
            if (r12 >= r10) goto L_0x006f
            boolean r14 = r9.mo40764b(r7, r12)
            if (r14 == 0) goto L_0x006f
            r14 = r11[r3]
            if (r14 > r4) goto L_0x006f
            int r14 = r14 + 1
            r11[r3] = r14
            int r12 = r12 + 1
            goto L_0x005c
        L_0x006f:
            if (r12 == r10) goto L_0x00b0
            r14 = r11[r3]
            if (r14 <= r4) goto L_0x0076
            goto L_0x00b0
        L_0x0076:
            if (r12 >= r10) goto L_0x0089
            boolean r14 = r9.mo40764b(r7, r12)
            if (r14 != 0) goto L_0x0089
            r14 = r11[r5]
            if (r14 > r4) goto L_0x0089
            int r14 = r14 + 1
            r11[r5] = r14
            int r12 = r12 + 1
            goto L_0x0076
        L_0x0089:
            r7 = r11[r5]
            if (r7 <= r4) goto L_0x008e
            goto L_0x00b0
        L_0x008e:
            r4 = r11[r1]
            r9 = r11[r3]
            int r4 = r4 + r9
            int r4 = r4 + r7
            int r4 = r4 - r2
            int r4 = java.lang.Math.abs(r4)
            int r4 = r4 * 5
            int r2 = r2 * 2
            if (r4 < r2) goto L_0x00a0
            goto L_0x00b0
        L_0x00a0:
            boolean r2 = r15.mo50517a(r11)
            if (r2 == 0) goto L_0x00b0
            r2 = r11[r5]
            int r12 = r12 - r2
            float r2 = (float) r12
            r4 = r11[r3]
            float r4 = (float) r4
            float r4 = r4 / r8
            float r13 = r2 - r4
        L_0x00b0:
            boolean r2 = java.lang.Float.isNaN(r13)
            if (r2 != 0) goto L_0x0128
            r2 = r16[r1]
            r4 = r16[r3]
            int r2 = r2 + r4
            r4 = r16[r5]
            int r2 = r2 + r4
            float r2 = (float) r2
            r4 = 1077936128(0x40400000, float:3.0)
            float r2 = r2 / r4
            java.util.ArrayList r4 = r0.f46157b
            java.util.Iterator r4 = r4.iterator()
        L_0x00c8:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0117
            java.lang.Object r5 = r4.next()
            kh.a r5 = (p604kh.C18042a) r5
            float r7 = r5.f52327b
            float r7 = r13 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 > 0) goto L_0x0102
            float r7 = r5.f52326a
            float r7 = r6 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 > 0) goto L_0x0102
            float r7 = r5.f46155c
            float r7 = r2 - r7
            float r7 = java.lang.Math.abs(r7)
            r9 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x0100
            float r9 = r5.f46155c
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 > 0) goto L_0x0102
        L_0x0100:
            r7 = 1
            goto L_0x0103
        L_0x0102:
            r7 = 0
        L_0x0103:
            if (r7 == 0) goto L_0x00c8
            float r1 = r5.f52326a
            float r1 = r1 + r6
            float r1 = r1 / r8
            float r3 = r5.f52327b
            float r3 = r3 + r13
            float r3 = r3 / r8
            float r4 = r5.f46155c
            float r4 = r4 + r2
            float r4 = r4 / r8
            kh.a r2 = new kh.a
            r2.<init>(r1, r3, r4)
            return r2
        L_0x0117:
            kh.a r1 = new kh.a
            r1.<init>(r6, r13, r2)
            java.util.ArrayList r2 = r0.f46157b
            r2.add(r1)
            yg.h r1 = r0.f46164i
            if (r1 == 0) goto L_0x0128
            r1.mo52878a()
        L_0x0128:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p604kh.C18043b.mo50518b(int[], int, int):kh.a");
    }
}
