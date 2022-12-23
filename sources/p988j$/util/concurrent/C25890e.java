package p988j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.concurrent.e */
final class C25890e extends C25887b implements Iterator, p988j$.util.Iterator {
    C25890e(C25898m[] mVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(mVarArr, i, i2, concurrentHashMap);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final Object next() {
        C25898m mVar = this.f64566b;
        if (mVar != null) {
            Object obj = mVar.f64558b;
            Object obj2 = mVar.f64559c;
            this.f64546j = mVar;
            mo83979d();
            return new C25897l(obj, obj2, this.f64545i);
        }
        throw new NoSuchElementException();
    }
}
