package kotlinx.coroutines.flow.internal;

import bi0.C21077o;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import lf0.C24240p;
import wh0.C25201o;
import wh0.C25232y0;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"", "count", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(ILkotlin/coroutines/CoroutineContext$a;)Ljava/lang/Integer;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class SafeCollector_commonKt$checkContext$result$1 extends Lambda implements C24240p<Integer, CoroutineContext.C23827a, Integer> {
    public final /* synthetic */ SafeCollector<?> $this_checkContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SafeCollector_commonKt$checkContext$result$1(SafeCollector<?> safeCollector) {
        super(2);
        this.$this_checkContext = safeCollector;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i;
        int intValue = ((Number) obj).intValue();
        CoroutineContext.C23827a aVar = (CoroutineContext.C23827a) obj2;
        CoroutineContext.C23829b key = aVar.getKey();
        CoroutineContext.C23827a c = this.$this_checkContext.collectContext.mo53081c(key);
        int i2 = C25232y0.f63505j0;
        if (key != C25232y0.C25234b.f63506b) {
            if (aVar != c) {
                i = Integer.MIN_VALUE;
            } else {
                i = intValue + 1;
            }
            return Integer.valueOf(i);
        }
        C25232y0 y0Var = (C25232y0) c;
        C25232y0 y0Var2 = (C25232y0) aVar;
        while (true) {
            if (y0Var2 != null) {
                if (y0Var2 == y0Var || !(y0Var2 instanceof C21077o)) {
                    break;
                }
                C25201o c0 = ((C21077o) y0Var2).mo61778c0();
                if (c0 != null) {
                    y0Var2 = c0.getParent();
                } else {
                    y0Var2 = null;
                }
            } else {
                y0Var2 = null;
                break;
            }
        }
        if (y0Var2 == y0Var) {
            if (y0Var != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + y0Var2 + ", expected child of " + y0Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
