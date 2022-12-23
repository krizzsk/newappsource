package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import p988j$.lang.Iterable;
import p988j$.util.Collection;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;
import p988j$.util.function.Predicate;

/* renamed from: com.google.common.collect.u0 */
public final class C14433u0 {

    /* renamed from: com.google.common.collect.u0$a */
    public static abstract class C14434a<E> extends AbstractSet<E> {
        public boolean removeAll(Collection<?> collection) {
            collection.getClass();
            if (collection instanceof C14412m0) {
                collection = ((C14412m0) collection).mo43225Y0();
            }
            boolean z = false;
            if (!(collection instanceof Set) || collection.size() <= size()) {
                for (Object remove : collection) {
                    z |= remove(remove);
                }
            } else {
                Iterator it = iterator();
                while (it.hasNext()) {
                    if (collection.contains(it.next())) {
                        it.remove();
                        z = true;
                    }
                }
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            return super.retainAll(collection);
        }
    }

    /* renamed from: com.google.common.collect.u0$b */
    public static abstract class C14435b<E> extends AbstractSet<E> implements p988j$.util.Set {
        @Deprecated
        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        public final /* synthetic */ void forEach(Consumer consumer) {
            Iterable.CC.$default$forEach(this, consumer);
        }

        public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            Iterable.CC.$default$forEach(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean removeIf(Predicate predicate) {
            Predicate.VivifiedWrapper.convert(predicate);
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return Collection.CC.$default$toArray(this, intFunction);
        }

        public final /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
            return Collection.CC.$default$toArray(this, IntFunction.VivifiedWrapper.convert(intFunction));
        }

        @Deprecated
        public final boolean removeIf(p988j$.util.function.Predicate<? super E> predicate) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public static int m35897a(Set<?> set) {
        int i;
        int i2 = 0;
        for (Object next : set) {
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 = ~(~(i2 + i));
        }
        return i2;
    }

    /* renamed from: b */
    public static C14431t0 m35898b(ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        if (immutableSet == null) {
            throw new NullPointerException("set1");
        } else if (immutableSet2 != null) {
            return new C14431t0(immutableSet, immutableSet2);
        } else {
            throw new NullPointerException("set2");
        }
    }
}
