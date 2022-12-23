package ra0;

import na0.C12925d;
import na0.C12928f;
import qa0.C13044b;
import va0.C13195d;

/* renamed from: ra0.b */
public final class C13056b extends C13054a {

    /* renamed from: l */
    public final String f32301l = "/";

    /* renamed from: m */
    public final String f32302m;

    /* renamed from: n */
    public boolean f32303n = false;

    public C13056b(C13044b bVar, int i, int i2, int i3, String str, String str2) {
        super(bVar, i, i2, i3, str);
        this.f32302m = str2;
    }

    /* renamed from: b */
    public final void mo39935b(C12928f fVar, boolean z) {
        int i = fVar.f32022c;
        int i2 = (1 << i) * 0;
        int i3 = fVar.f32020a + i2;
        int i4 = i2 + fVar.f32021b;
        int i5 = i + 0;
        if (i5 >= this.f32287d && i5 <= this.f32288e) {
            StringBuilder sb = new StringBuilder(this.f32293j);
            sb.append(i5);
            sb.append(this.f32301l);
            sb.append(i3);
            sb.append(this.f32301l);
            if (!this.f32303n) {
                sb.append(i4);
            } else {
                sb.append(((1 << i5) - 1) - i4);
            }
            sb.append(this.f32302m);
            C12928f fVar2 = fVar;
            C13195d dVar = new C13195d(fVar2, this.f32172c, this.f32290g, sb.toString());
            C12925d dVar2 = this.f32172c;
            if (dVar2 != null) {
                dVar2.f32007e.mo40066c(dVar, (z ? 1 : 0) + false, (Object) null);
            }
        }
    }
}
