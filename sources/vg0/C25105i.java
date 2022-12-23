package vg0;

import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: vg0.i */
public final class C25105i extends AbstractList<String> implements RandomAccess, C25096d {

    /* renamed from: b */
    public final C25096d f63327b;

    /* renamed from: vg0.i$a */
    public class C25106a implements ListIterator<String>, Iterator {

        /* renamed from: b */
        public ListIterator<String> f63328b;

        public C25106a(C25105i iVar, int i) {
            this.f63328b = iVar.f63327b.listIterator(i);
        }

        public final void add(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f63328b.hasNext();
        }

        public final boolean hasPrevious() {
            return this.f63328b.hasPrevious();
        }

        public final Object next() {
            return this.f63328b.next();
        }

        public final int nextIndex() {
            return this.f63328b.nextIndex();
        }

        public final Object previous() {
            return this.f63328b.previous();
        }

        public final int previousIndex() {
            return this.f63328b.previousIndex();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }

        public final void set(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: vg0.i$b */
    public class C25107b implements java.util.Iterator<String>, Iterator {

        /* renamed from: b */
        public java.util.Iterator<String> f63329b;

        public C25107b(C25105i iVar) {
            this.f63329b = iVar.f63327b.iterator();
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f63329b.hasNext();
        }

        public final Object next() {
            return this.f63329b.next();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C25105i(C25096d dVar) {
        this.f63327b = dVar;
    }

    /* renamed from: A */
    public final C25105i mo61636A() {
        return this;
    }

    /* renamed from: B0 */
    public final C25091a mo61637B0(int i) {
        return this.f63327b.mo61637B0(i);
    }

    public final Object get(int i) {
        return (String) this.f63327b.get(i);
    }

    public final java.util.Iterator<String> iterator() {
        return new C25107b(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C25106a(this, i);
    }

    /* renamed from: p1 */
    public final void mo61643p1(C25097e eVar) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.f63327b.size();
    }

    /* renamed from: w */
    public final List<?> mo61647w() {
        return this.f63327b.mo61647w();
    }
}
