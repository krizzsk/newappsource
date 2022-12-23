package com.cubic.umo.pass.internal;

import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@C23413c(mo58554c = "com.cubic.umo.pass.internal.AccountController", mo58555f = "AccountController.kt", mo58556l = {41}, mo58557m = "changeAgency")
@Metadata(mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class AccountController$changeAgency$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AccountController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountController$changeAgency$1(AccountController accountController, C23349c<? super AccountController$changeAgency$1> cVar) {
        super(cVar);
        this.this$0 = accountController;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo11664a((String) null, this);
    }
}
