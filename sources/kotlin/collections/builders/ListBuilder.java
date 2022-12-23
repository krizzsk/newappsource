package kotlin.collections.builders;

import cf0.C21123a;
import cf0.C21128b;
import cf0.C21132f;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import mf0.C24362h;
import nf0.C24497a;
import p584jl.C17885a;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0001\u0019B\t\b\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\t\u001a\u00020\bH\u0002R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u001a"}, mo59060d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lcf0/b;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "array", "[Ljava/lang/Object;", "", "offset", "I", "length", "", "isReadOnly", "Z", "backing", "Lkotlin/collections/builders/ListBuilder;", "root", "<init>", "()V", "a", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class ListBuilder<E> extends C21128b<E> implements RandomAccess, Serializable {
    /* access modifiers changed from: private */
    public E[] array;
    private final ListBuilder<E> backing;
    private boolean isReadOnly;
    /* access modifiers changed from: private */
    public int length;
    /* access modifiers changed from: private */
    public int offset;
    private final ListBuilder<E> root;

    /* renamed from: kotlin.collections.builders.ListBuilder$a */
    public static final class C23818a<E> implements ListIterator<E>, C24497a, Iterator {

        /* renamed from: b */
        public final ListBuilder<E> f60180b;

        /* renamed from: c */
        public int f60181c;

        /* renamed from: d */
        public int f60182d = -1;

        public C23818a(ListBuilder<E> listBuilder, int i) {
            C24362h.m61211f(listBuilder, "list");
            this.f60180b = listBuilder;
            this.f60181c = i;
        }

        public final void add(E e) {
            ListBuilder<E> listBuilder = this.f60180b;
            int i = this.f60181c;
            this.f60181c = i + 1;
            listBuilder.add(i, e);
            this.f60182d = -1;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f60181c < this.f60180b.length;
        }

        public final boolean hasPrevious() {
            return this.f60181c > 0;
        }

        public final E next() {
            if (this.f60181c < this.f60180b.length) {
                int i = this.f60181c;
                this.f60181c = i + 1;
                this.f60182d = i;
                return this.f60180b.array[this.f60180b.offset + this.f60182d];
            }
            throw new NoSuchElementException();
        }

        public final int nextIndex() {
            return this.f60181c;
        }

        public final E previous() {
            int i = this.f60181c;
            if (i > 0) {
                int i2 = i - 1;
                this.f60181c = i2;
                this.f60182d = i2;
                return this.f60180b.array[this.f60180b.offset + this.f60182d];
            }
            throw new NoSuchElementException();
        }

        public final int previousIndex() {
            return this.f60181c - 1;
        }

        public final void remove() {
            boolean z;
            int i = this.f60182d;
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f60180b.mo53353i(i);
                this.f60181c = this.f60182d;
                this.f60182d = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        public final void set(E e) {
            boolean z;
            int i = this.f60182d;
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f60180b.set(i, e);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    public ListBuilder(E[] eArr, int i, int i2, boolean z, ListBuilder<E> listBuilder, ListBuilder<E> listBuilder2) {
        this.array = eArr;
        this.offset = i;
        this.length = i2;
        this.isReadOnly = z;
        this.backing = listBuilder;
        this.root = listBuilder2;
    }

    private final Object writeReplace() {
        boolean z;
        ListBuilder<E> listBuilder;
        if (this.isReadOnly || ((listBuilder = this.root) != null && listBuilder.isReadOnly)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new SerializedCollection(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    /* renamed from: B */
    public final void mo59163B() {
        boolean z;
        ListBuilder<E> listBuilder;
        if (this.isReadOnly || ((listBuilder = this.root) != null && listBuilder.isReadOnly)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: C */
    public final void mo59164C(int i, int i2) {
        int i3 = this.length + i2;
        if (this.backing != null) {
            throw new IllegalStateException();
        } else if (i3 >= 0) {
            E[] eArr = this.array;
            if (i3 > eArr.length) {
                int length2 = eArr.length;
                int i4 = length2 + (length2 >> 1);
                if (i4 - i3 < 0) {
                    i4 = i3;
                }
                if (i4 - 2147483639 > 0) {
                    if (i3 > 2147483639) {
                        i4 = Integer.MAX_VALUE;
                    } else {
                        i4 = 2147483639;
                    }
                }
                E[] copyOf = Arrays.copyOf(eArr, i4);
                C24362h.m61210e(copyOf, "copyOf(this, newSize)");
                this.array = copyOf;
            }
            E[] eArr2 = this.array;
            C21132f.m49430M0(eArr2, i + i2, eArr2, i, this.offset + this.length);
            this.length += i2;
        } else {
            throw new OutOfMemoryError();
        }
    }

    /* renamed from: D */
    public final E mo59165D(int i) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            this.length--;
            return listBuilder.mo59165D(i);
        }
        E[] eArr = this.array;
        E e = eArr[i];
        C21132f.m49430M0(eArr, i, eArr, i + 1, this.offset + this.length);
        E[] eArr2 = this.array;
        C24362h.m61211f(eArr2, "<this>");
        eArr2[(this.offset + this.length) - 1] = null;
        this.length--;
        return e;
    }

    /* renamed from: E */
    public final void mo59166E(int i, int i2) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.mo59166E(i, i2);
        } else {
            E[] eArr = this.array;
            C21132f.m49430M0(eArr, i, eArr, i + i2, this.length);
            E[] eArr2 = this.array;
            int i3 = this.length;
            C17885a.m44455p0(i3 - i2, i3, eArr2);
        }
        this.length -= i2;
    }

    /* renamed from: F */
    public final int mo59167F(int i, int i2, Collection<? extends E> collection, boolean z) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            int F = listBuilder.mo59167F(i, i2, collection, z);
            this.length -= F;
            return F;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.array[i5]) == z) {
                E[] eArr = this.array;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.array;
        C21132f.m49430M0(eArr2, i + i4, eArr2, i2 + i, this.length);
        E[] eArr3 = this.array;
        int i7 = this.length;
        C17885a.m44455p0(i7 - i6, i7, eArr3);
        this.length -= i6;
        return i6;
    }

    public final boolean add(E e) {
        mo59163B();
        mo59191x(this.offset + this.length, e);
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        C24362h.m61211f(collection, "elements");
        mo59163B();
        int size = collection.size();
        mo59190u(this.offset + this.length, collection, size);
        return size > 0;
    }

    public final void clear() {
        mo59163B();
        mo59166E(this.offset, this.length);
    }

    /* renamed from: e */
    public final int mo53352e() {
        return this.length;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            if (r9 == r8) goto L_0x0030
            boolean r2 = r9 instanceof java.util.List
            if (r2 == 0) goto L_0x0031
            java.util.List r9 = (java.util.List) r9
            E[] r2 = r8.array
            int r3 = r8.offset
            int r4 = r8.length
            int r5 = r9.size()
            if (r4 == r5) goto L_0x0017
            goto L_0x0028
        L_0x0017:
            r5 = 0
        L_0x0018:
            if (r5 >= r4) goto L_0x002d
            int r6 = r3 + r5
            r6 = r2[r6]
            java.lang.Object r7 = r9.get(r5)
            boolean r6 = mf0.C24362h.m61206a(r6, r7)
            if (r6 != 0) goto L_0x002a
        L_0x0028:
            r9 = 0
            goto L_0x002e
        L_0x002a:
            int r5 = r5 + 1
            goto L_0x0018
        L_0x002d:
            r9 = 1
        L_0x002e:
            if (r9 == 0) goto L_0x0031
        L_0x0030:
            r0 = 1
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.ListBuilder.equals(java.lang.Object):boolean");
    }

    public final E get(int i) {
        int i2 = this.length;
        if (i >= 0 && i < i2) {
            return this.array[this.offset + i];
        }
        throw new IndexOutOfBoundsException(C13715c.m34244j("index: ", i, ", size: ", i2));
    }

    public final int hashCode() {
        int i;
        E[] eArr = this.array;
        int i2 = this.offset;
        int i3 = this.length;
        int i4 = 1;
        for (int i5 = 0; i5 < i3; i5++) {
            E e = eArr[i2 + i5];
            int i6 = i4 * 31;
            if (e != null) {
                i = e.hashCode();
            } else {
                i = 0;
            }
            i4 = i6 + i;
        }
        return i4;
    }

    /* renamed from: i */
    public final E mo53353i(int i) {
        mo59163B();
        int i2 = this.length;
        if (i >= 0 && i < i2) {
            return mo59165D(this.offset + i);
        }
        throw new IndexOutOfBoundsException(C13715c.m34244j("index: ", i, ", size: ", i2));
    }

    public final int indexOf(Object obj) {
        for (int i = 0; i < this.length; i++) {
            if (C24362h.m61206a(this.array[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.length == 0;
    }

    public final java.util.Iterator<E> iterator() {
        return new C23818a(this, 0);
    }

    public final int lastIndexOf(Object obj) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (C24362h.m61206a(this.array[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public final ListIterator<E> listIterator() {
        return new C23818a(this, 0);
    }

    public final boolean remove(Object obj) {
        mo59163B();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            mo53353i(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        C24362h.m61211f(collection, "elements");
        mo59163B();
        if (mo59167F(this.offset, this.length, collection, false) > 0) {
            return true;
        }
        return false;
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        C24362h.m61211f(collection, "elements");
        mo59163B();
        if (mo59167F(this.offset, this.length, collection, true) > 0) {
            return true;
        }
        return false;
    }

    public final E set(int i, E e) {
        mo59163B();
        int i2 = this.length;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C13715c.m34244j("index: ", i, ", size: ", i2));
        }
        E[] eArr = this.array;
        int i3 = this.offset;
        E e2 = eArr[i3 + i];
        eArr[i3 + i] = e;
        return e2;
    }

    public final List<E> subList(int i, int i2) {
        ListBuilder<E> listBuilder;
        C21123a.C21124a.m49422a(i, i2, this.length);
        E[] eArr = this.array;
        int i3 = this.offset + i;
        int i4 = i2 - i;
        boolean z = this.isReadOnly;
        ListBuilder<E> listBuilder2 = this.root;
        if (listBuilder2 == null) {
            listBuilder = this;
        } else {
            listBuilder = listBuilder2;
        }
        return new ListBuilder(eArr, i3, i4, z, this, listBuilder);
    }

    public final <T> T[] toArray(T[] tArr) {
        C24362h.m61211f(tArr, "destination");
        int length2 = tArr.length;
        int i = this.length;
        if (length2 < i) {
            E[] eArr = this.array;
            int i2 = this.offset;
            T[] copyOfRange = Arrays.copyOfRange(eArr, i2, i + i2, tArr.getClass());
            C24362h.m61210e(copyOfRange, "copyOfRange(array, offse…h, destination.javaClass)");
            return copyOfRange;
        }
        E[] eArr2 = this.array;
        C24362h.m61209d(eArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.builders.ListBuilder.toArray>");
        int i3 = this.offset;
        C21132f.m49430M0(eArr2, 0, tArr, i3, this.length + i3);
        int length3 = tArr.length;
        int i4 = this.length;
        if (length3 > i4) {
            tArr[i4] = null;
        }
        return tArr;
    }

    public final String toString() {
        E[] eArr = this.array;
        int i = this.offset;
        int i2 = this.length;
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(eArr[i + i3]);
        }
        sb.append("]");
        String sb2 = sb.toString();
        C24362h.m61210e(sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: u */
    public final void mo59190u(int i, Collection<? extends E> collection, int i2) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.mo59190u(i, collection, i2);
            this.array = this.backing.array;
            this.length += i2;
            return;
        }
        mo59164C(i, i2);
        java.util.Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.array[i + i3] = it.next();
        }
    }

    /* renamed from: x */
    public final void mo59191x(int i, E e) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.mo59191x(i, e);
            this.array = this.backing.array;
            this.length++;
            return;
        }
        mo59164C(i, 1);
        this.array[i] = e;
    }

    /* renamed from: z */
    public final void mo59192z() {
        if (this.backing == null) {
            mo59163B();
            this.isReadOnly = true;
            return;
        }
        throw new IllegalStateException();
    }

    public final ListIterator<E> listIterator(int i) {
        int i2 = this.length;
        if (i >= 0 && i <= i2) {
            return new C23818a(this, i);
        }
        throw new IndexOutOfBoundsException(C13715c.m34244j("index: ", i, ", size: ", i2));
    }

    public final void add(int i, E e) {
        mo59163B();
        int i2 = this.length;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C13715c.m34244j("index: ", i, ", size: ", i2));
        }
        mo59191x(this.offset + i, e);
    }

    public final boolean addAll(int i, Collection<? extends E> collection) {
        C24362h.m61211f(collection, "elements");
        mo59163B();
        int i2 = this.length;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C13715c.m34244j("index: ", i, ", size: ", i2));
        }
        int size = collection.size();
        mo59190u(this.offset + i, collection, size);
        return size > 0;
    }

    public final Object[] toArray() {
        E[] eArr = this.array;
        int i = this.offset;
        return C21132f.m49433P0(eArr, i, this.length + i);
    }

    public ListBuilder() {
        this(10);
    }

    public ListBuilder(int i) {
        this(C17885a.m44445k(i), 0, 0, false, (ListBuilder) null, (ListBuilder) null);
    }
}
