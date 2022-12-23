package p241s0;

import java.util.ConcurrentModificationException;
import java.util.Map;
import p389bl.C13637c;

/* renamed from: s0.h */
public class C6313h<K, V> {

    /* renamed from: e */
    public static Object[] f19963e;

    /* renamed from: f */
    public static int f19964f;

    /* renamed from: g */
    public static Object[] f19965g;

    /* renamed from: h */
    public static int f19966h;

    /* renamed from: b */
    public int[] f19967b;

    /* renamed from: c */
    public Object[] f19968c;

    /* renamed from: d */
    public int f19969d;

    public C6313h() {
        this.f19967b = C13637c.f33637d;
        this.f19968c = C13637c.f33639f;
        this.f19969d = 0;
    }

    /* renamed from: a */
    private void m14953a(int i) {
        Class<C6313h> cls = C6313h.class;
        if (i == 8) {
            synchronized (cls) {
                Object[] objArr = f19965g;
                if (objArr != null) {
                    this.f19968c = objArr;
                    f19965g = (Object[]) objArr[0];
                    this.f19967b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f19966h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                Object[] objArr2 = f19963e;
                if (objArr2 != null) {
                    this.f19968c = objArr2;
                    f19963e = (Object[]) objArr2[0];
                    this.f19967b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f19964f--;
                    return;
                }
            }
        }
        this.f19967b = new int[i];
        this.f19968c = new Object[(i << 1)];
    }

    /* renamed from: c */
    public static void m14954c(int[] iArr, Object[] objArr, int i) {
        Class<C6313h> cls = C6313h.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f19966h < 10) {
                    objArr[0] = f19965g;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f19965g = objArr;
                    f19966h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f19964f < 10) {
                    objArr[0] = f19963e;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f19963e = objArr;
                    f19964f++;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo22405b(int i) {
        int i2 = this.f19969d;
        int[] iArr = this.f19967b;
        if (iArr.length < i) {
            Object[] objArr = this.f19968c;
            m14953a(i);
            if (this.f19969d > 0) {
                System.arraycopy(iArr, 0, this.f19967b, 0, i2);
                System.arraycopy(objArr, 0, this.f19968c, 0, i2 << 1);
            }
            m14954c(iArr, objArr, i2);
        }
        if (this.f19969d != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f19969d;
        if (i > 0) {
            int[] iArr = this.f19967b;
            Object[] objArr = this.f19968c;
            this.f19967b = C13637c.f33637d;
            this.f19968c = C13637c.f33639f;
            this.f19969d = 0;
            m14954c(iArr, objArr, i);
        }
        if (this.f19969d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return mo22410e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return mo22413g(obj) >= 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo22409d(int i, Object obj) {
        int i2 = this.f19969d;
        if (i2 == 0) {
            return -1;
        }
        try {
            int d = C13637c.m34067d(this.f19967b, i2, i);
            if (d < 0 || obj.equals(this.f19968c[d << 1])) {
                return d;
            }
            int i3 = d + 1;
            while (i3 < i2 && this.f19967b[i3] == i) {
                if (obj.equals(this.f19968c[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            int i4 = d - 1;
            while (i4 >= 0 && this.f19967b[i4] == i) {
                if (obj.equals(this.f19968c[i4 << 1])) {
                    return i4;
                }
                i4--;
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    public final int mo22410e(Object obj) {
        return obj == null ? mo22412f() : mo22409d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6313h) {
            C6313h hVar = (C6313h) obj;
            if (this.f19969d != hVar.f19969d) {
                return false;
            }
            int i = 0;
            while (i < this.f19969d) {
                try {
                    Object h = mo22416h(i);
                    Object l = mo22422l(i);
                    Object orDefault = hVar.getOrDefault(h, (Object) null);
                    if (l == null) {
                        if (orDefault != null || !hVar.containsKey(h)) {
                            return false;
                        }
                    } else if (!l.equals(orDefault)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f19969d != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f19969d) {
                try {
                    Object h2 = mo22416h(i2);
                    Object l2 = mo22422l(i2);
                    Object obj2 = map.get(h2);
                    if (l2 == null) {
                        if (obj2 != null || !map.containsKey(h2)) {
                            return false;
                        }
                    } else if (!l2.equals(obj2)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int mo22412f() {
        int i = this.f19969d;
        if (i == 0) {
            return -1;
        }
        try {
            int d = C13637c.m34067d(this.f19967b, i, 0);
            if (d < 0 || this.f19968c[d << 1] == null) {
                return d;
            }
            int i2 = d + 1;
            while (i2 < i && this.f19967b[i2] == 0) {
                if (this.f19968c[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            int i3 = d - 1;
            while (i3 >= 0 && this.f19967b[i3] == 0) {
                if (this.f19968c[i3 << 1] == null) {
                    return i3;
                }
                i3--;
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo22413g(Object obj) {
        int i = this.f19969d * 2;
        Object[] objArr = this.f19968c;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public final V getOrDefault(Object obj, V v) {
        int e = mo22410e(obj);
        if (e >= 0) {
            return this.f19968c[(e << 1) + 1];
        }
        return v;
    }

    /* renamed from: h */
    public final K mo22416h(int i) {
        return this.f19968c[i << 1];
    }

    public int hashCode() {
        int i;
        int[] iArr = this.f19967b;
        Object[] objArr = this.f19968c;
        int i2 = this.f19969d;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj == null) {
                i = 0;
            } else {
                i = obj.hashCode();
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    /* renamed from: i */
    public void mo22418i(C6313h<? extends K, ? extends V> hVar) {
        int i = hVar.f19969d;
        mo22405b(this.f19969d + i);
        if (this.f19969d != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(hVar.mo22416h(i2), hVar.mo22422l(i2));
            }
        } else if (i > 0) {
            System.arraycopy(hVar.f19967b, 0, this.f19967b, 0, i);
            System.arraycopy(hVar.f19968c, 0, this.f19968c, 0, i << 1);
            this.f19969d = i;
        }
    }

    public final boolean isEmpty() {
        return this.f19969d <= 0;
    }

    /* renamed from: j */
    public V mo22420j(int i) {
        V[] vArr = this.f19968c;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.f19969d;
        int i4 = 0;
        if (i3 <= 1) {
            m14954c(this.f19967b, vArr, i3);
            this.f19967b = C13637c.f33637d;
            this.f19968c = C13637c.f33639f;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f19967b;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr = this.f19968c;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.f19968c;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                m14953a(i6);
                if (i3 == this.f19969d) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f19967b, 0, i);
                        System.arraycopy(vArr, 0, this.f19968c, 0, i2);
                    }
                    if (i < i5) {
                        int i11 = i + 1;
                        int i12 = i5 - i;
                        System.arraycopy(iArr, i11, this.f19967b, i, i12);
                        System.arraycopy(vArr, i11 << 1, this.f19968c, i2, i12 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f19969d) {
            this.f19969d = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: k */
    public V mo22421k(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f19968c;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: l */
    public final V mo22422l(int i) {
        return this.f19968c[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f19969d;
        if (k == null) {
            i2 = mo22412f();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo22409d(hashCode, k);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f19968c;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        int[] iArr = this.f19967b;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.f19968c;
            m14953a(i6);
            if (i3 == this.f19969d) {
                int[] iArr2 = this.f19967b;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f19968c, 0, objArr.length);
                }
                m14954c(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f19967b;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f19968c;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f19969d - i5) << 1);
        }
        int i8 = this.f19969d;
        if (i3 == i8) {
            int[] iArr4 = this.f19967b;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f19968c;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f19969d = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, (Object) null);
        if (orDefault == null) {
            return put(k, v);
        }
        return orDefault;
    }

    public final V remove(Object obj) {
        int e = mo22410e(obj);
        if (e >= 0) {
            return mo22420j(e);
        }
        return null;
    }

    public final V replace(K k, V v) {
        int e = mo22410e(k);
        if (e >= 0) {
            return mo22421k(e, v);
        }
        return null;
    }

    public final int size() {
        return this.f19969d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f19969d * 28);
        sb.append('{');
        for (int i = 0; i < this.f19969d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object h = mo22416h(i);
            if (h != this) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object l = mo22422l(i);
            if (l != this) {
                sb.append(l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int e = mo22410e(obj);
        if (e < 0) {
            return false;
        }
        Object l = mo22422l(e);
        if (obj2 != l && (obj2 == null || !obj2.equals(l))) {
            return false;
        }
        mo22420j(e);
        return true;
    }

    public final boolean replace(K k, V v, V v2) {
        int e = mo22410e(k);
        if (e < 0) {
            return false;
        }
        V l = mo22422l(e);
        if (l != v && (v == null || !v.equals(l))) {
            return false;
        }
        mo22421k(e, v2);
        return true;
    }

    public C6313h(int i) {
        if (i == 0) {
            this.f19967b = C13637c.f33637d;
            this.f19968c = C13637c.f33639f;
        } else {
            m14953a(i);
        }
        this.f19969d = 0;
    }

    public C6313h(C6313h<K, V> hVar) {
        this();
        if (hVar != null) {
            mo22418i(hVar);
        }
    }
}
