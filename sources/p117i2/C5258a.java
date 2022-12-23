package p117i2;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.p017os.OperationCanceledException;
import androidx.loader.content.ModernAsyncTask;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import p229r1.C6237g;

/* renamed from: i2.a */
public abstract class C5258a<D> extends C5260b<D> {
    public static final boolean DEBUG = false;
    public static final String TAG = "AsyncTaskLoader";
    public volatile C5258a<D>.C25541a mCancellingTask;
    private final Executor mExecutor;
    public Handler mHandler;
    public long mLastLoadCompleteTime;
    public volatile C5258a<D>.C25541a mTask;
    public long mUpdateThrottle;

    /* renamed from: i2.a$a */
    public final class C5259a extends ModernAsyncTask<Void, Void, D> implements Runnable {

        /* renamed from: i */
        public final CountDownLatch f17390i = new CountDownLatch(1);

        /* renamed from: j */
        public boolean f17391j;

        public C5259a() {
        }

        /* renamed from: a */
        public final Object mo4339a(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            try {
                return C5258a.this.onLoadInBackground();
            } catch (OperationCanceledException e) {
                if (this.f4003e.get()) {
                    return null;
                }
                throw e;
            }
        }

        /* renamed from: b */
        public final void mo4340b(D d) {
            try {
                C5258a.this.dispatchOnCancelled(this, d);
            } finally {
                this.f17390i.countDown();
            }
        }

        /* renamed from: c */
        public final void mo4341c(D d) {
            try {
                C5258a.this.dispatchOnLoadComplete(this, d);
            } finally {
                this.f17390i.countDown();
            }
        }

        public final void run() {
            this.f17391j = false;
            C5258a.this.executePendingTask();
        }
    }

    public C5258a(Context context) {
        this(context, ModernAsyncTask.f3998g);
    }

    public void cancelLoadInBackground() {
    }

    public void dispatchOnCancelled(C5258a<D>.C25541a aVar, D d) {
        onCanceled(d);
        if (this.mCancellingTask == aVar) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(C5258a<D>.C25541a aVar, D d) {
        if (this.mTask != aVar) {
            dispatchOnCancelled(aVar, d);
        } else if (isAbandoned()) {
            onCanceled(d);
        } else {
            commitContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mTask = null;
            deliverResult(d);
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.f17391j);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.f17391j);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            long j = this.mUpdateThrottle;
            Object obj = C6237g.f19684a;
            synchronized (obj) {
                printWriter.print(new String(C6237g.f19685b, 0, C6237g.m14826a(j)));
            }
            printWriter.print(" mLastLoadCompleteTime=");
            long j2 = this.mLastLoadCompleteTime;
            long uptimeMillis = SystemClock.uptimeMillis();
            if (j2 == 0) {
                printWriter.print("--");
            } else {
                long j3 = j2 - uptimeMillis;
                synchronized (obj) {
                    printWriter.print(new String(C6237g.f19685b, 0, C6237g.m14826a(j3)));
                }
            }
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask == null && this.mTask != null) {
            if (this.mTask.f17391j) {
                this.mTask.f17391j = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            if (this.mUpdateThrottle <= 0 || SystemClock.uptimeMillis() >= this.mLastLoadCompleteTime + this.mUpdateThrottle) {
                C5258a<D>.C25541a aVar = this.mTask;
                Executor executor = this.mExecutor;
                if (aVar.f4002d != ModernAsyncTask.Status.PENDING) {
                    int i = ModernAsyncTask.C1054d.f4008a[aVar.f4002d.ordinal()];
                    if (i == 1) {
                        throw new IllegalStateException("Cannot execute task: the task is already running.");
                    } else if (i != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    } else {
                        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                    }
                } else {
                    aVar.f4002d = ModernAsyncTask.Status.RUNNING;
                    aVar.f4000b.f4011b = null;
                    executor.execute(aVar.f4001c);
                }
            } else {
                this.mTask.f17391j = true;
                this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
            }
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public abstract D loadInBackground();

    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!this.mStarted) {
            this.mContentChanged = true;
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.f17391j) {
                this.mTask.f17391j = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        } else if (this.mTask.f17391j) {
            this.mTask.f17391j = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        } else {
            C5258a<D>.C25541a aVar = this.mTask;
            aVar.f4003e.set(true);
            boolean cancel = aVar.f4001c.cancel(false);
            if (cancel) {
                this.mCancellingTask = this.mTask;
                cancelLoadInBackground();
            }
            this.mTask = null;
            return cancel;
        }
    }

    public void onCanceled(D d) {
    }

    public void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new C5259a();
        executePendingTask();
    }

    public D onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j) {
        this.mUpdateThrottle = j;
        if (j != 0) {
            this.mHandler = new Handler();
        }
    }

    public void waitForLoader() {
        C5258a<D>.C25541a aVar = this.mTask;
        if (aVar != null) {
            try {
                aVar.f17390i.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    private C5258a(Context context, Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000;
        this.mExecutor = executor;
    }
}
