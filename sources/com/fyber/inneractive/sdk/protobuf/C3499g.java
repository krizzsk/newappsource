package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C3609z;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.g */
public final class C3499g extends C3482c<Boolean> implements C3609z.C3610a, RandomAccess, C3621z0 {

    /* renamed from: d */
    public static final C3499g f12430d;

    /* renamed from: b */
    public boolean[] f12431b;

    /* renamed from: c */
    public int f12432c;

    static {
        C3499g gVar = new C3499g(new boolean[0], 0);
        f12430d = gVar;
        gVar.f12405a = false;
    }

    public C3499g() {
        this(new boolean[10], 0);
    }

    /* renamed from: a */
    public void mo14900a(boolean z) {
        mo14793e();
        int i = this.f12432c;
        boolean[] zArr = this.f12431b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[C13715c.m34237b(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f12431b = zArr2;
        }
        boolean[] zArr3 = this.f12431b;
        int i2 = this.f12432c;
        this.f12432c = i2 + 1;
        zArr3[i2] = z;
    }

    public void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo14793e();
        if (i < 0 || i > (i2 = this.f12432c)) {
            throw new IndexOutOfBoundsException(mo14904d(i));
        }
        boolean[] zArr = this.f12431b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[C13715c.m34237b(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f12431b, i, zArr2, i + 1, this.f12432c - i);
            this.f12431b = zArr2;
        }
        this.f12431b[i] = booleanValue;
        this.f12432c++;
        this.modCount++;
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        mo14793e();
        Charset charset = C3609z.f12640a;
        collection.getClass();
        if (!(collection instanceof C3499g)) {
            return super.addAll(collection);
        }
        C3499g gVar = (C3499g) collection;
        int i = gVar.f12432c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f12432c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f12431b;
            if (i3 > zArr.length) {
                this.f12431b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(gVar.f12431b, 0, this.f12431b, this.f12432c, gVar.f12432c);
            this.f12432c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo14902c(int i) {
        if (i < 0 || i >= this.f12432c) {
            throw new IndexOutOfBoundsException(mo14904d(i));
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final String mo14904d(int i) {
        StringBuilder r = C25541a.m63887r("Index:", i, ", Size:");
        r.append(this.f12432c);
        return r.toString();
    }

    /* renamed from: e */
    public C3609z.C3610a mo14808b(int i) {
        if (i >= this.f12432c) {
            return new C3499g(Arrays.copyOf(this.f12431b, i), this.f12432c);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3499g)) {
            return super.equals(obj);
        }
        C3499g gVar = (C3499g) obj;
        if (this.f12432c != gVar.f12432c) {
            return false;
        }
        boolean[] zArr = gVar.f12431b;
        for (int i = 0; i < this.f12432c; i++) {
            if (this.f12431b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i) {
        mo14902c(i);
        return Boolean.valueOf(this.f12431b[i]);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f12432c; i2++) {
            i = (i * 31) + C3609z.m9636a(this.f12431b[i2]);
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f12432c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f12431b[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public Object remove(int i) {
        mo14793e();
        mo14902c(i);
        boolean[] zArr = this.f12431b;
        boolean z = zArr[i];
        int i2 = this.f12432c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f12432c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public void removeRange(int i, int i2) {
        mo14793e();
        if (i2 >= i) {
            boolean[] zArr = this.f12431b;
            System.arraycopy(zArr, i2, zArr, i, this.f12432c - i2);
            this.f12432c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo14793e();
        mo14902c(i);
        boolean[] zArr = this.f12431b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public int size() {
        return this.f12432c;
    }

    public C3499g(boolean[] zArr, int i) {
        this.f12431b = zArr;
        this.f12432c = i;
    }

    public boolean add(Object obj) {
        mo14900a(((Boolean) obj).booleanValue());
        return true;
    }
}
