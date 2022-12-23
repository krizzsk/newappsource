package com.veriff.sdk.internal;

import bi0.C21073k;
import ci0.C21207b;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import mf0.C24362h;
import wh0.C25184i0;
import wh0.C25211r0;
import wh0.C25235z;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\b\u0010\b\u001a\u00020\u0007H\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\u0007H\u0007J\b\u0010\f\u001a\u00020\u0002H\u0007J\b\u0010\r\u001a\u00020\u0007H\u0007¨\u0006\u0010"}, mo59060d2 = {"Lcom/veriff/di/ThreadingModule;", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "bindComputationDispatcher", "bindImmediateMainDispatcher", "bindMainDispatcher", "provideDiskDispatcher", "Lcom/veriff/sdk/internal/Scheduler;", "provideDiskScheduler", "Lwh0/z;", "provideGlobalScope", "provideMainScheduler", "provideNetworkDispatcher", "provideNetworkScheduler", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.eh */
public final class C21595eh {

    /* renamed from: a */
    public static final C21595eh f54337a = new C21595eh();

    private C21595eh() {
    }

    /* renamed from: a */
    public final C21636fm mo54611a() {
        C21636fm b = C21637fn.m52522b();
        C24362h.m61210e(b, "Schedulers.networkIO()");
        return b;
    }

    /* renamed from: b */
    public final C21636fm mo54612b() {
        C21636fm c = C21637fn.m52523c();
        C24362h.m61210e(c, "Schedulers.main()");
        return c;
    }

    /* renamed from: c */
    public final C25235z mo54613c() {
        return C25211r0.f63482b;
    }

    /* renamed from: d */
    public final CoroutineDispatcher mo54614d() {
        return C25184i0.f63459a;
    }

    /* renamed from: e */
    public final CoroutineDispatcher mo54615e() {
        C21207b bVar = C25184i0.f63459a;
        return C21073k.f52890a;
    }

    /* renamed from: f */
    public final CoroutineDispatcher mo54616f() {
        C21207b bVar = C25184i0.f63459a;
        return C21073k.f52890a.mo60300z();
    }

    /* renamed from: g */
    public final CoroutineDispatcher mo54617g() {
        return C25184i0.f63460b;
    }
}
