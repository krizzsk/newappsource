package androidx.camera.core;

import androidx.camera.core.C0554h;

/* renamed from: androidx.camera.core.n */
public final /* synthetic */ class C0625n implements C0554h.C0555a {

    /* renamed from: a */
    public final /* synthetic */ C0627p f2146a;

    /* renamed from: b */
    public final /* synthetic */ C0627p f2147b;

    public /* synthetic */ C0625n(C0627p pVar, C0627p pVar2) {
        this.f2146a = pVar;
        this.f2147b = pVar2;
    }

    /* renamed from: b */
    public final void mo2437b(C0627p pVar) {
        C0627p pVar2 = this.f2146a;
        C0627p pVar3 = this.f2147b;
        int i = ImageProcessingUtil.f1839a;
        if (pVar2 != null && pVar3 != null) {
            pVar3.close();
        }
    }
}
