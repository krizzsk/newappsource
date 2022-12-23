package com.cubic.umo.pass.domain.service;

import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@C23413c(mo58554c = "com.cubic.umo.pass.domain.service.AccountService", mo58555f = "AccountService.kt", mo58556l = {201, 199}, mo58557m = "changeAgency")
@Metadata(mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class AccountService$changeAgency$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AccountService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountService$changeAgency$1(AccountService accountService, C23349c<? super AccountService$changeAgency$1> cVar) {
        super(cVar);
        this.this$0 = accountService;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo11660b((String) null, this);
    }
}
