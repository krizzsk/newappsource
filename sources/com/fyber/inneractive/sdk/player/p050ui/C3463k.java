package com.fyber.inneractive.sdk.player.p050ui;

/* renamed from: com.fyber.inneractive.sdk.player.ui.k */
public class C3463k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3457i f12363a;

    public C3463k(C3457i iVar) {
        this.f12363a = iVar;
    }

    public void run() {
        C3457i iVar = this.f12363a;
        int i = iVar.f12327C + 200;
        iVar.f12327C = i;
        iVar.f12348v.setProgress(i);
        C3457i iVar2 = this.f12363a;
        if (iVar2.f12327C == iVar2.f12328D) {
            iVar2.f12329E = null;
            iVar2.f12327C = 0;
            iVar2.f12328D = 0;
            return;
        }
        iVar2.postDelayed(iVar2.f12329E, 200);
    }
}
