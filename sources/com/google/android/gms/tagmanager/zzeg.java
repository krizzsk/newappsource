package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzai;
import com.google.android.gms.internal.gtm.zzse;

final class zzeg implements Runnable {
    private final Context zza;
    private final zzse zzb;
    private final String zzc;
    private final String zzd;
    private zzdg<zzai> zze;
    private volatile zzap zzf;
    private volatile String zzg;
    private volatile String zzh;

    public zzeg(Context context, String str, zzap zzap) {
        zzse zzse = new zzse();
        this.zza = context;
        this.zzb = zzse;
        this.zzc = str;
        this.zzf = zzap;
        String valueOf = String.valueOf(str);
        String concat = valueOf.length() != 0 ? "/r?id=".concat(valueOf) : new String("/r?id=");
        this.zzd = concat;
        this.zzg = concat;
        this.zzh = null;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x0240 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            com.google.android.gms.tagmanager.zzdg<com.google.android.gms.internal.gtm.zzai> r0 = r11.zze
            if (r0 == 0) goto L_0x0292
            android.content.Context r0 = r11.zza
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto L_0x0284
            boolean r0 = r0.isConnected()
            if (r0 != 0) goto L_0x001c
            goto L_0x0284
        L_0x001c:
            com.google.android.gms.tagmanager.zzbg r0 = com.google.android.gms.tagmanager.zzdh.zzb
            java.lang.String r1 = "Start loading resource from network ..."
            r0.zzd(r1)
            com.google.android.gms.tagmanager.zzap r0 = r11.zzf
            java.lang.String r0 = r0.zza()
            java.lang.String r1 = r11.zzg
            int r2 = r0.length()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 12
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "&v=a65833898"
            java.lang.String r0 = p379.C13715c.m34245k(r4, r0, r1, r2)
            java.lang.String r1 = r11.zzh
            r2 = 4
            if (r1 == 0) goto L_0x0077
            java.lang.String r1 = r11.zzh
            java.lang.String r1 = r1.trim()
            java.lang.String r3 = ""
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0077
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = r11.zzh
            int r3 = r0.length()
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + r2
            int r3 = r3 + r4
            r5.<init>(r3)
            java.lang.String r3 = "&pv="
            java.lang.String r0 = p379.C13715c.m34245k(r5, r0, r3, r1)
        L_0x0077:
            com.google.android.gms.tagmanager.zzea r1 = com.google.android.gms.tagmanager.zzea.zza()
            int r1 = r1.zze()
            r3 = 0
            if (r1 == 0) goto L_0x0283
            r4 = 3
            if (r1 != r4) goto L_0x008f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "&gtm_debug=x"
            java.lang.String r0 = r0.concat(r1)
        L_0x008f:
            com.google.android.gms.internal.gtm.zzsd r1 = com.google.android.gms.internal.gtm.zzse.zza()
            java.io.InputStream r3 = r1.zza(r0)     // Catch:{ FileNotFoundException -> 0x0240, zzsf -> 0x00d9, IOException -> 0x009b }
            goto L_0x00f8
        L_0x0098:
            r0 = move-exception
            goto L_0x027f
        L_0x009b:
            r2 = move-exception
            java.lang.String r3 = r2.getMessage()     // Catch:{ all -> 0x0098 }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0098 }
            int r4 = r4.length()     // Catch:{ all -> 0x0098 }
            int r4 = r4 + 40
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0098 }
            int r5 = r5.length()     // Catch:{ all -> 0x0098 }
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            r5.<init>(r4)     // Catch:{ all -> 0x0098 }
            java.lang.String r4 = "Error when loading resources from url: "
            r5.append(r4)     // Catch:{ all -> 0x0098 }
            r5.append(r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = " "
            r5.append(r0)     // Catch:{ all -> 0x0098 }
            r5.append(r3)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0098 }
            com.google.android.gms.tagmanager.zzdh.zzd(r0, r2)     // Catch:{ all -> 0x0098 }
            com.google.android.gms.tagmanager.zzdg<com.google.android.gms.internal.gtm.zzai> r0 = r11.zze     // Catch:{ all -> 0x0098 }
            r2 = 2
            r0.zza(r2)     // Catch:{ all -> 0x0098 }
            r1.zzb()
            return
        L_0x00d9:
            java.lang.String r5 = "Error when loading resource for url: "
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0098 }
            int r7 = r6.length()     // Catch:{ all -> 0x0098 }
            if (r7 == 0) goto L_0x00ea
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x0098 }
            goto L_0x00f0
        L_0x00ea:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0098 }
            r6.<init>(r5)     // Catch:{ all -> 0x0098 }
            r5 = r6
        L_0x00f0:
            com.google.android.gms.tagmanager.zzdh.zzc(r5)     // Catch:{ all -> 0x0098 }
            com.google.android.gms.tagmanager.zzdg<com.google.android.gms.internal.gtm.zzai> r5 = r11.zze     // Catch:{ all -> 0x0098 }
            r5.zza(r2)     // Catch:{ all -> 0x0098 }
        L_0x00f8:
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0203 }
            r2.<init>()     // Catch:{ IOException -> 0x0203 }
            com.google.android.gms.internal.gtm.zzsa.zzc(r3, r2)     // Catch:{ IOException -> 0x0203 }
            byte[] r2 = r2.toByteArray()     // Catch:{ IOException -> 0x0203 }
            com.google.android.gms.internal.gtm.zzuj r3 = com.google.android.gms.internal.gtm.zzuj.zzb()     // Catch:{ IOException -> 0x0203 }
            com.google.android.gms.internal.gtm.zzai r2 = com.google.android.gms.internal.gtm.zzai.zzg(r2, r3)     // Catch:{ IOException -> 0x0203 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x0203 }
            int r5 = r3.length()     // Catch:{ IOException -> 0x0203 }
            int r5 = r5 + 43
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0203 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x0203 }
            java.lang.String r5 = "Successfully loaded supplemented resource: "
            r6.append(r5)     // Catch:{ IOException -> 0x0203 }
            r6.append(r3)     // Catch:{ IOException -> 0x0203 }
            java.lang.String r3 = r6.toString()     // Catch:{ IOException -> 0x0203 }
            com.google.android.gms.tagmanager.zzbg r5 = com.google.android.gms.tagmanager.zzdh.zzb     // Catch:{ IOException -> 0x0203 }
            r5.zzd(r3)     // Catch:{ IOException -> 0x0203 }
            boolean r3 = r2.zzm()     // Catch:{ IOException -> 0x0203 }
            if (r3 != 0) goto L_0x0154
            int r3 = r2.zza()     // Catch:{ IOException -> 0x0203 }
            if (r3 != 0) goto L_0x0154
            java.lang.String r3 = "No change for container: "
            java.lang.String r6 = r11.zzc     // Catch:{ IOException -> 0x0203 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x0203 }
            int r7 = r6.length()     // Catch:{ IOException -> 0x0203 }
            if (r7 == 0) goto L_0x014b
            java.lang.String r3 = r3.concat(r6)     // Catch:{ IOException -> 0x0203 }
            goto L_0x0151
        L_0x014b:
            java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x0203 }
            r6.<init>(r3)     // Catch:{ IOException -> 0x0203 }
            r3 = r6
        L_0x0151:
            r5.zzd(r3)     // Catch:{ IOException -> 0x0203 }
        L_0x0154:
            com.google.android.gms.tagmanager.zzdg<com.google.android.gms.internal.gtm.zzai> r3 = r11.zze     // Catch:{ IOException -> 0x0203 }
            r6 = r3
            com.google.android.gms.tagmanager.zzag r6 = (com.google.android.gms.tagmanager.zzag) r6     // Catch:{ IOException -> 0x0203 }
            com.google.android.gms.tagmanager.zzal r6 = r6.zza     // Catch:{ IOException -> 0x0203 }
            com.google.android.gms.tagmanager.zzam r6 = r6.zzi     // Catch:{ IOException -> 0x0203 }
            r6.zzd()     // Catch:{ IOException -> 0x0203 }
            r6 = r3
            com.google.android.gms.tagmanager.zzag r6 = (com.google.android.gms.tagmanager.zzag) r6     // Catch:{ IOException -> 0x0203 }
            com.google.android.gms.tagmanager.zzal r6 = r6.zza     // Catch:{ IOException -> 0x0203 }
            monitor-enter(r6)     // Catch:{ IOException -> 0x0203 }
            boolean r7 = r2.zzm()     // Catch:{ all -> 0x0200 }
            if (r7 != 0) goto L_0x01b4
            r7 = r3
            com.google.android.gms.tagmanager.zzag r7 = (com.google.android.gms.tagmanager.zzag) r7     // Catch:{ all -> 0x0200 }
            com.google.android.gms.tagmanager.zzal r7 = r7.zza     // Catch:{ all -> 0x0200 }
            com.google.android.gms.internal.gtm.zzai r7 = r7.zzn     // Catch:{ all -> 0x0200 }
            boolean r7 = r7.zzm()     // Catch:{ all -> 0x0200 }
            if (r7 != 0) goto L_0x0198
            java.lang.String r2 = "Current resource is null; network resource is also null"
            com.google.android.gms.tagmanager.zzdh.zza(r2)     // Catch:{ all -> 0x0200 }
            r2 = r3
            com.google.android.gms.tagmanager.zzag r2 = (com.google.android.gms.tagmanager.zzag) r2     // Catch:{ all -> 0x0200 }
            com.google.android.gms.tagmanager.zzal r2 = r2.zza     // Catch:{ all -> 0x0200 }
            com.google.android.gms.tagmanager.zzam r2 = r2.zzi     // Catch:{ all -> 0x0200 }
            long r7 = r2.zzb()     // Catch:{ all -> 0x0200 }
            com.google.android.gms.tagmanager.zzag r3 = (com.google.android.gms.tagmanager.zzag) r3     // Catch:{ all -> 0x0200 }
            com.google.android.gms.tagmanager.zzal r2 = r3.zza     // Catch:{ all -> 0x0200 }
            r2.zzr(r7)     // Catch:{ all -> 0x0200 }
            monitor-exit(r6)     // Catch:{ all -> 0x0200 }
            goto L_0x01f7
        L_0x0198:
            com.google.android.gms.internal.gtm.zzut r2 = r2.zzZ()     // Catch:{ all -> 0x0200 }
            com.google.android.gms.internal.gtm.zzah r2 = (com.google.android.gms.internal.gtm.zzah) r2     // Catch:{ all -> 0x0200 }
            r7 = r3
            com.google.android.gms.tagmanager.zzag r7 = (com.google.android.gms.tagmanager.zzag) r7     // Catch:{ all -> 0x0200 }
            com.google.android.gms.tagmanager.zzal r7 = r7.zza     // Catch:{ all -> 0x0200 }
            com.google.android.gms.internal.gtm.zzai r7 = r7.zzn     // Catch:{ all -> 0x0200 }
            com.google.android.gms.internal.gtm.zzaa r7 = r7.zzc()     // Catch:{ all -> 0x0200 }
            r2.zzc(r7)     // Catch:{ all -> 0x0200 }
            com.google.android.gms.internal.gtm.zzuz r2 = r2.zzC()     // Catch:{ all -> 0x0200 }
            com.google.android.gms.internal.gtm.zzai r2 = (com.google.android.gms.internal.gtm.zzai) r2     // Catch:{ all -> 0x0200 }
        L_0x01b4:
            r7 = r3
            com.google.android.gms.tagmanager.zzag r7 = (com.google.android.gms.tagmanager.zzag) r7     // Catch:{ all -> 0x0200 }
            com.google.android.gms.tagmanager.zzal r7 = r7.zza     // Catch:{ all -> 0x0200 }
            com.google.android.gms.common.util.Clock r8 = r7.zza     // Catch:{ all -> 0x0200 }
            long r8 = r8.currentTimeMillis()     // Catch:{ all -> 0x0200 }
            r10 = 0
            r7.zzu(r2, r8, r10)     // Catch:{ all -> 0x0200 }
            r7 = r3
            com.google.android.gms.tagmanager.zzag r7 = (com.google.android.gms.tagmanager.zzag) r7     // Catch:{ all -> 0x0200 }
            com.google.android.gms.tagmanager.zzal r7 = r7.zza     // Catch:{ all -> 0x0200 }
            long r7 = r7.zzo     // Catch:{ all -> 0x0200 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0200 }
            r10 = 58
            r9.<init>(r10)     // Catch:{ all -> 0x0200 }
            java.lang.String r10 = "setting refresh time to current time: "
            r9.append(r10)     // Catch:{ all -> 0x0200 }
            r9.append(r7)     // Catch:{ all -> 0x0200 }
            java.lang.String r7 = r9.toString()     // Catch:{ all -> 0x0200 }
            r5.zzd(r7)     // Catch:{ all -> 0x0200 }
            r7 = r3
            com.google.android.gms.tagmanager.zzag r7 = (com.google.android.gms.tagmanager.zzag) r7     // Catch:{ all -> 0x0200 }
            com.google.android.gms.tagmanager.zzal r7 = r7.zza     // Catch:{ all -> 0x0200 }
            boolean r7 = r7.zzv()     // Catch:{ all -> 0x0200 }
            if (r7 != 0) goto L_0x01f6
            com.google.android.gms.tagmanager.zzag r3 = (com.google.android.gms.tagmanager.zzag) r3     // Catch:{ all -> 0x0200 }
            com.google.android.gms.tagmanager.zzal r3 = r3.zza     // Catch:{ all -> 0x0200 }
            r3.zzt(r2)     // Catch:{ all -> 0x0200 }
        L_0x01f6:
            monitor-exit(r6)     // Catch:{ all -> 0x0200 }
        L_0x01f7:
            r1.zzb()
            java.lang.String r0 = "Load resource from network finished."
            r5.zzd(r0)
            return
        L_0x0200:
            r2 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0200 }
            throw r2     // Catch:{ IOException -> 0x0203 }
        L_0x0203:
            r2 = move-exception
            java.lang.String r3 = r2.getMessage()     // Catch:{ all -> 0x0098 }
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0098 }
            int r5 = r5.length()     // Catch:{ all -> 0x0098 }
            int r5 = r5 + 51
            java.lang.String r6 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0098 }
            int r6 = r6.length()     // Catch:{ all -> 0x0098 }
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            r6.<init>(r5)     // Catch:{ all -> 0x0098 }
            java.lang.String r5 = "Error when parsing downloaded resources from url: "
            r6.append(r5)     // Catch:{ all -> 0x0098 }
            r6.append(r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = " "
            r6.append(r0)     // Catch:{ all -> 0x0098 }
            r6.append(r3)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0098 }
            com.google.android.gms.tagmanager.zzdh.zzd(r0, r2)     // Catch:{ all -> 0x0098 }
            com.google.android.gms.tagmanager.zzdg<com.google.android.gms.internal.gtm.zzai> r0 = r11.zze     // Catch:{ all -> 0x0098 }
            r0.zza(r4)     // Catch:{ all -> 0x0098 }
            r1.zzb()
            return
        L_0x0240:
            java.lang.String r2 = r11.zzc     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0098 }
            int r3 = r3.length()     // Catch:{ all -> 0x0098 }
            int r3 = r3 + 79
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0098 }
            int r5 = r5.length()     // Catch:{ all -> 0x0098 }
            int r3 = r3 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            r5.<init>(r3)     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = "No data is retrieved from the given url: "
            r5.append(r3)     // Catch:{ all -> 0x0098 }
            r5.append(r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = ". Make sure container_id: "
            r5.append(r0)     // Catch:{ all -> 0x0098 }
            r5.append(r2)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = " is correct."
            r5.append(r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0098 }
            com.google.android.gms.tagmanager.zzdh.zzc(r0)     // Catch:{ all -> 0x0098 }
            com.google.android.gms.tagmanager.zzdg<com.google.android.gms.internal.gtm.zzai> r0 = r11.zze     // Catch:{ all -> 0x0098 }
            r0.zza(r4)     // Catch:{ all -> 0x0098 }
            r1.zzb()
            return
        L_0x027f:
            r1.zzb()
            throw r0
        L_0x0283:
            throw r3
        L_0x0284:
            com.google.android.gms.tagmanager.zzbg r0 = com.google.android.gms.tagmanager.zzdh.zzb
            java.lang.String r1 = "...no network connectivity"
            r0.zzd(r1)
            com.google.android.gms.tagmanager.zzdg<com.google.android.gms.internal.gtm.zzai> r0 = r11.zze
            r1 = 1
            r0.zza(r1)
            return
        L_0x0292:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "callback must be set before execute"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzeg.run():void");
    }

    @VisibleForTesting
    public final void zza(String str) {
        String str2;
        if (str == null) {
            this.zzg = this.zzd;
            return;
        }
        if (str.length() != 0) {
            str2 = "Setting CTFE URL path: ".concat(str);
        } else {
            str2 = new String("Setting CTFE URL path: ");
        }
        zzdh.zzb.zza(str2);
        this.zzg = str;
    }

    public final void zzb(zzdg<zzai> zzdg) {
        this.zze = zzdg;
    }

    @VisibleForTesting
    public final void zzc(String str) {
        String str2;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Setting previous container version: ".concat(valueOf);
        } else {
            str2 = new String("Setting previous container version: ");
        }
        zzdh.zzb.zza(str2);
        this.zzh = str;
    }
}
