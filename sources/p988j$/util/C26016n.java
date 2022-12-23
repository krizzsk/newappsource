package p988j$.util;

import java.util.Comparator;
import p988j$.util.Spliterator;
import p988j$.util.function.C25966e0;
import p988j$.util.function.C25981m;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.n */
public abstract /* synthetic */ class C26016n {
    /* renamed from: d */
    public static void m64889d(C25856D d, Consumer consumer) {
        if (consumer instanceof C25981m) {
            d.mo83818b((C25981m) consumer);
        } else if (!C25883c0.f64528a) {
            consumer.getClass();
            d.mo83818b(new C26015m(consumer));
        } else {
            C25883c0.m64722a(d.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
            throw null;
        }
    }

    /* renamed from: e */
    public static void m64890e(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            ofInt.forEachRemaining((IntConsumer) consumer);
        } else if (!C25883c0.f64528a) {
            consumer.getClass();
            ofInt.forEachRemaining((IntConsumer) new C26020r(consumer));
        } else {
            C25883c0.m64722a(ofInt.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
            throw null;
        }
    }

    /* renamed from: f */
    public static void m64891f(C25861I i, Consumer consumer) {
        if (consumer instanceof C25966e0) {
            i.mo83848a((C25966e0) consumer);
        } else if (!C25883c0.f64528a) {
            consumer.getClass();
            i.mo83848a(new C26265v(consumer));
        } else {
            C25883c0.m64722a(i.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
            throw null;
        }
    }

    /* renamed from: g */
    public static boolean m64892g(C25856D d, Consumer consumer) {
        if (consumer instanceof C25981m) {
            return d.mo83820h((C25981m) consumer);
        }
        if (!C25883c0.f64528a) {
            consumer.getClass();
            return d.mo83820h(new C26015m(consumer));
        }
        C25883c0.m64722a(d.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
        throw null;
    }

    /* renamed from: i */
    public static boolean m64893i(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return ofInt.tryAdvance((IntConsumer) consumer);
        }
        if (!C25883c0.f64528a) {
            consumer.getClass();
            return ofInt.tryAdvance((IntConsumer) new C26020r(consumer));
        }
        C25883c0.m64722a(ofInt.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
        throw null;
    }

    /* renamed from: j */
    public static boolean m64894j(C25861I i, Consumer consumer) {
        if (consumer instanceof C25966e0) {
            return i.mo83849c((C25966e0) consumer);
        }
        if (!C25883c0.f64528a) {
            consumer.getClass();
            return i.mo83849c(new C26265v(consumer));
        }
        C25883c0.m64722a(i.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
        throw null;
    }

    /* renamed from: k */
    public static boolean m64895k(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: l */
    public static C25880b m64896l(Comparator comparator, Comparator comparator2) {
        if (comparator instanceof C25882c) {
            C25912d dVar = (C25912d) ((C25882c) comparator);
            dVar.getClass();
            comparator2.getClass();
            return new C25880b(dVar, comparator2, 0);
        }
        comparator2.getClass();
        return new C25880b(comparator, comparator2, 0);
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0;
    }

    public void forEachRemaining(Object obj) {
        obj.getClass();
    }

    public boolean tryAdvance(Object obj) {
        obj.getClass();
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }
}
