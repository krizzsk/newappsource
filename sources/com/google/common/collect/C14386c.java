package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Map;
import p988j$.util.function.Function;

/* renamed from: com.google.common.collect.c */
public final /* synthetic */ class C14386c implements Function {

    /* renamed from: a */
    public final /* synthetic */ AbstractMapBasedMultimap.C14350b f36269a;

    public /* synthetic */ C14386c(AbstractMapBasedMultimap.C14350b bVar) {
        this.f36269a = bVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return this.f36269a.mo42972a((Map.Entry) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
