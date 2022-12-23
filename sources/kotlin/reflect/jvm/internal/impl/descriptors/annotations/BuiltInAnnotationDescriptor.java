package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import ag0.C20986c;
import bf0.C21049c;
import java.util.Map;
import kotlin.C23812a;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import lh0.C24307v;
import mf0.C24362h;
import ug0.C25066c;
import ug0.C25069e;
import zf0.C25435d0;
import zg0.C25498g;

public final class BuiltInAnnotationDescriptor implements C20986c {

    /* renamed from: a */
    public final C23867c f60439a;

    /* renamed from: b */
    public final C25066c f60440b;

    /* renamed from: c */
    public final Map<C25069e, C25498g<?>> f60441c;

    /* renamed from: d */
    public final C21049c f60442d = C23812a.m58431a(LazyThreadSafetyMode.PUBLICATION, new BuiltInAnnotationDescriptor$type$2(this));

    public BuiltInAnnotationDescriptor(C23867c cVar, C25066c cVar2, Map<C25069e, ? extends C25498g<?>> map) {
        C24362h.m61211f(cVar, "builtIns");
        C24362h.m61211f(cVar2, "fqName");
        this.f60439a = cVar;
        this.f60440b = cVar2;
        this.f60441c = map;
    }

    /* renamed from: e */
    public final C25435d0 mo53065e() {
        return C25435d0.f63736a;
    }

    /* renamed from: f */
    public final C25066c mo53066f() {
        return this.f60440b;
    }

    /* renamed from: g */
    public final Map<C25069e, C25498g<?>> mo53067g() {
        return this.f60441c;
    }

    public final C24307v getType() {
        Object value = this.f60442d.getValue();
        C24362h.m61210e(value, "<get-type>(...)");
        return (C24307v) value;
    }
}
