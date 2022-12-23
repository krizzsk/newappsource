package p988j$.util.stream;

/* renamed from: j$.util.stream.e */
abstract class C26153e {

    /* renamed from: a */
    protected final int f64904a;

    /* renamed from: b */
    protected int f64905b;

    /* renamed from: c */
    protected int f64906c;

    /* renamed from: d */
    protected long[] f64907d;

    protected C26153e() {
        this.f64904a = 4;
    }

    protected C26153e(int i) {
        if (i >= 0) {
            this.f64904a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i - 1));
            return;
        }
        throw new IllegalArgumentException("Illegal Capacity: " + i);
    }

    public abstract void clear();

    public final long count() {
        int i = this.f64906c;
        return i == 0 ? (long) this.f64905b : this.f64907d[i] + ((long) this.f64905b);
    }
}
