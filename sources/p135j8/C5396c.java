package p135j8;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import bf0.C21050d;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.C2334f;
import com.facebook.appevents.C2335g;
import com.facebook.appevents.C2338j;
import com.facebook.internal.C2397f0;
import com.facebook.internal.C2429s;
import com.facebook.internal.C2436x;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import mf0.C24362h;
import p009a8.C0114n;
import p009a8.C0115o;
import p040c8.C1802a;
import p040c8.C1804c;
import p040c8.C1806d;
import p066e0.C4453r;
import p074e8.C4599b;
import p074e8.C4600c;
import p074e8.C4608f;
import p074e8.C4612g;
import p110h8.C5149h;
import p184n8.C5872d;
import p259t5.C6594d;
import p262t8.C6606a;
import p304x.C7065j0;

/* renamed from: j8.c */
public final class C5396c {

    /* renamed from: a */
    public static final C5396c f17719a = new C5396c();

    /* renamed from: b */
    public static final String f17720b;

    /* renamed from: c */
    public static final ScheduledExecutorService f17721c = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: d */
    public static volatile ScheduledFuture<?> f17722d;

    /* renamed from: e */
    public static final Object f17723e = new Object();

    /* renamed from: f */
    public static final AtomicInteger f17724f = new AtomicInteger(0);

    /* renamed from: g */
    public static volatile C5405i f17725g;

    /* renamed from: h */
    public static final AtomicBoolean f17726h = new AtomicBoolean(false);

    /* renamed from: i */
    public static String f17727i;

    /* renamed from: j */
    public static long f17728j;

    /* renamed from: k */
    public static int f17729k;

    /* renamed from: l */
    public static WeakReference<Activity> f17730l;

    /* renamed from: j8.c$a */
    public static final class C5397a implements Application.ActivityLifecycleCallbacks {
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C24362h.m61211f(activity, "activity");
            C2436x.C2437a aVar = C2436x.f8729d;
            C2436x.C2437a.m6389a(LoggingBehavior.APP_EVENTS, C5396c.f17720b, "onActivityCreated");
            int i = C5398d.f17731a;
            C5396c.f17721c.execute(new C6594d(1));
        }

        public final void onActivityDestroyed(Activity activity) {
            C4600c a;
            C24362h.m61211f(activity, "activity");
            C2436x.C2437a aVar = C2436x.f8729d;
            C2436x.C2437a.m6389a(LoggingBehavior.APP_EVENTS, C5396c.f17720b, "onActivityDestroyed");
            C5396c.f17719a.getClass();
            C4599b bVar = C4599b.f15801a;
            Class<C4599b> cls = C4599b.class;
            if (!C6606a.m15601b(cls)) {
                try {
                    a = C4600c.f15809f.mo20123a();
                    if (!C6606a.m15601b(a)) {
                        a.f15815e.remove(Integer.valueOf(activity.hashCode()));
                    }
                } catch (Throwable th) {
                    C6606a.m15600a(cls, th);
                }
            }
        }

        public final void onActivityPaused(Activity activity) {
            C4608f fVar;
            C24362h.m61211f(activity, "activity");
            C2436x.C2437a aVar = C2436x.f8729d;
            C2436x.C2437a.m6389a(LoggingBehavior.APP_EVENTS, C5396c.f17720b, "onActivityPaused");
            int i = C5398d.f17731a;
            C5396c.f17719a.getClass();
            AtomicInteger atomicInteger = C5396c.f17724f;
            if (atomicInteger.decrementAndGet() < 0) {
                atomicInteger.set(0);
            }
            synchronized (C5396c.f17723e) {
                if (C5396c.f17722d != null) {
                    ScheduledFuture<?> scheduledFuture = C5396c.f17722d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                }
                C5396c.f17722d = null;
                C21050d dVar = C21050d.f52856a;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String l = C2397f0.m6318l(activity);
            C4599b bVar = C4599b.f15801a;
            Class<C4599b> cls = C4599b.class;
            if (!C6606a.m15601b(cls)) {
                try {
                    if (C4599b.f15806f.get()) {
                        C4600c.f15809f.mo20123a().mo20122c(activity);
                        fVar = C4599b.f15804d;
                        if (fVar != null) {
                            if (!C6606a.m15601b(fVar)) {
                                if (fVar.f15830b.get() != null) {
                                    try {
                                        Timer timer = fVar.f15831c;
                                        if (timer != null) {
                                            timer.cancel();
                                        }
                                        fVar.f15831c = null;
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                        SensorManager sensorManager = C4599b.f15803c;
                        if (sensorManager != null) {
                            sensorManager.unregisterListener(C4599b.f15802b);
                        }
                    }
                } catch (Throwable th) {
                    C6606a.m15600a(cls, th);
                }
            }
            C5396c.f17721c.execute(new C5394a(currentTimeMillis, l));
        }

        public final void onActivityResumed(Activity activity) {
            Boolean bool;
            C4612g gVar;
            C24362h.m61211f(activity, "activity");
            C2436x.C2437a aVar = C2436x.f8729d;
            C2436x.C2437a.m6389a(LoggingBehavior.APP_EVENTS, C5396c.f17720b, "onActivityResumed");
            int i = C5398d.f17731a;
            C5396c.f17730l = new WeakReference<>(activity);
            C5396c.f17724f.incrementAndGet();
            C5396c.f17719a.getClass();
            synchronized (C5396c.f17723e) {
                if (C5396c.f17722d != null) {
                    ScheduledFuture<?> scheduledFuture = C5396c.f17722d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                }
                bool = null;
                C5396c.f17722d = null;
                C21050d dVar = C21050d.f52856a;
            }
            long currentTimeMillis = System.currentTimeMillis();
            C5396c.f17728j = currentTimeMillis;
            String l = C2397f0.m6318l(activity);
            C4599b bVar = C4599b.f15801a;
            Class<C4599b> cls = C4599b.class;
            if (!C6606a.m15601b(cls)) {
                try {
                    if (C4599b.f15806f.get()) {
                        C4600c.f15809f.mo20123a().mo20120a(activity);
                        Context applicationContext = activity.getApplicationContext();
                        String b = C0115o.m211b();
                        C2429s b2 = FetchedAppSettingsManager.m6261b(b);
                        if (b2 != null) {
                            bool = Boolean.valueOf(b2.f8715h);
                        }
                        if (!C24362h.m61206a(bool, Boolean.TRUE)) {
                            C4599b bVar2 = C4599b.f15801a;
                            bVar2.getClass();
                            C6606a.m15601b(bVar2);
                        } else {
                            SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                            if (sensorManager != null) {
                                C4599b.f15803c = sensorManager;
                                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                                C4608f fVar = new C4608f(activity);
                                C4599b.f15804d = fVar;
                                gVar = C4599b.f15802b;
                                C7065j0 j0Var = new C7065j0(1, b2, b);
                                gVar.getClass();
                                if (!C6606a.m15601b(gVar)) {
                                    gVar.f15835a = j0Var;
                                }
                                sensorManager.registerListener(C4599b.f15802b, defaultSensor, 2);
                                if (b2 != null && b2.f8715h) {
                                    fVar.mo20134c();
                                }
                            }
                        }
                        C4599b bVar3 = C4599b.f15801a;
                        bVar3.getClass();
                        C6606a.m15601b(bVar3);
                    }
                } catch (Throwable th) {
                    C6606a.m15600a(cls, th);
                }
            }
            C1802a aVar2 = C1802a.f6291a;
            Class<C1802a> cls2 = C1802a.class;
            if (!C6606a.m15601b(cls2)) {
                try {
                    if (C1802a.f6292b) {
                        CopyOnWriteArraySet copyOnWriteArraySet = C1804c.f6294d;
                        if (!new HashSet(C1804c.m5115a()).isEmpty()) {
                            HashMap hashMap = C1806d.f6298f;
                            C1806d.C1807a.m5121b(activity);
                        }
                    }
                } catch (Exception unused) {
                } catch (Throwable th2) {
                    C6606a.m15600a(cls2, th2);
                }
            }
            C5872d.m14323c(activity);
            C5149h.m13061a();
            C5396c.f17721c.execute(new C4453r(activity.getApplicationContext(), l, currentTimeMillis));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C24362h.m61211f(activity, "activity");
            C24362h.m61211f(bundle, "outState");
            C2436x.C2437a aVar = C2436x.f8729d;
            C2436x.C2437a.m6389a(LoggingBehavior.APP_EVENTS, C5396c.f17720b, "onActivitySaveInstanceState");
        }

        public final void onActivityStarted(Activity activity) {
            C24362h.m61211f(activity, "activity");
            C5396c.f17729k++;
            C2436x.C2437a aVar = C2436x.f8729d;
            C2436x.C2437a.m6389a(LoggingBehavior.APP_EVENTS, C5396c.f17720b, "onActivityStarted");
        }

        public final void onActivityStopped(Activity activity) {
            C24362h.m61211f(activity, "activity");
            C2436x.C2437a aVar = C2436x.f8729d;
            C2436x.C2437a.m6389a(LoggingBehavior.APP_EVENTS, C5396c.f17720b, "onActivityStopped");
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C2338j.f8537c;
            String str = C2335g.f8528a;
            Class<C2335g> cls = C2335g.class;
            if (!C6606a.m15601b(cls)) {
                try {
                    C2335g.f8531d.execute(new C2334f(0));
                } catch (Throwable th) {
                    C6606a.m15600a(cls, th);
                }
            }
            C5396c.f17729k--;
        }
    }

    static {
        String canonicalName = C5396c.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f17720b = canonicalName;
    }

    /* renamed from: a */
    public static final UUID m13498a() {
        C5405i iVar;
        if (f17725g == null || (iVar = f17725g) == null) {
            return null;
        }
        return iVar.f17748c;
    }

    /* renamed from: b */
    public static final void m13499b(Application application, String str) {
        if (f17726h.compareAndSet(false, true)) {
            FeatureManager featureManager = FeatureManager.f8588a;
            FeatureManager.m6255a(new C0114n(2), FeatureManager.Feature.CodelessEvents);
            f17727i = str;
            application.registerActivityLifecycleCallbacks(new C5397a());
        }
    }
}
