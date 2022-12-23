package p930xz;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.Display;
import ce0.C21100e;
import com.moovit.commons.utils.ApplicationBugException;
import p717oz.C18861a;

/* renamed from: xz.b */
public final class C20678b extends C18861a<C20677a, C20680c> implements C20681d {

    /* renamed from: f */
    public final SensorManager f52240f;

    /* renamed from: g */
    public final Sensor f52241g;

    /* renamed from: h */
    public final int f52242h;

    /* renamed from: i */
    public final float[] f52243i = new float[9];

    /* renamed from: j */
    public final float[] f52244j = new float[9];

    /* renamed from: k */
    public final float[] f52245k = new float[3];

    /* renamed from: l */
    public final float[] f52246l = new float[3];

    /* renamed from: m */
    public final C20679a f52247m = new C20679a();

    /* renamed from: n */
    public final C20677a f52248n = new C20677a();

    /* renamed from: o */
    public Display f52249o;

    /* renamed from: xz.b$a */
    public class C20679a implements SensorEventListener {
        public C20679a() {
        }

        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        public final void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr;
            int i;
            int i2;
            C20678b bVar = C20678b.this;
            bVar.getClass();
            if (sensorEvent.sensor.getType() == 11) {
                int i3 = 0;
                while (true) {
                    fArr = bVar.f52246l;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    fArr[i3] = sensorEvent.values[i3];
                    i3++;
                }
                C20677a aVar = bVar.f52248n;
                SensorManager.getRotationMatrixFromVector(bVar.f52243i, fArr);
                float[] fArr2 = bVar.f52243i;
                float[] fArr3 = bVar.f52244j;
                Display display = bVar.f52249o;
                if (display != null) {
                    i = display.getRotation();
                } else {
                    i = 0;
                }
                int i4 = 130;
                if (i == 0) {
                    i2 = 2;
                    i4 = 1;
                } else if (i == 1) {
                    i2 = 129;
                    i4 = 2;
                } else if (i == 2) {
                    i2 = 130;
                    i4 = 129;
                } else if (i == 3) {
                    i2 = 1;
                } else {
                    throw new IllegalStateException(C16759e.m42349e("Unexpected screen rotation: ", i));
                }
                if (SensorManager.remapCoordinateSystem(fArr2, i4, i2, fArr3)) {
                    SensorManager.remapCoordinateSystem(bVar.f52244j, 2, 129, bVar.f52243i);
                    SensorManager.getOrientation(bVar.f52243i, bVar.f52245k);
                    float[] fArr4 = bVar.f52245k;
                    aVar.f52237a = (float) ((((double) fArr4[0]) - 1.5707963267948966d) % 6.283185307179586d);
                    aVar.f52238b = -fArr4[2];
                    aVar.f52239c = fArr4[1];
                    bVar.mo51338f(aVar);
                    return;
                }
                throw new ApplicationBugException("Unable to remap coordinate system");
            }
            StringBuilder k = C13555b.m33972k("Received sensor event for an unknown sensor: ");
            k.append(sensorEvent.sensor);
            throw new IllegalStateException(k.toString());
        }
    }

    public C20678b(Context context) {
        C21100e.m49359q(3, "updateRate");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f52240f = sensorManager;
        this.f52241g = sensorManager.getDefaultSensor(11);
        this.f52242h = 3;
    }

    /* renamed from: c */
    public final void mo51337c(Object obj, Object obj2) {
        ((C20680c) obj).mo51073a((C20677a) obj2);
    }

    /* renamed from: d */
    public final void mo50011d() {
        Sensor sensor = this.f52241g;
        if (sensor != null) {
            this.f52240f.registerListener(this.f52247m, sensor, this.f52242h);
        }
    }

    /* renamed from: e */
    public final void mo50012e() {
        if (this.f52241g != null) {
            this.f52240f.unregisterListener(this.f52247m);
        }
    }
}
