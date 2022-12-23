package kotlinx.coroutines.flow;

import bf0.C21050d;
import ff0.C23349c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import lf0.C24236l;
import lf0.C24240p;
import mf0.C24361g;
import zh0.C25522c;
import zh0.C25523d;

public final class DistinctFlowImpl<T> implements C25522c<T> {

    /* renamed from: b */
    public final C25522c<T> f61449b;

    /* renamed from: c */
    public final C24236l<T, Object> f61450c;

    /* renamed from: d */
    public final C24240p<Object, Object, Boolean> f61451d;

    public DistinctFlowImpl(C24208d dVar, C24236l lVar, C24240p pVar) {
        this.f61449b = dVar;
        this.f61450c = lVar;
        this.f61451d = pVar;
    }

    public final Object collect(C25523d<? super T> dVar, C23349c<? super C21050d> cVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = C24361g.f61673b;
        Object collect = this.f61449b.collect(new DistinctFlowImpl$collect$2(this, ref$ObjectRef, dVar), cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C21050d.f52856a;
    }
}
