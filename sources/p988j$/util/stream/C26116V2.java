package p988j$.util.stream;

import java.util.EnumMap;
import java.util.Map;
import p988j$.util.Map;
import p988j$.util.Spliterator;

/* renamed from: j$.util.stream.V2 */
enum C26116V2 {
    DISTINCT(0, r2),
    SORTED(1, r6),
    ORDERED(2, r8),
    SIZED(3, r13),
    SHORT_CIRCUIT(12, r14);
    

    /* renamed from: f */
    static final int f64834f = 0;

    /* renamed from: g */
    static final int f64835g = 0;

    /* renamed from: h */
    static final int f64836h = 0;

    /* renamed from: i */
    private static final int f64837i = 0;

    /* renamed from: j */
    private static final int f64838j = 0;

    /* renamed from: k */
    private static final int f64839k = 0;

    /* renamed from: l */
    static final int f64840l = 0;

    /* renamed from: m */
    static final int f64841m = 0;

    /* renamed from: n */
    static final int f64842n = 0;

    /* renamed from: o */
    static final int f64843o = 0;

    /* renamed from: p */
    static final int f64844p = 0;

    /* renamed from: q */
    static final int f64845q = 0;

    /* renamed from: r */
    static final int f64846r = 0;

    /* renamed from: s */
    static final int f64847s = 0;

    /* renamed from: t */
    static final int f64848t = 0;

    /* renamed from: u */
    static final int f64849u = 0;

    /* renamed from: a */
    private final Map f64851a;

    /* renamed from: b */
    private final int f64852b;

    /* renamed from: c */
    private final int f64853c;

    /* renamed from: d */
    private final int f64854d;

    /* renamed from: e */
    private final int f64855e;

    static {
        C26112U2 u2;
        C26112U2 u22;
        C26112U2 u23;
        int i;
        C26112U2 u24;
        C26112U2 u25;
        f64834f = m65246b(u2);
        f64835g = m65246b(u22);
        f64836h = m65246b(u23);
        m65246b(u24);
        m65246b(u25);
        int i2 = 0;
        for (C26116V2 v2 : values()) {
            i2 |= v2.f64855e;
        }
        f64837i = i2;
        int i3 = f64835g;
        f64838j = i3;
        int i4 = i3 << 1;
        f64839k = i4;
        f64840l = i3 | i4;
        C26116V2 v22 = DISTINCT;
        f64841m = v22.f64853c;
        f64842n = v22.f64854d;
        C26116V2 v23 = SORTED;
        f64843o = v23.f64853c;
        f64844p = v23.f64854d;
        C26116V2 v24 = ORDERED;
        f64845q = v24.f64853c;
        f64846r = v24.f64854d;
        C26116V2 v25 = SIZED;
        f64847s = v25.f64853c;
        f64848t = v25.f64854d;
        f64849u = SHORT_CIRCUIT.f64853c;
    }

    private C26116V2(int i, C26108T2 t2) {
        for (C26112U2 putIfAbsent : C26112U2.values()) {
            Map.EL.putIfAbsent(t2.f64817a, putIfAbsent, 0);
        }
        this.f64851a = t2.f64817a;
        int i2 = i * 2;
        this.f64852b = i2;
        this.f64853c = 1 << i2;
        this.f64854d = 2 << i2;
        this.f64855e = 3 << i2;
    }

    /* renamed from: a */
    static int m65245a(int i, int i2) {
        return i | (i2 & (i == 0 ? f64837i : ~(((f64838j & i) << 1) | i | ((f64839k & i) >> 1))));
    }

    /* renamed from: b */
    private static int m65246b(C26112U2 u2) {
        int i = 0;
        for (C26116V2 v2 : values()) {
            i |= ((Integer) v2.f64851a.get(u2)).intValue() << v2.f64852b;
        }
        return i;
    }

    /* renamed from: c */
    static int m65247c(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        return ((characteristics & 4) == 0 || spliterator.getComparator() == null) ? f64834f & characteristics : f64834f & characteristics & -5;
    }

    /* renamed from: f */
    private static C26108T2 m65248f(C26112U2 u2) {
        C26108T2 t2 = new C26108T2(new EnumMap(C26112U2.class));
        t2.mo84443a(u2);
        return t2;
    }

    /* renamed from: g */
    static int m65249g(int i) {
        return i & ((~i) >> 1) & f64838j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo84449d(int i) {
        return (i & this.f64855e) == this.f64853c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo84450e(int i) {
        int i2 = this.f64855e;
        return (i & i2) == i2;
    }
}
