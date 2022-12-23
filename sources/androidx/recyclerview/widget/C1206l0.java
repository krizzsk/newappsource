package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;

/* renamed from: androidx.recyclerview.widget.l0 */
public final class C1206l0 {

    /* renamed from: a */
    public SparseArray<C1242v> f4543a = new SparseArray<>();

    /* renamed from: b */
    public int f4544b = 0;

    /* renamed from: androidx.recyclerview.widget.l0$a */
    public class C1207a implements C1217m0 {

        /* renamed from: a */
        public SparseIntArray f4545a = new SparseIntArray(1);

        /* renamed from: b */
        public SparseIntArray f4546b = new SparseIntArray(1);

        /* renamed from: c */
        public final C1242v f4547c;

        public C1207a(C1242v vVar) {
            this.f4547c = vVar;
        }

        /* renamed from: a */
        public final int mo5094a(int i) {
            int indexOfKey = this.f4546b.indexOfKey(i);
            if (indexOfKey >= 0) {
                return this.f4546b.valueAt(indexOfKey);
            }
            StringBuilder r = C25541a.m63887r("requested global type ", i, " does not belong to the adapter:");
            r.append(this.f4547c.f4693c);
            throw new IllegalStateException(r.toString());
        }

        /* renamed from: b */
        public final int mo5095b(int i) {
            int indexOfKey = this.f4545a.indexOfKey(i);
            if (indexOfKey > -1) {
                return this.f4545a.valueAt(indexOfKey);
            }
            C1206l0 l0Var = C1206l0.this;
            C1242v vVar = this.f4547c;
            int i2 = l0Var.f4544b;
            l0Var.f4544b = i2 + 1;
            l0Var.f4543a.put(i2, vVar);
            this.f4545a.put(i, i2);
            this.f4546b.put(i2, i);
            return i2;
        }
    }
}
