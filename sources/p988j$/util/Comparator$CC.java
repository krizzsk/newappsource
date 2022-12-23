package p988j$.util;

import java.util.Comparator;
import p988j$.util.function.Function;

/* renamed from: j$.util.Comparator$-CC  reason: invalid class name */
public final /* synthetic */ class Comparator$CC<T> {
    /* renamed from: a */
    public static Comparator m64673a() {
        return C25912d.INSTANCE;
    }

    public static <T, U extends Comparable<? super U>> Comparator<T> comparing(Function<? super T, ? extends U> function) {
        function.getClass();
        return new C25878a(3, function);
    }
}
