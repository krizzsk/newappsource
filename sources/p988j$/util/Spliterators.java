package p988j$.util;

import java.util.Collection;
import java.util.Iterator;
import p988j$.util.Spliterator;

/* renamed from: j$.util.Spliterators */
public final class Spliterators {

    /* renamed from: a */
    private static final Spliterator f64502a = new C25875X();

    /* renamed from: b */
    private static final Spliterator.OfInt f64503b = new C25873V();

    /* renamed from: c */
    private static final C25861I f64504c = new C25874W();

    /* renamed from: d */
    private static final C25856D f64505d = new C25872U();

    /* renamed from: a */
    private static void m64701a(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
        } else if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(i2);
        } else if (i3 > i) {
            throw new ArrayIndexOutOfBoundsException(i3);
        }
    }

    /* renamed from: b */
    public static C25856D m64702b() {
        return f64505d;
    }

    /* renamed from: c */
    public static Spliterator.OfInt m64703c() {
        return f64503b;
    }

    /* renamed from: d */
    public static C25861I m64704d() {
        return f64504c;
    }

    /* renamed from: e */
    public static Spliterator m64705e() {
        return f64502a;
    }

    /* renamed from: f */
    public static C26019q m64706f(C25856D d) {
        d.getClass();
        return new C25869Q(d);
    }

    /* renamed from: g */
    public static C26264u m64707g(Spliterator.OfInt ofInt) {
        ofInt.getClass();
        return new C25867O(ofInt);
    }

    /* renamed from: h */
    public static C26268y m64708h(C25861I i) {
        i.getClass();
        return new C25868P(i);
    }

    /* renamed from: i */
    public static Iterator m64709i(Spliterator spliterator) {
        spliterator.getClass();
        return new C25866N(spliterator);
    }

    /* renamed from: j */
    public static C25856D m64710j(double[] dArr, int i, int i2) {
        dArr.getClass();
        m64701a(dArr.length, i, i2);
        return new C25871T(dArr, i, i2, 1040);
    }

    /* renamed from: k */
    public static C25861I m64711k(long[] jArr, int i, int i2) {
        jArr.getClass();
        m64701a(jArr.length, i, i2);
        return new C25879a0(jArr, i, i2, 1040);
    }

    /* renamed from: l */
    public static Spliterator m64712l(Object[] objArr, int i, int i2) {
        objArr.getClass();
        m64701a(objArr.length, i, i2);
        return new C25870S(objArr, i, i2, 1040);
    }

    /* renamed from: m */
    public static Spliterator m64713m(Iterator it) {
        it.getClass();
        return new C25877Z(it);
    }

    public static Spliterator.OfInt spliterator(int[] iArr, int i, int i2, int i3) {
        iArr.getClass();
        m64701a(iArr.length, i, i2);
        return new C25876Y(iArr, i, i2, i3);
    }

    public static <T> Spliterator<T> spliterator(Collection<? extends T> collection, int i) {
        collection.getClass();
        return new C25877Z(collection, i);
    }

    public static <T> Spliterator<T> spliterator(Iterator<? extends T> it, long j, int i) {
        it.getClass();
        return new C25877Z(it, j, i);
    }

    public static <T> Spliterator<T> spliterator(Object[] objArr, int i) {
        objArr.getClass();
        return new C25870S(objArr, 0, objArr.length, i);
    }
}
