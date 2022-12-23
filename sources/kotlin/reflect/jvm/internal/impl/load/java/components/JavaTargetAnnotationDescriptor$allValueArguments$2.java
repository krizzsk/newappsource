package kotlin.reflect.jvm.internal.impl.load.java.components;

import ig0.C23595b;
import java.util.EnumSet;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C23826d;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import lf0.C24225a;
import og0.C24587b;
import og0.C24590e;
import og0.C24598m;
import p389bl.C13637c;
import p583jk.C17875h;
import ug0.C25069e;
import zg0.C25493b;
import zg0.C25498g;

public final class JavaTargetAnnotationDescriptor$allValueArguments$2 extends Lambda implements C24225a<Map<C25069e, ? extends C25498g<? extends Object>>> {
    public final /* synthetic */ JavaTargetAnnotationDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JavaTargetAnnotationDescriptor$allValueArguments$2(JavaTargetAnnotationDescriptor javaTargetAnnotationDescriptor) {
        super(0);
        this.this$0 = javaTargetAnnotationDescriptor;
    }

    public final Object invoke() {
        C25493b bVar;
        C24587b bVar2 = this.this$0.f60588d;
        Map map = null;
        if (bVar2 instanceof C24590e) {
            Map<String, EnumSet<KotlinTarget>> map2 = C23926a.f60599a;
            bVar = C23926a.m59000a(((C24590e) bVar2).getElements());
        } else if (bVar2 instanceof C24598m) {
            Map<String, EnumSet<KotlinTarget>> map3 = C23926a.f60599a;
            bVar = C23926a.m59000a(C17875h.m44280D(bVar2));
        } else {
            bVar = null;
        }
        if (bVar != null) {
            map = C13637c.m34046A(new Pair(C23595b.f59672b, bVar));
        }
        if (map == null) {
            return C23826d.m58530U();
        }
        return map;
    }
}
