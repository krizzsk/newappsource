package p084f6;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import p584jl.C17885a;

/* renamed from: f6.b */
public final class C4689b {

    /* renamed from: a */
    public final HashMap f15954a = new HashMap();

    /* renamed from: b */
    public final C4691b f15955b = new C4691b();

    /* renamed from: f6.b$a */
    public static class C4690a {

        /* renamed from: a */
        public final ReentrantLock f15956a = new ReentrantLock();

        /* renamed from: b */
        public int f15957b;
    }

    /* renamed from: f6.b$b */
    public static class C4691b {

        /* renamed from: a */
        public final ArrayDeque f15958a = new ArrayDeque();
    }

    /* renamed from: a */
    public final void mo20210a(String str) {
        C4690a aVar;
        synchronized (this) {
            Object obj = this.f15954a.get(str);
            C17885a.m44458r(obj);
            aVar = (C4690a) obj;
            int i = aVar.f15957b;
            if (i >= 1) {
                int i2 = i - 1;
                aVar.f15957b = i2;
                if (i2 == 0) {
                    C4690a aVar2 = (C4690a) this.f15954a.remove(str);
                    if (aVar2.equals(aVar)) {
                        C4691b bVar = this.f15955b;
                        synchronized (bVar.f15958a) {
                            if (bVar.f15958a.size() < 10) {
                                bVar.f15958a.offer(aVar2);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f15957b);
            }
        }
        aVar.f15956a.unlock();
    }
}
