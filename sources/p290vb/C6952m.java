package p290vb;

import p277ub.C6774a0;
import p290vb.C6953n;

/* renamed from: vb.m */
public final /* synthetic */ class C6952m implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C6953n.C6954a f21698b;

    /* renamed from: c */
    public final /* synthetic */ String f21699c;

    /* renamed from: d */
    public final /* synthetic */ long f21700d;

    /* renamed from: e */
    public final /* synthetic */ long f21701e;

    public /* synthetic */ C6952m(C6953n.C6954a aVar, String str, long j, long j2) {
        this.f21698b = aVar;
        this.f21699c = str;
        this.f21700d = j;
        this.f21701e = j2;
    }

    public final void run() {
        C6953n.C6954a aVar = this.f21698b;
        String str = this.f21699c;
        long j = this.f21700d;
        long j2 = this.f21701e;
        C6953n nVar = aVar.f21703b;
        int i = C6774a0.f20959a;
        nVar.onVideoDecoderInitialized(str, j, j2);
    }
}
