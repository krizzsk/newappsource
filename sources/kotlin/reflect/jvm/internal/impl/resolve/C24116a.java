package kotlin.reflect.jvm.internal.impl.resolve;

import com.appboy.Constants;
import java.util.Collection;
import kotlin.collections.C23825c;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import lf0.C24240p;
import mf0.C24362h;
import mh0.C24378d;
import xg0.C25260c;
import zf0.C25432c;
import zf0.C25435d0;
import zf0.C25442g;
import zf0.C25448i0;
import zf0.C25484s;
import zf0.C25486u;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.a */
public final class C24116a {

    /* renamed from: a */
    public static final C24116a f61198a = new C24116a();

    /* renamed from: e */
    public static C25435d0 m60266e(C23894a aVar) {
        while (aVar instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) aVar;
            if (callableMemberDescriptor.mo53433p() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends CallableMemberDescriptor> d = callableMemberDescriptor.mo53440d();
            C24362h.m61210e(d, "overriddenDescriptors");
            aVar = (CallableMemberDescriptor) C23825c.m58492D0(d);
            if (aVar == null) {
                return null;
            }
        }
        return aVar.mo53400e();
    }

    /* renamed from: a */
    public final boolean mo60175a(C25442g gVar, C25442g gVar2, boolean z, boolean z2) {
        if ((gVar instanceof C25432c) && (gVar2 instanceof C25432c)) {
            return C24362h.m61206a(((C25432c) gVar).mo53481j(), ((C25432c) gVar2).mo53481j());
        }
        if ((gVar instanceof C25448i0) && (gVar2 instanceof C25448i0)) {
            return mo60176b((C25448i0) gVar, (C25448i0) gVar2, z, DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1.f61187f);
        }
        if ((gVar instanceof C23894a) && (gVar2 instanceof C23894a)) {
            C23894a aVar = (C23894a) gVar;
            C23894a aVar2 = (C23894a) gVar2;
            C24378d.C24379a aVar3 = C24378d.C24379a.f61715b;
            C24362h.m61211f(aVar, Constants.APPBOY_PUSH_CONTENT_KEY);
            C24362h.m61211f(aVar2, "b");
            C24362h.m61211f(aVar3, "kotlinTypeRefiner");
            if (C24362h.m61206a(aVar, aVar2)) {
                return true;
            }
            if (C24362h.m61206a(aVar.getName(), aVar2.getName()) && ((!z2 || !(aVar instanceof C25484s) || !(aVar2 instanceof C25484s) || ((C25484s) aVar).mo53434p0() == ((C25484s) aVar2).mo53434p0()) && ((!C24362h.m61206a(aVar.mo53399b(), aVar2.mo53399b()) || (z && C24362h.m61206a(m60266e(aVar), m60266e(aVar2)))) && !C25260c.m63398o(aVar) && !C25260c.m63398o(aVar2) && mo60177d(aVar, aVar2, C24110xc15c0bd8.f61181f, z)))) {
                OverridingUtil overridingUtil = new OverridingUtil(new C24111x10bda471(aVar, aVar2, z), aVar3);
                OverridingUtil.OverrideCompatibilityInfo.Result c = overridingUtil.mo60172m(aVar, aVar2, (C25432c) null, true).mo60174c();
                OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
                if (c == result && overridingUtil.mo60172m(aVar2, aVar, (C25432c) null, true).mo60174c() == result) {
                    return true;
                }
                return false;
            }
            return false;
        } else if (!(gVar instanceof C25486u) || !(gVar2 instanceof C25486u)) {
            return C24362h.m61206a(gVar, gVar2);
        } else {
            return C24362h.m61206a(((C25486u) gVar).mo53401f(), ((C25486u) gVar2).mo53401f());
        }
    }

    /* renamed from: b */
    public final boolean mo60176b(C25448i0 i0Var, C25448i0 i0Var2, boolean z, C24240p<? super C25442g, ? super C25442g, Boolean> pVar) {
        C24362h.m61211f(i0Var, Constants.APPBOY_PUSH_CONTENT_KEY);
        C24362h.m61211f(i0Var2, "b");
        C24362h.m61211f(pVar, "equivalentCallables");
        if (C24362h.m61206a(i0Var, i0Var2)) {
            return true;
        }
        if (!C24362h.m61206a(i0Var.mo53399b(), i0Var2.mo53399b()) && mo60177d(i0Var, i0Var2, pVar, z) && i0Var.getIndex() == i0Var2.getIndex()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo60177d(C25442g gVar, C25442g gVar2, C24240p<? super C25442g, ? super C25442g, Boolean> pVar, boolean z) {
        C25442g b = gVar.mo53399b();
        C25442g b2 = gVar2.mo53399b();
        if ((b instanceof CallableMemberDescriptor) || (b2 instanceof CallableMemberDescriptor)) {
            return pVar.invoke(b, b2).booleanValue();
        }
        return mo60175a(b, b2, z, true);
    }
}
