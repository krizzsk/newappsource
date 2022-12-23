package com.moovit.sdk.utils;

import android.content.Context;
import android.content.Intent;

public class WorkManagerReceiver extends SafeBroadcastReceiver {
    /* renamed from: b */
    public static void m17339b(Context context, String str) {
        Intent intent = new Intent(context, WorkManagerReceiver.class);
        intent.setAction(str);
        context.sendBroadcast(intent);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23871a(android.content.Context r12, android.content.Intent r13) {
        /*
            r11 = this;
            java.lang.String r13 = r13.getAction()
            java.lang.String r13 = p977zz.C20964s0.m49106x(r13)
            r13.getClass()
            int r0 = r13.hashCode()
            r1 = 0
            r2 = 1
            switch(r0) {
                case -1698664946: goto L_0x007f;
                case -1414957191: goto L_0x0074;
                case -889174130: goto L_0x0069;
                case -869692003: goto L_0x005e;
                case -817754730: goto L_0x0053;
                case -294802095: goto L_0x0048;
                case 593423121: goto L_0x003d;
                case 744360640: goto L_0x0032;
                case 951159571: goto L_0x0024;
                case 1652345808: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x008a
        L_0x0016:
            java.lang.String r0 = "com.moovit.sdk.action.CANCEL_MAINTENANCE_JOBS"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0020
            goto L_0x008a
        L_0x0020:
            r0 = 9
            goto L_0x008b
        L_0x0024:
            java.lang.String r0 = "com.moovit.sdk.action.SCHEDULE_MAINTENANCE_JOBS"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x002e
            goto L_0x008a
        L_0x002e:
            r0 = 8
            goto L_0x008b
        L_0x0032:
            java.lang.String r0 = "com.moovit.sdk.action.CANCEL_CREATE_USER"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x003b
            goto L_0x008a
        L_0x003b:
            r0 = 7
            goto L_0x008b
        L_0x003d:
            java.lang.String r0 = "com.moovit.sdk.action.SCEHDULE_PROFILERS_STATE"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0046
            goto L_0x008a
        L_0x0046:
            r0 = 6
            goto L_0x008b
        L_0x0048:
            java.lang.String r0 = "com.moovit.sdk.action.SCHEDULE_PROFILER_DATA_UPLOAD"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0051
            goto L_0x008a
        L_0x0051:
            r0 = 5
            goto L_0x008b
        L_0x0053:
            java.lang.String r0 = "com.moovit.sdk.action.SCHEDULE_WIFI_SCAN"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x005c
            goto L_0x008a
        L_0x005c:
            r0 = 4
            goto L_0x008b
        L_0x005e:
            java.lang.String r0 = "com.moovit.sdk.action.SCHEDULE_CREATE_USER"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0067
            goto L_0x008a
        L_0x0067:
            r0 = 3
            goto L_0x008b
        L_0x0069:
            java.lang.String r0 = "com.moovit.sdk.action.CANCEL_PROFILER_DATA_UPLOAD"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0072
            goto L_0x008a
        L_0x0072:
            r0 = 2
            goto L_0x008b
        L_0x0074:
            java.lang.String r0 = "com.moovit.sdk.action.CANCEL_WIFI_SCAN"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x007d
            goto L_0x008a
        L_0x007d:
            r0 = 1
            goto L_0x008b
        L_0x007f:
            java.lang.String r0 = "com.moovit.sdk.action.CANCEL_PROFILERS_STATE"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            r0 = 0
            goto L_0x008b
        L_0x008a:
            r0 = -1
        L_0x008b:
            switch(r0) {
                case 0: goto L_0x02c2;
                case 1: goto L_0x02ac;
                case 2: goto L_0x0295;
                case 3: goto L_0x024b;
                case 4: goto L_0x01e6;
                case 5: goto L_0x0174;
                case 6: goto L_0x0124;
                case 7: goto L_0x010d;
                case 8: goto L_0x00b2;
                case 9: goto L_0x009a;
                default: goto L_0x008e;
            }
        L_0x008e:
            com.moovit.commons.utils.ApplicationBugException r12 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.String r0 = "WorkManagerReceiver received unrecognized action: "
            java.lang.String r13 = p379.C25541a.m63881k(r0, r13)
            r12.<init>((java.lang.String) r13)
            throw r12
        L_0x009a:
            s0.b r13 = com.moovit.sdk.maintenance.SdkMaintenanceManager.f43000a
            com.moovit.sdk.profilers.ProfilerLog r13 = com.moovit.sdk.profilers.ProfilerLog.m41879c(r12)
            java.lang.String r0 = "SdkMaintenanceManager"
            java.lang.String r1 = "stopScheduleSdkMaintenanceJobs"
            r13.mo49244b(r0, r1)
            g3.k r12 = p092g3.C4763k.m12079g(r12)
            java.lang.String r13 = "sdk_maintenance_job"
            r12.mo20275e(r13)
            goto L_0x02d8
        L_0x00b2:
            s0.b r13 = com.moovit.sdk.maintenance.SdkMaintenanceManager.f43000a
            g3.k r13 = p092g3.C4763k.m12079g(r12)
            s0.b r0 = com.moovit.sdk.maintenance.SdkMaintenanceManager.f43000a
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x010a }
            java.util.Collection r2 = r0.values()     // Catch:{ all -> 0x010a }
            r1.<init>(r2)     // Catch:{ all -> 0x010a }
            monitor-exit(r0)     // Catch:{ all -> 0x010a }
            java.util.Iterator r0 = r1.iterator()
        L_0x00c9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02d8
            java.lang.Object r1 = r0.next()
            l70.a r1 = (l70.C18178a) r1
            f3.k r2 = r1.mo50599b()
            java.lang.String r3 = "sdk_maintenance_job#"
            java.lang.StringBuilder r3 = p379.C13555b.m33972k(r3)
            java.lang.String r1 = r1.mo50598a()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            androidx.work.ExistingPeriodicWorkPolicy r3 = androidx.work.ExistingPeriodicWorkPolicy.KEEP
            r13.mo20276f(r1, r3, r2)
            com.moovit.sdk.profilers.ProfilerLog r2 = com.moovit.sdk.profilers.ProfilerLog.m41879c(r12)
            java.lang.String r3 = "SdkMaintenanceManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Scheduled maintenance job: "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.mo49244b(r3, r1)
            goto L_0x00c9
        L_0x010a:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x010a }
            throw r12
        L_0x010d:
            g3.k r12 = p092g3.C4763k.m12079g(r12)
            r12.getClass()
            p3.c r13 = new p3.c
            java.lang.String r0 = "sdk_create_user"
            r13.<init>(r12, r0, r2)
            q3.a r12 = r12.f16073d
            q3.b r12 = (p218q3.C6166b) r12
            r12.mo22153a(r13)
            goto L_0x02d8
        L_0x0124:
            f00.g$a r13 = com.moovit.sdk.profilers.ProfilersStateWorker.f43015b
            android.content.Context r13 = r12.getApplicationContext()
            com.moovit.sdk.profilers.ProfilerLog r13 = com.moovit.sdk.profilers.ProfilerLog.m41879c(r13)
            java.lang.String r0 = "ProfilersStateWorker"
            java.lang.String r2 = "Scheduling profiler state service"
            r13.mo49244b(r0, r2)
            f00.g$a r13 = com.moovit.sdk.profilers.ProfilersStateWorker.f43015b
            java.lang.String r0 = "profilers_state_service_prefs"
            android.content.SharedPreferences r0 = r12.getSharedPreferences(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r13.mo49545d(r0, r1)
            f3.k$a r13 = new f3.k$a
            java.lang.Class<com.moovit.sdk.profilers.ProfilersStateWorker> r3 = com.moovit.sdk.profilers.ProfilersStateWorker.class
            r4 = 8
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.HOURS
            r7 = 1
            r2 = r13
            r6 = r9
            r2.<init>(r3, r4, r6, r7, r9)
            java.lang.String r0 = "sdk_profilers_state_task"
            f3.o$a r13 = r13.mo20189a(r0)
            f3.k$a r13 = (p081f3.C4665k.C4666a) r13
            androidx.work.BackoffPolicy r1 = androidx.work.BackoffPolicy.LINEAR
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            f3.o$a r13 = r13.mo20191e(r1, r2)
            f3.k$a r13 = (p081f3.C4665k.C4666a) r13
            f3.o r13 = r13.mo20190b()
            f3.k r13 = (p081f3.C4665k) r13
            g3.k r12 = p092g3.C4763k.m12079g(r12)
            androidx.work.ExistingPeriodicWorkPolicy r1 = androidx.work.ExistingPeriodicWorkPolicy.KEEP
            r12.mo20276f(r0, r1, r13)
            goto L_0x02d8
        L_0x0174:
            int r13 = com.moovit.sdk.profilers.ProfilerDataUploadWorker.f43002c
            com.moovit.sdk.profilers.ProfilerLog r13 = com.moovit.sdk.profilers.ProfilerLog.m41879c(r12)
            java.lang.String r0 = "ProfilerDataUploaderJob"
            java.lang.String r1 = "Schedule upload works"
            r13.mo49244b(r0, r1)
            g3.k r12 = p092g3.C4763k.m12079g(r12)
            f3.b$a r13 = new f3.b$a
            r13.<init>()
            androidx.work.NetworkType r0 = androidx.work.NetworkType.UNMETERED
            r13.f15887c = r0
            f3.b r0 = new f3.b
            r0.<init>((p081f3.C4648b.C4649a) r13)
            java.lang.String r13 = "sdk_type_origin"
            java.lang.String r1 = "task"
            java.util.HashMap r1 = p001a0.C0016g.m37u(r1, r13)
            androidx.work.b r2 = new androidx.work.b
            r2.<init>((java.util.HashMap) r1)
            androidx.work.C1388b.m3716c(r2)
            f3.k$a r1 = new f3.k$a
            java.lang.Class<com.moovit.sdk.profilers.ProfilerDataUploadWorker> r4 = com.moovit.sdk.profilers.ProfilerDataUploadWorker.class
            r5 = 24
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.HOURS
            r8 = 12
            r3 = r1
            r7 = r10
            r3.<init>(r4, r5, r7, r8, r10)
            f3.o$a r1 = r1.mo20189a(r13)
            f3.k$a r1 = (p081f3.C4665k.C4666a) r1
            java.lang.String r3 = "sdk_data_upload"
            f3.o$a r1 = r1.mo20189a(r3)
            f3.k$a r1 = (p081f3.C4665k.C4666a) r1
            f3.o$a r0 = r1.mo20192f(r0)
            f3.k$a r0 = (p081f3.C4665k.C4666a) r0
            f3.o$a r0 = r0.mo20194h(r2)
            f3.k$a r0 = (p081f3.C4665k.C4666a) r0
            androidx.work.BackoffPolicy r1 = androidx.work.BackoffPolicy.LINEAR
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            f3.o$a r0 = r0.mo20191e(r1, r2)
            f3.k$a r0 = (p081f3.C4665k.C4666a) r0
            f3.o r0 = r0.mo20190b()
            f3.k r0 = (p081f3.C4665k) r0
            androidx.work.ExistingPeriodicWorkPolicy r1 = androidx.work.ExistingPeriodicWorkPolicy.KEEP
            r12.mo20276f(r13, r1, r0)
            com.moovit.sdk.profilers.ProfilerDataUploadWorker.m41875b(r12)
            goto L_0x02d8
        L_0x01e6:
            com.moovit.sdk.profilers.wifiscan.WifiScansProfiler r12 = com.moovit.sdk.profilers.wifiscan.WifiScansProfiler.m41951y(r12)
            r12.getClass()
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MINUTES
            com.moovit.sdk.profilers.config.BaseConfig r0 = r12.mo50937b()
            com.moovit.sdk.profilers.wifiscan.config.WifiScansConfig r0 = (com.moovit.sdk.profilers.wifiscan.config.WifiScansConfig) r0
            int r0 = r0.f43059f
            long r0 = (long) r0
            long r0 = r13.toMillis(r0)
            android.content.Context r12 = r12.f47186a
            int r13 = (int) r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "folder_name"
            java.lang.String r2 = "wifi_scans"
            r0.put(r1, r2)
            java.lang.String r1 = "file_name"
            java.lang.String r2 = "wifis_around.dat"
            r0.put(r1, r2)
            androidx.work.b r1 = new androidx.work.b
            r1.<init>((java.util.HashMap) r0)
            androidx.work.C1388b.m3716c(r1)
            f3.k$a r0 = new f3.k$a
            long r2 = (long) r13
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.<init>(r2, r13)
            java.lang.String r13 = "sdk_wifi_scanning"
            f3.o$a r0 = r0.mo20189a(r13)
            f3.k$a r0 = (p081f3.C4665k.C4666a) r0
            f3.o$a r0 = r0.mo20194h(r1)
            f3.k$a r0 = (p081f3.C4665k.C4666a) r0
            androidx.work.BackoffPolicy r1 = androidx.work.BackoffPolicy.LINEAR
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            f3.o$a r0 = r0.mo20191e(r1, r2)
            f3.k$a r0 = (p081f3.C4665k.C4666a) r0
            f3.o r0 = r0.mo20190b()
            f3.k r0 = (p081f3.C4665k) r0
            g3.k r12 = p092g3.C4763k.m12079g(r12)
            androidx.work.ExistingPeriodicWorkPolicy r1 = androidx.work.ExistingPeriodicWorkPolicy.REPLACE
            r12.mo20276f(r13, r1, r0)
            goto L_0x02d8
        L_0x024b:
            com.moovit.sdk.profilers.ProfilerLog r13 = com.moovit.sdk.profilers.ProfilerLog.m41879c(r12)
            java.lang.String r0 = "CreateUserTask"
            java.lang.String r1 = "Scheduling"
            r13.mo49244b(r0, r1)
            f3.b$a r13 = new f3.b$a
            r13.<init>()
            androidx.work.NetworkType r0 = androidx.work.NetworkType.CONNECTED
            r13.f15887c = r0
            f3.b r0 = new f3.b
            r0.<init>((p081f3.C4648b.C4649a) r13)
            f3.k$a r13 = new f3.k$a
            java.lang.Class<com.moovit.sdk.CreateUserWorker> r2 = com.moovit.sdk.CreateUserWorker.class
            r3 = 2
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.HOURS
            r6 = 1
            r1 = r13
            r5 = r8
            r1.<init>(r2, r3, r5, r6, r8)
            f3.o$a r13 = r13.mo20192f(r0)
            f3.k$a r13 = (p081f3.C4665k.C4666a) r13
            androidx.work.BackoffPolicy r0 = androidx.work.BackoffPolicy.LINEAR
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            f3.o$a r13 = r13.mo20191e(r0, r1)
            f3.k$a r13 = (p081f3.C4665k.C4666a) r13
            f3.o r13 = r13.mo20190b()
            f3.k r13 = (p081f3.C4665k) r13
            g3.k r12 = p092g3.C4763k.m12079g(r12)
            androidx.work.ExistingPeriodicWorkPolicy r0 = androidx.work.ExistingPeriodicWorkPolicy.KEEP
            java.lang.String r1 = "sdk_create_user"
            r12.mo20276f(r1, r0, r13)
            goto L_0x02d8
        L_0x0295:
            int r13 = com.moovit.sdk.profilers.ProfilerDataUploadWorker.f43002c
            com.moovit.sdk.profilers.ProfilerLog r13 = com.moovit.sdk.profilers.ProfilerLog.m41879c(r12)
            java.lang.String r0 = "ProfilerDataUploaderJob"
            java.lang.String r1 = "Cancel upload works"
            r13.mo49244b(r0, r1)
            g3.k r12 = p092g3.C4763k.m12079g(r12)
            java.lang.String r13 = "sdk_data_upload"
            r12.mo20275e(r13)
            goto L_0x02d8
        L_0x02ac:
            g3.k r12 = p092g3.C4763k.m12079g(r12)
            java.lang.String r13 = "sdk_wifi_scanning"
            r12.getClass()
            p3.c r0 = new p3.c
            r0.<init>(r12, r13, r2)
            q3.a r12 = r12.f16073d
            q3.b r12 = (p218q3.C6166b) r12
            r12.mo22153a(r0)
            goto L_0x02d8
        L_0x02c2:
            f00.g$a r13 = com.moovit.sdk.profilers.ProfilersStateWorker.f43015b
            java.lang.String r0 = "profilers_state_service_prefs"
            android.content.SharedPreferences r0 = r12.getSharedPreferences(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r13.mo49545d(r0, r1)
            g3.k r12 = p092g3.C4763k.m12079g(r12)
            java.lang.String r13 = "sdk_profilers_state_task"
            r12.mo20275e(r13)
        L_0x02d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.sdk.utils.WorkManagerReceiver.mo23871a(android.content.Context, android.content.Intent):void");
    }
}
