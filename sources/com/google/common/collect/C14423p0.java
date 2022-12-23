package com.google.common.collect;

import p988j$.util.function.BiConsumer;

/* renamed from: com.google.common.collect.p0 */
public final /* synthetic */ class C14423p0 implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ BiConsumer f36314a;

    public /* synthetic */ C14423p0(BiConsumer biConsumer) {
        this.f36314a = biConsumer;
    }

    public final void accept(Object obj, Object obj2) {
        this.f36314a.accept(obj2, obj);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
