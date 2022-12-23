package p988j$.util.concurrent;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p988j$.util.Collection;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;
import p988j$.util.function.Predicate;

/* renamed from: j$.util.concurrent.j */
public final class C25895j extends C25888c implements Set, p988j$.util.Set {
    C25895j(ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return this.f64547a.containsKey(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = (java.util.Set) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            boolean r0 = r2 instanceof java.util.Set
            if (r0 == 0) goto L_0x0016
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == r1) goto L_0x0014
            boolean r0 = r1.containsAll(r2)
            if (r0 == 0) goto L_0x0016
            boolean r2 = r2.containsAll(r1)
            if (r2 == 0) goto L_0x0016
        L_0x0014:
            r2 = 1
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.concurrent.C25895j.equals(java.lang.Object):boolean");
    }

    public final void forEach(Consumer consumer) {
        consumer.getClass();
        C25898m[] mVarArr = this.f64547a.table;
        if (mVarArr != null) {
            C25902q qVar = new C25902q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                C25898m d = qVar.mo83979d();
                if (d != null) {
                    consumer.accept(d.f64558b);
                } else {
                    return;
                }
            }
        }
    }

    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (((C25887b) it).hasNext()) {
            i += ((C25894i) it).next().hashCode();
        }
        return i;
    }

    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f64547a;
        C25898m[] mVarArr = concurrentHashMap.table;
        int length = mVarArr == null ? 0 : mVarArr.length;
        return new C25894i(mVarArr, length, length, concurrentHashMap, 0);
    }

    public final boolean remove(Object obj) {
        return this.f64547a.remove(obj) != null;
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
        return new C25896k(mVarArr, length, 0, length, j, 0);
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, intFunction);
    }

    public final /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, IntFunction.VivifiedWrapper.convert(intFunction));
    }
}
