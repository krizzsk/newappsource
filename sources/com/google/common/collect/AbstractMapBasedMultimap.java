package com.google.common.collect;

import com.google.common.collect.C14390e;
import com.google.common.collect.C14396g0;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import p127j.C5344a;
import p583jk.C17884p;
import p988j$.lang.Iterable;
import p988j$.util.Collection;
import p988j$.util.Iterator;
import p988j$.util.List;
import p988j$.util.Set;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;
import p988j$.util.function.Predicate;
import p988j$.util.function.UnaryOperator;

abstract class AbstractMapBasedMultimap<K, V> extends C14390e<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* renamed from: e */
    public transient Map<K, Collection<V>> f36159e;

    /* renamed from: f */
    public transient int f36160f;

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$a */
    public class C14349a extends AbstractMapBasedMultimap<K, V>.C13715c<V> {
        public C14349a(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            super();
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$b */
    public class C14350b extends C14396g0.C14400d<K, Collection<V>> {

        /* renamed from: d */
        public final transient Map<K, Collection<V>> f36161d;

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$b$a */
        public class C14351a extends C14396g0.C14397a<K, Collection<V>> implements Set {
            public C14351a() {
            }

            public final boolean contains(Object obj) {
                java.util.Set<Map.Entry<K, Collection<V>>> entrySet = C14350b.this.f36161d.entrySet();
                entrySet.getClass();
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            public final /* synthetic */ void forEach(Consumer consumer) {
                Iterable.CC.$default$forEach(this, consumer);
            }

            public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
                Iterable.CC.$default$forEach(this, Consumer.VivifiedWrapper.convert(consumer));
            }

            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C14352b();
            }

            public final boolean remove(Object obj) {
                Collection<V> collection;
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                Object key = entry.getKey();
                Map<K, Collection<V>> map = abstractMapBasedMultimap.f36159e;
                map.getClass();
                try {
                    collection = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    collection = null;
                }
                Collection collection2 = collection;
                if (collection2 == null) {
                    return true;
                }
                int size = collection2.size();
                collection2.clear();
                abstractMapBasedMultimap.f36160f -= size;
                return true;
            }

            public final /* synthetic */ boolean removeIf(Predicate predicate) {
                return Collection.CC.$default$removeIf(this, predicate);
            }

            public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
                return Collection.CC.$default$removeIf(this, Predicate.VivifiedWrapper.convert(predicate));
            }

            public final Spliterator<Map.Entry<K, java.util.Collection<V>>> spliterator() {
                return C14415o.m35877c(Set.EL.spliterator(C14350b.this.f36161d.entrySet()), new C14386c(C14350b.this));
            }

            public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
                return Collection.CC.$default$toArray(this, intFunction);
            }

            public final /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
                return Collection.CC.$default$toArray(this, IntFunction.VivifiedWrapper.convert(intFunction));
            }
        }

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$b$b */
        public class C14352b implements Iterator<Map.Entry<K, java.util.Collection<V>>>, p988j$.util.Iterator {

            /* renamed from: b */
            public final Iterator<Map.Entry<K, java.util.Collection<V>>> f36164b;

            /* renamed from: c */
            public java.util.Collection<V> f36165c;

            public C14352b() {
                this.f36164b = C14350b.this.f36161d.entrySet().iterator();
            }

            public final /* synthetic */ void forEachRemaining(Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
            }

            public final boolean hasNext() {
                return this.f36164b.hasNext();
            }

            public final Object next() {
                Map.Entry next = this.f36164b.next();
                this.f36165c = (java.util.Collection) next.getValue();
                return C14350b.this.mo42972a(next);
            }

            public final void remove() {
                boolean z;
                if (this.f36165c != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f36164b.remove();
                    AbstractMapBasedMultimap.this.f36160f -= this.f36165c.size();
                    this.f36165c.clear();
                    this.f36165c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
        }

        public C14350b(Map<K, java.util.Collection<V>> map) {
            this.f36161d = map;
        }

        /* renamed from: a */
        public final Map.Entry<K, java.util.Collection<V>> mo42972a(Map.Entry<K, java.util.Collection<V>> entry) {
            Object obj;
            K key = entry.getKey();
            AbstractListMultimap abstractListMultimap = (AbstractListMultimap) AbstractMapBasedMultimap.this;
            abstractListMultimap.getClass();
            List list = (List) entry.getValue();
            if (list instanceof RandomAccess) {
                obj = new C14358g(abstractListMultimap, key, list, (AbstractMapBasedMultimap<K, V>.j) null);
            } else {
                obj = new C14363k(key, list, (AbstractMapBasedMultimap<K, V>.j) null);
            }
            return new ImmutableEntry(key, obj);
        }

        public final void clear() {
            Map<K, java.util.Collection<V>> map = this.f36161d;
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            if (map == abstractMapBasedMultimap.f36159e) {
                abstractMapBasedMultimap.clear();
                return;
            }
            C14352b bVar = new C14352b();
            while (bVar.hasNext()) {
                bVar.next();
                bVar.remove();
            }
        }

        public final boolean containsKey(Object obj) {
            Map<K, java.util.Collection<V>> map = this.f36161d;
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        public final boolean equals(Object obj) {
            return this == obj || this.f36161d.equals(obj);
        }

        public final Object get(Object obj) {
            java.util.Collection<V> collection;
            Object obj2;
            Map<K, java.util.Collection<V>> map = this.f36161d;
            map.getClass();
            try {
                collection = map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                collection = null;
            }
            java.util.Collection collection2 = collection;
            if (collection2 == null) {
                return null;
            }
            AbstractListMultimap abstractListMultimap = (AbstractListMultimap) AbstractMapBasedMultimap.this;
            abstractListMultimap.getClass();
            List list = (List) collection2;
            if (list instanceof RandomAccess) {
                obj2 = new C14358g(abstractListMultimap, obj, list, (AbstractMapBasedMultimap<K, V>.j) null);
            } else {
                obj2 = new C14363k(obj, list, (AbstractMapBasedMultimap<K, V>.j) null);
            }
            return obj2;
        }

        public final int hashCode() {
            return this.f36161d.hashCode();
        }

        public java.util.Set<K> keySet() {
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            java.util.Set<K> set = abstractMapBasedMultimap.f36270b;
            if (set != null) {
                return set;
            }
            java.util.Set<K> e = abstractMapBasedMultimap.mo43161e();
            abstractMapBasedMultimap.f36270b = e;
            return e;
        }

        public final Object remove(Object obj) {
            java.util.Collection remove = this.f36161d.remove(obj);
            if (remove == null) {
                return null;
            }
            List list = (List) ((Multimaps$CustomListMultimap) AbstractMapBasedMultimap.this).f36235g.get();
            list.addAll(remove);
            AbstractMapBasedMultimap.this.f36160f -= remove.size();
            remove.clear();
            return list;
        }

        public final int size() {
            return this.f36161d.size();
        }

        public final String toString() {
            return this.f36161d.toString();
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$c */
    public abstract class C14353c<T> implements java.util.Iterator<T>, p988j$.util.Iterator {

        /* renamed from: b */
        public final java.util.Iterator<Map.Entry<K, java.util.Collection<V>>> f36167b;

        /* renamed from: c */
        public K f36168c = null;

        /* renamed from: d */
        public java.util.Collection<V> f36169d = null;

        /* renamed from: e */
        public java.util.Iterator<V> f36170e = Iterators$EmptyModifiableIterator.INSTANCE;

        public C14353c() {
            this.f36167b = AbstractMapBasedMultimap.this.f36159e.entrySet().iterator();
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f36167b.hasNext() || this.f36170e.hasNext();
        }

        public final T next() {
            if (!this.f36170e.hasNext()) {
                Map.Entry next = this.f36167b.next();
                this.f36168c = next.getKey();
                java.util.Collection<V> collection = (java.util.Collection) next.getValue();
                this.f36169d = collection;
                this.f36170e = collection.iterator();
            }
            return this.f36170e.next();
        }

        public final void remove() {
            this.f36170e.remove();
            java.util.Collection<V> collection = this.f36169d;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f36167b.remove();
            }
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            abstractMapBasedMultimap.f36160f--;
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$d */
    public class C14354d extends C14396g0.C14398b<K, java.util.Collection<V>> {

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$d$a */
        public class C14355a implements java.util.Iterator<K>, p988j$.util.Iterator {

            /* renamed from: b */
            public Map.Entry<K, java.util.Collection<V>> f36173b;

            /* renamed from: c */
            public final /* synthetic */ java.util.Iterator f36174c;

            public C14355a(java.util.Iterator it) {
                this.f36174c = it;
            }

            public final /* synthetic */ void forEachRemaining(Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
            }

            public final boolean hasNext() {
                return this.f36174c.hasNext();
            }

            public final K next() {
                Map.Entry<K, java.util.Collection<V>> entry = (Map.Entry) this.f36174c.next();
                this.f36173b = entry;
                return entry.getKey();
            }

            public final void remove() {
                boolean z;
                Map.Entry<K, java.util.Collection<V>> entry = this.f36173b;
                if (entry != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    java.util.Collection value = entry.getValue();
                    this.f36174c.remove();
                    AbstractMapBasedMultimap.this.f36160f -= value.size();
                    value.clear();
                    this.f36173b = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
        }

        public C14354d(Map<K, java.util.Collection<V>> map) {
            super(map);
        }

        public final void clear() {
            java.util.Iterator it = iterator();
            while (true) {
                C14355a aVar = (C14355a) it;
                if (aVar.hasNext()) {
                    aVar.next();
                    aVar.remove();
                } else {
                    return;
                }
            }
        }

        public final boolean containsAll(java.util.Collection<?> collection) {
            return this.f36278b.keySet().containsAll(collection);
        }

        public final boolean equals(Object obj) {
            if (this == obj || this.f36278b.keySet().equals(obj)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f36278b.keySet().hashCode();
        }

        public final java.util.Iterator<K> iterator() {
            return new C14355a(this.f36278b.entrySet().iterator());
        }

        public final boolean remove(Object obj) {
            int i;
            java.util.Collection collection = (java.util.Collection) this.f36278b.remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                AbstractMapBasedMultimap.this.f36160f -= i;
            } else {
                i = 0;
            }
            if (i > 0) {
                return true;
            }
            return false;
        }

        public final Spliterator<K> spliterator() {
            return Set.EL.spliterator(mo43203e().keySet());
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$e */
    public class C14356e extends AbstractMapBasedMultimap<K, V>.h implements NavigableMap<K, java.util.Collection<V>> {
        public C14356e(NavigableMap<K, java.util.Collection<V>> navigableMap) {
            super(navigableMap);
        }

        /* renamed from: b */
        public final SortedSet mo42998b() {
            return new C14357f(mo43002d());
        }

        /* renamed from: c */
        public final SortedSet mo42999c() {
            return (NavigableSet) super.keySet();
        }

        public final Map.Entry<K, java.util.Collection<V>> ceilingEntry(K k) {
            Map.Entry ceilingEntry = mo43002d().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return mo42972a(ceilingEntry);
        }

        public final K ceilingKey(K k) {
            return mo43002d().ceilingKey(k);
        }

        public final NavigableSet<K> descendingKeySet() {
            return ((C14356e) descendingMap()).navigableKeySet();
        }

        public final NavigableMap<K, java.util.Collection<V>> descendingMap() {
            return new C14356e(mo43002d().descendingMap());
        }

        /* renamed from: e */
        public final Map.Entry<K, java.util.Collection<V>> mo43005e(java.util.Iterator<Map.Entry<K, java.util.Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry next = it.next();
            List list = (List) ((Multimaps$CustomListMultimap) AbstractMapBasedMultimap.this).f36235g.get();
            list.addAll((java.util.Collection) next.getValue());
            it.remove();
            Object key = next.getKey();
            ((AbstractListMultimap) AbstractMapBasedMultimap.this).getClass();
            return new ImmutableEntry(key, Collections.unmodifiableList(list));
        }

        /* renamed from: f */
        public final NavigableMap<K, java.util.Collection<V>> mo43002d() {
            return (NavigableMap) ((SortedMap) this.f36161d);
        }

        public final Map.Entry<K, java.util.Collection<V>> firstEntry() {
            Map.Entry firstEntry = mo43002d().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return mo42972a(firstEntry);
        }

        public final Map.Entry<K, java.util.Collection<V>> floorEntry(K k) {
            Map.Entry floorEntry = mo43002d().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return mo42972a(floorEntry);
        }

        public final K floorKey(K k) {
            return mo43002d().floorKey(k);
        }

        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        public final Map.Entry<K, java.util.Collection<V>> higherEntry(K k) {
            Map.Entry higherEntry = mo43002d().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return mo42972a(higherEntry);
        }

        public final K higherKey(K k) {
            return mo43002d().higherKey(k);
        }

        public final java.util.Set keySet() {
            return (NavigableSet) super.keySet();
        }

        public final Map.Entry<K, java.util.Collection<V>> lastEntry() {
            Map.Entry lastEntry = mo43002d().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return mo42972a(lastEntry);
        }

        public final Map.Entry<K, java.util.Collection<V>> lowerEntry(K k) {
            Map.Entry lowerEntry = mo43002d().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return mo42972a(lowerEntry);
        }

        public final K lowerKey(K k) {
            return mo43002d().lowerKey(k);
        }

        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        public final Map.Entry<K, java.util.Collection<V>> pollFirstEntry() {
            return mo43005e(entrySet().iterator());
        }

        public final Map.Entry<K, java.util.Collection<V>> pollLastEntry() {
            return mo43005e(((C14396g0.C14400d) descendingMap()).entrySet().iterator());
        }

        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        public final NavigableMap<K, java.util.Collection<V>> headMap(K k, boolean z) {
            return new C14356e(mo43002d().headMap(k, z));
        }

        public final NavigableMap<K, java.util.Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new C14356e(mo43002d().subMap(k, z, k2, z2));
        }

        public final NavigableMap<K, java.util.Collection<V>> tailMap(K k, boolean z) {
            return new C14356e(mo43002d().tailMap(k, z));
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$f */
    public class C14357f extends AbstractMapBasedMultimap<K, V>.i implements NavigableSet<K> {
        public C14357f(NavigableMap<K, java.util.Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public final K ceiling(K k) {
            return mo43031i().ceilingKey(k);
        }

        public final java.util.Iterator<K> descendingIterator() {
            return ((C14354d) descendingSet()).iterator();
        }

        public final NavigableSet<K> descendingSet() {
            return new C14357f(mo43031i().descendingMap());
        }

        public final K floor(K k) {
            return mo43031i().floorKey(k);
        }

        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        public final K higher(K k) {
            return mo43031i().higherKey(k);
        }

        public final K lower(K k) {
            return mo43031i().lowerKey(k);
        }

        /* renamed from: m */
        public final NavigableMap<K, java.util.Collection<V>> mo43031i() {
            return (NavigableMap) ((SortedMap) this.f36278b);
        }

        public final K pollFirst() {
            C14354d.C14355a aVar = (C14354d.C14355a) iterator();
            if (!aVar.hasNext()) {
                return null;
            }
            K next = aVar.next();
            aVar.remove();
            return next;
        }

        public final K pollLast() {
            java.util.Iterator descendingIterator = descendingIterator();
            if (!descendingIterator.hasNext()) {
                return null;
            }
            K next = descendingIterator.next();
            descendingIterator.remove();
            return next;
        }

        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        public final NavigableSet<K> headSet(K k, boolean z) {
            return new C14357f(mo43031i().headMap(k, z));
        }

        public final NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new C14357f(mo43031i().subMap(k, z, k2, z2));
        }

        public final NavigableSet<K> tailSet(K k, boolean z) {
            return new C14357f(mo43031i().tailMap(k, z));
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$g */
    public class C14358g extends AbstractMapBasedMultimap<K, V>.k implements RandomAccess {
        public C14358g(AbstractMapBasedMultimap abstractMapBasedMultimap, K k, List<V> list, AbstractMapBasedMultimap<K, V>.j jVar) {
            super(k, list, jVar);
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$h */
    public class C14359h extends AbstractMapBasedMultimap<K, V>.C13555b implements SortedMap<K, java.util.Collection<V>> {

        /* renamed from: f */
        public SortedSet<K> f36178f;

        public C14359h(SortedMap<K, java.util.Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* renamed from: b */
        public SortedSet<K> mo42998b() {
            return new C14360i(mo43002d());
        }

        /* renamed from: c */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f36178f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> b = mo42998b();
            this.f36178f = b;
            return b;
        }

        public final Comparator<? super K> comparator() {
            return mo43002d().comparator();
        }

        /* renamed from: d */
        public SortedMap<K, java.util.Collection<V>> mo43002d() {
            return (SortedMap) this.f36161d;
        }

        public final K firstKey() {
            return mo43002d().firstKey();
        }

        public SortedMap<K, java.util.Collection<V>> headMap(K k) {
            return new C14359h(mo43002d().headMap(k));
        }

        public final K lastKey() {
            return mo43002d().lastKey();
        }

        public SortedMap<K, java.util.Collection<V>> subMap(K k, K k2) {
            return new C14359h(mo43002d().subMap(k, k2));
        }

        public SortedMap<K, java.util.Collection<V>> tailMap(K k) {
            return new C14359h(mo43002d().tailMap(k));
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$i */
    public class C14360i extends AbstractMapBasedMultimap<K, V>.C16530d implements SortedSet<K>, p988j$.util.SortedSet {
        public C14360i(SortedMap<K, java.util.Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public final Comparator<? super K> comparator() {
            return mo43031i().comparator();
        }

        public final K first() {
            return mo43031i().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C14360i(mo43031i().headMap(k));
        }

        /* renamed from: i */
        public SortedMap<K, java.util.Collection<V>> mo43031i() {
            return (SortedMap) this.f36278b;
        }

        public final K last() {
            return mo43031i().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C14360i(mo43031i().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new C14360i(mo43031i().tailMap(k));
        }
    }

    public AbstractMapBasedMultimap(TreeMap treeMap) {
        C17884p.m44369h(treeMap.isEmpty());
        this.f36159e = treeMap;
    }

    public final void clear() {
        for (java.util.Collection<V> clear : this.f36159e.values()) {
            clear.clear();
        }
        this.f36159e.clear();
        this.f36160f = 0;
    }

    /* renamed from: f */
    public final java.util.Iterator<V> mo42967f() {
        return new C14349a(this);
    }

    /* renamed from: g */
    public final Spliterator<V> mo42968g() {
        return C14415o.m35875a(Collection.EL.spliterator(this.f36159e.values()), new C14384b(), (long) this.f36160f);
    }

    /* renamed from: h */
    public final java.util.Collection<V> mo42969h() {
        return new C14390e.C14391a();
    }

    public final int size() {
        return this.f36160f;
    }

    public final java.util.Collection<V> values() {
        java.util.Collection<V> collection = this.f36271c;
        if (collection != null) {
            return collection;
        }
        java.util.Collection<V> h = mo42969h();
        this.f36271c = h;
        return h;
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$k */
    public class C14363k extends AbstractMapBasedMultimap<K, V>.j implements List<V>, p988j$.util.List {

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$k$a */
        public class C14364a extends AbstractMapBasedMultimap<K, V>.C5344a implements ListIterator<V> {
            public C14364a() {
                super();
            }

            public final void add(V v) {
                boolean isEmpty = C14363k.this.isEmpty();
                mo43074c().add(v);
                C14363k kVar = C14363k.this;
                AbstractMapBasedMultimap.this.f36160f++;
                if (isEmpty) {
                    kVar.mo43048e();
                }
            }

            /* JADX WARNING: type inference failed for: r1v0, types: [com.google.common.collect.AbstractMapBasedMultimap$j$a, com.google.common.collect.AbstractMapBasedMultimap$k$a] */
            /* renamed from: c */
            public final ListIterator<V> mo43074c() {
                mo43058b();
                return (ListIterator) this.f36186b;
            }

            public final boolean hasPrevious() {
                return mo43074c().hasPrevious();
            }

            public final int nextIndex() {
                return mo43074c().nextIndex();
            }

            public final V previous() {
                return mo43074c().previous();
            }

            public final int previousIndex() {
                return mo43074c().previousIndex();
            }

            public final void set(V v) {
                mo43074c().set(v);
            }

            public C14364a(int i) {
                super(((List) C14363k.this.f36182c).listIterator(i));
            }
        }

        public C14363k(K k, List<V> list, AbstractMapBasedMultimap<K, V>.j jVar) {
            super(k, list, jVar);
        }

        public final void add(int i, V v) {
            mo43050i();
            boolean isEmpty = this.f36182c.isEmpty();
            ((List) this.f36182c).add(i, v);
            AbstractMapBasedMultimap.this.f36160f++;
            if (isEmpty) {
                mo43048e();
            }
        }

        public final boolean addAll(int i, java.util.Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = ((List) this.f36182c).addAll(i, collection);
            if (addAll) {
                int size2 = this.f36182c.size();
                AbstractMapBasedMultimap.this.f36160f += size2 - size;
                if (size == 0) {
                    mo43048e();
                }
            }
            return addAll;
        }

        public final V get(int i) {
            mo43050i();
            return ((List) this.f36182c).get(i);
        }

        public final int indexOf(Object obj) {
            mo43050i();
            return ((List) this.f36182c).indexOf(obj);
        }

        public final int lastIndexOf(Object obj) {
            mo43050i();
            return ((List) this.f36182c).lastIndexOf(obj);
        }

        public final ListIterator<V> listIterator() {
            mo43050i();
            return new C14364a();
        }

        public final V remove(int i) {
            mo43050i();
            V remove = ((List) this.f36182c).remove(i);
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            abstractMapBasedMultimap.f36160f--;
            mo43051m();
            return remove;
        }

        public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
            List.CC.$default$replaceAll(this, unaryOperator);
        }

        public final /* synthetic */ void replaceAll(java.util.function.UnaryOperator unaryOperator) {
            List.CC.$default$replaceAll(this, UnaryOperator.VivifiedWrapper.convert(unaryOperator));
        }

        public final V set(int i, V v) {
            mo43050i();
            return ((java.util.List) this.f36182c).set(i, v);
        }

        public final /* synthetic */ void sort(Comparator comparator) {
            List.CC.$default$sort(this, comparator);
        }

        public final java.util.List<V> subList(int i, int i2) {
            mo43050i();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            K k = this.f36181b;
            java.util.List subList = ((java.util.List) this.f36182c).subList(i, i2);
            AbstractMapBasedMultimap<K, V>.j jVar = this.f36183d;
            if (jVar == null) {
                jVar = this;
            }
            abstractMapBasedMultimap.getClass();
            if (subList instanceof RandomAccess) {
                return new C14358g(abstractMapBasedMultimap, k, subList, jVar);
            }
            return new C14363k(k, subList, jVar);
        }

        public final ListIterator<V> listIterator(int i) {
            mo43050i();
            return new C14364a(i);
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$j */
    public class C14361j extends AbstractCollection<V> implements p988j$.util.Collection {

        /* renamed from: b */
        public final K f36181b;

        /* renamed from: c */
        public java.util.Collection<V> f36182c;

        /* renamed from: d */
        public final AbstractMapBasedMultimap<K, V>.j f36183d;

        /* renamed from: e */
        public final java.util.Collection<V> f36184e;

        public C14361j(K k, java.util.Collection<V> collection, AbstractMapBasedMultimap<K, V>.j jVar) {
            java.util.Collection<V> collection2;
            this.f36181b = k;
            this.f36182c = collection;
            this.f36183d = jVar;
            if (jVar == null) {
                collection2 = null;
            } else {
                collection2 = jVar.f36182c;
            }
            this.f36184e = collection2;
        }

        public final boolean add(V v) {
            mo43050i();
            boolean isEmpty = this.f36182c.isEmpty();
            boolean add = this.f36182c.add(v);
            if (add) {
                AbstractMapBasedMultimap.this.f36160f++;
                if (isEmpty) {
                    mo43048e();
                }
            }
            return add;
        }

        public final boolean addAll(java.util.Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f36182c.addAll(collection);
            if (addAll) {
                int size2 = this.f36182c.size();
                AbstractMapBasedMultimap.this.f36160f += size2 - size;
                if (size == 0) {
                    mo43048e();
                }
            }
            return addAll;
        }

        public final void clear() {
            int size = size();
            if (size != 0) {
                this.f36182c.clear();
                AbstractMapBasedMultimap.this.f36160f -= size;
                mo43051m();
            }
        }

        public final boolean contains(Object obj) {
            mo43050i();
            return this.f36182c.contains(obj);
        }

        public final boolean containsAll(java.util.Collection<?> collection) {
            mo43050i();
            return this.f36182c.containsAll(collection);
        }

        /* renamed from: e */
        public final void mo43048e() {
            AbstractMapBasedMultimap<K, V>.j jVar = this.f36183d;
            if (jVar != null) {
                jVar.mo43048e();
            } else {
                AbstractMapBasedMultimap.this.f36159e.put(this.f36181b, this.f36182c);
            }
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            mo43050i();
            return this.f36182c.equals(obj);
        }

        public final /* synthetic */ void forEach(Consumer consumer) {
            Iterable.CC.$default$forEach(this, consumer);
        }

        public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            Iterable.CC.$default$forEach(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final int hashCode() {
            mo43050i();
            return this.f36182c.hashCode();
        }

        /* renamed from: i */
        public final void mo43050i() {
            java.util.Collection<V> collection;
            AbstractMapBasedMultimap<K, V>.j jVar = this.f36183d;
            if (jVar != null) {
                jVar.mo43050i();
                if (this.f36183d.f36182c != this.f36184e) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f36182c.isEmpty() && (collection = AbstractMapBasedMultimap.this.f36159e.get(this.f36181b)) != null) {
                this.f36182c = collection;
            }
        }

        public final java.util.Iterator<V> iterator() {
            mo43050i();
            return new C14362a();
        }

        /* renamed from: m */
        public final void mo43051m() {
            AbstractMapBasedMultimap<K, V>.j jVar = this.f36183d;
            if (jVar != null) {
                jVar.mo43051m();
            } else if (this.f36182c.isEmpty()) {
                AbstractMapBasedMultimap.this.f36159e.remove(this.f36181b);
            }
        }

        public final boolean remove(Object obj) {
            mo43050i();
            boolean remove = this.f36182c.remove(obj);
            if (remove) {
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.f36160f--;
                mo43051m();
            }
            return remove;
        }

        public final boolean removeAll(java.util.Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f36182c.removeAll(collection);
            if (removeAll) {
                int size2 = this.f36182c.size();
                AbstractMapBasedMultimap.this.f36160f += size2 - size;
                mo43051m();
            }
            return removeAll;
        }

        public final /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
            return Collection.CC.$default$removeIf(this, Predicate.VivifiedWrapper.convert(predicate));
        }

        public final boolean retainAll(java.util.Collection<?> collection) {
            collection.getClass();
            int size = size();
            boolean retainAll = this.f36182c.retainAll(collection);
            if (retainAll) {
                int size2 = this.f36182c.size();
                AbstractMapBasedMultimap.this.f36160f += size2 - size;
                mo43051m();
            }
            return retainAll;
        }

        public final int size() {
            mo43050i();
            return this.f36182c.size();
        }

        public final Spliterator<V> spliterator() {
            mo43050i();
            return Collection.EL.spliterator(this.f36182c);
        }

        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return Collection.CC.$default$toArray(this, intFunction);
        }

        public final /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
            return Collection.CC.$default$toArray(this, IntFunction.VivifiedWrapper.convert(intFunction));
        }

        public final String toString() {
            mo43050i();
            return this.f36182c.toString();
        }

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$j$a */
        public class C14362a implements java.util.Iterator<V>, p988j$.util.Iterator {

            /* renamed from: b */
            public final java.util.Iterator<V> f36186b;

            /* renamed from: c */
            public final java.util.Collection<V> f36187c;

            public C14362a() {
                java.util.Iterator<V> it;
                java.util.Collection<V> collection = C14361j.this.f36182c;
                this.f36187c = collection;
                if (collection instanceof java.util.List) {
                    it = ((java.util.List) collection).listIterator();
                } else {
                    it = collection.iterator();
                }
                this.f36186b = it;
            }

            /* renamed from: b */
            public final void mo43058b() {
                C14361j.this.mo43050i();
                if (C14361j.this.f36182c != this.f36187c) {
                    throw new ConcurrentModificationException();
                }
            }

            public final /* synthetic */ void forEachRemaining(Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
            }

            public final boolean hasNext() {
                mo43058b();
                return this.f36186b.hasNext();
            }

            public final V next() {
                mo43058b();
                return this.f36186b.next();
            }

            public final void remove() {
                this.f36186b.remove();
                C14361j jVar = C14361j.this;
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.f36160f--;
                jVar.mo43051m();
            }

            public C14362a(ListIterator listIterator) {
                this.f36187c = C14361j.this.f36182c;
                this.f36186b = listIterator;
            }
        }
    }
}
