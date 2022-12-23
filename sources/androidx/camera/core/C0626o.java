package androidx.camera.core;

import androidx.camera.core.C0554h;

/* renamed from: androidx.camera.core.o */
public final /* synthetic */ class C0626o implements C0554h.C0555a {

    /* renamed from: a */
    public final /* synthetic */ C0627p f2148a;

    /* renamed from: b */
    public final /* synthetic */ C0627p f2149b;

    public /* synthetic */ C0626o(C0627p pVar, C0627p pVar2) {
        this.f2148a = pVar;
        this.f2149b = pVar2;
    }

    /* renamed from: b */
    public final void mo2437b(C0627p pVar) {
        C0627p pVar2 = this.f2148a;
        C0627p pVar3 = this.f2149b;
        int i = ImageProcessingUtil.f1839a;
        if (pVar2 != null && pVar3 != null) {
            pVar3.close();
        }
    }
}
