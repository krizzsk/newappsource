package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.C1420a;
import p695od.C18728c;

public abstract class Worker extends ListenableWorker {
    public C1420a<ListenableWorker.C1379a> mFuture;

    /* renamed from: androidx.work.Worker$a */
    public class C1383a implements Runnable {
        public C1383a() {
        }

        public final void run() {
            try {
                Worker.this.mFuture.mo5756h(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.mFuture.mo5757i(th);
            }
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.C1379a doWork();

    public final C18728c<ListenableWorker.C1379a> startWork() {
        this.mFuture = new C1420a<>();
        getBackgroundExecutor().execute(new C1383a());
        return this.mFuture;
    }
}
