package r40;

import android.util.SparseIntArray;

/* renamed from: r40.a */
public final class C6250a {

    /* renamed from: a */
    public final int[] f19707a;

    /* renamed from: b */
    public final int[] f19708b;

    /* renamed from: c */
    public final int[] f19709c;

    /* renamed from: d */
    public final SparseIntArray f19710d;

    /* renamed from: e */
    public final int[] f19711e;

    /* renamed from: f */
    public final int[] f19712f;

    public C6250a(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        this.f19707a = iArr;
        this.f19708b = iArr2;
        this.f19709c = iArr3;
        SparseIntArray sparseIntArray = new SparseIntArray(iArr3.length);
        for (int i = 0; i < iArr3.length; i++) {
            sparseIntArray.put(iArr3[i], i);
        }
        this.f19710d = sparseIntArray;
        this.f19711e = iArr4;
        this.f19712f = iArr5;
    }
}
