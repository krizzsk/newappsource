package c00;

import ce0.C21100e;
import java.util.Iterator;
import p988j$.lang.Iterable;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: c00.j */
public class C13729j<T> implements Iterator<T>, Iterable<T>, Iterable, p988j$.util.Iterator {

    /* renamed from: b */
    public final Iterator<? extends T> f33801b;

    public C13729j(Iterator<? extends T> it) {
        C21100e.m49373x(it, "iterator");
        this.f33801b = it;
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        Iterable.CC.$default$forEach(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public boolean hasNext() {
        return this.f33801b.hasNext();
    }

    public final java.util.Iterator<T> iterator() {
        return this;
    }

    public T next() {
        return this.f33801b.next();
    }

    public void remove() {
        this.f33801b.remove();
    }
}
