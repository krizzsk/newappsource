package p145k5;

import com.appboy.Appboy;

/* renamed from: k5.e */
public final /* synthetic */ class C5486e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f18014b;

    /* renamed from: c */
    public final /* synthetic */ Appboy f18015c;

    /* renamed from: d */
    public final /* synthetic */ String f18016d;

    public /* synthetic */ C5486e(Appboy appboy, String str, int i) {
        this.f18014b = i;
        this.f18015c = appboy;
        this.f18016d = str;
    }

    public final void run() {
        switch (this.f18014b) {
            case 0:
                this.f18015c.m5412d(this.f18016d);
                return;
            default:
                this.f18015c.m5402b(this.f18016d);
                return;
        }
    }
}
