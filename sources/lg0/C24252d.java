package lg0;

import cf0.C21136j;
import cg0.C21161c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kg0.C23780d;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import mg0.C24372b;
import og0.C24595j;
import og0.C24609x;
import p583jk.C17875h;
import zf0.C25442g;

/* renamed from: lg0.d */
public final class C24252d extends C21161c {

    /* renamed from: l */
    public final C23780d f61534l;

    /* renamed from: m */
    public final C24609x f61535m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24252d(C23780d dVar, C24609x xVar, int i, C25442g gVar) {
        super(dVar.f60080a.f60055a, gVar, new LazyJavaAnnotations(dVar, xVar, false), xVar.getName(), Variance.INVARIANT, false, i, dVar.f60080a.f60067m);
        C24362h.m61211f(xVar, "javaTypeParameter");
        C24362h.m61211f(gVar, "containingDeclaration");
        this.f61534l = dVar;
        this.f61535m = xVar;
    }

    /* renamed from: N0 */
    public final void mo53475N0(C24307v vVar) {
        C24362h.m61211f(vVar, "type");
    }

    /* renamed from: O0 */
    public final List<C24307v> mo53476O0() {
        Collection<C24595j> upperBounds = this.f61535m.getUpperBounds();
        if (upperBounds.isEmpty()) {
            C24312z f = this.f61534l.f60080a.f60069o.mo59460m().mo59383f();
            C24362h.m61210e(f, "c.module.builtIns.anyType");
            return C17875h.m44280D(KotlinTypeFactory.m60474c(f, this.f61534l.f60080a.f60069o.mo59460m().mo59393p()));
        }
        ArrayList arrayList = new ArrayList(C21136j.m49436X(upperBounds, 10));
        for (C24595j d : upperBounds) {
            arrayList.add(this.f61534l.f60084e.mo59572d(d, C24372b.m61251b(TypeUsage.COMMON, false, this, 1)));
        }
        return arrayList;
    }

    /* renamed from: l0 */
    public final List<C24307v> mo53483l0(List<? extends C24307v> list) {
        C24362h.m61211f(list, "bounds");
        C23780d dVar = this.f61534l;
        return dVar.f60080a.f60072r.mo59574b(this, list, dVar);
    }
}
