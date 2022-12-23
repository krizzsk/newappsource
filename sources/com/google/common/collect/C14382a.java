package com.google.common.collect;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p583jk.C17884p;

/* renamed from: com.google.common.collect.a */
public abstract class C14382a<E> extends C14439w0<Object> implements ListIterator<Object> {

    /* renamed from: b */
    public final int f36263b;

    /* renamed from: c */
    public int f36264c;

    public C14382a(int i, int i2) {
        C17884p.m44374n(i2, i);
        this.f36263b = i;
        this.f36264c = i2;
    }

    @Deprecated
    /* renamed from: a */
    public final void mo43180a(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo43180a(obj);
        throw null;
    }

    /* renamed from: b */
    public abstract E mo43182b(int i);

    @Deprecated
    /* renamed from: c */
    public final void mo43183c(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f36264c < this.f36263b;
    }

    public final boolean hasPrevious() {
        return this.f36264c > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f36264c;
            this.f36264c = i + 1;
            return mo43182b(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f36264c;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f36264c - 1;
            this.f36264c = i;
            return mo43182b(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f36264c - 1;
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo43183c(obj);
        throw null;
    }
}
