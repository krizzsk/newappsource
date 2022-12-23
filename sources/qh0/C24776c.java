package qh0;

import ag0.C20989e;
import java.util.List;
import kotlin.collections.C23825c;
import kotlin.reflect.jvm.internal.impl.builtins.C23869d;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import lh0.C24299r0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import mh0.C24376c;
import p583jk.C17875h;
import qh0.C24770a;
import zf0.C25432c;
import zf0.C25448i0;
import zf0.C25452k0;
import zf0.C25485t;

/* renamed from: qh0.c */
public final class C24776c implements C24770a {

    /* renamed from: a */
    public static final C24776c f62680a = new C24776c();

    /* renamed from: a */
    public final String mo60274a(C23900c cVar) {
        return C24770a.C24771a.m62306a(this, cVar);
    }

    /* renamed from: b */
    public final boolean mo60275b(C23900c cVar) {
        C24312z zVar;
        C24362h.m61211f(cVar, "functionDescriptor");
        C25452k0 k0Var = cVar.mo53442h().get(1);
        C23869d.C23871b bVar = C23869d.f60317d;
        C24362h.m61210e(k0Var, "secondParameter");
        C25485t j = DescriptorUtilsKt.m60289j(k0Var);
        bVar.getClass();
        C25432c a = FindClassInModuleKt.m58735a(j, C23872e.C23873a.f60350P);
        if (a == null) {
            zVar = null;
        } else {
            C20989e.C20990a.C20991a aVar = C20989e.C20990a.f52739a;
            List<C25448i0> parameters = a.mo53481j().getParameters();
            C24362h.m61210e(parameters, "kPropertyClass.typeConstructor.parameters");
            Object C0 = C23825c.m58491C0(parameters);
            C24362h.m61210e(C0, "kPropertyClass.typeConstructor.parameters.single()");
            zVar = KotlinTypeFactory.m60476e(aVar, a, C17875h.m44280D(new StarProjectionImpl((C25448i0) C0)));
        }
        if (zVar == null) {
            return false;
        }
        C24307v type = k0Var.getType();
        C24362h.m61210e(type, "secondParameter.type");
        return C24376c.f61714a.mo60531f(zVar, C24299r0.m60977i(type));
    }

    public final String getDescription() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }
}
