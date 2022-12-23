package kotlinx.coroutines.flow.internal;

import bf0.C21050d;
import ff0.C23349c;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import lf0.C24241q;
import zh0.C25523d;

@Metadata(mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements C24241q<C25523d<? super Object>, Object, C23349c<? super C21050d>, Object> {

    /* renamed from: b */
    public static final SafeCollectorKt$emitFun$1 f61483b = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, C25523d.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((C25523d) obj).emit(obj2, (C23349c) obj3);
    }
}
