package p435de;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.settings.C14454a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p531he.C17403h0;
import p531he.C17406i0;
import p531he.C17415r;
import p531he.C17417t;

/* renamed from: de.e */
public final class C16595e implements Callable<Void> {

    /* renamed from: b */
    public final /* synthetic */ boolean f43241b;

    /* renamed from: c */
    public final /* synthetic */ C17417t f43242c;

    /* renamed from: d */
    public final /* synthetic */ C14454a f43243d;

    public C16595e(boolean z, C17417t tVar, C14454a aVar) {
        this.f43241b = z;
        this.f43242c = tVar;
        this.f43243d = aVar;
    }

    public final Object call() throws Exception {
        if (!this.f43241b) {
            return null;
        }
        C17417t tVar = this.f43242c;
        C14454a aVar = this.f43243d;
        ExecutorService executorService = tVar.f44860l;
        C17415r rVar = new C17415r(tVar, aVar);
        ExecutorService executorService2 = C17406i0.f44823a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executorService.execute(new C17403h0(rVar, taskCompletionSource));
        taskCompletionSource.getTask();
        return null;
    }
}
