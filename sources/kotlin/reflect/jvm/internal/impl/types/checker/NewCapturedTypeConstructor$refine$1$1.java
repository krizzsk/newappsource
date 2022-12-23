package kotlin.reflect.jvm.internal.impl.types.checker;

import cf0.C21136j;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import lh0.C24306u0;
import mh0.C24378d;

public final class NewCapturedTypeConstructor$refine$1$1 extends Lambda implements C24225a<List<? extends C24306u0>> {
    public final /* synthetic */ C24378d $kotlinTypeRefiner;
    public final /* synthetic */ NewCapturedTypeConstructor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor$refine$1$1(NewCapturedTypeConstructor newCapturedTypeConstructor, C24378d dVar) {
        super(0);
        this.this$0 = newCapturedTypeConstructor;
        this.$kotlinTypeRefiner = dVar;
    }

    public final Object invoke() {
        Iterable<C24306u0> iterable = (List) this.this$0.f61364e.getValue();
        if (iterable == null) {
            iterable = EmptyList.f60173b;
        }
        C24378d dVar = this.$kotlinTypeRefiner;
        ArrayList arrayList = new ArrayList(C21136j.m49436X(iterable, 10));
        for (C24306u0 T0 : iterable) {
            arrayList.add(T0.mo59560T0(dVar));
        }
        return arrayList;
    }
}
