package p081f3;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: f3.a */
public final class C4647a implements ThreadFactory {

    /* renamed from: b */
    public final AtomicInteger f15874b = new AtomicInteger(0);

    /* renamed from: c */
    public final /* synthetic */ boolean f15875c;

    public C4647a(boolean z) {
        this.f15875c = z;
    }

    public final Thread newThread(Runnable runnable) {
        String str;
        if (this.f15875c) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        StringBuilder k = C13555b.m33972k(str);
        k.append(this.f15874b.incrementAndGet());
        return new Thread(runnable, k.toString());
    }
}
