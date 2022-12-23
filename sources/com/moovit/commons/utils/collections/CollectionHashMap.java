package com.moovit.commons.utils.collections;

import c00.C13717b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import p977zz.C20944i0;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

public abstract class CollectionHashMap<K, V, C extends Collection<V>> extends HashMap<K, C> implements Iterable<C20944i0<K, V>> {

    public static class ArrayListHashMap<K, V> extends CollectionHashMap<K, V, ArrayList<V>> {
        /* renamed from: i */
        public final Collection mo47004i() {
            return new ArrayList(1);
        }
    }

    public static class HashSetHashMap<K, V> extends CollectionHashMap<K, V, HashSet<V>> {
        /* renamed from: i */
        public final Collection mo47004i() {
            return new HashSet();
        }
    }

    public static class LinkedListHashMap<K, V> extends CollectionHashMap<K, V, LinkedList<V>> {
        /* renamed from: i */
        public final Collection mo47004i() {
            return new LinkedList();
        }
    }

    /* renamed from: com.moovit.commons.utils.collections.CollectionHashMap$a */
    public class C15782a implements Iterator<C20944i0<K, V>>, p988j$.util.Iterator {

        /* renamed from: b */
        public Iterator<Map.Entry<K, C>> f41037b;

        /* renamed from: c */
        public K f41038c = null;

        /* renamed from: d */
        public Iterator<V> f41039d = null;

        public C15782a() {
            this.f41037b = CollectionHashMap.this.entrySet().iterator();
            mo47008b();
        }

        /* renamed from: b */
        public final void mo47008b() {
            if (this.f41037b.hasNext()) {
                Map.Entry next = this.f41037b.next();
                this.f41038c = next.getKey();
                this.f41039d = ((Collection) next.getValue()).iterator();
            }
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            java.util.Iterator<V> it = this.f41039d;
            if (it == null) {
                return false;
            }
            if (it.hasNext() || this.f41037b.hasNext()) {
                return true;
            }
            return false;
        }

        public final Object next() {
            if (!this.f41039d.hasNext()) {
                mo47008b();
            }
            return new C20944i0(this.f41038c, this.f41039d.next());
        }

        public final void remove() {
            this.f41039d.remove();
            if (((Collection) CollectionHashMap.this.get(this.f41038c)).isEmpty()) {
                this.f41037b.remove();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo47001a(K k, V v) {
        Collection collection = (Collection) get(k);
        if (collection == null) {
            collection = mo47004i();
            put(k, collection);
        }
        return collection.add(v);
    }

    /* renamed from: b */
    public final boolean mo47002b(K k, Collection<? extends V> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        Collection collection2 = (Collection) get(k);
        if (collection2 == null) {
            collection2 = mo47004i();
            put(k, collection2);
        }
        return collection2.addAll(collection);
    }

    /* renamed from: d */
    public final Object mo47003d(String str) {
        Collection collection = (Collection) get(str);
        int size = collection.size();
        if (size > 1) {
            throw new IllegalArgumentException("The key '" + str + "' is mapped to a collection larger than one item");
        } else if (size == 0) {
            return null;
        } else {
            return C13717b.m34256c(collection);
        }
    }

    /* renamed from: i */
    public abstract C mo47004i();

    public final boolean isEmpty() {
        if (super.isEmpty()) {
            return true;
        }
        for (Collection isEmpty : values()) {
            if (!isEmpty.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final java.util.Iterator<C20944i0<K, V>> iterator() {
        return new C15782a();
    }

    /* renamed from: p */
    public final boolean mo47007p(K k, V v) {
        Collection collection = (Collection) get(k);
        if (collection == null) {
            return false;
        }
        boolean remove = collection.remove(v);
        if (collection.isEmpty()) {
            remove(k);
        }
        return remove;
    }
}
