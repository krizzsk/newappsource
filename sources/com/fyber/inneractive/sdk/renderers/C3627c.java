package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C2805w;
import com.fyber.inneractive.sdk.flow.C2807y;
import com.fyber.inneractive.sdk.flow.C2808z;
import com.fyber.inneractive.sdk.player.C2948c;
import com.fyber.inneractive.sdk.player.C3423f;
import com.fyber.inneractive.sdk.player.C3430i;
import com.fyber.inneractive.sdk.player.controller.C2989b;
import com.fyber.inneractive.sdk.player.controller.C2994e;
import com.fyber.inneractive.sdk.player.p050ui.C3452d;
import com.fyber.inneractive.sdk.player.p050ui.C3455g;

/* renamed from: com.fyber.inneractive.sdk.renderers.c */
public class C3627c extends C3643n {

    /* renamed from: c */
    public C3423f f12657c;

    public C3627c(C3430i iVar) {
        this.f12657c = (C3423f) iVar.mo14630c();
    }

    /* renamed from: a */
    public C3455g mo15266a(Context context) {
        if (this.f12725b == null) {
            this.f12725b = new C3452d(context);
        }
        return this.f12725b;
    }

    /* renamed from: a */
    public C2989b mo15257a(InneractiveAdSpot inneractiveAdSpot, C2807y yVar) {
        if (this.f12724a == null) {
            InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            boolean isOverlayOutside = selectedUnitController instanceof C2808z ? ((C2808z) selectedUnitController).isOverlayOutside() : false;
            Skip skip = null;
            if (inneractiveAdSpot instanceof C2805w) {
                skip = ((C2805w) inneractiveAdSpot).mo13593a();
            }
            this.f12724a = new C2994e(this.f12657c, (C3452d) this.f12725b, inneractiveAdSpot.getAdContent().f9593d, yVar.f9592c, false, isOverlayOutside, skip, IAConfigManager.f9202J.f9224l || yVar.f9595f);
        }
        return this.f12724a;
    }

    /* renamed from: a */
    public boolean mo15260a() {
        this.f12657c.getClass();
        return false;
    }

    /* renamed from: a */
    public void mo15259a(C2948c.C2951c cVar) {
        C3423f fVar = this.f12657c;
        fVar.getClass();
        cVar.mo13751a(fVar);
    }
}
