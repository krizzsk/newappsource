package com.appsflyer;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import com.appsflyer.internal.C2099t;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p988j$.util.concurrent.ConcurrentHashMap;

public final class AFSensorManager {
    private static final BitSet AFDeepLinkManager;
    public static volatile AFSensorManager sInstance;
    private static final Handler urlString = new Handler(Looper.getMainLooper());
    public boolean $$a;
    public final Object $$b = new Object();
    public final Runnable AFDateFormat;
    /* access modifiers changed from: private */
    public boolean AFEvent;
    public long collectIntentsFromActivities;
    /* access modifiers changed from: private */
    public final Map<C2099t, Map<String, Object>> context;
    public final Runnable dateFormatUTC;
    public int getDataFormatter;
    public final Executor getInstance;
    /* access modifiers changed from: private */
    public final SensorManager getRequestListener;
    /* access modifiers changed from: private */
    public final Runnable key;
    /* access modifiers changed from: private */
    public final Map<C2099t, C2099t> requestListener;
    public final Handler valueOf;
    public final Runnable values;

    static {
        BitSet bitSet = new BitSet(6);
        AFDeepLinkManager = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private AFSensorManager(SensorManager sensorManager, Handler handler) {
        BitSet bitSet = AFDeepLinkManager;
        this.requestListener = new HashMap(bitSet.size());
        this.context = new ConcurrentHashMap(bitSet.size());
        this.AFDateFormat = new Runnable() {
            public final void run() {
                synchronized (AFSensorManager.this.$$b) {
                    AFSensorManager aFSensorManager = AFSensorManager.this;
                    aFSensorManager.getInstance.execute(new Runnable() {
                        public final void run() {
                            try {
                                for (Sensor next : AFSensorManager.this.getRequestListener.getSensorList(-1)) {
                                    if (AFSensorManager.values(next.getType())) {
                                        C2099t tVar = new C2099t(next, AFSensorManager.this.getInstance);
                                        if (!AFSensorManager.this.requestListener.containsKey(tVar)) {
                                            AFSensorManager.this.requestListener.put(tVar, tVar);
                                        }
                                        AFSensorManager.this.getRequestListener.registerListener((SensorEventListener) AFSensorManager.this.requestListener.get(tVar), next, 0);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            boolean unused2 = AFSensorManager.this.AFEvent = true;
                        }
                    });
                    AFSensorManager aFSensorManager2 = AFSensorManager.this;
                    aFSensorManager2.valueOf.postDelayed(aFSensorManager2.key, 100);
                    AFSensorManager.this.$$a = true;
                }
            }
        };
        this.values = new Runnable() {
            public final void run() {
                synchronized (AFSensorManager.this.$$b) {
                    AFSensorManager aFSensorManager = AFSensorManager.this;
                    aFSensorManager.getInstance.execute(new Runnable() {
                        public final void run() {
                            try {
                                if (!AFSensorManager.this.requestListener.isEmpty()) {
                                    for (C2099t tVar : AFSensorManager.this.requestListener.values()) {
                                        AFSensorManager.this.getRequestListener.unregisterListener(tVar);
                                        tVar.valueOf((Map<C2099t, Map<String, Object>>) AFSensorManager.this.context, true);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            int unused2 = AFSensorManager.this.getDataFormatter = 0;
                            boolean unused3 = AFSensorManager.this.AFEvent = false;
                        }
                    });
                }
            }
        };
        this.dateFormatUTC = new Runnable() {
            public final void run() {
                synchronized (AFSensorManager.this.$$b) {
                    AFSensorManager aFSensorManager = AFSensorManager.this;
                    if (aFSensorManager.$$a) {
                        aFSensorManager.valueOf.removeCallbacks(aFSensorManager.AFDateFormat);
                        AFSensorManager aFSensorManager2 = AFSensorManager.this;
                        aFSensorManager2.valueOf.removeCallbacks(aFSensorManager2.values);
                        AFSensorManager aFSensorManager3 = AFSensorManager.this;
                        aFSensorManager3.getInstance.execute(new Runnable() {
                            public final void run() {
                                try {
                                    if (!AFSensorManager.this.requestListener.isEmpty()) {
                                        for (C2099t tVar : AFSensorManager.this.requestListener.values()) {
                                            AFSensorManager.this.getRequestListener.unregisterListener(tVar);
                                            tVar.valueOf((Map<C2099t, Map<String, Object>>) AFSensorManager.this.context, true);
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                                int unused2 = AFSensorManager.this.getDataFormatter = 0;
                                boolean unused3 = AFSensorManager.this.AFEvent = false;
                            }
                        });
                        AFSensorManager.this.$$a = false;
                    }
                }
            }
        };
        this.getDataFormatter = 1;
        this.collectIntentsFromActivities = 0;
        this.key = new Runnable() {
            public final void run() {
                synchronized (AFSensorManager.this.$$b) {
                    if (AFSensorManager.this.getDataFormatter == 0) {
                        int unused = AFSensorManager.this.getDataFormatter = 1;
                    }
                    AFSensorManager aFSensorManager = AFSensorManager.this;
                    aFSensorManager.valueOf.postDelayed(aFSensorManager.values, ((long) aFSensorManager.getDataFormatter) * 500);
                }
            }
        };
        this.getInstance = Executors.newSingleThreadExecutor();
        this.getRequestListener = sensorManager;
        this.valueOf = handler;
    }

    public static AFSensorManager values(Context context2) {
        if (sInstance != null) {
            return sInstance;
        }
        return values((SensorManager) context2.getApplicationContext().getSystemService("sensor"), urlString);
    }

    public final List<Map<String, Object>> $$a() {
        for (C2099t valueOf2 : this.requestListener.values()) {
            valueOf2.valueOf(this.context, true);
        }
        Map<C2099t, Map<String, Object>> map = this.context;
        if (map == null || map.isEmpty()) {
            return new CopyOnWriteArrayList(Collections.emptyList());
        }
        return new CopyOnWriteArrayList(this.context.values());
    }

    public final List<Map<String, Object>> valueOf() {
        synchronized (this.$$b) {
            if (!this.requestListener.isEmpty() && this.AFEvent) {
                for (C2099t valueOf2 : this.requestListener.values()) {
                    valueOf2.valueOf(this.context, false);
                }
            }
            if (this.context.isEmpty()) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(Collections.emptyList());
                return copyOnWriteArrayList;
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList(this.context.values());
            return copyOnWriteArrayList2;
        }
    }

    private static AFSensorManager values(SensorManager sensorManager, Handler handler) {
        if (sInstance == null) {
            synchronized (AFSensorManager.class) {
                if (sInstance == null) {
                    sInstance = new AFSensorManager(sensorManager, handler);
                }
            }
        }
        return sInstance;
    }

    /* access modifiers changed from: private */
    public static boolean values(int i) {
        return i >= 0 && AFDeepLinkManager.get(i);
    }
}
