package rc0;

import pc0.C13007b;
import pc0.C13008c;
import sc0.C13107b;

/* renamed from: rc0.a */
public final class C13057a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C13107b f32304b;

    /* renamed from: c */
    public final /* synthetic */ C13008c f32305c;

    /* renamed from: d */
    public final /* synthetic */ C13061c f32306d;

    /* renamed from: rc0.a$a */
    public class C13058a implements C13007b {
        public C13058a() {
        }

        public final void onAdLoaded() {
            C13057a aVar = C13057a.this;
            aVar.f32306d.f32145b.put(aVar.f32305c.f32193a, aVar.f32304b);
        }
    }

    public C13057a(C13061c cVar, C13107b bVar, C13008c cVar2) {
        this.f32306d = cVar;
        this.f32304b = bVar;
        this.f32305c = cVar2;
    }

    public final void run() {
        this.f32304b.mo40009b(new C13058a());
    }
}
