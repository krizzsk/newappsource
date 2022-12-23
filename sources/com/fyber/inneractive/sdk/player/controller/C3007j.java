package com.fyber.inneractive.sdk.player.controller;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.model.vast.C2850q;
import com.fyber.inneractive.sdk.player.C2948c;
import com.fyber.inneractive.sdk.player.C3423f;
import com.fyber.inneractive.sdk.player.controller.C3017q;
import com.fyber.inneractive.sdk.player.enums.C3025b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.p050ui.C3449a;
import com.fyber.inneractive.sdk.player.p050ui.C3450b;
import com.fyber.inneractive.sdk.player.p050ui.C3457i;
import com.fyber.inneractive.sdk.util.C3721p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.fyber.inneractive.sdk.player.controller.j */
public class C3007j extends C3009k<C3017q.C3018a> implements C3017q {

    /* renamed from: A */
    public float f10280A = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: B */
    public boolean f10281B = false;

    /* renamed from: C */
    public boolean f10282C = false;

    /* renamed from: D */
    public boolean f10283D = false;

    /* renamed from: y */
    public Runnable f10284y;

    /* renamed from: z */
    public float f10285z;

    /* renamed from: com.fyber.inneractive.sdk.player.controller.j$a */
    public class C3008a implements Runnable {
        public C3008a() {
        }

        public void run() {
            C3007j.this.mo13877h(false);
            C3007j.this.f10284y = null;
        }
    }

    public C3007j(C2948c cVar, C3457i iVar, C2702y yVar, C2666s sVar, boolean z) {
        super(cVar, iVar, yVar, sVar, z);
        this.f10285z = ((float) yVar.mo13288b().mo13203b().intValue()) / 100.0f;
        mo13871D();
    }

    /* renamed from: A */
    public final void mo13868A() {
        if (this.f10293g != null && !this.f10283D) {
            mo13870C();
            super.mo13878j();
            ((C3017q.C3018a) this.f10293g).mo13922c();
            IAlog.m9902a("%sopening fullscreen", IAlog.m9899a((Object) this));
            this.f10283D = true;
            C2948c cVar = this.f10287a;
            if (cVar != null) {
                C3423f fVar = (C3423f) cVar;
                fVar.mo13740a(fVar.f12240x, VideoClickOrigin.InvalidOrigin, C2850q.EVENT_FULLSCREEN, C2850q.EVENT_EXPAND);
            }
        }
    }

    /* renamed from: B */
    public final void mo13869B() {
        C2948c cVar;
        C2997g gVar;
        C3457i iVar;
        if (this.f10280A >= this.f10285z && (cVar = this.f10287a) != null && (gVar = cVar.f10083b) != null && !gVar.f10260e.equals(C3025b.Completed) && (iVar = this.f10290d) != null && !iVar.mo14699d() && this.f10287a.f10083b.f10265j != null) {
            if (((C2702y) this.f10288b).f9427f.f9247a.booleanValue() || this.f10281B) {
                mo13826b(IAConfigManager.f9202J.f9221i.f9359b);
            }
        }
    }

    /* renamed from: C */
    public final void mo13870C() {
        if (this.f10284y != null) {
            IAlog.m9902a("%sCancelling play runnable", IAlog.m9899a((Object) this));
            this.f10290d.removeCallbacks(this.f10284y);
            this.f10284y = null;
        }
    }

    /* renamed from: D */
    public final void mo13871D() {
        C2997g gVar;
        C2948c cVar = this.f10287a;
        if (cVar != null && (gVar = cVar.f10083b) != null && !gVar.f10269n) {
            if (((C2702y) this.f10288b).f9427f.f9250d.booleanValue()) {
                this.f10287a.f10083b.mo13812b(false);
            } else if (!mo13895o()) {
                this.f10287a.f10083b.mo13815d(false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r3.f10290d;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13872E() {
        /*
            r3 = this;
            com.fyber.inneractive.sdk.config.z r0 = r3.f10288b
            com.fyber.inneractive.sdk.config.y r0 = (com.fyber.inneractive.sdk.config.C2702y) r0
            com.fyber.inneractive.sdk.config.a0 r0 = r0.f9427f
            com.fyber.inneractive.sdk.config.enums.TapAction r0 = r0.f9255i
            com.fyber.inneractive.sdk.config.enums.TapAction r1 = com.fyber.inneractive.sdk.config.enums.TapAction.FULLSCREEN
            if (r0 == r1) goto L_0x001b
            com.fyber.inneractive.sdk.player.ui.i r0 = r3.f10290d
            android.widget.ImageView r1 = r0.f12347u
            if (r1 == 0) goto L_0x001b
            r2 = 0
            r1.setVisibility(r2)
            android.widget.ImageView r0 = r0.f12347u
            r0.setSelected(r2)
        L_0x001b:
            r3.mo13897x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C3007j.mo13872E():void");
    }

    /* renamed from: a */
    public void mo13840a(boolean z) {
        if (z) {
            mo13874a(this.f10280A);
        }
        super.mo13840a(z);
    }

    /* renamed from: b */
    public void mo13826b(int i) {
        C2997g gVar;
        C2948c cVar = this.f10287a;
        if (cVar != null && (gVar = cVar.f10083b) != null && gVar.f10260e != C3025b.Playing && this.f10284y == null) {
            IAlog.m9902a("%splayVideo %s", IAlog.m9899a((Object) this), this.f10290d);
            if (i == 0) {
                mo13877h(false);
                return;
            }
            C3008a aVar = new C3008a();
            this.f10284y = aVar;
            this.f10290d.postDelayed(aVar, (long) i);
        }
    }

    /* renamed from: c */
    public boolean mo13828c() {
        return true;
    }

    /* renamed from: d */
    public void mo13829d(boolean z) {
        C2997g gVar;
        C2948c cVar = this.f10287a;
        if (!(cVar == null || (gVar = cVar.f10083b) == null || gVar.f10260e.equals(C3025b.Completed))) {
            mo13872E();
        }
        C2948c cVar2 = this.f10287a;
        Bitmap bitmap = cVar2 != null ? cVar2.f10093l : null;
        if (bitmap != null) {
            this.f10290d.mo14695b(true);
            this.f10290d.setLastFrameBitmap(bitmap);
        }
        super.mo13829d(z);
    }

    public void destroy() {
        mo13870C();
        this.f10293g = null;
        super.destroy();
    }

    /* renamed from: h */
    public void mo13877h(boolean z) {
        C2948c cVar = this.f10287a;
        if (cVar != null && cVar.f10083b != null) {
            mo13871D();
            super.mo13877h(z);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public boolean mo13842i() {
        super.mo13842i();
        C2948c cVar = this.f10287a;
        if (!(cVar == null || cVar.f10083b == null)) {
            IAlog.m9902a("%sconnectToTextureView playing state = %s", IAlog.m9899a((Object) this), this.f10287a.f10083b.f10260e);
            if (this.f10287a.f10083b.mo13837j()) {
                this.f10290d.mo14697c(!this.f10287a.f10092k);
                C3457i iVar = this.f10290d;
                C3450b bVar = new C3450b();
                bVar.f12306b = false;
                iVar.mo14691a(new C3449a(bVar));
                this.f10290d.mo14695b(false);
                mo13871D();
            }
        }
        mo13874a(this.f10280A);
        return true;
    }

    /* renamed from: j */
    public void mo13878j() {
        mo13870C();
        super.mo13878j();
    }

    /* renamed from: l */
    public int mo13843l() {
        return IAConfigManager.f9202J.f9234v.f9337b.mo13271a("VideoAdBufferingTimeout", 5, 1) * 1000;
    }

    /* renamed from: n */
    public int mo13844n() {
        return 0;
    }

    /* renamed from: p */
    public void mo13845p() {
        IAlog.m9902a("%s onBufferingTimeout reached. Skipping to end card", IAlog.m9899a((Object) this));
        if (this.f10290d.f12319e) {
            this.f10307u = true;
            mo13827c(false);
        }
    }

    public void pauseVideo() {
        mo13870C();
        super.pauseVideo();
    }

    /* renamed from: r */
    public void mo13846r() {
        mo13868A();
    }

    /* renamed from: s */
    public void mo13879s() {
        mo13891h();
        this.f10290d.mo14693a(false);
        mo13850y();
        mo13870C();
    }

    /* renamed from: t */
    public void mo13847t() {
        C2948c cVar = this.f10287a;
        if (cVar != null && cVar.f10083b != null) {
            mo13842i();
            mo13877h(false);
        }
    }

    /* renamed from: u */
    public void mo13880u() {
        mo13869B();
    }

    /* renamed from: v */
    public void mo13848v() {
        super.mo13848v();
        mo13872E();
        this.f10290d.mo14695b(false);
        this.f10281B = true;
    }

    /* renamed from: w */
    public boolean mo13849w() {
        return false;
    }

    /* renamed from: a */
    public void mo13839a(C3721p0 p0Var) {
        TapAction tapAction = ((C2702y) this.f10288b).f9427f.f9255i;
        C2948c cVar = this.f10287a;
        if (cVar != null && cVar.f10083b != null && this.f10280A < this.f10285z) {
            return;
        }
        if (tapAction == TapAction.CTR) {
            Bitmap g = mo13889g(false);
            if (mo13886a(false, VideoClickOrigin.CTA, p0Var) && g != null) {
                this.f10290d.setLastFrameBitmap(g);
                this.f10290d.mo14695b(true);
            }
        } else if (tapAction == TapAction.FULLSCREEN) {
            mo13868A();
        } else if (tapAction != TapAction.DO_NOTHING) {
            IAlog.m9902a("%sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.m9899a((Object) this), tapAction);
        } else if (cVar != null) {
            cVar.mo13749g();
        }
    }

    /* renamed from: b */
    public void mo13875b(boolean z) {
        C2948c cVar;
        C2997g gVar;
        this.f10282C = z;
        if (z && (cVar = this.f10287a) != null && (gVar = cVar.f10083b) != null && gVar.f10265j == null && this.f10290d.f12319e && !gVar.f10260e.equals(C3025b.Completed)) {
            mo13842i();
            mo13874a(this.f10280A);
        }
    }

    /* renamed from: d */
    public void mo13876d() {
        IAlog.m9902a("%sonVideoViewDetachedFromWindow", IAlog.m9899a((Object) this));
        mo13878j();
    }

    /* renamed from: a */
    public void mo13874a(float f) {
        C2997g gVar;
        this.f10280A = f;
        if (IAlog.f12814a >= 3) {
            IAlog.m9904c("%sonVisibilityChanged called with: %s vfpl = %s vfpa = %s", IAlog.m9899a((Object) this), Float.valueOf(f), Float.valueOf(this.f10285z), Float.valueOf(1.0f - this.f10285z));
        }
        C2948c cVar = this.f10287a;
        if (cVar != null && (gVar = cVar.f10083b) != null) {
            if (gVar.f10260e != C3025b.Playing) {
                mo13869B();
            } else if (f <= this.f10285z) {
                IAlog.m9905d("%sonVisibilityChanged pausing player", IAlog.m9899a((Object) this));
                if (this.f10287a.f10083b.f10265j != null) {
                    this.f10281B = false;
                    mo13889g(false);
                    mo13870C();
                    super.pauseVideo();
                    mo13888f(false);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo13873a() {
        C2997g gVar;
        IAlog.m9902a("%sfullscreenExited called", IAlog.m9899a((Object) this));
        this.f10283D = false;
        mo13875b(this.f10282C);
        C2948c cVar = this.f10287a;
        if (cVar != null && (gVar = cVar.f10083b) != null) {
            mo13864a(gVar.f10260e);
            mo13863a(this.f10287a.f10083b.mo13813c());
        }
    }
}
