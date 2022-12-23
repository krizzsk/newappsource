package p988j$.util.stream;

import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.E0 */
interface C26043E0 {
    /* renamed from: a */
    C26043E0 mo84198a(int i);

    long count();

    void forEach(Consumer consumer);

    /* renamed from: j */
    void mo84243j(Object[] objArr, int i);

    /* renamed from: n */
    int mo84244n();

    /* renamed from: o */
    Object[] mo84245o(IntFunction intFunction);

    /* renamed from: p */
    C26043E0 mo84246p(long j, long j2, IntFunction intFunction);

    Spliterator spliterator();
}
