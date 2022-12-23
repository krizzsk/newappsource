package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import fg0.C23370o;
import java.lang.reflect.Field;
import kotlin.jvm.internal.FunctionReference;
import lf0.C24236l;
import mf0.C24362h;
import mf0.C24365j;
import sf0.C24857d;

final /* synthetic */ class ReflectJavaClass$fields$2 extends FunctionReference implements C24236l<Field, C23370o> {

    /* renamed from: b */
    public static final ReflectJavaClass$fields$2 f60539b = new ReflectJavaClass$fields$2();

    public ReflectJavaClass$fields$2() {
        super(1);
    }

    public final String getName() {
        return "<init>";
    }

    public final C24857d getOwner() {
        return C24365j.m61219a(C23370o.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    public final Object invoke(Object obj) {
        Field field = (Field) obj;
        C24362h.m61211f(field, "p0");
        return new C23370o(field);
    }
}
