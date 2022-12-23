package com.google.protobuf;

import com.google.protobuf.C14610k;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p911xg.C20509q;

/* renamed from: com.google.protobuf.j */
public final class C14609j extends C14596c<Integer> implements C14610k.C14614d, RandomAccess, C20509q {

    /* renamed from: e */
    public static final C14609j f36858e;

    /* renamed from: c */
    public int[] f36859c;

    /* renamed from: d */
    public int f36860d;

    static {
        C14609j jVar = new C14609j(new int[0], 0);
        f36858e = jVar;
        jVar.f36836b = false;
    }

    public C14609j() {
        this(new int[10], 0);
    }

    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo44030e();
        if (i < 0 || i > (i2 = this.f36860d)) {
            StringBuilder r = C25541a.m63887r("Index:", i, ", Size:");
            r.append(this.f36860d);
            throw new IndexOutOfBoundsException(r.toString());
        }
        int[] iArr = this.f36859c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[C13715c.m34237b(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f36859c, i, iArr2, i + 1, this.f36860d - i);
            this.f36859c = iArr2;
        }
        this.f36859c[i] = intValue;
        this.f36860d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo44030e();
        Charset charset = C14610k.f36861a;
        collection.getClass();
        if (!(collection instanceof C14609j)) {
            return super.addAll(collection);
        }
        C14609j jVar = (C14609j) collection;
        int i = jVar.f36860d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f36860d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f36859c;
            if (i3 > iArr.length) {
                this.f36859c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(jVar.f36859c, 0, this.f36859c, this.f36860d, jVar.f36860d);
            this.f36860d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c1 */
    public final C14610k.C14615e mo44086c1(int i) {
        if (i >= this.f36860d) {
            return new C14609j(Arrays.copyOf(this.f36859c, i), this.f36860d);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14609j)) {
            return super.equals(obj);
        }
        C14609j jVar = (C14609j) obj;
        if (this.f36860d != jVar.f36860d) {
            return false;
        }
        int[] iArr = jVar.f36859c;
        for (int i = 0; i < this.f36860d; i++) {
            if (this.f36859c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i) {
        return Integer.valueOf(mo44092n(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f36860d; i2++) {
            i = (i * 31) + this.f36859c[i2];
        }
        return i;
    }

    /* renamed from: i */
    public final void mo44089i(int i) {
        mo44030e();
        int i2 = this.f36860d;
        int[] iArr = this.f36859c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[C13715c.m34237b(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f36859c = iArr2;
        }
        int[] iArr3 = this.f36859c;
        int i3 = this.f36860d;
        this.f36860d = i3 + 1;
        iArr3[i3] = i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f36860d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f36859c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public final void mo44091m(int i) {
        if (i < 0 || i >= this.f36860d) {
            StringBuilder r = C25541a.m63887r("Index:", i, ", Size:");
            r.append(this.f36860d);
            throw new IndexOutOfBoundsException(r.toString());
        }
    }

    /* renamed from: n */
    public final int mo44092n(int i) {
        mo44091m(i);
        return this.f36859c[i];
    }

    public final Object remove(int i) {
        mo44030e();
        mo44091m(i);
        int[] iArr = this.f36859c;
        int i2 = iArr[i];
        int i3 = this.f36860d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f36860d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final void removeRange(int i, int i2) {
        mo44030e();
        if (i2 >= i) {
            int[] iArr = this.f36859c;
            System.arraycopy(iArr, i2, iArr, i, this.f36860d - i2);
            this.f36860d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo44030e();
        mo44091m(i);
        int[] iArr = this.f36859c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f36860d;
    }

    public C14609j(int[] iArr, int i) {
        this.f36859c = iArr;
        this.f36860d = i;
    }

    public final boolean add(Object obj) {
        mo44089i(((Integer) obj).intValue());
        return true;
    }
}
