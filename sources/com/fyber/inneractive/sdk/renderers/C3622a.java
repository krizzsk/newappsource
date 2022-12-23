package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.content.res.Resources;
import com.fyber.inneractive.sdk.config.C2618a;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C2807y;
import com.fyber.inneractive.sdk.flow.C2808z;
import com.fyber.inneractive.sdk.player.C2948c;
import com.fyber.inneractive.sdk.player.C3423f;
import com.fyber.inneractive.sdk.player.C3430i;
import com.fyber.inneractive.sdk.player.controller.C2989b;
import com.fyber.inneractive.sdk.player.controller.C3007j;
import com.fyber.inneractive.sdk.player.p050ui.C3454f;
import com.fyber.inneractive.sdk.player.p050ui.C3455g;

/* renamed from: com.fyber.inneractive.sdk.renderers.a */
public class C3622a extends C3643n {

    /* renamed from: c */
    public C3423f f12644c;

    public C3622a(C3430i iVar) {
        this.f12644c = (C3423f) iVar.mo14630c();
    }

    /* renamed from: a */
    public C3455g mo15258a(Context context) throws Resources.NotFoundException {
        if (this.f12725b == null) {
            this.f12725b = new C3454f(context);
        }
        return this.f12725b;
    }

    /* renamed from: a */
    public void mo15259a(C2948c.C2951c cVar) {
    }

    /* renamed from: a */
    public C2989b mo15257a(InneractiveAdSpot inneractiveAdSpot, C2807y yVar) {
        if (this.f12724a == null) {
            InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            this.f12724a = new C3007j(this.f12644c, (C3454f) this.f12725b, C2618a.m6642b(inneractiveAdSpot.getAdContent().mo13293c().f12755m), yVar.f9592c, selectedUnitController instanceof C2808z ? ((C2808z) selectedUnitController).isOverlayOutside() : false);
        }
        return this.f12724a;
    }

    /* renamed from: a */
    public boolean mo15260a() {
        this.f12644c.getClass();
        return false;
    }
}
