package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import java.util.HashMap;
import p081f3.C4656h;
import p092g3.C4753b;
import p092g3.C4755d;
import p092g3.C4763k;

public class SystemJobService extends JobService implements C4753b {

    /* renamed from: b */
    public C4763k f5215b;

    /* renamed from: c */
    public final HashMap f5216c = new HashMap();

    static {
        C4656h.m11961e("SystemJobService");
    }

    /* renamed from: e */
    public final void mo5711e(String str, boolean z) {
        JobParameters jobParameters;
        C4656h c = C4656h.m11960c();
        String.format("%s executed on JobScheduler", new Object[]{str});
        c.mo20176a(new Throwable[0]);
        synchronized (this.f5216c) {
            jobParameters = (JobParameters) this.f5216c.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    public final void onCreate() {
        super.onCreate();
        try {
            C4763k g = C4763k.m12079g(getApplicationContext());
            this.f5215b = g;
            g.f16075f.mo20262a(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                C4656h.m11960c().mo20179f(new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C4763k kVar = this.f5215b;
        if (kVar != null) {
            C4755d dVar = kVar.f16075f;
            synchronized (dVar.f16051l) {
                dVar.f16050k.remove(this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006f, code lost:
        r2 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        if (r2 < 24) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
        r3 = new androidx.work.WorkerParameters.C1384a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007e, code lost:
        if (r9.getTriggeredContentUris() == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        r3.f5141b = java.util.Arrays.asList(r9.getTriggeredContentUris());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008e, code lost:
        if (r9.getTriggeredContentAuthorities() == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
        r3.f5140a = java.util.Arrays.asList(r9.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        if (r2 < 28) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009e, code lost:
        r3.f5142c = r9.getNetwork();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a4, code lost:
        r8.f5215b.mo20279k(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a9, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            g3.k r0 = r8.f5215b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0013
            f3.h r0 = p081f3.C4656h.m11960c()
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r0.mo20176a(r3)
            r8.jobFinished(r9, r1)
            return r2
        L_0x0013:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            r3 = 0
            android.os.PersistableBundle r4 = r9.getExtras()     // Catch:{ NullPointerException -> 0x0027 }
            if (r4 == 0) goto L_0x0027
            boolean r5 = r4.containsKey(r0)     // Catch:{ NullPointerException -> 0x0027 }
            if (r5 == 0) goto L_0x0027
            java.lang.String r0 = r4.getString(r0)     // Catch:{ NullPointerException -> 0x0027 }
            goto L_0x0028
        L_0x0027:
            r0 = r3
        L_0x0028:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L_0x0038
            f3.h r9 = p081f3.C4656h.m11960c()
            java.lang.Throwable[] r0 = new java.lang.Throwable[r2]
            r9.mo20177b(r0)
            return r2
        L_0x0038:
            java.util.HashMap r4 = r8.f5216c
            monitor-enter(r4)
            java.util.HashMap r5 = r8.f5216c     // Catch:{ all -> 0x00aa }
            boolean r5 = r5.containsKey(r0)     // Catch:{ all -> 0x00aa }
            if (r5 == 0) goto L_0x0057
            f3.h r9 = p081f3.C4656h.m11960c()     // Catch:{ all -> 0x00aa }
            java.lang.String r3 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00aa }
            r1[r2] = r0     // Catch:{ all -> 0x00aa }
            java.lang.String.format(r3, r1)     // Catch:{ all -> 0x00aa }
            java.lang.Throwable[] r0 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00aa }
            r9.mo20176a(r0)     // Catch:{ all -> 0x00aa }
            monitor-exit(r4)     // Catch:{ all -> 0x00aa }
            return r2
        L_0x0057:
            f3.h r5 = p081f3.C4656h.m11960c()     // Catch:{ all -> 0x00aa }
            java.lang.String r6 = "onStartJob for %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x00aa }
            r7[r2] = r0     // Catch:{ all -> 0x00aa }
            java.lang.String.format(r6, r7)     // Catch:{ all -> 0x00aa }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00aa }
            r5.mo20176a(r2)     // Catch:{ all -> 0x00aa }
            java.util.HashMap r2 = r8.f5216c     // Catch:{ all -> 0x00aa }
            r2.put(r0, r9)     // Catch:{ all -> 0x00aa }
            monitor-exit(r4)     // Catch:{ all -> 0x00aa }
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r2 < r4) goto L_0x00a4
            androidx.work.WorkerParameters$a r3 = new androidx.work.WorkerParameters$a
            r3.<init>()
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            if (r4 == 0) goto L_0x008a
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f5141b = r4
        L_0x008a:
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            if (r4 == 0) goto L_0x009a
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f5140a = r4
        L_0x009a:
            r4 = 28
            if (r2 < r4) goto L_0x00a4
            android.net.Network r9 = r9.getNetwork()
            r3.f5142c = r9
        L_0x00a4:
            g3.k r9 = r8.f5215b
            r9.mo20279k(r0, r3)
            return r1
        L_0x00aa:
            r9 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00aa }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onStopJob(android.app.job.JobParameters r6) {
        /*
            r5 = this;
            g3.k r0 = r5.f5215b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0010
            f3.h r6 = p081f3.C4656h.m11960c()
            java.lang.Throwable[] r0 = new java.lang.Throwable[r2]
            r6.mo20176a(r0)
            return r1
        L_0x0010:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r6 = r6.getExtras()     // Catch:{ NullPointerException -> 0x0023 }
            if (r6 == 0) goto L_0x0023
            boolean r3 = r6.containsKey(r0)     // Catch:{ NullPointerException -> 0x0023 }
            if (r3 == 0) goto L_0x0023
            java.lang.String r6 = r6.getString(r0)     // Catch:{ NullPointerException -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r6 = 0
        L_0x0024:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0034
            f3.h r6 = p081f3.C4656h.m11960c()
            java.lang.Throwable[] r0 = new java.lang.Throwable[r2]
            r6.mo20177b(r0)
            return r2
        L_0x0034:
            f3.h r0 = p081f3.C4656h.m11960c()
            java.lang.String r3 = "onStopJob for %s"
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r2] = r6
            java.lang.String.format(r3, r4)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r0.mo20176a(r2)
            java.util.HashMap r0 = r5.f5216c
            monitor-enter(r0)
            java.util.HashMap r2 = r5.f5216c     // Catch:{ all -> 0x0067 }
            r2.remove(r6)     // Catch:{ all -> 0x0067 }
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            g3.k r0 = r5.f5215b
            r0.mo20280l(r6)
            g3.k r0 = r5.f5215b
            g3.d r0 = r0.f16075f
            java.lang.Object r2 = r0.f16051l
            monitor-enter(r2)
            java.util.HashSet r0 = r0.f16049j     // Catch:{ all -> 0x0064 }
            boolean r6 = r0.contains(r6)     // Catch:{ all -> 0x0064 }
            monitor-exit(r2)     // Catch:{ all -> 0x0064 }
            r6 = r6 ^ r1
            return r6
        L_0x0064:
            r6 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0064 }
            throw r6
        L_0x0067:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStopJob(android.app.job.JobParameters):boolean");
    }
}
