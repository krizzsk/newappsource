package com.google.common.collect;

import p988j$.util.function.IntFunction;

/* renamed from: com.google.common.collect.q */
public final /* synthetic */ class C14424q implements IntFunction {

    /* renamed from: a */
    public final /* synthetic */ ImmutableList f36315a;

    public /* synthetic */ C14424q(ImmutableList immutableList) {
        this.f36315a = immutableList;
    }

    public final Object apply(int i) {
        return this.f36315a.get(i);
    }
}
