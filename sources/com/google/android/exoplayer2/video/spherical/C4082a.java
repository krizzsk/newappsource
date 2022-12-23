package com.google.android.exoplayer2.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p303wb.C7014c;

/* renamed from: com.google.android.exoplayer2.video.spherical.a */
public final class C4082a implements SensorEventListener {

    /* renamed from: a */
    public final float[] f14665a = new float[16];

    /* renamed from: b */
    public final float[] f14666b = new float[16];

    /* renamed from: c */
    public final float[] f14667c = new float[16];

    /* renamed from: d */
    public final float[] f14668d = new float[3];

    /* renamed from: e */
    public final Display f14669e;

    /* renamed from: f */
    public final C4083a[] f14670f;

    /* renamed from: g */
    public boolean f14671g;

    /* renamed from: com.google.android.exoplayer2.video.spherical.a$a */
    public interface C4083a {
        /* renamed from: a */
        void mo16737a(float[] fArr, float f);
    }

    public C4082a(Display display, C4083a... aVarArr) {
        this.f14669e = display;
        this.f14670f = aVarArr;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f14665a, sensorEvent.values);
        float[] fArr = this.f14665a;
        int rotation = this.f14669e.getRotation();
        if (rotation != 0) {
            int i = 129;
            int i2 = 130;
            if (rotation == 1) {
                i = 2;
                i2 = 129;
            } else if (rotation != 2) {
                if (rotation == 3) {
                    i = 130;
                    i2 = 1;
                } else {
                    throw new IllegalStateException();
                }
            }
            float[] fArr2 = this.f14666b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f14666b, i, i2, fArr);
        }
        SensorManager.remapCoordinateSystem(this.f14665a, 1, 131, this.f14666b);
        SensorManager.getOrientation(this.f14666b, this.f14668d);
        float f = this.f14668d[2];
        Matrix.rotateM(this.f14665a, 0, 90.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        float[] fArr3 = this.f14665a;
        if (!this.f14671g) {
            C7014c.m16510a(this.f14667c, fArr3);
            this.f14671g = true;
        }
        float[] fArr4 = this.f14666b;
        System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
        Matrix.multiplyMM(fArr3, 0, this.f14666b, 0, this.f14667c, 0);
        float[] fArr5 = this.f14665a;
        for (C4083a a : this.f14670f) {
            a.mo16737a(fArr5, f);
        }
    }
}
