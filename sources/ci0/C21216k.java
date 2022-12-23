package ci0;

import bi0.C21080r;
import java.util.concurrent.TimeUnit;
import p584jl.C17886b;

/* renamed from: ci0.k */
public final class C21216k {

    /* renamed from: a */
    public static final long f53149a = C17886b.m44487n("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* renamed from: b */
    public static final int f53150b;

    /* renamed from: c */
    public static final int f53151c = C17886b.m44488o("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);

    /* renamed from: d */
    public static final long f53152d = TimeUnit.SECONDS.toNanos(C17886b.m44487n("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));

    /* renamed from: e */
    public static C21209d f53153e = C21209d.f53143b;

    /* renamed from: f */
    public static final C21214i f53154f = new C21214i(0);

    /* renamed from: g */
    public static final C21214i f53155g = new C21214i(1);

    static {
        int i = C21080r.f52895a;
        if (i < 2) {
            i = 2;
        }
        f53150b = C17886b.m44488o("kotlinx.coroutines.scheduler.core.pool.size", i, 1, 0, 8);
    }
}
