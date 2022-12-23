package nd0;

import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.vungle.warren.VungleLogger;
import java.lang.Thread;
import nd0.C24486e;

/* renamed from: nd0.c */
public final class C24484c implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final Thread.UncaughtExceptionHandler f61959a;

    /* renamed from: b */
    public C24486e.C24489c f61960b;

    /* renamed from: c */
    public String f61961c = C24486e.f61973o;

    public C24484c(C24486e.C24489c cVar) {
        this.f61960b = cVar;
        this.f61959a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        if (!(!C24486e.this.f61980g.get() || thread == null || th == null)) {
            boolean z = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                StackTraceElement[] stackTrace = th2.getStackTrace();
                int length = stackTrace.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (stackTrace[i].getClassName().startsWith(this.f61961c)) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (z) {
                String stackTraceString = Log.getStackTraceString(th);
                String cls = th.getClass().toString();
                String valueOf = String.valueOf(thread.getId());
                C24486e.C24489c cVar = this.f61960b;
                C24486e.this.mo60738b(VungleLogger.LoggerLevel.CRASH, AppMeasurement.CRASH_ORIGIN, stackTraceString, cls, valueOf);
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f61959a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
