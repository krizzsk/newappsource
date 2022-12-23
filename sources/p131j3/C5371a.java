package p131j3;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import p081f3.C4656h;

/* renamed from: j3.a */
public final class C5371a {

    /* renamed from: a */
    public final ComponentName f17686a;

    /* renamed from: j3.a$a */
    public static /* synthetic */ class C5372a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17687a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.work.NetworkType[] r0 = androidx.work.NetworkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17687a = r0
                androidx.work.NetworkType r1 = androidx.work.NetworkType.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17687a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17687a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17687a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f17687a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.METERED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p131j3.C5371a.C5372a.<clinit>():void");
        }
    }

    static {
        C4656h.m11961e("SystemJobInfoConverter");
    }

    public C5371a(Context context) {
        this.f17686a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006a, code lost:
        if (r2 < 26) goto L_0x0071;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.job.JobInfo mo21151a(p192o3.C5956p r13, int r14) {
        /*
            r12 = this;
            f3.b r0 = r13.f19091j
            android.os.PersistableBundle r1 = new android.os.PersistableBundle
            r1.<init>()
            java.lang.String r2 = r13.f19082a
            java.lang.String r3 = "EXTRA_WORK_SPEC_ID"
            r1.putString(r3, r2)
            boolean r2 = r13.mo21936c()
            java.lang.String r3 = "EXTRA_IS_PERIODIC"
            r1.putBoolean(r3, r2)
            android.app.job.JobInfo$Builder r2 = new android.app.job.JobInfo$Builder
            android.content.ComponentName r3 = r12.f17686a
            r2.<init>(r14, r3)
            boolean r14 = r0.f15878b
            android.app.job.JobInfo$Builder r14 = r2.setRequiresCharging(r14)
            boolean r2 = r0.f15879c
            android.app.job.JobInfo$Builder r14 = r14.setRequiresDeviceIdle(r2)
            android.app.job.JobInfo$Builder r14 = r14.setExtras(r1)
            androidx.work.NetworkType r1 = r0.f15877a
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            r4 = 26
            r5 = 24
            r6 = 0
            r7 = 1
            if (r2 < r3) goto L_0x0053
            androidx.work.NetworkType r3 = androidx.work.NetworkType.TEMPORARILY_UNMETERED
            if (r1 != r3) goto L_0x0053
            android.net.NetworkRequest$Builder r1 = new android.net.NetworkRequest$Builder
            r1.<init>()
            r3 = 25
            android.net.NetworkRequest$Builder r1 = r1.addCapability(r3)
            android.net.NetworkRequest r1 = r1.build()
            r14.setRequiredNetwork(r1)
            goto L_0x008c
        L_0x0053:
            int[] r3 = p131j3.C5371a.C5372a.f17687a
            int r8 = r1.ordinal()
            r3 = r3[r8]
            r8 = 4
            r9 = 2
            r10 = 3
            if (r3 == r7) goto L_0x0088
            if (r3 == r9) goto L_0x0086
            if (r3 == r10) goto L_0x0084
            if (r3 == r8) goto L_0x006d
            r9 = 5
            if (r3 == r9) goto L_0x006a
            goto L_0x0071
        L_0x006a:
            if (r2 < r4) goto L_0x0071
            goto L_0x0089
        L_0x006d:
            if (r2 < r5) goto L_0x0071
            r8 = 3
            goto L_0x0089
        L_0x0071:
            f3.h r3 = p081f3.C4656h.m11960c()
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r6] = r1
            java.lang.String r1 = "API version too low. Cannot convert network type value %s"
            java.lang.String.format(r1, r8)
            java.lang.Throwable[] r1 = new java.lang.Throwable[r6]
            r3.mo20176a(r1)
            goto L_0x0086
        L_0x0084:
            r8 = 2
            goto L_0x0089
        L_0x0086:
            r8 = 1
            goto L_0x0089
        L_0x0088:
            r8 = 0
        L_0x0089:
            r14.setRequiredNetworkType(r8)
        L_0x008c:
            boolean r1 = r0.f15879c
            if (r1 != 0) goto L_0x009e
            androidx.work.BackoffPolicy r1 = r13.f19093l
            androidx.work.BackoffPolicy r3 = androidx.work.BackoffPolicy.LINEAR
            if (r1 != r3) goto L_0x0098
            r1 = 0
            goto L_0x0099
        L_0x0098:
            r1 = 1
        L_0x0099:
            long r8 = r13.f19094m
            r14.setBackoffCriteria(r8, r1)
        L_0x009e:
            long r8 = r13.mo21934a()
            long r10 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r10
            r10 = 0
            long r8 = java.lang.Math.max(r8, r10)
            r1 = 28
            if (r2 > r1) goto L_0x00b5
            r14.setMinimumLatency(r8)
            goto L_0x00c4
        L_0x00b5:
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x00bd
            r14.setMinimumLatency(r8)
            goto L_0x00c4
        L_0x00bd:
            boolean r1 = r13.f19098q
            if (r1 != 0) goto L_0x00c4
            r14.setImportantWhileForeground(true)
        L_0x00c4:
            if (r2 < r5) goto L_0x0100
            f3.c r1 = r0.f15884h
            java.util.HashSet r1 = r1.f15892a
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00d2
            r1 = 1
            goto L_0x00d3
        L_0x00d2:
            r1 = 0
        L_0x00d3:
            if (r1 == 0) goto L_0x0100
            f3.c r1 = r0.f15884h
            java.util.HashSet r1 = r1.f15892a
            java.util.Iterator r1 = r1.iterator()
        L_0x00dd:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00f6
            java.lang.Object r2 = r1.next()
            f3.c$a r2 = (p081f3.C4650c.C4651a) r2
            boolean r3 = r2.f15894b
            android.app.job.JobInfo$TriggerContentUri r5 = new android.app.job.JobInfo$TriggerContentUri
            android.net.Uri r2 = r2.f15893a
            r5.<init>(r2, r3)
            r14.addTriggerContentUri(r5)
            goto L_0x00dd
        L_0x00f6:
            long r1 = r0.f15882f
            r14.setTriggerContentUpdateDelay(r1)
            long r1 = r0.f15883g
            r14.setTriggerContentMaxDelay(r1)
        L_0x0100:
            r14.setPersisted(r6)
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r4) goto L_0x0111
            boolean r1 = r0.f15880d
            r14.setRequiresBatteryNotLow(r1)
            boolean r0 = r0.f15881e
            r14.setRequiresStorageNotLow(r0)
        L_0x0111:
            int r0 = r13.f19092k
            if (r0 <= 0) goto L_0x0117
            r0 = 1
            goto L_0x0118
        L_0x0117:
            r0 = 0
        L_0x0118:
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x011d
            r6 = 1
        L_0x011d:
            boolean r1 = p177n1.C5799a.m14228b()
            if (r1 == 0) goto L_0x012e
            boolean r13 = r13.f19098q
            if (r13 == 0) goto L_0x012e
            if (r0 != 0) goto L_0x012e
            if (r6 != 0) goto L_0x012e
            r14.setExpedited(true)
        L_0x012e:
            android.app.job.JobInfo r13 = r14.build()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p131j3.C5371a.mo21151a(o3.p, int):android.app.job.JobInfo");
    }
}
