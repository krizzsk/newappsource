package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.C23826d;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import lf0.C24236l;
import mf0.C24362h;
import p584jl.C17885a;

public final class SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2 extends Lambda implements C24236l<CallableMemberDescriptor, Boolean> {

    /* renamed from: f */
    public static final SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2 f60561f = new SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2();

    public SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2() {
        super(1);
    }

    public final Object invoke(Object obj) {
        boolean z;
        String str;
        SpecialGenericSignatures.SpecialSignatureInfo specialSignatureInfo;
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        C24362h.m61211f(callableMemberDescriptor, "it");
        if (C23867c.m58670A(callableMemberDescriptor)) {
            int i = BuiltinMethodsWithSpecialGenericSignature.f60546m;
            SpecialGenericSignatures.SpecialSignatureInfo specialSignatureInfo2 = null;
            if (SpecialGenericSignatures.f60567f.contains(callableMemberDescriptor.getName())) {
                CallableMemberDescriptor b = DescriptorUtilsKt.m60281b(callableMemberDescriptor, C23916xdb572182.f60548f);
                if (b == null) {
                    str = null;
                } else {
                    str = C17885a.m44388A(b);
                }
                if (str != null) {
                    if (SpecialGenericSignatures.f60564c.contains(str)) {
                        specialSignatureInfo = SpecialGenericSignatures.SpecialSignatureInfo.ONE_COLLECTION_PARAMETER;
                    } else if (((SpecialGenericSignatures.TypeSafeBarrierDescription) C23826d.m58531V(SpecialGenericSignatures.f60566e, str)) == SpecialGenericSignatures.TypeSafeBarrierDescription.NULL) {
                        specialSignatureInfo = SpecialGenericSignatures.SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC;
                    } else {
                        specialSignatureInfo = SpecialGenericSignatures.SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
                    }
                    specialSignatureInfo2 = specialSignatureInfo;
                }
            }
            if (specialSignatureInfo2 != null) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
