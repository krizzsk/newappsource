package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import lf0.C24236l;
import mf0.C24362h;
import p584jl.C17885a;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1 */
final class C23916xdb572182 extends Lambda implements C24236l<CallableMemberDescriptor, Boolean> {

    /* renamed from: f */
    public static final C23916xdb572182 f60548f = new C23916xdb572182();

    public C23916xdb572182() {
        super(1);
    }

    public final Object invoke(Object obj) {
        boolean z;
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        C24362h.m61211f(callableMemberDescriptor, "it");
        if (callableMemberDescriptor instanceof C23900c) {
            int i = BuiltinMethodsWithSpecialGenericSignature.f60546m;
            if (C23825c.m58507d0(SpecialGenericSignatures.f60568g, C17885a.m44388A(callableMemberDescriptor))) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
