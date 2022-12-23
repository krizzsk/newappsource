package p531he;

import com.google.android.gms.tasks.TaskCompletionSource;
import p743qd.C19107d;

/* renamed from: he.x */
public final class C17422x {

    /* renamed from: a */
    public final C19107d f44871a;

    /* renamed from: b */
    public final Object f44872b = new Object();

    /* renamed from: c */
    public TaskCompletionSource<Void> f44873c = new TaskCompletionSource<>();

    /* renamed from: d */
    public boolean f44874d = false;

    /* renamed from: e */
    public Boolean f44875e;

    /* renamed from: f */
    public final TaskCompletionSource<Void> f44876f = new TaskCompletionSource<>();

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17422x(p743qd.C19107d r7) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r6.f44872b = r0
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            r6.f44873c = r0
            r0 = 0
            r6.f44874d = r0
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource
            r1.<init>()
            r6.f44876f = r1
            r7.mo51535a()
            android.content.Context r1 = r7.f48568a
            r6.f44871a = r7
            java.lang.String r7 = "com.google.firebase.crashlytics"
            android.content.SharedPreferences r7 = r1.getSharedPreferences(r7, r0)
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r3 = r7.contains(r2)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x003d
            r6.f44874d = r0
            boolean r7 = r7.getBoolean(r2, r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x003e
        L_0x003d:
            r7 = r5
        L_0x003e:
            if (r7 != 0) goto L_0x007d
            java.lang.String r7 = "firebase_crashlytics_collection_enabled"
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r2 == 0) goto L_0x006a
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x0069 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r1 == 0) goto L_0x006a
            android.os.Bundle r2 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r2 == 0) goto L_0x006a
            boolean r2 = r2.containsKey(r7)     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r2 == 0) goto L_0x006a
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0069 }
            boolean r7 = r1.getBoolean(r7)     // Catch:{ NameNotFoundException -> 0x0069 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ NameNotFoundException -> 0x0069 }
            goto L_0x006b
        L_0x0069:
        L_0x006a:
            r7 = r5
        L_0x006b:
            if (r7 != 0) goto L_0x0071
            r6.f44874d = r0
            r7 = r5
            goto L_0x007d
        L_0x0071:
            r6.f44874d = r4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = r0.equals(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
        L_0x007d:
            r6.f44875e = r7
            java.lang.Object r7 = r6.f44872b
            monitor-enter(r7)
            boolean r0 = r6.mo49890a()     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x008d
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r0 = r6.f44873c     // Catch:{ all -> 0x008f }
            r0.trySetResult(r5)     // Catch:{ all -> 0x008f }
        L_0x008d:
            monitor-exit(r7)     // Catch:{ all -> 0x008f }
            return
        L_0x008f:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x008f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p531he.C17422x.<init>(qd.d):void");
    }

    /* renamed from: a */
    public final synchronized boolean mo49890a() {
        boolean z;
        String str;
        String str2;
        Boolean bool = this.f44875e;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = this.f44871a.mo51541j();
        }
        if (z) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f44875e == null) {
            str2 = "global Firebase setting";
        } else if (this.f44874d) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String.format("Crashlytics automatic data collection %s by %s.", new Object[]{str, str2});
        return z;
    }
}
