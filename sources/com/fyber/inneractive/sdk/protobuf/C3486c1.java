package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C3609z;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.c1 */
public final class C3486c1<E> extends C3482c<E> implements RandomAccess {

    /* renamed from: d */
    public static final C3486c1<Object> f12408d;

    /* renamed from: b */
    public E[] f12409b;

    /* renamed from: c */
    public int f12410c;

    static {
        C3486c1<Object> c1Var = new C3486c1<>(new Object[0], 0);
        f12408d = c1Var;
        c1Var.f12405a = false;
    }

    public C3486c1(E[] eArr, int i) {
        this.f12409b = eArr;
        this.f12410c = i;
    }

    public boolean add(E e) {
        mo14793e();
        int i = this.f12410c;
        E[] eArr = this.f12409b;
        if (i == eArr.length) {
            this.f12409b = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f12409b;
        int i2 = this.f12410c;
        this.f12410c = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    /* renamed from: b */
    public C3609z.C3620j mo14808b(int i) {
        if (i >= this.f12410c) {
            return new C3486c1(Arrays.copyOf(this.f12409b, i), this.f12410c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public final void mo14809c(int i) {
        if (i < 0 || i >= this.f12410c) {
            throw new IndexOutOfBoundsException(mo14810d(i));
        }
    }

    /* renamed from: d */
    public final String mo14810d(int i) {
        StringBuilder r = C25541a.m63887r("Index:", i, ", Size:");
        r.append(this.f12410c);
        return r.toString();
    }

    public E get(int i) {
        mo14809c(i);
        return this.f12409b[i];
    }

    public E remove(int i) {
        mo14793e();
        mo14809c(i);
        E[] eArr = this.f12409b;
        E e = eArr[i];
        int i2 = this.f12410c;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f12410c--;
        this.modCount++;
        return e;
    }

    public E set(int i, E e) {
        mo14793e();
        mo14809c(i);
        E[] eArr = this.f12409b;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public int size() {
        return this.f12410c;
    }

    public void add(int i, E e) {
        int i2;
        mo14793e();
        if (i < 0 || i > (i2 = this.f12410c)) {
            throw new IndexOutOfBoundsException(mo14810d(i));
        }
        E[] eArr = this.f12409b;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[C13715c.m34237b(i2, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f12409b, i, eArr2, i + 1, this.f12410c - i);
            this.f12409b = eArr2;
        }
        this.f12409b[i] = e;
        this.f12410c++;
        this.modCount++;
    }
}
