package kotlinx.coroutines.flow;

import ai0.C21002f;
import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p584jl.C17885a;
import wh0.C25235z;
import zh0.C25522c;

@C23413c(mo58554c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", mo58555f = "Collect.kt", mo58556l = {50}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo59060d2 = {"T", "Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class FlowKt__CollectKt$launchIn$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public final /* synthetic */ C25522c<Object> $this_launchIn;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__CollectKt$launchIn$1(C25522c<Object> cVar, C23349c<? super FlowKt__CollectKt$launchIn$1> cVar2) {
        super(2, cVar2);
        this.$this_launchIn = cVar;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new FlowKt__CollectKt$launchIn$1(this.$this_launchIn, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__CollectKt$launchIn$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            C25522c<Object> cVar = this.$this_launchIn;
            this.label = 1;
            Object collect = cVar.collect(C21002f.f52751b, this);
            if (collect != coroutineSingletons) {
                collect = C21050d.f52856a;
            }
            if (collect == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C17885a.m44475z0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C21050d.f52856a;
    }
}
