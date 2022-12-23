package uc0;

import pc0.C13007b;
import pc0.C13008c;
import vc0.C13203b;

/* renamed from: uc0.a */
public final class C13158a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C13203b f32699b;

    /* renamed from: c */
    public final /* synthetic */ C13008c f32700c;

    /* renamed from: d */
    public final /* synthetic */ C13162c f32701d;

    /* renamed from: uc0.a$a */
    public class C13159a implements C13007b {
        public C13159a() {
        }

        public final void onAdLoaded() {
            C13158a aVar = C13158a.this;
            aVar.f32701d.f32145b.put(aVar.f32700c.f32193a, aVar.f32699b);
        }
    }

    public C13158a(C13162c cVar, C13203b bVar, C13008c cVar2) {
        this.f32701d = cVar;
        this.f32699b = bVar;
        this.f32700c = cVar2;
    }

    public final void run() {
        this.f32699b.mo40082b(new C13159a());
    }
}
