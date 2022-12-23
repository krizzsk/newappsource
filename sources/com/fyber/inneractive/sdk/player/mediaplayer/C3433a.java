package com.fyber.inneractive.sdk.player.mediaplayer;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.fyber.inneractive.sdk.player.controller.C2997g;
import com.fyber.inneractive.sdk.player.enums.C3025b;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Locale;

/* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a */
public final class C3433a extends MediaPlayer implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: a */
    public Context f12256a;

    /* renamed from: b */
    public volatile C3025b f12257b = C3025b.Idle;

    /* renamed from: c */
    public boolean f12258c = false;

    /* renamed from: d */
    public boolean f12259d = false;

    /* renamed from: e */
    public boolean f12260e = false;

    /* renamed from: f */
    public boolean f12261f = false;

    /* renamed from: g */
    public boolean f12262g = false;

    /* renamed from: h */
    public Handler f12263h;

    /* renamed from: i */
    public C3445l f12264i;

    /* renamed from: j */
    public Surface f12265j;

    /* renamed from: k */
    public SurfaceHolder f12266k;

    /* renamed from: l */
    public long f12267l;

    /* renamed from: m */
    public int f12268m = 0;

    /* renamed from: n */
    public HandlerThread f12269n;

    /* renamed from: o */
    public Handler f12270o;

    /* renamed from: p */
    public Runnable f12271p;

    /* renamed from: q */
    public Runnable f12272q;

    /* renamed from: r */
    public int f12273r = 0;

    /* renamed from: s */
    public int f12274s = 0;

    /* renamed from: t */
    public int f12275t = 0;

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$a */
    public class C3434a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f12276a;

        /* renamed from: b */
        public final /* synthetic */ int f12277b;

        public C3434a(int i, int i2) {
            this.f12276a = i;
            this.f12277b = i2;
        }

        public void run() {
            if (C3433a.this.f12264i != null) {
                String format = String.format(Locale.ENGLISH, "Player Error: %d, %d", new Object[]{Integer.valueOf(this.f12276a), Integer.valueOf(this.f12277b)});
                ((C2997g) C3433a.this.f12264i).mo13857a((Exception) new C3446m(format));
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$b */
    public class C3435b implements Runnable {
        public C3435b() {
        }

        public void run() {
            C3433a.m8665a(C3433a.this);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$c */
    public class C3436c implements Runnable {
        public C3436c() {
        }

        public void run() {
            IAlog.m9902a("%sCannot wait for video size anymore", C3433a.this.mo14639c());
            C3433a aVar = C3433a.this;
            if (aVar.f12273r == 0) {
                IAlog.m9902a("%sCannot wait for video size anymore. duration is still 0 - aborting", aVar.mo14639c());
                C3433a aVar2 = C3433a.this;
                aVar2.onError(aVar2, 0, 0);
                return;
            }
            IAlog.m9902a("%sCannot wait for video size anymore. moving into ready", aVar.mo14639c());
            boolean unused = C3433a.this.f12261f = true;
            C3433a.this.mo14640d();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$d */
    public class C3437d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C3025b f12281a;

        public C3437d(C3025b bVar) {
            this.f12281a = bVar;
        }

        public void run() {
            C3445l lVar = C3433a.this.f12264i;
            if (lVar != null) {
                ((C2997g) lVar).mo13856a(this.f12281a);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$e */
    public class C3438e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ SurfaceHolder f12283a;

        public C3438e(SurfaceHolder surfaceHolder) {
            this.f12283a = surfaceHolder;
        }

        public void run() {
            C3433a.m8667a(C3433a.this, this.f12283a);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$f */
    public class C3439f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Surface f12285a;

        public C3439f(Surface surface) {
            this.f12285a = surface;
        }

        public void run() {
            C3433a.m8666a(C3433a.this, this.f12285a);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$g */
    public class C3440g implements Runnable {
        public C3440g() {
        }

        public void run() {
            C3433a.m8669b(C3433a.this);
            Handler handler = C3433a.this.f12270o;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
                C3433a.this.f12270o = null;
            }
            C3433a.this.f12269n = null;
            Looper.myLooper().quit();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$h */
    public class C3441h implements Runnable {
        public C3441h() {
        }

        public void run() {
            C3433a.this.mo14642f();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$i */
    public class C3442i implements Runnable {
        public C3442i() {
        }

        public void run() {
            C3433a.m8670c(C3433a.this);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$j */
    public class C3443j implements Runnable {
        public C3443j() {
        }

        public void run() {
            C3433a.m8671d(C3433a.this);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$k */
    public class C3444k implements Runnable {
        public C3444k() {
        }

        public void run() {
            C3433a aVar = C3433a.this;
            String c = aVar.mo14639c();
            long currentTimeMillis = System.currentTimeMillis();
            aVar.setVolume(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            IAlog.m9905d(c + "timelog: " + "mute" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$l */
    public interface C3445l {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$m */
    public static class C3446m extends Exception {
        public C3446m(String str) {
            super(str);
        }

        public C3446m(Throwable th, String str) {
            super(str, th);
        }
    }

    public C3433a(Context context, C3445l lVar, Handler handler) {
        this.f12256a = context;
        this.f12264i = lVar;
        this.f12263h = handler;
        setOnPreparedListener(this);
        setOnErrorListener(this);
        setOnSeekCompleteListener(this);
        setOnVideoSizeChangedListener(this);
        super.setOnCompletionListener(this);
        mo14633a();
    }

    /* renamed from: c */
    public static void m8670c(C3433a aVar) {
        String c = aVar.mo14639c();
        long currentTimeMillis = System.currentTimeMillis();
        C3025b bVar = aVar.f12257b;
        if (bVar == C3025b.Paused || bVar == C3025b.Prepared || bVar == C3025b.Completed || bVar == C3025b.Start_in_progress) {
            super.start();
            aVar.mo14634a(C3025b.Playing);
        } else {
            IAlog.m9902a("%s Start called in wrong mState! %s", aVar.mo14639c(), bVar);
            if (aVar.f12257b == C3025b.Seeking) {
                aVar.f12258c = true;
            }
        }
        IAlog.m9905d(c + "timelog: " + "start" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    /* renamed from: d */
    public static void m8671d(C3433a aVar) {
        String c = aVar.mo14639c();
        long currentTimeMillis = System.currentTimeMillis();
        if (super.isPlaying()) {
            super.pause();
        } else {
            IAlog.m9902a("%s paused called cannot set to pause, canceled", aVar.mo14639c());
        }
        IAlog.m9905d(c + "timelog: " + "delayed pause" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    /* renamed from: b */
    public boolean mo14638b() {
        return (this.f12257b == C3025b.Idle || this.f12257b == C3025b.Preparing) ? false : true;
    }

    /* renamed from: e */
    public void mo14641e() {
        this.f12259d = true;
        if (mo14638b()) {
            mo14635a((Runnable) new C3444k());
        } else {
            IAlog.m9902a("%s mute called when player is not ready!", mo14639c());
        }
        IAlog.m9902a("%s mute", mo14639c());
    }

    /* renamed from: f */
    public final void mo14642f() {
        String c = mo14639c();
        long currentTimeMillis = System.currentTimeMillis();
        C3025b bVar = this.f12257b;
        C3025b bVar2 = C3025b.Idle;
        if (bVar == bVar2) {
            IAlog.m9902a("%s reset called, but player is already resetted. Do nothing", mo14639c());
            return;
        }
        mo14634a(bVar2);
        try {
            super.reset();
        } catch (Exception unused) {
        }
        IAlog.m9905d(c + "timelog: " + "reset" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    public int getCurrentPosition() {
        if (mo14638b()) {
            return super.getCurrentPosition();
        }
        return 0;
    }

    public int getDuration() {
        return this.f12273r;
    }

    public int getVideoHeight() {
        return this.f12275t;
    }

    public int getVideoWidth() {
        return this.f12274s;
    }

    public boolean isPlaying() {
        return mo14638b() && this.f12257b != C3025b.Paused && super.isPlaying();
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        mo14634a(C3025b.Completed);
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        IAlog.m9906e("%s onError code = %d code2 = %d", mo14639c(), Integer.valueOf(i), Integer.valueOf(i2));
        mo14642f();
        this.f12263h.post(new C3434a(i, i2));
        return true;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        IAlog.m9902a("%s onPrepared %s gotPrepared = %s", mo14639c(), this, Boolean.valueOf(this.f12262g));
        IAlog.m9902a("%sMedia prepare time took %d msec", mo14639c(), Long.valueOf(System.currentTimeMillis() - this.f12267l));
        if (this.f12257b != C3025b.Preparing && this.f12257b != C3025b.Seeking) {
            IAlog.m9906e("%s onPrepared: previous error encountered. Aborting", mo14639c());
        } else if (!this.f12262g) {
            this.f12262g = true;
            mo14640d();
        } else {
            IAlog.m9902a("%s onPrepared called again??? We are already prepared", mo14639c());
        }
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        IAlog.m9902a("%s onSeekComplete called current position = %d", mo14639c(), Integer.valueOf(mediaPlayer.getCurrentPosition()));
        if (this.f12257b != C3025b.Seeking) {
            IAlog.m9902a("%s onSeekComplete called when Story is not seeking", mo14639c());
            return;
        }
        if (this.f12259d) {
            mo14641e();
        }
        if (this.f12258c) {
            IAlog.m9902a("%s onSeekComplete mPlayAfterSeek = true", mo14639c());
            this.f12257b = C3025b.Paused;
            start();
            return;
        }
        IAlog.m9902a("%s onSeekComplete mPlayAfterSeek = false", mo14639c());
        mo14634a(C3025b.Paused);
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        IAlog.m9902a("%s onVideoSizeChanged %d, %d", mo14639c(), Integer.valueOf(i), Integer.valueOf(i2));
        if (!this.f12261f) {
            Runnable runnable = this.f12271p;
            if (runnable != null) {
                C3714n.f12902b.removeCallbacks(runnable);
                IAlog.m9902a("%s onVideoSizeChanged cancelling prepared runnable", mo14639c());
            }
            this.f12261f = true;
            if (i == 0 || i2 == 0) {
                IAlog.m9906e("%s onVideoSizeChanged - Invalid video size!", mo14639c());
                onError(this, 0, 0);
                return;
            }
            IAlog.m9902a("%sMedia got video size time took %d msec", mo14639c(), Long.valueOf(System.currentTimeMillis() - this.f12267l));
            this.f12274s = i;
            this.f12275t = i2;
            mo14640d();
        }
    }

    public void pause() {
        C3025b bVar;
        if (this.f12257b == C3025b.Idle || this.f12257b == C3025b.Completed || this.f12257b == (bVar = C3025b.Paused) || this.f12257b == C3025b.Prepared) {
            IAlog.m9902a("%s paused called when player is in mState: %s ignoring", mo14639c(), this.f12257b);
            return;
        }
        mo14634a(bVar);
        if (mo14638b()) {
            mo14635a((Runnable) new C3443j());
        } else {
            IAlog.m9902a("%s paused called when player is not ready!", mo14639c());
        }
        IAlog.m9902a("%s pause", mo14639c());
    }

    public void release() {
        if (!this.f12260e) {
            mo14635a((Runnable) new C3440g());
        }
        this.f12264i = null;
        this.f12272q = null;
        this.f12260e = true;
        IAlog.m9902a("%s release called", mo14639c());
    }

    public void reset() {
        IAlog.m9902a("%s reset called", mo14639c());
        Runnable runnable = this.f12271p;
        if (runnable != null) {
            C3714n.f12902b.removeCallbacks(runnable);
        }
        mo14635a((Runnable) new C3441h());
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        IAlog.m9902a("%s setDisplay called", mo14639c());
        if (!mo14638b()) {
            IAlog.m9902a("%s setDisplay called when player is not ready!", mo14639c());
            return;
        }
        SurfaceHolder surfaceHolder2 = this.f12266k;
        if (surfaceHolder2 == null || !surfaceHolder2.equals(surfaceHolder)) {
            this.f12266k = surfaceHolder;
            mo14635a((Runnable) new C3438e(surfaceHolder));
            return;
        }
        IAlog.m9902a("%s setDisplay called with existing surface. ignoring!", mo14639c());
    }

    public final void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        throw new IllegalAccessError("Please use IAplayerCallbacks to receive completion events");
    }

    public void setSurface(Surface surface) {
        IAlog.m9902a("%s setSurface called", mo14639c());
        Surface surface2 = this.f12265j;
        if (surface2 == null || !surface2.equals(surface)) {
            this.f12265j = surface;
            mo14635a((Runnable) new C3439f(surface));
            return;
        }
        IAlog.m9902a("%s setSurface called with existing surface. ignoring!", mo14639c());
    }

    public void start() {
        IAlog.m9902a("%s Start called", mo14639c());
        if (!mo14638b()) {
            IAlog.m9902a("%s MediaPlayer: Start called when player is not ready! - mState = %s", mo14639c(), this.f12257b);
        } else if (this.f12257b == C3025b.Seeking) {
            this.f12258c = true;
        } else if (isPlaying()) {
            IAlog.m9902a("%s MediaPlayer: Start called when player is already playing. do nothing", mo14639c());
        } else {
            mo14634a(C3025b.Start_in_progress);
            mo14635a((Runnable) new C3442i());
        }
    }

    public void stop() {
        String c = mo14639c();
        long currentTimeMillis = System.currentTimeMillis();
        if (mo14638b()) {
            super.stop();
        }
        IAlog.m9902a("%s stop called", mo14639c());
        IAlog.m9905d(c + "timelog: " + "stop" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    /* renamed from: b */
    public static void m8669b(C3433a aVar) {
        String c = aVar.mo14639c();
        long currentTimeMillis = System.currentTimeMillis();
        super.release();
        IAlog.m9905d(c + "timelog: " + "release" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    /* renamed from: a */
    public void mo14636a(String str) {
        String c = mo14639c();
        long currentTimeMillis = System.currentTimeMillis();
        this.f12261f = false;
        this.f12262g = false;
        if (isPlaying()) {
            IAlog.m9902a("%s loadUri stopping play before refresh", mo14639c());
            stop();
        }
        this.f12267l = System.currentTimeMillis();
        mo14642f();
        IAlog.m9902a("%s calling setDataSource with %s", mo14639c(), str);
        try {
            setDataSource(str);
            IAlog.m9902a("%s setDataSource succeeded, calling prepareAsync", mo14639c());
            mo14634a(C3025b.Preparing);
            try {
                prepareAsync();
            } catch (IllegalStateException e) {
                IAlog.m9903b("%s prepareAsync failed with illegal mState exception: %s", mo14639c(), e.getMessage());
                this.f12268m++;
                if (this.f12268m < 5) {
                    mo14636a(str);
                }
                this.f12268m = 0;
            }
            IAlog.m9905d(c + "timelog: " + "loadUri" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
        } catch (Exception e2) {
            IAlog.m9903b("%s error setting data source %s", mo14639c(), str);
            IAlog.m9903b("%s exception message: %s", mo14639c(), e2.getMessage());
        }
    }

    /* renamed from: b */
    public final void mo14637b(C3025b bVar) {
        if (this.f12257b == bVar) {
            IAlog.m9902a("%s updatePlayerState - mState didn't change!", mo14639c());
            return;
        }
        IAlog.m9902a("%s updatePlayerState - changing from %s to %s", mo14639c(), this.f12257b, bVar);
        this.f12257b = bVar;
        this.f12263h.post(new C3437d(bVar));
    }

    /* renamed from: d */
    public final void mo14640d() {
        if (!this.f12262g) {
            return;
        }
        if (this.f12261f) {
            IAlog.m9902a("%sMedia load time took %d msec", mo14639c(), Long.valueOf(System.currentTimeMillis() - this.f12267l));
            this.f12273r = super.getDuration();
            mo14634a(C3025b.Prepared);
            if (this.f12259d) {
                mo14641e();
                return;
            }
            return;
        }
        IAlog.m9902a("%sGot prepared only, waiting for video size", mo14639c());
        if (this.f12271p == null) {
            this.f12271p = new C3436c();
        }
        C3714n.f12902b.postDelayed(this.f12271p, 2000);
    }

    /* renamed from: c */
    public final String mo14639c() {
        return "mp(" + this + "): T:" + Thread.currentThread().getId() + "-" + Thread.currentThread().getName() + ": ";
    }

    /* renamed from: a */
    public final void mo14633a() {
        HandlerThread handlerThread = new HandlerThread("MP-Worker");
        this.f12269n = handlerThread;
        handlerThread.start();
        this.f12270o = new Handler(this.f12269n.getLooper());
        this.f12272q = new C3435b();
    }

    /* renamed from: a */
    public final void mo14634a(C3025b bVar) {
        IAlog.m9902a("%s updatePlayerState - %s", mo14639c(), bVar);
        synchronized (this.f12257b) {
            mo14637b(bVar);
        }
    }

    /* renamed from: a */
    public static void m8666a(C3433a aVar, Surface surface) {
        String c = aVar.mo14639c();
        long currentTimeMillis = System.currentTimeMillis();
        IAlog.m9902a("%s setSurface called with %s", aVar.mo14639c(), surface);
        try {
            super.setSurface(surface);
            if (surface == null) {
                IAlog.m9902a("%s setSurface with null! current surface cleared", aVar.mo14639c());
            } else {
                IAlog.m9902a("%s setSurface - replacing surface!", aVar.mo14639c());
            }
            IAlog.m9905d(c + "timelog: " + "setSurface" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
        } catch (Exception unused) {
            IAlog.m9902a("%s super.setSurface threw exception!", aVar.mo14639c());
        }
    }

    /* renamed from: a */
    public static void m8667a(C3433a aVar, SurfaceHolder surfaceHolder) {
        String c = aVar.mo14639c();
        long currentTimeMillis = System.currentTimeMillis();
        IAlog.m9902a("%s setDisplay called with %s", aVar.mo14639c(), surfaceHolder);
        try {
            super.setDisplay(surfaceHolder);
            if (surfaceHolder == null) {
                IAlog.m9902a("%s setDisplay with null! current display cleared", aVar.mo14639c());
            } else {
                IAlog.m9902a("%s setDisplay - replacing surface holder!", aVar.mo14639c());
            }
            IAlog.m9905d(c + "timelog: " + "setDisplayInternal" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
        } catch (Exception unused) {
            IAlog.m9902a("%s super.setDisplay threw exception!", aVar.mo14639c());
        }
    }

    /* renamed from: a */
    public final void mo14635a(Runnable runnable) {
        Handler handler;
        Handler handler2;
        HandlerThread handlerThread = this.f12269n;
        if (handlerThread != null && handlerThread.isAlive() && !this.f12269n.isInterrupted() && (handler2 = this.f12270o) != null) {
            handler2.post(runnable);
        }
        if ((this.f12274s == 0 || this.f12275t == 0 || this.f12273r == 0) && (handler = this.f12270o) != null) {
            handler.post(this.f12272q);
        }
    }

    /* renamed from: a */
    public static void m8665a(C3433a aVar) {
        if (aVar.mo14638b()) {
            aVar.f12274s = super.getVideoWidth();
            aVar.f12275t = super.getVideoHeight();
            aVar.f12273r = super.getDuration();
        }
    }
}
