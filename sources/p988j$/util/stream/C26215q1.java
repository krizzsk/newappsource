package p988j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.q1 */
abstract class C26215q1 extends CountedCompleter implements C26166g2 {

    /* renamed from: a */
    protected final Spliterator f64992a;

    /* renamed from: b */
    protected final C26239v0 f64993b;

    /* renamed from: c */
    protected final long f64994c;

    /* renamed from: d */
    protected long f64995d;

    /* renamed from: e */
    protected long f64996e;

    /* renamed from: f */
    protected int f64997f;

    /* renamed from: g */
    protected int f64998g;

    C26215q1(int i, Spliterator spliterator, C26239v0 v0Var) {
        this.f64992a = spliterator;
        this.f64993b = v0Var;
        this.f64994c = C26158f.m65405f(spliterator.estimateSize());
        this.f64995d = 0;
        this.f64996e = (long) i;
    }

    C26215q1(C26215q1 q1Var, Spliterator spliterator, long j, long j2, int i) {
        super(q1Var);
        this.f64992a = spliterator;
        this.f64993b = q1Var.f64993b;
        this.f64994c = q1Var.f64994c;
        this.f64995d = j;
        this.f64996e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= ((long) i)) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", new Object[]{Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)}));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C26215q1 mo84580a(Spliterator spliterator, long j, long j2);

    public /* synthetic */ void accept(double d) {
        C26239v0.m65666l0();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        C26239v0.m65673s0();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        C26239v0.m65674t0();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f64992a;
        C26215q1 q1Var = this;
        while (spliterator.estimateSize() > q1Var.f64994c && (trySplit = spliterator.trySplit()) != null) {
            q1Var.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            q1Var.mo84580a(trySplit, q1Var.f64995d, estimateSize).fork();
            q1Var = q1Var.mo84580a(spliterator, q1Var.f64995d + estimateSize, q1Var.f64996e - estimateSize);
        }
        q1Var.f64993b.mo84464g1(spliterator, q1Var);
        q1Var.propagateCompletion();
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        long j2 = this.f64996e;
        if (j <= j2) {
            int i = (int) this.f64995d;
            this.f64997f = i;
            this.f64998g = i + ((int) j2);
            return;
        }
        throw new IllegalStateException("size passed to Sink.begin exceeds array length");
    }

    public final /* synthetic */ void end() {
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo84149f() {
        return false;
    }
}
