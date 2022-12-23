package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ModernAsyncTask<Params, Progress, Result> {

    /* renamed from: g */
    public static final ThreadPoolExecutor f3998g;

    /* renamed from: h */
    public static C1056f f3999h;

    /* renamed from: b */
    public final C1052b f4000b;

    /* renamed from: c */
    public final C1053c f4001c;

    /* renamed from: d */
    public volatile Status f4002d = Status.PENDING;

    /* renamed from: e */
    public final AtomicBoolean f4003e = new AtomicBoolean();

    /* renamed from: f */
    public final AtomicBoolean f4004f = new AtomicBoolean();

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$a */
    public static class C1051a implements ThreadFactory {

        /* renamed from: b */
        public final AtomicInteger f4005b = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            StringBuilder k = C13555b.m33972k("ModernAsyncTask #");
            k.append(this.f4005b.getAndIncrement());
            return new Thread(runnable, k.toString());
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$b */
    public class C1052b extends C1057g<Params, Result> {
        public C1052b() {
        }

        public final Result call() throws Exception {
            ModernAsyncTask.this.f4004f.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = ModernAsyncTask.this.mo4339a(this.f4011b);
                Binder.flushPendingCommands();
                ModernAsyncTask.this.mo4342d(result);
                return result;
            } catch (Throwable th) {
                ModernAsyncTask.this.mo4342d(result);
                throw th;
            }
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$c */
    public class C1053c extends FutureTask<Result> {
        public C1053c(C1052b bVar) {
            super(bVar);
        }

        public final void done() {
            try {
                Object obj = get();
                ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
                if (!modernAsyncTask.f4004f.get()) {
                    modernAsyncTask.mo4342d(obj);
                }
            } catch (InterruptedException unused) {
            } catch (ExecutionException e) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
            } catch (CancellationException unused2) {
                ModernAsyncTask modernAsyncTask2 = ModernAsyncTask.this;
                if (!modernAsyncTask2.f4004f.get()) {
                    modernAsyncTask2.mo4342d((Object) null);
                }
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$d */
    public static /* synthetic */ class C1054d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4008a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.loader.content.ModernAsyncTask$Status[] r0 = androidx.loader.content.ModernAsyncTask.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4008a = r0
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4008a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.FINISHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.loader.content.ModernAsyncTask.C1054d.<clinit>():void");
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$e */
    public static class C1055e<Data> {

        /* renamed from: a */
        public final ModernAsyncTask f4009a;

        /* renamed from: b */
        public final Data[] f4010b;

        public C1055e(ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.f4009a = modernAsyncTask;
            this.f4010b = dataArr;
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$f */
    public static class C1056f extends Handler {
        public C1056f() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            C1055e eVar = (C1055e) message.obj;
            int i = message.what;
            if (i == 1) {
                ModernAsyncTask modernAsyncTask = eVar.f4009a;
                Data data = eVar.f4010b[0];
                if (modernAsyncTask.f4003e.get()) {
                    modernAsyncTask.mo4340b(data);
                } else {
                    modernAsyncTask.mo4341c(data);
                }
                modernAsyncTask.f4002d = Status.FINISHED;
            } else if (i == 2) {
                eVar.f4009a.getClass();
            }
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$g */
    public static abstract class C1057g<Params, Result> implements Callable<Result> {

        /* renamed from: b */
        public Params[] f4011b;
    }

    static {
        C1051a aVar = new C1051a();
        f3998g = new ThreadPoolExecutor(5, RecyclerView.C1119a0.FLAG_IGNORE, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(10), aVar);
    }

    public ModernAsyncTask() {
        C1052b bVar = new C1052b();
        this.f4000b = bVar;
        this.f4001c = new C1053c(bVar);
    }

    /* renamed from: a */
    public abstract Result mo4339a(Params... paramsArr);

    /* renamed from: b */
    public void mo4340b(Result result) {
    }

    /* renamed from: c */
    public void mo4341c(Result result) {
    }

    /* renamed from: d */
    public final void mo4342d(Object obj) {
        C1056f fVar;
        synchronized (ModernAsyncTask.class) {
            if (f3999h == null) {
                f3999h = new C1056f();
            }
            fVar = f3999h;
        }
        fVar.obtainMessage(1, new C1055e(this, obj)).sendToTarget();
    }
}
