package kc0;

import java.util.TimerTask;
import p304x.C7099r1;
import wb0.C13233c;

/* renamed from: kc0.j */
public final class C12848j extends TimerTask {

    /* renamed from: b */
    public final /* synthetic */ C12844i f31771b;

    public C12848j(C12844i iVar) {
        this.f31771b = iVar;
    }

    public final void run() {
        C12844i iVar = this.f31771b;
        iVar.getClass();
        C13233c.f32843b.post(new C7099r1(iVar, 16));
    }
}
