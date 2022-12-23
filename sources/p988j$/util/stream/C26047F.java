package p988j$.util.stream;

import p988j$.util.C25856D;
import p988j$.util.C25914f;
import p988j$.util.C26012j;
import p988j$.util.C26019q;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.C25917B;
import p988j$.util.function.C25973i;
import p988j$.util.function.C25981m;
import p988j$.util.function.C25987p;
import p988j$.util.function.C25993s;
import p988j$.util.function.C25999v;
import p988j$.util.function.C26004x0;
import p988j$.util.function.C26005y;
import p988j$.util.function.Supplier;

/* renamed from: j$.util.stream.F */
public interface C26047F extends C26173i {
    /* renamed from: B */
    IntStream mo84152B(C25999v vVar);

    /* renamed from: H */
    void mo84153H(C25981m mVar);

    /* renamed from: N */
    C26012j mo84154N(C25973i iVar);

    /* renamed from: Q */
    double mo84155Q(double d, C25973i iVar);

    /* renamed from: R */
    boolean mo84156R(C25993s sVar);

    /* renamed from: V */
    boolean mo84157V(C25993s sVar);

    C26012j average();

    /* renamed from: b */
    C26047F mo84159b(C25981m mVar);

    Stream boxed();

    long count();

    C26047F distinct();

    C26012j findAny();

    C26012j findFirst();

    /* renamed from: h */
    C26047F mo84166h(C25993s sVar);

    /* renamed from: i */
    C26047F mo84167i(C25987p pVar);

    /* renamed from: i0 */
    void mo84168i0(C25981m mVar);

    C26019q iterator();

    /* renamed from: j */
    C26194m0 mo84170j(C26005y yVar);

    C26047F limit(long j);

    C26012j max();

    C26012j min();

    /* renamed from: o */
    Object mo84177o(Supplier supplier, C26004x0 x0Var, BiConsumer biConsumer);

    /* renamed from: p */
    C26047F mo84178p(C25917B b);

    C26047F parallel();

    /* renamed from: q */
    Stream mo84179q(C25987p pVar);

    C26047F sequential();

    C26047F skip(long j);

    C26047F sorted();

    C25856D spliterator();

    double sum();

    C25914f summaryStatistics();

    double[] toArray();

    /* renamed from: v */
    boolean mo84187v(C25993s sVar);
}
