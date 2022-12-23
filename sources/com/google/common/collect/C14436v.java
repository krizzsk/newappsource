package com.google.common.collect;

import p988j$.util.function.BiConsumer;
import p988j$.util.function.Consumer;

/* renamed from: com.google.common.collect.v */
public final /* synthetic */ class C14436v implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f36324a;

    public /* synthetic */ C14436v(Consumer consumer) {
        this.f36324a = consumer;
    }

    public final void accept(Object obj, Object obj2) {
        Consumer consumer = this.f36324a;
        int i = ImmutableMapValues.f36214c;
        consumer.accept(obj2);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
