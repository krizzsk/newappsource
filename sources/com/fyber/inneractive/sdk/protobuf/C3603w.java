package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C3609z;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.w */
public final class C3603w extends C3482c<Float> implements C3609z.C3615f, RandomAccess, C3621z0 {

    /* renamed from: d */
    public static final C3603w f12631d;

    /* renamed from: b */
    public float[] f12632b;

    /* renamed from: c */
    public int f12633c;

    static {
        C3603w wVar = new C3603w(new float[0], 0);
        f12631d = wVar;
        wVar.f12405a = false;
    }

    public C3603w() {
        this(new float[10], 0);
    }

    /* renamed from: a */
    public void mo15230a(float f) {
        mo14793e();
        int i = this.f12633c;
        float[] fArr = this.f12632b;
        if (i == fArr.length) {
            float[] fArr2 = new float[C13715c.m34237b(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f12632b = fArr2;
        }
        float[] fArr3 = this.f12632b;
        int i2 = this.f12633c;
        this.f12633c = i2 + 1;
        fArr3[i2] = f;
    }

    public void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo14793e();
        if (i < 0 || i > (i2 = this.f12633c)) {
            throw new IndexOutOfBoundsException(mo15234d(i));
        }
        float[] fArr = this.f12632b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[C13715c.m34237b(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f12632b, i, fArr2, i + 1, this.f12633c - i);
            this.f12632b = fArr2;
        }
        this.f12632b[i] = floatValue;
        this.f12633c++;
        this.modCount++;
    }

    public boolean addAll(Collection<? extends Float> collection) {
        mo14793e();
        Charset charset = C3609z.f12640a;
        collection.getClass();
        if (!(collection instanceof C3603w)) {
            return super.addAll(collection);
        }
        C3603w wVar = (C3603w) collection;
        int i = wVar.f12633c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f12633c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f12632b;
            if (i3 > fArr.length) {
                this.f12632b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(wVar.f12632b, 0, this.f12632b, this.f12633c, wVar.f12633c);
            this.f12633c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo15232c(int i) {
        if (i < 0 || i >= this.f12633c) {
            throw new IndexOutOfBoundsException(mo15234d(i));
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final String mo15234d(int i) {
        StringBuilder r = C25541a.m63887r("Index:", i, ", Size:");
        r.append(this.f12633c);
        return r.toString();
    }

    /* renamed from: e */
    public C3609z.C3615f mo14808b(int i) {
        if (i >= this.f12633c) {
            return new C3603w(Arrays.copyOf(this.f12632b, i), this.f12633c);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3603w)) {
            return super.equals(obj);
        }
        C3603w wVar = (C3603w) obj;
        if (this.f12633c != wVar.f12633c) {
            return false;
        }
        float[] fArr = wVar.f12632b;
        for (int i = 0; i < this.f12633c; i++) {
            if (Float.floatToIntBits(this.f12632b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i) {
        mo15232c(i);
        return Float.valueOf(this.f12632b[i]);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f12633c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f12632b[i2]);
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f12633c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f12632b[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public Object remove(int i) {
        mo14793e();
        mo15232c(i);
        float[] fArr = this.f12632b;
        float f = fArr[i];
        int i2 = this.f12633c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f12633c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public void removeRange(int i, int i2) {
        mo14793e();
        if (i2 >= i) {
            float[] fArr = this.f12632b;
            System.arraycopy(fArr, i2, fArr, i, this.f12633c - i2);
            this.f12633c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo14793e();
        mo15232c(i);
        float[] fArr = this.f12632b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public int size() {
        return this.f12633c;
    }

    public C3603w(float[] fArr, int i) {
        this.f12632b = fArr;
        this.f12633c = i;
    }

    public boolean add(Object obj) {
        mo15230a(((Float) obj).floatValue());
        return true;
    }
}
