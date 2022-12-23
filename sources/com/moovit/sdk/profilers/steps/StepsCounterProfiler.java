package com.moovit.sdk.profilers.steps;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.SystemClock;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.sdk.datacollection.sensors.AndroidGenericSensorValue;
import com.moovit.sdk.profilers.ProfilerLog;
import com.moovit.sdk.profilers.ProfilerType;
import com.moovit.sdk.profilers.schedule.ScheduleBasedProfiler;
import com.moovit.sdk.profilers.steps.config.StepsCounterConfig;
import com.moovit.sdk.utils.SafeBroadcastReceiver;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p977zz.C20943i;

@TargetApi(19)
public final class StepsCounterProfiler extends ScheduleBasedProfiler<StepsCounterConfig> implements SensorEventListener {

    /* renamed from: o */
    public static final String f43048o = C13555b.m33969h(StepsCounterProfiler.class, new StringBuilder(), ".start");

    /* renamed from: p */
    public static final String f43049p = C13555b.m33969h(StepsCounterProfiler.class, new StringBuilder(), ".stop");

    /* renamed from: q */
    public static volatile StepsCounterProfiler f43050q;

    public static class StartStopReceiver extends SafeBroadcastReceiver {
        /* renamed from: a */
        public final void mo23871a(Context context, Intent intent) {
            StepsCounterProfiler y = StepsCounterProfiler.m41939y(context);
            String action = intent.getAction();
            if (StepsCounterProfiler.f43048o.equals(action)) {
                y.mo50945q(intent, true);
            } else if (StepsCounterProfiler.f43049p.equals(action)) {
                y.mo50945q(intent, false);
            } else {
                throw new IllegalArgumentException(C25541a.m63881k("Unrecognized action: ", action));
            }
        }
    }

    public StepsCounterProfiler(Context context) {
        super(context, "steps_counter", ProfilerType.STEPS_COUNTER, StepsCounterConfig.f43052h, StepsCounterConfig.f43051g);
    }

    /* renamed from: y */
    public static StepsCounterProfiler m41939y(Context context) {
        if (f43050q == null) {
            synchronized (StepsCounterProfiler.class) {
                if (f43050q == null) {
                    f43050q = new StepsCounterProfiler(context.getApplicationContext());
                }
            }
        }
        return f43050q;
    }

    /* renamed from: d */
    public final String mo49251d() {
        return "steps_counter_profiler_config_file_name";
    }

    /* renamed from: f */
    public final String mo49252f() {
        return "steps_counter.dat";
    }

    /* renamed from: i */
    public final Intent mo49254i() {
        return new Intent(f43049p, (Uri) null, this.f47186a, StartStopReceiver.class);
    }

    /* renamed from: k */
    public final String mo49277k() {
        SensorManager sensorManager;
        if (!C20943i.m49051d(19)) {
            return "Unsupported api version";
        }
        boolean z = false;
        if (!(!this.f47186a.getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter") || (sensorManager = (SensorManager) this.f47186a.getSystemService("sensor")) == null || sensorManager.getDefaultSensor(19) == null)) {
            z = true;
        }
        if (!z) {
            return "Step counter sensor is not supported";
        }
        return null;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        String str;
        ProfilerLog c = ProfilerLog.m41879c(this.f47186a);
        StringBuilder k = C13555b.m33972k("Step sensor event was identified with value: ");
        k.append(sensorEvent.values[0]);
        c.mo49244b("StepsCounterProfiler", k.toString());
        float f = sensorEvent.values[0];
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        AndroidGenericSensorValue androidGenericSensorValue = new AndroidGenericSensorValue(sensorEvent.sensor.getType(), (sensorEvent.timestamp / 1000000) + currentTimeMillis, sensorEvent.values);
        String str2 = "";
        for (int i = 0; i < androidGenericSensorValue.f42984d.length; i++) {
            StringBuilder k2 = C13555b.m33972k(str2);
            k2.append(androidGenericSensorValue.f42984d[i]);
            if (i == androidGenericSensorValue.f42984d.length - 1) {
                str = "";
            } else {
                str = AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR;
            }
            k2.append(str);
            str2 = k2.toString();
        }
        String format = String.format((Locale) null, "%s,%s,%s", new Object[]{String.valueOf(System.currentTimeMillis()), String.valueOf(androidGenericSensorValue.f42983c), str2});
        mo50949u("steps_counter.dat", this.f47188c, format);
    }

    /* renamed from: r */
    public final boolean mo49257r(Intent intent) {
        return mo50946s(intent, "steps_counter_profiler_config_extra");
    }

    /* renamed from: w */
    public final void mo49275w() {
        ProfilerLog.m41879c(this.f47186a).mo49244b("StepsCounterProfiler", "Time Fence End");
        SensorManager sensorManager = (SensorManager) this.f47186a.getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(19);
        if (defaultSensor != null) {
            sensorManager.unregisterListener(this, defaultSensor);
        }
    }

    /* renamed from: x */
    public final void mo49276x() {
        ProfilerLog.m41879c(this.f47186a).mo49244b("StepsCounterProfiler", "Time Fence Start");
        StepsCounterConfig stepsCounterConfig = (StepsCounterConfig) mo50937b();
        if (stepsCounterConfig == null) {
            ProfilerLog.m41879c(this.f47186a).mo49244b("StepsCounterProfiler", "Missing configuration!");
        } else {
            SensorManager sensorManager = (SensorManager) this.f47186a.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(19);
            if (defaultSensor != null) {
                int i = stepsCounterConfig.f43053f;
                int i2 = 3;
                if (i > 0) {
                    i2 = (int) TimeUnit.MINUTES.toMicros((long) i);
                }
                boolean registerListener = sensorManager.registerListener(this, defaultSensor, i2);
                ProfilerLog c = ProfilerLog.m41879c(this.f47186a);
                c.mo49244b("StepsCounterProfiler", "StepCounter result=" + registerListener);
            }
        }
        SensorManager sensorManager2 = (SensorManager) this.f47186a.getSystemService("sensor");
        if (sensorManager2 != null) {
            sensorManager2.flush(this);
        }
    }
}
