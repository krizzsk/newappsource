package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C3609z;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.n */
public final class C3551n extends C3482c<Double> implements C3609z.C3611b, RandomAccess, C3621z0 {

    /* renamed from: d */
    public static final C3551n f12519d;

    /* renamed from: b */
    public double[] f12520b;

    /* renamed from: c */
    public int f12521c;

    static {
        C3551n nVar = new C3551n(new double[0], 0);
        f12519d = nVar;
        nVar.f12405a = false;
    }

    public C3551n() {
        this(new double[10], 0);
    }

    /* renamed from: a */
    public void mo15124a(double d) {
        mo14793e();
        int i = this.f12521c;
        double[] dArr = this.f12520b;
        if (i == dArr.length) {
            double[] dArr2 = new double[C13715c.m34237b(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f12520b = dArr2;
        }
        double[] dArr3 = this.f12520b;
        int i2 = this.f12521c;
        this.f12521c = i2 + 1;
        dArr3[i2] = d;
    }

    public void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo14793e();
        if (i < 0 || i > (i2 = this.f12521c)) {
            throw new IndexOutOfBoundsException(mo15128d(i));
        }
        double[] dArr = this.f12520b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[C13715c.m34237b(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f12520b, i, dArr2, i + 1, this.f12521c - i);
            this.f12520b = dArr2;
        }
        this.f12520b[i] = doubleValue;
        this.f12521c++;
        this.modCount++;
    }

    public boolean addAll(Collection<? extends Double> collection) {
        mo14793e();
        Charset charset = C3609z.f12640a;
        collection.getClass();
        if (!(collection instanceof C3551n)) {
            return super.addAll(collection);
        }
        C3551n nVar = (C3551n) collection;
        int i = nVar.f12521c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f12521c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f12520b;
            if (i3 > dArr.length) {
                this.f12520b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(nVar.f12520b, 0, this.f12520b, this.f12521c, nVar.f12521c);
            this.f12521c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo15126c(int i) {
        if (i < 0 || i >= this.f12521c) {
            throw new IndexOutOfBoundsException(mo15128d(i));
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final String mo15128d(int i) {
        StringBuilder r = C25541a.m63887r("Index:", i, ", Size:");
        r.append(this.f12521c);
        return r.toString();
    }

    /* renamed from: e */
    public C3609z.C3611b mo14808b(int i) {
        if (i >= this.f12521c) {
            return new C3551n(Arrays.copyOf(this.f12520b, i), this.f12521c);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3551n)) {
            return super.equals(obj);
        }
        C3551n nVar = (C3551n) obj;
        if (this.f12521c != nVar.f12521c) {
            return false;
        }
        double[] dArr = nVar.f12520b;
        for (int i = 0; i < this.f12521c; i++) {
            if (Double.doubleToLongBits(this.f12520b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i) {
        mo15126c(i);
        return Double.valueOf(this.f12520b[i]);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f12521c; i2++) {
            i = (i * 31) + C3609z.m9635a(Double.doubleToLongBits(this.f12520b[i2]));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f12521c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f12520b[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public Object remove(int i) {
        mo14793e();
        mo15126c(i);
        double[] dArr = this.f12520b;
        double d = dArr[i];
        int i2 = this.f12521c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f12521c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public void removeRange(int i, int i2) {
        mo14793e();
        if (i2 >= i) {
            double[] dArr = this.f12520b;
            System.arraycopy(dArr, i2, dArr, i, this.f12521c - i2);
            this.f12521c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo14793e();
        mo15126c(i);
        double[] dArr = this.f12520b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public int size() {
        return this.f12521c;
    }

    public C3551n(double[] dArr, int i) {
        this.f12520b = dArr;
        this.f12521c = i;
    }

    public boolean add(Object obj) {
        mo15124a(((Double) obj).doubleValue());
        return true;
    }
}
