package oh0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* renamed from: oh0.m */
public final class C24624m {

    /* renamed from: oh0.m$a */
    public /* synthetic */ class C24625a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62315a;

        static {
            int[] iArr = new int[Variance.values().length];
            iArr[Variance.INVARIANT.ordinal()] = 1;
            iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            f62315a = iArr;
        }
    }

    /* renamed from: a */
    public static final TypeVariance m61889a(Variance variance) {
        int i = C24625a.f62315a[variance.ordinal()];
        if (i == 1) {
            return TypeVariance.INV;
        }
        if (i == 2) {
            return TypeVariance.IN;
        }
        if (i == 3) {
            return TypeVariance.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
