package p988j$.util;

import java.io.Serializable;
import java.util.Comparator;
import p988j$.util.function.C25936K0;
import p988j$.util.function.C25942N0;
import p988j$.util.function.C25948Q0;
import p988j$.util.function.Function;

/* renamed from: j$.util.a */
public final /* synthetic */ class C25878a implements Comparator, Serializable {

    /* renamed from: a */
    public final /* synthetic */ int f64519a;

    /* renamed from: b */
    public final /* synthetic */ Object f64520b;

    public /* synthetic */ C25878a(int i, Object obj) {
        this.f64519a = i;
        this.f64520b = obj;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f64519a) {
            case 0:
                C25936K0 k0 = (C25936K0) this.f64520b;
                return Double.compare(k0.applyAsDouble(obj), k0.applyAsDouble(obj2));
            case 1:
                C25942N0 n0 = (C25942N0) this.f64520b;
                return Integer.compare(n0.applyAsInt(obj), n0.applyAsInt(obj2));
            case 2:
                C25948Q0 q0 = (C25948Q0) this.f64520b;
                return Long.compare(q0.applyAsLong(obj), q0.applyAsLong(obj2));
            default:
                Function function = (Function) this.f64520b;
                return ((Comparable) function.apply(obj)).compareTo(function.apply(obj2));
        }
    }
}
