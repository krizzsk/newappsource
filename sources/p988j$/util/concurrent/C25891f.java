package p988j$.util.concurrent;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p988j$.util.Collection;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;
import p988j$.util.function.Predicate;

/* renamed from: j$.util.concurrent.f */
final class C25891f extends C25888c implements Set, p988j$.util.Set {
    C25891f(ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
    }

    public final boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return this.f64547a.putVal(entry.getKey(), entry.getValue(), false) == null;
    }

    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.f64547a.putVal(entry.getKey(), entry.getValue(), false) == null) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r2.f64547a.get((r0 = r3.getKey()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r3 = (r3 = (java.util.Map.Entry) r3).getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean contains(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Map.Entry
            if (r0 == 0) goto L_0x0024
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            if (r0 == 0) goto L_0x0024
            j$.util.concurrent.ConcurrentHashMap r1 = r2.f64547a
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r3 = r3.getValue()
            if (r3 == 0) goto L_0x0024
            if (r3 == r0) goto L_0x0022
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0024
        L_0x0022:
            r3 = 1
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.concurrent.C25891f.contains(java.lang.Object):boolean");
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
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.concurrent.C25891f.equals(java.lang.Object):boolean");
    }

    public final void forEach(Consumer consumer) {
        consumer.getClass();
        C25898m[] mVarArr = this.f64547a.table;
        if (mVarArr != null) {
            C25902q qVar = new C25902q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                C25898m d = qVar.mo83979d();
                if (d != null) {
                    consumer.accept(new C25897l(d.f64558b, d.f64559c, this.f64547a));
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
        C25898m[] mVarArr = this.f64547a.table;
        int i = 0;
        if (mVarArr != null) {
            C25902q qVar = new C25902q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                C25898m d = qVar.mo83979d();
                if (d == null) {
                    break;
                }
                i += d.hashCode();
            }
        }
        return i;
    }

    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f64547a;
        C25898m[] mVarArr = concurrentHashMap.table;
        int length = mVarArr == null ? 0 : mVarArr.length;
        return new C25890e(mVarArr, length, length, concurrentHashMap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (java.util.Map.Entry) r3;
        r0 = r3.getKey();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r3 = r3.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean remove(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Map.Entry
            if (r0 == 0) goto L_0x001c
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            if (r0 == 0) goto L_0x001c
            java.lang.Object r3 = r3.getValue()
            if (r3 == 0) goto L_0x001c
            j$.util.concurrent.ConcurrentHashMap r1 = r2.f64547a
            boolean r3 = r1.remove(r0, r3)
            if (r3 == 0) goto L_0x001c
            r3 = 1
            goto L_0x001d
        L_0x001c:
            r3 = 0
        L_0x001d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.concurrent.C25891f.remove(java.lang.Object):boolean");
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
        return new C25892g(mVarArr, length, 0, length, j, concurrentHashMap);
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, intFunction);
    }

    public final /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, IntFunction.VivifiedWrapper.convert(intFunction));
    }
}
