package kotlinx.coroutines.flow;

import bf0.C21050d;
import ff0.C23349c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.C24213b;
import lf0.C24241q;
import zh0.C25522c;
import zh0.C25523d;

/* renamed from: kotlinx.coroutines.flow.d */
public final class C24208d implements C25522c<Object> {

    /* renamed from: b */
    public final /* synthetic */ C25522c f61474b;

    /* renamed from: c */
    public final /* synthetic */ C25522c f61475c;

    /* renamed from: d */
    public final /* synthetic */ C24241q f61476d;

    public C24208d(C25522c cVar, C25522c cVar2, C24241q qVar) {
        this.f61474b = cVar;
        this.f61475c = cVar2;
        this.f61476d = qVar;
    }

    public final Object collect(C25523d<Object> dVar, C23349c<? super C21050d> cVar) {
        Object a = C24213b.m60680a(cVar, FlowKt__ZipKt$nullArrayFactory$1.f61472f, new FlowKt__ZipKt$combine$1$1(this.f61476d, (C23349c<? super FlowKt__ZipKt$combine$1$1>) null), dVar, new C25522c[]{this.f61474b, this.f61475c});
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return C21050d.f52856a;
    }
}
