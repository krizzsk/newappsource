package kotlin.coroutines.intrinsics;

import ff0.C23349c;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import lf0.C24236l;
import mf0.C24362h;
import mf0.C24369n;
import p584jl.C17885a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo59060d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "", "label", "I", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1})
/* renamed from: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2 */
public final class C23831xa50de661 extends ContinuationImpl {
    public final /* synthetic */ C24236l $this_createCoroutineUnintercepted$inlined;
    private int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23831xa50de661(C23349c cVar, CoroutineContext coroutineContext, C24236l lVar) {
        super(cVar, coroutineContext);
        this.$this_createCoroutineUnintercepted$inlined = lVar;
        C24362h.m61209d(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            this.label = 1;
            C17885a.m44475z0(obj);
            C24362h.m61209d(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
            C24236l lVar = this.$this_createCoroutineUnintercepted$inlined;
            C24369n.m61246b(1, lVar);
            return lVar.invoke(this);
        } else if (i == 1) {
            this.label = 2;
            C17885a.m44475z0(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
