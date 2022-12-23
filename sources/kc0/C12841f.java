package kc0;

import mf0.C24362h;

/* renamed from: kc0.f */
public final /* synthetic */ class C12841f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f31722b;

    /* renamed from: c */
    public final /* synthetic */ C12844i f31723c;

    public /* synthetic */ C12841f(C12844i iVar, int i) {
        this.f31722b = i;
        this.f31723c = iVar;
    }

    public final void run() {
        switch (this.f31722b) {
            case 0:
                C12844i iVar = this.f31723c;
                C24362h.m61211f(iVar, "this$0");
                iVar.mo39704t();
                return;
            default:
                C12844i iVar2 = this.f31723c;
                C24362h.m61211f(iVar2, "this$0");
                if (iVar2.mo39694o()) {
                    iVar2.mo39695p();
                    return;
                }
                throw new IllegalStateException("showInterstitial requires interstitial instance".toString());
        }
    }
}
