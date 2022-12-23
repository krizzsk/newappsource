package ii0;

import java.util.concurrent.ThreadFactory;

/* renamed from: ii0.c */
public final /* synthetic */ class C23609c implements ThreadFactory {

    /* renamed from: b */
    public final /* synthetic */ String f59682b;

    /* renamed from: c */
    public final /* synthetic */ boolean f59683c;

    public /* synthetic */ C23609c(String str, boolean z) {
        this.f59682b = str;
        this.f59683c = z;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f59682b;
        boolean z = this.f59683c;
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }
}
