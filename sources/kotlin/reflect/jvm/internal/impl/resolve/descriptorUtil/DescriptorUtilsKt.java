package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import ag0.C20986c;
import bh0.C21060a;
import bh0.C21061b;
import cf0.C21136j;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.descriptors.C23902d;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.sequences.SequencesKt__SequencesKt;
import lf0.C24236l;
import mf0.C24362h;
import mh0.C24378d;
import mh0.C24380e;
import mh0.C24386j;
import p583jk.C17875h;
import rh0.C24814b;
import th0.C24993b;
import th0.C24995c;
import th0.C25003h;
import ug0.C25065b;
import ug0.C25066c;
import ug0.C25067d;
import ug0.C25069e;
import xg0.C25260c;
import zf0.C25432c;
import zf0.C25437e;
import zf0.C25440f;
import zf0.C25442g;
import zf0.C25452k0;
import zf0.C25485t;
import zf0.C25486u;
import zf0.C25491z;

public final class DescriptorUtilsKt {

    /* renamed from: a */
    public static final /* synthetic */ int f61206a = 0;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$a */
    public static final class C24118a<N> implements C24814b.C24816b {

        /* renamed from: b */
        public static final C24118a<N> f61207b = new C24118a<>();

        /* renamed from: b */
        public final Iterable mo50617b(Object obj) {
            Collection<C25452k0> d = ((C25452k0) obj).mo53440d();
            ArrayList arrayList = new ArrayList(C21136j.m49436X(d, 10));
            for (C25452k0 a : d) {
                arrayList.add(a.mo53407a());
            }
            return arrayList;
        }
    }

    static {
        C25069e.m62820i("value");
    }

    /* renamed from: a */
    public static final boolean m60280a(C25452k0 k0Var) {
        C24362h.m61211f(k0Var, "<this>");
        Boolean d = C24814b.m62346d(C17875h.m44280D(k0Var), C24118a.f61207b, DescriptorUtilsKt$declaresOrInheritsDefaultValue$2.f61208b);
        C24362h.m61210e(d, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return d.booleanValue();
    }

    /* renamed from: b */
    public static CallableMemberDescriptor m60281b(CallableMemberDescriptor callableMemberDescriptor, C24236l lVar) {
        C24362h.m61211f(callableMemberDescriptor, "<this>");
        C24362h.m61211f(lVar, "predicate");
        return (CallableMemberDescriptor) C24814b.m62344b(C17875h.m44280D(callableMemberDescriptor), new C21060a(false), new C21061b(lVar, new Ref$ObjectRef()));
    }

    /* renamed from: c */
    public static final C25066c m60282c(C25442g gVar) {
        C24362h.m61211f(gVar, "<this>");
        C25067d h = m60287h(gVar);
        if (!h.mo61596f()) {
            h = null;
        }
        if (h == null) {
            return null;
        }
        return h.mo61600i();
    }

    /* renamed from: d */
    public static final C25432c m60283d(C20986c cVar) {
        C24362h.m61211f(cVar, "<this>");
        C25437e o = cVar.getType().mo60411O0().mo53460o();
        if (o instanceof C25432c) {
            return (C25432c) o;
        }
        return null;
    }

    /* renamed from: e */
    public static final C23867c m60284e(C25442g gVar) {
        C24362h.m61211f(gVar, "<this>");
        return m60289j(gVar).mo59460m();
    }

    /* renamed from: f */
    public static final C25065b m60285f(C25437e eVar) {
        if (eVar == null) {
            return null;
        }
        C25442g b = eVar.mo53399b();
        if (b instanceof C25486u) {
            return new C25065b(((C25486u) b).mo53401f(), eVar.getName());
        }
        if (!(b instanceof C25440f)) {
            return null;
        }
        C24362h.m61210e(b, "owner");
        C25065b f = m60285f((C25437e) b);
        if (f == null) {
            return null;
        }
        return f.mo61571d(eVar.getName());
    }

    /* renamed from: g */
    public static final C25066c m60286g(C25442g gVar) {
        C24362h.m61211f(gVar, "<this>");
        C25066c h = C25260c.m63391h(gVar);
        if (h == null) {
            h = C25260c.m63390g(gVar.mo53399b()).mo61592c(gVar.getName()).mo61600i();
        }
        if (h != null) {
            return h;
        }
        C25260c.m63384a(4);
        throw null;
    }

    /* renamed from: h */
    public static final C25067d m60287h(C25442g gVar) {
        C24362h.m61211f(gVar, "<this>");
        C25067d g = C25260c.m63390g(gVar);
        C24362h.m61210e(g, "getFqName(this)");
        return g;
    }

    /* renamed from: i */
    public static final C24378d.C24379a m60288i(C25485t tVar) {
        C24362h.m61211f(tVar, "<this>");
        C24386j jVar = (C24386j) tVar.mo59456K(C24380e.f61716a);
        return C24378d.C24379a.f61715b;
    }

    /* renamed from: j */
    public static final C25485t m60289j(C25442g gVar) {
        C24362h.m61211f(gVar, "<this>");
        C25485t d = C25260c.m63387d(gVar);
        C24362h.m61210e(d, "getContainingModule(this)");
        return d;
    }

    /* renamed from: k */
    public static final C25003h<C25442g> m60290k(C25442g gVar) {
        C24362h.m61211f(gVar, "<this>");
        C25003h Z = SequencesKt__SequencesKt.m60539Z(gVar, DescriptorUtilsKt$parentsWithSelf$1.f61209f);
        if (Z instanceof C24995c) {
            return ((C24995c) Z).mo61539a();
        }
        return new C24993b(Z, 1);
    }

    /* renamed from: l */
    public static final CallableMemberDescriptor m60291l(CallableMemberDescriptor callableMemberDescriptor) {
        C24362h.m61211f(callableMemberDescriptor, "<this>");
        if (!(callableMemberDescriptor instanceof C23902d)) {
            return callableMemberDescriptor;
        }
        C25491z Y = ((C23902d) callableMemberDescriptor).mo53426Y();
        C24362h.m61210e(Y, "correspondingProperty");
        return Y;
    }
}
