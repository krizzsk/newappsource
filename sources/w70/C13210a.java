package w70;

import android.content.Context;
import android.util.SparseArray;
import f00.C16919g;

/* renamed from: w70.a */
public final class C13210a {

    /* renamed from: a */
    public static final C16919g.C16924e f32782a = new C16919g.C16924e("client_version_code", -1);

    /* renamed from: b */
    public static final C13211a f32783b = new C13211a();

    /* renamed from: w70.a$a */
    public class C13211a implements C13216f {
        /* renamed from: a */
        public final void mo40086a(Context context) {
        }

        public final String toString() {
            return "NULL_UPGRADER";
        }
    }

    /* renamed from: a */
    public static int[] m33293a(SparseArray sparseArray, int i) {
        int i2 = 429 - i;
        int i3 = i2 + 1;
        int[] iArr = new int[i3];
        iArr[0] = 0;
        for (int i4 = 1; i4 < i3; i4++) {
            iArr[i4] = 2147483646;
        }
        int[] iArr2 = new int[i3];
        for (int i5 = i; i5 < 429; i5++) {
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(i5);
            if (sparseArray2 != null) {
                int i6 = i5 - i;
                for (int i7 = 0; i7 < sparseArray2.size(); i7++) {
                    int keyAt = sparseArray2.keyAt(i7) - i;
                    int i8 = iArr[keyAt];
                    int i9 = iArr[i6] + 1;
                    if (i9 < i8) {
                        iArr[keyAt] = i9;
                        iArr2[keyAt] = i5;
                    }
                }
            }
        }
        int i11 = iArr[i2];
        if (i11 == 2147483646) {
            return null;
        }
        int[] iArr3 = new int[i11];
        int i12 = i3 - 1;
        while (i12 > 0) {
            iArr3[iArr[i12] - 1] = i + i12;
            i12 = iArr2[i12] - i;
        }
        return iArr3;
    }

    /* renamed from: b */
    public static SparseArray<SparseArray<C13216f>> m33294b() {
        SparseArray<SparseArray<C13216f>> sparseArray = new SparseArray<>();
        sparseArray.append(317, m33295c(318, new C13212b()));
        C13211a aVar = f32783b;
        sparseArray.append(318, m33295c(319, aVar));
        sparseArray.append(319, m33295c(320, new C13213c()));
        sparseArray.append(320, m33295c(321, new C13214d()));
        sparseArray.append(321, m33295c(322, aVar));
        sparseArray.append(322, m33295c(369, aVar));
        sparseArray.append(369, m33295c(370, aVar));
        sparseArray.append(370, m33295c(371, aVar));
        sparseArray.append(371, m33295c(372, aVar));
        sparseArray.append(372, m33295c(373, aVar));
        sparseArray.append(373, m33295c(375, aVar));
        sparseArray.append(375, m33295c(376, aVar));
        sparseArray.append(376, m33295c(428, aVar));
        sparseArray.append(428, m33295c(429, new C13215e()));
        return sparseArray;
    }

    /* renamed from: c */
    public static SparseArray<C13216f> m33295c(int i, C13216f fVar) {
        SparseArray<C13216f> sparseArray = new SparseArray<>(1);
        sparseArray.append(i, fVar);
        return sparseArray;
    }
}
