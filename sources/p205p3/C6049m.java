package p205p3;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;
import p081f3.C4656h;

/* renamed from: p3.m */
public final class C6049m {

    /* renamed from: a */
    public static final WeakHashMap<PowerManager.WakeLock, String> f19279a = new WeakHashMap<>();

    static {
        C4656h.m11961e("WakeLocks");
    }

    /* renamed from: a */
    public static PowerManager.WakeLock m14532a(Context context, String str) {
        String k = C25541a.m63881k("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, k);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f19279a;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, k);
        }
        return newWakeLock;
    }
}
