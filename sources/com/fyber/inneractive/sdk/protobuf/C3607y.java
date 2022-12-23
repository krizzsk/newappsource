package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C3609z;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.y */
public final class C3607y extends C3482c<Integer> implements C3609z.C3616g, RandomAccess, C3621z0 {

    /* renamed from: d */
    public static final C3607y f12637d;

    /* renamed from: b */
    public int[] f12638b;

    /* renamed from: c */
    public int f12639c;

    static {
        C3607y yVar = new C3607y(new int[0], 0);
        f12637d = yVar;
        yVar.f12405a = false;
    }

    public C3607y() {
        this(new int[10], 0);
    }

    public void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo14793e();
        if (i < 0 || i > (i2 = this.f12639c)) {
            throw new IndexOutOfBoundsException(mo15246f(i));
        }
        int[] iArr = this.f12638b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[C13715c.m34237b(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f12638b, i, iArr2, i + 1, this.f12639c - i);
            this.f12638b = iArr2;
        }
        this.f12638b[i] = intValue;
        this.f12639c++;
        this.modCount++;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        mo14793e();
        Charset charset = C3609z.f12640a;
        collection.getClass();
        if (!(collection instanceof C3607y)) {
            return super.addAll(collection);
        }
        C3607y yVar = (C3607y) collection;
        int i = yVar.f12639c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f12639c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f12638b;
            if (i3 > iArr.length) {
                this.f12638b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(yVar.f12638b, 0, this.f12638b, this.f12639c, yVar.f12639c);
            this.f12639c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public void mo15242c(int i) {
        mo14793e();
        int i2 = this.f12639c;
        int[] iArr = this.f12638b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[C13715c.m34237b(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f12638b = iArr2;
        }
        int[] iArr3 = this.f12638b;
        int i3 = this.f12639c;
        this.f12639c = i3 + 1;
        iArr3[i3] = i;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo15244d(int i) {
        if (i < 0 || i >= this.f12639c) {
            throw new IndexOutOfBoundsException(mo15246f(i));
        }
    }

    /* renamed from: e */
    public int mo15245e(int i) {
        mo15244d(i);
        return this.f12638b[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3607y)) {
            return super.equals(obj);
        }
        C3607y yVar = (C3607y) obj;
        if (this.f12639c != yVar.f12639c) {
            return false;
        }
        int[] iArr = yVar.f12638b;
        for (int i = 0; i < this.f12639c; i++) {
            if (this.f12638b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String mo15246f(int i) {
        StringBuilder r = C25541a.m63887r("Index:", i, ", Size:");
        r.append(this.f12639c);
        return r.toString();
    }

    /* renamed from: g */
    public C3609z.C3616g mo14808b(int i) {
        if (i >= this.f12639c) {
            return new C3607y(Arrays.copyOf(this.f12638b, i), this.f12639c);
        }
        throw new IllegalArgumentException();
    }

    public Object get(int i) {
        mo15244d(i);
        return Integer.valueOf(this.f12638b[i]);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f12639c; i2++) {
            i = (i * 31) + this.f12638b[i2];
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f12639c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f12638b[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public Object remove(int i) {
        mo14793e();
        mo15244d(i);
        int[] iArr = this.f12638b;
        int i2 = iArr[i];
        int i3 = this.f12639c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f12639c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public void removeRange(int i, int i2) {
        mo14793e();
        if (i2 >= i) {
            int[] iArr = this.f12638b;
            System.arraycopy(iArr, i2, iArr, i, this.f12639c - i2);
            this.f12639c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo14793e();
        mo15244d(i);
        int[] iArr = this.f12638b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public int size() {
        return this.f12639c;
    }

    public C3607y(int[] iArr, int i) {
        this.f12638b = iArr;
        this.f12639c = i;
    }

    public boolean add(Object obj) {
        mo15242c(((Integer) obj).intValue());
        return true;
    }
}
