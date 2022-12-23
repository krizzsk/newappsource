package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import lf0.C24236l;
import mf0.C24362h;

final class TypeIntersectionScope$getContributedFunctions$1 extends Lambda implements C24236l<C23903e, C23894a> {

    /* renamed from: f */
    public static final TypeIntersectionScope$getContributedFunctions$1 f61228f = new TypeIntersectionScope$getContributedFunctions$1();

    public TypeIntersectionScope$getContributedFunctions$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        C23903e eVar = (C23903e) obj;
        C24362h.m61211f(eVar, "$this$selectMostSpecificInEachOverridableGroup");
        return eVar;
    }
}
