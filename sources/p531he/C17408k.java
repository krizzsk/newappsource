package p531he;

import com.android.billingclient.api.C1963s;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.C14450d;
import com.google.firebase.crashlytics.internal.settings.C14454a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p648me.C18365c;
import p696oe.C18736f;

/* renamed from: he.k */
public final class C17408k implements Callable<Task<Void>> {

    /* renamed from: b */
    public final /* synthetic */ long f44827b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f44828c;

    /* renamed from: d */
    public final /* synthetic */ Thread f44829d;

    /* renamed from: e */
    public final /* synthetic */ C18736f f44830e;

    /* renamed from: f */
    public final /* synthetic */ boolean f44831f = false;

    /* renamed from: g */
    public final /* synthetic */ C14450d f44832g;

    public C17408k(C14450d dVar, long j, Throwable th, Thread thread, C18736f fVar) {
        this.f44832g = dVar;
        this.f44827b = j;
        this.f44828c = th;
        this.f44829d = thread;
        this.f44830e = fVar;
    }

    public final Object call() throws Exception {
        long j = this.f44827b / 1000;
        String d = this.f44832g.mo43336d();
        if (d == null) {
            return Tasks.forResult(null);
        }
        C1963s sVar = this.f44832g.f36482c;
        sVar.getClass();
        try {
            C18365c cVar = (C18365c) sVar.f6792b;
            cVar.getClass();
            new File(cVar.f46821b, (String) sVar.f6791a).createNewFile();
        } catch (IOException unused) {
        }
        this.f44832g.f36491l.mo49871d(this.f44828c, this.f44829d, d, AppMeasurement.CRASH_ORIGIN, j, true);
        C14450d dVar = this.f44832g;
        long j2 = this.f44827b;
        dVar.getClass();
        try {
            C18365c cVar2 = dVar.f36486g;
            String str = ".ae" + j2;
            cVar2.getClass();
            if (new File(cVar2.f46821b, str).createNewFile()) {
                this.f44832g.mo43335c(false, this.f44830e);
                C14450d dVar2 = this.f44832g;
                new C17393d(this.f44832g.f36485f);
                C14450d.m35975a(dVar2, C17393d.f44803b);
                if (!this.f44832g.f36481b.mo49890a()) {
                    return Tasks.forResult(null);
                }
                Executor executor = this.f44832g.f36484e.f44805a;
                return ((C14454a) this.f44830e).f36511i.get().getTask().onSuccessTask(executor, new C17407j(this, executor, d));
            }
            throw new IOException("Create new file failed.");
        } catch (IOException unused2) {
        }
    }
}
