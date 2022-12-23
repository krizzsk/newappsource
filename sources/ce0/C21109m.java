package ce0;

import ce0.C21110n;
import java.util.Iterator;

/* renamed from: ce0.m */
public final class C21109m implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C21110n f52955b;

    public C21109m(C21110n nVar, int i) {
        this.f52955b = nVar;
    }

    public final void run() {
        Iterator it = this.f52955b.f52961e.iterator();
        while (it.hasNext()) {
            ((C21110n.C21112b) it.next()).mo53313a();
        }
    }
}
