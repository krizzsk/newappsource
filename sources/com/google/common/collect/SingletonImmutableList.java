package com.google.common.collect;

import java.util.Collections;
import p001a0.C0016g;
import p583jk.C17884p;
import p988j$.util.Set;
import p988j$.util.Spliterator;

final class SingletonImmutableList<E> extends ImmutableList<E> {

    /* renamed from: d */
    public final transient E f36261d;

    public SingletonImmutableList(E e) {
        e.getClass();
        this.f36261d = e;
    }

    /* renamed from: G */
    public final ImmutableList<E> subList(int i, int i2) {
        C17884p.m44375o(i, i2, 1);
        if (i == i2) {
            return RegularImmutableList.f36244e;
        }
        return this;
    }

    public final E get(int i) {
        C17884p.m44371j(i, 1);
        return this.f36261d;
    }

    /* renamed from: s */
    public final boolean mo43086s() {
        return false;
    }

    public final int size() {
        return 1;
    }

    public final Spliterator<E> spliterator() {
        return Set.EL.spliterator(Collections.singleton(this.f36261d));
    }

    public final String toString() {
        String obj = this.f36261d.toString();
        StringBuilder sb = new StringBuilder(C0016g.m25h(obj, 2));
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: u */
    public final C14439w0<E> iterator() {
        return new C14442z(this.f36261d);
    }
}
