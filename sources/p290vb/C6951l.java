package p290vb;

import p277ub.C6774a0;
import p290vb.C6953n;

/* renamed from: vb.l */
public final /* synthetic */ class C6951l implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C6953n.C6954a f21695b;

    /* renamed from: c */
    public final /* synthetic */ int f21696c;

    /* renamed from: d */
    public final /* synthetic */ long f21697d;

    public /* synthetic */ C6951l(int i, long j, C6953n.C6954a aVar) {
        this.f21695b = aVar;
        this.f21696c = i;
        this.f21697d = j;
    }

    public final void run() {
        C6953n.C6954a aVar = this.f21695b;
        int i = this.f21696c;
        long j = this.f21697d;
        C6953n nVar = aVar.f21703b;
        int i2 = C6774a0.f20959a;
        nVar.onDroppedFrames(i, j);
    }
}
