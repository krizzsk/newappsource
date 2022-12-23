package com.google.common.collect;

import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;
import p988j$.util.function.IntFunction;

/* renamed from: com.google.common.collect.j */
public final /* synthetic */ class C14405j implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f36288a;

    /* renamed from: b */
    public final /* synthetic */ IntFunction f36289b;

    public /* synthetic */ C14405j(Consumer consumer, IntFunction intFunction) {
        this.f36288a = consumer;
        this.f36289b = intFunction;
    }

    public final void accept(int i) {
        this.f36288a.accept(this.f36289b.apply(i));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }
}
