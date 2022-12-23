package p988j$.util.concurrent;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: j$.util.concurrent.c */
abstract class C25888c implements Collection, Serializable {

    /* renamed from: a */
    final ConcurrentHashMap f64547a;

    C25888c(ConcurrentHashMap concurrentHashMap) {
        this.f64547a = concurrentHashMap;
    }

    public final void clear() {
        this.f64547a.clear();
    }

    public abstract boolean contains(Object obj);

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean containsAll(java.util.Collection r2) {
        /*
            r1 = this;
            if (r2 == r1) goto L_0x001a
            java.util.Iterator r2 = r2.iterator()
        L_0x0006:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r2.next()
            if (r0 == 0) goto L_0x0018
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0006
        L_0x0018:
            r2 = 0
            return r2
        L_0x001a:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.concurrent.C25888c.containsAll(java.util.Collection):boolean");
    }

    public final boolean isEmpty() {
        return this.f64547a.isEmpty();
    }

    public abstract Iterator iterator();

    public final boolean removeAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        Iterator it = iterator();
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        Iterator it = iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        return this.f64547a.size();
    }

    public final Object[] toArray() {
        long mappingCount = this.f64547a.mappingCount();
        if (mappingCount <= 2147483639) {
            int i = (int) mappingCount;
            Object[] objArr = new Object[i];
            int i2 = 0;
            Iterator it = iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (i2 == i) {
                    int i3 = 2147483639;
                    if (i < 2147483639) {
                        if (i < 1073741819) {
                            i3 = (i >>> 1) + 1 + i;
                        }
                        objArr = Arrays.copyOf(objArr, i3);
                        i = i3;
                    } else {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                }
                objArr[i2] = next;
                i2++;
            }
            return i2 == i ? objArr : Arrays.copyOf(objArr, i2);
        }
        throw new OutOfMemoryError("Required array size too large");
    }

    public final Object[] toArray(Object[] objArr) {
        long mappingCount = this.f64547a.mappingCount();
        if (mappingCount <= 2147483639) {
            int i = (int) mappingCount;
            Object[] objArr2 = objArr.length >= i ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
            int length = objArr2.length;
            int i2 = 0;
            Iterator it = iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (i2 == length) {
                    int i3 = 2147483639;
                    if (length < 2147483639) {
                        if (length < 1073741819) {
                            i3 = (length >>> 1) + 1 + length;
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                        length = i3;
                    } else {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                }
                objArr2[i2] = next;
                i2++;
            }
            if (objArr != objArr2 || i2 >= length) {
                return i2 == length ? objArr2 : Arrays.copyOf(objArr2, i2);
            }
            objArr2[i2] = null;
            return objArr2;
        }
        throw new OutOfMemoryError("Required array size too large");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        if (it.hasNext()) {
            while (true) {
                Object next = it.next();
                if (next == this) {
                    next = "(this Collection)";
                }
                sb.append(next);
                if (!it.hasNext()) {
                    break;
                }
                sb.append(',');
                sb.append(' ');
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
