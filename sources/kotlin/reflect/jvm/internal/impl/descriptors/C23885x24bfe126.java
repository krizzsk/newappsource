package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.FunctionReference;
import lf0.C24236l;
import mf0.C24362h;
import mf0.C24365j;
import sf0.C24857d;
import ug0.C25065b;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1 */
public /* synthetic */ class C23885x24bfe126 extends FunctionReference implements C24236l<C25065b, C25065b> {

    /* renamed from: b */
    public static final C23885x24bfe126 f60417b = new C23885x24bfe126();

    public C23885x24bfe126() {
        super(1);
    }

    public final String getName() {
        return "getOuterClassId";
    }

    public final C24857d getOwner() {
        return C24365j.m61219a(C25065b.class);
    }

    public final String getSignature() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }

    public final Object invoke(Object obj) {
        C25065b bVar = (C25065b) obj;
        C24362h.m61211f(bVar, "p0");
        return bVar.mo61573g();
    }
}
