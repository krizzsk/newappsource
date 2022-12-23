package androidx.camera.core;

import android.graphics.Matrix;
import android.media.Image;
import androidx.camera.core.C0627p;
import java.nio.ByteBuffer;
import p054d0.C4277e;
import p054d0.C4282g0;
import p066e0.C4450p0;

/* renamed from: androidx.camera.core.a */
public final class C0544a implements C0627p {

    /* renamed from: b */
    public final Image f1882b;

    /* renamed from: c */
    public final C0545a[] f1883c;

    /* renamed from: d */
    public final C4277e f1884d;

    /* renamed from: androidx.camera.core.a$a */
    public static final class C0545a implements C0627p.C0628a {

        /* renamed from: a */
        public final Image.Plane f1885a;

        public C0545a(Image.Plane plane) {
            this.f1885a = plane;
        }

        /* renamed from: a */
        public final synchronized ByteBuffer mo2406a() {
            return this.f1885a.getBuffer();
        }

        /* renamed from: b */
        public final synchronized int mo2407b() {
            return this.f1885a.getPixelStride();
        }

        /* renamed from: c */
        public final synchronized int mo2408c() {
            return this.f1885a.getRowStride();
        }
    }

    public C0544a(Image image) {
        this.f1882b = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f1883c = new C0545a[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.f1883c[i] = new C0545a(planes[i]);
            }
        } else {
            this.f1883c = new C0545a[0];
        }
        this.f1884d = new C4277e(C4450p0.f15508b, image.getTimestamp(), 0, new Matrix());
    }

    public final synchronized void close() {
        this.f1882b.close();
    }

    public final synchronized int getFormat() {
        return this.f1882b.getFormat();
    }

    public final synchronized int getHeight() {
        return this.f1882b.getHeight();
    }

    public final synchronized Image getImage() {
        return this.f1882b;
    }

    public final C4282g0 getImageInfo() {
        return this.f1884d;
    }

    public final synchronized C0627p.C0628a[] getPlanes() {
        return this.f1883c;
    }

    public final synchronized int getWidth() {
        return this.f1882b.getWidth();
    }
}
