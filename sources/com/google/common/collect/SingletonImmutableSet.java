package com.google.common.collect;

import p001a0.C0016g;

final class SingletonImmutableSet<E> extends ImmutableSet<E> {

    /* renamed from: d */
    public final transient E f36262d;

    public SingletonImmutableSet(E e) {
        e.getClass();
        this.f36262d = e;
    }

    public final boolean contains(Object obj) {
        return this.f36262d.equals(obj);
    }

    /* renamed from: e */
    public final ImmutableList<E> mo43098e() {
        return new SingletonImmutableList(this.f36262d);
    }

    public final int hashCode() {
        return this.f36262d.hashCode();
    }

    /* renamed from: i */
    public final int mo43100i(int i, Object[] objArr) {
        objArr[i] = this.f36262d;
        return i + 1;
    }

    /* renamed from: s */
    public final boolean mo43086s() {
        return false;
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.f36262d.toString();
        StringBuilder sb = new StringBuilder(C0016g.m25h(obj, 2));
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: u */
    public final C14439w0<E> iterator() {
        return new C14442z(this.f36262d);
    }
}
