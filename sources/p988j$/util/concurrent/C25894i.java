package p988j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.concurrent.i */
final class C25894i extends C25887b implements Iterator, Enumeration, p988j$.util.Iterator {

    /* renamed from: k */
    public final /* synthetic */ int f64551k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25894i(C25898m[] mVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap, int i3) {
        super(mVarArr, i, i2, concurrentHashMap);
        this.f64551k = i3;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        switch (this.f64551k) {
            case 0:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
            default:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
        }
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        switch (this.f64551k) {
            case 0:
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                return;
            default:
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                return;
        }
    }

    public final Object next() {
        switch (this.f64551k) {
            case 0:
                C25898m mVar = this.f64566b;
                if (mVar != null) {
                    Object obj = mVar.f64558b;
                    this.f64546j = mVar;
                    mo83979d();
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                C25898m mVar2 = this.f64566b;
                if (mVar2 != null) {
                    Object obj2 = mVar2.f64559c;
                    this.f64546j = mVar2;
                    mo83979d();
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }

    public final Object nextElement() {
        switch (this.f64551k) {
            case 0:
                return next();
            default:
                return next();
        }
    }
}
