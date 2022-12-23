package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.appsflyer.internal.t */
public final class C2099t implements SensorEventListener {
    public final long[] $$a = new long[2];
    private final int $$b;
    public final float[][] AFDateFormat = new float[2][];
    private final int AFDeepLinkManager;
    private final String dateFormatUTC;
    private final String getDataFormatter;
    private final Executor getInstance;
    public double valueOf;
    public long values;

    public C2099t(Sensor sensor, Executor executor) {
        this.getInstance = executor;
        int type = sensor.getType();
        this.$$b = type;
        String name = sensor.getName();
        String str = "";
        name = name == null ? str : name;
        this.dateFormatUTC = name;
        String vendor = sensor.getVendor();
        str = vendor != null ? vendor : str;
        this.getDataFormatter = str;
        this.AFDeepLinkManager = str.hashCode() + ((name.hashCode() + ((type + 31) * 31)) * 31);
    }

    public static double valueOf(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow((double) (fArr[i] - fArr2[i]), 2.0d);
        }
        return Math.sqrt(d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2099t)) {
            return false;
        }
        C2099t tVar = (C2099t) obj;
        return values(tVar.$$b, tVar.dateFormatUTC, tVar.getDataFormatter);
    }

    public final int hashCode() {
        return this.AFDeepLinkManager;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(final SensorEvent sensorEvent) {
        this.getInstance.execute(new Runnable() {
            public final void run() {
                SensorEvent sensorEvent = sensorEvent;
                if (sensorEvent != null && sensorEvent.values != null && C2099t.valueOf(sensorEvent.sensor)) {
                    C2099t tVar = C2099t.this;
                    int type = sensorEvent.sensor.getType();
                    String name = sensorEvent.sensor.getName();
                    String vendor = sensorEvent.sensor.getVendor();
                    SensorEvent sensorEvent2 = sensorEvent;
                    long j = sensorEvent2.timestamp;
                    float[] fArr = sensorEvent2.values;
                    if (tVar.values(type, name, vendor)) {
                        long currentTimeMillis = System.currentTimeMillis();
                        float[][] fArr2 = tVar.AFDateFormat;
                        float[] fArr3 = fArr2[0];
                        if (fArr3 == null) {
                            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
                            tVar.$$a[0] = currentTimeMillis;
                            return;
                        }
                        float[] fArr4 = fArr2[1];
                        if (fArr4 == null) {
                            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
                            tVar.AFDateFormat[1] = copyOf;
                            tVar.$$a[1] = currentTimeMillis;
                            tVar.valueOf = C2099t.valueOf(fArr3, copyOf);
                        } else if (50000000 <= j - tVar.values) {
                            tVar.values = j;
                            if (Arrays.equals(fArr4, fArr)) {
                                tVar.$$a[1] = currentTimeMillis;
                                return;
                            }
                            double valueOf2 = C2099t.valueOf(fArr3, fArr);
                            if (valueOf2 > tVar.valueOf) {
                                tVar.AFDateFormat[1] = Arrays.copyOf(fArr, fArr.length);
                                tVar.$$a[1] = currentTimeMillis;
                                tVar.valueOf = valueOf2;
                            }
                        }
                    }
                }
            }
        });
    }

    public final boolean values(int i, String str, String str2) {
        return this.$$b == i && this.dateFormatUTC.equals(str) && this.getDataFormatter.equals(str2);
    }

    private static List<Float> $$a(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf2 : fArr) {
            arrayList.add(Float.valueOf(valueOf2));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static boolean valueOf(Sensor sensor) {
        return (sensor == null || sensor.getName() == null || sensor.getVendor() == null) ? false : true;
    }

    private Map<String, Object> values() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.$$b));
        concurrentHashMap.put("sN", this.dateFormatUTC);
        concurrentHashMap.put("sV", this.getDataFormatter);
        float[] fArr = this.AFDateFormat[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", $$a(fArr));
        }
        float[] fArr2 = this.AFDateFormat[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", $$a(fArr2));
        }
        return concurrentHashMap;
    }

    private boolean $$a() {
        return this.AFDateFormat[0] != null;
    }

    public final void valueOf(Map<C2099t, Map<String, Object>> map, boolean z) {
        if ($$a()) {
            map.put(this, values());
            if (z) {
                int length = this.AFDateFormat.length;
                for (int i = 0; i < length; i++) {
                    this.AFDateFormat[i] = null;
                }
                int length2 = this.$$a.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.$$a[i2] = 0;
                }
                this.valueOf = 0.0d;
                this.values = 0;
            }
        } else if (!map.containsKey(this)) {
            map.put(this, values());
        }
    }
}
