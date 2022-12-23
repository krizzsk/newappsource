package p074e8;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import mf0.C24362h;
import p262t8.C6606a;
import p304x.C7065j0;

/* renamed from: e8.g */
public final class C4612g implements SensorEventListener {

    /* renamed from: a */
    public C4613a f15835a;

    /* renamed from: e8.g$a */
    public interface C4613a {
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
        if (!C6606a.m15601b(this)) {
            try {
                C24362h.m61211f(sensor, "sensor");
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (!C6606a.m15601b(this)) {
            try {
                C24362h.m61211f(sensorEvent, "event");
                C4613a aVar = this.f15835a;
                if (aVar != null) {
                    float[] fArr = sensorEvent.values;
                    float f = fArr[0];
                    double d = (double) (f / 9.80665f);
                    double d2 = (double) (fArr[1] / 9.80665f);
                    double d3 = (double) (fArr[2] / 9.80665f);
                    if (Math.sqrt((d3 * d3) + (d2 * d2) + (d * d)) > 2.3d) {
                        ((C7065j0) aVar).mo23308a();
                    }
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }
}
