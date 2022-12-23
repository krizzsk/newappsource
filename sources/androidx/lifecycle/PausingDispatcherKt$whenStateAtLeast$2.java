package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p584jl.C17885a;
import wh0.C25177g;
import wh0.C25232y0;
import wh0.C25235z;

@C23413c(mo58554c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", mo58555f = "PausingDispatcher.kt", mo58556l = {162}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo59060d2 = {"T", "Lwh0/z;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class PausingDispatcherKt$whenStateAtLeast$2 extends SuspendLambda implements C24240p<C25235z, C23349c<Object>, Object> {
    public final /* synthetic */ C24240p<C25235z, C23349c<Object>, Object> $block;
    public final /* synthetic */ Lifecycle.State $minState;
    public final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, C24240p<? super C25235z, ? super C23349c<Object>, ? extends Object> pVar, C23349c<? super PausingDispatcherKt$whenStateAtLeast$2> cVar) {
        super(2, cVar);
        this.$this_whenStateAtLeast = lifecycle;
        this.$minState = state;
        this.$block = pVar;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, cVar);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        C1018k kVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            CoroutineContext K = ((C25235z) this.L$0).mo4232K();
            int i2 = C25232y0.f63505j0;
            C25232y0 y0Var = (C25232y0) K.mo53081c(C25232y0.C25234b.f63506b);
            if (y0Var != null) {
                C1046y yVar = new C1046y();
                C1018k kVar2 = new C1018k(this.$this_whenStateAtLeast, this.$minState, yVar.f3986d, y0Var);
                try {
                    C24240p<C25235z, C23349c<Object>, Object> pVar = this.$block;
                    this.L$0 = kVar2;
                    this.label = 1;
                    obj = C25177g.m63221e(yVar, pVar, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    kVar = kVar2;
                } catch (Throwable th) {
                    th = th;
                    kVar = kVar2;
                    kVar.mo4306a();
                    throw th;
                }
            } else {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
        } else if (i == 1) {
            kVar = (C1018k) this.L$0;
            try {
                C17885a.m44475z0(obj);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kVar.mo4306a();
        return obj;
    }
}
