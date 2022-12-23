package p241s0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p241s0.C6307g;
import p389bl.C13637c;

/* renamed from: s0.d */
public final class C6304d<E> implements Collection<E>, Set<E> {

    /* renamed from: f */
    public static final int[] f19933f = new int[0];

    /* renamed from: g */
    public static final Object[] f19934g = new Object[0];

    /* renamed from: h */
    public static Object[] f19935h;

    /* renamed from: i */
    public static int f19936i;

    /* renamed from: j */
    public static Object[] f19937j;

    /* renamed from: k */
    public static int f19938k;

    /* renamed from: b */
    public int[] f19939b;

    /* renamed from: c */
    public Object[] f19940c;

    /* renamed from: d */
    public int f19941d;

    /* renamed from: e */
    public C6303c f19942e;

    public C6304d() {
        this(0);
    }

    /* renamed from: e */
    public static void m14926e(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C6304d.class) {
                if (f19938k < 10) {
                    objArr[0] = f19937j;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f19937j = objArr;
                    f19938k++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C6304d.class) {
                if (f19936i < 10) {
                    objArr[0] = f19935h;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f19935h = objArr;
                    f19936i++;
                }
            }
        }
    }

    public final boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = mo22315m();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = mo22311i(hashCode, e);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.f19941d;
        int[] iArr = this.f19939b;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f19940c;
            mo22308d(i5);
            int[] iArr2 = this.f19939b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f19940c, 0, objArr.length);
            }
            m14926e(iArr, objArr, this.f19941d);
        }
        int i6 = this.f19941d;
        if (i3 < i6) {
            int[] iArr3 = this.f19939b;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f19940c;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f19941d - i3);
        }
        this.f19939b[i3] = i;
        this.f19940c[i3] = e;
        this.f19941d++;
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f19941d;
        int[] iArr = this.f19939b;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f19940c;
            mo22308d(size);
            int i = this.f19941d;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f19939b, 0, i);
                System.arraycopy(objArr, 0, this.f19940c, 0, this.f19941d);
            }
            m14926e(iArr, objArr, this.f19941d);
        }
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public final void clear() {
        int i = this.f19941d;
        if (i != 0) {
            m14926e(this.f19939b, this.f19940c, i);
            this.f19939b = f19933f;
            this.f19940c = f19934g;
            this.f19941d = 0;
        }
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final void mo22308d(int i) {
        if (i == 8) {
            synchronized (C6304d.class) {
                Object[] objArr = f19937j;
                if (objArr != null) {
                    this.f19940c = objArr;
                    f19937j = (Object[]) objArr[0];
                    this.f19939b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f19938k--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C6304d.class) {
                Object[] objArr2 = f19935h;
                if (objArr2 != null) {
                    this.f19940c = objArr2;
                    f19935h = (Object[]) objArr2[0];
                    this.f19939b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f19936i--;
                    return;
                }
            }
        }
        this.f19939b = new int[i];
        this.f19940c = new Object[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f19941d != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f19941d) {
                try {
                    if (!set.contains(this.f19940c[i])) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f19939b;
        int i = this.f19941d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    /* renamed from: i */
    public final int mo22311i(int i, Object obj) {
        int i2 = this.f19941d;
        if (i2 == 0) {
            return -1;
        }
        int d = C13637c.m34067d(this.f19939b, i2, i);
        if (d < 0 || obj.equals(this.f19940c[d])) {
            return d;
        }
        int i3 = d + 1;
        while (i3 < i2 && this.f19939b[i3] == i) {
            if (obj.equals(this.f19940c[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = d - 1;
        while (i4 >= 0 && this.f19939b[i4] == i) {
            if (obj.equals(this.f19940c[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public final int indexOf(Object obj) {
        return obj == null ? mo22315m() : mo22311i(obj.hashCode(), obj);
    }

    public final boolean isEmpty() {
        return this.f19941d <= 0;
    }

    public final Iterator<E> iterator() {
        if (this.f19942e == null) {
            this.f19942e = new C6303c(this);
        }
        C6303c cVar = this.f19942e;
        if (cVar.f19949b == null) {
            cVar.f19949b = new C6307g.C6310c();
        }
        return cVar.f19949b.iterator();
    }

    /* renamed from: m */
    public final int mo22315m() {
        int i = this.f19941d;
        if (i == 0) {
            return -1;
        }
        int d = C13637c.m34067d(this.f19939b, i, 0);
        if (d < 0 || this.f19940c[d] == null) {
            return d;
        }
        int i2 = d + 1;
        while (i2 < i && this.f19939b[i2] == 0) {
            if (this.f19940c[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = d - 1;
        while (i3 >= 0 && this.f19939b[i3] == 0) {
            if (this.f19940c[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: n */
    public final void mo22316n(int i) {
        Object[] objArr = this.f19940c;
        Object obj = objArr[i];
        int i2 = this.f19941d;
        if (i2 <= 1) {
            m14926e(this.f19939b, objArr, i2);
            this.f19939b = f19933f;
            this.f19940c = f19934g;
            this.f19941d = 0;
            return;
        }
        int[] iArr = this.f19939b;
        int i3 = 8;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            int i4 = i2 - 1;
            this.f19941d = i4;
            if (i < i4) {
                int i5 = i + 1;
                System.arraycopy(iArr, i5, iArr, i, i4 - i);
                Object[] objArr2 = this.f19940c;
                System.arraycopy(objArr2, i5, objArr2, i, this.f19941d - i);
            }
            this.f19940c[this.f19941d] = null;
            return;
        }
        if (i2 > 8) {
            i3 = i2 + (i2 >> 1);
        }
        mo22308d(i3);
        this.f19941d--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.f19939b, 0, i);
            System.arraycopy(objArr, 0, this.f19940c, 0, i);
        }
        int i6 = this.f19941d;
        if (i < i6) {
            int i7 = i + 1;
            System.arraycopy(iArr, i7, this.f19939b, i, i6 - i);
            System.arraycopy(objArr, i7, this.f19940c, i, this.f19941d - i);
        }
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo22316n(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f19941d - 1; i >= 0; i--) {
            if (!collection.contains(this.f19940c[i])) {
                mo22316n(i);
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        return this.f19941d;
    }

    public final Object[] toArray() {
        int i = this.f19941d;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f19940c, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f19941d * 14);
        sb.append('{');
        for (int i = 0; i < this.f19941d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f19940c[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C6304d(int i) {
        if (i == 0) {
            this.f19939b = f19933f;
            this.f19940c = f19934g;
        } else {
            mo22308d(i);
        }
        this.f19941d = 0;
    }

    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f19941d) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f19941d);
        }
        System.arraycopy(this.f19940c, 0, tArr, 0, this.f19941d);
        int length = tArr.length;
        int i = this.f19941d;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
