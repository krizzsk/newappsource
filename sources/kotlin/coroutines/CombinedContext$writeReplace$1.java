package kotlin.coroutines;

import bf0.C21050d;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import lf0.C24240p;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Lbf0/d;", "<anonymous parameter 0>", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(Lbf0/d;Lkotlin/coroutines/CoroutineContext$a;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class CombinedContext$writeReplace$1 extends Lambda implements C24240p<C21050d, CoroutineContext.C23827a, C21050d> {
    public final /* synthetic */ CoroutineContext[] $elements;
    public final /* synthetic */ Ref$IntRef $index;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombinedContext$writeReplace$1(CoroutineContext[] coroutineContextArr, Ref$IntRef ref$IntRef) {
        super(2);
        this.$elements = coroutineContextArr;
        this.$index = ref$IntRef;
    }

    public final Object invoke(Object obj, Object obj2) {
        CoroutineContext.C23827a aVar = (CoroutineContext.C23827a) obj2;
        C24362h.m61211f((C21050d) obj, "<anonymous parameter 0>");
        C24362h.m61211f(aVar, "element");
        CoroutineContext[] coroutineContextArr = this.$elements;
        Ref$IntRef ref$IntRef = this.$index;
        int i = ref$IntRef.element;
        ref$IntRef.element = i + 1;
        coroutineContextArr[i] = aVar;
        return C21050d.f52856a;
    }
}
