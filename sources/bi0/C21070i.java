package bi0;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: bi0.i */
public final class C21070i<E> {

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f52882e;

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f52883f;

    /* renamed from: g */
    public static final C21079q f52884g = new C21079q("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a */
    public final int f52885a;

    /* renamed from: b */
    public final boolean f52886b;

    /* renamed from: c */
    public final int f52887c;

    /* renamed from: d */
    public /* synthetic */ AtomicReferenceArray f52888d;

    /* renamed from: bi0.i$a */
    public static final class C21071a {

        /* renamed from: a */
        public final int f52889a;

        public C21071a(int i) {
            this.f52889a = i;
        }
    }

    static {
        Class<C21070i> cls = C21070i.class;
        f52882e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f52883f = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public C21070i(int i, boolean z) {
        boolean z2;
        this.f52885a = i;
        this.f52886b = z;
        int i2 = i - 1;
        this.f52887c = i2;
        this.f52888d = new AtomicReferenceArray(i);
        boolean z3 = false;
        if (i2 <= 1073741823) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (!((i & i2) == 0 ? true : z3)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: a */
    public final int mo53213a(E e) {
        E e2 = e;
        while (true) {
            long j = this._state;
            if ((3458764513820540928L & j) == 0) {
                int i = (int) ((1073741823 & j) >> 0);
                int i2 = (int) ((1152921503533105152L & j) >> 30);
                int i3 = this.f52887c;
                if (((i2 + 2) & i3) == (i & i3)) {
                    return 1;
                }
                if (this.f52886b || this.f52888d.get(i2 & i3) == null) {
                    if (f52883f.compareAndSet(this, j, (-1152921503533105153L & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                        this.f52888d.set(i2 & i3, e2);
                        C21070i iVar = this;
                        while ((iVar._state & 1152921504606846976L) != 0) {
                            iVar = iVar.mo53217e();
                            Object obj = iVar.f52888d.get(iVar.f52887c & i2);
                            if (!(obj instanceof C21071a) || ((C21071a) obj).f52889a != i2) {
                                iVar = null;
                                continue;
                            } else {
                                iVar.f52888d.set(iVar.f52887c & i2, e2);
                                continue;
                            }
                            if (iVar == null) {
                                break;
                            }
                        }
                        return 0;
                    }
                } else {
                    int i4 = this.f52885a;
                    if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                        return 1;
                    }
                }
            } else if ((2305843009213693952L & j) != 0) {
                return 2;
            } else {
                return 1;
            }
        }
        return 1;
    }

    /* renamed from: b */
    public final boolean mo53214b() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f52883f.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: c */
    public final int mo53215c() {
        long j = this._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    /* renamed from: d */
    public final boolean mo53216d() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067 A[LOOP:3: B:16:0x0067->B:19:0x0072, LOOP_START] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final bi0.C21070i<E> mo53217e() {
        /*
            r10 = this;
        L_0x0000:
            long r2 = r10._state
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r0
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            long r6 = r2 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f52883f
            r1 = r10
            r4 = r6
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            r2 = r6
        L_0x001a:
            java.lang.Object r0 = r10._next
            bi0.i r0 = (bi0.C21070i) r0
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f52882e
            r1 = 0
            bi0.i r4 = new bi0.i
            int r5 = r10.f52885a
            int r5 = r5 * 2
            boolean r6 = r10.f52886b
            r4.<init>(r5, r6)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r2
            r7 = 0
            long r5 = r5 >> r7
            int r6 = (int) r5
            r7 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r7 = r7 & r2
            r5 = 30
            long r7 = r7 >> r5
            int r5 = (int) r7
        L_0x0040:
            int r7 = r10.f52887c
            r8 = r6 & r7
            r7 = r7 & r5
            if (r8 == r7) goto L_0x005f
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r10.f52888d
            java.lang.Object r7 = r7.get(r8)
            if (r7 != 0) goto L_0x0054
            bi0.i$a r7 = new bi0.i$a
            r7.<init>(r6)
        L_0x0054:
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r4.f52888d
            int r9 = r4.f52887c
            r9 = r9 & r6
            r8.set(r9, r7)
            int r6 = r6 + 1
            goto L_0x0040
        L_0x005f:
            r5 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r5 = r5 & r2
            r4._state = r5
        L_0x0067:
            boolean r5 = r0.compareAndSet(r10, r1, r4)
            if (r5 == 0) goto L_0x006e
            goto L_0x001a
        L_0x006e:
            java.lang.Object r5 = r0.get(r10)
            if (r5 == 0) goto L_0x0067
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: bi0.C21070i.mo53217e():bi0.i");
    }

    /* renamed from: f */
    public final Object mo53218f() {
        while (true) {
            long j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return f52884g;
            }
            int i = (int) ((j & 1073741823) >> 0);
            int i2 = this.f52887c;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                return null;
            }
            Object obj = this.f52888d.get(i4);
            if (obj == null) {
                if (this.f52886b) {
                    return null;
                }
            } else if (obj instanceof C21071a) {
                return null;
            } else {
                long j2 = ((long) ((i + 1) & 1073741823)) << 0;
                Object obj2 = obj;
                if (f52883f.compareAndSet(this, j, (j & -1073741824) | j2)) {
                    this.f52888d.set(this.f52887c & i, (Object) null);
                    return obj2;
                } else if (this.f52886b) {
                    C21070i iVar = this;
                    while (true) {
                        long j3 = iVar._state;
                        int i5 = (int) ((j3 & 1073741823) >> 0);
                        if ((j3 & 1152921504606846976L) != 0) {
                            iVar = iVar.mo53217e();
                        } else {
                            if (f52883f.compareAndSet(iVar, j3, (j3 & -1073741824) | j2)) {
                                iVar.f52888d.set(iVar.f52887c & i5, (Object) null);
                                iVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (iVar == null) {
                            return obj2;
                        }
                    }
                }
            }
        }
    }
}
