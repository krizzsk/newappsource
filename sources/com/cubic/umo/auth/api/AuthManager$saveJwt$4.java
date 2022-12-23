package com.cubic.umo.auth.api;

import bf0.C21050d;
import com.cubic.umo.auth.api.model.OpenIdToken;
import com.cubic.umo.auth.api.model.UserJWT;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import mf0.C24362h;
import p170m7.C5714a;
import p170m7.C5715b;
import p584jl.C17885a;
import wh0.C25235z;

@C23413c(mo58554c = "com.cubic.umo.auth.api.AuthManager$saveJwt$4", mo58555f = "AuthManager.kt", mo58556l = {}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lm7/b;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class AuthManager$saveJwt$4 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C5715b>, Object> {
    public final /* synthetic */ UserJWT $jwt;
    public final /* synthetic */ OpenIdToken $openIdToken;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AuthManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthManager$saveJwt$4(AuthManager authManager, UserJWT userJWT, OpenIdToken openIdToken, C23349c<? super AuthManager$saveJwt$4> cVar) {
        super(2, cVar);
        this.this$0 = authManager;
        this.$jwt = userJWT;
        this.$openIdToken = openIdToken;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        AuthManager$saveJwt$4 authManager$saveJwt$4 = new AuthManager$saveJwt$4(this.this$0, this.$jwt, this.$openIdToken, cVar);
        authManager$saveJwt$4.L$0 = obj;
        return authManager$saveJwt$4;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((AuthManager$saveJwt$4) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        C5714a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C17885a.m44475z0(obj);
            C25235z zVar = (C25235z) this.L$0;
            C5714a a = this.this$0.f7748f.mo21486a(this.$jwt.f7782t);
            if (a == null) {
                aVar = null;
            } else {
                UserJWT userJWT = this.$jwt;
                AuthManager authManager = this.this$0;
                aVar = C5714a.m14030a(a.f18517a, userJWT.f7782t, userJWT.f7779q, userJWT.f7780r, userJWT.f7781s, userJWT.f7772j, userJWT.f7773k, userJWT.f7774l, Boolean.valueOf(userJWT.f7775m), userJWT.f7776n, userJWT.f7777o, userJWT.f7778p);
                authManager.f7748f.mo21490e(aVar);
            }
            if (aVar == null) {
                UserJWT userJWT2 = this.$jwt;
                AuthManager authManager2 = this.this$0;
                C5714a aVar2 = r3;
                C5714a aVar3 = new C5714a(0, userJWT2.f7782t, userJWT2.f7779q, userJWT2.f7780r, userJWT2.f7781s, userJWT2.f7772j, userJWT2.f7773k, userJWT2.f7774l, Boolean.valueOf(userJWT2.f7775m), userJWT2.f7776n, userJWT2.f7777o, userJWT2.f7778p);
                C5714a aVar4 = aVar2;
                authManager2.f7748f.mo21488c(aVar4);
                aVar = authManager2.f7748f.mo21486a(aVar4.f18518b);
                C24362h.m61208c(aVar);
            }
            return new C5715b(aVar, AuthManager.m5981a(this.this$0, aVar, this.$openIdToken));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
