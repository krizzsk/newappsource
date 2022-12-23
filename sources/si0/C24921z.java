package si0;

import java.util.concurrent.atomic.AtomicReference;
import mf0.C24362h;

/* renamed from: si0.z */
public final class C24921z {

    /* renamed from: a */
    public static final C24920y f62998a = new C24920y(new byte[0], 0, 0, false);

    /* renamed from: b */
    public static final int f62999b;

    /* renamed from: c */
    public static final AtomicReference<C24920y>[] f63000c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f62999b = highestOneBit;
        AtomicReference<C24920y>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f63000c = atomicReferenceArr;
    }

    /* renamed from: a */
    public static final void m62598a(C24920y yVar) {
        boolean z;
        int i;
        boolean z2 = true;
        if (yVar.f62996f == null && yVar.f62997g == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!yVar.f62994d) {
            Thread currentThread = Thread.currentThread();
            C24362h.m61210e(currentThread, "Thread.currentThread()");
            AtomicReference<C24920y> atomicReference = f63000c[(int) (currentThread.getId() & (((long) f62999b) - 1))];
            C24920y yVar2 = atomicReference.get();
            if (yVar2 != f62998a) {
                if (yVar2 != null) {
                    i = yVar2.f62993c;
                } else {
                    i = 0;
                }
                if (i < 65536) {
                    yVar.f62996f = yVar2;
                    yVar.f62992b = 0;
                    yVar.f62993c = i + 8192;
                    while (true) {
                        if (!atomicReference.compareAndSet(yVar2, yVar)) {
                            if (atomicReference.get() != yVar2) {
                                z2 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (!z2) {
                        yVar.f62996f = null;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static final C24920y m62599b() {
        Thread currentThread = Thread.currentThread();
        C24362h.m61210e(currentThread, "Thread.currentThread()");
        AtomicReference<C24920y> atomicReference = f63000c[(int) (currentThread.getId() & (((long) f62999b) - 1))];
        C24920y yVar = f62998a;
        C24920y andSet = atomicReference.getAndSet(yVar);
        if (andSet == yVar) {
            return new C24920y();
        }
        if (andSet == null) {
            atomicReference.set((Object) null);
            return new C24920y();
        }
        atomicReference.set(andSet.f62996f);
        andSet.f62996f = null;
        andSet.f62993c = 0;
        return andSet;
    }
}
