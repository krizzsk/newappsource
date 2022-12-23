package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import pg0.C24698d;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$computeIndexedQualifiersForOverride$1 */
final class C23973x28f4b533 extends Lambda implements C24236l<Integer, C24698d> {
    public final /* synthetic */ C24698d[] $computedResult;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23973x28f4b533(C24698d[] dVarArr) {
        super(1);
        this.$computedResult = dVarArr;
    }

    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        C24698d[] dVarArr = this.$computedResult;
        if (intValue >= 0) {
            C24362h.m61211f(dVarArr, "<this>");
            if (intValue <= dVarArr.length - 1) {
                return dVarArr[intValue];
            }
        }
        return C24698d.f62531e;
    }
}
