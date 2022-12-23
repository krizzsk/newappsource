package p531he;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: he.i0 */
public final class C17406i0 {

    /* renamed from: a */
    public static final ExecutorService f44823a = C17388a0.m43434a("awaitEvenIfOnMainThread task continuation executor");

    /* renamed from: a */
    public static <T> T m43451a(Task<T> task) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(f44823a, new C17399f0(countDownLatch, 0));
        countDownLatch.await(4, TimeUnit.SECONDS);
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        } else if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        } else {
            throw new TimeoutException();
        }
    }
}
