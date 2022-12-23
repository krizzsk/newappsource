package p988j$.util.stream;

import p988j$.util.C25861I;
import p988j$.util.C26010h;
import p988j$.util.C26012j;
import p988j$.util.C26014l;
import p988j$.util.C26268y;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.C25922D0;
import p988j$.util.function.C25958a0;
import p988j$.util.function.C25966e0;
import p988j$.util.function.C25972h0;
import p988j$.util.function.C25978k0;
import p988j$.util.function.C25984n0;
import p988j$.util.function.C25990q0;
import p988j$.util.function.C25998u0;
import p988j$.util.function.Supplier;

/* renamed from: j$.util.stream.m0 */
public interface C26194m0 extends C26173i {
    /* renamed from: E */
    void mo84486E(C25966e0 e0Var);

    /* renamed from: J */
    C26047F mo84504J(C25984n0 n0Var);

    /* renamed from: M */
    C26194m0 mo84505M(C25998u0 u0Var);

    /* renamed from: T */
    IntStream mo84506T(C25990q0 q0Var);

    /* renamed from: U */
    Stream mo84507U(C25972h0 h0Var);

    /* renamed from: a */
    boolean mo84508a(C25978k0 k0Var);

    C26047F asDoubleStream();

    C26012j average();

    Stream boxed();

    long count();

    /* renamed from: d0 */
    boolean mo84513d0(C25978k0 k0Var);

    C26194m0 distinct();

    /* renamed from: e */
    C26014l mo84515e(C25958a0 a0Var);

    /* renamed from: f */
    C26194m0 mo84516f(C25966e0 e0Var);

    C26014l findAny();

    C26014l findFirst();

    /* renamed from: g */
    C26194m0 mo84519g(C25972h0 h0Var);

    /* renamed from: g0 */
    C26194m0 mo84520g0(C25978k0 k0Var);

    C26268y iterator();

    C26194m0 limit(long j);

    /* renamed from: m */
    long mo84522m(long j, C25958a0 a0Var);

    C26014l max();

    C26014l min();

    C26194m0 parallel();

    C26194m0 sequential();

    C26194m0 skip(long j);

    C26194m0 sorted();

    C25861I spliterator();

    long sum();

    C26010h summaryStatistics();

    long[] toArray();

    /* renamed from: x */
    void mo84487x(C25966e0 e0Var);

    /* renamed from: y */
    Object mo84530y(Supplier supplier, C25922D0 d0, BiConsumer biConsumer);

    /* renamed from: z */
    boolean mo84531z(C25978k0 k0Var);
}
