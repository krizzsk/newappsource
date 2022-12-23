package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import pg0.C24698d;
import pg0.C24706j;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$enhance$qualifiersWithPredefined$1$1 */
public final class C23974x3450d111 extends Lambda implements C24236l<Integer, C24698d> {
    public final /* synthetic */ C24706j $predefined;
    public final /* synthetic */ C24236l<Integer, C24698d> $qualifiers;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23974x3450d111(C24706j jVar, C24236l<? super Integer, C24698d> lVar) {
        super(1);
        this.$predefined = jVar;
        this.$qualifiers = lVar;
    }

    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        C24698d dVar = this.$predefined.f62552a.get(Integer.valueOf(intValue));
        if (dVar == null) {
            return this.$qualifiers.invoke(Integer.valueOf(intValue));
        }
        return dVar;
    }
}
