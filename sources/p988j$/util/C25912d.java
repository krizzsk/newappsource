package p988j$.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import p988j$.util.function.C25932I0;
import p988j$.util.function.C25936K0;
import p988j$.util.function.C25938L0;
import p988j$.util.function.C25942N0;
import p988j$.util.function.C25944O0;
import p988j$.util.function.C25948Q0;
import p988j$.util.function.Function;

/* renamed from: j$.util.d */
enum C25912d implements Comparator, C25882c {
    ;

    private C25912d() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    public final Comparator reversed() {
        return Collections.reverseOrder();
    }

    public final Comparator thenComparing(Comparator comparator) {
        comparator.getClass();
        return new C25880b(this, comparator, 0);
    }

    public final Comparator thenComparing(Function function) {
        return C26016n.m64896l(this, Comparator$CC.comparing(Function.VivifiedWrapper.convert(function)));
    }

    public final Comparator thenComparing(java.util.function.Function function, Comparator comparator) {
        p988j$.util.function.Function convert = Function.VivifiedWrapper.convert(function);
        convert.getClass();
        comparator.getClass();
        return C26016n.m64896l(this, new C25880b(comparator, convert, 1));
    }

    public final Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        C25936K0 a = C25932I0.m64774a(toDoubleFunction);
        a.getClass();
        return C26016n.m64896l(this, new C25878a(0, a));
    }

    public final Comparator thenComparingInt(ToIntFunction toIntFunction) {
        C25942N0 a = C25938L0.m64783a(toIntFunction);
        a.getClass();
        return C26016n.m64896l(this, new C25878a(1, a));
    }

    public final Comparator thenComparingLong(ToLongFunction toLongFunction) {
        C25948Q0 a = C25944O0.m64789a(toLongFunction);
        a.getClass();
        return C26016n.m64896l(this, new C25878a(2, a));
    }
}
