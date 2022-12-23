package p100gb;

import android.util.SparseArray;
import p009a8.C0114n;
import p100gb.C4956a0;
import p277ub.C6777c;
import p583jk.C17875h;

/* renamed from: gb.f0 */
public final class C4974f0<V> {

    /* renamed from: a */
    public int f16819a;

    /* renamed from: b */
    public final SparseArray<V> f16820b = new SparseArray<>();

    /* renamed from: c */
    public final C6777c<V> f16821c;

    public C4974f0(C0114n nVar) {
        this.f16821c = nVar;
        this.f16819a = -1;
    }

    /* renamed from: a */
    public final void mo20677a(int i, C4956a0.C4958b bVar) {
        boolean z;
        boolean z2 = false;
        if (this.f16819a == -1) {
            if (this.f16820b.size() == 0) {
                z = true;
            } else {
                z = false;
            }
            C17875h.m44304o(z);
            this.f16819a = 0;
        }
        if (this.f16820b.size() > 0) {
            SparseArray<V> sparseArray = this.f16820b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i >= keyAt) {
                z2 = true;
            }
            C17875h.m44301k(z2);
            if (keyAt == i) {
                C6777c<V> cVar = this.f16821c;
                SparseArray<V> sparseArray2 = this.f16820b;
                cVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f16820b.append(i, bVar);
    }

    /* renamed from: b */
    public final V mo20678b(int i) {
        if (this.f16819a == -1) {
            this.f16819a = 0;
        }
        while (true) {
            int i2 = this.f16819a;
            if (i2 > 0 && i < this.f16820b.keyAt(i2)) {
                this.f16819a--;
            }
        }
        while (this.f16819a < this.f16820b.size() - 1 && i >= this.f16820b.keyAt(this.f16819a + 1)) {
            this.f16819a++;
        }
        return this.f16820b.valueAt(this.f16819a);
    }
}
