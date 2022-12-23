package kotlinx.coroutines.internal;

import bi0.C21083u;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import lf0.C24240p;
import wh0.C25209q1;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Lbi0/u;", "state", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(Lbi0/u;Lkotlin/coroutines/CoroutineContext$a;)Lbi0/u;", "<no name provided>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class ThreadContextKt$updateState$1 extends Lambda implements C24240p<C21083u, CoroutineContext.C23827a, C21083u> {

    /* renamed from: f */
    public static final ThreadContextKt$updateState$1 f61498f = new ThreadContextKt$updateState$1();

    public ThreadContextKt$updateState$1() {
        super(2);
    }

    public final Object invoke(Object obj, Object obj2) {
        C21083u uVar = (C21083u) obj;
        CoroutineContext.C23827a aVar = (CoroutineContext.C23827a) obj2;
        if (aVar instanceof C25209q1) {
            C25209q1<Object> q1Var = (C25209q1) aVar;
            String S = q1Var.mo61851S(uVar.f52897a);
            Object[] objArr = uVar.f52898b;
            int i = uVar.f52900d;
            objArr[i] = S;
            C25209q1<Object>[] q1VarArr = uVar.f52899c;
            uVar.f52900d = i + 1;
            q1VarArr[i] = q1Var;
        }
        return uVar;
    }
}
