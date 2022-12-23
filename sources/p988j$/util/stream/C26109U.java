package p988j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p988j$.util.Spliterator;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.util.stream.U */
final class C26109U extends CountedCompleter {

    /* renamed from: h */
    public static final /* synthetic */ int f64818h = 0;

    /* renamed from: a */
    private final C26239v0 f64819a;

    /* renamed from: b */
    private Spliterator f64820b;

    /* renamed from: c */
    private final long f64821c;

    /* renamed from: d */
    private final ConcurrentHashMap f64822d;

    /* renamed from: e */
    private final C26166g2 f64823e;

    /* renamed from: f */
    private final C26109U f64824f;

    /* renamed from: g */
    private C26043E0 f64825g;

    C26109U(C26109U u, Spliterator spliterator, C26109U u2) {
        super(u);
        this.f64819a = u.f64819a;
        this.f64820b = spliterator;
        this.f64821c = u.f64821c;
        this.f64822d = u.f64822d;
        this.f64823e = u.f64823e;
        this.f64824f = u2;
    }

    protected C26109U(C26239v0 v0Var, Spliterator spliterator, C26166g2 g2Var) {
        super((CountedCompleter) null);
        this.f64819a = v0Var;
        this.f64820b = spliterator;
        this.f64821c = C26158f.m65405f(spliterator.estimateSize());
        this.f64822d = new ConcurrentHashMap(Math.max(16, C26158f.f64912g << 1));
        this.f64823e = g2Var;
        this.f64824f = null;
    }

    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f64820b;
        long j = this.f64821c;
        boolean z = false;
        C26109U u = this;
        while (spliterator.estimateSize() > j && (trySplit = spliterator.trySplit()) != null) {
            C26109U u2 = new C26109U(u, trySplit, u.f64824f);
            C26109U u3 = new C26109U(u, spliterator, u2);
            u.addToPendingCount(1);
            u3.addToPendingCount(1);
            u.f64822d.put(u2, u3);
            if (u.f64824f != null) {
                u2.addToPendingCount(1);
                if (u.f64822d.replace(u.f64824f, u, u2)) {
                    u.addToPendingCount(-1);
                } else {
                    u2.addToPendingCount(-1);
                }
            }
            if (z) {
                spliterator = trySplit;
                u = u2;
                u2 = u3;
            } else {
                u = u3;
            }
            z = !z;
            u2.fork();
        }
        if (u.getPendingCount() > 0) {
            C26138b bVar = new C26138b(16);
            C26239v0 v0Var = u.f64819a;
            C26259z0 d1 = v0Var.mo84162d1(v0Var.mo84462S0(spliterator), bVar);
            u.f64819a.mo84464g1(spliterator, d1);
            u.f64825g = d1.build();
            u.f64820b = null;
        }
        u.tryComplete();
    }

    public final void onCompletion(CountedCompleter countedCompleter) {
        C26043E0 e0 = this.f64825g;
        if (e0 != null) {
            e0.forEach(this.f64823e);
            this.f64825g = null;
        } else {
            Spliterator spliterator = this.f64820b;
            if (spliterator != null) {
                this.f64819a.mo84464g1(spliterator, this.f64823e);
                this.f64820b = null;
            }
        }
        C26109U u = (C26109U) this.f64822d.remove(this);
        if (u != null) {
            u.tryComplete();
        }
    }
}
