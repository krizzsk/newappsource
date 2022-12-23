package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import lf0.C24240p;
import wh0.C25209q1;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"", "countOrElement", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext$a;)Ljava/lang/Object;", "<no name provided>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class ThreadContextKt$countAll$1 extends Lambda implements C24240p<Object, CoroutineContext.C23827a, Object> {

    /* renamed from: f */
    public static final ThreadContextKt$countAll$1 f61496f = new ThreadContextKt$countAll$1();

    public ThreadContextKt$countAll$1() {
        super(2);
    }

    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        int i;
        CoroutineContext.C23827a aVar = (CoroutineContext.C23827a) obj2;
        if (!(aVar instanceof C25209q1)) {
            return obj;
        }
        if (obj instanceof Integer) {
            num = (Integer) obj;
        } else {
            num = null;
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = 1;
        }
        if (i == 0) {
            return aVar;
        }
        return Integer.valueOf(i + 1);
    }
}
