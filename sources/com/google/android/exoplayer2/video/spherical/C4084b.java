package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.exoplayer2.video.spherical.C4082a;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.google.android.exoplayer2.video.spherical.b */
public final class C4084b extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, C4082a.C4083a {

    /* renamed from: b */
    public final PointF f14672b = new PointF();

    /* renamed from: c */
    public final PointF f14673c = new PointF();

    /* renamed from: d */
    public final C4085a f14674d;

    /* renamed from: e */
    public final float f14675e;

    /* renamed from: f */
    public final GestureDetector f14676f;

    /* renamed from: g */
    public volatile float f14677g;

    /* renamed from: com.google.android.exoplayer2.video.spherical.b$a */
    public interface C4085a {
    }

    public C4084b(Context context, SphericalGLSurfaceView.C4080a aVar) {
        this.f14674d = aVar;
        this.f14675e = 25.0f;
        this.f14676f = new GestureDetector(context, this);
        this.f14677g = 3.1415927f;
    }

    /* renamed from: a */
    public final void mo16737a(float[] fArr, float f) {
        this.f14677g = -f;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.f14672b.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f14672b.x) / this.f14675e;
        float y = motionEvent2.getY();
        PointF pointF = this.f14672b;
        float f3 = (y - pointF.y) / this.f14675e;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = (double) this.f14677g;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        PointF pointF2 = this.f14673c;
        pointF2.x -= (cos * x) - (sin * f3);
        float f4 = (cos * f3) + (sin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        C4085a aVar = this.f14674d;
        PointF pointF3 = this.f14673c;
        SphericalGLSurfaceView.C4080a aVar2 = (SphericalGLSurfaceView.C4080a) aVar;
        synchronized (aVar2) {
            float f5 = pointF3.y;
            aVar2.f14660h = f5;
            Matrix.setRotateM(aVar2.f14658f, 0, -f5, (float) Math.cos((double) aVar2.f14661i), (float) Math.sin((double) aVar2.f14661i), BitmapDescriptorFactory.HUE_RED);
            Matrix.setRotateM(aVar2.f14659g, 0, -pointF3.x, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED);
        }
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return SphericalGLSurfaceView.this.performClick();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f14676f.onTouchEvent(motionEvent);
    }
}
