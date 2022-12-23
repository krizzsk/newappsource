package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import lf0.C24225a;
import mf0.C24362h;
import tf0.C24973i;

@Metadata(mo59059d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo59060d2 = {"<anonymous>", "", "Ljava/lang/reflect/Type;", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
final class KTypeImpl$arguments$2$parameterizedTypeArguments$2 extends Lambda implements C24225a<List<? extends Type>> {
    public final /* synthetic */ KTypeImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KTypeImpl$arguments$2$parameterizedTypeArguments$2(KTypeImpl kTypeImpl) {
        super(0);
        this.this$0 = kTypeImpl;
    }

    public final Object invoke() {
        Type type;
        C24973i.C24974a<Type> aVar = this.this$0.f60271b;
        if (aVar == null) {
            type = null;
        } else {
            type = aVar.invoke();
        }
        C24362h.m61208c(type);
        return ReflectClassUtilKt.m58951c(type);
    }
}
