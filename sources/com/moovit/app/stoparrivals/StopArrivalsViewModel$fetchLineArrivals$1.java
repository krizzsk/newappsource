package com.moovit.app.stoparrivals;

import com.moovit.network.model.ServerId;
import ff0.C23349c;
import gf0.C23413c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@C23413c(mo58554c = "com.moovit.app.stoparrivals.StopArrivalsViewModel", mo58555f = "StopArrivalsViewModel.kt", mo58556l = {442, 443, 453, 454}, mo58557m = "fetchLineArrivals")
@Metadata(mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
final class StopArrivalsViewModel$fetchLineArrivals$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C15322a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StopArrivalsViewModel$fetchLineArrivals$1(C15322a aVar, C23349c<? super StopArrivalsViewModel$fetchLineArrivals$1> cVar) {
        super(cVar);
        this.this$0 = aVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C15322a.m39192a(this.this$0, (ServerId) null, (List) null, this);
    }
}
