package p953yz;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import com.moovit.commons.sensor.ShakeDetectorService;

/* renamed from: yz.a */
public abstract class C20794a implements SensorEventListener {

    /* renamed from: a */
    public long f52482a;

    /* renamed from: b */
    public int f52483b = 0;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f = fArr[0] / 9.80665f;
        float f2 = fArr[1] / 9.80665f;
        float f3 = fArr[2] / 9.80665f;
        if (((float) Math.sqrt((double) ((f3 * f3) + (f2 * f2) + (f * f)))) > 2.7f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.f52482a;
            if (300 + j <= elapsedRealtime) {
                if (j + 1500 < elapsedRealtime) {
                    this.f52483b = 0;
                }
                this.f52482a = elapsedRealtime;
                this.f52483b++;
                ShakeDetectorService.this.mo46943i();
            }
        }
    }
}
