package p988j$.util.stream;

import java.util.Comparator;
import p988j$.util.C25864L;
import p988j$.util.Spliterator;

/* renamed from: j$.util.stream.w3 */
abstract class C26247w3 extends C26257y3 implements C25864L {
    C26247w3(C25864L l, long j, long j2) {
        super(l, j, j2);
    }

    C26247w3(C25864L l, C26247w3 w3Var) {
        super(l, w3Var);
    }

    public final void forEachRemaining(Object obj) {
        obj.getClass();
        C26137a3 a3Var = null;
        while (true) {
            int o = mo84607o();
            if (o == 1) {
                return;
            }
            if (o == 2) {
                if (a3Var == null) {
                    a3Var = mo84594q();
                } else {
                    a3Var.f64880b = 0;
                }
                long j = 0;
                while (((C25864L) this.f65065a).tryAdvance(a3Var)) {
                    j++;
                    if (j >= 128) {
                        break;
                    }
                }
                if (j != 0) {
                    a3Var.mo84455a(obj, mo84606j(j));
                } else {
                    return;
                }
            } else {
                ((C25864L) this.f65065a).forEachRemaining(obj);
                return;
            }
        }
    }

    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract void mo84593p(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract C26137a3 mo84594q();

    public final boolean tryAdvance(Object obj) {
        obj.getClass();
        while (mo84607o() != 1 && ((C25864L) this.f65065a).tryAdvance(this)) {
            if (mo84606j(1) == 1) {
                mo84593p(obj);
                return true;
            }
        }
        return false;
    }
}
