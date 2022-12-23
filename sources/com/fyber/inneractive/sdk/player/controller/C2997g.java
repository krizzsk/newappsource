package com.fyber.inneractive.sdk.player.controller;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.measurement.C2823g;
import com.fyber.inneractive.sdk.player.C2948c;
import com.fyber.inneractive.sdk.player.C3022e;
import com.fyber.inneractive.sdk.player.enums.C3025b;
import com.fyber.inneractive.sdk.player.mediaplayer.C3433a;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.player.controller.g */
public abstract class C2997g implements C3433a.C3445l {

    /* renamed from: a */
    public Context f10256a = null;

    /* renamed from: b */
    public List<C3003f> f10257b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public List<C3002e> f10258c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public C3004g f10259d;

    /* renamed from: e */
    public C3025b f10260e = C3025b.Idle;

    /* renamed from: f */
    public C3001d f10261f;

    /* renamed from: g */
    public boolean f10262g;

    /* renamed from: h */
    public C3022e f10263h;

    /* renamed from: i */
    public Handler f10264i;

    /* renamed from: j */
    public TextureView f10265j;

    /* renamed from: k */
    public SurfaceTexture f10266k;

    /* renamed from: l */
    public Surface f10267l;

    /* renamed from: m */
    public TextureView.SurfaceTextureListener f10268m;

    /* renamed from: n */
    public boolean f10269n = false;

    /* renamed from: o */
    public boolean f10270o;

    /* renamed from: com.fyber.inneractive.sdk.player.controller.g$a */
    public class C2998a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Exception f10271a;

        public C2998a(Exception exc) {
            this.f10271a = exc;
        }

        public void run() {
            C2997g gVar = C2997g.this;
            if (!gVar.f10262g) {
                try {
                    List<C3003f> list = gVar.f10257b;
                    if (list != null) {
                        for (C3003f a : list) {
                            a.mo13741a(this.f10271a);
                        }
                    }
                } catch (Exception e) {
                    if (IAlog.f12814a <= 3) {
                        C2997g gVar2 = C2997g.this;
                        gVar2.getClass();
                        IAlog.m9902a("%sonPlayerError callback threw an exception!", IAlog.m9899a((Object) gVar2));
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.controller.g$b */
    public class C2999b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f10273a;

        public C2999b(int i) {
            this.f10273a = i;
        }

        public void run() {
            try {
                List<C3002e> list = C2997g.this.f10258c;
                if (list != null) {
                    for (C3002e a : list) {
                        a.mo13863a(this.f10273a);
                    }
                }
            } catch (Exception e) {
                if (IAlog.f12814a <= 3) {
                    C2997g gVar = C2997g.this;
                    gVar.getClass();
                    IAlog.m9902a("%sonPlayerProgress callback threw an exception!", IAlog.m9899a((Object) gVar));
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.controller.g$c */
    public class C3000c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C3025b f10275a;

        public C3000c(C3025b bVar) {
            this.f10275a = bVar;
        }

        public void run() {
            C2997g gVar;
            TextureView textureView;
            TextureView textureView2;
            TextureView textureView3;
            try {
                List<C3003f> list = C2997g.this.f10257b;
                if (list != null) {
                    for (C3003f a : list) {
                        a.mo13864a(this.f10275a);
                    }
                }
                C3025b bVar = this.f10275a;
                if (bVar == C3025b.Idle || bVar == C3025b.Error || bVar == C3025b.Completed) {
                    C2997g gVar2 = C2997g.this;
                    if (!(gVar2.f10266k == null || (textureView3 = gVar2.f10265j) == null || textureView3.getParent() == null)) {
                        ((ViewGroup) C2997g.this.f10265j.getParent()).removeView(C2997g.this.f10265j);
                    }
                    gVar = C2997g.this;
                    gVar.f10265j = null;
                    gVar.f10266k = null;
                }
            } catch (Exception e) {
                if (IAlog.f12814a <= 3) {
                    C2997g gVar3 = C2997g.this;
                    gVar3.getClass();
                    IAlog.m9902a("%sonPlayerStateChanged callback threw an exception!", IAlog.m9899a((Object) gVar3));
                    e.printStackTrace();
                }
                C3025b bVar2 = this.f10275a;
                if (bVar2 == C3025b.Idle || bVar2 == C3025b.Error || bVar2 == C3025b.Completed) {
                    C2997g gVar4 = C2997g.this;
                    if (!(gVar4.f10266k == null || (textureView = gVar4.f10265j) == null || textureView.getParent() == null)) {
                        ((ViewGroup) C2997g.this.f10265j.getParent()).removeView(C2997g.this.f10265j);
                    }
                    gVar = C2997g.this;
                    gVar.f10265j = null;
                }
            } catch (Throwable th) {
                C3025b bVar3 = this.f10275a;
                if (bVar3 == C3025b.Idle || bVar3 == C3025b.Error || bVar3 == C3025b.Completed) {
                    C2997g gVar5 = C2997g.this;
                    if (!(gVar5.f10266k == null || (textureView2 = gVar5.f10265j) == null || textureView2.getParent() == null)) {
                        ((ViewGroup) C2997g.this.f10265j.getParent()).removeView(C2997g.this.f10265j);
                    }
                    C2997g gVar6 = C2997g.this;
                    gVar6.f10265j = null;
                    gVar6.f10266k = null;
                }
                throw th;
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.controller.g$d */
    public interface C3001d {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.controller.g$e */
    public interface C3002e {
        /* renamed from: a */
        void mo13863a(int i);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.controller.g$f */
    public interface C3003f {
        /* renamed from: a */
        void mo13864a(C3025b bVar);

        /* renamed from: a */
        void mo13741a(Exception exc);

        /* renamed from: e */
        void mo13865e();

        /* renamed from: e */
        void mo13747e(boolean z);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.controller.g$g */
    public interface C3004g {
    }

    public C2997g(Context context) {
        this.f10256a = context.getApplicationContext();
        this.f10264i = new Handler(context.getMainLooper());
        this.f10263h = new C3022e(this);
        mo13809a(true);
    }

    /* renamed from: a */
    public abstract void mo13806a(int i, boolean z);

    /* renamed from: a */
    public abstract void mo13807a(Surface surface);

    /* renamed from: a */
    public abstract void mo13808a(String str, int i);

    /* renamed from: a */
    public abstract void mo13809a(boolean z);

    /* renamed from: a */
    public abstract boolean mo13810a();

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public void mo13811b() {
        IAlog.m9902a("%sdestroy started", IAlog.m9899a((Object) this));
        mo13859m();
        this.f10263h = null;
        Handler handler = this.f10264i;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        List<C3003f> list = this.f10257b;
        if (list != null) {
            list.clear();
        }
        this.f10257b = null;
        this.f10261f = null;
        this.f10262g = true;
        IAlog.m9902a("%sdestroy finished", IAlog.m9899a((Object) this));
    }

    /* renamed from: b */
    public abstract void mo13812b(boolean z);

    /* renamed from: c */
    public abstract int mo13813c();

    /* renamed from: c */
    public final void mo13858c(boolean z) {
        C2823g gVar;
        C3001d dVar = this.f10261f;
        if (dVar != null && (gVar = C2948c.this.f10090i) != null) {
            if (z) {
                if (gVar.f9692c != null) {
                    IAlog.m9902a("%s mute", "OMVideo");
                    try {
                        gVar.f9692c.mo51437c(BitmapDescriptorFactory.HUE_RED);
                    } catch (Throwable th) {
                        gVar.mo13612a(th);
                    }
                }
            } else if (gVar.f9692c != null) {
                IAlog.m9902a("%s unMute", "OMVideo");
                try {
                    gVar.f9692c.mo51437c(1.0f);
                } catch (Throwable th2) {
                    gVar.mo13612a(th2);
                }
            }
        }
    }

    /* renamed from: d */
    public abstract int mo13814d();

    /* renamed from: d */
    public abstract void mo13815d(boolean z);

    /* renamed from: e */
    public abstract Bitmap mo13816e();

    /* renamed from: f */
    public abstract String mo13817f();

    /* renamed from: g */
    public abstract int mo13818g();

    /* renamed from: h */
    public abstract int mo13819h();

    /* renamed from: i */
    public abstract boolean mo13820i();

    /* renamed from: j */
    public boolean mo13837j() {
        return this.f10260e == C3025b.Playing;
    }

    /* renamed from: k */
    public abstract void mo13821k();

    /* renamed from: l */
    public abstract void mo13822l();

    /* renamed from: m */
    public void mo13859m() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        C3022e eVar = this.f10263h;
        if (eVar != null && (scheduledThreadPoolExecutor = eVar.f10320b) != null) {
            scheduledThreadPoolExecutor.shutdownNow();
            eVar.f10320b = null;
        }
    }

    /* renamed from: a */
    public void mo13857a(Exception exc) {
        mo13856a(C3025b.Error);
        IAlog.m9902a("%sonPlayerError called with: %s for onPlayerError", IAlog.m9899a((Object) this), exc);
        this.f10264i.post(new C2998a(exc));
        mo13859m();
    }

    /* renamed from: a */
    public void mo13805a(int i) {
        this.f10264i.post(new C2999b(i));
    }

    /* renamed from: a */
    public void mo13856a(C3025b bVar) {
        if (bVar != this.f10260e) {
            this.f10260e = bVar;
            if (bVar == C3025b.Playing) {
                C3022e eVar = this.f10263h;
                if (eVar != null && eVar.f10320b == null) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                    eVar.f10320b = scheduledThreadPoolExecutor;
                    scheduledThreadPoolExecutor.scheduleAtFixedRate(eVar.f10321c, (long) 100, (long) 1000, TimeUnit.MILLISECONDS);
                }
            } else if (bVar == C3025b.Paused || bVar == C3025b.Idle || bVar == C3025b.Completed) {
                mo13859m();
            }
            this.f10264i.post(new C3000c(bVar));
        }
    }
}
