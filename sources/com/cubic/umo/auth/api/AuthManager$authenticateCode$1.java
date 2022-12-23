package com.cubic.umo.auth.api;

import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@C23413c(mo58554c = "com.cubic.umo.auth.api.AuthManager", mo58555f = "AuthManager.kt", mo58556l = {194, 194}, mo58557m = "authenticateCode$auth_release")
@Metadata(mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class AuthManager$authenticateCode$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AuthManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthManager$authenticateCode$1(AuthManager authManager, C23349c<? super AuthManager$authenticateCode$1> cVar) {
        super(cVar);
        this.this$0 = authManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo11602c((String) null, this);
    }
}
