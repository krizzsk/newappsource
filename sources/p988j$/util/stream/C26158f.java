package p988j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;
import p988j$.util.Spliterator;

/* renamed from: j$.util.stream.f */
abstract class C26158f extends CountedCompleter {

    /* renamed from: g */
    static final int f64912g = (ForkJoinPool.getCommonPoolParallelism() << 2);

    /* renamed from: a */
    protected final C26239v0 f64913a;

    /* renamed from: b */
    protected Spliterator f64914b;

    /* renamed from: c */
    protected long f64915c;

    /* renamed from: d */
    protected C26158f f64916d;

    /* renamed from: e */
    protected C26158f f64917e;

    /* renamed from: f */
    private Object f64918f;

    protected C26158f(C26158f fVar, Spliterator spliterator) {
        super(fVar);
        this.f64914b = spliterator;
        this.f64913a = fVar.f64913a;
        this.f64915c = fVar.f64915c;
    }

    protected C26158f(C26239v0 v0Var, Spliterator spliterator) {
        super((CountedCompleter) null);
        this.f64913a = v0Var;
        this.f64914b = spliterator;
        this.f64915c = 0;
    }

    /* renamed from: f */
    public static long m65405f(long j) {
        long j2 = j / ((long) f64912g);
        if (j2 > 0) {
            return j2;
        }
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo84333a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo84476b() {
        return this.f64918f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C26158f mo84484c() {
        return (C26158f) getCompleter();
    }

    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f64914b;
        long estimateSize = spliterator.estimateSize();
        long j = this.f64915c;
        if (j == 0) {
            j = m65405f(estimateSize);
            this.f64915c = j;
        }
        boolean z = false;
        C26158f fVar = this;
        while (estimateSize > j && (trySplit = spliterator.trySplit()) != null) {
            C26158f d = fVar.mo84334d(trySplit);
            fVar.f64916d = d;
            C26158f d2 = fVar.mo84334d(spliterator);
            fVar.f64917e = d2;
            fVar.setPendingCount(1);
            if (z) {
                spliterator = trySplit;
                fVar = d;
                d = d2;
            } else {
                fVar = d2;
            }
            z = !z;
            d.fork();
            estimateSize = spliterator.estimateSize();
        }
        fVar.mo84478e(fVar.mo84333a());
        fVar.tryComplete();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C26158f mo84334d(Spliterator spliterator);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo84478e(Object obj) {
        this.f64918f = obj;
    }

    public Object getRawResult() {
        return this.f64918f;
    }

    public void onCompletion(CountedCompleter countedCompleter) {
        this.f64914b = null;
        this.f64917e = null;
        this.f64916d = null;
    }

    /* access modifiers changed from: protected */
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }
}
