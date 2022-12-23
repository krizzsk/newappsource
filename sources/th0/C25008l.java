package th0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import mf0.C24362h;
import nf0.C24497a;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: th0.l */
public final class C25008l<T> implements C25003h<T>, C24995c<T> {

    /* renamed from: a */
    public final C25003h<T> f63168a;

    /* renamed from: b */
    public final int f63169b;

    /* renamed from: th0.l$a */
    public static final class C25009a implements Iterator<T>, C24497a, p988j$.util.Iterator {

        /* renamed from: b */
        public int f63170b;

        /* renamed from: c */
        public final Iterator<T> f63171c;

        public C25009a(C25008l<T> lVar) {
            this.f63170b = lVar.f63169b;
            this.f63171c = lVar.f63168a.iterator();
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f63170b > 0 && this.f63171c.hasNext();
        }

        public final T next() {
            int i = this.f63170b;
            if (i != 0) {
                this.f63170b = i - 1;
                return this.f63171c.next();
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C25008l(C25003h<? extends T> hVar, int i) {
        boolean z;
        C24362h.m61211f(hVar, "sequence");
        this.f63168a = hVar;
        this.f63169b = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    /* renamed from: a */
    public final C25003h mo61539a() {
        int i = this.f63169b;
        return 1 >= i ? C24996d.f63140a : new C25006k(this.f63168a, 1, i);
    }

    /* renamed from: b */
    public final C25003h<T> mo61540b(int i) {
        return i >= this.f63169b ? this : new C25008l(this.f63168a, i);
    }

    public final java.util.Iterator<T> iterator() {
        return new C25009a(this);
    }
}
