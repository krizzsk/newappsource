package rc0;

import pc0.C13007b;
import pc0.C13008c;
import sc0.C13110d;

/* renamed from: rc0.b */
public final class C13059b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C13110d f32308b;

    /* renamed from: c */
    public final /* synthetic */ C13008c f32309c;

    /* renamed from: d */
    public final /* synthetic */ C13061c f32310d;

    /* renamed from: rc0.b$a */
    public class C13060a implements C13007b {
        public C13060a() {
        }

        public final void onAdLoaded() {
            C13059b bVar = C13059b.this;
            bVar.f32310d.f32145b.put(bVar.f32309c.f32193a, bVar.f32308b);
        }
    }

    public C13059b(C13061c cVar, C13110d dVar, C13008c cVar2) {
        this.f32310d = cVar;
        this.f32308b = dVar;
        this.f32309c = cVar2;
    }

    public final void run() {
        this.f32308b.mo40009b(new C13060a());
    }
}
