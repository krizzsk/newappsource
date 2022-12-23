package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.FunctionReference;
import lf0.C24240p;
import lh0.C24307v;
import mf0.C24362h;
import mf0.C24365j;
import mh0.C24384h;
import sf0.C24857d;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1 */
final /* synthetic */ class C24167xc97d8c34 extends FunctionReference implements C24240p<C24307v, C24307v, Boolean> {
    public C24167xc97d8c34(C24384h hVar) {
        super(2, hVar);
    }

    public final String getName() {
        return "equalTypes";
    }

    public final C24857d getOwner() {
        return C24365j.m61219a(C24384h.class);
    }

    public final String getSignature() {
        return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    public final Object invoke(Object obj, Object obj2) {
        C24307v vVar = (C24307v) obj;
        C24307v vVar2 = (C24307v) obj2;
        C24362h.m61211f(vVar, "p0");
        C24362h.m61211f(vVar2, "p1");
        return Boolean.valueOf(((C24384h) this.receiver).mo60530d(vVar, vVar2));
    }
}
