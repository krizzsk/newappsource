package xc0;

import pc0.C13007b;
import pc0.C13008c;
import yc0.C13316d;

/* renamed from: xc0.b */
public final class C13253b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C13316d f32898b;

    /* renamed from: c */
    public final /* synthetic */ C13008c f32899c;

    /* renamed from: d */
    public final /* synthetic */ C13255c f32900d;

    /* renamed from: xc0.b$a */
    public class C13254a implements C13007b {
        public C13254a() {
        }

        public final void onAdLoaded() {
            C13253b bVar = C13253b.this;
            bVar.f32900d.f32145b.put(bVar.f32899c.f32193a, bVar.f32898b);
        }
    }

    public C13253b(C13255c cVar, C13316d dVar, C13008c cVar2) {
        this.f32900d = cVar;
        this.f32898b = dVar;
        this.f32899c = cVar2;
    }

    public final void run() {
        this.f32898b.mo40218b(new C13254a());
    }
}
