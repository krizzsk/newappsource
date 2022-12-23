package cg0;

import java.util.Collection;
import java.util.List;
import jh0.C23735i;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import lh0.C24274i0;
import lh0.C24307v;
import mf0.C24362h;
import zf0.C25437e;
import zf0.C25448i0;

/* renamed from: cg0.e */
public final class C21166e implements C24274i0 {

    /* renamed from: a */
    public final /* synthetic */ AbstractTypeAliasDescriptor f53058a;

    public C21166e(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        this.f53058a = abstractTypeAliasDescriptor;
    }

    public final List<C25448i0> getParameters() {
        List<? extends C25448i0> list = ((C23735i) this.f53058a).f59960r;
        if (list != null) {
            return list;
        }
        C24362h.m61217l("typeConstructorParameters");
        throw null;
    }

    /* renamed from: m */
    public final C23867c mo53458m() {
        return DescriptorUtilsKt.m60284e(this.f53058a);
    }

    /* renamed from: n */
    public final Collection<C24307v> mo53459n() {
        Collection<C24307v> n = ((C23735i) this.f53058a).mo58973x0().mo60411O0().mo53459n();
        C24362h.m61210e(n, "declarationDescriptor.un…pe.constructor.supertypes");
        return n;
    }

    /* renamed from: o */
    public final C25437e mo53460o() {
        return this.f53058a;
    }

    /* renamed from: p */
    public final boolean mo53461p() {
        return true;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("[typealias ");
        k.append(this.f53058a.getName().mo61604f());
        k.append(']');
        return k.toString();
    }
}
