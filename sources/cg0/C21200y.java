package cg0;

import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23909c;
import mf0.C24362h;

/* renamed from: cg0.y */
public final class C21200y implements C21199x {

    /* renamed from: a */
    public final List<C23909c> f53124a;

    /* renamed from: b */
    public final Set<C23909c> f53125b;

    /* renamed from: c */
    public final List<C23909c> f53126c;

    public C21200y(List list, EmptySet emptySet, EmptyList emptyList, EmptySet emptySet2) {
        C24362h.m61211f(emptyList, "directExpectedByDependencies");
        C24362h.m61211f(emptySet2, "allExpectedByDependencies");
        this.f53124a = list;
        this.f53125b = emptySet;
        this.f53126c = emptyList;
    }

    /* renamed from: a */
    public final List<C23909c> mo53538a() {
        return this.f53124a;
    }

    /* renamed from: b */
    public final List<C23909c> mo53539b() {
        return this.f53126c;
    }

    /* renamed from: c */
    public final Set<C23909c> mo53540c() {
        return this.f53125b;
    }
}
