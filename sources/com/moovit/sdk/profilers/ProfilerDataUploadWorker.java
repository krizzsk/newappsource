package com.moovit.sdk.profilers;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.BackoffPolicy;
import androidx.work.C1388b;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import ce0.C21100e;
import e70.C4591d;
import i70.C17560a;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import n70.C18535a;
import p001a0.C0016g;
import p081f3.C4648b;
import p081f3.C4665k;
import p092g3.C4763k;
import p977zz.C20964s0;
import p988j$.util.DesugarTimeZone;
import v70.C13177m;
import y70.C13261b;

public class ProfilerDataUploadWorker extends Worker {

    /* renamed from: b */
    public static final long f43001b = TimeUnit.HOURS.toMillis(12);

    /* renamed from: c */
    public static final /* synthetic */ int f43002c = 0;

    /* renamed from: com.moovit.sdk.profilers.ProfilerDataUploadWorker$a */
    public static class C16451a implements Callable<Boolean> {

        /* renamed from: b */
        public final C13177m f43003b;

        /* renamed from: c */
        public final C18535a f43004c;

        /* renamed from: d */
        public final ProfilerLog f43005d;

        public C16451a(C13177m mVar, C18535a aVar) {
            this.f43003b = mVar;
            C21100e.m49373x(aVar, "profiler");
            this.f43004c = aVar;
            this.f43005d = ProfilerLog.m41879c(mVar.f32719a);
        }

        /* renamed from: a */
        public final byte[] mo49240a(C17560a aVar) {
            if (aVar.f45169a.length == 0) {
                ProfilerLog profilerLog = this.f43005d;
                StringBuilder k = C13555b.m33972k("Nothing to upload for ");
                k.append(this.f43004c);
                profilerLog.mo49244b("ProfilerDataUploaderJob", k.toString());
                return null;
            }
            ProfilerLog profilerLog2 = this.f43005d;
            StringBuilder k2 = C13555b.m33972k("Uploading ");
            k2.append(aVar.f45169a.length);
            k2.append(" bytes for ");
            k2.append(this.f43004c);
            profilerLog2.mo49244b("ProfilerDataUploaderJob", k2.toString());
            return aVar.f45169a;
        }

        /* renamed from: b */
        public final String mo49241b() {
            this.f43003b.f32720b.getClass();
            Object[] objArr = {Long.valueOf(System.currentTimeMillis()), C4591d.f15777f.f15781d, "5.37.2.429", Long.valueOf(this.f43004c.f47194i.mo49542a().longValue()), "0", Integer.valueOf(this.f43004c.f47188c.getRecordingType()), Integer.valueOf(this.f43004c.f47188c.getSensorType()), 1};
            String str = C20964s0.f52718a;
            return String.format((Locale) null, "%s,%s,%s,%s,%s,%s,%s,%s\n", objArr);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a5, code lost:
            if (r3 == null) goto L_0x00aa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a7, code lost:
            r3.delete();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0079, code lost:
            if (r3 != null) goto L_0x00a7;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object call() throws java.lang.Exception {
            /*
                r17 = this;
                r1 = r17
                java.lang.String r2 = "ProfilerDataUploaderJob"
                r3 = 0
                n70.a r0 = r1.f43004c     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                i70.a r0 = r0.mo50940g()     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                if (r0 != 0) goto L_0x000f
                goto L_0x00ab
            L_0x000f:
                byte[] r4 = r1.mo49240a(r0)     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                if (r4 != 0) goto L_0x0017
                goto L_0x00ab
            L_0x0017:
                java.lang.String r5 = "profiler_data"
                java.lang.String r6 = ".gzip"
                java.io.File r3 = java.io.File.createTempFile(r5, r6)     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                java.util.zip.GZIPOutputStream r5 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                r6.<init>(r3)     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                r5.<init>(r6)     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                java.lang.String r6 = r17.mo49241b()     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                java.nio.charset.Charset r7 = p977zz.C20964s0.f52719b     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                byte[] r6 = r6.getBytes(r7)     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                r5.write(r6)     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                r5.write(r4)     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                r5.close()     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                v70.m r8 = r1.f43003b     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                com.moovit.sdk.requests.UploadDataType r9 = com.moovit.sdk.requests.UploadDataType.SENSOR_DATA     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                java.lang.Long r4 = r0.f45170b     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                long r10 = r4.longValue()     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                java.lang.Long r4 = r0.f45171c     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                long r12 = r4.longValue()     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                java.lang.Long r4 = r0.f45172d     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                long r14 = r4.longValue()     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                java.util.List<java.lang.Integer> r0 = r0.f45173e     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                r7 = r3
                r16 = r0
                e70.C4586a.m11900b(r7, r8, r9, r10, r12, r14, r16)     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                n70.a r0 = r1.f43004c     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                r0.mo50944o()     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                com.moovit.sdk.profilers.ProfilerLog r0 = r1.f43005d     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                r4.<init>()     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                java.lang.String r5 = "Successfully uploaded data for "
                r4.append(r5)     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                n70.a r5 = r1.f43004c     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                r4.append(r5)     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                r0.mo49244b(r2, r4)     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x0080, ServerException -> 0x007e }
                if (r3 == 0) goto L_0x00aa
                goto L_0x00a7
            L_0x007c:
                r0 = move-exception
                goto L_0x00ac
            L_0x007e:
                r0 = move-exception
                goto L_0x0081
            L_0x0080:
                r0 = move-exception
            L_0x0081:
                com.moovit.sdk.profilers.ProfilerLog r4 = r1.f43005d     // Catch:{ all -> 0x007c }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x007c }
                r5.<init>()     // Catch:{ all -> 0x007c }
                java.lang.String r6 = "Failed to upload profiler ("
                r5.append(r6)     // Catch:{ all -> 0x007c }
                n70.a r6 = r1.f43004c     // Catch:{ all -> 0x007c }
                r5.append(r6)     // Catch:{ all -> 0x007c }
                java.lang.String r6 = ") data to server"
                r5.append(r6)     // Catch:{ all -> 0x007c }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x007c }
                r4.mo49244b(r2, r5)     // Catch:{ all -> 0x007c }
                com.moovit.sdk.profilers.ProfilerLog r4 = r1.f43005d     // Catch:{ all -> 0x007c }
                r4.mo49243a(r2, r0)     // Catch:{ all -> 0x007c }
                java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x007c }
                if (r3 == 0) goto L_0x00aa
            L_0x00a7:
                r3.delete()
            L_0x00aa:
                r3 = r0
            L_0x00ab:
                return r3
            L_0x00ac:
                if (r3 == 0) goto L_0x00b1
                r3.delete()
            L_0x00b1:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.sdk.profilers.ProfilerDataUploadWorker.C16451a.call():java.lang.Object");
        }
    }

    public ProfilerDataUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: b */
    public static void m41875b(C4763k kVar) {
        C4648b.C4649a aVar = new C4648b.C4649a();
        aVar.f15887c = NetworkType.CONNECTED;
        C4648b bVar = new C4648b(aVar);
        C1388b bVar2 = new C1388b(C0016g.m37u("task", "sdk_type_fallback"));
        C1388b.m3716c(bVar2);
        TimeUnit timeUnit = TimeUnit.HOURS;
        kVar.mo20276f("sdk_type_fallback", ExistingPeriodicWorkPolicy.REPLACE, (C4665k) ((C4665k.C4666a) ((C4665k.C4666a) ((C4665k.C4666a) ((C4665k.C4666a) ((C4665k.C4666a) new C4665k.C4666a(ProfilerDataUploadWorker.class, 26, timeUnit, 2, timeUnit).mo20189a("sdk_type_fallback")).mo20189a("sdk_data_upload")).mo20192f(bVar)).mo20194h(bVar2)).mo20191e(BackoffPolicy.LINEAR, TimeUnit.SECONDS)).mo20190b());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|(2:3|1)|4|5|7|8|9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0072, code lost:
        r2.shutdown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0075, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0069 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.work.ListenableWorker.C1379a mo49239a() {
        /*
            r7 = this;
            androidx.work.ListenableWorker$a$c r0 = new androidx.work.ListenableWorker$a$c
            r0.<init>()
            android.content.Context r1 = r7.getApplicationContext()
            com.moovit.sdk.profilers.ProfilerLog r2 = com.moovit.sdk.profilers.ProfilerLog.m41879c(r1)
            java.lang.String r3 = "ProfilerDataUploaderJob"
            java.lang.String r4 = "Running uploading data job"
            r2.mo49244b(r3, r4)
            zz.c0 r2 = new zz.c0
            r3 = 0
            r4 = 11
            r2.<init>(r3, r4)
            r3 = 5
            java.util.concurrent.ThreadPoolExecutor r2 = p172m9.C5720b.m14034B(r3, r2)
            n70.b r3 = n70.C18536b.m45451a()
            r3.getClass()
            java.util.List r1 = n70.C18536b.m45452b(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r1.size()
            r3.<init>(r4)
            android.content.Context r4 = r7.getApplicationContext()
            e70.d r5 = e70.C4591d.m11903a(r4)
            v70.m r6 = new v70.m
            r6.<init>(r4, r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x0046:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x005f
            java.lang.Object r4 = r1.next()
            n70.a r4 = (n70.C18535a) r4
            com.moovit.sdk.profilers.ProfilerDataUploadWorker$a r5 = new com.moovit.sdk.profilers.ProfilerDataUploadWorker$a
            r5.<init>(r6, r4)
            com.google.android.gms.tasks.Task r4 = com.google.android.gms.tasks.Tasks.call(r2, r5)
            r3.add(r4)
            goto L_0x0046
        L_0x005f:
            com.google.android.gms.tasks.Task r1 = com.google.android.gms.tasks.Tasks.whenAll((java.util.Collection<? extends com.google.android.gms.tasks.Task<?>>) r3)     // Catch:{ InterruptedException | ExecutionException -> 0x0069 }
            com.google.android.gms.tasks.Tasks.await(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0069 }
            goto L_0x006e
        L_0x0067:
            r0 = move-exception
            goto L_0x0072
        L_0x0069:
            androidx.work.ListenableWorker$a$b r0 = new androidx.work.ListenableWorker$a$b     // Catch:{ all -> 0x0067 }
            r0.<init>()     // Catch:{ all -> 0x0067 }
        L_0x006e:
            r2.shutdown()
            return r0
        L_0x0072:
            r2.shutdown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.sdk.profilers.ProfilerDataUploadWorker.mo49239a():androidx.work.ListenableWorker$a");
    }

    public final ListenableWorker.C1379a doWork() {
        ListenableWorker.C1379a cVar;
        if (Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC")).get(12) == 0) {
            return new ListenableWorker.C1379a.C1381b();
        }
        String b = getInputData().mo5691b("task");
        ProfilerLog c = ProfilerLog.m41879c(getApplicationContext());
        c.mo49244b("ProfilerDataUploaderJob:" + b, "do Work");
        boolean z = false;
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("moovit_sdk_upload_data_task", 0);
        Long l = -1L;
        C21100e.m49373x(sharedPreferences, "prefs");
        synchronized (ProfilerDataUploadWorker.class) {
            cVar = new ListenableWorker.C1379a.C1382c();
            c.mo49244b("ProfilerDataUploaderJob:" + b, "lastUploadingTaskTag " + sharedPreferences.getString("last_uploading_task_tag", ""));
            c.mo49244b("ProfilerDataUploaderJob:" + b, "lastUploadingTime " + C13261b.m33383a(Long.valueOf(sharedPreferences.getLong("first_time_scheduled", l.longValue())).longValue()));
            c.mo49244b("ProfilerDataUploaderJob:" + b, "System.currentTimeMillis() " + C13261b.m33383a(System.currentTimeMillis()));
            StringBuilder sb = new StringBuilder();
            sb.append("LAST_UPLOADING_TIME_THRESHOLD ");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long j = f43001b;
            sb.append(timeUnit.toHours(j));
            c.mo49244b("ProfilerDataUploaderJob:" + b, sb.toString());
            String str = "ProfilerDataUploaderJob:" + b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("System.currentTimeMillis() - lastUploadingTime.get() >= LAST_UPLOADING_TIME_THRESHOLD ");
            String str2 = b;
            ProfilerLog profilerLog = c;
            if (System.currentTimeMillis() - Long.valueOf(sharedPreferences.getLong("first_time_scheduled", l.longValue())).longValue() >= j) {
                z = true;
            }
            sb2.append(z);
            profilerLog.mo49244b(str, sb2.toString());
            if (System.currentTimeMillis() - Long.valueOf(sharedPreferences.getLong("first_time_scheduled", l.longValue())).longValue() >= j) {
                cVar = mo49239a();
                if (str2.equals("sdk_type_origin") && cVar.equals(new ListenableWorker.C1379a.C1382c())) {
                    m41875b(C4763k.m12079g(getApplicationContext()));
                }
                if (cVar.equals(new ListenableWorker.C1379a.C1382c())) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString("last_uploading_task_tag", str2);
                    edit.apply();
                    Long valueOf = Long.valueOf(System.currentTimeMillis());
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putLong("first_time_scheduled", valueOf.longValue());
                    edit2.apply();
                }
            }
        }
        return cVar;
    }
}
