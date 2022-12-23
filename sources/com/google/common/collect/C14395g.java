package com.google.common.collect;

import p988j$.util.function.Consumer;
import p988j$.util.function.Function;

/* renamed from: com.google.common.collect.g */
public final /* synthetic */ class C14395g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f36276a;

    /* renamed from: b */
    public final /* synthetic */ Function f36277b;

    public /* synthetic */ C14395g(Consumer consumer, Function function) {
        this.f36276a = consumer;
        this.f36277b = function;
    }

    public final void accept(Object obj) {
        this.f36276a.accept(this.f36277b.apply(obj));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
