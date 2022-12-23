package p627lg;

import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* renamed from: lg.m */
public final /* synthetic */ class C18214m implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ReferenceQueue f46478b;

    /* renamed from: c */
    public final /* synthetic */ Set f46479c;

    public /* synthetic */ C18214m(ReferenceQueue referenceQueue, Set set) {
        this.f46478b = referenceQueue;
        this.f46479c = set;
    }

    public final void run() {
        ReferenceQueue referenceQueue = this.f46478b;
        Set set = this.f46479c;
        while (!set.isEmpty()) {
            try {
                C18216o oVar = (C18216o) referenceQueue.remove();
                if (oVar.f46481a.remove(oVar)) {
                    oVar.clear();
                    oVar.f46482b.run();
                }
            } catch (InterruptedException unused) {
            }
        }
    }
}
