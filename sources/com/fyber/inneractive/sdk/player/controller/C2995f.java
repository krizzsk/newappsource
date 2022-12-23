package com.fyber.inneractive.sdk.player.controller;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.fyber.inneractive.sdk.player.C2948c;
import com.fyber.inneractive.sdk.player.controller.C2997g;
import com.fyber.inneractive.sdk.player.enums.C3025b;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.controller.f */
public class C2995f implements TextureView.SurfaceTextureListener {

    /* renamed from: a */
    public final /* synthetic */ C2997g f10254a;

    /* renamed from: com.fyber.inneractive.sdk.player.controller.f$a */
    public class C2996a implements Runnable {
        public C2996a() {
        }

        public void run() {
            C2997g.C3004g gVar = C2995f.this.f10254a.f10259d;
            if (gVar != null) {
                C3016p pVar = (C3016p) gVar;
                pVar.f10315a.f10290d.post(new C3015o(pVar));
            }
        }
    }

    public C2995f(C2997g gVar) {
        this.f10254a = gVar;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C2997g gVar = this.f10254a;
        gVar.getClass();
        IAlog.m9902a("%sonSurfaceTextureAvailable", IAlog.m9899a((Object) gVar));
        C2997g gVar2 = this.f10254a;
        boolean z = !surfaceTexture.equals(gVar2.f10266k);
        gVar2.f10266k = surfaceTexture;
        if (gVar2.f10267l == null || z) {
            gVar2.f10267l = new Surface(gVar2.f10266k);
        }
        gVar2.mo13807a(gVar2.f10267l);
        C2997g.C3004g gVar3 = this.f10254a.f10259d;
        if (gVar3 != null) {
            C3009k kVar = ((C3016p) gVar3).f10315a;
            kVar.getClass();
            IAlog.m9902a("%sonSurfaceTextureAvailable", IAlog.m9899a((Object) kVar));
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C2997g gVar = this.f10254a;
        gVar.getClass();
        IAlog.m9902a("%s onSurfaceTextureDestroyed", IAlog.m9899a((Object) gVar));
        this.f10254a.mo13821k();
        this.f10254a.mo13807a((Surface) null);
        boolean unused = this.f10254a.f10270o = true;
        C2997g gVar2 = this.f10254a;
        C3025b bVar = gVar2.f10260e;
        if (bVar == C3025b.Completed || bVar == C3025b.Error || bVar == C3025b.Idle) {
            IAlog.m9902a("%sReleasing surface texture", IAlog.m9899a((Object) gVar2));
            this.f10254a.f10266k = null;
            return true;
        }
        IAlog.m9902a("%s caching surface texture", IAlog.m9899a((Object) gVar2));
        C2997g gVar3 = this.f10254a;
        gVar3.f10266k = surfaceTexture;
        gVar3.f10264i.post(new C2996a());
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Surface surface;
        C2948c cVar;
        C2997g gVar;
        C2997g.C3004g gVar2 = this.f10254a.f10259d;
        if (!(gVar2 == null || (cVar = ((C3016p) gVar2).f10315a.f10287a) == null || (gVar = cVar.f10083b) == null)) {
            gVar.f10264i.post(new C3006i(gVar));
        }
        C2997g gVar3 = this.f10254a;
        if (gVar3.f10270o && (surface = gVar3.f10267l) != null) {
            gVar3.mo13807a(surface);
            boolean unused = this.f10254a.f10270o = false;
        }
    }
}
