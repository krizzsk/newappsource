package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import fg0.C23367l;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.FunctionReference;
import lf0.C24236l;
import mf0.C24362h;
import mf0.C24365j;
import sf0.C24857d;

final /* synthetic */ class ReflectJavaClass$constructors$2 extends FunctionReference implements C24236l<Constructor<?>, C23367l> {

    /* renamed from: b */
    public static final ReflectJavaClass$constructors$2 f60537b = new ReflectJavaClass$constructors$2();

    public ReflectJavaClass$constructors$2() {
        super(1);
    }

    public final String getName() {
        return "<init>";
    }

    public final C24857d getOwner() {
        return C24365j.m61219a(C23367l.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    public final Object invoke(Object obj) {
        Constructor constructor = (Constructor) obj;
        C24362h.m61211f(constructor, "p0");
        return new C23367l(constructor);
    }
}
