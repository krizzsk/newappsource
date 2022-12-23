package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import p988j$.lang.Iterable;
import p988j$.util.Collection;
import p988j$.util.Spliterator;
import p988j$.util.Spliterators;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;
import p988j$.util.function.Predicate;

public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable, Collection {

    /* renamed from: b */
    public static final Object[] f36192b = new Object[0];

    /* renamed from: com.google.common.collect.ImmutableCollection$a */
    public static abstract class C14366a<E> {
        /* renamed from: a */
        public static int m35679a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* renamed from: e */
    public ImmutableList<E> mo43098e() {
        int size = size();
        if (size == 0) {
            return RegularImmutableList.f36244e;
        }
        if (size != 1) {
            return new RegularImmutableAsList(this, toArray());
        }
        return new SingletonImmutableList(iterator().next());
    }

    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    /* renamed from: i */
    public int mo43100i(int i, Object[] objArr) {
        C14439w0 u = iterator();
        while (u.hasNext()) {
            objArr[i] = u.next();
            i++;
        }
        return i;
    }

    /* renamed from: m */
    public Object[] mo43101m() {
        return null;
    }

    /* renamed from: n */
    public int mo43102n() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: p */
    public int mo43103p() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(java.util.Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeIf(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return removeIf(Predicate.VivifiedWrapper.convert(predicate));
    }

    @Deprecated
    public final boolean retainAll(java.util.Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: s */
    public abstract boolean mo43086s();

    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    public final Object[] toArray() {
        return toArray((T[]) f36192b);
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, intFunction);
    }

    public final /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
        return toArray(IntFunction.VivifiedWrapper.convert(intFunction));
    }

    /* renamed from: u */
    public abstract C14439w0<E> iterator();

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray());
    }

    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        if (tArr.length < size) {
            Object[] m = mo43101m();
            if (m != null) {
                int p = mo43103p();
                int n = mo43102n();
                int i = C14419o0.f36309a;
                return Arrays.copyOfRange(m, p, n, tArr.getClass());
            }
            int i2 = C14419o0.f36309a;
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo43100i(0, tArr);
        return tArr;
    }
}
