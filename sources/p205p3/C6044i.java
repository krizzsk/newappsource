package p205p3;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.work.C1385a;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import p081f3.C4656h;

/* renamed from: p3.i */
public final class C6044i {
    static {
        C4656h.m11961e("ProcessUtils");
    }

    /* renamed from: a */
    public static boolean m14530a(Context context, C1385a aVar) {
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (Build.VERSION.SDK_INT >= 28) {
            str = Application.getProcessName();
        } else {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, C6044i.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke((Object) null, new Object[0]);
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable th) {
                C4656h.m11960c().mo20176a(th);
            }
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        str = next.processName;
                        break;
                    }
                }
            }
            str = null;
        }
        aVar.getClass();
        if (!TextUtils.isEmpty((CharSequence) null)) {
            return TextUtils.equals(str, (CharSequence) null);
        }
        return TextUtils.equals(str, context.getApplicationInfo().processName);
    }
}
