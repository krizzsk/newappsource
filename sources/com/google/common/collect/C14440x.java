package com.google.common.collect;

import p988j$.util.function.IntFunction;

/* renamed from: com.google.common.collect.x */
public final /* synthetic */ class C14440x implements IntFunction {

    /* renamed from: a */
    public final /* synthetic */ IndexedImmutableSet f36328a;

    public /* synthetic */ C14440x(IndexedImmutableSet indexedImmutableSet) {
        this.f36328a = indexedImmutableSet;
    }

    public final Object apply(int i) {
        return this.f36328a.get(i);
    }
}
