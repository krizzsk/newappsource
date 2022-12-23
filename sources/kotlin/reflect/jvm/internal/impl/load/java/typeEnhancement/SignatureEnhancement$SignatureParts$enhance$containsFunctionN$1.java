package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import lf0.C24236l;
import lh0.C24306u0;
import mf0.C24362h;
import mf0.C24365j;
import sf0.C24857d;

public /* synthetic */ class SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1 extends FunctionReference implements C24236l<C24306u0, Boolean> {

    /* renamed from: b */
    public static final SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1 f60744b = new SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1();

    public SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1() {
        super(1);
    }

    public final String getName() {
        return "containsFunctionN";
    }

    public final C24857d getOwner() {
        return C24365j.m61219a(C24362h.C24363a.class);
    }

    public final String getSignature() {
        return "enhance$containsFunctionN(Lorg/jetbrains/kotlin/types/UnwrappedType;)Z";
    }

    public final Object invoke(Object obj) {
        C24306u0 u0Var = (C24306u0) obj;
        C24362h.m61211f(u0Var, "p0");
        return Boolean.valueOf(SignatureEnhancement.SignatureParts.m59167a(u0Var));
    }
}
