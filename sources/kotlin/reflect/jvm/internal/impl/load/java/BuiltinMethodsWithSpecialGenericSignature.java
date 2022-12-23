package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import mf0.C24362h;
import ug0.C25069e;

public final class BuiltinMethodsWithSpecialGenericSignature extends SpecialGenericSignatures {

    /* renamed from: m */
    public static final /* synthetic */ int f60546m = 0;

    /* renamed from: a */
    public static final C23900c m58976a(C23900c cVar) {
        C24362h.m61211f(cVar, "functionDescriptor");
        C25069e name = cVar.getName();
        C24362h.m61210e(name, "functionDescriptor.name");
        if (!m58977b(name)) {
            return null;
        }
        return (C23900c) DescriptorUtilsKt.m60281b(cVar, C23915x3e04c33b.f60547f);
    }

    /* renamed from: b */
    public static boolean m58977b(C25069e eVar) {
        C24362h.m61211f(eVar, "<this>");
        return SpecialGenericSignatures.f60567f.contains(eVar);
    }
}
