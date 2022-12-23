package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.FunctionReference;
import lf0.C24240p;
import lh0.C24307v;
import mf0.C24362h;
import mf0.C24365j;
import mh0.C24382g;
import mh0.C24384h;
import sf0.C24857d;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1 */
final /* synthetic */ class C24166x702eebb8 extends FunctionReference implements C24240p<C24307v, C24307v, Boolean> {
    public C24166x702eebb8(Object obj) {
        super(2, obj);
    }

    public final String getName() {
        return "isStrictSupertype";
    }

    public final C24857d getOwner() {
        return C24365j.m61219a(TypeIntersector.class);
    }

    public final String getSignature() {
        return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        C24307v vVar = (C24307v) obj;
        C24307v vVar2 = (C24307v) obj2;
        C24362h.m61211f(vVar, "p0");
        C24362h.m61211f(vVar2, "p1");
        TypeIntersector typeIntersector = TypeIntersector.f61365a;
        ((TypeIntersector) this.receiver).getClass();
        C24382g.f61723b.getClass();
        C24384h hVar = C24382g.C24383a.f61725b;
        if (!hVar.mo60531f(vVar, vVar2) || hVar.mo60531f(vVar2, vVar)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
