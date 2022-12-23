package com.moovit.commons.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import androidx.lifecycle.C1025n;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.Lifecycle;
import ce0.C21100e;
import com.usebutton.sdk.internal.api.AppActionRequest;
import i00.C17535k;
import i00.C17536l;

public class TextureVideoHelper implements TextureView.SurfaceTextureListener, C1025n, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: b */
    public final Context f41158b;

    /* renamed from: c */
    public final Uri f41159c;

    /* renamed from: d */
    public final boolean f41160d;

    /* renamed from: e */
    public MediaPlayer f41161e;

    /* renamed from: f */
    public boolean f41162f = false;

    /* renamed from: g */
    public boolean f41163g = false;

    /* renamed from: com.moovit.commons.view.TextureVideoHelper$a */
    public static /* synthetic */ class C15803a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41164a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.lifecycle.Lifecycle$Event[] r0 = androidx.lifecycle.Lifecycle.Event.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f41164a = r0
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f41164a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.commons.view.TextureVideoHelper.C15803a.<clinit>():void");
        }
    }

    public TextureVideoHelper(Context context, Uri uri, boolean z) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f41158b = context;
        C21100e.m49373x(uri, "videoUri");
        this.f41159c = uri;
        this.f41160d = z;
    }

    /* renamed from: a */
    public final void mo47172a() {
        if (!this.f41163g) {
            this.f41163g = true;
            mo47173c();
        }
    }

    /* renamed from: c */
    public final void mo47173c() {
        MediaPlayer mediaPlayer = this.f41161e;
        if (mediaPlayer != null && this.f41162f) {
            if (this.f41163g) {
                mediaPlayer.start();
            } else if (mediaPlayer.isPlaying()) {
                this.f41161e.pause();
            }
        }
    }

    /* renamed from: f */
    public final void mo740f(C1033p pVar, Lifecycle.Event event) {
        int i = C15803a.f41164a[event.ordinal()];
        if (i == 1) {
            mo47172a();
        } else if (i == 2 && this.f41163g) {
            this.f41163g = false;
            mo47173c();
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        MediaPlayer mediaPlayer;
        Context context = this.f41158b;
        Uri uri = this.f41159c;
        try {
            mediaPlayer = new MediaPlayer();
            mediaPlayer.setOnErrorListener(new C17535k());
            mediaPlayer.setScreenOnWhilePlaying(true);
            mediaPlayer.setLooping(this.f41160d);
            mediaPlayer.setDataSource(context, uri);
            mediaPlayer.setSurface(new Surface(surfaceTexture));
            mediaPlayer.setOnVideoSizeChangedListener(this);
            mediaPlayer.setOnPreparedListener(new C17536l(this));
            mediaPlayer.prepareAsync();
        } catch (Throwable unused) {
            mediaPlayer = null;
        }
        this.f41161e = mediaPlayer;
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        MediaPlayer mediaPlayer = this.f41161e;
        this.f41161e = null;
        if (mediaPlayer == null) {
            return false;
        }
        mediaPlayer.stop();
        mediaPlayer.release();
        return false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
    }
}
