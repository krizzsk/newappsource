package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.internal.FunctionReference;
import lf0.C24236l;
import mf0.C24362h;
import mf0.C24365j;
import sf0.C24857d;
import zf0.C25452k0;

public /* synthetic */ class DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 extends FunctionReference implements C24236l<C25452k0, Boolean> {

    /* renamed from: b */
    public static final DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 f61208b = new DescriptorUtilsKt$declaresOrInheritsDefaultValue$2();

    public DescriptorUtilsKt$declaresOrInheritsDefaultValue$2() {
        super(1);
    }

    public final String getName() {
        return "declaresDefaultValue";
    }

    public final C24857d getOwner() {
        return C24365j.m61219a(C25452k0.class);
    }

    public final String getSignature() {
        return "declaresDefaultValue()Z";
    }

    public final Object invoke(Object obj) {
        C25452k0 k0Var = (C25452k0) obj;
        C24362h.m61211f(k0Var, "p0");
        return Boolean.valueOf(k0Var.mo59462F0());
    }
}
