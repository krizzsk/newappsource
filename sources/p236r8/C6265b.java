package p236r8;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import com.facebook.internal.instrument.InstrumentData;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import mf0.C24362h;
import org.json.JSONArray;
import p262t8.C6606a;
import p584jl.C17885a;

/* renamed from: r8.b */
public final class C6265b {

    /* renamed from: a */
    public static final int f19733a = Process.myUid();

    /* renamed from: b */
    public static final ScheduledExecutorService f19734b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c */
    public static String f19735c = "";

    /* renamed from: d */
    public static final C6264a f19736d = new C6264a(0);

    static {
        new C6265b();
    }

    /* renamed from: a */
    public static final void m14853a(ActivityManager activityManager) {
        Class<C6265b> cls = C6265b.class;
        if (!C6606a.m15601b(cls)) {
            try {
                List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                if (processesInErrorState != null) {
                    for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                        if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f19733a) {
                            Thread thread = Looper.getMainLooper().getThread();
                            C24362h.m61210e(thread, "getMainLooper().thread");
                            StackTraceElement[] stackTrace = thread.getStackTrace();
                            JSONArray jSONArray = new JSONArray();
                            C24362h.m61210e(stackTrace, "stackTrace");
                            int length = stackTrace.length;
                            int i = 0;
                            while (i < length) {
                                StackTraceElement stackTraceElement = stackTrace[i];
                                i++;
                                jSONArray.put(stackTraceElement.toString());
                            }
                            String jSONArray2 = jSONArray.toString();
                            if (!C24362h.m61206a(jSONArray2, f19735c)) {
                                if (C17885a.m44439g0(thread)) {
                                    f19735c = jSONArray2;
                                    new InstrumentData(processErrorStateInfo.shortMsg, jSONArray2).mo12559c();
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                C6606a.m15600a(cls, th);
            }
        }
    }
}
