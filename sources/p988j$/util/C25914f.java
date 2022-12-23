package p988j$.util;

import p988j$.util.function.C25975j;
import p988j$.util.function.C25981m;

/* renamed from: j$.util.f */
public final class C25914f implements C25981m {

    /* renamed from: a */
    private double f64597a;

    /* renamed from: b */
    private double f64598b;
    private long count;
    private double max = Double.NEGATIVE_INFINITY;
    private double min = Double.POSITIVE_INFINITY;
    private double sum;

    /* renamed from: a */
    public final void mo84006a(C25914f fVar) {
        this.count += fVar.count;
        this.f64598b += fVar.f64598b;
        double d = fVar.sum - this.f64597a;
        double d2 = this.sum;
        double d3 = d2 + d;
        double d4 = (d3 - d2) - d;
        this.f64597a = d4;
        double d5 = fVar.f64597a - d4;
        double d6 = d3 + d5;
        this.f64597a = (d6 - d3) - d5;
        this.sum = d6;
        this.min = Math.min(this.min, fVar.min);
        this.max = Math.max(this.max, fVar.max);
    }

    public final void accept(double d) {
        this.count++;
        this.f64598b += d;
        double d2 = d - this.f64597a;
        double d3 = this.sum;
        double d4 = d3 + d2;
        this.f64597a = (d4 - d3) - d2;
        this.sum = d4;
        this.min = Math.min(this.min, d);
        this.max = Math.max(this.max, d);
    }

    /* renamed from: l */
    public final C25981m mo83888l(C25981m mVar) {
        mVar.getClass();
        return new C25975j(this, mVar);
    }

    public final String toString() {
        double d;
        Object[] objArr = new Object[6];
        objArr[0] = C25914f.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        double d2 = this.sum + this.f64597a;
        if (Double.isNaN(d2) && Double.isInfinite(this.f64598b)) {
            d2 = this.f64598b;
        }
        objArr[2] = Double.valueOf(d2);
        objArr[3] = Double.valueOf(this.min);
        if (this.count > 0) {
            double d3 = this.sum + this.f64597a;
            if (Double.isNaN(d3) && Double.isInfinite(this.f64598b)) {
                d3 = this.f64598b;
            }
            d = d3 / ((double) this.count);
        } else {
            d = 0.0d;
        }
        objArr[4] = Double.valueOf(d);
        objArr[5] = Double.valueOf(this.max);
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", objArr);
    }
}
