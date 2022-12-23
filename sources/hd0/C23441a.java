package hd0;

import com.veriff.sdk.internal.C21621fb;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: hd0.a */
public final /* synthetic */ class C23441a implements ThreadFactory {

    /* renamed from: b */
    public final /* synthetic */ String f59214b;

    /* renamed from: c */
    public final /* synthetic */ int f59215c;

    /* renamed from: d */
    public final /* synthetic */ AtomicInteger f59216d;

    public /* synthetic */ C23441a(String str, int i, AtomicInteger atomicInteger) {
        this.f59214b = str;
        this.f59215c = i;
        this.f59216d = atomicInteger;
    }

    public final Thread newThread(Runnable runnable) {
        return C21621fb.m52486a(this.f59214b, this.f59215c, this.f59216d, runnable);
    }
}
