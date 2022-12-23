package com.cubic.umo.pass.prefs;

import bf0.C21049c;
import bf0.C21050d;
import com.cubic.umo.Environment;
import com.cubic.umo.pass.domain.api.APIFactory;
import com.cubic.umo.pass.model.AgencyInformation;
import com.cubic.umo.pass.prefs.Cache;
import ff0.C23349c;
import gf0.C23413c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p235r7.C6261b;
import p584jl.C17885a;
import wh0.C25235z;

@C23413c(mo58554c = "com.cubic.umo.pass.prefs.Cache$Companion$getInstance$1", mo58555f = "Cache.kt", mo58556l = {136}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class Cache$Companion$getInstance$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public final /* synthetic */ Environment $environment;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Cache$Companion$getInstance$1(Environment environment, C23349c<? super Cache$Companion$getInstance$1> cVar) {
        super(2, cVar);
        this.$environment = environment;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new Cache$Companion$getInstance$1(this.$environment, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((Cache$Companion$getInstance$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            this.label = 1;
            obj = ((C6261b) APIFactory.f7839b.getValue()).mo11663d(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                C17885a.m44475z0(obj);
            } catch (Exception unused) {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List<AgencyInformation> list = (List) obj;
        C21049c<Cache> cVar = Cache.f8326d;
        Cache.m6088a(Cache.C2259a.m6091b(), list);
        Cache.C2259a.m6091b().f8329c = list;
        Cache.C2259a.m6091b().mo11825b().edit().putString("environment", this.$environment.getBaseUrl()).apply();
        Cache.C2259a.m6091b().mo11825b().edit().putLong("cached_time", System.currentTimeMillis()).apply();
        return C21050d.f52856a;
    }
}
