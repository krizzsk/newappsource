package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import mf0.C24361g;
import p584jl.C17885a;
import wh0.C25235z;

@C23413c(mo58554c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", mo58555f = "Lifecycle.kt", mo58556l = {}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class LifecycleCoroutineScopeImpl$register$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ LifecycleCoroutineScopeImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScopeImpl$register$1(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, C23349c<? super LifecycleCoroutineScopeImpl$register$1> cVar) {
        super(2, cVar);
        this.this$0 = lifecycleCoroutineScopeImpl;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(this.this$0, cVar);
        lifecycleCoroutineScopeImpl$register$1.L$0 = obj;
        return lifecycleCoroutineScopeImpl$register$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((LifecycleCoroutineScopeImpl$register$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C17885a.m44475z0(obj);
            C25235z zVar = (C25235z) this.L$0;
            if (this.this$0.f3881b.mo4225b().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
                LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.this$0;
                lifecycleCoroutineScopeImpl.f3881b.mo4224a(lifecycleCoroutineScopeImpl);
            } else {
                C24361g.m61172l(zVar.mo4232K(), (CancellationException) null);
            }
            return C21050d.f52856a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
