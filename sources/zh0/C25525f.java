package zh0;

import bf0.C21050d;
import ff0.C23349c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1;
import lf0.C24240p;

/* renamed from: zh0.f */
public final class C25525f implements C25522c<Object> {

    /* renamed from: b */
    public final /* synthetic */ C25522c f63785b;

    /* renamed from: c */
    public final /* synthetic */ C24240p f63786c;

    public C25525f(C25520a aVar, C24240p pVar) {
        this.f63785b = aVar;
        this.f63786c = pVar;
    }

    public final Object collect(C25523d<Object> dVar, C23349c<? super C21050d> cVar) {
        Object collect = this.f63785b.collect(new FlowKt__LimitKt$dropWhile$1$1(new Ref$BooleanRef(), dVar, this.f63786c), cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C21050d.f52856a;
    }
}
