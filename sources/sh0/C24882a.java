package sh0;

import java.util.Iterator;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: sh0.a */
public final class C24882a<E> implements Iterable<E> {

    /* renamed from: e */
    public static final C24882a<Object> f62917e = new C24882a<>();

    /* renamed from: b */
    public final E f62918b;

    /* renamed from: c */
    public final C24882a<E> f62919c;

    /* renamed from: d */
    public final int f62920d;

    /* renamed from: sh0.a$a */
    public static class C24883a<E> implements Iterator<E>, p988j$.util.Iterator {

        /* renamed from: b */
        public C24882a<E> f62921b;

        public C24883a(C24882a<E> aVar) {
            this.f62921b = aVar;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            if (this.f62921b.f62920d > 0) {
                return true;
            }
            return false;
        }

        public final E next() {
            C24882a<E> aVar = this.f62921b;
            E e = aVar.f62918b;
            this.f62921b = aVar.f62919c;
            return e;
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C24882a() {
        this.f62920d = 0;
        this.f62918b = null;
        this.f62919c = null;
    }

    /* renamed from: a */
    public final C24882a<E> mo61354a(Object obj) {
        if (this.f62920d == 0) {
            return this;
        }
        if (this.f62918b.equals(obj)) {
            return this.f62919c;
        }
        C24882a<E> a = this.f62919c.mo61354a(obj);
        if (a == this.f62919c) {
            return this;
        }
        return new C24882a<>(this.f62918b, a);
    }

    /* renamed from: d */
    public final C24882a<E> mo61355d(int i) {
        if (i < 0 || i > this.f62920d) {
            throw new IndexOutOfBoundsException();
        } else if (i == 0) {
            return this;
        } else {
            return this.f62919c.mo61355d(i - 1);
        }
    }

    public final java.util.Iterator<E> iterator() {
        return new C24883a(mo61355d(0));
    }

    public C24882a(E e, C24882a<E> aVar) {
        this.f62918b = e;
        this.f62919c = aVar;
        this.f62920d = aVar.f62920d + 1;
    }
}
