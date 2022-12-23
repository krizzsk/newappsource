package p988j$.util.stream;

import java.util.concurrent.atomic.AtomicBoolean;
import p988j$.util.concurrent.ConcurrentHashMap;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.C25941N;
import p988j$.util.function.C25978k0;
import p988j$.util.function.C25993s;
import p988j$.util.function.Consumer;
import p988j$.util.function.Predicate;
import p988j$.util.function.Supplier;

/* renamed from: j$.util.stream.n */
public final /* synthetic */ class C26198n implements Consumer, Supplier {

    /* renamed from: a */
    public final /* synthetic */ int f64965a;

    /* renamed from: b */
    public final /* synthetic */ Object f64966b;

    /* renamed from: c */
    public final /* synthetic */ Object f64967c;

    public /* synthetic */ C26198n(int i, Object obj, Object obj2) {
        this.f64965a = i;
        this.f64966b = obj;
        this.f64967c = obj2;
    }

    public final void accept(Object obj) {
        switch (this.f64965a) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f64966b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f64967c;
                if (obj == null) {
                    atomicBoolean.set(true);
                    return;
                } else {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                    return;
                }
            case 5:
                ((BiConsumer) this.f64966b).accept(this.f64967c, obj);
                return;
            default:
                ((C26152d3) this.f64966b).mo84482g((Consumer) this.f64967c, obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f64965a) {
            case 0:
                return Consumer.CC.$default$andThen(this, consumer);
            case 5:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    public final Object get() {
        switch (this.f64965a) {
            case 1:
                return new C26204o0((C25941N) this.f64967c, (C26224s0) this.f64966b);
            case 2:
                return new C26199n0((Predicate) this.f64967c, (C26224s0) this.f64966b);
            case 3:
                return new C26214q0((C25993s) this.f64967c, (C26224s0) this.f64966b);
            default:
                return new C26209p0((C25978k0) this.f64967c, (C26224s0) this.f64966b);
        }
    }
}
