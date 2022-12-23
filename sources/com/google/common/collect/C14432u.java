package com.google.common.collect;

import java.util.Map;
import p988j$.util.function.Function;

/* renamed from: com.google.common.collect.u */
public final /* synthetic */ class C14432u implements Function {
    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((Map.Entry) obj).getValue();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
