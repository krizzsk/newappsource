package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import lf0.C24236l;
import mf0.C24362h;
import p584jl.C17885a;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getOverriddenBuiltinFunctionWithErasedValueParametersInJava$1 */
public final class C23915x3e04c33b extends Lambda implements C24236l<CallableMemberDescriptor, Boolean> {

    /* renamed from: f */
    public static final C23915x3e04c33b f60547f = new C23915x3e04c33b();

    public C23915x3e04c33b() {
        super(1);
    }

    public final Object invoke(Object obj) {
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        C24362h.m61211f(callableMemberDescriptor, "it");
        int i = BuiltinMethodsWithSpecialGenericSignature.f60546m;
        return Boolean.valueOf(C23825c.m58507d0(SpecialGenericSignatures.f60568g, C17885a.m44388A(callableMemberDescriptor)));
    }
}
