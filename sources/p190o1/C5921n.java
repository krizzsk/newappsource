package p190o1;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* renamed from: o1.n */
public final class C5921n implements ThreadFactory {

    /* renamed from: b */
    public String f19014b = "fonts-androidx";

    /* renamed from: c */
    public int f19015c = 10;

    /* renamed from: o1.n$a */
    public static class C5922a extends Thread {

        /* renamed from: b */
        public final int f19016b;

        public C5922a(Runnable runnable, String str, int i) {
            super(runnable, str);
            this.f19016b = i;
        }

        public final void run() {
            Process.setThreadPriority(this.f19016b);
            super.run();
        }
    }

    public final Thread newThread(Runnable runnable) {
        return new C5922a(runnable, this.f19014b, this.f19015c);
    }
}
