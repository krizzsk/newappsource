package com.google.common.collect;

import p988j$.util.function.BiConsumer;
import p988j$.util.function.Consumer;

/* renamed from: com.google.common.collect.h0 */
public final /* synthetic */ class C14402h0 implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f36284a;

    public /* synthetic */ C14402h0(Consumer consumer) {
        this.f36284a = consumer;
    }

    public final void accept(Object obj, Object obj2) {
        this.f36284a.accept(obj);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
