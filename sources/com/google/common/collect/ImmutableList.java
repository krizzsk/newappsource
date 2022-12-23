package com.google.common.collect;

import ce0.C21100e;
import com.google.common.collect.ImmutableCollection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
import p583jk.C17884p;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;
import p988j$.util.function.UnaryOperator;

public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess, p988j$.util.List {

    /* renamed from: c */
    public static final /* synthetic */ int f36196c = 0;

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableList.m35686B(this.elements);
        }
    }

    public class SubList extends ImmutableList<E> {

        /* renamed from: d */
        public final transient int f36197d;

        /* renamed from: e */
        public final transient int f36198e;

        public SubList(int i, int i2) {
            this.f36197d = i;
            this.f36198e = i2;
        }

        /* renamed from: G */
        public final ImmutableList<E> subList(int i, int i2) {
            C17884p.m44375o(i, i2, this.f36198e);
            ImmutableList immutableList = ImmutableList.this;
            int i3 = this.f36197d;
            return immutableList.subList(i + i3, i2 + i3);
        }

        public final E get(int i) {
            C17884p.m44371j(i, this.f36198e);
            return ImmutableList.this.get(i + this.f36197d);
        }

        public final Iterator iterator() {
            return listIterator(0);
        }

        public final ListIterator listIterator() {
            return listIterator(0);
        }

        /* renamed from: s */
        public final boolean mo43086s() {
            return true;
        }

        public final int size() {
            return this.f36198e;
        }

        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }

    /* renamed from: com.google.common.collect.ImmutableList$a */
    public static final class C14367a<E> extends ImmutableCollection.C14366a<E> {

        /* renamed from: a */
        public Object[] f36199a = new Object[4];

        /* renamed from: b */
        public int f36200b = 0;

        /* renamed from: c */
        public boolean f36201c;

        /* renamed from: b */
        public final void mo43128b(Object obj) {
            obj.getClass();
            int i = this.f36200b + 1;
            Object[] objArr = this.f36199a;
            if (objArr.length < i) {
                this.f36199a = Arrays.copyOf(objArr, ImmutableCollection.C14366a.m35679a(objArr.length, i));
                this.f36201c = false;
            } else if (this.f36201c) {
                this.f36199a = Arrays.copyOf(objArr, objArr.length);
                this.f36201c = false;
            }
            Object[] objArr2 = this.f36199a;
            int i2 = this.f36200b;
            this.f36200b = i2 + 1;
            objArr2[i2] = obj;
        }

        /* renamed from: c */
        public final ImmutableList<E> mo43129c() {
            this.f36201c = true;
            return ImmutableList.m35690x(this.f36200b, this.f36199a);
        }
    }

    /* renamed from: B */
    public static <E> ImmutableList<E> m35686B(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return RegularImmutableList.f36244e;
        }
        if (length == 1) {
            return new SingletonImmutableList(eArr[0]);
        }
        Object[] objArr = (Object[]) eArr.clone();
        C21100e.m49350l(objArr);
        return m35690x(objArr.length, objArr);
    }

    /* renamed from: D */
    public static <E> ImmutableList<E> m35687D() {
        return RegularImmutableList.f36244e;
    }

    /* renamed from: E */
    public static ImmutableList m35688E(Serializable serializable) {
        return new SingletonImmutableList(serializable);
    }

    /* renamed from: F */
    public static ImmutableList m35689F(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        C21100e.m49350l(objArr);
        return m35690x(5, objArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: x */
    public static ImmutableList m35690x(int i, Object[] objArr) {
        if (i == 0) {
            return RegularImmutableList.f36244e;
        }
        if (i != 1) {
            if (i < objArr.length) {
                objArr = Arrays.copyOf(objArr, i);
            }
            return new RegularImmutableList(objArr);
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        return new SingletonImmutableList(obj);
    }

    /* renamed from: z */
    public static <E> ImmutableList<E> m35691z(Collection<? extends E> collection) {
        if (collection instanceof ImmutableCollection) {
            ImmutableList<E> e = ((ImmutableCollection) collection).mo43098e();
            if (!e.mo43086s()) {
                return e;
            }
            Object[] array = e.toArray();
            return m35690x(array.length, array);
        }
        Object[] array2 = collection.toArray();
        C21100e.m49350l(array2);
        return m35690x(array2.length, array2);
    }

    /* renamed from: C */
    public C14382a listIterator(int i) {
        return new C14426r(this, size(), i);
    }

    /* renamed from: G */
    public ImmutableList<E> subList(int i, int i2) {
        C17884p.m44375o(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return RegularImmutableList.f36244e;
        }
        if (i3 == 1) {
            return new SingletonImmutableList(get(i));
        }
        return new SubList(i, i3);
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Deprecated
    /* renamed from: e */
    public final ImmutableList<E> mo43098e() {
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            if (r7 != r6) goto L_0x0006
        L_0x0004:
            r0 = 1
            goto L_0x005b
        L_0x0006:
            boolean r2 = r7 instanceof java.util.List
            if (r2 != 0) goto L_0x000b
            goto L_0x005b
        L_0x000b:
            java.util.List r7 = (java.util.List) r7
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0018
            goto L_0x005b
        L_0x0018:
            boolean r3 = r7 instanceof java.util.RandomAccess
            if (r3 == 0) goto L_0x0031
            r3 = 0
        L_0x001d:
            if (r3 >= r2) goto L_0x0004
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = p583jk.C17875h.m44312w(r4, r5)
            if (r4 != 0) goto L_0x002e
            goto L_0x005b
        L_0x002e:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x0031:
            java.util.Iterator r2 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x0039:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0055
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L_0x0046
            goto L_0x005b
        L_0x0046:
            java.lang.Object r3 = r2.next()
            java.lang.Object r4 = r7.next()
            boolean r3 = p583jk.C17875h.m44312w(r3, r4)
            if (r3 != 0) goto L_0x0039
            goto L_0x005b
        L_0x0055:
            boolean r7 = r7.hasNext()
            r0 = r7 ^ 1
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableList.equals(java.lang.Object):boolean");
    }

    public void forEach(Consumer<? super E> consumer) {
        consumer.getClass();
        int size = size();
        for (int i = 0; i < size; i++) {
            consumer.accept(get(i));
        }
    }

    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    /* renamed from: i */
    public int mo43100i(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void replaceAll(UnaryOperator<E> unaryOperator) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        replaceAll(UnaryOperator.VivifiedWrapper.convert(unaryOperator));
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void sort(Comparator<? super E> comparator) {
        throw new UnsupportedOperationException();
    }

    public Spliterator<E> spliterator() {
        return C14415o.m35876b(size(), 1296, new C14424q(this));
    }

    /* renamed from: u */
    public C14439w0<E> iterator() {
        return listIterator(0);
    }

    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
