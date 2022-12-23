package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import p696oe.C18730b;

/* renamed from: com.google.firebase.crashlytics.internal.common.b */
public final class C14448b implements SuccessContinuation<C18730b, Void> {

    /* renamed from: b */
    public final /* synthetic */ Executor f36475b;

    /* renamed from: c */
    public final /* synthetic */ C14449c f36476c;

    public C14448b(C14449c cVar, Executor executor) {
        this.f36476c = cVar;
        this.f36475b = executor;
    }

    public final Task then(Object obj) throws Exception {
        if (((C18730b) obj) == null) {
            return Tasks.forResult(null);
        }
        C14450d.m35976b(C14450d.this);
        C14450d.this.f36491l.mo49873f((String) null, this.f36475b);
        C14450d.this.f36495p.trySetResult(null);
        return Tasks.forResult(null);
    }
}
