package p988j$.util.concurrent;

import java.util.Iterator;
import p988j$.util.Collection;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;
import p988j$.util.function.Predicate;

/* renamed from: j$.util.concurrent.t */
final class C25905t extends C25888c implements Collection {
    C25905t(ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return this.f64547a.containsValue(obj);
    }

    public final void forEach(Consumer consumer) {
        consumer.getClass();
        C25898m[] mVarArr = this.f64547a.table;
        if (mVarArr != null) {
            C25902q qVar = new C25902q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                C25898m d = qVar.mo83979d();
                if (d != null) {
                    consumer.accept(d.f64559c);
                } else {
                    return;
                }
            }
        }
    }

    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f64547a;
        C25898m[] mVarArr = concurrentHashMap.table;
        int length = mVarArr == null ? 0 : mVarArr.length;
        return new C25894i(mVarArr, length, length, concurrentHashMap, 1);
    }

    public final boolean remove(Object obj) {
        C25887b bVar;
        if (obj == null) {
            return false;
        }
        Iterator it = iterator();
        do {
            bVar = (C25887b) it;
            if (!bVar.hasNext()) {
                return false;
            }
        } while (!obj.equals(((C25894i) it).next()));
        bVar.remove();
        return true;
    }

    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return Collection.CC.$default$removeIf(this, Predicate.VivifiedWrapper.convert(predicate));
    }

    public final Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f64547a;
        long sumCount = concurrentHashMap.sumCount();
        C25898m[] mVarArr = concurrentHashMap.table;
        int length = mVarArr == null ? 0 : mVarArr.length;
        long j = 0;
        if (sumCount >= 0) {
            j = sumCount;
        }
        return new C25896k(mVarArr, length, 0, length, j, 1);
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, intFunction);
    }

    public final /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, IntFunction.VivifiedWrapper.convert(intFunction));
    }
}
