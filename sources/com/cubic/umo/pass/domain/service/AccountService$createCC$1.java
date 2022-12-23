package com.cubic.umo.pass.domain.service;

import com.cubic.umo.pass.model.CCPaymentInfo;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@C23413c(mo58554c = "com.cubic.umo.pass.domain.service.AccountService", mo58555f = "AccountService.kt", mo58556l = {162, 160}, mo58557m = "createCC")
@Metadata(mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class AccountService$createCC$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AccountService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountService$createCC$1(AccountService accountService, C23349c<? super AccountService$createCC$1> cVar) {
        super(cVar);
        this.this$0 = accountService;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo11659a((String) null, (CCPaymentInfo) null, this);
    }
}
