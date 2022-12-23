package com.google.common.collect;

import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;
import p988j$.util.function.IntFunction;

/* renamed from: com.google.common.collect.k */
public final /* synthetic */ class C14407k implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f36290a;

    /* renamed from: b */
    public final /* synthetic */ IntFunction f36291b;

    public /* synthetic */ C14407k(Consumer consumer, IntFunction intFunction) {
        this.f36290a = consumer;
        this.f36291b = intFunction;
    }

    public final void accept(int i) {
        this.f36290a.accept(this.f36291b.apply(i));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }
}
