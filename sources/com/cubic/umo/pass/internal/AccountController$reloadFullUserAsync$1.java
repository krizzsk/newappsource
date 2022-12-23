package com.cubic.umo.pass.internal;

import bf0.C21050d;
import com.cubic.umo.exception.SDKException;
import ff0.C23349c;
import gf0.C23413c;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p584jl.C17885a;
import wh0.C25235z;

@C23413c(mo58554c = "com.cubic.umo.pass.internal.AccountController$reloadFullUserAsync$1", mo58555f = "AccountController.kt", mo58556l = {49}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class AccountController$reloadFullUserAsync$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public int label;
    public final /* synthetic */ AccountController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountController$reloadFullUserAsync$1(AccountController accountController, C23349c<? super AccountController$reloadFullUserAsync$1> cVar) {
        super(2, cVar);
        this.this$0 = accountController;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new AccountController$reloadFullUserAsync$1(this.this$0, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((AccountController$reloadFullUserAsync$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            AccountController accountController = this.this$0;
            this.label = 1;
            if (accountController.f7856b.mo11661c(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                C17885a.m44475z0(obj);
            } catch (SDKException | IOException unused) {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C21050d.f52856a;
    }
}
