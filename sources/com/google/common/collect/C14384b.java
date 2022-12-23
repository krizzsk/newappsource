package com.google.common.collect;

import p988j$.util.Collection;
import p988j$.util.function.Function;

/* renamed from: com.google.common.collect.b */
public final /* synthetic */ class C14384b implements Function {
    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Collection.EL.spliterator((java.util.Collection) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
