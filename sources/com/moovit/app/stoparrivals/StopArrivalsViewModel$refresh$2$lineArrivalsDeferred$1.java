package com.moovit.app.stoparrivals;

import bf0.C21050d;
import com.moovit.network.model.ServerId;
import ff0.C23349c;
import gf0.C23413c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p584jl.C17885a;
import p952yy.C20787c;
import wh0.C25235z;

@C23413c(mo58554c = "com.moovit.app.stoparrivals.StopArrivalsViewModel$refresh$2$lineArrivalsDeferred$1", mo58555f = "StopArrivalsViewModel.kt", mo58556l = {157}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "", "Lyy/c;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class StopArrivalsViewModel$refresh$2$lineArrivalsDeferred$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super List<? extends C20787c>>, Object> {
    public final /* synthetic */ List<ServerId> $lineIds;
    public final /* synthetic */ ServerId $stopId;
    public int label;
    public final /* synthetic */ C15322a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StopArrivalsViewModel$refresh$2$lineArrivalsDeferred$1(C15322a aVar, ServerId serverId, List<ServerId> list, C23349c<? super StopArrivalsViewModel$refresh$2$lineArrivalsDeferred$1> cVar) {
        super(2, cVar);
        this.this$0 = aVar;
        this.$stopId = serverId;
        this.$lineIds = list;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new StopArrivalsViewModel$refresh$2$lineArrivalsDeferred$1(this.this$0, this.$stopId, this.$lineIds, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((StopArrivalsViewModel$refresh$2$lineArrivalsDeferred$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            C15322a aVar = this.this$0;
            ServerId serverId = this.$stopId;
            List<ServerId> list = this.$lineIds;
            this.label = 1;
            obj = C15322a.m39192a(aVar, serverId, list, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C17885a.m44475z0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
