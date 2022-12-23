package com.google.common.collect;

import p583jk.C17884p;
import p988j$.util.Spliterator;
import p988j$.util.Spliterators;

class RegularImmutableList<E> extends ImmutableList<E> {

    /* renamed from: e */
    public static final ImmutableList<Object> f36244e = new RegularImmutableList(new Object[0]);

    /* renamed from: d */
    public final transient Object[] f36245d;

    public RegularImmutableList(Object[] objArr) {
        this.f36245d = objArr;
    }

    /* renamed from: C */
    public final C14382a listIterator(int i) {
        boolean z;
        Object[] objArr = this.f36245d;
        int length = objArr.length;
        if (length >= 0) {
            z = true;
        } else {
            z = false;
        }
        C17884p.m44369h(z);
        C17884p.m44375o(0, length + 0, objArr.length);
        C17884p.m44374n(i, length);
        if (length == 0) {
            return C14383a0.f36265f;
        }
        return new C14383a0(objArr, length, i);
    }

    public final E get(int i) {
        return this.f36245d[i];
    }

    /* renamed from: i */
    public final int mo43100i(int i, Object[] objArr) {
        Object[] objArr2 = this.f36245d;
        System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
        return i + this.f36245d.length;
    }

    /* renamed from: m */
    public final Object[] mo43101m() {
        return this.f36245d;
    }

    /* renamed from: n */
    public final int mo43102n() {
        return this.f36245d.length;
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
        return this.f36245d.length;
    }

    public final Spliterator<E> spliterator() {
        return Spliterators.spliterator(this.f36245d, 1296);
    }
}
