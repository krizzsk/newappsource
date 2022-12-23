package com.cubic.umo.pass.domain.service;

import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@C23413c(mo58554c = "com.cubic.umo.pass.domain.service.BaseHttpService", mo58555f = "BaseHttpService.kt", mo58556l = {48}, mo58557m = "generateHeaders$suspendImpl")
@Metadata(mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class BaseHttpService$generateHeaders$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BaseHttpService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseHttpService$generateHeaders$1(BaseHttpService baseHttpService, C23349c<? super BaseHttpService$generateHeaders$1> cVar) {
        super(cVar);
        this.this$0 = baseHttpService;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BaseHttpService.m6017n(this.this$0, this);
    }
}
