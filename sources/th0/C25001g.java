package th0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import lf0.C24225a;
import lf0.C24236l;
import mf0.C24362h;
import nf0.C24497a;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: th0.g */
public final class C25001g<T> implements C25003h<T> {

    /* renamed from: a */
    public final C24225a<T> f63154a;

    /* renamed from: b */
    public final C24236l<T, T> f63155b;

    /* renamed from: th0.g$a */
    public static final class C25002a implements Iterator<T>, C24497a, p988j$.util.Iterator {

        /* renamed from: b */
        public T f63156b;

        /* renamed from: c */
        public int f63157c = -2;

        /* renamed from: d */
        public final /* synthetic */ C25001g<T> f63158d;

        public C25002a(C25001g<T> gVar) {
            this.f63158d = gVar;
        }

        /* renamed from: b */
        public final void mo61546b() {
            T t;
            int i;
            if (this.f63157c == -2) {
                t = this.f63158d.f63154a.invoke();
            } else {
                C24236l<T, T> lVar = this.f63158d.f63155b;
                T t2 = this.f63156b;
                C24362h.m61208c(t2);
                t = lVar.invoke(t2);
            }
            this.f63156b = t;
            if (t == null) {
                i = 0;
            } else {
                i = 1;
            }
            this.f63157c = i;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            if (this.f63157c < 0) {
                mo61546b();
            }
            if (this.f63157c == 1) {
                return true;
            }
            return false;
        }

        public final T next() {
            if (this.f63157c < 0) {
                mo61546b();
            }
            if (this.f63157c != 0) {
                T t = this.f63156b;
                C24362h.m61209d(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f63157c = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C25001g(C24225a<? extends T> aVar, C24236l<? super T, ? extends T> lVar) {
        C24362h.m61211f(lVar, "getNextValue");
        this.f63154a = aVar;
        this.f63155b = lVar;
    }

    public final java.util.Iterator<T> iterator() {
        return new C25002a(this);
    }
}
