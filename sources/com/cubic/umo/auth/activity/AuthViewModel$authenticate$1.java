package com.cubic.umo.auth.activity;

import bf0.C21050d;
import bi0.C21065d;
import com.cubic.umo.auth.CubicAuth;
import com.cubic.umo.auth.api.AuthManager;
import com.cubic.umo.auth.database.AuthDatabase;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import mf0.C24362h;
import p122i7.C5298b;
import p170m7.C5716c;
import p335z7.C7492a;
import p584jl.C17885a;
import wh0.C25177g;
import wh0.C25235z;

@C23413c(mo58554c = "com.cubic.umo.auth.activity.AuthViewModel$authenticate$1", mo58555f = "AuthViewModel.kt", mo58556l = {}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class AuthViewModel$authenticate$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public final /* synthetic */ String $code;
    public int label;
    public final /* synthetic */ AuthViewModel this$0;

    @C23413c(mo58554c = "com.cubic.umo.auth.activity.AuthViewModel$authenticate$1$1", mo58555f = "AuthViewModel.kt", mo58556l = {36}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
    /* renamed from: com.cubic.umo.auth.activity.AuthViewModel$authenticate$1$1 */
    public static final class C22311 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
        public int label;

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            return new C22311(authViewModel, str, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22311) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C17885a.m44475z0(obj);
                String str = str;
                this.label = 1;
                obj = ((AuthManager) authViewModel.f7736b.getValue()).mo11602c(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                try {
                    C17885a.m44475z0(obj);
                } catch (Exception e) {
                    authViewModel.f7737c.postValue(new C5298b.C5299a(e));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C5716c cVar = (C5716c) obj;
            String d = ((AuthDatabase) CubicAuth.f7726a.getValue()).mo11612l().mo21489d(cVar.f18531a);
            C24362h.m61208c(d);
            authViewModel.f7737c.postValue(new C5298b.C5300b(cVar, d));
            return C21050d.f52856a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthViewModel$authenticate$1(AuthViewModel authViewModel, String str, C23349c<? super AuthViewModel$authenticate$1> cVar) {
        super(2, cVar);
        this.this$0 = authViewModel;
        this.$code = str;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new AuthViewModel$authenticate$1(this.this$0, this.$code, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((AuthViewModel$authenticate$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C17885a.m44475z0(obj);
            C21065d dVar = C7492a.f22973b;
            final AuthViewModel authViewModel = this.this$0;
            final String str = this.$code;
            C25177g.m63218b(dVar, (CoroutineContext) null, new C22311((C23349c<? super C22311>) null), 3);
            return C21050d.f52856a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
