package com.moovit.commons.request;

import c70.C13778r;
import ce0.C21100e;
import com.appsflyer.ServerParameters;
import ff0.C23349c;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import p172m9.C5720b;
import p906wz.C20431c;
import p906wz.C20439j;
import wh0.C25192l;

/* renamed from: com.moovit.commons.request.a */
public final class C15752a {

    /* renamed from: a */
    public static final ThreadPoolExecutor f40992a = C5720b.m14033A(5, ServerParameters.NETWORK);

    /* renamed from: a */
    public static Object m40209a(C20431c cVar, ContinuationImpl continuationImpl) {
        ThreadPoolExecutor threadPoolExecutor = f40992a;
        C25192l lVar = new C25192l(1, C21100e.m49351l0(continuationImpl));
        lVar.mo61835t();
        C20439j jVar = new C20439j(cVar, lVar);
        lVar.mo61821f(new RequestExtKt$execute$2$1(jVar, threadPoolExecutor.submit(jVar)));
        Object s = lVar.mo61834s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    /* renamed from: b */
    public static CallbackFlowBuilder m40210b(C13778r rVar) {
        return new CallbackFlowBuilder(new RequestExtKt$executeMulti$2(rVar, f40992a, (C23349c<? super RequestExtKt$executeMulti$2>) null));
    }
}
