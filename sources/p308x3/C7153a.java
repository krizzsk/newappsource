package p308x3;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import p070e4.C4549d;
import p271u4.C6693d;
import p271u4.C6695f;
import p296w4.C6988f;

/* renamed from: x3.a */
public abstract class C7153a extends C6693d implements C6695f {

    /* renamed from: e */
    public boolean f22223e;

    public final boolean isStarted() {
        return this.f22223e;
    }

    /* renamed from: m */
    public abstract Runnable mo23437m();

    /* renamed from: n */
    public abstract void mo23438n();

    /* renamed from: o */
    public abstract boolean mo23439o();

    public final void start() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        if (!this.f22223e) {
            if (this.f20771c == null) {
                throw new IllegalStateException("context not set");
            } else if (mo23439o()) {
                C4549d dVar = this.f20771c;
                synchronized (dVar) {
                    if (dVar.f15680h == null) {
                        C6988f.C6989a aVar = C6988f.f21758a;
                        dVar.f15680h = new ScheduledThreadPoolExecutor(2, C6988f.f21758a);
                    }
                    scheduledThreadPoolExecutor = dVar.f15680h;
                }
                scheduledThreadPoolExecutor.execute(mo23437m());
                this.f22223e = true;
            }
        }
    }

    public final void stop() {
        if (this.f22223e) {
            try {
                mo23438n();
            } catch (RuntimeException e) {
                mo21727f("on stop: " + e, e);
            }
            this.f22223e = false;
        }
    }
}
