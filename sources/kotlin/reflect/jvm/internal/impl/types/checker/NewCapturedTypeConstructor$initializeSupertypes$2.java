package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import lh0.C24306u0;

final class NewCapturedTypeConstructor$initializeSupertypes$2 extends Lambda implements C24225a<List<? extends C24306u0>> {
    public final /* synthetic */ List<C24306u0> $supertypes;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor$initializeSupertypes$2(ArrayList arrayList) {
        super(0);
        this.$supertypes = arrayList;
    }

    public final Object invoke() {
        return this.$supertypes;
    }
}
