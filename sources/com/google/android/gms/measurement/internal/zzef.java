package com.google.android.gms.measurement.internal;

import com.appboy.support.StringUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

public final class zzef extends zzf {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private List zzh;
    private String zzi;
    private int zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private long zzn = 0;
    private String zzo = null;

    public zzef(zzfy zzfy, long j) {
        super(zzfy);
        this.zzg = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0173 A[Catch:{ IllegalStateException -> 0x01c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x017c A[Catch:{ IllegalStateException -> 0x01c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01a4 A[Catch:{ IllegalStateException -> 0x01c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0234  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd() {
        /*
            r11 = this;
            com.google.android.gms.measurement.internal.zzfy r0 = r11.zzs
            android.content.Context r0 = r0.zzau()
            java.lang.String r0 = r0.getPackageName()
            com.google.android.gms.measurement.internal.zzfy r1 = r11.zzs
            android.content.Context r1 = r1.zzau()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r4 = ""
            r5 = 0
            java.lang.String r6 = "unknown"
            if (r1 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.zzfy r7 = r11.zzs
            com.google.android.gms.measurement.internal.zzeo r7 = r7.zzay()
            com.google.android.gms.measurement.internal.zzem r7 = r7.zzd()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzeo.zzn(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.zzb(r9, r8)
            goto L_0x0084
        L_0x0034:
            java.lang.String r6 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0039 }
            goto L_0x004c
        L_0x0039:
            com.google.android.gms.measurement.internal.zzfy r7 = r11.zzs
            com.google.android.gms.measurement.internal.zzeo r7 = r7.zzay()
            com.google.android.gms.measurement.internal.zzem r7 = r7.zzd()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzeo.zzn(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.zzb(r9, r8)
        L_0x004c:
            if (r6 != 0) goto L_0x0051
            java.lang.String r6 = "manual_install"
            goto L_0x005a
        L_0x0051:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x005a
            r6 = r4
        L_0x005a:
            com.google.android.gms.measurement.internal.zzfy r7 = r11.zzs     // Catch:{ NameNotFoundException -> 0x0086 }
            android.content.Context r7 = r7.zzau()     // Catch:{ NameNotFoundException -> 0x0086 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0086 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r5)     // Catch:{ NameNotFoundException -> 0x0086 }
            if (r7 == 0) goto L_0x0084
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0086 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0086 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0086 }
            if (r9 != 0) goto L_0x007b
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0086 }
            goto L_0x007c
        L_0x007b:
            r8 = r2
        L_0x007c:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0081 }
            int r3 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0081 }
            goto L_0x009c
        L_0x0081:
            r7 = r2
            r2 = r8
            goto L_0x0087
        L_0x0084:
            r8 = r2
            goto L_0x009c
        L_0x0086:
            r7 = r2
        L_0x0087:
            com.google.android.gms.measurement.internal.zzfy r8 = r11.zzs
            com.google.android.gms.measurement.internal.zzeo r8 = r8.zzay()
            com.google.android.gms.measurement.internal.zzem r8 = r8.zzd()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzeo.zzn(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.zzc(r10, r9, r2)
            r8 = r2
            r2 = r7
        L_0x009c:
            r11.zza = r0
            r11.zzd = r6
            r11.zzb = r2
            r11.zzc = r3
            r11.zze = r8
            r2 = 0
            r11.zzf = r2
            com.google.android.gms.measurement.internal.zzfy r2 = r11.zzs
            java.lang.String r2 = r2.zzw()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 1
            if (r2 != 0) goto L_0x00c7
            com.google.android.gms.measurement.internal.zzfy r2 = r11.zzs
            java.lang.String r2 = r2.zzx()
            java.lang.String r6 = "am"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x00c7
            r2 = 1
            goto L_0x00c8
        L_0x00c7:
            r2 = 0
        L_0x00c8:
            com.google.android.gms.measurement.internal.zzfy r6 = r11.zzs
            int r6 = r6.zza()
            switch(r6) {
                case 0: goto L_0x0141;
                case 1: goto L_0x0131;
                case 2: goto L_0x0129;
                case 3: goto L_0x0119;
                case 4: goto L_0x0109;
                case 5: goto L_0x0101;
                case 6: goto L_0x00f1;
                case 7: goto L_0x00e1;
                default: goto L_0x00d1;
            }
        L_0x00d1:
            com.google.android.gms.measurement.internal.zzfy r7 = r11.zzs
            com.google.android.gms.measurement.internal.zzeo r7 = r7.zzay()
            com.google.android.gms.measurement.internal.zzem r7 = r7.zzi()
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
            r7.zza(r8)
            goto L_0x0148
        L_0x00e1:
            com.google.android.gms.measurement.internal.zzfy r7 = r11.zzs
            com.google.android.gms.measurement.internal.zzeo r7 = r7.zzay()
            com.google.android.gms.measurement.internal.zzem r7 = r7.zzi()
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            r7.zza(r8)
            goto L_0x0148
        L_0x00f1:
            com.google.android.gms.measurement.internal.zzfy r7 = r11.zzs
            com.google.android.gms.measurement.internal.zzeo r7 = r7.zzay()
            com.google.android.gms.measurement.internal.zzem r7 = r7.zzl()
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            r7.zza(r8)
            goto L_0x0148
        L_0x0101:
            com.google.android.gms.measurement.internal.zzfy r7 = r11.zzs
            java.lang.String r8 = "App measurement disabled via the init parameters"
            p358af.C13437d.m33710p(r7, r8)
            goto L_0x0148
        L_0x0109:
            com.google.android.gms.measurement.internal.zzfy r7 = r11.zzs
            com.google.android.gms.measurement.internal.zzeo r7 = r7.zzay()
            com.google.android.gms.measurement.internal.zzem r7 = r7.zzi()
            java.lang.String r8 = "App measurement disabled via the manifest"
            r7.zza(r8)
            goto L_0x0148
        L_0x0119:
            com.google.android.gms.measurement.internal.zzfy r7 = r11.zzs
            com.google.android.gms.measurement.internal.zzeo r7 = r7.zzay()
            com.google.android.gms.measurement.internal.zzem r7 = r7.zzi()
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            r7.zza(r8)
            goto L_0x0148
        L_0x0129:
            com.google.android.gms.measurement.internal.zzfy r7 = r11.zzs
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            p358af.C13437d.m33710p(r7, r8)
            goto L_0x0148
        L_0x0131:
            com.google.android.gms.measurement.internal.zzfy r7 = r11.zzs
            com.google.android.gms.measurement.internal.zzeo r7 = r7.zzay()
            com.google.android.gms.measurement.internal.zzem r7 = r7.zzi()
            java.lang.String r8 = "App measurement deactivated via the manifest"
            r7.zza(r8)
            goto L_0x0148
        L_0x0141:
            com.google.android.gms.measurement.internal.zzfy r7 = r11.zzs
            java.lang.String r8 = "App measurement collection enabled"
            p358af.C13437d.m33710p(r7, r8)
        L_0x0148:
            r11.zzk = r4
            r11.zzl = r4
            com.google.android.gms.measurement.internal.zzfy r7 = r11.zzs
            r7.zzaw()
            if (r2 == 0) goto L_0x015b
            com.google.android.gms.measurement.internal.zzfy r2 = r11.zzs
            java.lang.String r2 = r2.zzw()
            r11.zzl = r2
        L_0x015b:
            com.google.android.gms.measurement.internal.zzfy r2 = r11.zzs     // Catch:{ IllegalStateException -> 0x01c3 }
            android.content.Context r2 = r2.zzau()     // Catch:{ IllegalStateException -> 0x01c3 }
            com.google.android.gms.measurement.internal.zzfy r7 = r11.zzs     // Catch:{ IllegalStateException -> 0x01c3 }
            java.lang.String r7 = r7.zzz()     // Catch:{ IllegalStateException -> 0x01c3 }
            java.lang.String r8 = "google_app_id"
            java.lang.String r2 = com.google.android.gms.measurement.internal.zzij.zzc(r2, r8, r7)     // Catch:{ IllegalStateException -> 0x01c3 }
            boolean r7 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x01c3 }
            if (r3 == r7) goto L_0x0174
            r4 = r2
        L_0x0174:
            r11.zzk = r4     // Catch:{ IllegalStateException -> 0x01c3 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x01c3 }
            if (r2 != 0) goto L_0x01a2
            com.google.android.gms.measurement.internal.zzfy r2 = r11.zzs     // Catch:{ IllegalStateException -> 0x01c3 }
            android.content.Context r2 = r2.zzau()     // Catch:{ IllegalStateException -> 0x01c3 }
            com.google.android.gms.measurement.internal.zzfy r3 = r11.zzs     // Catch:{ IllegalStateException -> 0x01c3 }
            java.lang.String r3 = r3.zzz()     // Catch:{ IllegalStateException -> 0x01c3 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch:{ IllegalStateException -> 0x01c3 }
            android.content.res.Resources r4 = r2.getResources()     // Catch:{ IllegalStateException -> 0x01c3 }
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IllegalStateException -> 0x01c3 }
            if (r7 != 0) goto L_0x0196
            goto L_0x019a
        L_0x0196:
            java.lang.String r3 = com.google.android.gms.measurement.internal.zzfq.zza(r2)     // Catch:{ IllegalStateException -> 0x01c3 }
        L_0x019a:
            java.lang.String r2 = "admob_app_id"
            java.lang.String r2 = com.google.android.gms.measurement.internal.zzfq.zzb(r2, r4, r3)     // Catch:{ IllegalStateException -> 0x01c3 }
            r11.zzl = r2     // Catch:{ IllegalStateException -> 0x01c3 }
        L_0x01a2:
            if (r6 != 0) goto L_0x01d7
            com.google.android.gms.measurement.internal.zzfy r2 = r11.zzs     // Catch:{ IllegalStateException -> 0x01c3 }
            com.google.android.gms.measurement.internal.zzeo r2 = r2.zzay()     // Catch:{ IllegalStateException -> 0x01c3 }
            com.google.android.gms.measurement.internal.zzem r2 = r2.zzj()     // Catch:{ IllegalStateException -> 0x01c3 }
            java.lang.String r3 = "App measurement enabled for app package, google app id"
            java.lang.String r4 = r11.zza     // Catch:{ IllegalStateException -> 0x01c3 }
            java.lang.String r6 = r11.zzk     // Catch:{ IllegalStateException -> 0x01c3 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x01c3 }
            if (r6 == 0) goto L_0x01bd
            java.lang.String r6 = r11.zzl     // Catch:{ IllegalStateException -> 0x01c3 }
            goto L_0x01bf
        L_0x01bd:
            java.lang.String r6 = r11.zzk     // Catch:{ IllegalStateException -> 0x01c3 }
        L_0x01bf:
            r2.zzc(r3, r4, r6)     // Catch:{ IllegalStateException -> 0x01c3 }
            goto L_0x01d7
        L_0x01c3:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzfy r3 = r11.zzs
            com.google.android.gms.measurement.internal.zzeo r3 = r3.zzay()
            com.google.android.gms.measurement.internal.zzem r3 = r3.zzd()
            java.lang.Object r0 = com.google.android.gms.measurement.internal.zzeo.zzn(r0)
            java.lang.String r4 = "Fetching Google App Id failed with exception. appId"
            r3.zzc(r4, r0, r2)
        L_0x01d7:
            r0 = 0
            r11.zzh = r0
            com.google.android.gms.measurement.internal.zzfy r0 = r11.zzs
            r0.zzaw()
            com.google.android.gms.measurement.internal.zzfy r0 = r11.zzs
            com.google.android.gms.measurement.internal.zzag r0 = r0.zzf()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.zzp(r2)
            if (r0 != 0) goto L_0x01ee
            goto L_0x0223
        L_0x01ee:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0204
            com.google.android.gms.measurement.internal.zzfy r0 = r11.zzs
            com.google.android.gms.measurement.internal.zzeo r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzl()
            java.lang.String r2 = "Safelisted event list is empty. Ignoring"
            r0.zza(r2)
            goto L_0x0225
        L_0x0204:
            java.util.Iterator r2 = r0.iterator()
        L_0x0208:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0223
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.measurement.internal.zzfy r4 = r11.zzs
            com.google.android.gms.measurement.internal.zzlh r4 = r4.zzv()
            java.lang.String r6 = "safelisted event"
            boolean r3 = r4.zzab(r6, r3)
            if (r3 != 0) goto L_0x0208
            goto L_0x0225
        L_0x0223:
            r11.zzh = r0
        L_0x0225:
            if (r1 == 0) goto L_0x0234
            com.google.android.gms.measurement.internal.zzfy r0 = r11.zzs
            android.content.Context r0 = r0.zzau()
            boolean r0 = com.google.android.gms.common.wrappers.InstantApps.isInstantApp(r0)
            r11.zzj = r0
            return
        L_0x0234:
            r11.zzj = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzef.zzd():void");
    }

    public final boolean zzf() {
        return true;
    }

    public final int zzh() {
        zza();
        return this.zzj;
    }

    public final int zzi() {
        zza();
        return this.zzc;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0259  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzq zzj(java.lang.String r37) {
        /*
            r36 = this;
            r1 = r36
            r36.zzg()
            com.google.android.gms.measurement.internal.zzq r33 = new com.google.android.gms.measurement.internal.zzq
            java.lang.String r3 = r36.zzl()
            java.lang.String r4 = r36.zzm()
            r36.zza()
            java.lang.String r5 = r1.zzb
            r36.zza()
            int r0 = r1.zzc
            long r6 = (long) r0
            r36.zza()
            java.lang.String r0 = r1.zzd
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r8 = r1.zzd
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzs
            com.google.android.gms.measurement.internal.zzag r0 = r0.zzf()
            r0.zzh()
            r36.zza()
            r36.zzg()
            long r9 = r1.zzf
            r2 = 0
            r11 = 0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x00c6
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzs
            com.google.android.gms.measurement.internal.zzlh r9 = r0.zzv()
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzs
            android.content.Context r0 = r0.zzau()
            com.google.android.gms.measurement.internal.zzfy r10 = r1.zzs
            android.content.Context r10 = r10.zzau()
            java.lang.String r10 = r10.getPackageName()
            r9.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            android.content.pm.PackageManager r13 = r0.getPackageManager()
            java.security.MessageDigest r14 = com.google.android.gms.measurement.internal.zzlh.zzF()
            r15 = -1
            if (r14 != 0) goto L_0x006f
            com.google.android.gms.measurement.internal.zzfy r0 = r9.zzs
            java.lang.String r9 = "Could not get MD5 instance"
            p379.C16530d.m42018k(r0, r9)
            goto L_0x00b1
        L_0x006f:
            if (r13 == 0) goto L_0x00c3
            boolean r10 = r9.zzag(r0, r10)     // Catch:{ NameNotFoundException -> 0x00b3 }
            if (r10 != 0) goto L_0x00c3
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x00b3 }
            com.google.android.gms.measurement.internal.zzfy r10 = r9.zzs     // Catch:{ NameNotFoundException -> 0x00b3 }
            android.content.Context r10 = r10.zzau()     // Catch:{ NameNotFoundException -> 0x00b3 }
            java.lang.String r10 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x00b3 }
            r13 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r10, r13)     // Catch:{ NameNotFoundException -> 0x00b3 }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x00b3 }
            if (r0 == 0) goto L_0x00a2
            int r10 = r0.length     // Catch:{ NameNotFoundException -> 0x00b3 }
            if (r10 <= 0) goto L_0x00a2
            r0 = r0[r2]     // Catch:{ NameNotFoundException -> 0x00b3 }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x00b3 }
            byte[] r0 = r14.digest(r0)     // Catch:{ NameNotFoundException -> 0x00b3 }
            long r9 = com.google.android.gms.measurement.internal.zzlh.zzp(r0)     // Catch:{ NameNotFoundException -> 0x00b3 }
            r11 = r9
            goto L_0x00c3
        L_0x00a2:
            com.google.android.gms.measurement.internal.zzfy r0 = r9.zzs     // Catch:{ NameNotFoundException -> 0x00b3 }
            com.google.android.gms.measurement.internal.zzeo r0 = r0.zzay()     // Catch:{ NameNotFoundException -> 0x00b3 }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzk()     // Catch:{ NameNotFoundException -> 0x00b3 }
            java.lang.String r10 = "Could not get signatures"
            r0.zza(r10)     // Catch:{ NameNotFoundException -> 0x00b3 }
        L_0x00b1:
            r11 = r15
            goto L_0x00c3
        L_0x00b3:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfy r9 = r9.zzs
            com.google.android.gms.measurement.internal.zzeo r9 = r9.zzay()
            com.google.android.gms.measurement.internal.zzem r9 = r9.zzd()
            java.lang.String r10 = "Package name not found"
            r9.zzb(r10, r0)
        L_0x00c3:
            r1.zzf = r11
            goto L_0x00c7
        L_0x00c6:
            r11 = r9
        L_0x00c7:
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzs
            boolean r14 = r0.zzJ()
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzs
            com.google.android.gms.measurement.internal.zzfd r0 = r0.zzm()
            boolean r0 = r0.zzk
            r9 = 1
            r15 = r0 ^ 1
            r36.zzg()
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzs
            boolean r0 = r0.zzJ()
            r10 = 0
            if (r0 != 0) goto L_0x00e5
            goto L_0x0110
        L_0x00e5:
            com.google.android.gms.internal.measurement.zzpf.zzc()
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzs
            com.google.android.gms.measurement.internal.zzag r0 = r0.zzf()
            com.google.android.gms.measurement.internal.zzea r13 = com.google.android.gms.measurement.internal.zzeb.zzaa
            boolean r0 = r0.zzs(r10, r13)
            if (r0 == 0) goto L_0x00fe
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzs
            java.lang.String r2 = "Disabled IID for tests."
            p358af.C13437d.m33710p(r0, r2)
            goto L_0x0110
        L_0x00fe:
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzs     // Catch:{ ClassNotFoundException -> 0x0161 }
            android.content.Context r0 = r0.zzau()     // Catch:{ ClassNotFoundException -> 0x0161 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0161 }
            java.lang.String r13 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r0 = r0.loadClass(r13)     // Catch:{ ClassNotFoundException -> 0x0161 }
            if (r0 != 0) goto L_0x0113
        L_0x0110:
            r16 = r10
            goto L_0x0164
        L_0x0113:
            java.lang.Class[] r10 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x0152 }
            java.lang.Class<android.content.Context> r13 = android.content.Context.class
            r10[r2] = r13     // Catch:{ Exception -> 0x0152 }
            java.lang.String r13 = "getInstance"
            java.lang.reflect.Method r10 = r0.getDeclaredMethod(r13, r10)     // Catch:{ Exception -> 0x0152 }
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0152 }
            com.google.android.gms.measurement.internal.zzfy r13 = r1.zzs     // Catch:{ Exception -> 0x0152 }
            android.content.Context r13 = r13.zzau()     // Catch:{ Exception -> 0x0152 }
            r9[r2] = r13     // Catch:{ Exception -> 0x0152 }
            r13 = 0
            java.lang.Object r9 = r10.invoke(r13, r9)     // Catch:{ Exception -> 0x0152 }
            if (r9 != 0) goto L_0x0131
            goto L_0x0161
        L_0x0131:
            java.lang.String r10 = "getFirebaseInstanceId"
            java.lang.Class[] r13 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0142 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r10, r13)     // Catch:{ Exception -> 0x0142 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0142 }
            java.lang.Object r0 = r0.invoke(r9, r2)     // Catch:{ Exception -> 0x0142 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0142 }
            goto L_0x0162
        L_0x0142:
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzs
            com.google.android.gms.measurement.internal.zzeo r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzl()
            java.lang.String r2 = "Failed to retrieve Firebase Instance Id"
            r0.zza(r2)
            goto L_0x0161
        L_0x0152:
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzs
            com.google.android.gms.measurement.internal.zzeo r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzm()
            java.lang.String r2 = "Failed to obtain Firebase Analytics instance"
            r0.zza(r2)
        L_0x0161:
            r0 = 0
        L_0x0162:
            r16 = r0
        L_0x0164:
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzs
            com.google.android.gms.measurement.internal.zzfd r2 = r0.zzm()
            com.google.android.gms.measurement.internal.zzez r2 = r2.zzc
            long r9 = r2.zza()
            r17 = 0
            int r2 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x017d
            long r9 = r0.zzc
            r20 = r9
            r19 = r14
            goto L_0x0187
        L_0x017d:
            r19 = r14
            long r13 = r0.zzc
            long r9 = java.lang.Math.min(r13, r9)
            r20 = r9
        L_0x0187:
            r36.zza()
            int r0 = r1.zzj
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzs
            com.google.android.gms.measurement.internal.zzag r2 = r2.zzf()
            boolean r22 = r2.zzr()
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzs
            com.google.android.gms.measurement.internal.zzfd r2 = r2.zzm()
            r2.zzg()
            android.content.SharedPreferences r2 = r2.zza()
            java.lang.String r9 = "deferred_analytics_collection"
            r10 = 0
            boolean r23 = r2.getBoolean(r9, r10)
            r36.zza()
            java.lang.String r14 = r1.zzl
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzs
            com.google.android.gms.measurement.internal.zzag r2 = r2.zzf()
            java.lang.String r9 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r2 = r2.zzk(r9)
            if (r2 != 0) goto L_0x01bf
            r2 = 0
            goto L_0x01c9
        L_0x01bf:
            boolean r2 = r2.booleanValue()
            r2 = r2 ^ 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
        L_0x01c9:
            r25 = r2
            long r9 = r1.zzg
            java.util.List r13 = r1.zzh
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzs
            com.google.android.gms.measurement.internal.zzfd r2 = r2.zzm()
            com.google.android.gms.measurement.internal.zzai r2 = r2.zzc()
            java.lang.String r30 = r2.zzh()
            java.lang.String r2 = r1.zzi
            if (r2 != 0) goto L_0x0204
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzs
            com.google.android.gms.measurement.internal.zzag r2 = r2.zzf()
            r17 = r9
            com.google.android.gms.measurement.internal.zzea r9 = com.google.android.gms.measurement.internal.zzeb.zzax
            r10 = 0
            boolean r2 = r2.zzs(r10, r9)
            if (r2 == 0) goto L_0x01ff
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzs
            com.google.android.gms.measurement.internal.zzlh r2 = r2.zzv()
            java.lang.String r2 = r2.zzC()
            r1.zzi = r2
            goto L_0x0206
        L_0x01ff:
            java.lang.String r2 = ""
            r1.zzi = r2
            goto L_0x0206
        L_0x0204:
            r17 = r9
        L_0x0206:
            java.lang.String r2 = r1.zzi
            com.google.android.gms.internal.measurement.zzoz.zzc()
            com.google.android.gms.measurement.internal.zzfy r9 = r1.zzs
            com.google.android.gms.measurement.internal.zzag r9 = r9.zzf()
            com.google.android.gms.measurement.internal.zzea r10 = com.google.android.gms.measurement.internal.zzeb.zzas
            r24 = r2
            r2 = 0
            boolean r9 = r9.zzs(r2, r10)
            if (r9 == 0) goto L_0x0259
            r36.zzg()
            long r9 = r1.zzn
            r26 = 0
            int r2 = (r9 > r26 ? 1 : (r9 == r26 ? 0 : -1))
            if (r2 != 0) goto L_0x022c
            r27 = r13
            r26 = r14
            goto L_0x024f
        L_0x022c:
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzs
            com.google.android.gms.common.util.Clock r2 = r2.zzav()
            long r9 = r2.currentTimeMillis()
            r27 = r13
            r26 = r14
            long r13 = r1.zzn
            long r9 = r9 - r13
            java.lang.String r2 = r1.zzm
            if (r2 == 0) goto L_0x024f
            r13 = 86400000(0x5265c00, double:4.2687272E-316)
            int r2 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r2 <= 0) goto L_0x024f
            java.lang.String r2 = r1.zzo
            if (r2 != 0) goto L_0x024f
            r36.zzo()
        L_0x024f:
            java.lang.String r2 = r1.zzm
            if (r2 != 0) goto L_0x0256
            r36.zzo()
        L_0x0256:
            java.lang.String r2 = r1.zzm
            goto L_0x025d
        L_0x0259:
            r27 = r13
            r26 = r14
        L_0x025d:
            r32 = r2
            r9 = 73000(0x11d28, double:3.6067E-319)
            r34 = r17
            r17 = 0
            r29 = 0
            r31 = r24
            r2 = r33
            r28 = r27
            r13 = r37
            r24 = r26
            r14 = r19
            r19 = r20
            r21 = r0
            r26 = r34
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (long) r6, (java.lang.String) r8, (long) r9, (long) r11, (java.lang.String) r13, (boolean) r14, (boolean) r15, (java.lang.String) r16, (long) r17, (long) r19, (int) r21, (boolean) r22, (boolean) r23, (java.lang.String) r24, (java.lang.Boolean) r25, (long) r26, (java.util.List) r28, (java.lang.String) r29, (java.lang.String) r30, (java.lang.String) r31, (java.lang.String) r32)
            return r33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzef.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzq");
    }

    public final String zzk() {
        zza();
        return this.zzl;
    }

    public final String zzl() {
        zza();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    public final String zzm() {
        zzg();
        zza();
        Preconditions.checkNotNull(this.zzk);
        return this.zzk;
    }

    public final List zzn() {
        return this.zzh;
    }

    public final void zzo() {
        String str;
        String str2;
        zzg();
        if (!this.zzs.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
            this.zzs.zzay().zzc().zza("Analytics Storage consent is not granted");
            str = null;
        } else {
            byte[] bArr = new byte[16];
            this.zzs.zzv().zzG().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
        }
        zzem zzc2 = this.zzs.zzay().zzc();
        Object[] objArr = new Object[1];
        if (str == null) {
            str2 = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        } else {
            str2 = "not null";
        }
        objArr[0] = str2;
        zzc2.zza(String.format("Resetting session stitching token to %s", objArr));
        this.zzm = str;
        this.zzn = this.zzs.zzav().currentTimeMillis();
    }

    public final boolean zzp(String str) {
        String str2 = this.zzo;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.zzo = str;
        return z;
    }
}
