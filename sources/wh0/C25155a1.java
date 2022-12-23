package wh0;

/* renamed from: wh0.a1 */
public class C25155a1 extends C25163c1 {

    /* renamed from: c */
    public final boolean f63432c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25155a1(C25232y0 y0Var) {
        super(true);
        C25204p pVar;
        C25204p pVar2;
        boolean z = true;
        mo61781g0(y0Var);
        C25201o c0 = mo61778c0();
        if (c0 instanceof C25204p) {
            pVar = (C25204p) c0;
        } else {
            pVar = null;
        }
        if (pVar != null) {
            C25163c1 r = pVar.mo61758r();
            while (true) {
                if (!r.mo61753Z()) {
                    C25201o c02 = r.mo61778c0();
                    if (c02 instanceof C25204p) {
                        pVar2 = (C25204p) c02;
                    } else {
                        pVar2 = null;
                    }
                    if (pVar2 == null) {
                        break;
                    }
                    r = pVar2.mo61758r();
                } else {
                    break;
                }
            }
            this.f63432c = z;
        }
        z = false;
        this.f63432c = z;
    }

    /* renamed from: Z */
    public final boolean mo61753Z() {
        return this.f63432c;
    }

    /* renamed from: a0 */
    public final boolean mo61754a0() {
        return true;
    }
}
