package com.moovit.commons.sensor;

import android.content.Intent;
import android.hardware.SensorManager;
import android.os.IBinder;
import ce0.C21100e;
import com.moovit.commons.utils.service.LooperService;
import p953yz.C20794a;

public abstract class ShakeDetectorService extends LooperService {

    /* renamed from: f */
    public final C15753a f40993f = new C15753a();

    /* renamed from: g */
    public final int f40994g;

    /* renamed from: com.moovit.commons.sensor.ShakeDetectorService$a */
    public class C15753a extends C20794a {
        public C15753a() {
        }
    }

    public ShakeDetectorService() {
        super("ShakeDetector");
        Integer num = 2;
        C21100e.m49373x(num, "sensorDelay");
        this.f40994g = num.intValue();
        this.f41044e = 1;
    }

    /* renamed from: d */
    public final void mo19675d(int i, Intent intent) {
    }

    /* renamed from: i */
    public abstract void mo46943i();

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        SensorManager sensorManager = (SensorManager) getSystemService("sensor");
        sensorManager.registerListener(this.f40993f, sensorManager.getDefaultSensor(1), this.f40994g, this.f41042c);
    }

    public final void onDestroy() {
        super.onDestroy();
        ((SensorManager) getSystemService("sensor")).unregisterListener(this.f40993f);
    }
}
