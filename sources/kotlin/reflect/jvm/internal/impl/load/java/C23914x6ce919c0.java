package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import lf0.C24236l;
import mf0.C24362h;
import p584jl.C17885a;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName$isBuiltinFunctionWithDifferentNameInJvm$1 */
final class C23914x6ce919c0 extends Lambda implements C24236l<CallableMemberDescriptor, Boolean> {
    public final /* synthetic */ C23903e $functionDescriptor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23914x6ce919c0(C23903e eVar) {
        super(1);
        this.$functionDescriptor = eVar;
    }

    public final Object invoke(Object obj) {
        C24362h.m61211f((CallableMemberDescriptor) obj, "it");
        return Boolean.valueOf(SpecialGenericSignatures.f60571j.containsKey(C17885a.m44388A(this.$functionDescriptor)));
    }
}
