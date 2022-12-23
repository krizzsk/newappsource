package rh0;

import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.C23816b;
import mf0.C24356b;
import mf0.C24362h;
import mf0.C24369n;
import nf0.C24497a;
import p583jk.C17884p;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: rh0.d */
public final class C24823d<T> extends AbstractSet<T> {

    /* renamed from: d */
    public static final /* synthetic */ int f62765d = 0;

    /* renamed from: b */
    public Object f62766b;

    /* renamed from: c */
    public int f62767c;

    /* renamed from: rh0.d$a */
    public static final class C24824a<T> implements Iterator<T>, C24497a, p988j$.util.Iterator {

        /* renamed from: b */
        public final C24356b f62768b;

        public C24824a(T[] tArr) {
            this.f62768b = C17884p.m44341L(tArr);
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f62768b.hasNext();
        }

        public final T next() {
            return this.f62768b.next();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: rh0.d$b */
    public static final class C24825b<T> implements java.util.Iterator<T>, C24497a, p988j$.util.Iterator {

        /* renamed from: b */
        public final T f62769b;

        /* renamed from: c */
        public boolean f62770c = true;

        public C24825b(T t) {
            this.f62769b = t;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f62770c;
        }

        public final T next() {
            if (this.f62770c) {
                this.f62770c = false;
                return this.f62769b;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [java.util.HashSet, java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean add(T r5) {
        /*
            r4 = this;
            int r0 = r4.f62767c
            r1 = 1
            if (r0 != 0) goto L_0x0009
            r4.f62766b = r5
            goto L_0x007d
        L_0x0009:
            r2 = 0
            if (r0 != r1) goto L_0x0021
            java.lang.Object r0 = r4.f62766b
            boolean r0 = mf0.C24362h.m61206a(r0, r5)
            if (r0 == 0) goto L_0x0015
            return r2
        L_0x0015:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r3 = r4.f62766b
            r0[r2] = r3
            r0[r1] = r5
            r4.f62766b = r0
            goto L_0x007d
        L_0x0021:
            r3 = 5
            if (r0 >= r3) goto L_0x006e
            java.lang.Object r0 = r4.f62766b
            if (r0 == 0) goto L_0x0066
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            boolean r3 = kotlin.collections.C23816b.m58437S0(r0, r5)
            if (r3 == 0) goto L_0x0031
            return r2
        L_0x0031:
            int r2 = r4.f62767c
            r3 = 4
            if (r2 != r3) goto L_0x0053
            int r2 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r2 = "elements"
            mf0.C24362h.m61211f(r0, r2)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            int r3 = r0.length
            int r3 = p389bl.C13637c.m34083z(r3)
            r2.<init>(r3)
            kotlin.collections.C23816b.m58450f1(r2, r0)
            r2.add(r5)
            bf0.d r5 = bf0.C21050d.f52856a
            goto L_0x0063
        L_0x0053:
            int r2 = r2 + r1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r0 = "copyOf(this, newSize)"
            mf0.C24362h.m61210e(r2, r0)
            int r0 = r2.length
            int r0 = r0 - r1
            r2[r0] = r5
            bf0.d r5 = bf0.C21050d.f52856a
        L_0x0063:
            r4.f62766b = r2
            goto L_0x007d
        L_0x0066:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"
            r5.<init>(r0)
            throw r5
        L_0x006e:
            java.lang.Object r0 = r4.f62766b
            if (r0 == 0) goto L_0x0083
            java.util.Set r0 = mf0.C24369n.m61245a(r0)
            boolean r5 = r0.add(r5)
            if (r5 != 0) goto L_0x007d
            return r2
        L_0x007d:
            int r5 = r4.f62767c
            int r5 = r5 + r1
            r4.f62767c = r5
            return r1
        L_0x0083:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rh0.C24823d.add(java.lang.Object):boolean");
    }

    public final void clear() {
        this.f62766b = null;
        this.f62767c = 0;
    }

    public final boolean contains(Object obj) {
        int i = this.f62767c;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return C24362h.m61206a(this.f62766b, obj);
        }
        if (i < 5) {
            Object obj2 = this.f62766b;
            if (obj2 != null) {
                return C23816b.m58437S0((Object[]) obj2, obj);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
        }
        Object obj3 = this.f62766b;
        if (obj3 != null) {
            return ((Set) obj3).contains(obj);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
    }

    public final java.util.Iterator<T> iterator() {
        int i = this.f62767c;
        if (i == 0) {
            return Collections.emptySet().iterator();
        }
        if (i == 1) {
            return new C24825b(this.f62766b);
        }
        if (i < 5) {
            Object obj = this.f62766b;
            if (obj != null) {
                return new C24824a((Object[]) obj);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
        }
        Object obj2 = this.f62766b;
        if (obj2 != null) {
            return C24369n.m61245a(obj2).iterator();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
    }

    public final int size() {
        return this.f62767c;
    }
}
