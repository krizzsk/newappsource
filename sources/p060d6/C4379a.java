package p060d6;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* renamed from: d6.a */
public final class C4379a implements ThreadFactory {

    /* renamed from: d6.a$a */
    public class C4380a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Runnable f15408b;

        public C4380a(Runnable runnable) {
            this.f15408b = runnable;
        }

        public final void run() {
            Process.setThreadPriority(10);
            this.f15408b.run();
        }
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(new C4380a(runnable), "glide-active-resources");
    }
}
