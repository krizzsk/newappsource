package p988j$.util.stream;

import java.util.Collection;
import p988j$.util.Collection;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.I0 */
final class C26063I0 implements C26043E0 {

    /* renamed from: a */
    private final Collection f64755a;

    C26063I0(Collection collection) {
        this.f64755a = collection;
    }

    /* renamed from: a */
    public final C26043E0 mo84198a(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final long count() {
        return (long) this.f64755a.size();
    }

    public final void forEach(Consumer consumer) {
        Collection.EL.m64672a(this.f64755a, consumer);
    }

    /* renamed from: j */
    public final void mo84243j(Object[] objArr, int i) {
        for (Object obj : this.f64755a) {
            objArr[i] = obj;
            i++;
        }
    }

    /* renamed from: n */
    public final /* synthetic */ int mo84244n() {
        return 0;
    }

    /* renamed from: o */
    public final Object[] mo84245o(IntFunction intFunction) {
        java.util.Collection collection = this.f64755a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    /* renamed from: p */
    public final /* synthetic */ C26043E0 mo84246p(long j, long j2, IntFunction intFunction) {
        return C26239v0.m65644E0(this, j, j2, intFunction);
    }

    public final Spliterator spliterator() {
        return Collection.EL.stream(this.f64755a).spliterator();
    }

    public final String toString() {
        return String.format("CollectionNode[%d][%s]", new Object[]{Integer.valueOf(this.f64755a.size()), this.f64755a});
    }
}
