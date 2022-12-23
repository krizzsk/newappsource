package com.cubic.umo.auth.api;

import bf0.C21050d;
import com.cubic.umo.auth.api.model.AnonymousJWT;
import com.cubic.umo.auth.api.model.OpenIdToken;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p158l7.C5631a;
import p170m7.C5714a;
import p170m7.C5715b;
import p584jl.C17885a;
import wh0.C25235z;

@C23413c(mo58554c = "com.cubic.umo.auth.api.AuthManager$saveJwt$2", mo58555f = "AuthManager.kt", mo58556l = {}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lm7/b;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class AuthManager$saveJwt$2 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C5715b>, Object> {
    public final /* synthetic */ AnonymousJWT $jwt;
    public final /* synthetic */ OpenIdToken $openIdToken;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AuthManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthManager$saveJwt$2(AuthManager authManager, AnonymousJWT anonymousJWT, OpenIdToken openIdToken, C23349c<? super AuthManager$saveJwt$2> cVar) {
        super(2, cVar);
        this.this$0 = authManager;
        this.$jwt = anonymousJWT;
        this.$openIdToken = openIdToken;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        AuthManager$saveJwt$2 authManager$saveJwt$2 = new AuthManager$saveJwt$2(this.this$0, this.$jwt, this.$openIdToken, cVar);
        authManager$saveJwt$2.L$0 = obj;
        return authManager$saveJwt$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((AuthManager$saveJwt$2) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        C5714a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C17885a.m44475z0(obj);
            C25235z zVar = (C25235z) this.L$0;
            if (this.this$0.f7748f.mo21487b() == null) {
                aVar = null;
            } else {
                AnonymousJWT anonymousJWT = this.$jwt;
                AuthManager authManager = this.this$0;
                aVar = C5714a.m14030a(-1, anonymousJWT.f7757p, anonymousJWT.f7754m, anonymousJWT.f7755n, anonymousJWT.f7756o, (Integer) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null);
                authManager.f7748f.mo21490e(aVar);
            }
            if (aVar == null) {
                AnonymousJWT anonymousJWT2 = this.$jwt;
                AuthManager authManager2 = this.this$0;
                C5714a aVar2 = r3;
                C5714a aVar3 = new C5714a(-1, anonymousJWT2.f7757p, anonymousJWT2.f7754m, anonymousJWT2.f7755n, anonymousJWT2.f7756o, (Integer) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null);
                C5631a aVar4 = authManager2.f7748f;
                C5714a aVar5 = aVar2;
                aVar4.mo21488c(aVar5);
                aVar = aVar5;
            }
            return new C5715b(aVar, AuthManager.m5981a(this.this$0, aVar, this.$openIdToken));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
