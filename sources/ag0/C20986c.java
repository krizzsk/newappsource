package ag0;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import lh0.C24289p;
import lh0.C24307v;
import mf0.C24362h;
import ug0.C25066c;
import ug0.C25069e;
import zf0.C25432c;
import zf0.C25435d0;
import zg0.C25498g;

/* renamed from: ag0.c */
public interface C20986c {

    /* renamed from: ag0.c$a */
    public static final class C20987a {
        /* renamed from: a */
        public static C25066c m49140a(C20986c cVar) {
            C24362h.m61211f(cVar, "this");
            C25432c d = DescriptorUtilsKt.m60283d(cVar);
            if (d == null) {
                return null;
            }
            if (C24289p.m60918h(d)) {
                d = null;
            }
            if (d == null) {
                return null;
            }
            return DescriptorUtilsKt.m60282c(d);
        }
    }

    /* renamed from: e */
    C25435d0 mo53065e();

    /* renamed from: f */
    C25066c mo53066f();

    /* renamed from: g */
    Map<C25069e, C25498g<?>> mo53067g();

    C24307v getType();
}
