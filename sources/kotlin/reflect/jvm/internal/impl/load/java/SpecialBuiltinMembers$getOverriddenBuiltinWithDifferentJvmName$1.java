package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import lf0.C24236l;
import mf0.C24362h;

public final class SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1 extends Lambda implements C24236l<CallableMemberDescriptor, Boolean> {

    /* renamed from: f */
    public static final SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1 f60559f = new SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1();

    public SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        C24362h.m61211f(callableMemberDescriptor, "it");
        return Boolean.valueOf(C23924b.m58992b(DescriptorUtilsKt.m60291l(callableMemberDescriptor)));
    }
}
