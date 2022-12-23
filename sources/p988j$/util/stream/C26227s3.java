package p988j$.util.stream;

import p988j$.util.Spliterator;

/* renamed from: j$.util.stream.s3 */
abstract class C26227s3 {

    /* renamed from: a */
    final long f65015a;

    /* renamed from: b */
    final long f65016b;

    /* renamed from: c */
    Spliterator f65017c;

    /* renamed from: d */
    long f65018d;

    /* renamed from: e */
    long f65019e;

    C26227s3(Spliterator spliterator, long j, long j2, long j3, long j4) {
        this.f65017c = spliterator;
        this.f65015a = j;
        this.f65016b = j2;
        this.f65018d = j3;
        this.f65019e = j4;
    }

    public final int characteristics() {
        return this.f65017c.characteristics();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Spliterator mo84578d(Spliterator spliterator, long j, long j2, long j3, long j4);

    public final long estimateSize() {
        long j = this.f65015a;
        long j2 = this.f65019e;
        if (j < j2) {
            return j2 - Math.max(j, this.f65018d);
        }
        return 0;
    }

    public final Spliterator trySplit() {
        long j = this.f65015a;
        long j2 = this.f65019e;
        if (j >= j2 || this.f65018d >= j2) {
            return null;
        }
        while (true) {
            Spliterator trySplit = this.f65017c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.f65018d;
            long min = Math.min(estimateSize, this.f65016b);
            long j3 = this.f65015a;
            if (j3 >= min) {
                this.f65018d = min;
            } else {
                long j4 = this.f65016b;
                if (min >= j4) {
                    this.f65017c = trySplit;
                    this.f65019e = min;
                } else {
                    long j5 = this.f65018d;
                    if (j5 < j3 || estimateSize > j4) {
                        this.f65018d = min;
                        return mo84578d(trySplit, j3, j4, j5, min);
                    }
                    this.f65018d = min;
                    return trySplit;
                }
            }
        }
    }
}
