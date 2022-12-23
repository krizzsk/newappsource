package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.collections.C23825c;
import kotlin.sequences.C24177b;
import lh0.C24307v;
import mf0.C24362h;
import rh0.C24814b;
import th0.C25004i;
import zf0.C25432c;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a */
public final class C23939a<N> implements C24814b.C24816b {

    /* renamed from: b */
    public static final C23939a<N> f60707b = new C23939a<>();

    /* renamed from: b */
    public final Iterable mo50617b(Object obj) {
        Collection<C24307v> n = ((C25432c) obj).mo53481j().mo53459n();
        C24362h.m61210e(n, "it.typeConstructor.supertypes");
        return new C25004i(C24177b.m60550k0(C23825c.m58506c0(n), LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1.f60706f));
    }
}
