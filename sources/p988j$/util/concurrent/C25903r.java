package p988j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* renamed from: j$.util.concurrent.r */
final class C25903r extends C25898m {

    /* renamed from: h */
    private static final Unsafe f64573h;

    /* renamed from: i */
    private static final long f64574i;

    /* renamed from: e */
    C25904s f64575e;

    /* renamed from: f */
    volatile C25904s f64576f;

    /* renamed from: g */
    volatile Thread f64577g;
    volatile int lockState;

    static {
        Class<ConcurrentHashMap> cls = ConcurrentHashMap.class;
        try {
            Unsafe c = C25908w.m64755c();
            f64573h = c;
            f64574i = c.objectFieldOffset(C25903r.class.getDeclaredField("lockState"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r6 = p988j$.util.concurrent.ConcurrentHashMap.comparableClassFor(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r8 = p988j$.util.concurrent.ConcurrentHashMap.compareComparables(r6, r3, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C25903r(p988j$.util.concurrent.C25904s r10) {
        /*
            r9 = this;
            r0 = -2
            r1 = 0
            r9.<init>(r0, r1, r1, r1)
            r9.f64576f = r10
            r0 = r1
        L_0x0008:
            if (r10 == 0) goto L_0x005c
            j$.util.concurrent.m r2 = r10.f64560d
            j$.util.concurrent.s r2 = (p988j$.util.concurrent.C25904s) r2
            r10.f64580g = r1
            r10.f64579f = r1
            if (r0 != 0) goto L_0x001b
            r10.f64578e = r1
            r0 = 0
            r10.f64582i = r0
        L_0x0019:
            r0 = r10
            goto L_0x0058
        L_0x001b:
            java.lang.Object r3 = r10.f64558b
            int r4 = r10.f64557a
            r5 = r0
            r6 = r1
        L_0x0021:
            java.lang.Object r7 = r5.f64558b
            int r8 = r5.f64557a
            if (r8 <= r4) goto L_0x0029
            r7 = -1
            goto L_0x0041
        L_0x0029:
            if (r8 >= r4) goto L_0x002d
            r7 = 1
            goto L_0x0041
        L_0x002d:
            if (r6 != 0) goto L_0x0035
            java.lang.Class r6 = p988j$.util.concurrent.ConcurrentHashMap.comparableClassFor(r3)
            if (r6 == 0) goto L_0x003b
        L_0x0035:
            int r8 = p988j$.util.concurrent.ConcurrentHashMap.compareComparables(r6, r3, r7)
            if (r8 != 0) goto L_0x0040
        L_0x003b:
            int r7 = m64747j(r3, r7)
            goto L_0x0041
        L_0x0040:
            r7 = r8
        L_0x0041:
            if (r7 > 0) goto L_0x0046
            j$.util.concurrent.s r8 = r5.f64579f
            goto L_0x0048
        L_0x0046:
            j$.util.concurrent.s r8 = r5.f64580g
        L_0x0048:
            if (r8 != 0) goto L_0x005a
            r10.f64578e = r5
            if (r7 > 0) goto L_0x0051
            r5.f64579f = r10
            goto L_0x0053
        L_0x0051:
            r5.f64580g = r10
        L_0x0053:
            j$.util.concurrent.s r10 = m64742c(r0, r10)
            goto L_0x0019
        L_0x0058:
            r10 = r2
            goto L_0x0008
        L_0x005a:
            r5 = r8
            goto L_0x0021
        L_0x005c:
            r9.f64575e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.concurrent.C25903r.<init>(j$.util.concurrent.s):void");
    }

    /* renamed from: b */
    static C25904s m64741b(C25904s sVar, C25904s sVar2) {
        C25904s sVar3;
        while (sVar2 != null && sVar2 != sVar) {
            C25904s sVar4 = sVar2.f64578e;
            if (sVar4 == null) {
                sVar2.f64582i = false;
                return sVar2;
            } else if (sVar2.f64582i) {
                sVar2.f64582i = false;
                return sVar;
            } else {
                C25904s sVar5 = sVar4.f64579f;
                C25904s sVar6 = null;
                if (sVar5 == sVar2) {
                    sVar3 = sVar4.f64580g;
                    if (sVar3 != null && sVar3.f64582i) {
                        sVar3.f64582i = false;
                        sVar4.f64582i = true;
                        sVar = m64745h(sVar, sVar4);
                        sVar4 = sVar2.f64578e;
                        sVar3 = sVar4 == null ? null : sVar4.f64580g;
                    }
                    if (sVar3 != null) {
                        C25904s sVar7 = sVar3.f64579f;
                        C25904s sVar8 = sVar3.f64580g;
                        if ((sVar8 != null && sVar8.f64582i) || (sVar7 != null && sVar7.f64582i)) {
                            if (sVar8 == null || !sVar8.f64582i) {
                                if (sVar7 != null) {
                                    sVar7.f64582i = false;
                                }
                                sVar3.f64582i = true;
                                sVar = m64746i(sVar, sVar3);
                                sVar4 = sVar2.f64578e;
                                if (sVar4 != null) {
                                    sVar6 = sVar4.f64580g;
                                }
                                sVar3 = sVar6;
                            }
                            if (sVar3 != null) {
                                sVar3.f64582i = sVar4 == null ? false : sVar4.f64582i;
                                C25904s sVar9 = sVar3.f64580g;
                                if (sVar9 != null) {
                                    sVar9.f64582i = false;
                                }
                            }
                            if (sVar4 != null) {
                                sVar4.f64582i = false;
                                sVar = m64745h(sVar, sVar4);
                            }
                            sVar2 = sVar;
                            sVar = sVar2;
                        }
                        sVar3.f64582i = true;
                    }
                } else {
                    if (sVar5 != null && sVar5.f64582i) {
                        sVar5.f64582i = false;
                        sVar4.f64582i = true;
                        sVar = m64746i(sVar, sVar4);
                        sVar4 = sVar2.f64578e;
                        sVar5 = sVar4 == null ? null : sVar4.f64579f;
                    }
                    if (sVar3 != null) {
                        C25904s sVar10 = sVar3.f64579f;
                        C25904s sVar11 = sVar3.f64580g;
                        if ((sVar10 != null && sVar10.f64582i) || (sVar11 != null && sVar11.f64582i)) {
                            if (sVar10 == null || !sVar10.f64582i) {
                                if (sVar11 != null) {
                                    sVar11.f64582i = false;
                                }
                                sVar3.f64582i = true;
                                sVar = m64745h(sVar, sVar3);
                                sVar4 = sVar2.f64578e;
                                if (sVar4 != null) {
                                    sVar6 = sVar4.f64579f;
                                }
                                sVar3 = sVar6;
                            }
                            if (sVar3 != null) {
                                sVar3.f64582i = sVar4 == null ? false : sVar4.f64582i;
                                C25904s sVar12 = sVar3.f64579f;
                                if (sVar12 != null) {
                                    sVar12.f64582i = false;
                                }
                            }
                            if (sVar4 != null) {
                                sVar4.f64582i = false;
                                sVar = m64746i(sVar, sVar4);
                            }
                            sVar2 = sVar;
                            sVar = sVar2;
                        }
                        sVar3.f64582i = true;
                    }
                }
                sVar2 = sVar4;
            }
        }
        return sVar;
    }

    /* renamed from: c */
    static C25904s m64742c(C25904s sVar, C25904s sVar2) {
        C25904s sVar3;
        sVar2.f64582i = true;
        while (true) {
            C25904s sVar4 = sVar2.f64578e;
            if (sVar4 == null) {
                sVar2.f64582i = false;
                return sVar2;
            } else if (!sVar4.f64582i || (sVar3 = sVar4.f64578e) == null) {
                return sVar;
            } else {
                C25904s sVar5 = sVar3.f64579f;
                if (sVar4 == sVar5) {
                    sVar5 = sVar3.f64580g;
                    if (sVar5 == null || !sVar5.f64582i) {
                        if (sVar2 == sVar4.f64580g) {
                            sVar = m64745h(sVar, sVar4);
                            C25904s sVar6 = sVar4.f64578e;
                            sVar3 = sVar6 == null ? null : sVar6.f64578e;
                            C25904s sVar7 = sVar4;
                            sVar4 = sVar6;
                            sVar2 = sVar7;
                        }
                        if (sVar4 != null) {
                            sVar4.f64582i = false;
                            if (sVar3 != null) {
                                sVar3.f64582i = true;
                                sVar = m64746i(sVar, sVar3);
                            }
                        }
                    }
                } else if (sVar5 == null || !sVar5.f64582i) {
                    if (sVar2 == sVar4.f64579f) {
                        sVar = m64746i(sVar, sVar4);
                        C25904s sVar8 = sVar4.f64578e;
                        sVar3 = sVar8 == null ? null : sVar8.f64578e;
                        C25904s sVar9 = sVar4;
                        sVar4 = sVar8;
                        sVar2 = sVar9;
                    }
                    if (sVar4 != null) {
                        sVar4.f64582i = false;
                        if (sVar3 != null) {
                            sVar3.f64582i = true;
                            sVar = m64745h(sVar, sVar3);
                        }
                    }
                }
                sVar5.f64582i = false;
                sVar4.f64582i = false;
                sVar3.f64582i = true;
                sVar2 = sVar3;
            }
        }
        return sVar;
    }

    /* renamed from: d */
    private final void m64743d() {
        boolean z = false;
        while (true) {
            int i = this.lockState;
            if ((i & -3) == 0) {
                if (f64573h.compareAndSwapInt(this, f64574i, i, 1)) {
                    break;
                }
            } else if ((i & 2) == 0) {
                if (f64573h.compareAndSwapInt(this, f64574i, i, i | 2)) {
                    z = true;
                    this.f64577g = Thread.currentThread();
                }
            } else if (z) {
                LockSupport.park(this);
            }
        }
        if (z) {
            this.f64577g = null;
        }
    }

    /* renamed from: e */
    private final void m64744e() {
        if (!f64573h.compareAndSwapInt(this, f64574i, 0, 1)) {
            m64743d();
        }
    }

    /* renamed from: h */
    static C25904s m64745h(C25904s sVar, C25904s sVar2) {
        C25904s sVar3 = sVar2.f64580g;
        if (sVar3 != null) {
            C25904s sVar4 = sVar3.f64579f;
            sVar2.f64580g = sVar4;
            if (sVar4 != null) {
                sVar4.f64578e = sVar2;
            }
            C25904s sVar5 = sVar2.f64578e;
            sVar3.f64578e = sVar5;
            if (sVar5 == null) {
                sVar3.f64582i = false;
                sVar = sVar3;
            } else if (sVar5.f64579f == sVar2) {
                sVar5.f64579f = sVar3;
            } else {
                sVar5.f64580g = sVar3;
            }
            sVar3.f64579f = sVar2;
            sVar2.f64578e = sVar3;
        }
        return sVar;
    }

    /* renamed from: i */
    static C25904s m64746i(C25904s sVar, C25904s sVar2) {
        C25904s sVar3 = sVar2.f64579f;
        if (sVar3 != null) {
            C25904s sVar4 = sVar3.f64580g;
            sVar2.f64579f = sVar4;
            if (sVar4 != null) {
                sVar4.f64578e = sVar2;
            }
            C25904s sVar5 = sVar2.f64578e;
            sVar3.f64578e = sVar5;
            if (sVar5 == null) {
                sVar3.f64582i = false;
                sVar = sVar3;
            } else if (sVar5.f64580g == sVar2) {
                sVar5.f64580g = sVar3;
            } else {
                sVar5.f64579f = sVar3;
            }
            sVar3.f64580g = sVar2;
            sVar2.f64578e = sVar3;
        }
        return sVar;
    }

    /* renamed from: j */
    static int m64747j(Object obj, Object obj2) {
        int compareTo;
        return (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) ? System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1 : compareTo;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C25898m mo83961a(int i, Object obj) {
        Thread thread;
        Thread thread2;
        Object obj2;
        C25904s sVar = null;
        if (obj != null) {
            C25898m mVar = this.f64576f;
            while (mVar != null) {
                int i2 = this.lockState;
                if ((i2 & 3) == 0) {
                    Unsafe unsafe = f64573h;
                    long j = f64574i;
                    if (unsafe.compareAndSwapInt(this, j, i2, i2 + 4)) {
                        try {
                            C25904s sVar2 = this.f64575e;
                            if (sVar2 != null) {
                                sVar = sVar2.mo83982b(i, obj, (Class) null);
                            }
                            if (C25908w.m64753a(unsafe, this, j) == 6 && (thread2 = this.f64577g) != null) {
                                LockSupport.unpark(thread2);
                            }
                            return sVar;
                        } catch (Throwable th) {
                            if (C25908w.m64753a(f64573h, this, f64574i) == 6 && (thread = this.f64577g) != null) {
                                LockSupport.unpark(thread);
                            }
                            throw th;
                        }
                    }
                } else if (mVar.f64557a == i && ((obj2 = mVar.f64558b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return mVar;
                } else {
                    mVar = mVar.f64560d;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a3, code lost:
        return null;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p988j$.util.concurrent.C25904s mo83980f(int r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r4 = r17
            j$.util.concurrent.s r2 = r1.f64575e
            r8 = 0
            r9 = 0
            r10 = r2
            r2 = r9
            r3 = 0
        L_0x000c:
            if (r10 != 0) goto L_0x0022
            j$.util.concurrent.s r8 = new j$.util.concurrent.s
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r16
            r4 = r17
            r5 = r18
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f64575e = r8
            r1.f64576f = r8
            goto L_0x00a3
        L_0x0022:
            int r5 = r10.f64557a
            r11 = 1
            if (r5 <= r0) goto L_0x002a
            r5 = -1
            r12 = -1
            goto L_0x0069
        L_0x002a:
            if (r5 >= r0) goto L_0x002e
            r12 = 1
            goto L_0x0069
        L_0x002e:
            java.lang.Object r5 = r10.f64558b
            if (r5 == r4) goto L_0x00ab
            if (r5 == 0) goto L_0x003c
            boolean r6 = r4.equals(r5)
            if (r6 == 0) goto L_0x003c
            goto L_0x00ab
        L_0x003c:
            if (r2 != 0) goto L_0x0044
            java.lang.Class r2 = p988j$.util.concurrent.ConcurrentHashMap.comparableClassFor(r17)
            if (r2 == 0) goto L_0x004a
        L_0x0044:
            int r6 = p988j$.util.concurrent.ConcurrentHashMap.compareComparables(r2, r4, r5)
            if (r6 != 0) goto L_0x0068
        L_0x004a:
            if (r3 != 0) goto L_0x0062
            j$.util.concurrent.s r3 = r10.f64579f
            if (r3 == 0) goto L_0x0056
            j$.util.concurrent.s r3 = r3.mo83982b(r0, r4, r2)
            if (r3 != 0) goto L_0x0060
        L_0x0056:
            j$.util.concurrent.s r3 = r10.f64580g
            if (r3 == 0) goto L_0x0061
            j$.util.concurrent.s r3 = r3.mo83982b(r0, r4, r2)
            if (r3 == 0) goto L_0x0061
        L_0x0060:
            return r3
        L_0x0061:
            r3 = 1
        L_0x0062:
            int r5 = m64747j(r4, r5)
            r12 = r5
            goto L_0x0069
        L_0x0068:
            r12 = r6
        L_0x0069:
            if (r12 > 0) goto L_0x006e
            j$.util.concurrent.s r5 = r10.f64579f
            goto L_0x0070
        L_0x006e:
            j$.util.concurrent.s r5 = r10.f64580g
        L_0x0070:
            if (r5 != 0) goto L_0x00a8
            j$.util.concurrent.s r13 = r1.f64576f
            j$.util.concurrent.s r14 = new j$.util.concurrent.s
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r13
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f64576f = r14
            if (r13 == 0) goto L_0x0088
            r13.f64581h = r14
        L_0x0088:
            if (r12 > 0) goto L_0x008d
            r10.f64579f = r14
            goto L_0x008f
        L_0x008d:
            r10.f64580g = r14
        L_0x008f:
            boolean r0 = r10.f64582i
            if (r0 != 0) goto L_0x0096
            r14.f64582i = r11
            goto L_0x00a3
        L_0x0096:
            r15.m64744e()
            j$.util.concurrent.s r0 = r1.f64575e     // Catch:{ all -> 0x00a4 }
            j$.util.concurrent.s r0 = m64742c(r0, r14)     // Catch:{ all -> 0x00a4 }
            r1.f64575e = r0     // Catch:{ all -> 0x00a4 }
            r1.lockState = r8
        L_0x00a3:
            return r9
        L_0x00a4:
            r0 = move-exception
            r1.lockState = r8
            throw r0
        L_0x00a8:
            r10 = r5
            goto L_0x000c
        L_0x00ab:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.concurrent.C25903r.mo83980f(int, java.lang.Object, java.lang.Object):j$.util.concurrent.s");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x008e A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00a9 A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00aa A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ba A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00bd A[Catch:{ all -> 0x00c8 }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo83981g(p988j$.util.concurrent.C25904s r11) {
        /*
            r10 = this;
            j$.util.concurrent.m r0 = r11.f64560d
            j$.util.concurrent.s r0 = (p988j$.util.concurrent.C25904s) r0
            j$.util.concurrent.s r1 = r11.f64581h
            if (r1 != 0) goto L_0x000b
            r10.f64576f = r0
            goto L_0x000d
        L_0x000b:
            r1.f64560d = r0
        L_0x000d:
            if (r0 == 0) goto L_0x0011
            r0.f64581h = r1
        L_0x0011:
            j$.util.concurrent.s r0 = r10.f64576f
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001a
            r10.f64575e = r2
            return r1
        L_0x001a:
            j$.util.concurrent.s r0 = r10.f64575e
            if (r0 == 0) goto L_0x00cc
            j$.util.concurrent.s r3 = r0.f64580g
            if (r3 == 0) goto L_0x00cc
            j$.util.concurrent.s r3 = r0.f64579f
            if (r3 == 0) goto L_0x00cc
            j$.util.concurrent.s r3 = r3.f64579f
            if (r3 != 0) goto L_0x002c
            goto L_0x00cc
        L_0x002c:
            r10.m64744e()
            r1 = 0
            j$.util.concurrent.s r3 = r11.f64579f     // Catch:{ all -> 0x00c8 }
            j$.util.concurrent.s r4 = r11.f64580g     // Catch:{ all -> 0x00c8 }
            if (r3 == 0) goto L_0x0084
            if (r4 == 0) goto L_0x0084
            r5 = r4
        L_0x0039:
            j$.util.concurrent.s r6 = r5.f64579f     // Catch:{ all -> 0x00c8 }
            if (r6 == 0) goto L_0x003f
            r5 = r6
            goto L_0x0039
        L_0x003f:
            boolean r6 = r5.f64582i     // Catch:{ all -> 0x00c8 }
            boolean r7 = r11.f64582i     // Catch:{ all -> 0x00c8 }
            r5.f64582i = r7     // Catch:{ all -> 0x00c8 }
            r11.f64582i = r6     // Catch:{ all -> 0x00c8 }
            j$.util.concurrent.s r6 = r5.f64580g     // Catch:{ all -> 0x00c8 }
            j$.util.concurrent.s r7 = r11.f64578e     // Catch:{ all -> 0x00c8 }
            if (r5 != r4) goto L_0x0052
            r11.f64578e = r5     // Catch:{ all -> 0x00c8 }
            r5.f64580g = r11     // Catch:{ all -> 0x00c8 }
            goto L_0x0065
        L_0x0052:
            j$.util.concurrent.s r8 = r5.f64578e     // Catch:{ all -> 0x00c8 }
            r11.f64578e = r8     // Catch:{ all -> 0x00c8 }
            if (r8 == 0) goto L_0x0061
            j$.util.concurrent.s r9 = r8.f64579f     // Catch:{ all -> 0x00c8 }
            if (r5 != r9) goto L_0x005f
            r8.f64579f = r11     // Catch:{ all -> 0x00c8 }
            goto L_0x0061
        L_0x005f:
            r8.f64580g = r11     // Catch:{ all -> 0x00c8 }
        L_0x0061:
            r5.f64580g = r4     // Catch:{ all -> 0x00c8 }
            r4.f64578e = r5     // Catch:{ all -> 0x00c8 }
        L_0x0065:
            r11.f64579f = r2     // Catch:{ all -> 0x00c8 }
            r11.f64580g = r6     // Catch:{ all -> 0x00c8 }
            if (r6 == 0) goto L_0x006d
            r6.f64578e = r11     // Catch:{ all -> 0x00c8 }
        L_0x006d:
            r5.f64579f = r3     // Catch:{ all -> 0x00c8 }
            r3.f64578e = r5     // Catch:{ all -> 0x00c8 }
            r5.f64578e = r7     // Catch:{ all -> 0x00c8 }
            if (r7 != 0) goto L_0x0077
            r0 = r5
            goto L_0x0080
        L_0x0077:
            j$.util.concurrent.s r3 = r7.f64579f     // Catch:{ all -> 0x00c8 }
            if (r11 != r3) goto L_0x007e
            r7.f64579f = r5     // Catch:{ all -> 0x00c8 }
            goto L_0x0080
        L_0x007e:
            r7.f64580g = r5     // Catch:{ all -> 0x00c8 }
        L_0x0080:
            if (r6 == 0) goto L_0x008b
            r3 = r6
            goto L_0x008c
        L_0x0084:
            if (r3 == 0) goto L_0x0087
            goto L_0x008c
        L_0x0087:
            if (r4 == 0) goto L_0x008b
            r3 = r4
            goto L_0x008c
        L_0x008b:
            r3 = r11
        L_0x008c:
            if (r3 == r11) goto L_0x00a5
            j$.util.concurrent.s r4 = r11.f64578e     // Catch:{ all -> 0x00c8 }
            r3.f64578e = r4     // Catch:{ all -> 0x00c8 }
            if (r4 != 0) goto L_0x0096
            r0 = r3
            goto L_0x009f
        L_0x0096:
            j$.util.concurrent.s r5 = r4.f64579f     // Catch:{ all -> 0x00c8 }
            if (r11 != r5) goto L_0x009d
            r4.f64579f = r3     // Catch:{ all -> 0x00c8 }
            goto L_0x009f
        L_0x009d:
            r4.f64580g = r3     // Catch:{ all -> 0x00c8 }
        L_0x009f:
            r11.f64578e = r2     // Catch:{ all -> 0x00c8 }
            r11.f64580g = r2     // Catch:{ all -> 0x00c8 }
            r11.f64579f = r2     // Catch:{ all -> 0x00c8 }
        L_0x00a5:
            boolean r4 = r11.f64582i     // Catch:{ all -> 0x00c8 }
            if (r4 == 0) goto L_0x00aa
            goto L_0x00ae
        L_0x00aa:
            j$.util.concurrent.s r0 = m64741b(r0, r3)     // Catch:{ all -> 0x00c8 }
        L_0x00ae:
            r10.f64575e = r0     // Catch:{ all -> 0x00c8 }
            if (r11 != r3) goto L_0x00c5
            j$.util.concurrent.s r0 = r11.f64578e     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00c5
            j$.util.concurrent.s r3 = r0.f64579f     // Catch:{ all -> 0x00c8 }
            if (r11 != r3) goto L_0x00bd
            r0.f64579f = r2     // Catch:{ all -> 0x00c8 }
            goto L_0x00c3
        L_0x00bd:
            j$.util.concurrent.s r3 = r0.f64580g     // Catch:{ all -> 0x00c8 }
            if (r11 != r3) goto L_0x00c3
            r0.f64580g = r2     // Catch:{ all -> 0x00c8 }
        L_0x00c3:
            r11.f64578e = r2     // Catch:{ all -> 0x00c8 }
        L_0x00c5:
            r10.lockState = r1
            return r1
        L_0x00c8:
            r11 = move-exception
            r10.lockState = r1
            throw r11
        L_0x00cc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.concurrent.C25903r.mo83981g(j$.util.concurrent.s):boolean");
    }
}
