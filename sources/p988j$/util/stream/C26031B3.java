package p988j$.util.stream;

import p988j$.util.C25856D;
import p988j$.util.C25861I;
import p988j$.util.Spliterator;

/* renamed from: j$.util.stream.B3 */
public abstract class C26031B3 {
    /* renamed from: a */
    public static C26047F m64916a(C25856D d) {
        return new C26258z(d, C26116V2.m65247c(d));
    }

    /* renamed from: b */
    public static IntStream m64917b(Spliterator.OfInt ofInt) {
        return new C26134a0(ofInt, C26116V2.m65247c(ofInt));
    }

    /* renamed from: c */
    public static C26194m0 m64918c(C25861I i) {
        return new C26164g0(i, C26116V2.m65247c(i));
    }

    /* renamed from: d */
    public static Stream m64919d(Spliterator spliterator, boolean z) {
        spliterator.getClass();
        return new C26115V1(spliterator, C26116V2.m65247c(spliterator), z);
    }
}
