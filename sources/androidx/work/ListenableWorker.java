package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.work.impl.utils.futures.C1420a;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p081f3.C4652d;
import p081f3.C4653e;
import p081f3.C4667l;
import p081f3.C4673q;
import p205p3.C6053o;
import p205p3.C6054p;
import p205p3.C6055q;
import p205p3.C6056r;
import p218q3.C6165a;
import p218q3.C6166b;
import p695od.C18728c;

public abstract class ListenableWorker {
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    /* renamed from: androidx.work.ListenableWorker$a */
    public static abstract class C1379a {

        /* renamed from: androidx.work.ListenableWorker$a$a */
        public static final class C1380a extends C1379a {

            /* renamed from: a */
            public final C1388b f5127a = C1388b.f5151b;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C1380a.class != obj.getClass()) {
                    return false;
                }
                return this.f5127a.equals(((C1380a) obj).f5127a);
            }

            public final int hashCode() {
                return this.f5127a.hashCode() + (C1380a.class.getName().hashCode() * 31);
            }

            public final String toString() {
                StringBuilder k = C13555b.m33972k("Failure {mOutputData=");
                k.append(this.f5127a);
                k.append('}');
                return k.toString();
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$b */
        public static final class C1381b extends C1379a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && C1381b.class == obj.getClass();
            }

            public final int hashCode() {
                return C1381b.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$c */
        public static final class C1382c extends C1379a {

            /* renamed from: a */
            public final C1388b f5128a;

            public C1382c() {
                this(C1388b.f5151b);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C1382c.class != obj.getClass()) {
                    return false;
                }
                return this.f5128a.equals(((C1382c) obj).f5128a);
            }

            public final int hashCode() {
                return this.f5128a.hashCode() + (C1382c.class.getName().hashCode() * 31);
            }

            public final String toString() {
                StringBuilder k = C13555b.m33972k("Success {mOutputData=");
                k.append(this.f5128a);
                k.append('}');
                return k.toString();
            }

            public C1382c(C1388b bVar) {
                this.f5128a = bVar;
            }
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.mAppContext = context;
            this.mWorkerParams = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f5135f;
    }

    public C18728c<C4652d> getForegroundInfoAsync() {
        C1420a aVar = new C1420a();
        aVar.mo5757i(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return aVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.f5130a;
    }

    public final C1388b getInputData() {
        return this.mWorkerParams.f5131b;
    }

    public final Network getNetwork() {
        return this.mWorkerParams.f5133d.f5142c;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f5134e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f5132c;
    }

    public C6165a getTaskExecutor() {
        return this.mWorkerParams.f5136g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.f5133d.f5140a;
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.f5133d.f5141b;
    }

    public C4673q getWorkerFactory() {
        return this.mWorkerParams.f5137h;
    }

    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final C18728c<Void> setForegroundAsync(C4652d dVar) {
        this.mRunInForeground = true;
        C4653e eVar = this.mWorkerParams.f5139j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        C6054p pVar = (C6054p) eVar;
        pVar.getClass();
        C1420a aVar = new C1420a();
        ((C6166b) pVar.f19296a).mo22153a(new C6053o(pVar, aVar, id, dVar, applicationContext));
        return aVar;
    }

    public C18728c<Void> setProgressAsync(C1388b bVar) {
        C4667l lVar = this.mWorkerParams.f5138i;
        getApplicationContext();
        UUID id = getId();
        C6056r rVar = (C6056r) lVar;
        rVar.getClass();
        C1420a aVar = new C1420a();
        ((C6166b) rVar.f19305b).mo22153a(new C6055q(rVar, id, bVar, aVar));
        return aVar;
    }

    public void setRunInForeground(boolean z) {
        this.mRunInForeground = z;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract C18728c<C1379a> startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
