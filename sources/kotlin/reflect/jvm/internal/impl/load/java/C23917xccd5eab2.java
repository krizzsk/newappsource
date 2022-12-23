package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import lf0.C24236l;
import mf0.C24362h;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties$getBuiltinSpecialPropertyGetterName$descriptor$1 */
final class C23917xccd5eab2 extends Lambda implements C24236l<CallableMemberDescriptor, Boolean> {

    /* renamed from: f */
    public static final C23917xccd5eab2 f60549f = new C23917xccd5eab2();

    public C23917xccd5eab2() {
        super(1);
    }

    public final Object invoke(Object obj) {
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        C24362h.m61211f(callableMemberDescriptor, "it");
        return Boolean.valueOf(C23924b.m58992b(callableMemberDescriptor));
    }
}
