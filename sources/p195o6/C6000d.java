package p195o6;

import android.graphics.Bitmap;
import p169m6.C5709c;
import p195o6.C6002f;

/* renamed from: o6.d */
public final class C6000d extends C5709c<C5998c> {
    public C6000d(C5998c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public final void mo10979a() {
        ((C5998c) this.f18515b).stop();
        C5998c cVar = (C5998c) this.f18515b;
        cVar.f19165e = true;
        C6002f fVar = cVar.f19162b.f19172a;
        fVar.f19176c.clear();
        Bitmap bitmap = fVar.f19185l;
        if (bitmap != null) {
            fVar.f19178e.mo20086d(bitmap);
            fVar.f19185l = null;
        }
        fVar.f19179f = false;
        C6002f.C6003a aVar = fVar.f19182i;
        if (aVar != null) {
            fVar.f19177d.mo10873o(aVar);
            fVar.f19182i = null;
        }
        C6002f.C6003a aVar2 = fVar.f19184k;
        if (aVar2 != null) {
            fVar.f19177d.mo10873o(aVar2);
            fVar.f19184k = null;
        }
        C6002f.C6003a aVar3 = fVar.f19187n;
        if (aVar3 != null) {
            fVar.f19177d.mo10873o(aVar3);
            fVar.f19187n = null;
        }
        fVar.f19174a.clear();
        fVar.f19183j = true;
    }

    /* renamed from: b */
    public final Class<C5998c> mo10980b() {
        return C5998c.class;
    }

    /* renamed from: e */
    public final int mo10983e() {
        C6002f fVar = ((C5998c) this.f18515b).f19162b.f19172a;
        return fVar.f19174a.mo187f() + fVar.f19188o;
    }

    public final void initialize() {
        ((C5998c) this.f18515b).f19162b.f19172a.f19185l.prepareToDraw();
    }
}
