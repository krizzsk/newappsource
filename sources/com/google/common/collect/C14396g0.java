package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.C14433u0;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p583jk.C17875h;
import p583jk.C17884p;
import p584jl.C17885a;
import p988j$.util.Collection;
import p988j$.util.Map;
import p988j$.util.Set;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;
import p988j$.util.function.Predicate;

/* renamed from: com.google.common.collect.g0 */
public final class C14396g0 {

    /* renamed from: com.google.common.collect.g0$a */
    public static abstract class C14397a<K, V> extends C14433u0.C14434a<Map.Entry<K, V>> {
        public final void clear() {
            AbstractMapBasedMultimap.C14350b.this.clear();
        }

        public abstract boolean contains(Object obj);

        public final boolean isEmpty() {
            return AbstractMapBasedMultimap.C14350b.this.isEmpty();
        }

        public final boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                boolean z = false;
                for (Object remove : collection) {
                    z |= ((AbstractMapBasedMultimap.C14350b.C14351a) this).remove(remove);
                }
                return z;
            }
        }

        public final boolean retainAll(Collection<?> collection) {
            int i;
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                int size = collection.size();
                if (size < 3) {
                    C17885a.m44456q(size, "expectedSize");
                    i = size + 1;
                } else if (size < 1073741824) {
                    i = (int) ((((float) size) / 0.75f) + 1.0f);
                } else {
                    i = Integer.MAX_VALUE;
                }
                HashSet hashSet = new HashSet(i);
                for (Object next : collection) {
                    if (contains(next) && (next instanceof Map.Entry)) {
                        hashSet.add(((Map.Entry) next).getKey());
                    }
                }
                return AbstractMapBasedMultimap.C14350b.this.keySet().retainAll(hashSet);
            }
        }

        public final int size() {
            return AbstractMapBasedMultimap.C14350b.this.size();
        }
    }

    /* renamed from: com.google.common.collect.g0$b */
    public static class C14398b<K, V> extends C14433u0.C14434a<K> implements Set {

        /* renamed from: b */
        public final Map<K, V> f36278b;

        public C14398b(Map<K, V> map) {
            map.getClass();
            this.f36278b = map;
        }

        public final boolean contains(Object obj) {
            return this.f36278b.containsKey(obj);
        }

        /* renamed from: e */
        public final Map<K, V> mo43203e() {
            return this.f36278b;
        }

        public final void forEach(Consumer<? super K> consumer) {
            C17884p.m44373l(consumer);
            Map.EL.forEach(this.f36278b, new C14402h0(consumer));
        }

        public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            forEach(Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean isEmpty() {
            return this.f36278b.isEmpty();
        }

        public final /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
            return Collection.CC.$default$removeIf(this, Predicate.VivifiedWrapper.convert(predicate));
        }

        public final int size() {
            return this.f36278b.size();
        }

        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return Collection.CC.$default$toArray(this, intFunction);
        }

        public final /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
            return Collection.CC.$default$toArray(this, IntFunction.VivifiedWrapper.convert(intFunction));
        }
    }

    /* renamed from: com.google.common.collect.g0$c */
    public static class C14399c<K, V> extends AbstractCollection<V> implements p988j$.util.Collection {

        /* renamed from: b */
        public final java.util.Map<K, V> f36279b;

        public C14399c(java.util.Map<K, V> map) {
            map.getClass();
            this.f36279b = map;
        }

        public final void clear() {
            this.f36279b.clear();
        }

        public final boolean contains(Object obj) {
            return this.f36279b.containsValue(obj);
        }

        public final void forEach(Consumer<? super V> consumer) {
            C17884p.m44373l(consumer);
            Map.EL.forEach(this.f36279b, new C14404i0(consumer));
        }

        public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            forEach(Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean isEmpty() {
            return this.f36279b.isEmpty();
        }

        public final Iterator<V> iterator() {
            return new C14389d0(this.f36279b.entrySet().iterator());
        }

        public final boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry next : this.f36279b.entrySet()) {
                    if (C17875h.m44312w(obj, next.getValue())) {
                        this.f36279b.remove(next.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public final boolean removeAll(java.util.Collection<?> collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry next : this.f36279b.entrySet()) {
                    if (collection.contains(next.getValue())) {
                        hashSet.add(next.getKey());
                    }
                }
                return this.f36279b.keySet().removeAll(hashSet);
            }
        }

        public final /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
            return Collection.CC.$default$removeIf(this, Predicate.VivifiedWrapper.convert(predicate));
        }

        public final boolean retainAll(java.util.Collection<?> collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry next : this.f36279b.entrySet()) {
                    if (collection.contains(next.getValue())) {
                        hashSet.add(next.getKey());
                    }
                }
                return this.f36279b.keySet().retainAll(hashSet);
            }
        }

        public final int size() {
            return this.f36279b.size();
        }

        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return Collection.CC.$default$toArray(this, intFunction);
        }

        public final /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
            return Collection.CC.$default$toArray(this, IntFunction.VivifiedWrapper.convert(intFunction));
        }
    }

    /* renamed from: com.google.common.collect.g0$d */
    public static abstract class C14400d<K, V> extends AbstractMap<K, V> {

        /* renamed from: b */
        public transient AbstractMapBasedMultimap.C14350b.C14351a f36280b;

        /* renamed from: c */
        public transient C14399c f36281c;

        public final java.util.Set<Map.Entry<K, V>> entrySet() {
            AbstractMapBasedMultimap.C14350b.C14351a aVar = this.f36280b;
            if (aVar != null) {
                return aVar;
            }
            AbstractMapBasedMultimap.C14350b.C14351a aVar2 = new AbstractMapBasedMultimap.C14350b.C14351a();
            this.f36280b = aVar2;
            return aVar2;
        }

        public final java.util.Collection<V> values() {
            C14399c cVar = this.f36281c;
            if (cVar != null) {
                return cVar;
            }
            C14399c cVar2 = new C14399c(this);
            this.f36281c = cVar2;
            return cVar2;
        }
    }

    /* renamed from: a */
    public static <K, V> HashMap<K, V> m35866a(int i) {
        int i2;
        if (i < 3) {
            C17885a.m44456q(i, "expectedSize");
            i2 = i + 1;
        } else if (i < 1073741824) {
            i2 = (int) ((((float) i) / 0.75f) + 1.0f);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        return new HashMap<>(i2);
    }
}
