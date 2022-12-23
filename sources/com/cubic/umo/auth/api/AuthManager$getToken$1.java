package com.cubic.umo.auth.api;

import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@C23413c(mo58554c = "com.cubic.umo.auth.api.AuthManager", mo58555f = "AuthManager.kt", mo58556l = {120, 129}, mo58557m = "getToken")
@Metadata(mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class AuthManager$getToken$1 extends ContinuationImpl {
    public Object L$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AuthManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthManager$getToken$1(AuthManager authManager, C23349c<? super AuthManager$getToken$1> cVar) {
        super(cVar);
        this.this$0 = authManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo11603d(false, this);
    }
}
