package th0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import lf0.C24236l;
import nf0.C24497a;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: th0.m */
public final class C25010m<T> implements C25003h<T> {

    /* renamed from: a */
    public final C25003h<T> f63172a;

    /* renamed from: b */
    public final C24236l<T, Boolean> f63173b;

    /* renamed from: th0.m$a */
    public static final class C25011a implements Iterator<T>, C24497a, p988j$.util.Iterator {

        /* renamed from: b */
        public final Iterator<T> f63174b;

        /* renamed from: c */
        public int f63175c = -1;

        /* renamed from: d */
        public T f63176d;

        /* renamed from: e */
        public final /* synthetic */ C25010m<T> f63177e;

        public C25011a(C25010m<T> mVar) {
            this.f63177e = mVar;
            this.f63174b = mVar.f63172a.iterator();
        }

        /* renamed from: b */
        public final void mo61552b() {
            if (this.f63174b.hasNext()) {
                T next = this.f63174b.next();
                if (this.f63177e.f63173b.invoke(next).booleanValue()) {
                    this.f63175c = 1;
                    this.f63176d = next;
                    return;
                }
            }
            this.f63175c = 0;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            if (this.f63175c == -1) {
                mo61552b();
            }
            if (this.f63175c == 1) {
                return true;
            }
            return false;
        }

        public final T next() {
            if (this.f63175c == -1) {
                mo61552b();
            }
            if (this.f63175c != 0) {
                T t = this.f63176d;
                this.f63176d = null;
                this.f63175c = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C25010m(C25003h<? extends T> hVar, C24236l<? super T, Boolean> lVar) {
        this.f63172a = hVar;
        this.f63173b = lVar;
    }

    public final java.util.Iterator<T> iterator() {
        return new C25011a(this);
    }
}
