package p145k5;

import com.appboy.Appboy;

/* renamed from: k5.k */
public final /* synthetic */ class C5492k implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f18028b;

    /* renamed from: c */
    public final /* synthetic */ Appboy f18029c;

    public /* synthetic */ C5492k(Appboy appboy, int i) {
        this.f18028b = i;
        this.f18029c = appboy;
    }

    public final void run() {
        switch (this.f18028b) {
            case 0:
                this.f18029c.m5423j();
                return;
            default:
                this.f18029c.m5405c();
                return;
        }
    }
}
