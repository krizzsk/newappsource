package kotlin.reflect.jvm.internal.impl.load.java;

import hg0.C23460b;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import lf0.C24236l;
import mf0.C24362h;

public final class SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2 extends Lambda implements C24236l<CallableMemberDescriptor, Boolean> {

    /* renamed from: f */
    public static final SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2 f60560f = new SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2();

    public SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2() {
        super(1);
    }

    public final Object invoke(Object obj) {
        boolean z;
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        C24362h.m61211f(callableMemberDescriptor, "it");
        int i = C23460b.f59241m;
        C23903e eVar = (C23903e) callableMemberDescriptor;
        if (!C23867c.m58670A(eVar) || DescriptorUtilsKt.m60281b(eVar, new C23914x6ce919c0(eVar)) == null) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
