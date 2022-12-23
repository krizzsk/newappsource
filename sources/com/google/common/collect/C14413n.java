package com.google.common.collect;

import com.google.common.collect.C14415o;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

/* renamed from: com.google.common.collect.n */
public final /* synthetic */ class C14413n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C14415o.C14416a f36302a;

    public /* synthetic */ C14413n(C14415o.C14416a aVar) {
        this.f36302a = aVar;
    }

    public final void accept(Object obj) {
        C14415o.C14416a aVar = this.f36302a;
        aVar.f36303a = (Spliterator) aVar.f36305c.apply(obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
