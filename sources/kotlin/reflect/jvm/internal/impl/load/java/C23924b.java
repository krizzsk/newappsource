package kotlin.reflect.jvm.internal.impl.load.java;

import hg0.C23461c;
import java.util.Collection;
import kotlin.collections.C23825c;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import mf0.C24362h;
import ug0.C25069e;
import zf0.C25429a0;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.b */
public final class C23924b {
    /* renamed from: a */
    public static String m58991a(C25429a0 a0Var) {
        C25069e eVar;
        C23867c.m58670A(a0Var);
        CallableMemberDescriptor b = DescriptorUtilsKt.m60281b(DescriptorUtilsKt.m60291l(a0Var), C23917xccd5eab2.f60549f);
        if (b == null || (eVar = C23461c.f59242a.get(DescriptorUtilsKt.m60286g(b))) == null) {
            return null;
        }
        return eVar.mo61604f();
    }

    /* renamed from: b */
    public static boolean m58992b(CallableMemberDescriptor callableMemberDescriptor) {
        C24362h.m61211f(callableMemberDescriptor, "callableMemberDescriptor");
        if (!C23461c.f59245d.contains(callableMemberDescriptor.getName())) {
            return false;
        }
        if (C23825c.m58507d0(C23461c.f59244c, DescriptorUtilsKt.m60282c(callableMemberDescriptor)) && callableMemberDescriptor.mo53442h().isEmpty()) {
            return true;
        }
        if (!C23867c.m58670A(callableMemberDescriptor)) {
            return false;
        }
        Collection<? extends CallableMemberDescriptor> d = callableMemberDescriptor.mo53440d();
        C24362h.m61210e(d, "overriddenDescriptors");
        if (d.isEmpty()) {
            return false;
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : d) {
            C24362h.m61210e(callableMemberDescriptor2, "it");
            if (m58992b(callableMemberDescriptor2)) {
                return true;
            }
        }
        return false;
    }
}
