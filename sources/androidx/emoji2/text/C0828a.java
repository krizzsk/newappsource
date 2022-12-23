package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

/* renamed from: androidx.emoji2.text.a */
public final /* synthetic */ class C0828a implements ThreadFactory {

    /* renamed from: b */
    public final /* synthetic */ String f3486b;

    public /* synthetic */ C0828a(String str) {
        this.f3486b = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f3486b);
        thread.setPriority(10);
        return thread;
    }
}
