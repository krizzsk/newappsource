package p030bo.app;

import com.appboy.support.AppboyLogger;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bo.app.f1 */
public abstract class C1573f1 extends ThreadPoolExecutor {

    /* renamed from: d */
    public static final String f5678d = AppboyLogger.getBrazeLogTag(C1573f1.class);

    /* renamed from: a */
    public final List<Runnable> f5679a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final Map<Runnable, Thread> f5680b = new HashMap();

    /* renamed from: c */
    public final String f5681c;

    /* renamed from: bo.app.f1$b */
    public class C1575b implements RejectedExecutionHandler {
        public C1575b() {
        }

        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            String a = C1573f1.f5678d;
            AppboyLogger.m5448d(a, "Rejected execution on runnable: " + runnable + " . ID: " + C1573f1.this.f5681c);
            if (threadPoolExecutor.isShutdown() || threadPoolExecutor.isTerminating()) {
                String a2 = C1573f1.f5678d;
                StringBuilder k = C13555b.m33972k("ThreadPoolExecutor is shutdown. Dropping rejected task. ID: ");
                k.append(C1573f1.this.f5681c);
                AppboyLogger.m5453i(a2, k.toString());
                return;
            }
            String b = C1573f1.this.mo6055b();
            try {
                if (!C1573f1.this.f5679a.isEmpty()) {
                    Runnable runnable2 = (Runnable) C1573f1.this.f5679a.get(0);
                    if (runnable2 instanceof Future) {
                        ((Future) runnable2).cancel(true);
                    } else {
                        Thread thread = (Thread) C1573f1.this.f5680b.get(runnable2);
                        if (thread != null) {
                            thread.interrupt();
                        }
                    }
                    C1573f1.this.f5679a.remove(runnable2);
                    C1573f1.this.f5680b.remove(runnable2);
                }
                Runnable poll = threadPoolExecutor.getQueue().poll();
                if (poll != null) {
                    String a3 = C1573f1.f5678d;
                    AppboyLogger.m5457v(a3, "Running head of queue on caller thread: " + poll + " . ID: " + C1573f1.this.f5681c);
                    Executors.newSingleThreadExecutor().invokeAll(Collections.singletonList(Executors.callable(poll)), 200, TimeUnit.MILLISECONDS);
                }
                String a4 = C1573f1.f5678d;
                AppboyLogger.m5457v(a4, "Re-adding rejected task to queue: " + runnable + " . ID: " + C1573f1.this.f5681c);
                threadPoolExecutor.execute(runnable);
            } catch (Exception e) {
                String a5 = C1573f1.f5678d;
                AppboyLogger.m5449d(a5, "Caught exception in rejected execution handler for incoming task: " + runnable + " . Running tasks description: " + b, (Throwable) e);
            }
            if (b != null) {
                String a6 = C1573f1.f5678d;
                AppboyLogger.m5459w(a6, "Handled rejected execution on incoming task: " + b);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1573f1(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
        this.f5681c = str;
        setRejectedExecutionHandler(new C1575b());
    }

    public void afterExecute(Runnable runnable, Throwable th) {
        this.f5679a.remove(runnable);
        this.f5680b.remove(runnable);
        super.afterExecute(runnable, th);
    }

    public void beforeExecute(Thread thread, Runnable runnable) {
        this.f5679a.add(runnable);
        this.f5680b.put(runnable, thread);
        super.beforeExecute(thread, runnable);
    }

    /* renamed from: b */
    public final String mo6055b() {
        try {
            if (this.f5679a.size() != getActiveCount()) {
                String str = f5678d;
                AppboyLogger.m5448d(str, "Running task count does not match ThreadPoolExecutor active count. Returning null description.  runningTasks.size(): " + this.f5679a.size() + " getActiveCount(): " + getActiveCount() + " ID: " + this.f5681c);
                return null;
            }
            StringBuilder sb = new StringBuilder(1024);
            sb.append("There are ");
            sb.append(this.f5679a.size());
            sb.append(" known running tasks. Active thread dumps: [\n");
            for (Thread next : this.f5680b.values()) {
                try {
                    sb.append(m4155a(next.getStackTrace()));
                    sb.append("\n,");
                } catch (Exception e) {
                    String str2 = f5678d;
                    AppboyLogger.m5452e(str2, "Failed to create description for active thread: " + next + " ID: " + this.f5681c, e);
                }
            }
            sb.append("]\nExecutor ID: ");
            sb.append(this.f5681c);
            sb.append(" state: ");
            sb.append(toString());
            return sb.toString();
        } catch (Exception e2) {
            String str3 = f5678d;
            StringBuilder k = C13555b.m33972k("Failed to create running tasks description. ID: ");
            k.append(this.f5681c);
            AppboyLogger.m5452e(str3, k.toString(), e2);
            return null;
        }
    }

    /* renamed from: a */
    public static String m4155a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement append : stackTraceElementArr) {
            sb.append("\nat ");
            sb.append(append);
        }
        return sb.toString();
    }

    public C1573f1(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        super(i, i2, j, timeUnit, blockingQueue);
        this.f5681c = str;
        setRejectedExecutionHandler(new C1575b());
    }
}
