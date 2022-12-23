package ci0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: ci0.m */
public final class C21218m {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f53157b;

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f53158c;

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f53159d;

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f53160e;

    /* renamed from: a */
    public final AtomicReferenceArray<C21212g> f53161a = new AtomicReferenceArray<>(RecyclerView.C1119a0.FLAG_IGNORE);
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<C21218m> cls = C21218m.class;
        f53157b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f53158c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f53159d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f53160e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    /* renamed from: a */
    public final C21212g mo53561a(C21212g gVar, boolean z) {
        if (z) {
            return mo53562b(gVar);
        }
        C21212g gVar2 = (C21212g) f53157b.getAndSet(this, gVar);
        if (gVar2 == null) {
            return null;
        }
        return mo53562b(gVar2);
    }

    /* renamed from: b */
    public final C21212g mo53562b(C21212g gVar) {
        boolean z = true;
        if (gVar.f53146c.mo53558b() != 1) {
            z = false;
        }
        if (z) {
            f53160e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return gVar;
        }
        int i = this.producerIndex & 127;
        while (this.f53161a.get(i) != null) {
            Thread.yield();
        }
        this.f53161a.lazySet(i, gVar);
        f53158c.incrementAndGet(this);
        return null;
    }

    /* renamed from: c */
    public final int mo53563c() {
        if (this.lastScheduledTask != null) {
            return (this.producerIndex - this.consumerIndex) + 1;
        }
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: d */
    public final C21212g mo53564d() {
        C21212g andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f53159d.compareAndSet(this, i, i + 1) && (andSet = this.f53161a.getAndSet(i2, (Object) null)) != null) {
                boolean z = true;
                if (andSet.f53146c.mo53558b() != 1) {
                    z = false;
                }
                if (z) {
                    f53160e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    /* renamed from: e */
    public final long mo53565e(C21218m mVar) {
        boolean z;
        int i = mVar.consumerIndex;
        int i2 = mVar.producerIndex;
        AtomicReferenceArray<C21212g> atomicReferenceArray = mVar.f53161a;
        while (true) {
            boolean z2 = true;
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (mVar.blockingTasksInBuffer == 0) {
                break;
            }
            C21212g gVar = atomicReferenceArray.get(i3);
            if (gVar != null) {
                if (gVar.f53146c.mo53558b() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, gVar, (Object) null)) {
                            if (atomicReferenceArray.get(i3) != gVar) {
                                z2 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z2) {
                        f53160e.decrementAndGet(mVar);
                        mo53561a(gVar, false);
                        return -1;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
        return mo53566f(mVar, true);
    }

    /* renamed from: f */
    public final long mo53566f(C21218m mVar, boolean z) {
        C21212g gVar;
        boolean z2;
        boolean z3;
        do {
            gVar = (C21212g) mVar.lastScheduledTask;
            if (gVar != null) {
                z2 = true;
                if (z) {
                    if (gVar.f53146c.mo53558b() == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        return -2;
                    }
                }
                C21216k.f53153e.getClass();
                long nanoTime = System.nanoTime() - gVar.f53145b;
                long j = C21216k.f53149a;
                if (nanoTime >= j) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f53157b;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(mVar, gVar, (Object) null)) {
                            if (atomicReferenceFieldUpdater.get(mVar) != gVar) {
                                z2 = false;
                                continue;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    return j - nanoTime;
                }
            } else {
                return -2;
            }
        } while (!z2);
        mo53561a(gVar, false);
        return -1;
    }
}
