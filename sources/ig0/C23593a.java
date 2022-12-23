package ig0;

import bf0.C21050d;
import hh0.C23500l;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import lf0.C24236l;
import xg0.C25263f;

/* renamed from: ig0.a */
public final class C23593a extends C25263f {

    /* renamed from: b */
    public final /* synthetic */ C23500l f59667b;

    /* renamed from: c */
    public final /* synthetic */ Set f59668c;

    /* renamed from: d */
    public final /* synthetic */ boolean f59669d;

    /* renamed from: ig0.a$a */
    public class C23594a implements C24236l<CallableMemberDescriptor, C21050d> {
        public C23594a() {
        }

        public final Object invoke(Object obj) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
            if (callableMemberDescriptor != null) {
                C23593a.this.f59667b.mo58617a(callableMemberDescriptor);
                return C21050d.f52856a;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"}));
        }
    }

    public C23593a(C23500l lVar, LinkedHashSet linkedHashSet, boolean z) {
        this.f59667b = lVar;
        this.f59668c = linkedHashSet;
        this.f59669d = z;
    }

    /* renamed from: q */
    public static /* synthetic */ void m57778q(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i == 2) {
            objArr[0] = "fromCurrent";
        } else if (i == 3) {
            objArr[0] = "member";
        } else if (i != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: l */
    public final void mo320l(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor != null) {
            OverridingUtil.m60251r(callableMemberDescriptor, new C23594a());
            this.f59668c.add(callableMemberDescriptor);
            return;
        }
        m57778q(0);
        throw null;
    }

    /* renamed from: o */
    public final void mo323o(CallableMemberDescriptor callableMemberDescriptor, Collection<? extends CallableMemberDescriptor> collection) {
        if (callableMemberDescriptor == null) {
            m57778q(3);
            throw null;
        } else if (!this.f59669d || callableMemberDescriptor.mo53433p() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            callableMemberDescriptor.mo53416I0(collection);
        }
    }

    /* renamed from: p */
    public final void mo53536p(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        if (callableMemberDescriptor == null) {
            m57778q(1);
            throw null;
        } else if (callableMemberDescriptor2 == null) {
            m57778q(2);
            throw null;
        }
    }
}
