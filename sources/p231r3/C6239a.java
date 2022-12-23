package p231r3;

import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import p695od.C18728c;

/* renamed from: r3.a */
public final class C6239a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C18728c f19688b;

    /* renamed from: c */
    public final /* synthetic */ ConstraintTrackingWorker f19689c;

    public C6239a(ConstraintTrackingWorker constraintTrackingWorker, C18728c cVar) {
        this.f19689c = constraintTrackingWorker;
        this.f19688b = cVar;
    }

    public final void run() {
        synchronized (this.f19689c.f5265c) {
            if (this.f19689c.f5266d) {
                this.f19689c.f5267e.mo5756h(new ListenableWorker.C1379a.C1381b());
            } else {
                this.f19689c.f5267e.mo5758j(this.f19688b);
            }
        }
    }
}
