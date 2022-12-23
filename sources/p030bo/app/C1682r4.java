package p030bo.app;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* renamed from: bo.app.r4 */
public final class C1682r4 {
    static {
        new BigDecimal("100");
    }

    /* renamed from: a */
    public static BigDecimal m4678a(BigDecimal bigDecimal) {
        return bigDecimal.setScale(2, RoundingMode.HALF_UP);
    }
}
