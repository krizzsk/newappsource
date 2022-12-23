package p977zz;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zz.c0 */
public final class C20932c0 implements ThreadFactory {

    /* renamed from: b */
    public final String f52678b;

    /* renamed from: c */
    public final int f52679c;

    /* renamed from: d */
    public final AtomicInteger f52680d = new AtomicInteger();

    public C20932c0(String str, int i) {
        this.f52678b = str;
        this.f52679c = i;
    }

    /* renamed from: a */
    public static C20932c0 m49025a(String str) {
        return new C20932c0(str, 10);
    }

    public final Thread newThread(Runnable runnable) {
        if (this.f52678b == null) {
            return new C20929b0(runnable, this.f52679c);
        }
        return new C20929b0(runnable, this.f52678b + "-" + this.f52680d.getAndIncrement(), this.f52679c);
    }
}
