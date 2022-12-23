package com.google.common.collect;

import ce0.C21100e;
import com.google.common.collect.ImmutableCollection;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import p583jk.C17884p;
import p584jl.C17885a;
import p671nd.C18538a;

public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E>, p988j$.util.Set {

    /* renamed from: c */
    public static final /* synthetic */ int f36222c = 0;

    public static abstract class CachingAsList<E> extends ImmutableSet<E> {

        /* renamed from: d */
        public transient ImmutableList<E> f36223d;

        /* renamed from: G */
        public ImmutableList<E> mo43157G() {
            return new RegularImmutableAsList(this, toArray());
        }

        /* renamed from: e */
        public final ImmutableList<E> mo43098e() {
            ImmutableList<E> immutableList = this.f36223d;
            if (immutableList != null) {
                return immutableList;
            }
            ImmutableList<E> G = mo43157G();
            this.f36223d = G;
            return G;
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }
    }

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.m35758D(this.elements);
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSet$a */
    public static final class C14375a<E> extends C14377c<E> {

        /* renamed from: c */
        public final HashSet f36224c;

        public C14375a(C14377c<E> cVar) {
            super(cVar);
            int i;
            int i2 = this.f36230b;
            if (i2 < 3) {
                C17885a.m44456q(i2, "expectedSize");
                i = i2 + 1;
            } else if (i2 < 1073741824) {
                i = (int) ((((float) i2) / 0.75f) + 1.0f);
            } else {
                i = Integer.MAX_VALUE;
            }
            this.f36224c = new HashSet(i);
            for (int i3 = 0; i3 < this.f36230b; i3++) {
                HashSet hashSet = this.f36224c;
                E e = this.f36229a[i3];
                Objects.requireNonNull(e);
                hashSet.add(e);
            }
        }

        /* renamed from: a */
        public final C14377c<E> mo43164a(E e) {
            e.getClass();
            if (this.f36224c.add(e)) {
                mo43169b(e);
            }
            return this;
        }

        /* renamed from: c */
        public final ImmutableSet<E> mo43165c() {
            int i = this.f36230b;
            if (i == 0) {
                int i2 = ImmutableSet.f36222c;
                return RegularImmutableSet.f36251j;
            } else if (i != 1) {
                return new JdkBackedImmutableSet(this.f36224c, ImmutableList.m35690x(this.f36230b, this.f36229a));
            } else {
                E e = this.f36229a[0];
                Objects.requireNonNull(e);
                int i3 = ImmutableSet.f36222c;
                return new SingletonImmutableSet(e);
            }
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSet$b */
    public static final class C14376b<E> extends C14377c<E> {

        /* renamed from: c */
        public Object[] f36225c = null;

        /* renamed from: d */
        public int f36226d = 0;

        /* renamed from: e */
        public int f36227e = 0;

        /* renamed from: f */
        public int f36228f;

        public C14376b(int i) {
            super(i);
        }

        /* renamed from: g */
        public static int m35767g(int i) {
            int i2;
            boolean z;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (i > 0) {
                boolean z2 = true;
                switch (C18538a.f47200a[roundingMode.ordinal()]) {
                    case 1:
                        if (i > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (((i - 1) & i) != 0) {
                            z2 = false;
                        }
                        if (!z || !z2) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                        break;
                    case 2:
                    case 3:
                        break;
                    case 4:
                    case 5:
                        i2 = 32 - Integer.numberOfLeadingZeros(i - 1);
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                        i2 = (31 - numberOfLeadingZeros) + ((~(~((-1257966797 >>> numberOfLeadingZeros) - i))) >>> 31);
                        break;
                    default:
                        throw new AssertionError();
                }
                i2 = 31 - Integer.numberOfLeadingZeros(i);
                return i2 * 13;
            }
            StringBuilder sb = new StringBuilder(27);
            sb.append("x");
            sb.append(" (");
            sb.append(i);
            sb.append(") must be > 0");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: h */
        public static Object[] m35768h(int i, int i2, Object[] objArr) {
            int i3;
            Object[] objArr2 = new Object[i];
            int i4 = i - 1;
            for (int i5 = 0; i5 < i2; i5++) {
                Object obj = objArr[i5];
                Objects.requireNonNull(obj);
                int C0 = C21100e.m49301C0(obj.hashCode());
                while (true) {
                    i3 = C0 & i4;
                    if (objArr2[i3] == null) {
                        break;
                    }
                    C0++;
                }
                objArr2[i3] = obj;
            }
            return objArr2;
        }

        /* renamed from: a */
        public final C14377c<E> mo43164a(E e) {
            e.getClass();
            if (this.f36225c != null) {
                return mo43168f(e);
            }
            if (this.f36230b == 0) {
                mo43169b(e);
                return this;
            }
            mo43167e(this.f36229a.length);
            this.f36230b--;
            return mo43168f(this.f36229a[0]).mo43164a(e);
        }

        /* renamed from: c */
        public final ImmutableSet<E> mo43165c() {
            int i = this.f36230b;
            if (i == 0) {
                int i2 = ImmutableSet.f36222c;
                return RegularImmutableSet.f36251j;
            } else if (i != 1) {
                E[] eArr = this.f36229a;
                if (i != eArr.length) {
                    eArr = Arrays.copyOf(eArr, i);
                }
                int i3 = this.f36228f;
                Object[] objArr = this.f36225c;
                Objects.requireNonNull(objArr);
                return new RegularImmutableSet(i3, this.f36225c.length - 1, eArr, objArr);
            } else {
                E e = this.f36229a[0];
                Objects.requireNonNull(e);
                int i4 = ImmutableSet.f36222c;
                return new SingletonImmutableSet(e);
            }
        }

        /* renamed from: d */
        public final C14377c<E> mo43166d() {
            if (this.f36225c == null) {
                return this;
            }
            int x = ImmutableSet.m35760x(this.f36230b);
            if (x * 2 < this.f36225c.length) {
                this.f36225c = m35768h(x, this.f36230b, this.f36229a);
                this.f36226d = m35767g(x);
                this.f36227e = (int) (((double) x) * 0.7d);
            }
            Object[] objArr = this.f36225c;
            int g = m35767g(objArr.length);
            boolean z = true;
            int length = objArr.length - 1;
            int i = 0;
            int i2 = 0;
            loop0:
            while (true) {
                if (i >= objArr.length) {
                    z = false;
                    break;
                } else if (i != i2 || objArr[i] != null) {
                    int i3 = i + g;
                    int i4 = i3 - 1;
                    while (i4 >= i2) {
                        if (objArr[i4 & length] == null) {
                            i2 = i3;
                            i = i4 + 1;
                        } else {
                            i4--;
                        }
                    }
                    break loop0;
                } else {
                    i2 = i + g;
                    if (objArr[(i2 - 1) & length] != null) {
                        i2 = i + 1;
                    }
                    i = i2;
                }
            }
            if (z) {
                return new C14375a(this);
            }
            return this;
        }

        /* renamed from: e */
        public final void mo43167e(int i) {
            int i2;
            Object[] objArr = this.f36225c;
            if (objArr == null) {
                i2 = ImmutableSet.m35760x(i);
                this.f36225c = new Object[i2];
            } else if (i > this.f36227e && objArr.length < 1073741824) {
                i2 = objArr.length * 2;
                this.f36225c = m35768h(i2, this.f36230b, this.f36229a);
            } else {
                return;
            }
            this.f36226d = m35767g(i2);
            this.f36227e = (int) (((double) i2) * 0.7d);
        }

        /* renamed from: f */
        public final C14377c<E> mo43168f(E e) {
            Objects.requireNonNull(this.f36225c);
            int hashCode = e.hashCode();
            int C0 = C21100e.m49301C0(hashCode);
            int length = this.f36225c.length - 1;
            int i = C0;
            while (i - C0 < this.f36226d) {
                int i2 = i & length;
                Object obj = this.f36225c[i2];
                if (obj == null) {
                    mo43169b(e);
                    this.f36225c[i2] = e;
                    this.f36228f += hashCode;
                    mo43167e(this.f36230b);
                    return this;
                } else if (obj.equals(e)) {
                    return this;
                } else {
                    i++;
                }
            }
            C14375a aVar = new C14375a(this);
            aVar.mo43164a(e);
            return aVar;
        }
    }

    /* renamed from: B */
    public static <E> ImmutableSet<E> m35756B(int i, Object... objArr) {
        boolean z;
        int i2;
        RoundingMode roundingMode = RoundingMode.CEILING;
        if (i >= 0) {
            int sqrt = (int) Math.sqrt((double) i);
            switch (C18538a.f47200a[roundingMode.ordinal()]) {
                case 1:
                    if (sqrt * sqrt == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    }
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                    i2 = sqrt * sqrt;
                    break;
                case 6:
                case 7:
                case 8:
                    i2 = (sqrt * sqrt) + sqrt;
                    break;
                default:
                    throw new AssertionError();
            }
            sqrt += (~(~(i2 - i))) >>> 31;
            return m35761z(i, Math.max(4, sqrt), objArr);
        }
        StringBuilder sb = new StringBuilder(28);
        sb.append("x");
        sb.append(" (");
        sb.append(i);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: C */
    public static ImmutableSet m35757C(Set set) {
        if ((set instanceof ImmutableSet) && !(set instanceof SortedSet)) {
            ImmutableSet immutableSet = (ImmutableSet) set;
            if (!immutableSet.mo43086s()) {
                return immutableSet;
            }
        } else if (set instanceof EnumSet) {
            EnumSet copyOf = EnumSet.copyOf((EnumSet) set);
            int size = copyOf.size();
            if (size == 0) {
                return RegularImmutableSet.f36251j;
            }
            if (size != 1) {
                return new ImmutableEnumSet(copyOf);
            }
            return new SingletonImmutableSet(C17885a.m44428Y(copyOf));
        }
        Object[] array = set.toArray();
        return m35761z(array.length, array.length, array);
    }

    /* renamed from: D */
    public static <E> ImmutableSet<E> m35758D(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return RegularImmutableSet.f36251j;
        }
        if (length != 1) {
            return m35756B(eArr.length, (Object[]) eArr.clone());
        }
        return new SingletonImmutableSet(eArr[0]);
    }

    /* renamed from: F */
    public static ImmutableSet m35759F(String str, String str2, String str3) {
        return m35761z(3, 3, str, str2, str3);
    }

    /* renamed from: x */
    public static int m35760x(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        C17884p.m44370i(z, "collection too large");
        return 1073741824;
    }

    /* renamed from: z */
    public static <E> ImmutableSet<E> m35761z(int i, int i2, Object... objArr) {
        if (i == 0) {
            return RegularImmutableSet.f36251j;
        }
        if (i == 1) {
            return new SingletonImmutableSet(objArr[0]);
        }
        C14377c bVar = new C14376b(i2);
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            obj.getClass();
            bVar = bVar.mo43164a(obj);
        }
        return bVar.mo43166d().mo43165c();
    }

    /* renamed from: E */
    public boolean mo43155E() {
        return this instanceof ImmutableEnumSet;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && mo43155E() && ((ImmutableSet) obj).mo43155E() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() != set.size() || !containsAll(set)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        return C14433u0.m35897a(this);
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    /* renamed from: com.google.common.collect.ImmutableSet$c */
    public static abstract class C14377c<E> {

        /* renamed from: a */
        public E[] f36229a;

        /* renamed from: b */
        public int f36230b;

        public C14377c(int i) {
            this.f36229a = new Object[i];
            this.f36230b = 0;
        }

        /* renamed from: a */
        public abstract C14377c<E> mo43164a(E e);

        /* renamed from: b */
        public final void mo43169b(E e) {
            int i = this.f36230b + 1;
            E[] eArr = this.f36229a;
            if (i > eArr.length) {
                this.f36229a = Arrays.copyOf(this.f36229a, ImmutableCollection.C14366a.m35679a(eArr.length, i));
            }
            E[] eArr2 = this.f36229a;
            int i2 = this.f36230b;
            this.f36230b = i2 + 1;
            eArr2[i2] = e;
        }

        /* renamed from: c */
        public abstract ImmutableSet<E> mo43165c();

        /* renamed from: d */
        public C14377c<E> mo43166d() {
            return this;
        }

        public C14377c(C14377c<E> cVar) {
            E[] eArr = cVar.f36229a;
            this.f36229a = Arrays.copyOf(eArr, eArr.length);
            this.f36230b = cVar.f36230b;
        }
    }
}
