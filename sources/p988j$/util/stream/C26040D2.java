package p988j$.util.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import p988j$.util.Collection;
import p988j$.util.List;

/* renamed from: j$.util.stream.D2 */
final class C26040D2 extends C26241v2 {

    /* renamed from: d */
    private ArrayList f64717d;

    C26040D2(C26166g2 g2Var, Comparator comparator) {
        super(g2Var, comparator);
    }

    public final void accept(Object obj) {
        this.f64717d.add(obj);
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        ArrayList arrayList;
        if (j < 2147483639) {
            if (j >= 0) {
                int i = (int) j;
            } else {
                arrayList = new ArrayList();
            }
            this.f64717d = arrayList;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public final void end() {
        ArrayList arrayList = this.f64717d;
        Comparator comparator = this.f65044b;
        if (arrayList instanceof List) {
            ((List) arrayList).sort(comparator);
        } else {
            List.CC.$default$sort(arrayList, comparator);
        }
        this.f64895a.mo84147d((long) this.f64717d.size());
        if (!this.f65045c) {
            ArrayList arrayList2 = this.f64717d;
            C26166g2 g2Var = this.f64895a;
            g2Var.getClass();
            Collection.EL.m64672a(arrayList2, new C26133a(3, g2Var));
        } else {
            Iterator it = this.f64717d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f64895a.mo84149f()) {
                    break;
                }
                this.f64895a.accept(next);
            }
        }
        this.f64895a.end();
        this.f64717d = null;
    }
}
