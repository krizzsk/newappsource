package p988j$.util.concurrent;

import sun.misc.Unsafe;

/* renamed from: j$.util.concurrent.a */
public abstract /* synthetic */ class C25886a {
    /* renamed from: a */
    public static /* synthetic */ boolean m64736a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
