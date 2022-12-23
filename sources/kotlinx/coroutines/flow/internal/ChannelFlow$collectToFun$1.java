package kotlinx.coroutines.flow.internal;

import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p584jl.C17885a;
import yh0.C25319k;

@C23413c(mo58554c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", mo58555f = "ChannelFlow.kt", mo58556l = {60}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo59060d2 = {"T", "Lyh0/k;", "it", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class ChannelFlow$collectToFun$1 extends SuspendLambda implements C24240p<C25319k<Object>, C23349c<? super C21050d>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C24212a<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collectToFun$1(C24212a<Object> aVar, C23349c<? super ChannelFlow$collectToFun$1> cVar) {
        super(2, cVar);
        this.this$0 = aVar;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this.this$0, cVar);
        channelFlow$collectToFun$1.L$0 = obj;
        return channelFlow$collectToFun$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelFlow$collectToFun$1) create((C25319k) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            C24212a<Object> aVar = this.this$0;
            this.label = 1;
            if (aVar.mo60358b((C25319k) this.L$0, this) == coroutineSingletons) {
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
