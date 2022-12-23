package yf0;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import lh0.C24307v;
import mf0.C24362h;
import rh0.C24814b;
import zf0.C25432c;
import zf0.C25437e;

/* renamed from: yf0.e */
public final class C25298e<N> implements C24814b.C24816b {

    /* renamed from: b */
    public final /* synthetic */ JvmBuiltInsCustomizer f63597b;

    public C25298e(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.f63597b = jvmBuiltInsCustomizer;
    }

    /* renamed from: b */
    public final Iterable mo50617b(Object obj) {
        C25437e eVar;
        C25432c cVar;
        Collection<C24307v> n = ((C25432c) obj).mo53481j().mo53459n();
        C24362h.m61210e(n, "it.typeConstructor.supertypes");
        JvmBuiltInsCustomizer jvmBuiltInsCustomizer = this.f63597b;
        ArrayList arrayList = new ArrayList();
        for (C24307v O0 : n) {
            C25437e o = O0.mo60411O0().mo53460o();
            LazyJavaClassDescriptor lazyJavaClassDescriptor = null;
            if (o == null) {
                eVar = null;
            } else {
                eVar = o.mo53407a();
            }
            if (eVar instanceof C25432c) {
                cVar = (C25432c) eVar;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                lazyJavaClassDescriptor = jvmBuiltInsCustomizer.mo59408f(cVar);
            }
            if (lazyJavaClassDescriptor != null) {
                arrayList.add(lazyJavaClassDescriptor);
            }
        }
        return arrayList;
    }
}
