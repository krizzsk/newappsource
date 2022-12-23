package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.SurfaceRequest;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p054d0.C4289j0;
import p176n0.C5789h;
import p695od.C18728c;

/* renamed from: androidx.camera.view.c */
public abstract class C0658c {

    /* renamed from: a */
    public Size f2265a;

    /* renamed from: b */
    public FrameLayout f2266b;

    /* renamed from: c */
    public final C0656b f2267c;

    /* renamed from: d */
    public boolean f2268d = false;

    /* renamed from: androidx.camera.view.c$a */
    public interface C0659a {
    }

    public C0658c(PreviewView previewView, C0656b bVar) {
        this.f2266b = previewView;
        this.f2267c = bVar;
    }

    /* renamed from: a */
    public abstract View mo2642a();

    /* renamed from: b */
    public abstract Bitmap mo2643b();

    /* renamed from: c */
    public abstract void mo2644c();

    /* renamed from: d */
    public abstract void mo2645d();

    /* renamed from: e */
    public abstract void mo2646e(SurfaceRequest surfaceRequest, C5789h hVar);

    /* renamed from: f */
    public final void mo2647f() {
        View a = mo2642a();
        if (a != null && this.f2268d) {
            C0656b bVar = this.f2267c;
            Size size = new Size(this.f2266b.getWidth(), this.f2266b.getHeight());
            int layoutDirection = this.f2266b.getLayoutDirection();
            bVar.getClass();
            if (size.getHeight() == 0 || size.getWidth() == 0) {
                size.toString();
                C4289j0.m11435b("PreviewTransform");
            } else if (bVar.mo2641f()) {
                if (a instanceof TextureView) {
                    ((TextureView) a).setTransform(bVar.mo2639d());
                } else {
                    Display display = a.getDisplay();
                    if (!(display == null || display.getRotation() == bVar.f2261d)) {
                        C4289j0.m11435b("PreviewTransform");
                    }
                }
                RectF e = bVar.mo2640e(size, layoutDirection);
                a.setPivotX(BitmapDescriptorFactory.HUE_RED);
                a.setPivotY(BitmapDescriptorFactory.HUE_RED);
                a.setScaleX(e.width() / ((float) bVar.f2258a.getWidth()));
                a.setScaleY(e.height() / ((float) bVar.f2258a.getHeight()));
                a.setTranslationX(e.left - ((float) a.getLeft()));
                a.setTranslationY(e.top - ((float) a.getTop()));
            }
        }
    }

    /* renamed from: g */
    public abstract C18728c<Void> mo2648g();
}
