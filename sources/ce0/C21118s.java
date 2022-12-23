package ce0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* renamed from: ce0.s */
public final class C21118s {

    /* renamed from: a */
    public static final Handler f52984a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static boolean m49418a() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return mainLooper.isCurrentThread();
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper == null || !mainLooper.getThread().equals(myLooper.getThread())) {
            return false;
        }
        return true;
    }
}
