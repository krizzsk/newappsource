package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import fg0.C23373r;
import java.lang.reflect.Method;
import kotlin.jvm.internal.FunctionReference;
import lf0.C24236l;
import mf0.C24362h;
import mf0.C24365j;
import sf0.C24857d;

final /* synthetic */ class ReflectJavaClass$methods$2 extends FunctionReference implements C24236l<Method, C23373r> {

    /* renamed from: b */
    public static final ReflectJavaClass$methods$2 f60542b = new ReflectJavaClass$methods$2();

    public ReflectJavaClass$methods$2() {
        super(1);
    }

    public final String getName() {
        return "<init>";
    }

    public final C24857d getOwner() {
        return C24365j.m61219a(C23373r.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Method;)V";
    }

    public final Object invoke(Object obj) {
        Method method = (Method) obj;
        C24362h.m61211f(method, "p0");
        return new C23373r(method);
    }
}
