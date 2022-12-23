package androidx.camera.core;

import android.view.Surface;
import java.util.concurrent.Executor;
import p054d0.C4306r0;
import p054d0.C4308s0;
import p054d0.C4315v0;
import p066e0.C4462z;

/* renamed from: androidx.camera.core.t */
public final class C0642t implements C4462z {

    /* renamed from: a */
    public final Object f2204a = new Object();

    /* renamed from: b */
    public int f2205b = 0;

    /* renamed from: c */
    public boolean f2206c = false;

    /* renamed from: d */
    public final C4462z f2207d;

    /* renamed from: e */
    public final Surface f2208e;

    /* renamed from: f */
    public final C4306r0 f2209f = new C4306r0(this);

    public C0642t(C4462z zVar) {
        this.f2207d = zVar;
        this.f2208e = zVar.getSurface();
    }

    /* renamed from: a */
    public final void mo2556a(C4462z.C4463a aVar, Executor executor) {
        synchronized (this.f2204a) {
            this.f2207d.mo2556a(new C4308s0(this, aVar), executor);
        }
    }

    public final C0627p acquireLatestImage() {
        C4315v0 v0Var;
        synchronized (this.f2204a) {
            C0627p acquireLatestImage = this.f2207d.acquireLatestImage();
            if (acquireLatestImage != null) {
                this.f2205b++;
                v0Var = new C4315v0(acquireLatestImage);
                v0Var.mo2436a(this.f2209f);
            } else {
                v0Var = null;
            }
        }
        return v0Var;
    }

    public final C0627p acquireNextImage() {
        C4315v0 v0Var;
        synchronized (this.f2204a) {
            C0627p acquireNextImage = this.f2207d.acquireNextImage();
            if (acquireNextImage != null) {
                this.f2205b++;
                v0Var = new C4315v0(acquireNextImage);
                v0Var.mo2436a(this.f2209f);
            } else {
                v0Var = null;
            }
        }
        return v0Var;
    }

    /* renamed from: b */
    public final void mo2580b() {
        synchronized (this.f2204a) {
            this.f2206c = true;
            this.f2207d.clearOnImageAvailableListener();
            if (this.f2205b == 0) {
                close();
            }
        }
    }

    public final void clearOnImageAvailableListener() {
        synchronized (this.f2204a) {
            this.f2207d.clearOnImageAvailableListener();
        }
    }

    public final void close() {
        synchronized (this.f2204a) {
            Surface surface = this.f2208e;
            if (surface != null) {
                surface.release();
            }
            this.f2207d.close();
        }
    }

    public final int getHeight() {
        int height;
        synchronized (this.f2204a) {
            height = this.f2207d.getHeight();
        }
        return height;
    }

    public final int getImageFormat() {
        int imageFormat;
        synchronized (this.f2204a) {
            imageFormat = this.f2207d.getImageFormat();
        }
        return imageFormat;
    }

    public final int getMaxImages() {
        int maxImages;
        synchronized (this.f2204a) {
            maxImages = this.f2207d.getMaxImages();
        }
        return maxImages;
    }

    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f2204a) {
            surface = this.f2207d.getSurface();
        }
        return surface;
    }

    public final int getWidth() {
        int width;
        synchronized (this.f2204a) {
            width = this.f2207d.getWidth();
        }
        return width;
    }
}
