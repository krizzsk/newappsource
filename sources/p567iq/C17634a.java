package p567iq;

import android.os.Process;
import p435de.C16596f;
import p977zz.C20967t0;

/* renamed from: iq.a */
public final class C17634a extends C20967t0 {
    public C17634a() {
        super(Thread.getDefaultUncaughtExceptionHandler());
    }

    /* renamed from: a */
    public final void mo50094a(Throwable th) {
        th.printStackTrace();
        C16596f.m42113a().mo49364c(th);
        Process.killProcess(Process.myPid());
        System.exit(10);
    }
}
