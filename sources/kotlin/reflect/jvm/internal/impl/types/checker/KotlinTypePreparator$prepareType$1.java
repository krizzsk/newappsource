package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.FunctionReference;
import lf0.C24236l;
import lh0.C24306u0;
import mf0.C24362h;
import mf0.C24365j;
import oh0.C24617f;
import sf0.C24857d;

public /* synthetic */ class KotlinTypePreparator$prepareType$1 extends FunctionReference implements C24236l<C24617f, C24306u0> {
    public KotlinTypePreparator$prepareType$1(Object obj) {
        super(1, obj);
    }

    public final String getName() {
        return "prepareType";
    }

    public final C24857d getOwner() {
        return C24365j.m61219a(KotlinTypePreparator.class);
    }

    public final String getSignature() {
        return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
    }

    public final Object invoke(Object obj) {
        C24617f fVar = (C24617f) obj;
        C24362h.m61211f(fVar, "p0");
        return ((KotlinTypePreparator) this.receiver).mo58949d(fVar);
    }
}
