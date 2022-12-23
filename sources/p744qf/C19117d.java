package p744qf;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.util.Iterator;
import java.util.List;
import p626lf.C18200a;

/* renamed from: qf.d */
public final class C19117d {

    /* renamed from: a */
    public final Runtime f48596a = Runtime.getRuntime();

    /* renamed from: b */
    public final ActivityManager f48597b;

    /* renamed from: c */
    public final ActivityManager.MemoryInfo f48598c;

    /* renamed from: d */
    public final String f48599d;

    /* renamed from: e */
    public final Context f48600e;

    static {
        C18200a.m44901d();
    }

    public C19117d(Context context) {
        String str;
        this.f48600e = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f48597b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f48598c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
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
            this.f48599d = str;
        }
        str = this.f48600e.getPackageName();
        this.f48599d = str;
    }
}
