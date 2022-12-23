package com.cubic.umo.pass.repo;

import bf0.C21050d;
import com.cubic.umo.pass.model.AgencyInformation;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p299w7.C7001a;
import p584jl.C17885a;
import wh0.C25235z;

@C23413c(mo58554c = "com.cubic.umo.pass.repo.UserRepo$changeAgency$1", mo58555f = "UserRepo.kt", mo58556l = {112}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class UserRepo$changeAgency$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public final /* synthetic */ String $agencyId;
    public final /* synthetic */ C7001a<AgencyInformation> $callback;
    public Object L$0;
    public int label;
    public final /* synthetic */ C2260a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$changeAgency$1(C7001a<AgencyInformation> aVar, C2260a aVar2, String str, C23349c<? super UserRepo$changeAgency$1> cVar) {
        super(2, cVar);
        this.$callback = aVar;
        this.this$0 = aVar2;
        this.$agencyId = str;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new UserRepo$changeAgency$1(this.$callback, this.this$0, this.$agencyId, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((UserRepo$changeAgency$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        C7001a<AgencyInformation> aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            C7001a<AgencyInformation> aVar2 = this.$callback;
            C2260a aVar3 = this.this$0;
            String str = this.$agencyId;
            this.L$0 = aVar2;
            this.label = 1;
            Object b = aVar3.mo11666b(str, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = aVar2;
            obj = b;
        } else if (i == 1) {
            aVar = (C7001a) this.L$0;
            try {
                C17885a.m44475z0(obj);
            } catch (Exception e) {
                this.$callback.onError(e);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aVar.onSuccess(obj);
        return C21050d.f52856a;
    }
}
