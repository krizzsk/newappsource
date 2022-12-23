package kotlin.reflect.jvm.internal;

import cf0.C21136j;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import lh0.C24307v;
import mf0.C24362h;

@Metadata(mo59059d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, mo59060d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "kotlin.jvm.PlatformType", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class KTypeParameterImpl$upperBounds$2 extends Lambda implements C24225a<List<? extends KTypeImpl>> {
    public final /* synthetic */ KTypeParameterImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KTypeParameterImpl$upperBounds$2(KTypeParameterImpl kTypeParameterImpl) {
        super(0);
        this.this$0 = kTypeParameterImpl;
    }

    public final Object invoke() {
        List<C24307v> upperBounds = this.this$0.f60276b.getUpperBounds();
        C24362h.m61210e(upperBounds, "descriptor.upperBounds");
        ArrayList arrayList = new ArrayList(C21136j.m49436X(upperBounds, 10));
        for (C24307v kTypeImpl : upperBounds) {
            arrayList.add(new KTypeImpl(kTypeImpl, (C24225a<? extends Type>) null));
        }
        return arrayList;
    }
}
