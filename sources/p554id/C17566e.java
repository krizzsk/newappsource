package p554id;

import p434dd.C16545c;
import p434dd.C16561k;

/* renamed from: id.e */
public final class C17566e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C17567f f45180b;

    public C17566e(C17567f fVar, C17576o oVar) {
        this.f45180b = fVar;
    }

    public final void run() {
        synchronized (this.f45180b.f45182b) {
            C16545c cVar = this.f45180b.f45183c;
            if (cVar != null) {
                C16561k kVar = (C16561k) cVar.f43180a;
                C17573l lVar = (C17573l) cVar.f43181b;
                synchronized (kVar.f43209f) {
                    kVar.f43208e.remove(lVar);
                }
            }
        }
    }
}
