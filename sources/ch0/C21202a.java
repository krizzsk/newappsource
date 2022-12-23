package ch0;

import cf0.C21140n;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import mf0.C24362h;
import ug0.C25069e;
import zf0.C25432c;

/* renamed from: ch0.a */
public final class C21202a implements C21204c {

    /* renamed from: b */
    public final List<C21204c> f53135b;

    public C21202a(EmptyList emptyList) {
        C24362h.m61211f(emptyList, "inner");
        this.f53135b = emptyList;
    }

    /* renamed from: a */
    public final void mo53542a(LazyJavaClassDescriptor lazyJavaClassDescriptor, C25069e eVar, ArrayList arrayList) {
        C24362h.m61211f(lazyJavaClassDescriptor, "thisDescriptor");
        C24362h.m61211f(eVar, "name");
        for (C21204c a : this.f53135b) {
            a.mo53542a(lazyJavaClassDescriptor, eVar, arrayList);
        }
    }

    /* renamed from: b */
    public final void mo53543b(C25432c cVar, ArrayList arrayList) {
        C24362h.m61211f(cVar, "thisDescriptor");
        for (C21204c b : this.f53135b) {
            b.mo53543b(cVar, arrayList);
        }
    }

    /* renamed from: c */
    public final void mo53544c(C25432c cVar, C25069e eVar, ArrayList arrayList) {
        C24362h.m61211f(cVar, "thisDescriptor");
        C24362h.m61211f(eVar, "name");
        for (C21204c c : this.f53135b) {
            c.mo53544c(cVar, eVar, arrayList);
        }
    }

    /* renamed from: d */
    public final ArrayList mo53545d(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        C24362h.m61211f(lazyJavaClassDescriptor, "thisDescriptor");
        List<C21204c> list = this.f53135b;
        ArrayList arrayList = new ArrayList();
        for (C21204c d : list) {
            C21140n.m49439a0(d.mo53545d(lazyJavaClassDescriptor), arrayList);
        }
        return arrayList;
    }

    /* renamed from: e */
    public final ArrayList mo53546e(C25432c cVar) {
        C24362h.m61211f(cVar, "thisDescriptor");
        List<C21204c> list = this.f53135b;
        ArrayList arrayList = new ArrayList();
        for (C21204c e : list) {
            C21140n.m49439a0(e.mo53546e(cVar), arrayList);
        }
        return arrayList;
    }
}
