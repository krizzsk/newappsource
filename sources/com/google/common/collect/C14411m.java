package com.google.common.collect;

import com.google.common.collect.C14415o;
import p624ld.C18192e;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

/* renamed from: com.google.common.collect.m */
public final /* synthetic */ class C14411m implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f36299a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f36300b;

    /* renamed from: c */
    public final /* synthetic */ Object f36301c;

    public /* synthetic */ C14411m(Object obj, Consumer consumer, int i) {
        this.f36299a = i;
        this.f36301c = obj;
        this.f36300b = consumer;
    }

    public final void accept(Object obj) {
        switch (this.f36299a) {
            case 0:
                Consumer consumer = this.f36300b;
                Spliterator spliterator = (Spliterator) ((C14415o.C14416a) this.f36301c).f36305c.apply(obj);
                if (spliterator != null) {
                    spliterator.forEachRemaining(consumer);
                    return;
                }
                return;
            default:
                Consumer consumer2 = this.f36300b;
                if (((C18192e) this.f36301c).test(obj)) {
                    consumer2.accept(obj);
                    return;
                }
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f36299a) {
            case 0:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }
}
