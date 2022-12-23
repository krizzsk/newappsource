package c00;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: c00.p */
public abstract class C13735p<T> implements Iterable<T> {

    /* renamed from: b */
    public final Collection<Reference<T>> f33806b;

    /* renamed from: c00.p$a */
    public static class C13736a<T> implements Iterator<T>, p988j$.util.Iterator {

        /* renamed from: b */
        public final Iterator<? extends Reference<T>> f33807b;

        /* renamed from: c */
        public T f33808c = null;

        public C13736a(Iterator<? extends Reference<T>> it) {
            this.f33807b = it;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            while (this.f33807b.hasNext() && this.f33808c == null) {
                T t = ((Reference) this.f33807b.next()).get();
                this.f33808c = t;
                if (t == null) {
                    this.f33807b.remove();
                }
            }
            if (this.f33808c != null) {
                return true;
            }
            return false;
        }

        public final T next() {
            T t = this.f33808c;
            this.f33808c = null;
            return t;
        }

        public final void remove() {
            this.f33807b.remove();
        }
    }

    public C13735p() {
        this.f33806b = new LinkedList();
    }

    /* renamed from: a */
    public final void mo40650a(T t) {
        this.f33806b.add(new WeakReference(t));
        java.util.Iterator<Reference<T>> it = this.f33806b.iterator();
        while (it.hasNext()) {
            if (it.next().get() == null) {
                it.remove();
            }
        }
    }

    /* renamed from: b */
    public final void mo40651b(T t) {
        java.util.Iterator<Reference<T>> it = this.f33806b.iterator();
        while (it.hasNext()) {
            if (t.equals(it.next().get())) {
                it.remove();
                return;
            }
        }
    }

    public final java.util.Iterator<T> iterator() {
        return new C13736a(this.f33806b.iterator());
    }

    public C13735p(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f33806b = concurrentLinkedQueue;
    }
}
