package com.google.common.collect;

/* renamed from: com.google.common.collect.w */
public final class C14438w extends C14439w0<Object> {

    /* renamed from: b */
    public C14439w0 f36326b;

    /* renamed from: c */
    public C14439w0 f36327c = C14383a0.f36265f;

    public C14438w(ImmutableMultimap immutableMultimap) {
        this.f36326b = immutableMultimap.f36216e.values().iterator();
    }

    public final boolean hasNext() {
        return this.f36327c.hasNext() || this.f36326b.hasNext();
    }

    public final Object next() {
        if (!this.f36327c.hasNext()) {
            this.f36327c = ((ImmutableCollection) this.f36326b.next()).iterator();
        }
        return this.f36327c.next();
    }
}
