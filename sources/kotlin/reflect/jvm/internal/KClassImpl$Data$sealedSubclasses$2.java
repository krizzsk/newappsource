package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import tf0.C24979k;
import zf0.C25432c;

@Metadata(mo59059d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00030\u0002 \u0004*\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo59060d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "kotlin.jvm.PlatformType", "", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class KClassImpl$Data$sealedSubclasses$2 extends Lambda implements C24225a<List<? extends KClassImpl<? extends T>>> {
    public final /* synthetic */ KClassImpl<T>.Data this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$sealedSubclasses$2(KClassImpl<T>.Data data) {
        super(0);
        this.this$0 = data;
    }

    public final Object invoke() {
        KClassImpl kClassImpl;
        Collection<C25432c> B = this.this$0.mo59315a().mo53504B();
        C24362h.m61210e(B, "descriptor.sealedSubclasses");
        ArrayList arrayList = new ArrayList();
        for (C25432c cVar : B) {
            if (cVar != null) {
                Class<?> g = C24979k.m62680g(cVar);
                if (g == null) {
                    kClassImpl = null;
                } else {
                    kClassImpl = new KClassImpl(g);
                }
                if (kClassImpl != null) {
                    arrayList.add(kClassImpl);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            }
        }
        return arrayList;
    }
}
