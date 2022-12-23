package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import lf0.C24240p;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"", "acc", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/CoroutineContext$a;)Ljava/lang/String;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class CombinedContext$toString$1 extends Lambda implements C24240p<String, CoroutineContext.C23827a, String> {

    /* renamed from: f */
    public static final CombinedContext$toString$1 f60188f = new CombinedContext$toString$1();

    public CombinedContext$toString$1() {
        super(2);
    }

    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        String str = (String) obj;
        CoroutineContext.C23827a aVar = (CoroutineContext.C23827a) obj2;
        C24362h.m61211f(str, "acc");
        C24362h.m61211f(aVar, "element");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return aVar.toString();
        }
        return str + ", " + aVar;
    }
}
