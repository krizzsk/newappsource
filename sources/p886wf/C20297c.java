package p886wf;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p009a8.C0113m;
import p484ff.C16979j;

/* renamed from: wf.c */
public final class C20297c {

    /* renamed from: d */
    public static final HashMap f51462d = new HashMap();

    /* renamed from: e */
    public static final C16979j f51463e = new C16979j();

    /* renamed from: a */
    public final ExecutorService f51464a;

    /* renamed from: b */
    public final C20303h f51465b;

    /* renamed from: c */
    public Task<C20299d> f51466c = null;

    /* renamed from: wf.c$a */
    public static class C20298a<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

        /* renamed from: b */
        public final CountDownLatch f51467b = new CountDownLatch(1);

        public final void onCanceled() {
            this.f51467b.countDown();
        }

        public final void onFailure(Exception exc) {
            this.f51467b.countDown();
        }

        public final void onSuccess(TResult tresult) {
            this.f51467b.countDown();
        }
    }

    public C20297c(ExecutorService executorService, C20303h hVar) {
        this.f51464a = executorService;
        this.f51465b = hVar;
    }

    /* renamed from: a */
    public static Object m47866a(Task task, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C20298a aVar = new C20298a();
        C16979j jVar = f51463e;
        task.addOnSuccessListener((Executor) jVar, aVar);
        task.addOnFailureListener((Executor) jVar, (OnFailureListener) aVar);
        task.addOnCanceledListener((Executor) jVar, (OnCanceledListener) aVar);
        if (!aVar.f51467b.await(5, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        } else if (task.isSuccessful()) {
            return task.getResult();
        } else {
            throw new ExecutionException(task.getException());
        }
    }

    /* renamed from: b */
    public final void mo52464b() {
        synchronized (this) {
            this.f51466c = Tasks.forResult(null);
        }
        C20303h hVar = this.f51465b;
        synchronized (hVar) {
            hVar.f51487a.deleteFile(hVar.f51488b);
        }
    }

    /* renamed from: c */
    public final synchronized Task<C20299d> mo52465c() {
        Task<C20299d> task = this.f51466c;
        if (task == null || (task.isComplete() && !this.f51466c.isSuccessful())) {
            ExecutorService executorService = this.f51464a;
            C20303h hVar = this.f51465b;
            Objects.requireNonNull(hVar);
            this.f51466c = Tasks.call(executorService, new C0113m(hVar, 1));
        }
        return this.f51466c;
    }
}
