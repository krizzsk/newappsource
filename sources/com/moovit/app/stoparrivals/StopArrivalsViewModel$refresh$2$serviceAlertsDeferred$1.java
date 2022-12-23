package com.moovit.app.stoparrivals;

import bf0.C21050d;
import com.google.android.gms.tasks.Task;
import com.moovit.MoovitExecutors;
import com.moovit.commons.async.AsyncExtKt;
import com.moovit.network.model.ServerId;
import ff0.C23349c;
import gf0.C23413c;
import j80.C12775d;
import j80.C12778f;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import mf0.C24362h;
import p028ba.C1512f;
import p584jl.C17885a;
import wh0.C25235z;

@C23413c(mo58554c = "com.moovit.app.stoparrivals.StopArrivalsViewModel$refresh$2$serviceAlertsDeferred$1", mo58555f = "StopArrivalsViewModel.kt", mo58556l = {158}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\u0010\u0006\u001aB\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00050\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "", "Lcom/moovit/network/model/ServerId;", "kotlin.jvm.PlatformType", "Lj80/d;", "", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class StopArrivalsViewModel$refresh$2$serviceAlertsDeferred$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super Map<ServerId, C12775d>>, Object> {
    public final /* synthetic */ ServerId $stopId;
    public int label;
    public final /* synthetic */ C15322a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StopArrivalsViewModel$refresh$2$serviceAlertsDeferred$1(C15322a aVar, ServerId serverId, C23349c<? super StopArrivalsViewModel$refresh$2$serviceAlertsDeferred$1> cVar) {
        super(2, cVar);
        this.this$0 = aVar;
        this.$stopId = serverId;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new StopArrivalsViewModel$refresh$2$serviceAlertsDeferred$1(this.this$0, this.$stopId, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((StopArrivalsViewModel$refresh$2$serviceAlertsDeferred$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            C12778f fVar = this.this$0.f39633e;
            Task<TContinuationResult> onSuccessTask = fVar.mo39624d(false).onSuccessTask(MoovitExecutors.COMPUTATION, new C1512f(8, fVar, this.$stopId));
            C24362h.m61210e(onSuccessTask, "serviceAlertsManager.get…iceAlertsByStopId(stopId)");
            this.label = 1;
            obj = AsyncExtKt.m40163a(onSuccessTask, this);
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
