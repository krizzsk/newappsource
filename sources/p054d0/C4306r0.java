package p054d0;

import androidx.camera.core.C0554h;
import androidx.camera.core.C0627p;
import androidx.camera.core.C0642t;

/* renamed from: d0.r0 */
public final /* synthetic */ class C4306r0 implements C0554h.C0555a {

    /* renamed from: a */
    public final /* synthetic */ C0642t f15253a;

    public /* synthetic */ C4306r0(C0642t tVar) {
        this.f15253a = tVar;
    }

    /* renamed from: b */
    public final void mo2437b(C0627p pVar) {
        C0642t tVar = this.f15253a;
        synchronized (tVar.f2204a) {
            int i = tVar.f2205b - 1;
            tVar.f2205b = i;
            if (tVar.f2206c && i == 0) {
                tVar.close();
            }
        }
    }
}
