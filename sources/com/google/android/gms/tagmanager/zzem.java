package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzfz;
import com.google.android.gms.internal.gtm.zzrl;
import java.io.File;
import java.util.concurrent.ExecutorService;

final class zzem implements zzak {
    private final Context zza;
    private final String zzb;
    private final ExecutorService zzc = zzfz.zza().zza(2);
    private zzdg<zzrl> zzd;

    public zzem(Context context, String str) {
        this.zza = context;
        this.zzb = str;
    }

    public final synchronized void release() {
        this.zzc.shutdown();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b5 A[Catch:{ IOException -> 0x00e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bd A[Catch:{ IOException -> 0x00e2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.gtm.zzrs zza(int r11) {
        /*
            r10 = this;
            r0 = 0
            android.content.Context r1 = r10.zza     // Catch:{ NotFoundException -> 0x0114 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ NotFoundException -> 0x0114 }
            java.io.InputStream r1 = r1.openRawResource(r11)     // Catch:{ NotFoundException -> 0x0114 }
            android.content.Context r2 = r10.zza
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r2 = r2.getResourceName(r11)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 66
            r4.<init>(r3)
            java.lang.String r3 = "Attempting to load a container from the resource ID "
            r4.append(r3)
            r4.append(r11)
            java.lang.String r3 = " ("
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = ")"
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.google.android.gms.tagmanager.zzbg r5 = com.google.android.gms.tagmanager.zzdh.zzb
            r5.zzd(r4)
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x00e2 }
            r4.<init>()     // Catch:{ IOException -> 0x00e2 }
            com.google.android.gms.internal.gtm.zzsa.zzc(r1, r4)     // Catch:{ IOException -> 0x00e2 }
            java.lang.String r1 = "UTF-8"
            java.lang.String r1 = r4.toString(r1)     // Catch:{ UnsupportedEncodingException -> 0x00ab, JSONException -> 0x00a4 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ UnsupportedEncodingException -> 0x00ab, JSONException -> 0x00a4 }
            r5.<init>(r1)     // Catch:{ UnsupportedEncodingException -> 0x00ab, JSONException -> 0x00a4 }
            java.lang.Object r1 = com.google.android.gms.tagmanager.zzcz.zza(r5)     // Catch:{ UnsupportedEncodingException -> 0x00ab, JSONException -> 0x00a4 }
            com.google.android.gms.internal.gtm.zzak r1 = com.google.android.gms.tagmanager.zzfv.zzc(r1)     // Catch:{ UnsupportedEncodingException -> 0x00ab, JSONException -> 0x00a4 }
            com.google.android.gms.internal.gtm.zzru r5 = com.google.android.gms.internal.gtm.zzrs.zza()     // Catch:{ UnsupportedEncodingException -> 0x00ab, JSONException -> 0x00a4 }
            r6 = 0
        L_0x0062:
            int r7 = r1.zzc()     // Catch:{ UnsupportedEncodingException -> 0x00ab, JSONException -> 0x00a4 }
            if (r6 >= r7) goto L_0x009f
            com.google.android.gms.internal.gtm.zzrq r7 = com.google.android.gms.internal.gtm.zzro.zzb()     // Catch:{ UnsupportedEncodingException -> 0x00ab, JSONException -> 0x00a4 }
            com.google.android.gms.internal.gtm.zzb r8 = com.google.android.gms.internal.gtm.zzb.INSTANCE_NAME     // Catch:{ UnsupportedEncodingException -> 0x00ab, JSONException -> 0x00a4 }
            java.lang.String r8 = r8.toString()     // Catch:{ UnsupportedEncodingException -> 0x00ab, JSONException -> 0x00a4 }
            com.google.android.gms.internal.gtm.zzak r9 = r1.zzk(r6)     // Catch:{ UnsupportedEncodingException -> 0x00ab, JSONException -> 0x00a4 }
            r7.zzb(r8, r9)     // Catch:{ UnsupportedEncodingException -> 0x00ab, JSONException -> 0x00a4 }
            com.google.android.gms.internal.gtm.zzb r8 = com.google.android.gms.internal.gtm.zzb.FUNCTION     // Catch:{ UnsupportedEncodingException -> 0x00ab, JSONException -> 0x00a4 }
            java.lang.String r8 = r8.toString()     // Catch:{ UnsupportedEncodingException -> 0x00ab, JSONException -> 0x00a4 }
            java.lang.String r9 = com.google.android.gms.tagmanager.zzt.zzc()     // Catch:{ UnsupportedEncodingException -> 0x00ab, JSONException -> 0x00a4 }
            com.google.android.gms.internal.gtm.zzak r9 = com.google.android.gms.tagmanager.zzfv.zza(r9)     // Catch:{ UnsupportedEncodingException -> 0x00ab, JSONException -> 0x00a4 }
            r7.zzb(r8, r9)     // Catch:{ UnsupportedEncodingException -> 0x00ab, JSONException -> 0x00a4 }
            java.lang.String r8 = com.google.android.gms.tagmanager.zzt.zzd()     // Catch:{ UnsupportedEncodingException -> 0x00ab, JSONException -> 0x00a4 }
            com.google.android.gms.internal.gtm.zzak r9 = r1.zzl(r6)     // Catch:{ UnsupportedEncodingException -> 0x00ab, JSONException -> 0x00a4 }
            r7.zzb(r8, r9)     // Catch:{ UnsupportedEncodingException -> 0x00ab, JSONException -> 0x00a4 }
            com.google.android.gms.internal.gtm.zzro r7 = r7.zza()     // Catch:{ UnsupportedEncodingException -> 0x00ab, JSONException -> 0x00a4 }
            r5.zzb(r7)     // Catch:{ UnsupportedEncodingException -> 0x00ab, JSONException -> 0x00a4 }
            int r6 = r6 + 1
            goto L_0x0062
        L_0x009f:
            com.google.android.gms.internal.gtm.zzrs r1 = r5.zza()     // Catch:{ UnsupportedEncodingException -> 0x00ab, JSONException -> 0x00a4 }
            goto L_0x00b3
        L_0x00a4:
            java.lang.String r1 = "Failed to extract the container from the resource file. Resource is a UTF-8 encoded string but doesn't contain a JSON container"
            com.google.android.gms.tagmanager.zzdh.zzc(r1)     // Catch:{ IOException -> 0x00e2 }
        L_0x00a9:
            r1 = r0
            goto L_0x00b3
        L_0x00ab:
            java.lang.String r1 = "Failed to convert binary resource to string for JSON parsing; the file format is not UTF-8 format."
            com.google.android.gms.tagmanager.zzbg r5 = com.google.android.gms.tagmanager.zzdh.zzb     // Catch:{ IOException -> 0x00e2 }
            r5.zza(r1)     // Catch:{ IOException -> 0x00e2 }
            goto L_0x00a9
        L_0x00b3:
            if (r1 == 0) goto L_0x00bd
            java.lang.String r4 = "The container was successfully loaded from the resource (using JSON file format)"
            com.google.android.gms.tagmanager.zzbg r5 = com.google.android.gms.tagmanager.zzdh.zzb     // Catch:{ IOException -> 0x00e2 }
            r5.zzd(r4)     // Catch:{ IOException -> 0x00e2 }
            return r1
        L_0x00bd:
            byte[] r1 = r4.toByteArray()     // Catch:{ IOException -> 0x00e2 }
            com.google.android.gms.internal.gtm.zzuj r4 = com.google.android.gms.internal.gtm.zzuj.zzb()     // Catch:{ zzvk -> 0x00dc, zzrz -> 0x00d6 }
            com.google.android.gms.internal.gtm.zzaa r1 = com.google.android.gms.internal.gtm.zzaa.zzm(r1, r4)     // Catch:{ zzvk -> 0x00dc, zzrz -> 0x00d6 }
            com.google.android.gms.internal.gtm.zzrs r1 = com.google.android.gms.internal.gtm.zzsa.zzb(r1)     // Catch:{ zzvk -> 0x00dc, zzrz -> 0x00d6 }
            java.lang.String r4 = "The container was successfully loaded from the resource (using binary file)"
            com.google.android.gms.tagmanager.zzbg r5 = com.google.android.gms.tagmanager.zzdh.zzb     // Catch:{ zzvk -> 0x00dc, zzrz -> 0x00d6 }
            r5.zzd(r4)     // Catch:{ zzvk -> 0x00dc, zzrz -> 0x00d6 }
            r0 = r1
            goto L_0x00e1
        L_0x00d6:
            java.lang.String r1 = "The resource file is invalid. The container from the binary file is invalid"
            com.google.android.gms.tagmanager.zzdh.zzc(r1)     // Catch:{ IOException -> 0x00e2 }
            goto L_0x00e1
        L_0x00dc:
            java.lang.String r1 = "The resource file is corrupted. The container cannot be extracted from the binary file"
            com.google.android.gms.tagmanager.zzdh.zza(r1)     // Catch:{ IOException -> 0x00e2 }
        L_0x00e1:
            return r0
        L_0x00e2:
            android.content.Context r1 = r10.zza
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getResourceName(r11)
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 67
            r5.<init>(r4)
            java.lang.String r4 = "Error reading the default container with resource ID "
            r5.append(r4)
            r5.append(r11)
            r5.append(r3)
            r5.append(r1)
            r5.append(r2)
            java.lang.String r11 = r5.toString()
            com.google.android.gms.tagmanager.zzdh.zzc(r11)
            return r0
        L_0x0114:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 98
            r1.<init>(r2)
            java.lang.String r2 = "Failed to load the container. No default container resource found with the resource ID "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            com.google.android.gms.tagmanager.zzdh.zzc(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzem.zza(int):com.google.android.gms.internal.gtm.zzrs");
    }

    public final void zzb() {
        this.zzc.execute(new zzek(this));
    }

    public final void zzc(zzrl zzrl) {
        this.zzc.execute(new zzel(this, zzrl));
    }

    public final void zzd(zzdg<zzrl> zzdg) {
        this.zzd = zzdg;
    }

    @VisibleForTesting
    public final File zze() {
        String str;
        String valueOf = String.valueOf(this.zzb);
        if (valueOf.length() != 0) {
            str = "resource_".concat(valueOf);
        } else {
            str = new String("resource_");
        }
        return new File(this.zza.getDir("google_tagmanager", 0), str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0095, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r9.zzd.zza(2);
        com.google.android.gms.tagmanager.zzdh.zzc("Failed to read the resource from disk. The resource is inconsistent");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r9.zzd.zza(2);
        com.google.android.gms.tagmanager.zzdh.zzc("Failed to read the resource from disk");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bf, code lost:
        com.google.android.gms.tagmanager.zzdh.zzc("Error closing stream for reading resource from disk");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c2, code lost:
        throw r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:24:0x0097, B:28:0x00a5] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0097 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00a5 */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzf() {
        /*
            r9 = this;
            java.lang.String r0 = "Error closing stream for reading resource from disk"
            com.google.android.gms.tagmanager.zzdg<com.google.android.gms.internal.gtm.zzrl> r1 = r9.zzd
            if (r1 == 0) goto L_0x00d6
            com.google.android.gms.tagmanager.zzbg r1 = com.google.android.gms.tagmanager.zzdh.zzb
            java.lang.String r2 = "Attempting to load resource from disk"
            r1.zzd(r2)
            com.google.android.gms.tagmanager.zzea r1 = com.google.android.gms.tagmanager.zzea.zza()
            int r1 = r1.zze()
            r2 = 1
            r3 = 2
            if (r1 == r3) goto L_0x0024
            com.google.android.gms.tagmanager.zzea r1 = com.google.android.gms.tagmanager.zzea.zza()
            int r1 = r1.zze()
            r4 = 3
            if (r1 != r4) goto L_0x0034
        L_0x0024:
            java.lang.String r1 = r9.zzb
            com.google.android.gms.tagmanager.zzea r4 = com.google.android.gms.tagmanager.zzea.zza()
            java.lang.String r4 = r4.zzc()
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00d0
        L_0x0034:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00c3 }
            java.io.File r4 = r9.zze()     // Catch:{ FileNotFoundException -> 0x00c3 }
            r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x00c3 }
            com.google.android.gms.internal.gtm.zzuj r4 = com.google.android.gms.internal.gtm.zzuj.zzb()     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
            com.google.android.gms.internal.gtm.zzrl r4 = com.google.android.gms.internal.gtm.zzrl.zzg(r1, r4)     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
            boolean r5 = r4.zzk()     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
            if (r5 != 0) goto L_0x005a
            boolean r5 = r4.zzl()     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
            if (r5 == 0) goto L_0x0052
            goto L_0x005a
        L_0x0052:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
            java.lang.String r4 = "Resource and SupplementedResource are NULL."
            r2.<init>(r4)     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
            throw r2     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
        L_0x005a:
            com.google.android.gms.tagmanager.zzdg<com.google.android.gms.internal.gtm.zzrl> r5 = r9.zzd     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
            boolean r6 = r4.zzl()     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
            if (r6 == 0) goto L_0x006d
            com.google.android.gms.internal.gtm.zzai r6 = r4.zzd()     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
            com.google.android.gms.internal.gtm.zzut r6 = r6.zzZ()     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
            com.google.android.gms.internal.gtm.zzah r6 = (com.google.android.gms.internal.gtm.zzah) r6     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
            goto L_0x0083
        L_0x006d:
            com.google.android.gms.internal.gtm.zzaa r6 = r4.zzc()     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
            com.google.android.gms.internal.gtm.zzah r7 = com.google.android.gms.internal.gtm.zzai.zzd()     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
            r7.zzc(r6)     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
            r7.zza()     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
            java.lang.String r6 = r6.zzo()     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
            r7.zzb(r6)     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
            r6 = r7
        L_0x0083:
            com.google.android.gms.tagmanager.zzae r5 = (com.google.android.gms.tagmanager.zzae) r5     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
            com.google.android.gms.tagmanager.zzal r5 = r5.zza     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
            com.google.android.gms.internal.gtm.zzuz r6 = r6.zzC()     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
            com.google.android.gms.internal.gtm.zzai r6 = (com.google.android.gms.internal.gtm.zzai) r6     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
            long r7 = r4.zza()     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
            r5.zzu(r6, r7, r2)     // Catch:{ IOException -> 0x00a5, IllegalArgumentException -> 0x0097 }
            goto L_0x00a1
        L_0x0095:
            r2 = move-exception
            goto L_0x00bb
        L_0x0097:
            com.google.android.gms.tagmanager.zzdg<com.google.android.gms.internal.gtm.zzrl> r2 = r9.zzd     // Catch:{ all -> 0x0095 }
            r2.zza(r3)     // Catch:{ all -> 0x0095 }
            java.lang.String r2 = "Failed to read the resource from disk. The resource is inconsistent"
            com.google.android.gms.tagmanager.zzdh.zzc(r2)     // Catch:{ all -> 0x0095 }
        L_0x00a1:
            r1.close()     // Catch:{ IOException -> 0x00b0 }
            goto L_0x00b3
        L_0x00a5:
            com.google.android.gms.tagmanager.zzdg<com.google.android.gms.internal.gtm.zzrl> r2 = r9.zzd     // Catch:{ all -> 0x0095 }
            r2.zza(r3)     // Catch:{ all -> 0x0095 }
            java.lang.String r2 = "Failed to read the resource from disk"
            com.google.android.gms.tagmanager.zzdh.zzc(r2)     // Catch:{ all -> 0x0095 }
            goto L_0x00a1
        L_0x00b0:
            com.google.android.gms.tagmanager.zzdh.zzc(r0)
        L_0x00b3:
            com.google.android.gms.tagmanager.zzbg r0 = com.google.android.gms.tagmanager.zzdh.zzb
            java.lang.String r1 = "The Disk resource was successfully read."
            r0.zzd(r1)
            return
        L_0x00bb:
            r1.close()     // Catch:{ IOException -> 0x00bf }
            goto L_0x00c2
        L_0x00bf:
            com.google.android.gms.tagmanager.zzdh.zzc(r0)
        L_0x00c2:
            throw r2
        L_0x00c3:
            com.google.android.gms.tagmanager.zzbg r0 = com.google.android.gms.tagmanager.zzdh.zzb
            java.lang.String r1 = "Failed to find the resource in the disk"
            r0.zza(r1)
            com.google.android.gms.tagmanager.zzdg<com.google.android.gms.internal.gtm.zzrl> r0 = r9.zzd
            r0.zza(r2)
            return
        L_0x00d0:
            com.google.android.gms.tagmanager.zzdg<com.google.android.gms.internal.gtm.zzrl> r0 = r9.zzd
            r0.zza(r2)
            return
        L_0x00d6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Callback must be set before execute"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzem.zzf():void");
    }
}
