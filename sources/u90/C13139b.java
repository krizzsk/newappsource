package u90;

import com.moovit.transit.ShapeSegment;
import p988j$.util.function.Function;

/* renamed from: u90.b */
public final /* synthetic */ class C13139b implements Function {
    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((ShapeSegment) obj).getPoints();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
