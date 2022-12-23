package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.WindowManager;
import ce0.C21100e;
import com.google.android.exoplayer2.video.spherical.C4082a;
import com.google.android.exoplayer2.video.spherical.C4084b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p054d0.C4280f0;
import p277ub.C6774a0;
import p277ub.C6811x;
import p290vb.C6941g;
import p303wb.C7012a;
import p303wb.C7014c;
import p303wb.C7015d;
import p303wb.C7019f;
import p303wb.C7022h;
import p304x.C7073m;
import p988j$.util.Spliterator;

public final class SphericalGLSurfaceView extends GLSurfaceView {

    /* renamed from: b */
    public final CopyOnWriteArrayList<C4081b> f14643b;

    /* renamed from: c */
    public final SensorManager f14644c;

    /* renamed from: d */
    public final Sensor f14645d;

    /* renamed from: e */
    public final C4082a f14646e;

    /* renamed from: f */
    public final Handler f14647f;

    /* renamed from: g */
    public final C7022h f14648g;

    /* renamed from: h */
    public SurfaceTexture f14649h;

    /* renamed from: i */
    public Surface f14650i;

    /* renamed from: j */
    public boolean f14651j;

    /* renamed from: k */
    public boolean f14652k;

    /* renamed from: l */
    public boolean f14653l;

    /* renamed from: com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView$a */
    public final class C4080a implements GLSurfaceView.Renderer, C4084b.C4085a, C4082a.C4083a {

        /* renamed from: b */
        public final C7022h f14654b;

        /* renamed from: c */
        public final float[] f14655c = new float[16];

        /* renamed from: d */
        public final float[] f14656d = new float[16];

        /* renamed from: e */
        public final float[] f14657e;

        /* renamed from: f */
        public final float[] f14658f;

        /* renamed from: g */
        public final float[] f14659g;

        /* renamed from: h */
        public float f14660h;

        /* renamed from: i */
        public float f14661i;

        /* renamed from: j */
        public final float[] f14662j;

        /* renamed from: k */
        public final float[] f14663k;

        public C4080a(C7022h hVar) {
            float[] fArr = new float[16];
            this.f14657e = fArr;
            float[] fArr2 = new float[16];
            this.f14658f = fArr2;
            float[] fArr3 = new float[16];
            this.f14659g = fArr3;
            this.f14662j = new float[16];
            this.f14663k = new float[16];
            this.f14654b = hVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f14661i = 3.1415927f;
        }

        /* renamed from: a */
        public final synchronized void mo16737a(float[] fArr, float f) {
            float[] fArr2 = this.f14657e;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f2 = -f;
            this.f14661i = f2;
            Matrix.setRotateM(this.f14658f, 0, -this.f14660h, (float) Math.cos((double) f2), (float) Math.sin((double) this.f14661i), BitmapDescriptorFactory.HUE_RED);
        }

        /* JADX INFO: finally extract failed */
        public final void onDrawFrame(GL10 gl10) {
            float[] fArr;
            Object f;
            Object f2;
            Object f3;
            float[] fArr2;
            synchronized (this) {
                Matrix.multiplyMM(this.f14663k, 0, this.f14657e, 0, this.f14659g, 0);
                Matrix.multiplyMM(this.f14662j, 0, this.f14658f, 0, this.f14663k, 0);
            }
            Matrix.multiplyMM(this.f14656d, 0, this.f14655c, 0, this.f14662j, 0);
            C7022h hVar = this.f14654b;
            float[] fArr3 = this.f14656d;
            hVar.getClass();
            GLES20.glClear(Spliterator.SUBSIZED);
            C21100e.m49353n();
            if (hVar.f21855b.compareAndSet(true, false)) {
                SurfaceTexture surfaceTexture = hVar.f21864k;
                surfaceTexture.getClass();
                surfaceTexture.updateTexImage();
                C21100e.m49353n();
                if (hVar.f21856c.compareAndSet(true, false)) {
                    Matrix.setIdentityM(hVar.f21861h, 0);
                }
                long timestamp = hVar.f21864k.getTimestamp();
                C6811x xVar = hVar.f21859f;
                synchronized (xVar) {
                    try {
                        f = xVar.mo23029f(timestamp, false);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Long l = (Long) f;
                if (l != null) {
                    C7014c cVar = hVar.f21858e;
                    float[] fArr4 = hVar.f21861h;
                    long longValue = l.longValue();
                    C6811x xVar2 = cVar.f21826c;
                    synchronized (xVar2) {
                        try {
                            f3 = xVar2.mo23029f(longValue, true);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    float[] fArr5 = (float[]) f3;
                    if (fArr5 != null) {
                        float[] fArr6 = cVar.f21825b;
                        float f4 = fArr5[0];
                        float f5 = -fArr5[1];
                        float f6 = -fArr5[2];
                        float length = Matrix.length(f4, f5, f6);
                        if (length != BitmapDescriptorFactory.HUE_RED) {
                            fArr2 = fArr4;
                            Matrix.setRotateM(fArr6, 0, (float) Math.toDegrees((double) length), f4 / length, f5 / length, f6 / length);
                        } else {
                            fArr2 = fArr4;
                            Matrix.setIdentityM(fArr6, 0);
                        }
                        if (!cVar.f21827d) {
                            C7014c.m16510a(cVar.f21824a, cVar.f21825b);
                            cVar.f21827d = true;
                        }
                        Matrix.multiplyMM(fArr2, 0, cVar.f21824a, 0, cVar.f21825b, 0);
                    }
                }
                C6811x xVar3 = hVar.f21860g;
                synchronized (xVar3) {
                    try {
                        f2 = xVar3.mo23029f(timestamp, true);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                C7015d dVar = (C7015d) f2;
                if (dVar != null) {
                    C7019f fVar = hVar.f21857d;
                    fVar.getClass();
                    if (C7019f.m16512a(dVar)) {
                        fVar.f21842a = dVar.f21830c;
                        fVar.f21843b = new C7019f.C7020a(dVar.f21828a.f21832a[0]);
                        if (!dVar.f21831d) {
                            C7015d.C7017b bVar = dVar.f21829b.f21832a[0];
                            float[] fArr7 = bVar.f21835c;
                            int length2 = fArr7.length / 3;
                            C21100e.m49310H(fArr7);
                            C21100e.m49310H(bVar.f21836d);
                            int i = bVar.f21834b;
                        }
                    }
                }
            }
            Matrix.multiplyMM(hVar.f21862i, 0, fArr3, 0, hVar.f21861h, 0);
            C7019f fVar2 = hVar.f21857d;
            int i2 = hVar.f21863j;
            float[] fArr8 = hVar.f21862i;
            C7019f.C7020a aVar = fVar2.f21843b;
            if (aVar != null) {
                GLES20.glUseProgram(fVar2.f21844c);
                C21100e.m49353n();
                GLES20.glEnableVertexAttribArray(fVar2.f21847f);
                GLES20.glEnableVertexAttribArray(fVar2.f21848g);
                C21100e.m49353n();
                int i3 = fVar2.f21842a;
                if (i3 == 1) {
                    fArr = C7019f.f21840l;
                } else if (i3 == 2) {
                    fArr = C7019f.f21841m;
                } else {
                    fArr = C7019f.f21839k;
                }
                GLES20.glUniformMatrix3fv(fVar2.f21846e, 1, false, fArr, 0);
                GLES20.glUniformMatrix4fv(fVar2.f21845d, 1, false, fArr8, 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, i2);
                GLES20.glUniform1i(fVar2.f21849h, 0);
                C21100e.m49353n();
                GLES20.glVertexAttribPointer(fVar2.f21847f, 3, 5126, false, 12, aVar.f21851b);
                C21100e.m49353n();
                GLES20.glVertexAttribPointer(fVar2.f21848g, 2, 5126, false, 8, aVar.f21852c);
                C21100e.m49353n();
                GLES20.glDrawArrays(aVar.f21853d, 0, aVar.f21850a);
                C21100e.m49353n();
                GLES20.glDisableVertexAttribArray(fVar2.f21847f);
                GLES20.glDisableVertexAttribArray(fVar2.f21848g);
            }
        }

        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            float f;
            boolean z = false;
            GLES20.glViewport(0, 0, i, i2);
            float f2 = ((float) i) / ((float) i2);
            if (f2 > 1.0f) {
                z = true;
            }
            if (z) {
                f = (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f2))) * 2.0d);
            } else {
                f = 90.0f;
            }
            Matrix.perspectiveM(this.f14655c, 0, f, f2, 0.1f, 100.0f);
        }

        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView sphericalGLSurfaceView = SphericalGLSurfaceView.this;
            sphericalGLSurfaceView.f14647f.post(new C4280f0(4, sphericalGLSurfaceView, this.f14654b.mo23263d()));
        }
    }

    /* renamed from: com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView$b */
    public interface C4081b {
        /* renamed from: c */
        void mo16741c(Surface surface);

        /* renamed from: n */
        void mo16742n();
    }

    public SphericalGLSurfaceView() {
        throw null;
    }

    public SphericalGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14643b = new CopyOnWriteArrayList<>();
        this.f14647f = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f14644c = sensorManager;
        Sensor defaultSensor = C6774a0.f20959a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f14645d = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        C7022h hVar = new C7022h();
        this.f14648g = hVar;
        C4080a aVar = new C4080a(hVar);
        C4084b bVar = new C4084b(context, aVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f14646e = new C4082a(windowManager.getDefaultDisplay(), bVar, aVar);
        this.f14651j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(bVar);
    }

    /* renamed from: a */
    public final void mo16728a() {
        boolean z;
        if (!this.f14651j || !this.f14652k) {
            z = false;
        } else {
            z = true;
        }
        Sensor sensor = this.f14645d;
        if (sensor != null && z != this.f14653l) {
            if (z) {
                this.f14644c.registerListener(this.f14646e, sensor, 0);
            } else {
                this.f14644c.unregisterListener(this.f14646e);
            }
            this.f14653l = z;
        }
    }

    public C7012a getCameraMotionListener() {
        return this.f14648g;
    }

    public C6941g getVideoFrameMetadataListener() {
        return this.f14648g;
    }

    public Surface getVideoSurface() {
        return this.f14650i;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14647f.post(new C7073m(this, 6));
    }

    public final void onPause() {
        this.f14652k = false;
        mo16728a();
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.f14652k = true;
        mo16728a();
    }

    public void setDefaultStereoMode(int i) {
        this.f14648g.f21865l = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.f14651j = z;
        mo16728a();
    }
}
