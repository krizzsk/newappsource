package p054d0;

import androidx.camera.core.C0554h;
import androidx.camera.core.C0627p;

/* renamed from: d0.v0 */
public final class C4315v0 extends C0554h {

    /* renamed from: d */
    public boolean f15277d = false;

    public C4315v0(C0627p pVar) {
        super(pVar);
    }

    public final synchronized void close() {
        if (!this.f15277d) {
            this.f15277d = true;
            super.close();
        }
    }
}
