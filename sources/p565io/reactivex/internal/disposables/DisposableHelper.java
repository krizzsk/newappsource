package p565io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import le0.C24224b;
import p565io.reactivex.exceptions.ProtocolViolationException;
import ve0.C25088a;

/* renamed from: io.reactivex.internal.disposables.DisposableHelper */
public enum DisposableHelper implements C24224b {
    DISPOSED;

    public static boolean dispose(AtomicReference<C24224b> atomicReference) {
        C24224b andSet;
        C24224b bVar = atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (bVar == disposableHelper || (andSet = atomicReference.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean isDisposed(C24224b bVar) {
        return bVar == DISPOSED;
    }

    public static boolean replace(AtomicReference<C24224b> atomicReference, C24224b bVar) {
        boolean z;
        do {
            C24224b bVar2 = atomicReference.get();
            z = false;
            if (bVar2 != DISPOSED) {
                while (true) {
                    if (!atomicReference.compareAndSet(bVar2, bVar)) {
                        if (atomicReference.get() != bVar2) {
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                if (bVar != null) {
                    bVar.dispose();
                }
                return false;
            }
        } while (!z);
        return true;
    }

    public static void reportDisposableSet() {
        C25088a.m62857b(new ProtocolViolationException());
    }

    public static boolean set(AtomicReference<C24224b> atomicReference, C24224b bVar) {
        C24224b bVar2;
        boolean z;
        do {
            bVar2 = atomicReference.get();
            z = false;
            if (bVar2 != DISPOSED) {
                while (true) {
                    if (!atomicReference.compareAndSet(bVar2, bVar)) {
                        if (atomicReference.get() != bVar2) {
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                if (bVar != null) {
                    bVar.dispose();
                }
                return false;
            }
        } while (!z);
        if (bVar2 != null) {
            bVar2.dispose();
        }
        return true;
    }

    public static boolean setOnce(AtomicReference<C24224b> atomicReference, C24224b bVar) {
        boolean z;
        if (bVar != null) {
            while (true) {
                if (!atomicReference.compareAndSet((Object) null, bVar)) {
                    if (atomicReference.get() != null) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                return true;
            }
            bVar.dispose();
            if (atomicReference.get() != DISPOSED) {
                reportDisposableSet();
            }
            return false;
        }
        throw new NullPointerException("d is null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean trySet(java.util.concurrent.atomic.AtomicReference<le0.C24224b> r3, le0.C24224b r4) {
        /*
        L_0x0000:
            r0 = 0
            boolean r0 = r3.compareAndSet(r0, r4)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000b
            r0 = 1
            goto L_0x0012
        L_0x000b:
            java.lang.Object r0 = r3.get()
            if (r0 == 0) goto L_0x0000
            r0 = 0
        L_0x0012:
            if (r0 != 0) goto L_0x0020
            java.lang.Object r3 = r3.get()
            io.reactivex.internal.disposables.DisposableHelper r0 = DISPOSED
            if (r3 != r0) goto L_0x001f
            r4.dispose()
        L_0x001f:
            return r1
        L_0x0020:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p565io.reactivex.internal.disposables.DisposableHelper.trySet(java.util.concurrent.atomic.AtomicReference, le0.b):boolean");
    }

    public static boolean validate(C24224b bVar, C24224b bVar2) {
        if (bVar2 == null) {
            C25088a.m62857b(new NullPointerException("next is null"));
            return false;
        } else if (bVar == null) {
            return true;
        } else {
            bVar2.dispose();
            reportDisposableSet();
            return false;
        }
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return true;
    }
}
