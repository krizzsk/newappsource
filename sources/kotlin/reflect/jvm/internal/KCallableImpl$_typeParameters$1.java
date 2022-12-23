package kotlin.reflect.jvm.internal;

import cf0.C21136j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import zf0.C25448i0;

@Metadata(mo59059d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, mo59060d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "kotlin.jvm.PlatformType", "R", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class KCallableImpl$_typeParameters$1 extends Lambda implements C24225a<List<? extends KTypeParameterImpl>> {
    public final /* synthetic */ KCallableImpl<R> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KCallableImpl$_typeParameters$1(KCallableImpl<? extends R> kCallableImpl) {
        super(0);
        this.this$0 = kCallableImpl;
    }

    public final Object invoke() {
        List<C25448i0> typeParameters = this.this$0.mo59298d().getTypeParameters();
        C24362h.m61210e(typeParameters, "descriptor.typeParameters");
        KCallableImpl<R> kCallableImpl = this.this$0;
        ArrayList arrayList = new ArrayList(C21136j.m49436X(typeParameters, 10));
        for (C25448i0 i0Var : typeParameters) {
            C24362h.m61210e(i0Var, "descriptor");
            arrayList.add(new KTypeParameterImpl(kCallableImpl, i0Var));
        }
        return arrayList;
    }
}
