package p988j$.util;

import java.io.Serializable;
import java.util.Comparator;
import p988j$.util.function.Function;

/* renamed from: j$.util.b */
public final /* synthetic */ class C25880b implements Comparator, Serializable {

    /* renamed from: a */
    public final /* synthetic */ int f64525a;

    /* renamed from: b */
    public final /* synthetic */ Comparator f64526b;

    /* renamed from: c */
    public final /* synthetic */ Object f64527c;

    public /* synthetic */ C25880b(Comparator comparator, Object obj, int i) {
        this.f64525a = i;
        this.f64526b = comparator;
        this.f64527c = obj;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f64525a) {
            case 0:
                Comparator comparator = this.f64526b;
                Comparator comparator2 = (Comparator) this.f64527c;
                int compare = comparator.compare(obj, obj2);
                return compare != 0 ? compare : comparator2.compare(obj, obj2);
            default:
                Comparator comparator3 = this.f64526b;
                Function function = (Function) this.f64527c;
                return comparator3.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
