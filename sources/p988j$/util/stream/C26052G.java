package p988j$.util.stream;

import p988j$.util.C26009g;
import p988j$.util.C26010h;
import p988j$.util.C26013k;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.C25916A0;
import p988j$.util.function.C25922D0;
import p988j$.util.function.C25927G;
import p988j$.util.function.C25958a0;
import p988j$.util.function.C25972h0;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;
import p988j$.util.function.Predicate;

/* renamed from: j$.util.stream.G */
public final /* synthetic */ class C26052G implements Predicate, C25927G, C25916A0, BiConsumer, IntFunction, C25958a0, C25972h0, C25922D0, Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f64734a;

    public /* synthetic */ C26052G(int i) {
        this.f64734a = i;
    }

    public final void accept(Object obj) {
    }

    public final void accept(Object obj, int i) {
        ((C26009g) obj).accept(i);
    }

    public final void accept(Object obj, long j) {
        ((C26010h) obj).accept(j);
    }

    public final void accept(Object obj, Object obj2) {
        switch (this.f64734a) {
            case 4:
                ((C26009g) obj).mo84107a((C26009g) obj2);
                return;
            default:
                ((C26010h) obj).mo84109a((C26010h) obj2);
                return;
        }
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f64734a) {
            case 4:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            default:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final Object apply(int i) {
        return Integer.valueOf(i);
    }

    public final Object apply(long j) {
        return Long.valueOf(j);
    }

    public final int applyAsInt(int i, int i2) {
        switch (this.f64734a) {
            case 1:
                return Math.min(i, i2);
            case 2:
                return i + i2;
            default:
                return Math.max(i, i2);
        }
    }

    public final long applyAsLong(long j, long j2) {
        switch (this.f64734a) {
            case 7:
                return Math.min(j, j2);
            case 8:
                return Math.max(j, j2);
            default:
                return j + j2;
        }
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo43234or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        return ((C26013k) obj).mo84117c();
    }
}
