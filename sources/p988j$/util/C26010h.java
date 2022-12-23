package p988j$.util;

import p988j$.util.function.C25960b0;
import p988j$.util.function.C25966e0;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.h */
public final class C26010h implements C25966e0, IntConsumer {
    private long count;
    private long max = Long.MIN_VALUE;
    private long min = Long.MAX_VALUE;
    private long sum;

    /* renamed from: a */
    public final void mo84109a(C26010h hVar) {
        this.count += hVar.count;
        this.sum += hVar.sum;
        this.min = Math.min(this.min, hVar.min);
        this.max = Math.max(this.max, hVar.max);
    }

    public final void accept(int i) {
        accept((long) i);
    }

    public final void accept(long j) {
        this.count++;
        this.sum += j;
        this.min = Math.min(this.min, j);
        this.max = Math.max(this.max, j);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }

    /* renamed from: g */
    public final C25966e0 mo83884g(C25966e0 e0Var) {
        e0Var.getClass();
        return new C25960b0(this, e0Var);
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C26010h.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Long.valueOf(this.min);
        long j = this.count;
        objArr[4] = Double.valueOf(j > 0 ? ((double) this.sum) / ((double) j) : 0.0d);
        objArr[5] = Long.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
