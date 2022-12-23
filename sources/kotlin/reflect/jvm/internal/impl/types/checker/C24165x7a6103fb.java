package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import lf0.C24236l;
import lh0.C24312z;
import mf0.C24362h;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$intersectTypesWithoutIntersectionType$errorMessage$1 */
final class C24165x7a6103fb extends Lambda implements C24225a<String> {
    public final /* synthetic */ Set<C24312z> $inputTypes;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24165x7a6103fb(LinkedHashSet linkedHashSet) {
        super(0);
        this.$inputTypes = linkedHashSet;
    }

    public final Object invoke() {
        return C24362h.m61216k(C23825c.m58520q0(this.$inputTypes, (String) null, (String) null, (String) null, (C24236l) null, 63), "This collections cannot be empty! input types: ");
    }
}
