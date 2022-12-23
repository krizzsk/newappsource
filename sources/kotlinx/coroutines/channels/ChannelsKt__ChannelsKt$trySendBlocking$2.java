package kotlinx.coroutines.channels;

import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p584jl.C17885a;
import wh0.C25235z;
import yh0.C25312f;
import yh0.C25325q;

@C23413c(mo58554c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", mo58555f = "Channels.kt", mo58556l = {39}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo59060d2 = {"E", "Lwh0/z;", "Lyh0/f;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class ChannelsKt__ChannelsKt$trySendBlocking$2 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C25312f<? extends C21050d>>, Object> {
    public final /* synthetic */ Object $element;
    public final /* synthetic */ C25325q<Object> $this_trySendBlocking;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__ChannelsKt$trySendBlocking$2(C25325q<Object> qVar, Object obj, C23349c<? super ChannelsKt__ChannelsKt$trySendBlocking$2> cVar) {
        super(2, cVar);
        this.$this_trySendBlocking = qVar;
        this.$element = obj;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        ChannelsKt__ChannelsKt$trySendBlocking$2 channelsKt__ChannelsKt$trySendBlocking$2 = new ChannelsKt__ChannelsKt$trySendBlocking$2(this.$this_trySendBlocking, this.$element, cVar);
        channelsKt__ChannelsKt$trySendBlocking$2.L$0 = obj;
        return channelsKt__ChannelsKt$trySendBlocking$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__ChannelsKt$trySendBlocking$2) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            C25235z zVar = (C25235z) this.L$0;
            C25325q<Object> qVar = this.$this_trySendBlocking;
            Object obj4 = this.$element;
            this.label = 1;
            if (qVar.mo60341A(obj4, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                C17885a.m44475z0(obj);
            } catch (Throwable th) {
                obj2 = C17885a.m44400G(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = C21050d.f52856a;
        if (!(obj2 instanceof Result.Failure)) {
            obj3 = C21050d.f52856a;
        } else {
            obj3 = new C25312f.C25313a(Result.m58423a(obj2));
        }
        return new C25312f(obj3);
    }
}
