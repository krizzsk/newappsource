package kotlin.reflect.jvm.internal;

import cf0.C21136j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import zf0.C25448i0;

@Metadata(mo59059d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo59060d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "kotlin.jvm.PlatformType", "T", "", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class KClassImpl$Data$typeParameters$2 extends Lambda implements C24225a<List<? extends KTypeParameterImpl>> {
    public final /* synthetic */ KClassImpl<T>.Data this$0;
    public final /* synthetic */ KClassImpl<T> this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$typeParameters$2(KClassImpl<T>.Data data, KClassImpl<T> kClassImpl) {
        super(0);
        this.this$0 = data;
        this.this$1 = kClassImpl;
    }

    public final Object invoke() {
        List<C25448i0> r = this.this$0.mo59315a().mo53514r();
        C24362h.m61210e(r, "descriptor.declaredTypeParameters");
        KClassImpl<T> kClassImpl = this.this$1;
        ArrayList arrayList = new ArrayList(C21136j.m49436X(r, 10));
        for (C25448i0 i0Var : r) {
            C24362h.m61210e(i0Var, "descriptor");
            arrayList.add(new KTypeParameterImpl(kClassImpl, i0Var));
        }
        return arrayList;
    }
}
