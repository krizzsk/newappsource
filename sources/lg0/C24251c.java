package lg0;

import java.util.ArrayList;
import java.util.List;
import kg0.C23780d;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import lh0.C24307v;
import mf0.C24362h;
import og0.C24602q;
import ug0.C25069e;
import zf0.C25433c0;

/* renamed from: lg0.c */
public abstract class C24251c extends LazyJavaScope {
    public C24251c(C23780d dVar) {
        super(dVar, (LazyJavaScope) null);
    }

    /* renamed from: n */
    public void mo59538n(ArrayList arrayList, C25069e eVar) {
        C24362h.m61211f(eVar, "name");
    }

    /* renamed from: p */
    public final C25433c0 mo59540p() {
        return null;
    }

    /* renamed from: s */
    public final LazyJavaScope.C23936a mo59543s(C24602q qVar, ArrayList arrayList, C24307v vVar, List list) {
        C24362h.m61211f(qVar, "method");
        C24362h.m61211f(vVar, "returnType");
        C24362h.m61211f(list, "valueParameters");
        return new LazyJavaScope.C23936a(list, arrayList, EmptyList.f60173b, vVar);
    }
}
