package com.google.common.collect;

import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.z */
public final class C14442z extends C14439w0<Object> {

    /* renamed from: b */
    public boolean f36330b;

    /* renamed from: c */
    public final /* synthetic */ Object f36331c;

    public C14442z(Object obj) {
        this.f36331c = obj;
    }

    public final boolean hasNext() {
        return !this.f36330b;
    }

    public final Object next() {
        if (!this.f36330b) {
            this.f36330b = true;
            return this.f36331c;
        }
        throw new NoSuchElementException();
    }
}
