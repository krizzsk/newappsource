package th0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import lf0.C24236l;
import mf0.C24362h;
import nf0.C24497a;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: th0.e */
public final class C24997e<T> implements C25003h<T> {

    /* renamed from: a */
    public final C25003h<T> f63141a;

    /* renamed from: b */
    public final boolean f63142b;

    /* renamed from: c */
    public final C24236l<T, Boolean> f63143c;

    /* renamed from: th0.e$a */
    public static final class C24998a implements Iterator<T>, C24497a, p988j$.util.Iterator {

        /* renamed from: b */
        public final Iterator<T> f63144b;

        /* renamed from: c */
        public int f63145c = -1;

        /* renamed from: d */
        public T f63146d;

        /* renamed from: e */
        public final /* synthetic */ C24997e<T> f63147e;

        public C24998a(C24997e<T> eVar) {
            this.f63147e = eVar;
            this.f63144b = eVar.f63141a.iterator();
        }

        /* renamed from: b */
        public final void mo61542b() {
            while (this.f63144b.hasNext()) {
                T next = this.f63144b.next();
                if (this.f63147e.f63143c.invoke(next).booleanValue() == this.f63147e.f63142b) {
                    this.f63146d = next;
                    this.f63145c = 1;
                    return;
                }
            }
            this.f63145c = 0;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            if (this.f63145c == -1) {
                mo61542b();
            }
            if (this.f63145c == 1) {
                return true;
            }
            return false;
        }

        public final T next() {
            if (this.f63145c == -1) {
                mo61542b();
            }
            if (this.f63145c != 0) {
                T t = this.f63146d;
                this.f63146d = null;
                this.f63145c = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C24997e(C25003h<? extends T> hVar, boolean z, C24236l<? super T, Boolean> lVar) {
        C24362h.m61211f(lVar, "predicate");
        this.f63141a = hVar;
        this.f63142b = z;
        this.f63143c = lVar;
    }

    public final java.util.Iterator<T> iterator() {
        return new C24998a(this);
    }
}
