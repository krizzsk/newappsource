package com.google.common.collect;

import p988j$.util.function.Consumer;
import p988j$.util.function.Function;

/* renamed from: com.google.common.collect.h */
public final /* synthetic */ class C14401h implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f36282a;

    /* renamed from: b */
    public final /* synthetic */ Function f36283b;

    public /* synthetic */ C14401h(Consumer consumer, Function function) {
        this.f36282a = consumer;
        this.f36283b = function;
    }

    public final void accept(Object obj) {
        this.f36282a.accept(this.f36283b.apply(obj));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
