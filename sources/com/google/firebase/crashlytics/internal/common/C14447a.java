package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.C14452e;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import p531he.C17395e;
import p531he.C17400g;
import p531he.C17402h;
import p531he.C17406i0;
import p531he.C17408k;
import p696oe.C18736f;

/* renamed from: com.google.firebase.crashlytics.internal.common.a */
public final class C14447a implements C14452e.C14453a {

    /* renamed from: a */
    public final /* synthetic */ C14450d f36474a;

    public C14447a(C14450d dVar) {
        this.f36474a = dVar;
    }

    /* renamed from: a */
    public final void mo43333a(C18736f fVar, Thread thread, Throwable th) {
        Task<TContinuationResult> continueWithTask;
        C14450d dVar = this.f36474a;
        synchronized (dVar) {
            Objects.toString(th);
            thread.getName();
            long currentTimeMillis = System.currentTimeMillis();
            C17395e eVar = dVar.f36484e;
            C17408k kVar = new C17408k(dVar, currentTimeMillis, th, thread, fVar);
            synchronized (eVar.f44807c) {
                continueWithTask = eVar.f44806b.continueWithTask(eVar.f44805a, new C17400g(kVar));
                eVar.f44806b = continueWithTask.continueWith(eVar.f44805a, new C17402h());
            }
            try {
                C17406i0.m43451a(continueWithTask);
            } catch (Exception | TimeoutException unused) {
            }
        }
    }
}
