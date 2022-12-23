package p977zz;

import android.os.Process;

/* renamed from: zz.b0 */
public final class C20929b0 extends Thread {

    /* renamed from: b */
    public final int f52676b;

    public C20929b0(Runnable runnable, int i) {
        super(runnable);
        this.f52676b = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f52676b);
        super.run();
    }

    public C20929b0(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.f52676b = i;
    }
}
