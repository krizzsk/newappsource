package com.google.common.collect;

import ce0.C21100e;
import com.google.common.collect.ImmutableSet;
import p583jk.C17884p;
import p988j$.util.Spliterator;
import p988j$.util.Spliterators;

final class RegularImmutableSet<E> extends ImmutableSet.CachingAsList<E> {

    /* renamed from: i */
    public static final Object[] f36250i;

    /* renamed from: j */
    public static final RegularImmutableSet<Object> f36251j;

    /* renamed from: e */
    public final transient Object[] f36252e;

    /* renamed from: f */
    public final transient int f36253f;

    /* renamed from: g */
    public final transient Object[] f36254g;

    /* renamed from: h */
    public final transient int f36255h;

    static {
        Object[] objArr = new Object[0];
        f36250i = objArr;
        f36251j = new RegularImmutableSet<>(0, 0, objArr, objArr);
    }

    public RegularImmutableSet(int i, int i2, Object[] objArr, Object[] objArr2) {
        this.f36252e = objArr;
        this.f36253f = i;
        this.f36254g = objArr2;
        this.f36255h = i2;
    }

    /* renamed from: E */
    public final boolean mo43155E() {
        return true;
    }

    /* renamed from: G */
    public final ImmutableList<E> mo43157G() {
        if (this.f36254g.length == 0) {
            return RegularImmutableList.f36244e;
        }
        return new RegularImmutableAsList(this, this.f36252e);
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.f36254g;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int C0 = C21100e.m49301C0(obj.hashCode());
        while (true) {
            int i = C0 & this.f36255h;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            C0 = i + 1;
        }
    }

    public final int hashCode() {
        return this.f36253f;
    }

    /* renamed from: i */
    public final int mo43100i(int i, Object[] objArr) {
        Object[] objArr2 = this.f36252e;
        System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
        return i + this.f36252e.length;
    }

    /* renamed from: m */
    public final Object[] mo43101m() {
        return this.f36252e;
    }

    /* renamed from: n */
    public final int mo43102n() {
        return this.f36252e.length;
    }

    /* renamed from: p */
    public final int mo43103p() {
        return 0;
    }

    /* renamed from: s */
    public final boolean mo43086s() {
        return false;
    }

    public final int size() {
        return this.f36252e.length;
    }

    public final Spliterator<E> spliterator() {
        return Spliterators.spliterator(this.f36252e, 1297);
    }

    /* renamed from: u */
    public final C14439w0<E> iterator() {
        boolean z;
        Object[] objArr = this.f36252e;
        int length = objArr.length;
        if (length >= 0) {
            z = true;
        } else {
            z = false;
        }
        C17884p.m44369h(z);
        C17884p.m44375o(0, length + 0, objArr.length);
        C17884p.m44374n(0, length);
        if (length == 0) {
            return C14383a0.f36265f;
        }
        return new C14383a0(objArr, length, 0);
    }
}
