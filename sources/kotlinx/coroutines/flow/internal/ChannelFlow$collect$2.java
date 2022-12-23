package kotlinx.coroutines.flow.internal;

import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import lf0.C24240p;
import p584jl.C17885a;
import wh0.C25235z;
import yh0.C25321m;
import zh0.C25523d;

@C23413c(mo58554c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", mo58555f = "ChannelFlow.kt", mo58556l = {123}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo59060d2 = {"T", "Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class ChannelFlow$collect$2 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public final /* synthetic */ C25523d<Object> $collector;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C24212a<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collect$2(C23349c cVar, C25523d dVar, C24212a aVar) {
        super(2, cVar);
        this.$collector = dVar;
        this.this$0 = aVar;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        ChannelFlow$collect$2 channelFlow$collect$2 = new ChannelFlow$collect$2(cVar, this.$collector, this.this$0);
        channelFlow$collect$2.L$0 = obj;
        return channelFlow$collect$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelFlow$collect$2) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            C25523d<Object> dVar = this.$collector;
            C25321m<Object> c = this.this$0.mo60364c((C25235z) this.L$0);
            this.label = 1;
            Object a = FlowKt__ChannelsKt.m60670a(dVar, c, true, this);
            if (a != coroutineSingletons) {
                a = C21050d.f52856a;
            }
            if (a == coroutineSingletons) {
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
