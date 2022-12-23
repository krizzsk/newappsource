package r40;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import ce0.C21100e;
import java.util.concurrent.TimeUnit;
import l40.C5605d;
import p241s0.C6302b;

/* renamed from: r40.b */
public final class C6251b extends C5605d.C5616k {

    /* renamed from: m */
    public static final int f19713m = ((int) TimeUnit.DAYS.toSeconds(1));

    /* renamed from: a */
    public final SparseBooleanArray f19714a;

    /* renamed from: b */
    public final SparseBooleanArray f19715b;

    /* renamed from: c */
    public final SparseIntArray f19716c;

    /* renamed from: d */
    public final SparseIntArray f19717d;

    /* renamed from: e */
    public SparseIntArray f19718e;

    /* renamed from: f */
    public SparseArray<int[]> f19719f;

    /* renamed from: g */
    public SparseIntArray f19720g;

    /* renamed from: h */
    public C6302b f19721h;

    /* renamed from: i */
    public C6302b f19722i;

    /* renamed from: j */
    public SparseIntArray f19723j;

    /* renamed from: k */
    public SparseArray<int[]> f19724k;

    /* renamed from: l */
    public SparseIntArray f19725l;

    public C6251b(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2, SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        C21100e.m49373x(sparseBooleanArray, "prevActiveServices");
        this.f19714a = sparseBooleanArray;
        C21100e.m49373x(sparseBooleanArray2, "currActiveServices");
        this.f19715b = sparseBooleanArray2;
        C21100e.m49373x(sparseIntArray, "prevActiveFrequencies");
        this.f19716c = sparseIntArray;
        C21100e.m49373x(sparseIntArray2, "currActiveFrequencies");
        this.f19717d = sparseIntArray2;
    }

    /* renamed from: a */
    public final int[] mo21473a(int i, int i2, int i3) {
        this.f19718e.put(i, i2);
        return new int[i3];
    }

    /* renamed from: b */
    public final void mo21474b(int i) {
        this.f19718e = new SparseIntArray(i);
        this.f19719f = new SparseArray<>(i);
        this.f19720g = new SparseIntArray(i);
        this.f19721h = new C6302b(i);
        this.f19722i = new C6302b();
        this.f19723j = new SparseIntArray(i);
        this.f19724k = new SparseArray<>(i);
        this.f19725l = new SparseIntArray();
    }

    /* renamed from: c */
    public final void mo21475c(int[] iArr, int i) {
        this.f19719f.put(i, iArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21477e(int r11, int r12, int r13, long r14) {
        /*
            r10 = this;
            s0.b r0 = r10.f19721h
            java.lang.Long r1 = java.lang.Long.valueOf(r14)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r0.put(r1, r2)
            android.util.SparseIntArray r0 = r10.f19718e
            int r0 = r0.get(r11)
            android.util.SparseBooleanArray r1 = r10.f19714a
            r2 = 0
            boolean r1 = r1.get(r12, r2)
            r3 = -1
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 1
            if (r1 == 0) goto L_0x005c
            android.util.SparseIntArray r1 = r10.f19720g
            int r1 = r1.get(r11, r3)
            if (r1 != r3) goto L_0x0042
            android.util.SparseArray<int[]> r1 = r10.f19719f
            java.lang.Object r1 = r1.get(r11)
            int[] r1 = (int[]) r1
            int r6 = r1.length
            r7 = 0
            r8 = 0
        L_0x0034:
            if (r8 >= r6) goto L_0x003c
            r9 = r1[r8]
            int r7 = r7 + r9
            int r8 = r8 + 1
            goto L_0x0034
        L_0x003c:
            android.util.SparseIntArray r1 = r10.f19720g
            r1.put(r11, r7)
            r1 = r7
        L_0x0042:
            int r1 = r1 + r13
            int r11 = f19713m
            if (r1 < r11) goto L_0x0049
            r1 = 1
            goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            if (r1 == 0) goto L_0x005c
            int r11 = r13 - r11
            android.util.SparseIntArray r1 = r10.f19716c
            int r1 = r1.get(r0, r3)
            if (r1 == r3) goto L_0x005f
            android.util.SparseIntArray r6 = r10.f19725l
            r6.put(r11, r1)
            goto L_0x005f
        L_0x005c:
            r11 = 2147483647(0x7fffffff, float:NaN)
        L_0x005f:
            android.util.SparseBooleanArray r1 = r10.f19715b
            boolean r12 = r1.get(r12, r2)
            if (r12 == 0) goto L_0x007e
            int r12 = f19713m
            if (r13 >= r12) goto L_0x006d
            r12 = 1
            goto L_0x006e
        L_0x006d:
            r12 = 0
        L_0x006e:
            if (r12 == 0) goto L_0x007e
            android.util.SparseIntArray r12 = r10.f19717d
            int r12 = r12.get(r0, r3)
            if (r12 == r3) goto L_0x0081
            android.util.SparseIntArray r0 = r10.f19725l
            r0.put(r13, r12)
            goto L_0x0081
        L_0x007e:
            r13 = 2147483647(0x7fffffff, float:NaN)
        L_0x0081:
            if (r11 == r4) goto L_0x0096
            if (r13 == r4) goto L_0x0096
            s0.b r12 = r10.f19722i
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r15 = 2
            int[] r15 = new int[r15]
            r15[r2] = r11
            r15[r5] = r13
            r12.put(r14, r15)
            goto L_0x00b5
        L_0x0096:
            if (r11 == r4) goto L_0x00a6
            s0.b r12 = r10.f19722i
            java.lang.Long r13 = java.lang.Long.valueOf(r14)
            int[] r14 = new int[r5]
            r14[r2] = r11
            r12.put(r13, r14)
            goto L_0x00b5
        L_0x00a6:
            if (r13 == r4) goto L_0x00b5
            s0.b r11 = r10.f19722i
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            int[] r14 = new int[r5]
            r14[r2] = r13
            r11.put(r12, r14)
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r40.C6251b.mo21477e(int, int, int, long):void");
    }

    /* renamed from: f */
    public final boolean mo21478f(int i, int i2, int i3) {
        this.f19723j.put(i, i3);
        if (this.f19715b.get(i2, false) || this.f19714a.get(i2, false)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final int[] mo21479g(int i, int i2) {
        int[] iArr = new int[i2];
        this.f19724k.put(i, iArr);
        return iArr;
    }
}
