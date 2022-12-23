package p627lg;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;

/* renamed from: lg.s */
public final /* synthetic */ class C18220s implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C18210i f46487b;

    /* renamed from: c */
    public final /* synthetic */ CancellationToken f46488c;

    /* renamed from: d */
    public final /* synthetic */ CancellationTokenSource f46489d;

    /* renamed from: e */
    public final /* synthetic */ Callable f46490e;

    /* renamed from: f */
    public final /* synthetic */ TaskCompletionSource f46491f;

    public /* synthetic */ C18220s(C18210i iVar, CancellationToken cancellationToken, CancellationTokenSource cancellationTokenSource, Callable callable, TaskCompletionSource taskCompletionSource) {
        this.f46487b = iVar;
        this.f46488c = cancellationToken;
        this.f46489d = cancellationTokenSource;
        this.f46490e = callable;
        this.f46491f = taskCompletionSource;
    }

    public final void run() {
        C18210i iVar = this.f46487b;
        CancellationToken cancellationToken = this.f46488c;
        CancellationTokenSource cancellationTokenSource = this.f46489d;
        Callable callable = this.f46490e;
        TaskCompletionSource taskCompletionSource = this.f46491f;
        iVar.getClass();
        if (cancellationToken.isCancellationRequested()) {
            cancellationTokenSource.cancel();
            return;
        }
        try {
            if (!iVar.f46471c.get()) {
                iVar.mo50628b();
                iVar.f46471c.set(true);
            }
            if (cancellationToken.isCancellationRequested()) {
                cancellationTokenSource.cancel();
                return;
            }
            Object call = callable.call();
            if (cancellationToken.isCancellationRequested()) {
                cancellationTokenSource.cancel();
            } else {
                taskCompletionSource.setResult(call);
            }
        } catch (RuntimeException e) {
            throw new MlKitException(13, "Internal error has occurred when executing ML Kit tasks", e);
        } catch (Exception e2) {
            if (cancellationToken.isCancellationRequested()) {
                cancellationTokenSource.cancel();
            } else {
                taskCompletionSource.setException(e2);
            }
        }
    }
}
