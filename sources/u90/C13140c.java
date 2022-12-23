package u90;

import java.util.List;
import p988j$.util.Collection;
import p988j$.util.function.Function;

/* renamed from: u90.c */
public final /* synthetic */ class C13140c implements Function {
    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Collection.EL.stream((List) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
