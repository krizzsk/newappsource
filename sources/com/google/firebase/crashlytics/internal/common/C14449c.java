package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.C14450d;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p531he.C17422x;
import p648me.C18364b;
import p648me.C18365c;

/* renamed from: com.google.firebase.crashlytics.internal.common.c */
public final class C14449c implements Callable<Task<Void>> {

    /* renamed from: b */
    public final /* synthetic */ Boolean f36477b;

    /* renamed from: c */
    public final /* synthetic */ C14450d.C14451a f36478c;

    public C14449c(C14450d.C14451a aVar, Boolean bool) {
        this.f36478c = aVar;
        this.f36477b = bool;
    }

    public final Object call() throws Exception {
        if (!this.f36477b.booleanValue()) {
            C18365c cVar = C14450d.this.f36486g;
            for (File delete : C18365c.m45219d(cVar.f46821b.listFiles(C14450d.f36479q))) {
                delete.delete();
            }
            C18364b bVar = C14450d.this.f36491l.f44811b;
            C18364b.m45212a(C18365c.m45219d(bVar.f46818b.f46823d.listFiles()));
            C18364b.m45212a(C18365c.m45219d(bVar.f46818b.f46824e.listFiles()));
            C18364b.m45212a(C18365c.m45219d(bVar.f46818b.f46825f.listFiles()));
            C14450d.this.f36495p.trySetResult(null);
            return Tasks.forResult(null);
        }
        boolean booleanValue = this.f36477b.booleanValue();
        C17422x xVar = C14450d.this.f36481b;
        if (booleanValue) {
            xVar.f44876f.trySetResult(null);
            C14450d.C14451a aVar = this.f36478c;
            Executor executor = C14450d.this.f36484e.f44805a;
            return aVar.f36496b.onSuccessTask(executor, new C14448b(this, executor));
        }
        xVar.getClass();
        throw new IllegalStateException("An invalid data collection token was used.");
    }
}
