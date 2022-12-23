package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.common.util.VisibleForTesting;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

final class zzfj implements zzbk {
    private final String zza;
    private final Context zzb;
    private final zzfi zzc;
    private final zzfh zzd = new zzfh();

    @VisibleForTesting
    public zzfj(Context context, zzfi zzfi) {
        this.zzb = context.getApplicationContext();
        this.zzc = zzfi;
        String str = Build.VERSION.RELEASE;
        Locale locale = Locale.getDefault();
        String str2 = null;
        if (!(locale == null || locale.getLanguage() == null || locale.getLanguage().length() == 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage().toLowerCase());
            if (!(locale.getCountry() == null || locale.getCountry().length() == 0)) {
                sb.append("-");
                sb.append(locale.getCountry().toLowerCase());
            }
            str2 = sb.toString();
        }
        this.zza = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{"GoogleTagManager", "4.00", str, str2, Build.MODEL, Build.ID});
    }

    @VisibleForTesting
    public static final URL zzc(zzca zzca) {
        try {
            return new URL(zzca.zzc());
        } catch (MalformedURLException unused) {
            zzdh.zza("Error trying to parse the GTM url.");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(java.util.List<com.google.android.gms.tagmanager.zzca> r11) {
        /*
            r10 = this;
            int r0 = r11.size()
            r1 = 40
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 1
            r2 = 0
            r3 = 0
            r4 = 1
        L_0x000e:
            if (r3 >= r0) goto L_0x00e5
            java.lang.Object r5 = r11.get(r3)
            com.google.android.gms.tagmanager.zzca r5 = (com.google.android.gms.tagmanager.zzca) r5
            java.net.URL r6 = zzc(r5)
            if (r6 != 0) goto L_0x004c
            java.lang.String r6 = "No destination: discarding hit."
            com.google.android.gms.tagmanager.zzdh.zzc(r6)
            com.google.android.gms.tagmanager.zzfi r6 = r10.zzc
            com.google.android.gms.tagmanager.zzdu r6 = (com.google.android.gms.tagmanager.zzdu) r6
            com.google.android.gms.tagmanager.zzdw r6 = r6.zza
            long r7 = r5.zzb()
            r6.zzl(r7)
            long r5 = r5.zzb()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r8 = 57
            r7.<init>(r8)
            java.lang.String r8 = "Permanent failure dispatching hitId: "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            com.google.android.gms.tagmanager.zzbg r6 = com.google.android.gms.tagmanager.zzdh.zzb
            r6.zzd(r5)
            goto L_0x00e1
        L_0x004c:
            java.net.URLConnection r6 = r6.openConnection()     // Catch:{ IOException -> 0x00b4 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x00b4 }
            r7 = 0
            if (r4 == 0) goto L_0x005e
            android.content.Context r4 = r10.zzb     // Catch:{ all -> 0x005b }
            com.google.android.gms.tagmanager.zzdk.zza(r4)     // Catch:{ all -> 0x005b }
            goto L_0x005e
        L_0x005b:
            r4 = move-exception
            r8 = 1
            goto L_0x00a9
        L_0x005e:
            java.lang.String r4 = "User-Agent"
            java.lang.String r8 = r10.zza     // Catch:{ all -> 0x00a7 }
            r6.setRequestProperty(r4, r8)     // Catch:{ all -> 0x00a7 }
            int r4 = r6.getResponseCode()     // Catch:{ all -> 0x00a7 }
            java.io.InputStream r7 = r6.getInputStream()     // Catch:{ all -> 0x00a7 }
            r8 = 200(0xc8, float:2.8E-43)
            if (r4 == r8) goto L_0x008d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r9 = 25
            r8.<init>(r9)     // Catch:{ all -> 0x00a7 }
            java.lang.String r9 = "Bad response: "
            r8.append(r9)     // Catch:{ all -> 0x00a7 }
            r8.append(r4)     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r8.toString()     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.tagmanager.zzdh.zzc(r4)     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.tagmanager.zzfi r4 = r10.zzc     // Catch:{ all -> 0x00a7 }
            r4.zza(r5)     // Catch:{ all -> 0x00a7 }
            goto L_0x009a
        L_0x008d:
            com.google.android.gms.tagmanager.zzfi r4 = r10.zzc     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.tagmanager.zzdu r4 = (com.google.android.gms.tagmanager.zzdu) r4     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.tagmanager.zzdw r4 = r4.zza     // Catch:{ all -> 0x00a7 }
            long r8 = r5.zzb()     // Catch:{ all -> 0x00a7 }
            r4.zzl(r8)     // Catch:{ all -> 0x00a7 }
        L_0x009a:
            if (r7 == 0) goto L_0x009f
            r7.close()     // Catch:{ IOException -> 0x00a4 }
        L_0x009f:
            r6.disconnect()     // Catch:{ IOException -> 0x00a4 }
            r4 = 0
            goto L_0x00e1
        L_0x00a4:
            r4 = move-exception
            r8 = 0
            goto L_0x00b7
        L_0x00a7:
            r4 = move-exception
            r8 = 0
        L_0x00a9:
            if (r7 == 0) goto L_0x00ae
            r7.close()     // Catch:{ IOException -> 0x00b2 }
        L_0x00ae:
            r6.disconnect()     // Catch:{ IOException -> 0x00b2 }
            throw r4     // Catch:{ IOException -> 0x00b2 }
        L_0x00b2:
            r4 = move-exception
            goto L_0x00b7
        L_0x00b4:
            r6 = move-exception
            r8 = r4
            r4 = r6
        L_0x00b7:
            java.lang.Class r6 = r4.getClass()
            java.lang.String r6 = r6.getSimpleName()
            java.lang.String r7 = "Exception sending hit: "
            int r9 = r6.length()
            if (r9 == 0) goto L_0x00cc
            java.lang.String r6 = r7.concat(r6)
            goto L_0x00d1
        L_0x00cc:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
        L_0x00d1:
            com.google.android.gms.tagmanager.zzdh.zzc(r6)
            java.lang.String r4 = r4.getMessage()
            com.google.android.gms.tagmanager.zzdh.zzc(r4)
            com.google.android.gms.tagmanager.zzfi r4 = r10.zzc
            r4.zza(r5)
            r4 = r8
        L_0x00e1:
            int r3 = r3 + 1
            goto L_0x000e
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzfj.zza(java.util.List):void");
    }

    public final boolean zzb() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zzb.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        zzdh.zzb.zzd("...no network connectivity");
        return false;
    }
}
