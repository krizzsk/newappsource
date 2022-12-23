package p627lg;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
/* renamed from: lg.i */
public abstract class C18210i {
    @KeepForSdk

    /* renamed from: a */
    public final C18213l f46469a = new C18213l();

    /* renamed from: b */
    public final AtomicInteger f46470b = new AtomicInteger(0);

    /* renamed from: c */
    public final AtomicBoolean f46471c = new AtomicBoolean(false);

    @KeepForSdk
    /* renamed from: a */
    public final <T> Task<T> mo50627a(Executor executor, Callable<T> callable, CancellationToken cancellationToken) {
        boolean z;
        if (this.f46470b.get() > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        if (cancellationToken.isCancellationRequested()) {
            return Tasks.forCanceled();
        }
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f46469a.mo50632a(new C18220s(this, cancellationToken, cancellationTokenSource, callable, taskCompletionSource), new C18221t(executor, cancellationToken, cancellationTokenSource, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @KeepForSdk
    /* renamed from: b */
    public abstract void mo50628b() throws MlKitException;

    @KeepForSdk
    /* renamed from: c */
    public abstract void mo50629c();
}
