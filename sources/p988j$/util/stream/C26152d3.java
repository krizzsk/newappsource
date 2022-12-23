package p988j$.util.stream;

import java.util.Comparator;
import p988j$.util.Spliterator;
import p988j$.util.concurrent.ConcurrentHashMap;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.d3 */
final class C26152d3 implements Spliterator, Consumer {

    /* renamed from: d */
    private static final Object f64900d = new Object();

    /* renamed from: a */
    private final Spliterator f64901a;

    /* renamed from: b */
    private final ConcurrentHashMap f64902b;

    /* renamed from: c */
    private Object f64903c;

    C26152d3(Spliterator spliterator) {
        this(spliterator, new ConcurrentHashMap());
    }

    private C26152d3(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f64901a = spliterator;
        this.f64902b = concurrentHashMap;
    }

    public final void accept(Object obj) {
        this.f64903c = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final int characteristics() {
        return (this.f64901a.characteristics() & -16469) | 1;
    }

    public final long estimateSize() {
        return this.f64901a.estimateSize();
    }

    public final void forEachRemaining(Consumer consumer) {
        this.f64901a.forEachRemaining(new C26198n(6, this, consumer));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo84482g(Consumer consumer, Object obj) {
        if (this.f64902b.putIfAbsent(obj != null ? obj : f64900d, Boolean.TRUE) == null) {
            consumer.accept(obj);
        }
    }

    public final Comparator getComparator() {
        return this.f64901a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final boolean tryAdvance(Consumer consumer) {
        while (this.f64901a.tryAdvance(this)) {
            ConcurrentHashMap concurrentHashMap = this.f64902b;
            Object obj = this.f64903c;
            if (obj == null) {
                obj = f64900d;
            }
            if (concurrentHashMap.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.f64903c);
                this.f64903c = null;
                return true;
            }
        }
        return false;
    }

    public final Spliterator trySplit() {
        Spliterator trySplit = this.f64901a.trySplit();
        if (trySplit != null) {
            return new C26152d3(trySplit, this.f64902b);
        }
        return null;
    }
}
