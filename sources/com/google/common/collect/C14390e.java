package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p988j$.lang.Iterable;
import p988j$.util.Collection;
import p988j$.util.Spliterator;
import p988j$.util.Spliterators;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;
import p988j$.util.function.Predicate;

/* renamed from: com.google.common.collect.e */
public abstract class C14390e<K, V> implements C14406j0<K, V> {

    /* renamed from: b */
    public transient Set<K> f36270b;

    /* renamed from: c */
    public transient Collection<V> f36271c;

    /* renamed from: d */
    public transient Map<K, Collection<V>> f36272d;

    /* renamed from: com.google.common.collect.e$a */
    public class C14391a extends AbstractCollection<V> implements p988j$.util.Collection {
        public C14391a() {
        }

        public final void clear() {
            C14390e.this.clear();
        }

        public final boolean contains(Object obj) {
            return C14390e.this.mo43159c(obj);
        }

        public final /* synthetic */ void forEach(Consumer consumer) {
            Iterable.CC.$default$forEach(this, consumer);
        }

        public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            Iterable.CC.$default$forEach(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final Iterator<V> iterator() {
            return C14390e.this.mo42967f();
        }

        public final /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
            return Collection.CC.$default$removeIf(this, Predicate.VivifiedWrapper.convert(predicate));
        }

        public final int size() {
            return C14390e.this.size();
        }

        public final Spliterator<V> spliterator() {
            return C14390e.this.mo42968g();
        }

        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return Collection.CC.$default$toArray(this, intFunction);
        }

        public final /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
            return Collection.CC.$default$toArray(this, IntFunction.VivifiedWrapper.convert(intFunction));
        }
    }

    /* renamed from: b */
    public abstract Map<K, java.util.Collection<V>> mo42964b();

    /* renamed from: c */
    public boolean mo43159c(Object obj) {
        for (java.util.Collection contains : mo42964b().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public abstract Map<K, java.util.Collection<V>> mo43160d();

    /* renamed from: e */
    public abstract Set<K> mo43161e();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14406j0) {
            return mo42964b().equals(((C14406j0) obj).mo42964b());
        }
        return false;
    }

    /* renamed from: f */
    public abstract Iterator<V> mo42967f();

    /* renamed from: g */
    public Spliterator<V> mo42968g() {
        return Spliterators.spliterator(mo42967f(), (long) size(), 0);
    }

    public final int hashCode() {
        return mo42964b().hashCode();
    }

    public final String toString() {
        return mo42964b().toString();
    }
}
