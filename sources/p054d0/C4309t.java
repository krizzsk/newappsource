package p054d0;

import androidx.camera.core.C0636s;
import androidx.camera.core.C0642t;
import p066e0.C4462z;

/* renamed from: d0.t */
public final /* synthetic */ class C4309t implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f15256b;

    /* renamed from: c */
    public final /* synthetic */ Object f15257c;

    /* renamed from: d */
    public final /* synthetic */ Object f15258d;

    public /* synthetic */ C4309t(int i, Object obj, Object obj2) {
        this.f15256b = i;
        this.f15257c = obj;
        this.f15258d = obj2;
    }

    public final void run() {
        switch (this.f15256b) {
            case 0:
                C0642t tVar = (C0642t) this.f15258d;
                ((C0642t) this.f15257c).mo2580b();
                if (tVar != null) {
                    tVar.mo2580b();
                    return;
                }
                return;
            default:
                ((C4462z.C4463a) this.f15258d).mo2538c(C0636s.this);
                return;
        }
    }
}
