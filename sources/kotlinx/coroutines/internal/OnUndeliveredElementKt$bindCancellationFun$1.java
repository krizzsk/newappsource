package kotlinx.coroutines.internal;

import bf0.C21050d;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import p389bl.C13637c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"E", "", "<anonymous parameter 0>", "Lbf0/d;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class OnUndeliveredElementKt$bindCancellationFun$1 extends Lambda implements C24236l<Throwable, C21050d> {
    public final /* synthetic */ CoroutineContext $context;
    public final /* synthetic */ E $element;
    public final /* synthetic */ C24236l<E, C21050d> $this_bindCancellationFun;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnUndeliveredElementKt$bindCancellationFun$1(C24236l<? super E, C21050d> lVar, E e, CoroutineContext coroutineContext) {
        super(1);
        this.$this_bindCancellationFun = lVar;
        this.$element = e;
        this.$context = coroutineContext;
    }

    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        C24236l<E, C21050d> lVar = this.$this_bindCancellationFun;
        E e = this.$element;
        CoroutineContext coroutineContext = this.$context;
        UndeliveredElementException b = OnUndeliveredElementKt.m60694b(lVar, e, (UndeliveredElementException) null);
        if (b != null) {
            C13637c.m34080w(coroutineContext, b);
        }
        return C21050d.f52856a;
    }
}
