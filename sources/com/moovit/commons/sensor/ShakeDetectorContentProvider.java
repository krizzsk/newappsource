package com.moovit.commons.sensor;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.moovit.commons.utils.contentprovider.AbstractContentProvider;

public abstract class ShakeDetectorContentProvider extends AbstractContentProvider {
    public final boolean onCreate() {
        SensorManager sensorManager;
        Sensor defaultSensor;
        Context context = getContext();
        if (!(context == null || (sensorManager = (SensorManager) context.getSystemService("sensor")) == null || (defaultSensor = sensorManager.getDefaultSensor(1)) == null)) {
            HandlerThread handlerThread = new HandlerThread((String) null);
            handlerThread.start();
            sensorManager.registerListener((SensorEventListener) null, defaultSensor, 0, new Handler(handlerThread.getLooper()));
        }
        return true;
    }
}
