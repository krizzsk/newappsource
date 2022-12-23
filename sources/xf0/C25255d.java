package xf0;

import ag0.C20989e;
import cf0.C21136j;
import cf0.C21144r;
import cf0.C21145s;
import cf0.C21146t;
import cg0.C21171g0;
import cg0.C21173h0;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23907b;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23910d;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import p172m9.C5720b;
import qh0.C24783g;
import ug0.C25069e;
import zf0.C25433c0;
import zf0.C25435d0;
import zf0.C25442g;
import zf0.C25448i0;
import zf0.C25452k0;
import zf0.C25455m;

/* renamed from: xf0.d */
public final class C25255d extends C21173h0 {

    /* renamed from: xf0.d$a */
    public static final class C25256a {
        /* renamed from: a */
        public static C25255d m63373a(C25250b bVar, boolean z) {
            String str;
            boolean z2;
            C25250b bVar2 = bVar;
            C24362h.m61211f(bVar2, "functionClass");
            List<C25448i0> list = bVar2.f63532l;
            C25255d dVar = new C25255d(bVar2, (C25255d) null, CallableMemberDescriptor.Kind.DECLARATION, z);
            C25433c0 M0 = bVar.mo53404M0();
            EmptyList emptyList = EmptyList.f60173b;
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (((C25448i0) next).mo53482l() == Variance.IN_VARIANCE) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    break;
                }
                arrayList.add(next);
            }
            C21145s P0 = C23825c.m58504P0(arrayList);
            ArrayList arrayList2 = new ArrayList(C21136j.m49436X(P0, 10));
            Iterator it = P0.iterator();
            while (true) {
                C21146t tVar = (C21146t) it;
                if (tVar.hasNext()) {
                    C21144r rVar = (C21144r) tVar.next();
                    int i = rVar.f53001a;
                    C25448i0 i0Var = (C25448i0) rVar.f53002b;
                    String f = i0Var.getName().mo61604f();
                    C24362h.m61210e(f, "typeParameter.name.asString()");
                    if (C24362h.m61206a(f, RequestConfiguration.MAX_AD_CONTENT_RATING_T)) {
                        str = "instance";
                    } else if (C24362h.m61206a(f, "E")) {
                        str = "receiver";
                    } else {
                        str = f.toLowerCase(Locale.ROOT);
                        C24362h.m61210e(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    }
                    C20989e.C20990a.C20991a aVar = C20989e.C20990a.f52739a;
                    C25069e i2 = C25069e.m62820i(str);
                    C24312z q = i0Var.mo53412q();
                    C24362h.m61210e(q, "typeParameter.defaultType");
                    C23910d dVar2 = r2;
                    C23910d dVar3 = new C23910d(dVar, (C25452k0) null, i, aVar, i2, q, false, false, false, (C24307v) null, C25435d0.f63736a);
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(dVar2);
                    arrayList2 = arrayList3;
                } else {
                    dVar.mo53468Q0((C21171g0) null, M0, emptyList, arrayList2, ((C25448i0) C23825c.m58522s0(list)).mo53412q(), Modality.ABSTRACT, C25455m.f63744e);
                    dVar.f60488x = true;
                    return dVar;
                }
            }
        }
    }

    public C25255d(C25442g gVar, C25255d dVar, CallableMemberDescriptor.Kind kind, boolean z) {
        super(gVar, dVar, C20989e.C20990a.f52739a, C24783g.f62692g, kind, C25435d0.f63736a);
        this.f60477m = true;
        this.f60486v = z;
        this.f60487w = false;
    }

    /* renamed from: G */
    public final boolean mo53414G() {
        return false;
    }

    /* renamed from: N0 */
    public final C23907b mo53467N0(CallableMemberDescriptor.Kind kind, C25442g gVar, C23900c cVar, C25435d0 d0Var, C20989e eVar, C25069e eVar2) {
        C24362h.m61211f(gVar, "newOwner");
        C24362h.m61211f(kind, "kind");
        C24362h.m61211f(eVar, "annotations");
        return new C25255d(gVar, (C25255d) cVar, kind, this.f60486v);
    }

    /* renamed from: O0 */
    public final C23907b mo59450O0(C23907b.C23908a aVar) {
        boolean z;
        boolean z2;
        C25069e eVar;
        boolean z3;
        C24362h.m61211f(aVar, "configuration");
        C25255d dVar = (C25255d) super.mo59450O0(aVar);
        if (dVar == null) {
            return null;
        }
        List<C25452k0> h = dVar.mo53442h();
        C24362h.m61210e(h, "substituted.valueParameters");
        boolean z4 = true;
        if (!h.isEmpty()) {
            Iterator<T> it = h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C24307v type = ((C25452k0) it.next()).getType();
                C24362h.m61210e(type, "it.type");
                if (C5720b.m14058i(type) != null) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return dVar;
        }
        List<C25452k0> h2 = dVar.mo53442h();
        C24362h.m61210e(h2, "substituted.valueParameters");
        ArrayList arrayList = new ArrayList(C21136j.m49436X(h2, 10));
        for (C25452k0 type2 : h2) {
            C24307v type3 = type2.getType();
            C24362h.m61210e(type3, "it.type");
            arrayList.add(C5720b.m14058i(type3));
        }
        int size = dVar.mo53442h().size() - arrayList.size();
        List<C25452k0> h3 = dVar.mo53442h();
        C24362h.m61210e(h3, "valueParameters");
        ArrayList arrayList2 = new ArrayList(C21136j.m49436X(h3, 10));
        for (C25452k0 k0Var : h3) {
            C25069e name = k0Var.getName();
            C24362h.m61210e(name, "it.name");
            int index = k0Var.getIndex();
            int i = index - size;
            if (i >= 0 && (eVar = (C25069e) arrayList.get(i)) != null) {
                name = eVar;
            }
            arrayList2.add(k0Var.mo59463b0(dVar, name, index));
        }
        C23907b.C23908a R0 = dVar.mo59451R0(TypeSubstitutor.f61353b);
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((C25069e) it2.next()) == null) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            R0.f60511u = Boolean.valueOf(z4);
            R0.f60497g = arrayList2;
            R0.f60495e = dVar.m49592a();
            C23907b O0 = super.mo59450O0(R0);
            C24362h.m61208c(O0);
            return O0;
        }
        z4 = false;
        R0.f60511u = Boolean.valueOf(z4);
        R0.f60497g = arrayList2;
        R0.f60495e = dVar.m49592a();
        C23907b O02 = super.mo59450O0(R0);
        C24362h.m61208c(O02);
        return O02;
    }

    /* renamed from: c0 */
    public final boolean mo53428c0() {
        return false;
    }

    /* renamed from: w */
    public final boolean mo53437w() {
        return false;
    }
}
