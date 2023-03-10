package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;

public final class zzfmh {
    @VisibleForTesting
    public final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfmh(Context context, int i) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfmi.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfmi.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i;
    }

    @VisibleForTesting
    public static String zza(zzaqu zzaqu) {
        return Hex.bytesToStringLowercase(zzaqu.zzaq().zzE());
    }

    private final File zze() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zzf() {
        int i = this.zzd;
        StringBuilder k = C13555b.m33972k("FBAMTD");
        k.append(i - 1);
        return k.toString();
    }

    private final String zzg() {
        int i = this.zzd;
        StringBuilder k = C13555b.m33972k("LATMTD");
        k.append(i - 1);
        return k.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0162  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzb(com.google.android.gms.internal.ads.zzaqr r8, com.google.android.gms.internal.ads.zzfmn r9) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzaqu r0 = r8.zzd()
            java.lang.String r0 = r0.zzk()
            com.google.android.gms.internal.ads.zzgjg r1 = r8.zzf()
            byte[] r1 = r1.zzE()
            com.google.android.gms.internal.ads.zzgjg r2 = r8.zze()
            byte[] r2 = r2.zzE()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            if (r3 != 0) goto L_0x017d
            if (r2 == 0) goto L_0x017d
            int r3 = r2.length
            if (r3 != 0) goto L_0x0026
            goto L_0x017d
        L_0x0026:
            java.io.File r3 = r7.zza
            com.google.android.gms.internal.ads.zzfmi.zzd(r3)
            java.io.File r3 = r7.zza
            r3.mkdirs()
            java.io.File r3 = r7.zza
            java.io.File r3 = com.google.android.gms.internal.ads.zzfmi.zzc(r0, r3)
            r3.mkdirs()
            java.io.File r3 = r7.zza
            java.lang.String r5 = "pcam.jar"
            java.io.File r3 = com.google.android.gms.internal.ads.zzfmi.zzb(r0, r5, r3)
            if (r1 == 0) goto L_0x004c
            int r6 = r1.length
            if (r6 <= 0) goto L_0x004c
            boolean r1 = com.google.android.gms.internal.ads.zzfmi.zze(r3, r1)
            if (r1 == 0) goto L_0x017d
        L_0x004c:
            java.io.File r1 = r7.zza
            java.lang.String r3 = "pcbc"
            java.io.File r0 = com.google.android.gms.internal.ads.zzfmi.zzb(r0, r3, r1)
            boolean r0 = com.google.android.gms.internal.ads.zzfmi.zze(r0, r2)
            if (r0 == 0) goto L_0x017d
            com.google.android.gms.internal.ads.zzaqu r0 = r8.zzd()
            java.lang.String r0 = r0.zzk()
            java.io.File r1 = r7.zza
            java.io.File r0 = com.google.android.gms.internal.ads.zzfmi.zzb(r0, r5, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0078
            if (r9 == 0) goto L_0x0078
            boolean r9 = r9.zza(r0)
            if (r9 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            return r4
        L_0x0078:
            com.google.android.gms.internal.ads.zzaqu r9 = r8.zzd()
            java.lang.String r9 = r9.zzk()
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 1
            if (r0 == 0) goto L_0x008a
        L_0x0087:
            r8 = 0
            goto L_0x0137
        L_0x008a:
            java.io.File r0 = r7.zza
            java.io.File r0 = com.google.android.gms.internal.ads.zzfmi.zzb(r9, r5, r0)
            java.io.File r2 = r7.zza
            java.io.File r2 = com.google.android.gms.internal.ads.zzfmi.zzb(r9, r3, r2)
            java.io.File r6 = r7.zze()
            java.io.File r5 = com.google.android.gms.internal.ads.zzfmi.zzb(r9, r5, r6)
            java.io.File r6 = r7.zze()
            java.io.File r9 = com.google.android.gms.internal.ads.zzfmi.zzb(r9, r3, r6)
            boolean r3 = r0.exists()
            if (r3 == 0) goto L_0x00b3
            boolean r0 = r0.renameTo(r5)
            if (r0 != 0) goto L_0x00b3
            goto L_0x0087
        L_0x00b3:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0087
            boolean r9 = r2.renameTo(r9)
            if (r9 == 0) goto L_0x0087
            com.google.android.gms.internal.ads.zzaqt r9 = com.google.android.gms.internal.ads.zzaqu.zze()
            com.google.android.gms.internal.ads.zzaqu r0 = r8.zzd()
            java.lang.String r0 = r0.zzk()
            r9.zze(r0)
            com.google.android.gms.internal.ads.zzaqu r0 = r8.zzd()
            java.lang.String r0 = r0.zzj()
            r9.zza(r0)
            com.google.android.gms.internal.ads.zzaqu r0 = r8.zzd()
            long r2 = r0.zza()
            r9.zzb(r2)
            com.google.android.gms.internal.ads.zzaqu r0 = r8.zzd()
            long r2 = r0.zzd()
            r9.zzd(r2)
            com.google.android.gms.internal.ads.zzaqu r8 = r8.zzd()
            long r2 = r8.zzc()
            r9.zzc(r2)
            com.google.android.gms.internal.ads.zzgko r8 = r9.zzaj()
            com.google.android.gms.internal.ads.zzaqu r8 = (com.google.android.gms.internal.ads.zzaqu) r8
            com.google.android.gms.internal.ads.zzaqu r9 = r7.zzc(r1)
            android.content.SharedPreferences r0 = r7.zzc
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r9 == 0) goto L_0x0125
            java.lang.String r2 = r8.zzk()
            java.lang.String r3 = r9.zzk()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0125
            java.lang.String r2 = r7.zzf()
            java.lang.String r9 = zza(r9)
            r0.putString(r2, r9)
        L_0x0125:
            java.lang.String r9 = r7.zzg()
            java.lang.String r8 = zza(r8)
            r0.putString(r9, r8)
            boolean r8 = r0.commit()
            if (r8 == 0) goto L_0x0087
            r8 = 1
        L_0x0137:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            com.google.android.gms.internal.ads.zzaqu r0 = r7.zzc(r1)
            if (r0 == 0) goto L_0x0149
            java.lang.String r0 = r0.zzk()
            r9.add(r0)
        L_0x0149:
            r0 = 2
            com.google.android.gms.internal.ads.zzaqu r0 = r7.zzc(r0)
            if (r0 == 0) goto L_0x0157
            java.lang.String r0 = r0.zzk()
            r9.add(r0)
        L_0x0157:
            java.io.File r0 = r7.zze()
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
        L_0x0160:
            if (r4 >= r1) goto L_0x017c
            r2 = r0[r4]
            java.lang.String r2 = r2.getName()
            boolean r3 = r9.contains(r2)
            if (r3 != 0) goto L_0x0179
            java.io.File r3 = r7.zze()
            java.io.File r2 = com.google.android.gms.internal.ads.zzfmi.zzc(r2, r3)
            com.google.android.gms.internal.ads.zzfmi.zzd(r2)
        L_0x0179:
            int r4 = r4 + 1
            goto L_0x0160
        L_0x017c:
            return r8
        L_0x017d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfmh.zzb(com.google.android.gms.internal.ads.zzaqr, com.google.android.gms.internal.ads.zzfmn):boolean");
    }

    @VisibleForTesting
    public final zzaqu zzc(int i) {
        String str;
        if (i == 1) {
            str = this.zzc.getString(zzg(), (String) null);
        } else {
            str = this.zzc.getString(zzf(), (String) null);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            zzaqu zzh = zzaqu.zzh(zzgjg.zzv(Hex.stringToBytes(str)));
            String zzk = zzh.zzk();
            File zzb2 = zzfmi.zzb(zzk, "pcam.jar", zze());
            if (!zzb2.exists()) {
                zzb2 = zzfmi.zzb(zzk, "pcam", zze());
            }
            File zzb3 = zzfmi.zzb(zzk, "pcbc", zze());
            if (!zzb2.exists() || !zzb3.exists()) {
                return null;
            }
            return zzh;
        } catch (zzgla unused) {
        }
    }

    public final zzfmg zzd(int i) {
        zzaqu zzc2 = zzc(1);
        if (zzc2 == null) {
            return null;
        }
        String zzk = zzc2.zzk();
        File zzb2 = zzfmi.zzb(zzk, "pcam.jar", zze());
        if (!zzb2.exists()) {
            zzb2 = zzfmi.zzb(zzk, "pcam", zze());
        }
        return new zzfmg(zzc2, zzb2, zzfmi.zzb(zzk, "pcbc", zze()), zzfmi.zzb(zzk, "pcopt", zze()));
    }
}
