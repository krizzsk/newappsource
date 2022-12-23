package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kh0.C23789e;
import kh0.C23792h;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import lh0.C24266g;
import lh0.C24274i0;
import lh0.C24289p;
import lh0.C24307v;
import mf0.C24362h;
import p583jk.C17875h;
import zf0.C25443g0;

public abstract class AbstractTypeConstructor extends C24266g {

    /* renamed from: b */
    public final C23789e<C24153a> f61329b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$a */
    public static final class C24153a {

        /* renamed from: a */
        public final Collection<C24307v> f61330a;

        /* renamed from: b */
        public List<? extends C24307v> f61331b = C17875h.m44280D(C24289p.f61587c);

        public C24153a(Collection<? extends C24307v> collection) {
            C24362h.m61211f(collection, "allSupertypes");
            this.f61330a = collection;
        }
    }

    public AbstractTypeConstructor(C23792h hVar) {
        C24362h.m61211f(hVar, "storageManager");
        this.f61329b = hVar.mo59023h(new AbstractTypeConstructor$supertypes$1(this), AbstractTypeConstructor$supertypes$2.f61332f, new AbstractTypeConstructor$supertypes$3(this));
    }

    /* renamed from: b */
    public static final Collection m60456b(AbstractTypeConstructor abstractTypeConstructor, C24274i0 i0Var, boolean z) {
        AbstractTypeConstructor abstractTypeConstructor2;
        abstractTypeConstructor.getClass();
        if (i0Var instanceof AbstractTypeConstructor) {
            abstractTypeConstructor2 = (AbstractTypeConstructor) i0Var;
        } else {
            abstractTypeConstructor2 = null;
        }
        if (abstractTypeConstructor2 == null) {
            Collection<C24307v> n = i0Var.mo53459n();
            C24362h.m61210e(n, "supertypes");
            return n;
        }
        return C23825c.m58527x0(abstractTypeConstructor2.mo60231e(z), ((C24153a) abstractTypeConstructor2.f61329b.invoke()).f61330a);
    }

    /* renamed from: c */
    public abstract Collection<C24307v> mo53486c();

    /* renamed from: d */
    public C24307v mo53487d() {
        return null;
    }

    /* renamed from: e */
    public Collection<C24307v> mo60231e(boolean z) {
        return EmptyList.f60173b;
    }

    /* renamed from: f */
    public abstract C25443g0 mo53488f();

    /* renamed from: g */
    public final List<C24307v> mo53459n() {
        return ((C24153a) this.f61329b.invoke()).f61331b;
    }

    /* renamed from: h */
    public List<C24307v> mo53489h(List<C24307v> list) {
        C24362h.m61211f(list, "supertypes");
        return list;
    }

    /* renamed from: i */
    public void mo53490i(C24307v vVar) {
        C24362h.m61211f(vVar, "type");
    }
}
