package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import bg0.C21053b;
import cg0.C21181l;
import java.util.Collection;
import kh0.C23789e;
import kh0.C23792h;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23909c;
import lf0.C24236l;
import mf0.C24362h;
import mf0.C24365j;
import p583jk.C17884p;
import p845um.C19958a;
import sf0.C24866j;
import ug0.C25065b;
import ug0.C25066c;
import ug0.C25067d;
import ug0.C25069e;
import zf0.C25432c;
import zf0.C25442g;
import zf0.C25485t;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.a */
public final class C23882a implements C21053b {

    /* renamed from: d */
    public static final C23883a f60407d = new C23883a();

    /* renamed from: e */
    public static final /* synthetic */ C24866j<Object>[] f60408e = {C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(C23882a.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* renamed from: f */
    public static final C25066c f60409f = C23872e.f60330i;

    /* renamed from: g */
    public static final C25069e f60410g;

    /* renamed from: h */
    public static final C25065b f60411h;

    /* renamed from: a */
    public final C25485t f60412a;

    /* renamed from: b */
    public final C24236l<C25485t, C25442g> f60413b;

    /* renamed from: c */
    public final C23789e f60414c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.a$a */
    public static final class C23883a {
    }

    static {
        C25067d dVar = C23872e.C23873a.f60365c;
        C25069e h = dVar.mo61598h();
        C24362h.m61210e(h, "cloneable.shortName()");
        f60410g = h;
        f60411h = C25065b.m62790l(dVar.mo61600i());
    }

    public C23882a() {
        throw null;
    }

    public C23882a(C23792h hVar, C23909c cVar) {
        JvmBuiltInClassDescriptorFactory$1 jvmBuiltInClassDescriptorFactory$1 = JvmBuiltInClassDescriptorFactory$1.f60391f;
        C24362h.m61211f(jvmBuiltInClassDescriptorFactory$1, "computeContainingDeclaration");
        this.f60412a = cVar;
        this.f60413b = jvmBuiltInClassDescriptorFactory$1;
        this.f60414c = hVar.mo59019d(new JvmBuiltInClassDescriptorFactory$cloneable$2(this, hVar));
    }

    /* renamed from: a */
    public final boolean mo53180a(C25066c cVar, C25069e eVar) {
        C24362h.m61211f(cVar, "packageFqName");
        C24362h.m61211f(eVar, "name");
        return C24362h.m61206a(eVar, f60410g) && C24362h.m61206a(cVar, f60409f);
    }

    /* renamed from: b */
    public final Collection<C25432c> mo53181b(C25066c cVar) {
        C24362h.m61211f(cVar, "packageFqName");
        if (C24362h.m61206a(cVar, f60409f)) {
            return C17884p.m44348S((C21181l) C19958a.m47435j(this.f60414c, f60408e[0]));
        }
        return EmptySet.f60175b;
    }

    /* renamed from: c */
    public final C25432c mo53182c(C25065b bVar) {
        C24362h.m61211f(bVar, "classId");
        if (C24362h.m61206a(bVar, f60411h)) {
            return (C21181l) C19958a.m47435j(this.f60414c, f60408e[0]);
        }
        return null;
    }
}
