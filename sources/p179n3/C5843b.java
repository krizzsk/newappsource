package p179n3;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C1410a;
import p192o3.C5956p;
import p192o3.C5959r;

/* renamed from: n3.b */
public final class C5843b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ WorkDatabase f18825b;

    /* renamed from: c */
    public final /* synthetic */ String f18826c;

    /* renamed from: d */
    public final /* synthetic */ C1410a f18827d;

    public C5843b(C1410a aVar, WorkDatabase workDatabase, String str) {
        this.f18827d = aVar;
        this.f18825b = workDatabase;
        this.f18826c = str;
    }

    public final void run() {
        C5956p i = ((C5959r) this.f18825b.mo5701q()).mo21951i(this.f18826c);
        if (i != null && i.mo21935b()) {
            synchronized (this.f18827d.f5225e) {
                this.f18827d.f5228h.put(this.f18826c, i);
                this.f18827d.f5229i.add(i);
                C1410a aVar = this.f18827d;
                aVar.f5230j.mo21354b(aVar.f5229i);
            }
        }
    }
}
