package com.google.common.collect;

import p988j$.util.function.BiConsumer;
import p988j$.util.function.Consumer;

/* renamed from: com.google.common.collect.t */
public final /* synthetic */ class C14430t implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f36321a;

    public /* synthetic */ C14430t(Consumer consumer) {
        this.f36321a = consumer;
    }

    public final void accept(Object obj, Object obj2) {
        Consumer consumer = this.f36321a;
        int i = ImmutableMapKeySet.f36213e;
        consumer.accept(obj);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
