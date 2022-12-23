package th0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import lf0.C24236l;
import mf0.C24362h;
import nf0.C24497a;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: th0.f */
public final class C24999f<T, R, E> implements C25003h<E> {

    /* renamed from: a */
    public final C25003h<T> f63148a;

    /* renamed from: b */
    public final C24236l<T, R> f63149b;

    /* renamed from: c */
    public final C24236l<R, Iterator<E>> f63150c;

    /* renamed from: th0.f$a */
    public static final class C25000a implements Iterator<E>, C24497a, p988j$.util.Iterator {

        /* renamed from: b */
        public final Iterator<T> f63151b;

        /* renamed from: c */
        public Iterator<? extends E> f63152c;

        /* renamed from: d */
        public final /* synthetic */ C24999f<T, R, E> f63153d;

        public C25000a(C24999f<T, R, E> fVar) {
            this.f63153d = fVar;
            this.f63151b = fVar.f63148a.iterator();
        }

        /* renamed from: b */
        public final boolean mo61544b() {
            boolean z;
            Iterator<? extends E> it = this.f63152c;
            if (it == null || it.hasNext()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f63152c = null;
            }
            while (true) {
                if (this.f63152c == null) {
                    if (this.f63151b.hasNext()) {
                        T next = this.f63151b.next();
                        C24999f<T, R, E> fVar = this.f63153d;
                        Iterator<? extends E> invoke = fVar.f63150c.invoke(fVar.f63149b.invoke(next));
                        if (invoke.hasNext()) {
                            this.f63152c = invoke;
                            break;
                        }
                    } else {
                        return false;
                    }
                } else {
                    break;
                }
            }
            return true;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return mo61544b();
        }

        public final E next() {
            if (mo61544b()) {
                java.util.Iterator<? extends E> it = this.f63152c;
                C24362h.m61208c(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C24999f(C25003h<? extends T> hVar, C24236l<? super T, ? extends R> lVar, C24236l<? super R, ? extends java.util.Iterator<? extends E>> lVar2) {
        C24362h.m61211f(hVar, "sequence");
        C24362h.m61211f(lVar, "transformer");
        C24362h.m61211f(lVar2, "iterator");
        this.f63148a = hVar;
        this.f63149b = lVar;
        this.f63150c = lVar2;
    }

    public final java.util.Iterator<E> iterator() {
        return new C25000a(this);
    }
}
