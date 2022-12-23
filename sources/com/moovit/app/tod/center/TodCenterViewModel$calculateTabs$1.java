package com.moovit.app.tod.center;

import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@C23413c(mo58554c = "com.moovit.app.tod.center.TodCenterViewModel", mo58555f = "TodCenterViewModel.kt", mo58556l = {207, 220}, mo58557m = "calculateTabs")
@Metadata(mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
final class TodCenterViewModel$calculateTabs$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C15489a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodCenterViewModel$calculateTabs$1(C15489a aVar, C23349c<? super TodCenterViewModel$calculateTabs$1> cVar) {
        super(cVar);
        this.this$0 = aVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C15489a.m39630a(this.this$0, this);
    }
}
