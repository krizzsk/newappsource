package com.google.common.collect;

import p988j$.util.function.BiConsumer;
import p988j$.util.function.Consumer;

/* renamed from: com.google.common.collect.i0 */
public final /* synthetic */ class C14404i0 implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f36287a;

    public /* synthetic */ C14404i0(Consumer consumer) {
        this.f36287a = consumer;
    }

    public final void accept(Object obj, Object obj2) {
        this.f36287a.accept(obj2);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
