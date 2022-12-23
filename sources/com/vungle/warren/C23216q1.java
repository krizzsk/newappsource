package com.vungle.warren;

import com.vungle.warren.Vungle;
import com.vungle.warren.error.VungleException;

/* renamed from: com.vungle.warren.q1 */
public final class C23216q1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Vungle.C23068c.C23069a f58920b;

    public C23216q1(Vungle.C23068c.C23069a aVar) {
        this.f58920b = aVar;
    }

    public final void run() {
        Vungle.C23068c.C23069a aVar = this.f58920b;
        if (aVar.f58527a) {
            Vungle.C23068c cVar = Vungle.C23068c.this;
            Vungle.onPlayError(cVar.f58519c, cVar.f58521e, new VungleException(1));
            return;
        }
        Vungle.renderAd(aVar.f58528b, Vungle.C23068c.this.f58521e, aVar.f58529c, aVar.f58530d);
    }
}
