package com.google.common.collect;

import java.util.Map;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.Consumer;

/* renamed from: com.google.common.collect.b0 */
public final /* synthetic */ class C14385b0 implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ BiConsumer f36268a;

    public /* synthetic */ C14385b0(BiConsumer biConsumer) {
        this.f36268a = biConsumer;
    }

    public final void accept(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        this.f36268a.accept(entry.getKey(), entry.getValue());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
