package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.controller.C2997g;
import com.fyber.inneractive.sdk.player.enums.C3025b;
import com.fyber.inneractive.sdk.player.mediaplayer.C3433a;
import com.fyber.inneractive.sdk.player.mediaplayer.C3447b;
import com.fyber.inneractive.sdk.player.mediaplayer.C3448c;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.controller.a */
public class C2988a extends C2997g {

    /* renamed from: p */
    public C3433a f10218p;

    /* renamed from: q */
    public int f10219q = 0;

    /* renamed from: r */
    public int f10220r = 2;

    /* renamed from: s */
    public int f10221s = 0;

    /* renamed from: t */
    public boolean f10222t = false;

    public C2988a(Context context) {
        super(context);
        IAlog.m9902a("Creating IAAndroidMediaPlayerController", new Object[0]);
    }

    /* renamed from: a */
    public void mo13806a(int i, boolean z) {
        C3433a aVar = this.f10218p;
        if (aVar != null) {
            IAlog.m9902a("%s seek to called with = %d mPlayAfterSeek = %s", aVar.mo14639c(), Integer.valueOf(i), Boolean.valueOf(z));
            if (!aVar.mo14638b()) {
                IAlog.m9902a("%s seek called when player is not ready!", aVar.mo14639c());
                return;
            }
            C3025b bVar = aVar.f12257b;
            C3025b bVar2 = C3025b.Seeking;
            if (bVar == bVar2) {
                IAlog.m9902a("%s seek called when player is already seeking!", aVar.mo14639c());
                return;
            }
            aVar.mo14634a(bVar2);
            aVar.f12258c = z;
            aVar.mo14635a((Runnable) new C3447b(aVar, i));
        }
    }

    /* renamed from: a */
    public boolean mo13810a() {
        return false;
    }

    /* renamed from: b */
    public void mo13811b() {
        C3433a aVar = this.f10218p;
        if (aVar != null) {
            aVar.reset();
            this.f10218p.release();
            this.f10218p = null;
        }
        super.mo13811b();
    }

    /* renamed from: c */
    public int mo13813c() {
        C3433a aVar = this.f10218p;
        if (aVar != null) {
            return aVar.getCurrentPosition();
        }
        return 0;
    }

    /* renamed from: d */
    public void mo13815d(boolean z) {
        mo13858c(false);
        if (mo13820i() || !this.f10269n) {
            this.f10269n = z;
            C3433a aVar = this.f10218p;
            if (aVar != null) {
                IAlog.m9902a("%s unmute", aVar.mo14639c());
                aVar.f12259d = false;
                if (aVar.mo14638b()) {
                    aVar.mo14635a((Runnable) new C3448c(aVar));
                    return;
                }
                IAlog.m9902a("%s unmute called when player is not ready!", aVar.mo14639c());
            }
        }
    }

    /* renamed from: e */
    public Bitmap mo13816e() {
        return null;
    }

    /* renamed from: f */
    public String mo13817f() {
        return "media";
    }

    /* renamed from: g */
    public int mo13818g() {
        C3433a aVar = this.f10218p;
        if (aVar != null) {
            return aVar.f12275t;
        }
        return 0;
    }

    /* renamed from: h */
    public int mo13819h() {
        C3433a aVar = this.f10218p;
        if (aVar != null) {
            return aVar.f12274s;
        }
        return 0;
    }

    /* renamed from: i */
    public boolean mo13820i() {
        C3433a aVar = this.f10218p;
        if (aVar != null) {
            return aVar.f12259d;
        }
        return false;
    }

    /* renamed from: k */
    public void mo13821k() {
        C3433a aVar = this.f10218p;
        if (aVar != null) {
            aVar.pause();
        }
    }

    /* renamed from: l */
    public void mo13822l() {
        C3433a aVar = this.f10218p;
        if (aVar != null) {
            aVar.start();
        }
    }

    /* renamed from: b */
    public void mo13812b(boolean z) {
        mo13858c(true);
        if (!mo13820i() || !this.f10269n) {
            this.f10269n = z;
            C3433a aVar = this.f10218p;
            if (aVar != null) {
                aVar.mo14641e();
            }
        }
    }

    /* renamed from: a */
    public void mo13807a(Surface surface) {
        C3433a aVar = this.f10218p;
        if (aVar != null) {
            aVar.setSurface(surface);
        }
    }

    /* renamed from: d */
    public int mo13814d() {
        C3433a aVar = this.f10218p;
        if (aVar != null) {
            return aVar.f12273r;
        }
        return 0;
    }

    /* renamed from: a */
    public void mo13809a(boolean z) {
        if (this.f10218p == null) {
            IAlog.m9902a("MediaPlayerController: creating media player", new Object[0]);
            this.f10218p = new C3433a(this.f10256a, this, this.f10264i);
        }
    }

    /* renamed from: a */
    public void mo13808a(String str, int i) {
        this.f10218p.mo14636a(str);
    }

    /* renamed from: a */
    public void mo13805a(int i) {
        this.f10264i.post(new C2997g.C2999b(i));
        if (i >= mo13814d()) {
            mo13856a(C3025b.Completed);
        } else if (i == this.f10219q) {
            IAlog.m9902a("%sVideo is stuck! Progress doesn't change", IAlog.m9899a((Object) this));
            int i2 = this.f10221s + 1;
            this.f10221s = i2;
            if (i2 == this.f10220r) {
                mo13856a(C3025b.Buffering);
                this.f10222t = true;
            }
        } else if (this.f10222t) {
            IAlog.m9902a("%sVideo progress was stuck! but now it goes forward. Remove buffering state", IAlog.m9899a((Object) this));
            mo13856a(C3025b.Playing);
            this.f10221s = 0;
            this.f10222t = false;
        }
        this.f10219q = i;
    }
}
