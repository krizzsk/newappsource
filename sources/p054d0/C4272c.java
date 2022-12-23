package p054d0;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.C0544a;
import androidx.camera.core.C0627p;
import java.util.concurrent.Executor;
import p066e0.C4462z;
import p078f0.C4642h;

/* renamed from: d0.c */
public class C4272c implements C4462z {

    /* renamed from: a */
    public final ImageReader f15186a;

    /* renamed from: b */
    public final Object f15187b = new Object();

    public C4272c(ImageReader imageReader) {
        this.f15186a = imageReader;
    }

    /* renamed from: a */
    public final void mo2556a(C4462z.C4463a aVar, Executor executor) {
        synchronized (this.f15187b) {
            this.f15186a.setOnImageAvailableListener(new C4266a(this, executor, aVar), C4642h.m11958a());
        }
    }

    public C0627p acquireLatestImage() {
        Image image;
        synchronized (this.f15187b) {
            try {
                image = this.f15186a.acquireLatestImage();
            } catch (RuntimeException e) {
                if ("ImageReaderContext is not initialized".equals(e.getMessage())) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            C0544a aVar = new C0544a(image);
            return aVar;
        }
    }

    public C0627p acquireNextImage() {
        Image image;
        synchronized (this.f15187b) {
            try {
                image = this.f15186a.acquireNextImage();
            } catch (RuntimeException e) {
                if ("ImageReaderContext is not initialized".equals(e.getMessage())) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            C0544a aVar = new C0544a(image);
            return aVar;
        }
    }

    public final void clearOnImageAvailableListener() {
        synchronized (this.f15187b) {
            this.f15186a.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
        }
    }

    public final void close() {
        synchronized (this.f15187b) {
            this.f15186a.close();
        }
    }

    public final int getHeight() {
        int height;
        synchronized (this.f15187b) {
            height = this.f15186a.getHeight();
        }
        return height;
    }

    public final int getImageFormat() {
        int imageFormat;
        synchronized (this.f15187b) {
            imageFormat = this.f15186a.getImageFormat();
        }
        return imageFormat;
    }

    public final int getMaxImages() {
        int maxImages;
        synchronized (this.f15187b) {
            maxImages = this.f15186a.getMaxImages();
        }
        return maxImages;
    }

    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f15187b) {
            surface = this.f15186a.getSurface();
        }
        return surface;
    }

    public final int getWidth() {
        int width;
        synchronized (this.f15187b) {
            width = this.f15186a.getWidth();
        }
        return width;
    }
}
