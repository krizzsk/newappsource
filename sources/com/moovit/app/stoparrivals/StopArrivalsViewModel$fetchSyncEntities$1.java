package com.moovit.app.stoparrivals;

import com.moovit.network.model.ServerId;
import ff0.C23349c;
import gf0.C23413c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@C23413c(mo58554c = "com.moovit.app.stoparrivals.StopArrivalsViewModel", mo58555f = "StopArrivalsViewModel.kt", mo58556l = {411, 413}, mo58557m = "fetchSyncEntities")
@Metadata(mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
final class StopArrivalsViewModel$fetchSyncEntities$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C15322a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StopArrivalsViewModel$fetchSyncEntities$1(C15322a aVar, C23349c<? super StopArrivalsViewModel$fetchSyncEntities$1> cVar) {
        super(cVar);
        this.this$0 = aVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C15322a.m39194c(this.this$0, (ServerId) null, (List) null, this);
    }
}
