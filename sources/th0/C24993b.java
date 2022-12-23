package th0;

import java.util.Iterator;
import mf0.C24362h;
import nf0.C24497a;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: th0.b */
public final class C24993b<T> implements C25003h<T>, C24995c<T> {

    /* renamed from: a */
    public final C25003h<T> f63136a;

    /* renamed from: b */
    public final int f63137b;

    /* renamed from: th0.b$a */
    public static final class C24994a implements Iterator<T>, C24497a, p988j$.util.Iterator {

        /* renamed from: b */
        public final Iterator<T> f63138b;

        /* renamed from: c */
        public int f63139c;

        public C24994a(C24993b<T> bVar) {
            this.f63138b = bVar.f63136a.iterator();
            this.f63139c = bVar.f63137b;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            while (this.f63139c > 0 && this.f63138b.hasNext()) {
                this.f63138b.next();
                this.f63139c--;
            }
            return this.f63138b.hasNext();
        }

        public final T next() {
            while (this.f63139c > 0 && this.f63138b.hasNext()) {
                this.f63138b.next();
                this.f63139c--;
            }
            return this.f63138b.next();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C24993b(C25003h<? extends T> hVar, int i) {
        boolean z;
        C24362h.m61211f(hVar, "sequence");
        this.f63136a = hVar;
        this.f63137b = i;
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
        int i = this.f63137b + 1;
        return i < 0 ? new C24993b(this, 1) : new C24993b(this.f63136a, i);
    }

    /* renamed from: b */
    public final C25003h<T> mo61540b(int i) {
        int i2 = this.f63137b;
        int i3 = i2 + i;
        return i3 < 0 ? new C25008l(this, i) : new C25006k(this.f63136a, i2, i3);
    }

    public final java.util.Iterator<T> iterator() {
        return new C24994a(this);
    }
}
