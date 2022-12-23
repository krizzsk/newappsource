package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import bf0.C21050d;
import bi0.C21073k;
import ci0.C21207b;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p584jl.C17885a;
import wh0.C25177g;
import wh0.C25184i0;
import wh0.C25235z;

@C23413c(mo58554c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", mo58555f = "Lifecycle.kt", mo58556l = {114}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class LifecycleCoroutineScope$launchWhenResumed$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public final /* synthetic */ C24240p<C25235z, C23349c<? super C21050d>, Object> $block;
    public int label;
    public final /* synthetic */ C1020l this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScope$launchWhenResumed$1(C1020l lVar, C24240p<? super C25235z, ? super C23349c<? super C21050d>, ? extends Object> pVar, C23349c<? super LifecycleCoroutineScope$launchWhenResumed$1> cVar) {
        super(2, cVar);
        this.this$0 = lVar;
        this.$block = pVar;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new LifecycleCoroutineScope$launchWhenResumed$1(this.this$0, this.$block, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((LifecycleCoroutineScope$launchWhenResumed$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            Lifecycle a = this.this$0.mo4233a();
            C24240p<C25235z, C23349c<? super C21050d>, Object> pVar = this.$block;
            this.label = 1;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            C21207b bVar = C25184i0.f63459a;
            if (C25177g.m63221e(C21073k.f52890a.mo60300z(), new PausingDispatcherKt$whenStateAtLeast$2(a, state, pVar, (C23349c<? super PausingDispatcherKt$whenStateAtLeast$2>) null), this) == coroutineSingletons) {
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
