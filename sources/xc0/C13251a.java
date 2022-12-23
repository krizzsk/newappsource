package xc0;

import pc0.C13007b;
import pc0.C13008c;
import yc0.C13312b;

/* renamed from: xc0.a */
public final class C13251a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C13312b f32894b;

    /* renamed from: c */
    public final /* synthetic */ C13008c f32895c;

    /* renamed from: d */
    public final /* synthetic */ C13255c f32896d;

    /* renamed from: xc0.a$a */
    public class C13252a implements C13007b {
        public C13252a() {
        }

        public final void onAdLoaded() {
            C13251a aVar = C13251a.this;
            aVar.f32896d.f32145b.put(aVar.f32895c.f32193a, aVar.f32894b);
        }
    }

    public C13251a(C13255c cVar, C13312b bVar, C13008c cVar2) {
        this.f32896d = cVar;
        this.f32894b = bVar;
        this.f32895c = cVar2;
    }

    public final void run() {
        this.f32894b.mo40218b(new C13252a());
    }
}
