package com.veriff.sdk.internal;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, mo59060d2 = {"Lcom/veriff/sdk/internal/HandlerThreadScheduler;", "Landroid/os/HandlerThread;", "Lcom/veriff/sdk/internal/Scheduler;", "Ljava/lang/Runnable;", "runnable", "Lbf0/d;", "post", "", "delayMillis", "postDelayed", "removeCallbacks", "shutdown", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "", "name", "<init>", "(Ljava/lang/String;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.fe */
public final class C21624fe extends HandlerThread implements C21636fm {

    /* renamed from: a */
    private final Handler f54626a = new Handler(getLooper());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21624fe(String str) {
        super(str);
        C24362h.m61211f(str, "name");
        start();
    }

    /* renamed from: a */
    public void mo54893a(long j, Runnable runnable) {
        C24362h.m61211f(runnable, "runnable");
        this.f54626a.postDelayed(runnable, j);
    }

    /* renamed from: b */
    public void mo54895b(Runnable runnable) {
        C24362h.m61211f(runnable, "runnable");
        this.f54626a.removeCallbacks(runnable);
    }

    /* renamed from: a */
    public void mo54894a(Runnable runnable) {
        C24362h.m61211f(runnable, "runnable");
        this.f54626a.post(runnable);
    }
}
