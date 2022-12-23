package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import lh0.C24289p;
import lh0.C24312z;

public final class TypeParameterUpperBoundEraser$erroneousErasedBound$2 extends Lambda implements C24225a<C24312z> {
    public final /* synthetic */ TypeParameterUpperBoundEraser this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeParameterUpperBoundEraser$erroneousErasedBound$2(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        super(0);
        this.this$0 = typeParameterUpperBoundEraser;
    }

    public final Object invoke() {
        StringBuilder k = C13555b.m33972k("Can't compute erased upper bound of type parameter `");
        k.append(this.this$0);
        k.append('`');
        return C24289p.m60914d(k.toString());
    }
}
