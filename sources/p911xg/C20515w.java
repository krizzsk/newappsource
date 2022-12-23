package p911xg;

import com.google.protobuf.ByteString;
import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: xg.w */
public final class C20515w extends AbstractList<String> implements C20498h, RandomAccess {

    /* renamed from: b */
    public final C20498h f51904b;

    /* renamed from: xg.w$a */
    public class C20516a implements ListIterator<String>, Iterator {

        /* renamed from: b */
        public ListIterator<String> f51905b;

        public C20516a(C20515w wVar, int i) {
            this.f51905b = wVar.f51904b.listIterator(i);
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
            return this.f51905b.hasNext();
        }

        public final boolean hasPrevious() {
            return this.f51905b.hasPrevious();
        }

        public final Object next() {
            return this.f51905b.next();
        }

        public final int nextIndex() {
            return this.f51905b.nextIndex();
        }

        public final Object previous() {
            return this.f51905b.previous();
        }

        public final int previousIndex() {
            return this.f51905b.previousIndex();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }

        public final void set(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: xg.w$b */
    public class C20517b implements java.util.Iterator<String>, Iterator {

        /* renamed from: b */
        public java.util.Iterator<String> f51906b;

        public C20517b(C20515w wVar) {
            this.f51906b = wVar.f51904b.iterator();
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f51906b.hasNext();
        }

        public final Object next() {
            return this.f51906b.next();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C20515w(C20498h hVar) {
        this.f51904b = hVar;
    }

    /* renamed from: A */
    public final C20498h mo44105A() {
        return this;
    }

    public final Object get(int i) {
        return (String) this.f51904b.get(i);
    }

    public final Object getRaw(int i) {
        return this.f51904b.getRaw(i);
    }

    public final java.util.Iterator<String> iterator() {
        return new C20517b(this);
    }

    /* renamed from: k */
    public final void mo44109k(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<String> listIterator(int i) {
        return new C20516a(this, i);
    }

    public final int size() {
        return this.f51904b.size();
    }

    /* renamed from: w */
    public final List<?> mo44112w() {
        return this.f51904b.mo44112w();
    }
}
