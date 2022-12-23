package com.veriff.sdk.internal;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.veriff.sdk.internal.zo */
final class C22790zo {

    /* renamed from: a */
    private final Set<C22761yw> f57820a = new LinkedHashSet();

    /* renamed from: a */
    public synchronized void mo57529a(C22761yw ywVar) {
        this.f57820a.add(ywVar);
    }

    /* renamed from: b */
    public synchronized void mo57530b(C22761yw ywVar) {
        this.f57820a.remove(ywVar);
    }

    /* renamed from: c */
    public synchronized boolean mo57531c(C22761yw ywVar) {
        return this.f57820a.contains(ywVar);
    }
}
