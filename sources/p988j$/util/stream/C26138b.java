package p988j$.util.stream;

import java.util.List;
import java.util.Set;
import p988j$.util.concurrent.C25906u;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.BiFunction;
import p988j$.util.function.C25916A0;
import p988j$.util.function.C25922D0;
import p988j$.util.function.C25936K0;
import p988j$.util.function.C25942N0;
import p988j$.util.function.C25948Q0;
import p988j$.util.function.C25951U;
import p988j$.util.function.C25967f;
import p988j$.util.function.C25972h0;
import p988j$.util.function.C25992r0;
import p988j$.util.function.C25998u0;
import p988j$.util.function.C26004x0;
import p988j$.util.function.C26005y;
import p988j$.util.function.Function;
import p988j$.util.function.IntFunction;
import p988j$.util.function.Supplier;

/* renamed from: j$.util.stream.b */
public final /* synthetic */ class C26138b implements IntFunction, Function, C25967f, C26004x0, BiConsumer, C26005y, Supplier, C25936K0, C25942N0, C25951U, C25916A0, C25998u0, C25948Q0, C25922D0, C25972h0 {

    /* renamed from: a */
    public final /* synthetic */ int f64881a;

    public /* synthetic */ C26138b(int i) {
        this.f64881a = i;
    }

    /* renamed from: a */
    public final C25998u0 mo84091a(C25998u0 u0Var) {
        u0Var.getClass();
        return new C25992r0(this, u0Var, 1);
    }

    public final void accept(Object obj, double d) {
        switch (this.f64881a) {
            case 4:
                double[] dArr = (double[]) obj;
                int i = C26032C.f64704s;
                Collectors.m64949a(dArr, d);
                dArr[2] = dArr[2] + d;
                return;
            default:
                double[] dArr2 = (double[]) obj;
                int i2 = C26032C.f64704s;
                dArr2[2] = dArr2[2] + 1.0d;
                Collectors.m64949a(dArr2, d);
                dArr2[3] = dArr2[3] + d;
                return;
        }
    }

    public final void accept(Object obj, int i) {
        long[] jArr = (long[]) obj;
        int i2 = C26149d0.f64899s;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + ((long) i);
    }

    public final void accept(Object obj, long j) {
        long[] jArr = (long[]) obj;
        int i = C26179j0.f64938s;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j;
    }

    public final void accept(Object obj, Object obj2) {
        switch (this.f64881a) {
            case 5:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                int i = C26032C.f64704s;
                Collectors.m64949a(dArr, dArr2[0]);
                Collectors.m64949a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                return;
            case 9:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                int i2 = C26032C.f64704s;
                Collectors.m64949a(dArr3, dArr4[0]);
                Collectors.m64949a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                return;
            case 21:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                int i3 = C26149d0.f64899s;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                return;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                int i4 = C26179j0.f64938s;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                return;
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f64881a) {
            case 5:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            case 9:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            case 21:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            default:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
        }
    }

    public final BiFunction andThen(Function function) {
        function.getClass();
        return new C25906u(this, function);
    }

    public final Object apply(int i) {
        switch (this.f64881a) {
            case 0:
                return new Object[i];
            case 3:
                int i2 = C26032C.f64704s;
                return new Double[i];
            case 16:
                int i3 = C26109U.f64818h;
                return new Object[i];
            case 22:
                int i4 = C26149d0.f64899s;
                return new Integer[i];
            default:
                int i5 = C26179j0.f64938s;
                return new Long[i];
        }
    }

    public final Object apply(long j) {
        return C26239v0.m65654Q0(j);
    }

    public final Object apply(Object obj) {
        Set set = Collectors.f64712a;
        return obj;
    }

    public final Object apply(Object obj, Object obj2) {
        List list = (List) obj;
        Set set = Collectors.f64712a;
        list.addAll((List) obj2);
        return list;
    }

    public final double applyAsDouble(Object obj) {
        int i = C26032C.f64704s;
        return ((Double) obj).doubleValue();
    }

    public final int applyAsInt(Object obj) {
        int i = C26149d0.f64899s;
        return ((Integer) obj).intValue();
    }

    public final long applyAsLong(double d) {
        int i = C26032C.f64704s;
        return 1;
    }

    public final long applyAsLong(int i) {
        int i2 = C26149d0.f64899s;
        return 1;
    }

    public final long applyAsLong(long j) {
        int i = C26179j0.f64938s;
        return 1;
    }

    public final long applyAsLong(Object obj) {
        int i = C26179j0.f64938s;
        return ((Long) obj).longValue();
    }

    /* renamed from: b */
    public final C25998u0 mo84093b(C25998u0 u0Var) {
        u0Var.getClass();
        return new C25992r0(this, u0Var, 0);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }

    public final Object get() {
        switch (this.f64881a) {
            case 7:
                int i = C26032C.f64704s;
                return new double[4];
            case 11:
                int i2 = C26032C.f64704s;
                return new double[3];
            case 12:
                return new C26062I();
            case 13:
                return new C26070K();
            case 14:
                return new C26074L();
            case 15:
                return new C26066J();
            case 19:
                int i3 = C26149d0.f64899s;
                return new long[2];
            default:
                int i4 = C26179j0.f64938s;
                return new long[2];
        }
    }
}
