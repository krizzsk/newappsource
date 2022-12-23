package p484ff;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import p067e1.C4522y;

/* renamed from: ff.e */
public final class C16967e {

    /* renamed from: a */
    public static final AtomicInteger f44038a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: ff.e$a */
    public static class C16968a {

        /* renamed from: a */
        public final C4522y f44039a;

        /* renamed from: b */
        public final String f44040b;

        public C16968a(C4522y yVar, String str) {
            this.f44039a = yVar;
            this.f44040b = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r0 != null) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0283 A[SYNTHETIC, Splitter:B:122:0x0283] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0295 A[SYNTHETIC, Splitter:B:127:0x0295] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0328 A[SYNTHETIC, Splitter:B:163:0x0328] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x034a A[SYNTHETIC, Splitter:B:172:0x034a] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p484ff.C16967e.C16968a m42804a(android.content.Context r14, p484ff.C16991t r15) {
        /*
            android.content.pm.PackageManager r0 = r14.getPackageManager()
            java.lang.String r1 = r14.getPackageName()
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r2)     // Catch:{ NameNotFoundException -> 0x0015 }
            if (r0 == 0) goto L_0x0019
            android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0015 }
            if (r0 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0015:
            r0 = move-exception
            r0.toString()
        L_0x0019:
            android.os.Bundle r0 = android.os.Bundle.EMPTY
        L_0x001b:
            java.lang.String r1 = "gcm.n.android_channel_id"
            java.lang.String r1 = r15.mo49630e(r1)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            r4 = 3
            r5 = 0
            if (r2 >= r3) goto L_0x002a
            goto L_0x008d
        L_0x002a:
            android.content.pm.PackageManager r2 = r14.getPackageManager()     // Catch:{ NameNotFoundException -> 0x008d }
            java.lang.String r6 = r14.getPackageName()     // Catch:{ NameNotFoundException -> 0x008d }
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r6, r5)     // Catch:{ NameNotFoundException -> 0x008d }
            int r2 = r2.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x008d }
            if (r2 >= r3) goto L_0x003b
            goto L_0x008d
        L_0x003b:
            java.lang.Class<android.app.NotificationManager> r2 = android.app.NotificationManager.class
            java.lang.Object r2 = r14.getSystemService(r2)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0050
            android.app.NotificationChannel r3 = r2.getNotificationChannel(r1)
            if (r3 == 0) goto L_0x0050
            goto L_0x008e
        L_0x0050:
            java.lang.String r1 = "com.google.firebase.messaging.default_notification_channel_id"
            java.lang.String r1 = r0.getString(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0063
            android.app.NotificationChannel r3 = r2.getNotificationChannel(r1)
            if (r3 == 0) goto L_0x0063
            goto L_0x008e
        L_0x0063:
            java.lang.String r1 = "fcm_fallback_notification_channel"
            android.app.NotificationChannel r3 = r2.getNotificationChannel(r1)
            if (r3 != 0) goto L_0x008e
            android.content.res.Resources r3 = r14.getResources()
            java.lang.String r6 = r14.getPackageName()
            java.lang.String r7 = "fcm_fallback_notification_channel_label"
            java.lang.String r8 = "string"
            int r3 = r3.getIdentifier(r7, r8, r6)
            if (r3 != 0) goto L_0x0080
            java.lang.String r3 = "Misc"
            goto L_0x0084
        L_0x0080:
            java.lang.String r3 = r14.getString(r3)
        L_0x0084:
            android.app.NotificationChannel r6 = new android.app.NotificationChannel
            r6.<init>(r1, r3, r4)
            r2.createNotificationChannel(r6)
            goto L_0x008e
        L_0x008d:
            r1 = 0
        L_0x008e:
            java.lang.String r2 = r14.getPackageName()
            android.content.res.Resources r3 = r14.getResources()
            android.content.pm.PackageManager r6 = r14.getPackageManager()
            e1.y r7 = new e1.y
            r7.<init>(r14, r1)
            java.lang.String r1 = "gcm.n.title"
            java.lang.String r1 = r15.mo49629d(r2, r3, r1)
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            if (r8 != 0) goto L_0x00ae
            r7.mo20032d(r1)
        L_0x00ae:
            java.lang.String r1 = "gcm.n.body"
            java.lang.String r1 = r15.mo49629d(r2, r3, r1)
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            if (r8 != 0) goto L_0x00cb
            r7.mo20031c(r1)
            e1.x r8 = new e1.x
            r8.<init>()
            java.lang.CharSequence r1 = p067e1.C4522y.m11766b(r1)
            r8.f15619a = r1
            r7.mo20037i(r8)
        L_0x00cb:
            java.lang.String r1 = "gcm.n.icon"
            java.lang.String r1 = r15.mo49630e(r1)
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            if (r8 != 0) goto L_0x00f5
            java.lang.String r8 = "drawable"
            int r8 = r3.getIdentifier(r1, r8, r2)
            if (r8 == 0) goto L_0x00e6
            boolean r9 = m42805b(r3, r8)
            if (r9 == 0) goto L_0x00e6
            goto L_0x011a
        L_0x00e6:
            java.lang.String r8 = "mipmap"
            int r8 = r3.getIdentifier(r1, r8, r2)
            if (r8 == 0) goto L_0x00f5
            boolean r1 = m42805b(r3, r8)
            if (r1 == 0) goto L_0x00f5
            goto L_0x011a
        L_0x00f5:
            java.lang.String r1 = "com.google.firebase.messaging.default_notification_icon"
            int r1 = r0.getInt(r1, r5)
            if (r1 == 0) goto L_0x0103
            boolean r8 = m42805b(r3, r1)
            if (r8 != 0) goto L_0x010e
        L_0x0103:
            android.content.pm.ApplicationInfo r8 = r6.getApplicationInfo(r2, r5)     // Catch:{ NameNotFoundException -> 0x010a }
            int r1 = r8.icon     // Catch:{ NameNotFoundException -> 0x010a }
            goto L_0x010e
        L_0x010a:
            r8 = move-exception
            r8.toString()
        L_0x010e:
            r8 = r1
            if (r8 == 0) goto L_0x0117
            boolean r1 = m42805b(r3, r8)
            if (r1 != 0) goto L_0x011a
        L_0x0117:
            r8 = 17301651(0x1080093, float:2.4979667E-38)
        L_0x011a:
            android.app.Notification r1 = r7.f15644y
            r1.icon = r8
            java.lang.String r1 = "gcm.n.sound2"
            java.lang.String r1 = r15.mo49630e(r1)
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            if (r8 == 0) goto L_0x0130
            java.lang.String r1 = "gcm.n.sound"
            java.lang.String r1 = r15.mo49630e(r1)
        L_0x0130:
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            r9 = 2
            if (r8 == 0) goto L_0x0139
            r1 = 0
            goto L_0x016b
        L_0x0139:
            java.lang.String r8 = "default"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x0167
            java.lang.String r8 = "raw"
            int r3 = r3.getIdentifier(r1, r8, r2)
            if (r3 == 0) goto L_0x0167
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "android.resource://"
            r3.append(r8)
            r3.append(r2)
            java.lang.String r8 = "/raw/"
            r3.append(r8)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            goto L_0x016b
        L_0x0167:
            android.net.Uri r1 = android.media.RingtoneManager.getDefaultUri(r9)
        L_0x016b:
            if (r1 == 0) goto L_0x0170
            r7.mo20036h(r1)
        L_0x0170:
            java.lang.String r1 = "gcm.n.click_action"
            java.lang.String r1 = r15.mo49630e(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x018a
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r1)
            r3.setPackage(r2)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r3.setFlags(r1)
            goto L_0x01bc
        L_0x018a:
            java.lang.String r1 = "gcm.n.link_android"
            java.lang.String r1 = r15.mo49630e(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L_0x019c
            java.lang.String r1 = "gcm.n.link"
            java.lang.String r1 = r15.mo49630e(r1)
        L_0x019c:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x01a7
            android.net.Uri r1 = android.net.Uri.parse(r1)
            goto L_0x01a8
        L_0x01a7:
            r1 = 0
        L_0x01a8:
            if (r1 == 0) goto L_0x01b8
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r6 = "android.intent.action.VIEW"
            r3.<init>(r6)
            r3.setPackage(r2)
            r3.setData(r1)
            goto L_0x01bc
        L_0x01b8:
            android.content.Intent r3 = r6.getLaunchIntentForPackage(r2)
        L_0x01bc:
            java.lang.String r1 = "google.c.a.e"
            r2 = 1073741824(0x40000000, float:2.0)
            r6 = 23
            r8 = 1
            if (r3 != 0) goto L_0x01c7
            r3 = 0
            goto L_0x0230
        L_0x01c7:
            r10 = 67108864(0x4000000, float:1.5046328E-36)
            r3.addFlags(r10)
            android.os.Bundle r10 = new android.os.Bundle
            android.os.Bundle r11 = r15.f44106a
            r10.<init>(r11)
            android.os.Bundle r11 = r15.f44106a
            java.util.Set r11 = r11.keySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x01dd:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x020b
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = "google.c."
            boolean r13 = r12.startsWith(r13)
            if (r13 != 0) goto L_0x0204
            java.lang.String r13 = "gcm.n."
            boolean r13 = r12.startsWith(r13)
            if (r13 != 0) goto L_0x0204
            java.lang.String r13 = "gcm.notification."
            boolean r13 = r12.startsWith(r13)
            if (r13 == 0) goto L_0x0202
            goto L_0x0204
        L_0x0202:
            r13 = 0
            goto L_0x0205
        L_0x0204:
            r13 = 1
        L_0x0205:
            if (r13 == 0) goto L_0x01dd
            r10.remove(r12)
            goto L_0x01dd
        L_0x020b:
            r3.putExtras(r10)
            boolean r10 = r15.mo49626a(r1)
            if (r10 == 0) goto L_0x021d
            android.os.Bundle r10 = r15.mo49631g()
            java.lang.String r11 = "gcm.n.analytics_data"
            r3.putExtra(r11, r10)
        L_0x021d:
            java.util.concurrent.atomic.AtomicInteger r10 = f44038a
            int r10 = r10.incrementAndGet()
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 < r6) goto L_0x022a
            r11 = 1140850688(0x44000000, float:512.0)
            goto L_0x022c
        L_0x022a:
            r11 = 1073741824(0x40000000, float:2.0)
        L_0x022c:
            android.app.PendingIntent r3 = android.app.PendingIntent.getActivity(r14, r10, r3, r11)
        L_0x0230:
            r7.f15626g = r3
            boolean r1 = r15.mo49626a(r1)
            if (r1 != 0) goto L_0x023a
            r1 = 0
            goto L_0x0271
        L_0x023a:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r1.<init>(r3)
            android.os.Bundle r3 = r15.mo49631g()
            android.content.Intent r1 = r1.putExtras(r3)
            java.util.concurrent.atomic.AtomicInteger r3 = f44038a
            int r3 = r3.incrementAndGet()
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r11 = "com.google.firebase.MESSAGING_EVENT"
            r10.<init>(r11)
            android.content.ComponentName r11 = new android.content.ComponentName
            java.lang.String r12 = "com.google.firebase.iid.FirebaseInstanceIdReceiver"
            r11.<init>(r14, r12)
            android.content.Intent r10 = r10.setComponent(r11)
            java.lang.String r11 = "wrapped_intent"
            android.content.Intent r1 = r10.putExtra(r11, r1)
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 < r6) goto L_0x026d
            r2 = 1140850688(0x44000000, float:512.0)
        L_0x026d:
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r14, r3, r1, r2)
        L_0x0271:
            if (r1 == 0) goto L_0x0277
            android.app.Notification r2 = r7.f15644y
            r2.deleteIntent = r1
        L_0x0277:
            java.lang.String r1 = "gcm.n.color"
            java.lang.String r1 = r15.mo49630e(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x028d
            int r1 = android.graphics.Color.parseColor(r1)     // Catch:{ IllegalArgumentException -> 0x028c }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x028c }
            goto L_0x029f
        L_0x028c:
        L_0x028d:
            java.lang.String r1 = "com.google.firebase.messaging.default_notification_color"
            int r0 = r0.getInt(r1, r5)
            if (r0 == 0) goto L_0x029e
            int r14 = p090g1.C4732a.getColor(r14, r0)     // Catch:{ NotFoundException -> 0x029e }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ NotFoundException -> 0x029e }
            goto L_0x029f
        L_0x029e:
            r14 = 0
        L_0x029f:
            if (r14 == 0) goto L_0x02a7
            int r14 = r14.intValue()
            r7.f15636q = r14
        L_0x02a7:
            java.lang.String r14 = "gcm.n.sticky"
            boolean r14 = r15.mo49626a(r14)
            r14 = r14 ^ r8
            r0 = 16
            r7.mo20034f(r0, r14)
            java.lang.String r14 = "gcm.n.local_only"
            boolean r14 = r15.mo49626a(r14)
            r7.f15633n = r14
            java.lang.String r14 = "gcm.n.ticker"
            java.lang.String r14 = r15.mo49630e(r14)
            if (r14 == 0) goto L_0x02c6
            r7.mo20038j(r14)
        L_0x02c6:
            java.lang.String r14 = "gcm.n.notification_priority"
            java.lang.Integer r14 = r15.mo49627b(r14)
            r0 = -2
            if (r14 != 0) goto L_0x02d0
            goto L_0x02dc
        L_0x02d0:
            int r1 = r14.intValue()
            if (r1 < r0) goto L_0x02dc
            int r1 = r14.intValue()
            if (r1 <= r9) goto L_0x02dd
        L_0x02dc:
            r14 = 0
        L_0x02dd:
            if (r14 == 0) goto L_0x02e5
            int r14 = r14.intValue()
            r7.f15629j = r14
        L_0x02e5:
            java.lang.String r14 = "gcm.n.visibility"
            java.lang.Integer r14 = r15.mo49627b(r14)
            if (r14 != 0) goto L_0x02ee
            goto L_0x02fb
        L_0x02ee:
            int r1 = r14.intValue()
            r2 = -1
            if (r1 < r2) goto L_0x02fb
            int r1 = r14.intValue()
            if (r1 <= r8) goto L_0x02fc
        L_0x02fb:
            r14 = 0
        L_0x02fc:
            if (r14 == 0) goto L_0x0304
            int r14 = r14.intValue()
            r7.f15637r = r14
        L_0x0304:
            java.lang.String r14 = "gcm.n.notification_count"
            java.lang.Integer r14 = r15.mo49627b(r14)
            if (r14 != 0) goto L_0x030d
            goto L_0x0313
        L_0x030d:
            int r1 = r14.intValue()
            if (r1 >= 0) goto L_0x0314
        L_0x0313:
            r14 = 0
        L_0x0314:
            if (r14 == 0) goto L_0x031c
            int r14 = r14.intValue()
            r7.f15628i = r14
        L_0x031c:
            java.lang.String r14 = "gcm.n.event_time"
            java.lang.String r1 = r15.mo49630e(r14)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0334
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0331 }
            java.lang.Long r14 = java.lang.Long.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0331 }
            goto L_0x0335
        L_0x0331:
            p484ff.C16991t.m42835h(r14)
        L_0x0334:
            r14 = 0
        L_0x0335:
            if (r14 == 0) goto L_0x0341
            r7.f15630k = r8
            long r1 = r14.longValue()
            android.app.Notification r14 = r7.f15644y
            r14.when = r1
        L_0x0341:
            java.lang.String r14 = "gcm.n.vibrate_timings"
            org.json.JSONArray r14 = r15.mo49628c(r14)
            if (r14 != 0) goto L_0x034a
            goto L_0x036d
        L_0x034a:
            int r1 = r14.length()     // Catch:{ NumberFormatException | JSONException -> 0x036a }
            if (r1 <= r8) goto L_0x0362
            int r1 = r14.length()     // Catch:{ NumberFormatException | JSONException -> 0x036a }
            long[] r2 = new long[r1]     // Catch:{ NumberFormatException | JSONException -> 0x036a }
            r3 = 0
        L_0x0357:
            if (r3 >= r1) goto L_0x036e
            long r10 = r14.optLong(r3)     // Catch:{ NumberFormatException | JSONException -> 0x036a }
            r2[r3] = r10     // Catch:{ NumberFormatException | JSONException -> 0x036a }
            int r3 = r3 + 1
            goto L_0x0357
        L_0x0362:
            org.json.JSONException r1 = new org.json.JSONException     // Catch:{ NumberFormatException | JSONException -> 0x036a }
            java.lang.String r2 = "vibrateTimings have invalid length"
            r1.<init>(r2)     // Catch:{ NumberFormatException | JSONException -> 0x036a }
            throw r1     // Catch:{ NumberFormatException | JSONException -> 0x036a }
        L_0x036a:
            r14.toString()
        L_0x036d:
            r2 = 0
        L_0x036e:
            if (r2 == 0) goto L_0x0374
            android.app.Notification r14 = r7.f15644y
            r14.vibrate = r2
        L_0x0374:
            java.lang.String r14 = "gcm.n.light_settings"
            org.json.JSONArray r14 = r15.mo49628c(r14)
            if (r14 != 0) goto L_0x037d
            goto L_0x03bb
        L_0x037d:
            int[] r1 = new int[r4]
            int r2 = r14.length()     // Catch:{ JSONException -> 0x03b8, IllegalArgumentException -> 0x03b0 }
            if (r2 != r4) goto L_0x03a8
            java.lang.String r2 = r14.optString(r5)     // Catch:{ JSONException -> 0x03b8, IllegalArgumentException -> 0x03b0 }
            int r2 = android.graphics.Color.parseColor(r2)     // Catch:{ JSONException -> 0x03b8, IllegalArgumentException -> 0x03b0 }
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r2 == r3) goto L_0x03a0
            r1[r5] = r2     // Catch:{ JSONException -> 0x03b8, IllegalArgumentException -> 0x03b0 }
            int r2 = r14.optInt(r8)     // Catch:{ JSONException -> 0x03b8, IllegalArgumentException -> 0x03b0 }
            r1[r8] = r2     // Catch:{ JSONException -> 0x03b8, IllegalArgumentException -> 0x03b0 }
            int r2 = r14.optInt(r9)     // Catch:{ JSONException -> 0x03b8, IllegalArgumentException -> 0x03b0 }
            r1[r9] = r2     // Catch:{ JSONException -> 0x03b8, IllegalArgumentException -> 0x03b0 }
            goto L_0x03bc
        L_0x03a0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x03b8, IllegalArgumentException -> 0x03b0 }
            java.lang.String r2 = "Transparent color is invalid"
            r1.<init>(r2)     // Catch:{ JSONException -> 0x03b8, IllegalArgumentException -> 0x03b0 }
            throw r1     // Catch:{ JSONException -> 0x03b8, IllegalArgumentException -> 0x03b0 }
        L_0x03a8:
            org.json.JSONException r1 = new org.json.JSONException     // Catch:{ JSONException -> 0x03b8, IllegalArgumentException -> 0x03b0 }
            java.lang.String r2 = "lightSettings don't have all three fields"
            r1.<init>(r2)     // Catch:{ JSONException -> 0x03b8, IllegalArgumentException -> 0x03b0 }
            throw r1     // Catch:{ JSONException -> 0x03b8, IllegalArgumentException -> 0x03b0 }
        L_0x03b0:
            r1 = move-exception
            r14.toString()
            r1.getMessage()
            goto L_0x03bb
        L_0x03b8:
            r14.toString()
        L_0x03bb:
            r1 = 0
        L_0x03bc:
            if (r1 == 0) goto L_0x03d7
            r14 = r1[r5]
            r2 = r1[r8]
            r1 = r1[r9]
            android.app.Notification r3 = r7.f15644y
            r3.ledARGB = r14
            r3.ledOnMS = r2
            r3.ledOffMS = r1
            if (r2 == 0) goto L_0x03d1
            if (r1 == 0) goto L_0x03d1
            r5 = 1
        L_0x03d1:
            int r14 = r3.flags
            r14 = r14 & r0
            r14 = r14 | r5
            r3.flags = r14
        L_0x03d7:
            java.lang.String r14 = "gcm.n.default_sound"
            boolean r14 = r15.mo49626a(r14)
            java.lang.String r0 = "gcm.n.default_vibrate_timings"
            boolean r0 = r15.mo49626a(r0)
            if (r0 == 0) goto L_0x03e7
            r14 = r14 | 2
        L_0x03e7:
            java.lang.String r0 = "gcm.n.default_light_settings"
            boolean r0 = r15.mo49626a(r0)
            if (r0 == 0) goto L_0x03f1
            r14 = r14 | 4
        L_0x03f1:
            r7.mo20033e(r14)
            ff.e$a r14 = new ff.e$a
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r15 = r15.mo49630e(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x0403
            goto L_0x0414
        L_0x0403:
            java.lang.String r15 = "FCM-Notification:"
            java.lang.StringBuilder r15 = p379.C13555b.m33972k(r15)
            long r0 = android.os.SystemClock.uptimeMillis()
            r15.append(r0)
            java.lang.String r15 = r15.toString()
        L_0x0414:
            r14.<init>(r7, r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p484ff.C16967e.m42804a(android.content.Context, ff.t):ff.e$a");
    }

    @TargetApi(26)
    /* renamed from: b */
    public static boolean m42805b(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (resources.getDrawable(i, (Resources.Theme) null) instanceof AdaptiveIconDrawable) {
                return false;
            }
            return true;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }
}
