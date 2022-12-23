package p988j$.util.stream;

/* renamed from: j$.util.stream.G0 */
abstract class C26053G0 implements C26043E0 {

    /* renamed from: a */
    protected final C26043E0 f64735a;

    /* renamed from: b */
    protected final C26043E0 f64736b;

    /* renamed from: c */
    private final long f64737c;

    C26053G0(C26043E0 e0, C26043E0 e02) {
        this.f64735a = e0;
        this.f64736b = e02;
        this.f64737c = e0.count() + e02.count();
    }

    /* renamed from: a */
    public final C26043E0 m65007a(int i) {
        if (i == 0) {
            return this.f64735a;
        }
        if (i == 1) {
            return this.f64736b;
        }
        throw new IndexOutOfBoundsException();
    }

    public final long count() {
        return this.f64737c;
    }

    /* renamed from: n */
    public final int mo84244n() {
        return 2;
    }
}
