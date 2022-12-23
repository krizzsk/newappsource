package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
public abstract class JobIntentService extends Service {

    /* renamed from: g */
    public static final Object f3288g = new Object();

    /* renamed from: h */
    public static final HashMap<ComponentName, C0764g> f3289h = new HashMap<>();

    /* renamed from: b */
    public C0761e f3290b;

    /* renamed from: c */
    public C0764g f3291c;

    /* renamed from: d */
    public C0757a f3292d;

    /* renamed from: e */
    public boolean f3293e = false;

    /* renamed from: f */
    public final ArrayList<C0759c> f3294f;

    /* renamed from: androidx.core.app.JobIntentService$a */
    public final class C0757a extends AsyncTask<Void, Void, Void> {
        public C0757a() {
        }

        public final Object doInBackground(Object[] objArr) {
            C0760d dVar;
            Void[] voidArr = (Void[]) objArr;
            while (true) {
                JobIntentService jobIntentService = JobIntentService.this;
                C0761e eVar = jobIntentService.f3290b;
                if (eVar != null) {
                    dVar = eVar.mo3375a();
                } else {
                    synchronized (jobIntentService.f3294f) {
                        if (jobIntentService.f3294f.size() > 0) {
                            dVar = jobIntentService.f3294f.remove(0);
                        } else {
                            dVar = null;
                        }
                    }
                }
                if (dVar == null) {
                    return null;
                }
                JobIntentService.this.mo3360d(dVar.getIntent());
                dVar.mo3373a();
            }
            while (true) {
            }
        }

        public final void onCancelled(Object obj) {
            Void voidR = (Void) obj;
            JobIntentService.this.mo3361e();
        }

        public final void onPostExecute(Object obj) {
            Void voidR = (Void) obj;
            JobIntentService.this.mo3361e();
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$b */
    public static final class C0758b extends C0764g {

        /* renamed from: d */
        public final Context f3296d;

        /* renamed from: e */
        public final PowerManager.WakeLock f3297e;

        /* renamed from: f */
        public final PowerManager.WakeLock f3298f;

        /* renamed from: g */
        public boolean f3299g;

        /* renamed from: h */
        public boolean f3300h;

        public C0758b(Context context, ComponentName componentName) {
            super(componentName);
            this.f3296d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f3297e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f3298f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        /* renamed from: a */
        public final void mo3369a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f3311a);
            if (this.f3296d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f3299g) {
                        this.f3299g = true;
                        if (!this.f3300h) {
                            this.f3297e.acquire(60000);
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        public final void mo3370c() {
            synchronized (this) {
                if (this.f3300h) {
                    if (this.f3299g) {
                        this.f3297e.acquire(60000);
                    }
                    this.f3300h = false;
                    this.f3298f.release();
                }
            }
        }

        /* renamed from: d */
        public final void mo3371d() {
            synchronized (this) {
                if (!this.f3300h) {
                    this.f3300h = true;
                    this.f3298f.acquire(600000);
                    this.f3297e.release();
                }
            }
        }

        /* renamed from: e */
        public final void mo3372e() {
            synchronized (this) {
                this.f3299g = false;
            }
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$c */
    public final class C0759c implements C0760d {

        /* renamed from: a */
        public final Intent f3301a;

        /* renamed from: b */
        public final int f3302b;

        public C0759c(Intent intent, int i) {
            this.f3301a = intent;
            this.f3302b = i;
        }

        /* renamed from: a */
        public final void mo3373a() {
            JobIntentService.this.stopSelf(this.f3302b);
        }

        public final Intent getIntent() {
            return this.f3301a;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$d */
    public interface C0760d {
        /* renamed from: a */
        void mo3373a();

        Intent getIntent();
    }

    /* renamed from: androidx.core.app.JobIntentService$e */
    public static final class C0761e extends JobServiceEngine {

        /* renamed from: a */
        public final JobIntentService f3304a;

        /* renamed from: b */
        public final Object f3305b = new Object();

        /* renamed from: c */
        public JobParameters f3306c;

        /* renamed from: androidx.core.app.JobIntentService$e$a */
        public final class C0762a implements C0760d {

            /* renamed from: a */
            public final JobWorkItem f3307a;

            public C0762a(JobWorkItem jobWorkItem) {
                this.f3307a = jobWorkItem;
            }

            /* renamed from: a */
            public final void mo3373a() {
                synchronized (C0761e.this.f3305b) {
                    JobParameters jobParameters = C0761e.this.f3306c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f3307a);
                    }
                }
            }

            public final Intent getIntent() {
                return this.f3307a.getIntent();
            }
        }

        public C0761e(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f3304a = jobIntentService;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f3304a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            return new androidx.core.app.JobIntentService.C0761e.C0762a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r1 == null) goto L_0x0024;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.core.app.JobIntentService.C0761e.C0762a mo3375a() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f3305b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f3306c     // Catch:{ all -> 0x0025 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return r2
            L_0x000a:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0025 }
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x0024
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.JobIntentService r2 = r3.f3304a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.JobIntentService$e$a r0 = new androidx.core.app.JobIntentService$e$a
                r0.<init>(r1)
                return r0
            L_0x0024:
                return r2
            L_0x0025:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.JobIntentService.C0761e.mo3375a():androidx.core.app.JobIntentService$e$a");
        }

        public final boolean onStartJob(JobParameters jobParameters) {
            this.f3306c = jobParameters;
            this.f3304a.mo3359b(false);
            return true;
        }

        public final boolean onStopJob(JobParameters jobParameters) {
            C0757a aVar = this.f3304a.f3292d;
            if (aVar != null) {
                aVar.cancel(false);
            }
            synchronized (this.f3305b) {
                this.f3306c = null;
            }
            return true;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$f */
    public static final class C0763f extends C0764g {

        /* renamed from: d */
        public final JobInfo f3309d;

        /* renamed from: e */
        public final JobScheduler f3310e;

        public C0763f(Context context, ComponentName componentName, int i) {
            super(componentName);
            mo3378b(i);
            this.f3309d = new JobInfo.Builder(i, componentName).setOverrideDeadline(0).build();
            this.f3310e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        /* renamed from: a */
        public final void mo3369a(Intent intent) {
            this.f3310e.enqueue(this.f3309d, new JobWorkItem(intent));
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$g */
    public static abstract class C0764g {

        /* renamed from: a */
        public final ComponentName f3311a;

        /* renamed from: b */
        public boolean f3312b;

        /* renamed from: c */
        public int f3313c;

        public C0764g(ComponentName componentName) {
            this.f3311a = componentName;
        }

        /* renamed from: a */
        public abstract void mo3369a(Intent intent);

        /* renamed from: b */
        public final void mo3378b(int i) {
            if (!this.f3312b) {
                this.f3312b = true;
                this.f3313c = i;
            } else if (this.f3313c != i) {
                StringBuilder r = C25541a.m63887r("Given job ID ", i, " is different than previous ");
                r.append(this.f3313c);
                throw new IllegalArgumentException(r.toString());
            }
        }

        /* renamed from: c */
        public void mo3370c() {
        }

        /* renamed from: d */
        public void mo3371d() {
        }

        /* renamed from: e */
        public void mo3372e() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3294f = null;
        } else {
            this.f3294f = new ArrayList<>();
        }
    }

    /* renamed from: a */
    public static void m2303a(Context context, Class<?> cls, int i, Intent intent) {
        ComponentName componentName = new ComponentName(context, cls);
        synchronized (f3288g) {
            C0764g c = m2304c(context, componentName, true, i);
            c.mo3378b(i);
            c.mo3369a(intent);
        }
    }

    /* renamed from: c */
    public static C0764g m2304c(Context context, ComponentName componentName, boolean z, int i) {
        C0764g gVar;
        HashMap<ComponentName, C0764g> hashMap = f3289h;
        C0764g gVar2 = hashMap.get(componentName);
        if (gVar2 != null) {
            return gVar2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            gVar = new C0758b(context, componentName);
        } else if (z) {
            gVar = new C0763f(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        C0764g gVar3 = gVar;
        hashMap.put(componentName, gVar3);
        return gVar3;
    }

    /* renamed from: b */
    public final void mo3359b(boolean z) {
        if (this.f3292d == null) {
            this.f3292d = new C0757a();
            C0764g gVar = this.f3291c;
            if (gVar != null && z) {
                gVar.mo3371d();
            }
            this.f3292d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: d */
    public abstract void mo3360d(Intent intent);

    /* renamed from: e */
    public final void mo3361e() {
        ArrayList<C0759c> arrayList = this.f3294f;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f3292d = null;
                ArrayList<C0759c> arrayList2 = this.f3294f;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    mo3359b(false);
                } else if (!this.f3293e) {
                    this.f3291c.mo3370c();
                }
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        C0761e eVar = this.f3290b;
        if (eVar != null) {
            return eVar.getBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3290b = new C0761e(this);
            this.f3291c = null;
            return;
        }
        this.f3290b = null;
        this.f3291c = m2304c(this, new ComponentName(this, getClass()), false, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<C0759c> arrayList = this.f3294f;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f3293e = true;
                this.f3291c.mo3370c();
            }
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (this.f3294f == null) {
            return 2;
        }
        this.f3291c.mo3372e();
        synchronized (this.f3294f) {
            ArrayList<C0759c> arrayList = this.f3294f;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C0759c(intent, i2));
            mo3359b(true);
        }
        return 3;
    }
}
