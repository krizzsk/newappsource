package uc0;

import pc0.C13007b;
import pc0.C13008c;
import vc0.C13206d;

/* renamed from: uc0.b */
public final class C13160b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C13206d f32703b;

    /* renamed from: c */
    public final /* synthetic */ C13008c f32704c;

    /* renamed from: d */
    public final /* synthetic */ C13162c f32705d;

    /* renamed from: uc0.b$a */
    public class C13161a implements C13007b {
        public C13161a() {
        }

        public final void onAdLoaded() {
            C13160b bVar = C13160b.this;
            bVar.f32705d.f32145b.put(bVar.f32704c.f32193a, bVar.f32703b);
        }
    }

    public C13160b(C13162c cVar, C13206d dVar, C13008c cVar2) {
        this.f32705d = cVar;
        this.f32703b = dVar;
        this.f32704c = cVar2;
    }

    public final void run() {
        this.f32703b.mo40082b(new C13161a());
    }
}
