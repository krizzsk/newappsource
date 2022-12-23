package p277ub;

import java.util.concurrent.ThreadFactory;

/* renamed from: ub.z */
public final /* synthetic */ class C6813z implements ThreadFactory {

    /* renamed from: b */
    public final /* synthetic */ String f21072b;

    public /* synthetic */ C6813z(String str) {
        this.f21072b = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f21072b);
    }
}
