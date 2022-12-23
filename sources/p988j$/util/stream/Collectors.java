package p988j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: j$.util.stream.Collectors */
public final class Collectors {

    /* renamed from: a */
    static final Set f64712a;

    static {
        C26178j jVar = C26178j.CONCURRENT;
        C26178j jVar2 = C26178j.UNORDERED;
        C26178j jVar3 = C26178j.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(jVar, jVar2, jVar3));
        Collections.unmodifiableSet(EnumSet.of(jVar, jVar2));
        f64712a = Collections.unmodifiableSet(EnumSet.of(jVar3));
        Collections.unmodifiableSet(EnumSet.of(jVar2, jVar3));
        Collections.emptySet();
    }

    /* renamed from: a */
    static void m64949a(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new C26193m(new C26067J0(16), new C26067J0(17), new C26138b(2), f64712a);
    }
}
