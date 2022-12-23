package p909xe;

import java.util.concurrent.ThreadFactory;

/* renamed from: xe.b */
public final /* synthetic */ class C20465b implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }
}
