package p482fd;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import androidx.appcompat.app.C0262r;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fd.c */
public final class C16952c {

    /* renamed from: e */
    public static final C0262r f43988e = new C0262r("MissingSplitsManagerImpl");

    /* renamed from: a */
    public final Context f43989a;

    /* renamed from: b */
    public final Runtime f43990b;

    /* renamed from: c */
    public final C16951b f43991c;

    /* renamed from: d */
    public final AtomicReference f43992d;

    public C16952c(Context context, Runtime runtime, C16951b bVar, AtomicReference atomicReference) {
        this.f43989a = context;
        this.f43990b = runtime;
        this.f43991c = bVar;
        this.f43992d = atomicReference;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        f43988e.mo978e("App '%s' is not found in PackageManager", r9.f43989a.getPackageName());
        r5 = java.util.Collections.emptySet();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0056 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo49578a() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r9.f43992d
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r9.f43992d     // Catch:{ all -> 0x020a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x020a }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x020a }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x009a
            java.util.concurrent.atomic.AtomicReference r1 = r9.f43992d     // Catch:{ all -> 0x020a }
            android.content.Context r4 = r9.f43989a     // Catch:{ all -> 0x020a }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ all -> 0x020a }
            android.content.Context r5 = r9.f43989a     // Catch:{ NameNotFoundException -> 0x0081 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0081 }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r5, r6)     // Catch:{ NameNotFoundException -> 0x0081 }
            if (r4 == 0) goto L_0x0092
            android.os.Bundle r4 = r4.metaData     // Catch:{ NameNotFoundException -> 0x0081 }
            if (r4 == 0) goto L_0x0092
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ NameNotFoundException -> 0x0081 }
            java.lang.String r6 = "com.android.vending.splits.required"
            java.lang.Object r4 = r4.get(r6)     // Catch:{ NameNotFoundException -> 0x0081 }
            boolean r4 = r5.equals(r4)     // Catch:{ NameNotFoundException -> 0x0081 }
            if (r4 == 0) goto L_0x0092
            android.content.Context r4 = r9.f43989a     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.Context r5 = r9.f43989a     // Catch:{ NameNotFoundException -> 0x0056 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r3)     // Catch:{ NameNotFoundException -> 0x0056 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ NameNotFoundException -> 0x0056 }
            r5.<init>()     // Catch:{ NameNotFoundException -> 0x0056 }
            if (r4 == 0) goto L_0x006b
            java.lang.String[] r4 = r4.splitNames     // Catch:{ NameNotFoundException -> 0x0056 }
            if (r4 == 0) goto L_0x006b
            java.util.Collections.addAll(r5, r4)     // Catch:{ NameNotFoundException -> 0x0056 }
            goto L_0x006b
        L_0x0056:
            androidx.appcompat.app.r r4 = f43988e     // Catch:{ all -> 0x020a }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x020a }
            android.content.Context r6 = r9.f43989a     // Catch:{ all -> 0x020a }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ all -> 0x020a }
            r5[r3] = r6     // Catch:{ all -> 0x020a }
            java.lang.String r6 = "App '%s' is not found in PackageManager"
            r4.mo978e(r6, r5)     // Catch:{ all -> 0x020a }
            java.util.Set r5 = java.util.Collections.emptySet()     // Catch:{ all -> 0x020a }
        L_0x006b:
            boolean r4 = r5.isEmpty()     // Catch:{ all -> 0x020a }
            if (r4 != 0) goto L_0x007f
            int r4 = r5.size()     // Catch:{ all -> 0x020a }
            if (r4 != r2) goto L_0x0092
            java.lang.String r4 = ""
            boolean r4 = r5.contains(r4)     // Catch:{ all -> 0x020a }
            if (r4 == 0) goto L_0x0092
        L_0x007f:
            r4 = 1
            goto L_0x0093
        L_0x0081:
            androidx.appcompat.app.r r4 = f43988e     // Catch:{ all -> 0x020a }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x020a }
            android.content.Context r6 = r9.f43989a     // Catch:{ all -> 0x020a }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ all -> 0x020a }
            r5[r3] = r6     // Catch:{ all -> 0x020a }
            java.lang.String r6 = "App '%s' is not found in the PackageManager"
            r4.mo978e(r6, r5)     // Catch:{ all -> 0x020a }
        L_0x0092:
            r4 = 0
        L_0x0093:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x020a }
            r1.set(r4)     // Catch:{ all -> 0x020a }
        L_0x009a:
            java.util.concurrent.atomic.AtomicReference r1 = r9.f43992d     // Catch:{ all -> 0x020a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x020a }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x020a }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x020a }
            monitor-exit(r0)     // Catch:{ all -> 0x020a }
            r0 = 2
            if (r1 == 0) goto L_0x01b2
            java.util.List r1 = r9.mo49579b()
            java.util.Iterator r1 = r1.iterator()
        L_0x00b2:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00f4
            java.lang.Object r4 = r1.next()
            android.app.ActivityManager$AppTask r4 = (android.app.ActivityManager.AppTask) r4
            android.app.ActivityManager$RecentTaskInfo r5 = r4.getTaskInfo()
            if (r5 == 0) goto L_0x00b2
            android.app.ActivityManager$RecentTaskInfo r5 = r4.getTaskInfo()
            android.content.Intent r5 = r5.baseIntent
            if (r5 == 0) goto L_0x00b2
            android.app.ActivityManager$RecentTaskInfo r5 = r4.getTaskInfo()
            android.content.Intent r5 = r5.baseIntent
            android.content.ComponentName r5 = r5.getComponent()
            if (r5 == 0) goto L_0x00b2
            android.app.ActivityManager$RecentTaskInfo r4 = r4.getTaskInfo()
            android.content.Intent r4 = r4.baseIntent
            android.content.ComponentName r4 = r4.getComponent()
            java.lang.String r4 = r4.getClassName()
            java.lang.Class<com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity> r5 = com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class
            java.lang.String r5 = r5.getName()
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00b2
            goto L_0x01b1
        L_0x00f4:
            java.util.List r1 = r9.mo49579b()
            java.util.Iterator r1 = r1.iterator()
        L_0x00fc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0156
            java.lang.Object r4 = r1.next()
            android.app.ActivityManager$AppTask r4 = (android.app.ActivityManager.AppTask) r4
            android.app.ActivityManager$RecentTaskInfo r4 = r4.getTaskInfo()
            if (r4 == 0) goto L_0x00fc
            android.content.Intent r5 = r4.baseIntent
            if (r5 == 0) goto L_0x00fc
            android.content.ComponentName r5 = r5.getComponent()
            if (r5 == 0) goto L_0x00fc
            android.content.Intent r4 = r4.baseIntent
            android.content.ComponentName r4 = r4.getComponent()
            java.lang.String r5 = r4.getClassName()
            java.lang.Class r4 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x013b }
        L_0x0126:
            if (r4 == 0) goto L_0x00fc
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0131
            goto L_0x0152
        L_0x0131:
            java.lang.Class r5 = r4.getSuperclass()
            if (r5 == r4) goto L_0x0139
            r4 = r5
            goto L_0x0126
        L_0x0139:
            r4 = 0
            goto L_0x0126
        L_0x013b:
            androidx.appcompat.app.r r6 = f43988e
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r3] = r5
            java.lang.String r5 = "ClassNotFoundException when scanning class hierarchy of '%s'"
            r6.mo978e(r5, r7)
            android.content.Context r5 = r9.f43989a     // Catch:{ NameNotFoundException -> 0x0154 }
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0154 }
            android.content.pm.ActivityInfo r4 = r5.getActivityInfo(r4, r3)     // Catch:{ NameNotFoundException -> 0x0154 }
            if (r4 == 0) goto L_0x00fc
        L_0x0152:
            r1 = 1
            goto L_0x0157
        L_0x0154:
            goto L_0x00fc
        L_0x0156:
            r1 = 0
        L_0x0157:
            fd.b r4 = r9.f43991c
            r4.getClass()
            androidx.appcompat.app.r r5 = p482fd.C16951b.f43985c
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r7 = "Disabling all non-activity components"
            r5.mo977d(r7, r6)
            java.util.List r5 = r4.mo49576a()
            r4.mo49577b(r0, r5)
            java.util.List r0 = r9.mo49579b()
            java.util.Iterator r0 = r0.iterator()
        L_0x0174:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0184
            java.lang.Object r4 = r0.next()
            android.app.ActivityManager$AppTask r4 = (android.app.ActivityManager.AppTask) r4
            r4.finishAndRemoveTask()
            goto L_0x0174
        L_0x0184:
            if (r1 == 0) goto L_0x01ac
            android.content.Context r0 = r9.f43989a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.ComponentName r1 = new android.content.ComponentName
            android.content.Context r4 = r9.f43989a
            java.lang.Class<com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity> r5 = com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class
            r1.<init>(r4, r5)
            r0.setComponentEnabledSetting(r1, r2, r2)
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r9.f43989a
            java.lang.Class<com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity> r4 = com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class
            r0.<init>(r1, r4)
            r1 = 884998144(0x34c00000, float:3.5762787E-7)
            android.content.Intent r0 = r0.addFlags(r1)
            android.content.Context r1 = r9.f43989a
            r1.startActivity(r0)
        L_0x01ac:
            java.lang.Runtime r0 = r9.f43990b
            r0.exit(r3)
        L_0x01b1:
            return r2
        L_0x01b2:
            fd.b r1 = r9.f43991c
            java.util.List r4 = r1.mo49576a()
            java.util.Iterator r4 = r4.iterator()
        L_0x01bc:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01e4
            java.lang.Object r5 = r4.next()
            android.content.pm.ComponentInfo r5 = (android.content.pm.ComponentInfo) r5
            android.content.pm.PackageManager r6 = r1.f43987b
            android.content.ComponentName r7 = new android.content.ComponentName
            java.lang.String r8 = r5.packageName
            java.lang.String r5 = r5.name
            r7.<init>(r8, r5)
            int r5 = r6.getComponentEnabledSetting(r7)
            if (r5 == r0) goto L_0x01bc
            androidx.appcompat.app.r r0 = p482fd.C16951b.f43985c
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "Not all non-activity components are disabled"
            r0.mo974a(r2, r1)
            r2 = 0
            goto L_0x01ed
        L_0x01e4:
            androidx.appcompat.app.r r0 = p482fd.C16951b.f43985c
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r4 = "All non-activity components are disabled"
            r0.mo974a(r4, r1)
        L_0x01ed:
            if (r2 == 0) goto L_0x0209
            fd.b r0 = r9.f43991c
            r0.getClass()
            androidx.appcompat.app.r r1 = p482fd.C16951b.f43985c
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r4 = "Resetting enabled state of all non-activity components"
            r1.mo977d(r4, r2)
            java.util.List r1 = r0.mo49576a()
            r0.mo49577b(r3, r1)
            java.lang.Runtime r0 = r9.f43990b
            r0.exit(r3)
        L_0x0209:
            return r3
        L_0x020a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x020a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p482fd.C16952c.mo49578a():boolean");
    }

    @TargetApi(21)
    /* renamed from: b */
    public final List mo49579b() {
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) this.f43989a.getSystemService("activity")).getAppTasks();
        if (appTasks != null) {
            return appTasks;
        }
        return Collections.emptyList();
    }
}
