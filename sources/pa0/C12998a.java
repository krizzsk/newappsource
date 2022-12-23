package pa0;

import na0.C12925d;
import qa0.C13044b;

/* renamed from: pa0.a */
public abstract class C12998a {

    /* renamed from: a */
    public C13044b f32170a;

    /* renamed from: b */
    public boolean f32171b = true;

    /* renamed from: c */
    public volatile C12925d f32172c;

    public C12998a(C13044b bVar) {
        this.f32170a = bVar;
    }

    /* renamed from: a */
    public void mo39883a(boolean z) {
        if (this.f32171b != z) {
            this.f32171b = z;
            C12925d dVar = this.f32172c;
            if (dVar != null) {
                dVar.f32012j.mo39974k(this);
            }
        }
    }
}
