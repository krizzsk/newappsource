package com.veriff.sdk.internal.video;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.lifecycle.C1033p;
import bf0.C21050d;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.util.C24446b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\b\u0018\u00002\u00020\u0001:\u0001\u001dB7\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u001e"}, mo59060d2 = {"Lcom/veriff/sdk/internal/video/VideoPlayer;", "", "Lbf0/d;", "play", "stop", "Landroid/media/MediaPlayer;", "mediaPlayer", "Landroid/media/MediaPlayer;", "com/veriff/sdk/internal/video/VideoPlayer$observer$1", "observer", "Lcom/veriff/sdk/internal/video/VideoPlayer$observer$1;", "", "playerPrepared", "Z", "playing", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "Lmobi/lab/veriff/util/Clock;", "clock", "Landroid/view/SurfaceView;", "surfaceView", "Landroidx/lifecycle/p;", "owner", "Lcom/veriff/sdk/internal/video/VideoPlayer$Listener;", "listener", "<init>", "(Landroid/content/Context;Landroid/net/Uri;Lmobi/lab/veriff/util/Clock;Landroid/view/SurfaceView;Landroidx/lifecycle/p;Lcom/veriff/sdk/internal/video/VideoPlayer$Listener;)V", "Listener", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.video.a */
public final class C22623a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f57069a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f57070b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final MediaPlayer f57071c;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo59060d2 = {"Landroid/media/MediaPlayer;", "kotlin.jvm.PlatformType", "it", "Lbf0/d;", "onPrepared", "(Landroid/media/MediaPlayer;)V", "com/veriff/sdk/internal/video/VideoPlayer$mediaPlayer$1$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.video.a$a */
    public static final class C22625a implements MediaPlayer.OnPreparedListener {

        /* renamed from: a */
        public final /* synthetic */ long f57073a;

        /* renamed from: b */
        public final /* synthetic */ C22623a f57074b;

        /* renamed from: c */
        public final /* synthetic */ C24446b f57075c;

        /* renamed from: f */
        public final /* synthetic */ C22627c f57076f;

        public C22625a(long j, C22623a aVar, C24446b bVar, Context context, Uri uri, C22627c cVar) {
            this.f57073a = j;
            this.f57074b = aVar;
            this.f57075c = bVar;
            this.f57076f = cVar;
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            this.f57074b.f57070b = true;
            if (this.f57074b.f57069a) {
                mediaPlayer.start();
            }
            this.f57076f.mo56634a(this.f57075c.mo60662a(this.f57073a));
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b¨\u0006\t"}, mo59060d2 = {"<anonymous>", "", "mp", "Landroid/media/MediaPlayer;", "kotlin.jvm.PlatformType", "what", "", "extra", "onError", "com/veriff/sdk/internal/video/VideoPlayer$mediaPlayer$1$2"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.video.a$b */
    public static final class C22626b implements MediaPlayer.OnErrorListener {

        /* renamed from: a */
        public final /* synthetic */ long f57077a;

        /* renamed from: c */
        public final /* synthetic */ C24446b f57078c;

        /* renamed from: f */
        public final /* synthetic */ C22627c f57079f;

        public C22626b(long j, C22623a aVar, C24446b bVar, Context context, Uri uri, C22627c cVar) {
            this.f57077a = j;
            this.f57078c = bVar;
            this.f57079f = cVar;
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            this.f57079f.mo56635a(this.f57078c.mo60662a(this.f57077a), i, i2);
            return false;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\n"}, mo59060d2 = {"Lcom/veriff/sdk/internal/video/VideoPlayer$Listener;", "", "", "timeMs", "", "what", "extra", "Lbf0/d;", "onVideoFailed", "onVideoPrepared", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.video.a$c */
    public interface C22627c {
        /* renamed from: a */
        void mo56634a(long j);

        /* renamed from: a */
        void mo56635a(long j, int i, int i2);
    }

    public C22623a(Context context, Uri uri, C24446b bVar, SurfaceView surfaceView, C1033p pVar, C22627c cVar) {
        Context context2 = context;
        Uri uri2 = uri;
        C24362h.m61211f(context2, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(uri2, "uri");
        C24362h.m61211f(bVar, "clock");
        C24362h.m61211f(surfaceView, "surfaceView");
        C24362h.m61211f(pVar, "owner");
        C24362h.m61211f(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        MediaPlayer mediaPlayer = new MediaPlayer();
        long a = bVar.mo60661a();
        mediaPlayer.setLooping(true);
        mediaPlayer.setDataSource(context2, uri2);
        mediaPlayer.setVideoScalingMode(1);
        mediaPlayer.prepareAsync();
        long j = a;
        C24446b bVar2 = bVar;
        Context context3 = context;
        Uri uri3 = uri;
        C22625a aVar = r0;
        C22627c cVar2 = cVar;
        C22625a aVar2 = new C22625a(j, this, bVar2, context3, uri3, cVar2);
        mediaPlayer.setOnPreparedListener(aVar);
        mediaPlayer.setOnErrorListener(new C22626b(j, this, bVar2, context3, uri3, cVar2));
        C21050d dVar = C21050d.f52856a;
        this.f57071c = mediaPlayer;
        pVar.getLifecycle().mo4224a(new VideoPlayer$observer$1(this));
        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback2(this) {

            /* renamed from: a */
            public final /* synthetic */ C22623a f57072a;

            {
                this.f57072a = r1;
            }

            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                C24362h.m61211f(surfaceHolder, "holder");
                this.f57072a.f57071c.setSurface(surfaceHolder.getSurface());
            }

            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                C24362h.m61211f(surfaceHolder, "holder");
                this.f57072a.f57071c.setSurface(surfaceHolder.getSurface());
            }

            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                C24362h.m61211f(surfaceHolder, "holder");
            }

            public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
                C24362h.m61211f(surfaceHolder, "holder");
            }
        });
    }

    /* renamed from: b */
    public final void mo56978b() {
        if (this.f57069a && this.f57070b) {
            this.f57071c.stop();
        }
        this.f57069a = false;
    }

    /* renamed from: a */
    public final void mo56977a() {
        if (this.f57070b) {
            this.f57071c.start();
        }
        this.f57069a = true;
    }
}
