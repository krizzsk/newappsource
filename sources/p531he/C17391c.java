package p531he;

import android.os.Process;

/* renamed from: he.c */
public abstract class C17391c implements Runnable {
    /* renamed from: a */
    public abstract void mo49866a();

    public final void run() {
        Process.setThreadPriority(10);
        mo49866a();
    }
}
