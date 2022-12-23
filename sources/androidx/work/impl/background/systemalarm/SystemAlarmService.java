package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.background.systemalarm.C1405d;
import java.util.HashMap;
import java.util.WeakHashMap;
import p081f3.C4656h;
import p205p3.C6049m;

public class SystemAlarmService extends LifecycleService implements C1405d.C1408c {

    /* renamed from: c */
    public C1405d f5179c;

    /* renamed from: d */
    public boolean f5180d;

    static {
        C4656h.m11961e("SystemAlarmService");
    }

    /* renamed from: a */
    public final void mo5708a() {
        C1405d dVar = new C1405d(this);
        this.f5179c = dVar;
        if (dVar.f5209k != null) {
            C4656h.m11960c().mo20177b(new Throwable[0]);
        } else {
            dVar.f5209k = this;
        }
    }

    /* renamed from: b */
    public final void mo5709b() {
        this.f5180d = true;
        C4656h.m11960c().mo20176a(new Throwable[0]);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = C6049m.f19279a;
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap2 = C6049m.f19279a;
        synchronized (weakHashMap2) {
            hashMap.putAll(weakHashMap2);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                String.format("WakeLock held for %s", new Object[]{hashMap.get(wakeLock)});
                C4656h c = C4656h.m11960c();
                WeakHashMap<PowerManager.WakeLock, String> weakHashMap3 = C6049m.f19279a;
                c.mo20179f(new Throwable[0]);
            }
        }
        stopSelf();
    }

    public final void onCreate() {
        super.onCreate();
        mo5708a();
        this.f5180d = false;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f5180d = true;
        this.f5179c.mo5720c();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f5180d) {
            C4656h.m11960c().mo20178d(new Throwable[0]);
            this.f5179c.mo5720c();
            mo5708a();
            this.f5180d = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f5179c.mo5718a(i2, intent);
        return 3;
    }
}
