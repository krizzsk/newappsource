package p317y0;

import p279v0.C6832k;
import p279v0.C6834m;
import p279v0.C6835n;
import p328z0.C7395o;

/* renamed from: y0.b */
public final class C7238b extends C7395o {

    /* renamed from: a */
    public C6835n f22389a;

    /* renamed from: b */
    public C6832k f22390b;

    /* renamed from: c */
    public C6834m f22391c;

    public C7238b() {
        C6835n nVar = new C6835n();
        this.f22389a = nVar;
        this.f22391c = nVar;
    }

    /* renamed from: a */
    public final float mo2986a() {
        return this.f22391c.mo23068a();
    }

    /* renamed from: b */
    public final void mo23540b(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        C6835n nVar = this.f22389a;
        this.f22391c = nVar;
        nVar.f21163l = f;
        if (f > f2) {
            z = true;
        } else {
            z = false;
        }
        nVar.f21162k = z;
        if (z) {
            nVar.mo23072d(-f3, f - f2, f5, f6, f4);
            return;
        }
        nVar.mo23072d(f3, f2 - f, f5, f6, f4);
    }

    public final float getInterpolation(float f) {
        return this.f22391c.getInterpolation(f);
    }
}
