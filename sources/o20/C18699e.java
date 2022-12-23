package o20;

import android.util.SparseArray;
import ce0.C21100e;
import com.moovit.map.C16273d;

/* renamed from: o20.e */
public final class C18699e<MEZS extends C16273d> {

    /* renamed from: a */
    public final MEZS f47602a;

    /* renamed from: b */
    public final int f47603b;

    /* renamed from: c */
    public final int f47604c;

    /* renamed from: d */
    public final SparseArray<MEZS> f47605d;

    public C18699e() {
        throw null;
    }

    public C18699e(MEZS mezs) {
        this(mezs, 0, 25600, (SparseArray) null);
    }

    @Deprecated
    /* renamed from: a */
    public static <MEZS extends C16273d> C18699e<MEZS> m45697a(SparseArray<MEZS> sparseArray) {
        int i;
        int i2;
        int size = sparseArray.size();
        int i3 = 0;
        while (true) {
            i = 25600;
            if (i3 >= size) {
                i2 = 25600;
                break;
            } else if (((C16273d) sparseArray.valueAt(i3)) != null) {
                i2 = sparseArray.keyAt(i3);
                break;
            } else {
                i3++;
            }
        }
        C16273d dVar = null;
        int i4 = size - 1;
        int i5 = i4;
        while (true) {
            if (i5 < 0) {
                break;
            }
            C16273d dVar2 = (C16273d) sparseArray.valueAt(i5);
            if (dVar2 != null) {
                if (i5 != i4) {
                    i = sparseArray.keyAt(i5 + 1);
                }
                dVar = dVar2;
            } else {
                i5--;
            }
        }
        if (dVar != null) {
            return new C18699e<>(dVar, i2, i, sparseArray);
        }
        throw new IllegalArgumentException("All zoom styles are null");
    }

    /* renamed from: b */
    public final MEZS mo51072b(float f) {
        int i = (int) (f * 100.0f);
        SparseArray<MEZS> sparseArray = this.f47605d;
        if (sparseArray != null) {
            int indexOfKey = sparseArray.indexOfKey(i);
            if (indexOfKey >= 0) {
                return (C16273d) this.f47605d.valueAt(indexOfKey);
            }
            int i2 = ~indexOfKey;
            if (i2 > 0) {
                return (C16273d) this.f47605d.valueAt(i2 - 1);
            }
            return null;
        } else if (i < this.f47603b || i >= this.f47604c) {
            return null;
        } else {
            return this.f47602a;
        }
    }

    public C18699e(MEZS mezs, int i, int i2, SparseArray<MEZS> sparseArray) {
        C21100e.m49373x(mezs, "styleForAllZooms");
        this.f47602a = mezs;
        this.f47603b = i;
        this.f47604c = i2;
        this.f47605d = sparseArray;
        if (sparseArray != null && sparseArray.size() == 0) {
            throw new IllegalArgumentException("stylePerZoomE2 can't be empty");
        }
    }
}
