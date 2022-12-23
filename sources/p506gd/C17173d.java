package p506gd;

import java.util.concurrent.ThreadFactory;

/* renamed from: gd.d */
public final class C17173d implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SplitCompatBackgroundThread");
    }
}
