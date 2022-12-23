package th0;

import java.util.Iterator;
import lf0.C24236l;
import mf0.C24362h;
import nf0.C24497a;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: th0.n */
public final class C25012n<T, R> implements C25003h<R> {

    /* renamed from: a */
    public final C25003h<T> f63178a;

    /* renamed from: b */
    public final C24236l<T, R> f63179b;

    /* renamed from: th0.n$a */
    public static final class C25013a implements Iterator<R>, C24497a, p988j$.util.Iterator {

        /* renamed from: b */
        public final Iterator<T> f63180b;

        /* renamed from: c */
        public final /* synthetic */ C25012n<T, R> f63181c;

        public C25013a(C25012n<T, R> nVar) {
            this.f63181c = nVar;
            this.f63180b = nVar.f63178a.iterator();
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f63180b.hasNext();
        }

        public final R next() {
            return this.f63181c.f63179b.invoke(this.f63180b.next());
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C25012n(C25003h<? extends T> hVar, C24236l<? super T, ? extends R> lVar) {
        C24362h.m61211f(lVar, "transformer");
        this.f63178a = hVar;
        this.f63179b = lVar;
    }

    public final java.util.Iterator<R> iterator() {
        return new C25013a(this);
    }
}
